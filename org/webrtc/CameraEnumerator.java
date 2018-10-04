package org.webrtc;

import java.util.List;
import org.webrtc.CameraVideoCapturer.CameraEventsHandler;

public interface CameraEnumerator {
    CameraVideoCapturer createCapturer(String str, CameraEventsHandler cameraEventsHandler);

    String[] getDeviceNames();

    List getSupportedFormats(String str);

    boolean isBackFacing(String str);

    boolean isFrontFacing(String str);
}
