package com.facebook.proxygen.utils;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.HttpEntityEnclosingRequest;

public class RequestDefragmentingOutputStream extends OutputStream {
    private static final int STREAMING_BUFFER_SIZE = 8096;
    private final byte[] mBuffer;
    private boolean mClosed;
    private OutputStream mFallbackOutputStream;
    public final HandlerInterface mHandlerInterface;
    private int mPosition;
    private final HttpEntityEnclosingRequest mRequest;
    private final int mStreamingBufferSize;

    public interface HandlerInterface {
        boolean sendBody(byte[] bArr, int i, int i2);

        boolean sendEOM();

        boolean sendHeaders(HttpEntityEnclosingRequest httpEntityEnclosingRequest);

        boolean sendRequestWithBodyAndEom(HttpEntityEnclosingRequest httpEntityEnclosingRequest, byte[] bArr, int i, int i2);
    }

    public class FallbackOutputStream extends OutputStream {
        public void write(int i) {
            if (!RequestDefragmentingOutputStream.this.mHandlerInterface.sendBody(new byte[]{(byte) i}, 0, 1)) {
                throw new IOException();
            }
        }

        public void write(byte[] bArr, int i, int i2) {
            if (!RequestDefragmentingOutputStream.this.mHandlerInterface.sendBody(bArr, i, i2)) {
                throw new IOException();
            }
        }
    }

    public RequestDefragmentingOutputStream(HandlerInterface handlerInterface, HttpEntityEnclosingRequest httpEntityEnclosingRequest, byte[] bArr) {
        this(handlerInterface, httpEntityEnclosingRequest, bArr, STREAMING_BUFFER_SIZE);
    }

    public RequestDefragmentingOutputStream(HandlerInterface handlerInterface, HttpEntityEnclosingRequest httpEntityEnclosingRequest, byte[] bArr, int i) {
        this.mHandlerInterface = handlerInterface;
        this.mRequest = httpEntityEnclosingRequest;
        this.mBuffer = bArr;
        this.mStreamingBufferSize = i;
    }

    private boolean canBufferMoreBytes(int i) {
        return i <= this.mBuffer.length - this.mPosition;
    }

    private void checkStreamIsNotClosed() {
        if (this.mClosed) {
            throw new IOException("writeEomIfNecessary was already called on the stream");
        }
    }

    private void fallbackToStreaming(byte[] bArr, int i, int i2) {
        if (this.mHandlerInterface.sendHeaders(this.mRequest)) {
            OutputStream bufferedOutputStream = new BufferedOutputStream(new FallbackOutputStream(), this.mStreamingBufferSize);
            this.mFallbackOutputStream = bufferedOutputStream;
            bufferedOutputStream.write(this.mBuffer, 0, this.mPosition);
            this.mFallbackOutputStream.write(bArr, i, i2);
            return;
        }
        throw new IOException();
    }

    public synchronized void write(int i) {
        checkStreamIsNotClosed();
        if (this.mFallbackOutputStream != null) {
            this.mFallbackOutputStream.write(i);
        } else if (canBufferMoreBytes(1)) {
            this.mBuffer[this.mPosition] = (byte) i;
            this.mPosition++;
        } else {
            fallbackToStreaming(new byte[]{(byte) i}, 0, 1);
        }
    }

    public synchronized void write(byte[] bArr) {
        checkStreamIsNotClosed();
        write(bArr, 0, bArr.length);
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        checkStreamIsNotClosed();
        if (this.mFallbackOutputStream != null) {
            this.mFallbackOutputStream.write(bArr, i, i2);
        } else if (canBufferMoreBytes(i2)) {
            System.arraycopy(bArr, i, this.mBuffer, this.mPosition, i2);
            this.mPosition += i2;
        } else {
            fallbackToStreaming(bArr, i, i2);
        }
    }

    public synchronized void writeEomIfNecessary() {
        checkStreamIsNotClosed();
        this.mClosed = true;
        IOException iOException;
        if (this.mFallbackOutputStream != null) {
            this.mFallbackOutputStream.flush();
            if (!this.mHandlerInterface.sendEOM()) {
                iOException = new IOException();
                throw iOException;
            }
        } else if (!this.mHandlerInterface.sendRequestWithBodyAndEom(this.mRequest, this.mBuffer, 0, this.mPosition)) {
            iOException = new IOException();
            throw iOException;
        }
    }
}
