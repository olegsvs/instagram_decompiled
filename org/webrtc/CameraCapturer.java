package org.webrtc;

import X.AnonymousClass0OR;
import android.content.Context;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import org.webrtc.CameraSession.CreateSessionCallback;
import org.webrtc.CameraSession.Events;
import org.webrtc.CameraSession.FailureType;
import org.webrtc.CameraVideoCapturer.-CC;
import org.webrtc.CameraVideoCapturer.CameraEventsHandler;
import org.webrtc.CameraVideoCapturer.CameraStatistics;
import org.webrtc.CameraVideoCapturer.CameraSwitchHandler;
import org.webrtc.CameraVideoCapturer.MediaRecorderHandler;
import org.webrtc.VideoCapturer.CapturerObserver;

public abstract class CameraCapturer implements CameraVideoCapturer {
    private static final int MAX_OPEN_CAMERA_ATTEMPTS = 3;
    private static final int OPEN_CAMERA_DELAY_MS = 500;
    private static final int OPEN_CAMERA_TIMEOUT = 10000;
    private static final String TAG = "CameraCapturer";
    public Context applicationContext;
    public final CameraEnumerator cameraEnumerator;
    public String cameraName;
    public final Events cameraSessionEventsHandler = new C02552();
    public CameraStatistics cameraStatistics;
    private Handler cameraThreadHandler;
    public CapturerObserver capturerObserver;
    public final CreateSessionCallback createSessionCallback = new C02541();
    public CameraSession currentSession;
    public final CameraEventsHandler eventsHandler;
    public boolean firstFrameObserved;
    public int framerate;
    public int height;
    public int openAttemptsRemaining;
    public final Runnable openCameraTimeoutRunnable = new C02093();
    private boolean sessionOpening;
    public final Object stateLock = new Object();
    public SurfaceTextureHelper surfaceHelper;
    public CameraSwitchHandler switchEventsHandler;
    public SwitchState switchState = SwitchState.IDLE;
    public final Handler uiThreadHandler;
    public int width;

    /* renamed from: org.webrtc.CameraCapturer$3 */
    public class C02093 implements Runnable {
        public void run() {
            CameraCapturer.this.eventsHandler.onCameraError("Camera failed to start within timeout.");
        }
    }

    /* renamed from: org.webrtc.CameraCapturer$5 */
    public class C02105 implements Runnable {
        public void run() {
            CameraCapturer cameraCapturer = CameraCapturer.this;
            cameraCapturer.createCameraSession(cameraCapturer.createSessionCallback, CameraCapturer.this.cameraSessionEventsHandler, CameraCapturer.this.applicationContext, CameraCapturer.this.surfaceHelper, CameraCapturer.this.cameraName, CameraCapturer.this.width, CameraCapturer.this.height, CameraCapturer.this.framerate);
        }
    }

    public enum SwitchState {
        IDLE,
        PENDING,
        IN_PROGRESS
    }

    /* renamed from: org.webrtc.CameraCapturer$1 */
    public class C02541 implements CreateSessionCallback {
        public void onDone(CameraSession cameraSession) {
            CameraCapturer.checkIsOnCameraThread(CameraCapturer.this);
            String str = CameraCapturer.TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Create session done. Switch state: ");
            stringBuilder.append(CameraCapturer.this.switchState);
            Logging.m29383d(str, stringBuilder.toString());
            AnonymousClass0OR.G(CameraCapturer.this.uiThreadHandler, CameraCapturer.this.openCameraTimeoutRunnable, -1327334096);
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer.this.capturerObserver.onCapturerStarted(true);
                CameraCapturer.this.sessionOpening = false;
                CameraCapturer.this.currentSession = cameraSession;
                CameraCapturer.this.cameraStatistics = new CameraStatistics(CameraCapturer.this.surfaceHelper, CameraCapturer.this.eventsHandler);
                CameraCapturer.this.firstFrameObserved = false;
                CameraCapturer.this.stateLock.notifyAll();
                if (CameraCapturer.this.switchState == SwitchState.IN_PROGRESS) {
                    if (CameraCapturer.this.switchEventsHandler != null) {
                        CameraCapturer.this.switchEventsHandler.onCameraSwitchDone(CameraCapturer.this.cameraEnumerator.isFrontFacing(CameraCapturer.this.cameraName));
                        CameraCapturer.this.switchEventsHandler = null;
                    }
                    CameraCapturer.this.switchState = SwitchState.IDLE;
                } else if (CameraCapturer.this.switchState == SwitchState.PENDING) {
                    CameraCapturer.this.switchState = SwitchState.IDLE;
                    CameraCapturer.switchCameraInternal(CameraCapturer.this, CameraCapturer.this.switchEventsHandler);
                }
            }
        }

