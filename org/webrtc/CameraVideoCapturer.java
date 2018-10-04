package org.webrtc;

import X.AnonymousClass0OR;
import android.media.MediaRecorder;

public interface CameraVideoCapturer extends VideoCapturer {

    public final /* synthetic */ class -CC {
        public static void $default$addMediaRecorderToCamera(CameraVideoCapturer -this, MediaRecorder mediaRecorder, MediaRecorderHandler mediaRecorderHandler) {
            throw new UnsupportedOperationException("Deprecated and not implemented.");
        }

        public static void $default$removeMediaRecorderFromCamera(CameraVideoCapturer -this, MediaRecorderHandler mediaRecorderHandler) {
            throw new UnsupportedOperationException("Deprecated and not implemented.");
        }
    }

    public interface CameraEventsHandler {
        void onCameraClosed();

        void onCameraDisconnected();

        void onCameraError(String str);

        void onCameraFreezed(String str);

        void onCameraOpening(String str);

        void onFirstFrameAvailable();
    }

    public class CameraStatistics {
        private static final int CAMERA_FREEZE_REPORT_TIMOUT_MS = 4000;
        private static final int CAMERA_OBSERVER_PERIOD_MS = 2000;
        private static final String TAG = "CameraStatistics";
        private final Runnable cameraObserver = new C02141();
        public final CameraEventsHandler eventsHandler;
        public int frameCount;
        public int freezePeriodCount;
        public final SurfaceTextureHelper surfaceTextureHelper;

        /* renamed from: org.webrtc.CameraVideoCapturer$CameraStatistics$1 */
        public class C02141 implements Runnable {
            public void run() {
                int round = Math.round((((float) CameraStatistics.this.frameCount) * 1000.0f) / 2000.0f);
                String str = CameraStatistics.TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Camera fps: ");
                stringBuilder.append(round);
                stringBuilder.append(".");
                Logging.m29383d(str, stringBuilder.toString());
                if (CameraStatistics.this.frameCount == 0) {
                    CameraStatistics.access$104(CameraStatistics.this);
                    if (CameraStatistics.this.freezePeriodCount * CameraStatistics.CAMERA_OBSERVER_PERIOD_MS >= CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS && CameraStatistics.this.eventsHandler != null) {
                        Logging.m29384e(CameraStatistics.TAG, "Camera freezed.");
                        if (CameraStatistics.this.surfaceTextureHelper.isTextureInUse()) {
                            CameraStatistics.this.eventsHandler.onCameraFreezed("Camera failure. Client must return video buffers.");
                        } else {
                            CameraStatistics.this.eventsHandler.onCameraFreezed("Camera failure.");
                        }
                        return;
                    }
                }
                CameraStatistics.this.freezePeriodCount = 0;
                CameraStatistics.this.frameCount = 0;
                AnonymousClass0OR.F(CameraStatistics.this.surfaceTextureHelper.getHandler(), this, 2000, -1862241829);
            }
        }

        public CameraStatistics(SurfaceTextureHelper surfaceTextureHelper, CameraEventsHandler cameraEventsHandler) {
            if (surfaceTextureHelper != null) {
                this.surfaceTextureHelper = surfaceTextureHelper;
                this.eventsHandler = cameraEventsHandler;
                this.frameCount = 0;
                this.freezePeriodCount = 0;
                AnonymousClass0OR.F(surfaceTextureHelper.getHandler(), this.cameraObserver, 2000, 186995129);
                return;
            }
            throw new IllegalArgumentException("SurfaceTextureHelper is null");
        }

        public static /* synthetic */ int access$104(CameraStatistics cameraStatistics) {
            int i = cameraStatistics.freezePeriodCount + 1;
            cameraStatistics.freezePeriodCount = i;
            return i;
        }

        public void addFrame() {
            checkThread();
            this.frameCount++;
        }

        private void checkThread() {
            if (Thread.currentThread() != this.surfaceTextureHelper.getHandler().getLooper().getThread()) {
                throw new IllegalStateException("Wrong thread");
            }
        }

        public void release() {
            AnonymousClass0OR.G(this.surfaceTextureHelper.getHandler(), this.cameraObserver, 263992972);
        }
    }

    public interface CameraSwitchHandler {
        void onCameraSwitchDone(boolean z);

        void onCameraSwitchError(String str);
    }

    public interface MediaRecorderHandler {
        void onMediaRecorderError(String str);

        void onMediaRecorderSuccess();
    }

    void addMediaRecorderToCamera(MediaRecorder mediaRecorder, MediaRecorderHandler mediaRecorderHandler);

    void removeMediaRecorderFromCamera(MediaRecorderHandler mediaRecorderHandler);

    void switchCamera(CameraSwitchHandler cameraSwitchHandler);
}
