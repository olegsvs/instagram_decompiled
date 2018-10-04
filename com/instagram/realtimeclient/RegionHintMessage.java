package com.instagram.realtimeclient;

import java.nio.ByteBuffer;

public class RegionHintMessage {
    private static final int FIELD_MESSAGE_REGION = 1;
    private String mRegion;

    public RegionHintMessage(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int i = 0;
        while (wrap.hasRemaining()) {
            int i2 = wrap.get() & 255;
            int i3 = i2 >> 4;
            i = i3 == 0 ? TCompactProtocol.fromZigZag(TCompactProtocol.readVarint(wrap)) : i + i3;
            i2 &= 15;
            if (i2 != 0) {
                if (i == 1 && i2 == 8) {
                    this.mRegion = TCompactProtocol.getStringFromByteBuffer(wrap, TCompactProtocol.readVarint(wrap));
                    return;
                }
            } else {
                return;
            }
        }
    }

    public String getRegion() {
        return this.mRegion;
    }
}
