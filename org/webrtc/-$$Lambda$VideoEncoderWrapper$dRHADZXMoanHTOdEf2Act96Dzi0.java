package org.webrtc;

import org.webrtc.VideoEncoder.Callback;
import org.webrtc.VideoEncoder.CodecSpecificInfo;

public final /* synthetic */ class -$$Lambda$VideoEncoderWrapper$dRHADZXMoanHTOdEf2Act96Dzi0 implements Callback {
    private final /* synthetic */ long f$0;

    public /* synthetic */ -$$Lambda$VideoEncoderWrapper$dRHADZXMoanHTOdEf2Act96Dzi0(long j) {
        this.f$0 = j;
    }

    public final void onEncodedFrame(EncodedImage encodedImage, CodecSpecificInfo codecSpecificInfo) {
        VideoEncoderWrapper.nativeOnEncodedFrame(this.f$0, encodedImage.buffer, encodedImage.encodedWidth, encodedImage.encodedHeight, encodedImage.captureTimeNs, encodedImage.frameType.getNative(), encodedImage.rotation, encodedImage.completeFrame, encodedImage.qp);
    }
}
