package org.webrtc;

import org.webrtc.EglBase.Context;

public class HardwareVideoDecoderFactoryCompat extends HardwareVideoDecoderFactory {
    public HardwareVideoDecoderFactoryCompat(Context context) {
        super(context, false);
    }
}
