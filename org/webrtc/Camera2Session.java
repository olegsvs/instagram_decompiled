package org.webrtc;

import X.AnonymousClass09E;
import X.AnonymousClass1OA;
import X.AnonymousClass1OB;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraDevice.StateCallback;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Builder;
import android.os.Handler;
import android.util.Range;
import android.view.Surface;
import android.view.WindowManager;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.webrtc.CameraEnumerationAndroid.CaptureFormat;
import org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange;
import org.webrtc.CameraSession.CreateSessionCallback;
import org.webrtc.CameraSession.Events;
import org.webrtc.CameraSession.FailureType;
import org.webrtc.SurfaceTextureHelper.OnTextureFrameAvailableListener;

public class Camera2Session implements CameraSession {
    private static final String TAG = "Camera2Session";
    private static final Histogram camera2ResolutionHistogram = Histogram.createEnumeration("WebRTC.Android.Camera2.Resolution", CameraEnumerationAndroid.COMMON_RESOLUTIONS.size());
    public static final Histogram camera2StartTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera2.StartTimeMs", 1, 10000, 50);
    private static final Histogram camera2StopTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera2.StopTimeMs", 1, 10000, 50);
    private final Context applicationContext;
    public final CreateSessionCallback callback;
    public CameraCharacteristics cameraCharacteristics;
    public CameraDevice cameraDevice;
    private final String cameraId;
    private final CameraManager cameraManager;
    public int cameraOrientation;
    public final Handler cameraThreadHandler;
    public CaptureFormat captureFormat;
    public CameraCaptureSession captureSession;
    public final long constructionTimeNs;
    public final Events events;
    public boolean firstFrameReported = false;
    public int fpsUnitFactor;
    private final int framerate;
    private final int height;
    public boolean isCameraFrontFacing;
    public SessionState state = SessionState.RUNNING;
    public Surface surface;
    public final SurfaceTextureHelper surfaceTextureHelper;
    private final int width;

