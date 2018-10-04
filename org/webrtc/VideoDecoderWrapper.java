package org.webrtc;

import org.webrtc.VideoDecoder.Callback;

public class VideoDecoderWrapper {
    private static native void nativeOnDecodedFrame(long j, VideoFrame videoFrame, Integer num, Integer num2);

    public static Callback createDecoderCallback(long j) {
        return new -$$Lambda$VideoDecoderWrapper$m_PB1aePENdovsbFJCs5jSyVCEo(j);
    }
}
