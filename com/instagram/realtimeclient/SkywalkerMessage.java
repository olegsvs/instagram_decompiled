package com.instagram.realtimeclient;

import java.nio.ByteBuffer;

public class SkywalkerMessage {
    private static final int FIELD_MESSAGE_PAYLOAD = 2;
    private static final int FIELD_MESSAGE_TYPE = 1;
    private ByteBuffer mMessagePayload;
    private Integer mMessageType;

    public SkywalkerMessage(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int i = 0;
        while (wrap.hasRemaining()) {
            int i2 = wrap.get() & 255;
            int i3 = i2 >> 4;
            i = i3 == 0 ? TCompactProtocol.fromZigZag(TCompactProtocol.readVarint(wrap)) : i + i3;
            i2 &= 15;
            if (i2 != 0) {
                if (i == 1 && i2 == 5) {
                    this.mMessageType = Integer.valueOf(TCompactProtocol.fromZigZag(TCompactProtocol.readVarint(wrap)));
                } else if (i == 2 && i2 == 8) {
                    i2 = TCompactProtocol.readVarint(wrap);
                    this.mMessagePayload = ByteBuffer.wrap(bArr, wrap.position(), i2);
                    wrap.position(wrap.position() + i2);
                }
            } else {
                return;
            }
        }
    }

    public ByteBuffer getMessagePayload() {
        return this.mMessagePayload;
    }

    public Integer getMessageType() {
        return this.mMessageType;
    }

    public String getPayloadAsString() {
        return TCompactProtocol.getStringFromByteBuffer(this.mMessagePayload);
    }
}
