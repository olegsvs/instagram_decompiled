package org.webrtc;

import org.webrtc.EglBase.Context;

public class EglBaseCompat {
    public static EglBase createEglBase() {
        return createEglBase(null);
    }

    public static EglBase createEglBase(Context context) {
        return (EglBase14.isEGL14Supported() && (context == null || (context instanceof EglBase14.Context))) ? new EglBase14((EglBase14.Context) context, EglBase.CONFIG_PLAIN) : new EglBase10((EglBase10.Context) context, EglBase.CONFIG_PLAIN);
    }
}