        public void onFailure(FailureType failureType, String str) {
            CameraCapturer.checkIsOnCameraThread(CameraCapturer.this);
            AnonymousClass0OR.G(CameraCapturer.this.uiThreadHandler, CameraCapturer.this.openCameraTimeoutRunnable, -1400186378);
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer.this.capturerObserver.onCapturerStarted(false);
                CameraCapturer.this.openAttemptsRemaining = CameraCapturer.this.openAttemptsRemaining - 1;
                String str2;
                StringBuilder stringBuilder;
                if (CameraCapturer.this.openAttemptsRemaining <= 0) {
                    str2 = CameraCapturer.TAG;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Opening camera failed, passing: ");
                    stringBuilder.append(str);
                    Logging.m29387w(str2, stringBuilder.toString());
                    CameraCapturer.this.sessionOpening = false;
                    CameraCapturer.this.stateLock.notifyAll();
                    if (CameraCapturer.this.switchState != SwitchState.IDLE) {
                        if (CameraCapturer.this.switchEventsHandler != null) {
                            CameraCapturer.this.switchEventsHandler.onCameraSwitchError(str);
                            CameraCapturer.this.switchEventsHandler = null;
                        }
                        CameraCapturer.this.switchState = SwitchState.IDLE;
                    }
                    if (failureType == FailureType.DISCONNECTED) {
                        CameraCapturer.this.eventsHandler.onCameraDisconnected();
                    } else {
                        CameraCapturer.this.eventsHandler.onCameraError(str);
                    }
                } else {
                    str2 = CameraCapturer.TAG;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Opening camera failed, retry: ");
                    stringBuilder.append(str);
                    Logging.m29387w(str2, stringBuilder.toString());
                    CameraCapturer.createSessionInternal(CameraCapturer.this, 500);
                }
            }
        }
    }

    /* renamed from: org.webrtc.CameraCapturer$2 */
    public class C02552 implements Events {
        public void onCameraClosed(CameraSession cameraSession) {
            CameraCapturer.checkIsOnCameraThread(CameraCapturer.this);
            synchronized (CameraCapturer.this.stateLock) {
                if (cameraSession == CameraCapturer.this.currentSession || CameraCapturer.this.currentSession == null) {
                    CameraCapturer.this.eventsHandler.onCameraClosed();
                } else {
                    Logging.m29383d(CameraCapturer.TAG, "onCameraClosed from another session.");
                }
            }
        }

        public void onCameraDisconnected(CameraSession cameraSession) {
            CameraCapturer.checkIsOnCameraThread(CameraCapturer.this);
            synchronized (CameraCapturer.this.stateLock) {
                if (cameraSession != CameraCapturer.this.currentSession) {
                    Logging.m29387w(CameraCapturer.TAG, "onCameraDisconnected from another session.");
                } else {
                    CameraCapturer.this.eventsHandler.onCameraDisconnected();
                    CameraCapturer.this.stopCapture();
                }
            }
        }

        public void onCameraError(CameraSession cameraSession, String str) {
            CameraCapturer.checkIsOnCameraThread(CameraCapturer.this);
            synchronized (CameraCapturer.this.stateLock) {
                if (cameraSession != CameraCapturer.this.currentSession) {
                    String str2 = CameraCapturer.TAG;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("onCameraError from another session: ");
                    stringBuilder.append(str);
                    Logging.m29387w(str2, stringBuilder.toString());
                } else {
                    CameraCapturer.this.eventsHandler.onCameraError(str);
                    CameraCapturer.this.stopCapture();
                }
            }
        }

        public void onCameraOpening() {
            CameraCapturer.checkIsOnCameraThread(CameraCapturer.this);
            synchronized (CameraCapturer.this.stateLock) {
                if (CameraCapturer.this.currentSession != null) {
                    Logging.m29387w(CameraCapturer.TAG, "onCameraOpening while session was open.");
                } else {
                    CameraCapturer.this.eventsHandler.onCameraOpening(CameraCapturer.this.cameraName);
                }
            }
        }

        public void onFrameCaptured(CameraSession cameraSession, VideoFrame videoFrame) {
            CameraCapturer.checkIsOnCameraThread(CameraCapturer.this);
            synchronized (CameraCapturer.this.stateLock) {
                if (cameraSession != CameraCapturer.this.currentSession) {
                    Logging.m29387w(CameraCapturer.TAG, "onFrameCaptured from another session.");
                } else {
                    if (!CameraCapturer.this.firstFrameObserved) {
                        CameraCapturer.this.eventsHandler.onFirstFrameAvailable();
                        CameraCapturer.this.firstFrameObserved = true;
                    }
                    CameraCapturer.this.cameraStatistics.addFrame();
                    CameraCapturer.this.capturerObserver.onFrameCaptured(videoFrame);
                }
            }
        }
    }

    /* renamed from: org.webrtc.CameraCapturer$4 */
    public class C02564 implements CameraEventsHandler {
        public void onCameraClosed() {
        }

        public void onCameraDisconnected() {
        }

        public void onCameraError(String str) {
        }

        public void onCameraFreezed(String str) {
        }

        public void onCameraOpening(String str) {
        }

        public void onFirstFrameAvailable() {
        }
    }

    public /* synthetic */ void addMediaRecorderToCamera(MediaRecorder mediaRecorder, MediaRecorderHandler mediaRecorderHandler) {
        -CC.$default$addMediaRecorderToCamera(this, mediaRecorder, mediaRecorderHandler);
    }

    public abstract void createCameraSession(CreateSessionCallback createSessionCallback, Events events, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3);

    public boolean isScreencast() {
        return false;
    }

    public /* synthetic */ void removeMediaRecorderFromCamera(MediaRecorderHandler mediaRecorderHandler) {
        -CC.$default$removeMediaRecorderFromCamera(this, mediaRecorderHandler);
    }

    public CameraCapturer(String str, CameraEventsHandler cameraEventsHandler, CameraEnumerator cameraEnumerator) {
        if (cameraEventsHandler == null) {
            cameraEventsHandler = new C02564();
        }
        this.eventsHandler = cameraEventsHandler;
        this.cameraEnumerator = cameraEnumerator;
        this.cameraName = str;
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        String[] deviceNames = cameraEnumerator.getDeviceNames();
        if (deviceNames.length == 0) {
            throw new RuntimeException("No cameras attached.");
        } else if (!Arrays.asList(deviceNames).contains(this.cameraName)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Camera name ");
            stringBuilder.append(this.cameraName);
            stringBuilder.append(" does not match any known camera device.");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public void changeCaptureFormat(int i, int i2, int i3) {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("changeCaptureFormat: ");
        stringBuilder.append(i);
        stringBuilder.append("x");
        stringBuilder.append(i2);
        stringBuilder.append("@");
        stringBuilder.append(i3);
        Logging.m29383d(str, stringBuilder.toString());
        synchronized (this.stateLock) {
            stopCapture();
            startCapture(i, i2, i3);
        }
    }

    public static void checkIsOnCameraThread(CameraCapturer cameraCapturer) {
        if (Thread.currentThread() != cameraCapturer.cameraThreadHandler.getLooper().getThread()) {
            Logging.m29384e(TAG, "Check is on camera thread failed.");
            throw new RuntimeException("Not on camera thread.");
        }
    }

    public static void createSessionInternal(CameraCapturer cameraCapturer, int i) {
        AnonymousClass0OR.F(cameraCapturer.uiThreadHandler, cameraCapturer.openCameraTimeoutRunnable, (long) (i + OPEN_CAMERA_TIMEOUT), 1869062249);
        AnonymousClass0OR.F(cameraCapturer.cameraThreadHandler, new C02105(), (long) i, 501543503);
    }

    public void dispose() {
        Logging.m29383d(TAG, "dispose");
        stopCapture();
    }

    public String getCameraName() {
        String str;
        synchronized (this.stateLock) {
            str = this.cameraName;
        }
        return str;
    }

    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        Handler handler;
        this.applicationContext = context;
        this.capturerObserver = capturerObserver;
        this.surfaceHelper = surfaceTextureHelper;
        if (surfaceTextureHelper == null) {
            handler = null;
        } else {
            handler = surfaceTextureHelper.getHandler();
        }
        this.cameraThreadHandler = handler;
    }

    public void printStackTrace() {
        Handler handler = this.cameraThreadHandler;
        Thread thread = handler != null ? handler.getLooper().getThread() : null;
        if (thread != null) {
            StackTraceElement[] stackTrace = thread.getStackTrace();
            if (stackTrace.length > 0) {
                String str = TAG;
                Logging.m29383d(str, "CameraCapturer stack trace:");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    Logging.m29383d(str, stackTraceElement.toString());
                }
            }
        }
    }

    private void reportCameraSwitchError(String str, CameraSwitchHandler cameraSwitchHandler) {
        Logging.m29384e(TAG, str);
        if (cameraSwitchHandler != null) {
            cameraSwitchHandler.onCameraSwitchError(str);
        }
    }

    public void startCapture(int i, int i2, int i3) {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("startCapture: ");
        stringBuilder.append(i);
        stringBuilder.append("x");
        stringBuilder.append(i2);
        stringBuilder.append("@");
        stringBuilder.append(i3);
        Logging.m29383d(str, stringBuilder.toString());
        if (this.applicationContext != null) {
            synchronized (this.stateLock) {
                if (!this.sessionOpening) {
                    if (this.currentSession == null) {
                        this.width = i;
                        this.height = i2;
                        this.framerate = i3;
                        this.sessionOpening = true;
                        this.openAttemptsRemaining = 3;
                        createSessionInternal(this, 0);
                    }
                }
                Logging.m29387w(TAG, "Session already open");
            }
            return;
        }
        throw new RuntimeException("CameraCapturer must be initialized before calling startCapture.");
    }

    public void stopCapture() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r1 = "CameraCapturer";
        r0 = "Stop capture";
        org.webrtc.Logging.m29383d(r1, r0);
        r4 = r5.stateLock;
        monitor-enter(r4);
    L_0x000a:
        r0 = r5.sessionOpening;	 Catch:{ all -> 0x005d }
        if (r0 == 0) goto L_0x0027;	 Catch:{ all -> 0x005d }
    L_0x000e:
        r0 = "Stop capture: Waiting for session to open";	 Catch:{ all -> 0x005d }
        org.webrtc.Logging.m29383d(r1, r0);	 Catch:{ all -> 0x005d }
        r0 = r5.stateLock;	 Catch:{ InterruptedException -> 0x0019 }
        r0.wait();	 Catch:{ InterruptedException -> 0x0019 }
        goto L_0x000a;	 Catch:{ InterruptedException -> 0x0019 }
    L_0x0019:
        r0 = "Stop capture interrupted while waiting for the session to open.";	 Catch:{ all -> 0x005d }
        org.webrtc.Logging.m29387w(r1, r0);	 Catch:{ all -> 0x005d }
        r0 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x005d }
        r0.interrupt();	 Catch:{ all -> 0x005d }
        monitor-exit(r4);	 Catch:{ all -> 0x005d }
        return;	 Catch:{ all -> 0x005d }
    L_0x0027:
        r0 = r5.currentSession;	 Catch:{ all -> 0x005d }
        if (r0 == 0) goto L_0x004f;	 Catch:{ all -> 0x005d }
    L_0x002b:
        r0 = "Stop capture: Nulling session";	 Catch:{ all -> 0x005d }
        org.webrtc.Logging.m29383d(r1, r0);	 Catch:{ all -> 0x005d }
        r0 = r5.cameraStatistics;	 Catch:{ all -> 0x005d }
        r0.release();	 Catch:{ all -> 0x005d }
        r3 = 0;	 Catch:{ all -> 0x005d }
        r5.cameraStatistics = r3;	 Catch:{ all -> 0x005d }
        r0 = r5.currentSession;	 Catch:{ all -> 0x005d }
        r2 = r5.cameraThreadHandler;	 Catch:{ all -> 0x005d }
        r1 = new org.webrtc.CameraCapturer$6;	 Catch:{ all -> 0x005d }
        r1.<init>(r0);	 Catch:{ all -> 0x005d }
        r0 = 1028543768; // 0x3d4e5518 float:0.05037412 double:5.08168141E-315;	 Catch:{ all -> 0x005d }
        X.AnonymousClass0OR.D(r2, r1, r0);	 Catch:{ all -> 0x005d }
        r5.currentSession = r3;	 Catch:{ all -> 0x005d }
        r0 = r5.capturerObserver;	 Catch:{ all -> 0x005d }
        r0.onCapturerStopped();	 Catch:{ all -> 0x005d }
        goto L_0x0054;	 Catch:{ all -> 0x005d }
    L_0x004f:
        r0 = "Stop capture: No session open";	 Catch:{ all -> 0x005d }
        org.webrtc.Logging.m29383d(r1, r0);	 Catch:{ all -> 0x005d }
    L_0x0054:
        monitor-exit(r4);	 Catch:{ all -> 0x005d }
        r1 = "CameraCapturer";
        r0 = "Stop capture done";
        org.webrtc.Logging.m29383d(r1, r0);
        return;
    L_0x005d:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x005d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.CameraCapturer.stopCapture():void");
    }

    public void switchCamera(final CameraSwitchHandler cameraSwitchHandler) {
        Logging.m29383d(TAG, "switchCamera");
        AnonymousClass0OR.D(this.cameraThreadHandler, new Runnable() {
            public void run() {
                CameraCapturer.switchCameraInternal(CameraCapturer.this, cameraSwitchHandler);
            }
        }, -1619021562);
    }

    public static void switchCameraInternal(CameraCapturer cameraCapturer, CameraSwitchHandler cameraSwitchHandler) {
        Logging.m29383d(TAG, "switchCamera internal");
        String[] deviceNames = cameraCapturer.cameraEnumerator.getDeviceNames();
        if (deviceNames.length >= 2) {
            synchronized (cameraCapturer.stateLock) {
                if (cameraCapturer.switchState != SwitchState.IDLE) {
                    cameraCapturer.reportCameraSwitchError("Camera switch already in progress.", cameraSwitchHandler);
                } else if (cameraCapturer.sessionOpening || cameraCapturer.currentSession != null) {
                    cameraCapturer.switchEventsHandler = cameraSwitchHandler;
                    if (cameraCapturer.sessionOpening) {
                        cameraCapturer.switchState = SwitchState.PENDING;
                    } else {
                        cameraCapturer.switchState = SwitchState.IN_PROGRESS;
                        Logging.m29383d(TAG, "switchCamera: Stopping session");
                        cameraCapturer.cameraStatistics.release();
                        cameraCapturer.cameraStatistics = null;
                        final CameraSession cameraSession = cameraCapturer.currentSession;
                        AnonymousClass0OR.D(cameraCapturer.cameraThreadHandler, new Runnable() {
                            public void run() {
                                cameraSession.stop();
                            }
                        }, -1850756976);
                        cameraCapturer.currentSession = null;
                        cameraCapturer.cameraName = deviceNames[(Arrays.asList(deviceNames).indexOf(cameraCapturer.cameraName) + 1) % deviceNames.length];
                        cameraCapturer.sessionOpening = true;
                        cameraCapturer.openAttemptsRemaining = 1;
                        createSessionInternal(cameraCapturer, 0);
                        Logging.m29383d(TAG, "switchCamera done");
                    }
                } else {
                    cameraCapturer.reportCameraSwitchError("switchCamera: camera is not running.", cameraSwitchHandler);
                }
            }
        } else if (cameraSwitchHandler != null) {
            cameraSwitchHandler.onCameraSwitchError("No camera to switch to.");
        }
    }
}
