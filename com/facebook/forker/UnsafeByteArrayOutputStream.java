package com.facebook.forker;

import java.io.ByteArrayOutputStream;

public final class UnsafeByteArrayOutputStream extends ByteArrayOutputStream {
    public UnsafeByteArrayOutputStream(int i) {
        super(i);
    }

    public byte[] getRawBuffer() {
        if (this.count == this.buf.length) {
            return this.buf;
        }
        return toByteArray();
    }
}
