package org.webrtc;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import org.webrtc.CameraSession.CreateSessionCallback;
import org.webrtc.CameraSession.Events;
import org.webrtc.CameraVideoCapturer.CameraEventsHandler;

public class Camera2Capturer extends CameraCapturer {
    private final CameraManager cameraManager;
    private final Context context;

    public Camera2Capturer(Context context, String str, CameraEventsHandler cameraEventsHandler) {
        super(str, cameraEventsHandler, new Camera2Enumerator(context));
        this.context = context;
        this.cameraManager = (CameraManager) context.getSystemService("camera");
    }

    public void createCameraSession(CreateSessionCallback createSessionCallback, Events events, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3) {
        Camera2Session.create(createSessionCallback, events, context, this.cameraManager, surfaceTextureHelper, str, i, i2, i3);
    }
}
