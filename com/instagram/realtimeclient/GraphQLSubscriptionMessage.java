package com.instagram.realtimeclient;

import java.nio.ByteBuffer;

public class GraphQLSubscriptionMessage {
    private static final int FIELD_MESSAGE_PAYLOAD = 2;
    private static final int FIELD_MESSAGE_TOPIC = 1;
    private ByteBuffer mMessagePayload;
    private ByteBuffer mMessageTopic;

    public GraphQLSubscriptionMessage(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int i = 0;
        while (wrap.hasRemaining()) {
            int i2 = wrap.get() & 255;
            int i3 = i2 >> 4;
            i = i3 == 0 ? TCompactProtocol.fromZigZag(TCompactProtocol.readVarint(wrap)) : i + i3;
            int i4 = i2 & 15;
            if (i4 != 0) {
                if (i == 1 && i4 == 8) {
                    i2 = TCompactProtocol.readVarint(wrap);
                    this.mMessageTopic = ByteBuffer.wrap(bArr, wrap.position(), i2);
                    wrap.position(wrap.position() + i2);
                } else if (i == 2 && i4 == 8) {
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

    public String getMessagePayloadAsString() {
        return TCompactProtocol.getStringFromByteBuffer(this.mMessagePayload);
    }

    public ByteBuffer getMessageTopic() {
        return this.mMessageTopic;
    }

    public String getMessageTopicAsString() {
        return TCompactProtocol.getStringFromByteBuffer(this.mMessageTopic);
    }
}