    public class CameraCaptureCallback extends CaptureCallback {
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            captureRequest = Camera2Session.TAG;
            cameraCaptureSession = new StringBuilder();
            cameraCaptureSession.append("Capture failed: ");
            cameraCaptureSession.append(captureFailure);
            Logging.m29383d(captureRequest, cameraCaptureSession.toString());
        }
    }

    public class CameraStateCallback extends StateCallback {
        private String getErrorDescription(int i) {
            switch (i) {
                case 1:
                    return "Camera device is in use already.";
                case 2:
                    return "Camera device could not be opened because there are too many other open camera devices.";
                case 3:
                    return "Camera device could not be opened due to a device policy.";
                case 4:
                    return "Camera device has encountered a fatal error.";
                case 5:
                    return "Camera service has encountered a fatal error.";
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown camera error: ");
                    stringBuilder.append(i);
                    return stringBuilder.toString();
            }
        }

        public void onClosed(CameraDevice cameraDevice) {
            Camera2Session.checkIsOnCameraThread(Camera2Session.this);
            Logging.m29383d(Camera2Session.TAG, "Camera device closed.");
            Camera2Session.this.events.onCameraClosed(Camera2Session.this);
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            Camera2Session.checkIsOnCameraThread(Camera2Session.this);
            Object obj = (Camera2Session.this.captureSession != null || Camera2Session.this.state == SessionState.STOPPED) ? null : 1;
            Camera2Session.this.state = SessionState.STOPPED;
            Camera2Session.stopInternal(Camera2Session.this);
            if (obj != null) {
                Camera2Session.this.callback.onFailure(FailureType.DISCONNECTED, "Camera disconnected / evicted.");
            } else {
                Camera2Session.this.events.onCameraDisconnected(Camera2Session.this);
            }
        }

        public void onError(CameraDevice cameraDevice, int i) {
            if (AnonymousClass1OB.C()) {
                AnonymousClass1OB.D(cameraDevice);
            }
            Camera2Session.checkIsOnCameraThread(Camera2Session.this);
            Camera2Session.reportError(Camera2Session.this, getErrorDescription(i));
        }

        public void onOpened(CameraDevice cameraDevice) {
            if (AnonymousClass1OB.C()) {
                AnonymousClass1OB.E(cameraDevice);
            }
            Camera2Session.checkIsOnCameraThread(Camera2Session.this);
            Logging.m29383d(Camera2Session.TAG, "Camera opened.");
            Camera2Session.this.cameraDevice = cameraDevice;
            SurfaceTexture surfaceTexture = Camera2Session.this.surfaceTextureHelper.getSurfaceTexture();
            surfaceTexture.setDefaultBufferSize(Camera2Session.this.captureFormat.width, Camera2Session.this.captureFormat.height);
            Camera2Session.this.surface = new Surface(surfaceTexture);
            try {
                cameraDevice.createCaptureSession(Arrays.asList(new Surface[]{Camera2Session.this.surface}), new CaptureSessionCallback(), Camera2Session.this.cameraThreadHandler);
            } catch (CameraAccessException e) {
                Camera2Session camera2Session = Camera2Session.this;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to create capture session. ");
                stringBuilder.append(e);
                Camera2Session.reportError(camera2Session, stringBuilder.toString());
            }
        }
    }

    public class CaptureSessionCallback extends CameraCaptureSession.StateCallback {

        /* renamed from: org.webrtc.Camera2Session$CaptureSessionCallback$1 */
        public class C02531 implements OnTextureFrameAvailableListener {
            public void onTextureFrameAvailable(int i, float[] fArr, long j) {
                Camera2Session.checkIsOnCameraThread(Camera2Session.this);
                if (Camera2Session.this.state != SessionState.RUNNING) {
                    Logging.m29383d(Camera2Session.TAG, "Texture frame captured but camera is no longer running.");
                    Camera2Session.this.surfaceTextureHelper.returnTextureFrame();
                    return;
                }
                if (!Camera2Session.this.firstFrameReported) {
                    Camera2Session.this.firstFrameReported = true;
                    Camera2Session.camera2StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - Camera2Session.this.constructionTimeNs));
                }
                int frameOrientation = Camera2Session.getFrameOrientation(Camera2Session.this);
                if (Camera2Session.this.isCameraFrontFacing) {
                    fArr = RendererCommon.multiplyMatrices(fArr, RendererCommon.horizontalFlipMatrix());
                }
                VideoFrame videoFrame = new VideoFrame(Camera2Session.this.surfaceTextureHelper.createTextureBuffer(Camera2Session.this.captureFormat.width, Camera2Session.this.captureFormat.height, RendererCommon.convertMatrixToAndroidGraphicsMatrix(RendererCommon.rotateTextureMatrix(fArr, (float) (-Camera2Session.this.cameraOrientation)))), frameOrientation, j);
                Camera2Session.this.events.onFrameCaptured(Camera2Session.this, videoFrame);
                videoFrame.release();
            }
        }

        private void chooseFocusMode(Builder builder) {
            for (int i : (int[]) Camera2Session.this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES)) {
                if (i == 3) {
                    builder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(3));
                    Logging.m29383d(Camera2Session.TAG, "Using continuous video auto-focus.");
                    return;
                }
            }
            Logging.m29383d(Camera2Session.TAG, "Auto-focus is not available.");
        }

        private void chooseStabilizationMode(Builder builder) {
            int[] iArr = (int[]) Camera2Session.this.cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 1) {
                        builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(1));
                        builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(0));
                        Logging.m29383d(Camera2Session.TAG, "Using optical stabilization.");
                        return;
                    }
                }
            }
            for (int i2 : (int[]) Camera2Session.this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) {
                if (i2 == 1) {
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(1));
                    builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(0));
                    Logging.m29383d(Camera2Session.TAG, "Using video stabilization.");
                    return;
                }
            }
            Logging.m29383d(Camera2Session.TAG, "Stabilization not available.");
        }

        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Camera2Session.checkIsOnCameraThread(Camera2Session.this);
            AnonymousClass09E.B(cameraCaptureSession, -1584429130);
            Camera2Session.reportError(Camera2Session.this, "Failed to configure capture session.");
        }

        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Camera2Session.checkIsOnCameraThread(Camera2Session.this);
            Logging.m29383d(Camera2Session.TAG, "Camera capture session configured.");
            Camera2Session.this.captureSession = cameraCaptureSession;
            try {
                Builder createCaptureRequest = Camera2Session.this.cameraDevice.createCaptureRequest(3);
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(Camera2Session.this.captureFormat.framerate.min / Camera2Session.this.fpsUnitFactor), Integer.valueOf(Camera2Session.this.captureFormat.framerate.max / Camera2Session.this.fpsUnitFactor)));
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(false));
                chooseStabilizationMode(createCaptureRequest);
                chooseFocusMode(createCaptureRequest);
                createCaptureRequest.addTarget(Camera2Session.this.surface);
                cameraCaptureSession.setRepeatingRequest(createCaptureRequest.build(), new CameraCaptureCallback(), Camera2Session.this.cameraThreadHandler);
                if (AnonymousClass1OB.C()) {
                    CameraDevice device = cameraCaptureSession.getDevice();
                    AnonymousClass1OB.f17876E.readLock().lock();
                    int size = AnonymousClass1OB.f17875D.size();
                    for (int i = 0; i < size; i++) {
                        ((AnonymousClass1OA) AnonymousClass1OB.f17875D.get(i)).OBA(device);
                    }
                    AnonymousClass1OB.f17876E.readLock().unlock();
                }
                Camera2Session.this.surfaceTextureHelper.startListening(new C02531());
                Logging.m29383d(Camera2Session.TAG, "Camera device successfully started.");
                Camera2Session.this.callback.onDone(Camera2Session.this);
            } catch (CameraAccessException e) {
                Camera2Session camera2Session = Camera2Session.this;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to start capture request. ");
                stringBuilder.append(e);
                Camera2Session.reportError(camera2Session, stringBuilder.toString());
            } catch (Throwable th) {
                AnonymousClass1OB.f17876E.readLock().unlock();
            }
        }
    }

    public enum SessionState {
        RUNNING,
        STOPPED
    }

    private Camera2Session(CreateSessionCallback createSessionCallback, Events events, Context context, CameraManager cameraManager, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3) {
        String str2 = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Create new camera2 session on camera ");
        stringBuilder.append(str);
        Logging.m29383d(str2, stringBuilder.toString());
        this.constructionTimeNs = System.nanoTime();
        this.cameraThreadHandler = new Handler();
        this.callback = createSessionCallback;
        this.events = events;
        this.applicationContext = context;
        this.cameraManager = cameraManager;
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.cameraId = str;
        this.width = i;
        this.height = i2;
        this.framerate = i3;
        start();
    }

    public static void checkIsOnCameraThread(Camera2Session camera2Session) {
        if (Thread.currentThread() != camera2Session.cameraThreadHandler.getLooper().getThread()) {
            throw new IllegalStateException("Wrong thread");
        }
    }

    public static void create(CreateSessionCallback createSessionCallback, Events events, Context context, CameraManager cameraManager, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3) {
        Camera2Session camera2Session = new Camera2Session(createSessionCallback, events, context, cameraManager, surfaceTextureHelper, str, i, i2, i3);
    }

    private void findCaptureFormat() {
        checkIsOnCameraThread(this);
        Range[] rangeArr = (Range[]) this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        int fpsUnitFactor = Camera2Enumerator.getFpsUnitFactor(rangeArr);
        this.fpsUnitFactor = fpsUnitFactor;
        List convertFramerates = Camera2Enumerator.convertFramerates(rangeArr, fpsUnitFactor);
        List supportedSizes = Camera2Enumerator.getSupportedSizes(this.cameraCharacteristics);
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Available preview sizes: ");
        stringBuilder.append(supportedSizes);
        Logging.m29383d(str, stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append("Available fps ranges: ");
        stringBuilder.append(convertFramerates);
        Logging.m29383d(str, stringBuilder.toString());
        if (!convertFramerates.isEmpty()) {
            if (!supportedSizes.isEmpty()) {
                FramerateRange closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(convertFramerates, this.framerate);
                Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(supportedSizes, this.width, this.height);
                CameraEnumerationAndroid.reportCameraResolution(camera2ResolutionHistogram, closestSupportedSize);
                this.captureFormat = new CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, closestSupportedFramerateRange);
                str = TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Using capture format: ");
                stringBuilder.append(this.captureFormat);
                Logging.m29383d(str, stringBuilder.toString());
                return;
            }
        }
        reportError(this, "No supported capture formats.");
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

    public static int getFrameOrientation(Camera2Session camera2Session) {
        int deviceOrientation = camera2Session.getDeviceOrientation();
        if (!camera2Session.isCameraFrontFacing) {
            deviceOrientation = 360 - deviceOrientation;
        }
        return (camera2Session.cameraOrientation + deviceOrientation) % 360;
    }

    private void openCamera() {
        checkIsOnCameraThread(this);
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Opening camera ");
        stringBuilder.append(this.cameraId);
        Logging.m29383d(str, stringBuilder.toString());
        this.events.onCameraOpening();
        try {
            this.cameraManager.openCamera(this.cameraId, new CameraStateCallback(), this.cameraThreadHandler);
        } catch (CameraAccessException e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to open camera: ");
            stringBuilder.append(e);
            reportError(this, stringBuilder.toString());
        }
    }

    public static void reportError(Camera2Session camera2Session, String str) {
        checkIsOnCameraThread(camera2Session);
        String str2 = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Error: ");
        stringBuilder.append(str);
        Logging.m29384e(str2, stringBuilder.toString());
        Object obj = (camera2Session.captureSession != null || camera2Session.state == SessionState.STOPPED) ? null : 1;
        camera2Session.state = SessionState.STOPPED;
        stopInternal(camera2Session);
        if (obj != null) {
            camera2Session.callback.onFailure(FailureType.ERROR, str);
        } else {
            camera2Session.events.onCameraError(camera2Session, str);
        }
    }

    private void start() {
        checkIsOnCameraThread(this);
        Logging.m29383d(TAG, "start");
        try {
            this.cameraCharacteristics = this.cameraManager.getCameraCharacteristics(this.cameraId);
            this.cameraOrientation = ((Integer) this.cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            this.isCameraFrontFacing = ((Integer) this.cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0;
            findCaptureFormat();
            openCamera();
        } catch (CameraAccessException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("getCameraCharacteristics(): ");
            stringBuilder.append(e.getMessage());
            reportError(this, stringBuilder.toString());
        }
    }

    public void stop() {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Stop camera2 session on camera ");
        stringBuilder.append(this.cameraId);
        Logging.m29383d(str, stringBuilder.toString());
        checkIsOnCameraThread(this);
        SessionState sessionState = this.state;
        SessionState sessionState2 = SessionState.STOPPED;
        if (sessionState != sessionState2) {
            long nanoTime = System.nanoTime();
            this.state = sessionState2;
            stopInternal(this);
            camera2StopTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime));
        }
    }

    public static void stopInternal(Camera2Session camera2Session) {
        Logging.m29383d(TAG, "Stop internal");
        checkIsOnCameraThread(camera2Session);
        camera2Session.surfaceTextureHelper.stopListening();
        CameraCaptureSession cameraCaptureSession = camera2Session.captureSession;
        if (cameraCaptureSession != null) {
            AnonymousClass09E.B(cameraCaptureSession, 977020773);
            camera2Session.captureSession = null;
        }
        Surface surface = camera2Session.surface;
        if (surface != null) {
            surface.release();
            camera2Session.surface = null;
        }
        CameraDevice cameraDevice = camera2Session.cameraDevice;
        if (cameraDevice != null) {
            cameraDevice.close();
            if (AnonymousClass1OB.C()) {
                AnonymousClass1OB.B(cameraDevice);
            }
            camera2Session.cameraDevice = null;
        }
        Logging.m29383d(TAG, "Stop done");
    }
}
