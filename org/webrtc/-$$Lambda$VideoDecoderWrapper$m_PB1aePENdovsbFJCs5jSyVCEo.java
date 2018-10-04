package org.webrtc;

import org.webrtc.VideoDecoder.Callback;

public final /* synthetic */ class -$$Lambda$VideoDecoderWrapper$m_PB1aePENdovsbFJCs5jSyVCEo implements Callback {
    private final /* synthetic */ long f$0;

    public /* synthetic */ -$$Lambda$VideoDecoderWrapper$m_PB1aePENdovsbFJCs5jSyVCEo(long j) {
        this.f$0 = j;
    }

    public final void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2) {
        VideoDecoderWrapper.nativeOnDecodedFrame(this.f$0, videoFrame, num, num2);
    }
}
