package org.webrtc;

import X.AnonymousClass09F;
import X.AnonymousClass1OB;
import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.ErrorCallback;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.os.Handler;
import android.os.SystemClock;
import android.view.WindowManager;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.webrtc.CameraEnumerationAndroid.CaptureFormat;
import org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange;
import org.webrtc.CameraSession.CreateSessionCallback;
import org.webrtc.CameraSession.Events;
import org.webrtc.CameraSession.FailureType;
import org.webrtc.SurfaceTextureHelper.OnTextureFrameAvailableListener;

public class Camera1Session implements CameraSession {
    private static final int NUMBER_OF_CAPTURE_BUFFERS = 3;
    private static final String TAG = "Camera1Session";
    private static final Histogram camera1ResolutionHistogram = Histogram.createEnumeration("WebRTC.Android.Camera1.Resolution", CameraEnumerationAndroid.COMMON_RESOLUTIONS.size());
    public static final Histogram camera1StartTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera1.StartTimeMs", 1, 10000, 50);
    private static final Histogram camera1StopTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera1.StopTimeMs", 1, 10000, 50);
    private final Context applicationContext;
    public final Camera camera;
    private final int cameraId;
    public final Handler cameraThreadHandler;
    public final CaptureFormat captureFormat;
    private final boolean captureToTexture;
    public final long constructionTimeNs;
    public final Events events;
    public boolean firstFrameReported = false;
    public final CameraInfo info;
    public SessionState state;
    public final SurfaceTextureHelper surfaceTextureHelper;

    /* renamed from: org.webrtc.Camera1Session$1 */
    public class C02061 implements ErrorCallback {
        public void onError(int i, Camera camera) {
            String str;
            if (AnonymousClass1OB.C()) {
                AnonymousClass1OB.D(camera);
            }
            if (i == 100) {
                str = "Camera server died!";
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Camera error: ");
                stringBuilder.append(i);
                str = stringBuilder.toString();
            }
            Logging.m29384e(Camera1Session.TAG, str);
            Camera1Session.stopInternal(Camera1Session.this);
            if (i == 2) {
                Camera1Session.this.events.onCameraDisconnected(Camera1Session.this);
            } else {
                Camera1Session.this.events.onCameraError(Camera1Session.this, str);
            }
        }
    }

    /* renamed from: org.webrtc.Camera1Session$3 */
    public class C02073 implements PreviewCallback {
        public static /* synthetic */ void lambda$onPreviewFrame$0(C02073 c02073, byte[] bArr) {
            if (Camera1Session.this.state == SessionState.RUNNING) {
                Camera1Session.this.camera.addCallbackBuffer(bArr);
            }
        }

