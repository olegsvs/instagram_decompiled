package com.instagram.realtimeclient;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class TCompactProtocol {
    public static final byte TYPE_BINARY = (byte) 8;
    public static final byte TYPE_I32 = (byte) 5;
    public static final byte TYPE_STOP = (byte) 0;

    public static int fromZigZag(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    public static String getStringFromByteBuffer(ByteBuffer byteBuffer) {
        return byteBuffer == null ? null : getStringFromByteBuffer(byteBuffer, byteBuffer.remaining());
    }

    public static String getStringFromByteBuffer(ByteBuffer byteBuffer, int i) {
        if (byteBuffer == null) {
            return null;
        }
        return new String(byteBuffer.array(), byteBuffer.position(), i, Charset.forName("UTF-8"));
    }

    public static int readVarint(ByteBuffer byteBuffer) {
        int i = 0;
        int i2 = 0;
        while (byteBuffer.hasRemaining()) {
            int i3 = byteBuffer.get() & 255;
            i |= (i3 & 127) << i2;
            if ((i3 >> 7) == 0) {
                break;
            }
            i2 += 7;
        }
        return i;
    }
}
