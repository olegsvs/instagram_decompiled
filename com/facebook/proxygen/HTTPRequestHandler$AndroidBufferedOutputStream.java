package com.facebook.proxygen;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class HTTPRequestHandler$AndroidBufferedOutputStream extends BufferedOutputStream {
    private boolean mClosed;

    public HTTPRequestHandler$AndroidBufferedOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    private void checkNotClosed() {
        if (this.mClosed) {
            throw new IOException("stream already closed");
        }
    }

    public void close() {
        if (!this.mClosed) {
            try {
                super.close();
            } finally {
                this.mClosed = true;
            }
        }
    }

    public void flush() {
        checkNotClosed();
        super.flush();
    }

    public void write(int i) {
        checkNotClosed();
        super.write(i);
    }

    public void write(byte[] bArr, int i, int i2) {
        checkNotClosed();
        super.write(bArr, i, i2);
    }
}
