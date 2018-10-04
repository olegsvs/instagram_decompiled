package org.webrtc;

public class WebRtcClassLoader {
    public static Object getClassLoader() {
        return WebRtcClassLoader.class.getClassLoader();
    }
}
