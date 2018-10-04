package com.facebook.xzdecoder;

import X.AnonymousClass0CF;
import java.io.IOException;
import java.io.InputStream;

public class XzInputStream extends InputStream {
    private int clientOutPos;
    private byte[] inBuf = new byte[32768];
    private InputStream inFile;
    private int inPos;
    private int inSize;
    private byte[] outBuf = new byte[32768];
    private int outPos;
    private long state = initializeState();

    private static native long decompressStream(long j, byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4);

    private static native void end(long j);

    private static native void initializeLibrary();

    private static native long initializeState();

    static {
        AnonymousClass0CF.m856E("fb_xzdecoder");
        initializeLibrary();
    }

    public XzInputStream(InputStream inputStream) {
        this.inFile = inputStream;
    }

    public final void close() {
        this.inFile.close();
        long j = this.state;
        if (j != 0) {
            end(j);
            this.state = 0;
        }
    }

    private int copyBufferedData(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, this.outPos - this.clientOutPos);
        System.arraycopy(this.outBuf, this.clientOutPos, bArr, i, min);
        this.clientOutPos += min;
        return min;
    }

    private void decodeMoreBytes() {
        long j = this.state;
        byte[] bArr = this.inBuf;
        int i = this.inPos;
        int i2 = this.inSize;
        byte[] bArr2 = this.outBuf;
        long decompressStream = decompressStream(j, bArr, i, i2, bArr2, 0, bArr2.length);
        this.inPos = (int) (decompressStream >>> 32);
        this.outPos = (int) decompressStream;
        this.clientOutPos = 0;
    }

    public final int read() {
        if (this.state != 0) {
            if (this.clientOutPos == this.outPos) {
                if (this.inPos == this.inSize && !readMoreInput()) {
                    return -1;
                }
                decodeMoreBytes();
            }
            byte[] bArr = this.outBuf;
            int i = this.clientOutPos;
            this.clientOutPos = i + 1;
            return bArr[i];
        }
        throw new IOException("Stream closed");
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = 0;
        if (i2 < 0 || i < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException(String.format("buf.length = %d, off = %d, len = %d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        } else if (this.state != 0) {
            int i4 = i2;
            while (i3 < i2) {
                if (this.clientOutPos < this.outPos) {
                    int copyBufferedData = copyBufferedData(bArr, i, i4);
                    i4 -= copyBufferedData;
                    i += copyBufferedData;
                    i3 += copyBufferedData;
                } else if (this.inPos == this.inSize && !readMoreInput()) {
                    return i3 == 0 ? -1 : i3;
                } else {
                    decodeMoreBytes();
                }
            }
            return i3;
        } else {
            throw new IOException("Stream closed");
        }
    }

    private boolean readMoreInput() {
        boolean z = false;
        this.inSize = 0;
        this.inPos = 0;
        while (true) {
            int i = this.inSize;
            if (i >= 32768) {
                return true;
            }
            InputStream inputStream = this.inFile;
            byte[] bArr = this.inBuf;
            int read = inputStream.read(bArr, i, bArr.length - i);
            if (read == -1) {
                break;
            }
            this.inSize += read;
        }
        if (this.inSize > 0) {
            z = true;
        }
        return z;
    }
}