        public void onPreviewFrame(byte[] bArr, Camera camera) {
            Camera1Session.checkIsOnCameraThread(Camera1Session.this);
            if (camera != Camera1Session.this.camera) {
                Logging.m29384e(Camera1Session.TAG, "Callback from a different camera. This should never happen.");
            } else if (Camera1Session.this.state != SessionState.RUNNING) {
                Logging.m29383d(Camera1Session.TAG, "Bytebuffer frame captured but camera is no longer running.");
            } else {
                long toNanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
                if (!Camera1Session.this.firstFrameReported) {
                    Camera1Session.camera1StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - Camera1Session.this.constructionTimeNs));
                    Camera1Session.this.firstFrameReported = true;
                }
                VideoFrame videoFrame = new VideoFrame(new NV21Buffer(bArr, Camera1Session.this.captureFormat.width, Camera1Session.this.captureFormat.height, new -$$Lambda$Camera1Session$3$T5VFc_yzieTfg6c2a7GDBqIVM7I(this, bArr)), Camera1Session.getFrameOrientation(Camera1Session.this), toNanos);
                Camera1Session.this.events.onFrameCaptured(Camera1Session.this, videoFrame);
                videoFrame.release();
            }
        }
    }

    public enum SessionState {
        RUNNING,
        STOPPED
    }

    /* renamed from: org.webrtc.Camera1Session$2 */
    public class C02522 implements OnTextureFrameAvailableListener {
        public void onTextureFrameAvailable(int i, float[] fArr, long j) {
            Camera1Session.checkIsOnCameraThread(Camera1Session.this);
            if (Camera1Session.this.state != SessionState.RUNNING) {
                Logging.m29383d(Camera1Session.TAG, "Texture frame captured but camera is no longer running.");
                Camera1Session.this.surfaceTextureHelper.returnTextureFrame();
                return;
            }
            if (!Camera1Session.this.firstFrameReported) {
                Camera1Session.camera1StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - Camera1Session.this.constructionTimeNs));
                Camera1Session.this.firstFrameReported = true;
            }
            int frameOrientation = Camera1Session.getFrameOrientation(Camera1Session.this);
            if (Camera1Session.this.info.facing == 1) {
                fArr = RendererCommon.multiplyMatrices(fArr, RendererCommon.horizontalFlipMatrix());
            }
            VideoFrame videoFrame = new VideoFrame(Camera1Session.this.surfaceTextureHelper.createTextureBuffer(Camera1Session.this.captureFormat.width, Camera1Session.this.captureFormat.height, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr)), frameOrientation, j);
            Camera1Session.this.events.onFrameCaptured(Camera1Session.this, videoFrame);
            videoFrame.release();
        }
    }

    private Camera1Session(Events events, boolean z, Context context, SurfaceTextureHelper surfaceTextureHelper, int i, Camera camera, CameraInfo cameraInfo, CaptureFormat captureFormat, long j) {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Create new camera1 session on camera ");
        stringBuilder.append(i);
        Logging.m29383d(str, stringBuilder.toString());
        this.cameraThreadHandler = new Handler();
        this.events = events;
        this.captureToTexture = z;
        this.applicationContext = context;
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.cameraId = i;
        this.camera = camera;
        this.info = cameraInfo;
        this.captureFormat = captureFormat;
        this.constructionTimeNs = j;
        startCapturing();
    }

    public static void checkIsOnCameraThread(Camera1Session camera1Session) {
        if (Thread.currentThread() != camera1Session.cameraThreadHandler.getLooper().getThread()) {
            throw new IllegalStateException("Wrong thread");
        }
    }

    public static void create(CreateSessionCallback createSessionCallback, Events events, boolean z, Context context, SurfaceTextureHelper surfaceTextureHelper, int i, int i2, int i3, int i4) {
        long nanoTime = System.nanoTime();
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Open camera ");
        int i5 = i;
        stringBuilder.append(i5);
        Logging.m29383d(str, stringBuilder.toString());
        Events events2 = events;
        events.onCameraOpening();
        try {
            Camera B = AnonymousClass09F.B(i5, -1796229014);
            if (B == null) {
                FailureType failureType = FailureType.ERROR;
                stringBuilder = new StringBuilder();
                stringBuilder.append("android.hardware.Camera.open returned null for camera id = ");
                stringBuilder.append(i5);
                createSessionCallback.onFailure(failureType, stringBuilder.toString());
                return;
            }
            try {
                SurfaceTextureHelper surfaceTextureHelper2 = surfaceTextureHelper;
                B.setPreviewTexture(surfaceTextureHelper2.getSurfaceTexture());
                CameraInfo cameraInfo = new CameraInfo();
                Camera.getCameraInfo(i5, cameraInfo);
                try {
                    Parameters parameters = B.getParameters();
                    int i6 = i2;
                    int i7 = i3;
                    CaptureFormat findClosestCaptureFormat = findClosestCaptureFormat(parameters, i6, i7, i4);
                    boolean z2 = z;
                    updateCameraParameters(B, parameters, findClosestCaptureFormat, findClosestPictureSize(parameters, i6, i7), z2);
                    if (!z) {
                        i7 = findClosestCaptureFormat.frameSize();
                        for (int i8 = 0; i8 < 3; i8++) {
                            B.addCallbackBuffer(ByteBuffer.allocateDirect(i7).array());
                        }
                    }
                    B.setDisplayOrientation(0);
                    createSessionCallback.onDone(new Camera1Session(events2, z2, context, surfaceTextureHelper2, i5, B, cameraInfo, findClosestCaptureFormat, nanoTime));
                } catch (RuntimeException e) {
                    AnonymousClass09F.C(B, 358910053);
                    createSessionCallback.onFailure(FailureType.ERROR, e.getMessage());
                }
            } catch (Exception e2) {
                AnonymousClass09F.C(B, 2091736985);
                createSessionCallback.onFailure(FailureType.ERROR, e2.getMessage());
            }
        } catch (RuntimeException e3) {
            createSessionCallback.onFailure(FailureType.ERROR, e3.getMessage());
        }
    }

    private static CaptureFormat findClosestCaptureFormat(Parameters parameters, int i, int i2, int i3) {
        List convertFramerates = Camera1Enumerator.convertFramerates(parameters.getSupportedPreviewFpsRange());
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Available fps ranges: ");
        stringBuilder.append(convertFramerates);
        Logging.m29383d(str, stringBuilder.toString());
        FramerateRange closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(convertFramerates, i3);
        Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPreviewSizes()), i, i2);
        CameraEnumerationAndroid.reportCameraResolution(camera1ResolutionHistogram, closestSupportedSize);
        return new CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, closestSupportedFramerateRange);
    }

    private static Size findClosestPictureSize(Parameters parameters, int i, int i2) {
        return CameraEnumerationAndroid.getClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPictureSizes()), i, i2);
    }

    private int getDeviceOrientation() {
        switch (((WindowManager) this.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation()) {
            case 1:
                return 90;
            case 2:
                return 180;
            case 3:
                return 270;
            default:
                return 0;
        }
    }

    public static int getFrameOrientation(Camera1Session camera1Session) {
        int deviceOrientation = camera1Session.getDeviceOrientation();
        if (camera1Session.info.facing == 0) {
            deviceOrientation = 360 - deviceOrientation;
        }
        return (camera1Session.info.orientation + deviceOrientation) % 360;
    }

    private void listenForBytebufferFrames() {
        this.camera.setPreviewCallbackWithBuffer(new C02073());
    }

    private void listenForTextureFrames() {
        this.surfaceTextureHelper.startListening(new C02522());
    }

    private void startCapturing() {
        Logging.m29383d(TAG, "Start capturing");
        checkIsOnCameraThread(this);
        this.state = SessionState.RUNNING;
        this.camera.setErrorCallback(new C02061());
        if (this.captureToTexture) {
            listenForTextureFrames();
        } else {
            listenForBytebufferFrames();
        }
        try {
            AnonymousClass09F.D(this.camera, -56215407);
        } catch (RuntimeException e) {
            stopInternal(this);
            this.events.onCameraError(this, e.getMessage());
        }
    }

    public void stop() {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Stop camera1 session on camera ");
        stringBuilder.append(this.cameraId);
        Logging.m29383d(str, stringBuilder.toString());
        checkIsOnCameraThread(this);
        if (this.state != SessionState.STOPPED) {
            long nanoTime = System.nanoTime();
            stopInternal(this);
            camera1StopTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime));
        }
    }

    public static void stopInternal(Camera1Session camera1Session) {
        Logging.m29383d(TAG, "Stop internal");
        checkIsOnCameraThread(camera1Session);
        SessionState sessionState = camera1Session.state;
        SessionState sessionState2 = SessionState.STOPPED;
        if (sessionState == sessionState2) {
            Logging.m29383d(TAG, "Camera is already stopped");
            return;
        }
        camera1Session.state = sessionState2;
        camera1Session.surfaceTextureHelper.stopListening();
        AnonymousClass09F.E(camera1Session.camera, -738951540);
        AnonymousClass09F.C(camera1Session.camera, -463518357);
        camera1Session.events.onCameraClosed(camera1Session);
        Logging.m29383d(TAG, "Stop done");
    }

    private static void updateCameraParameters(Camera camera, Parameters parameters, CaptureFormat captureFormat, Size size, boolean z) {
        List supportedFocusModes = parameters.getSupportedFocusModes();
        parameters.setPreviewFpsRange(captureFormat.framerate.min, captureFormat.framerate.max);
        parameters.setPreviewSize(captureFormat.width, captureFormat.height);
        parameters.setPictureSize(size.width, size.height);
        if (!z) {
            captureFormat.getClass();
            parameters.setPreviewFormat(17);
        }
        if (parameters.isVideoStabilizationSupported()) {
            parameters.setVideoStabilization(true);
        }
        if (supportedFocusModes.contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
        }
        camera.setParameters(parameters);
    }
}
