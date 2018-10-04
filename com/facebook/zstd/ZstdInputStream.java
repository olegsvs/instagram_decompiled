package com.facebook.zstd;

import X.AnonymousClass0CF;
import com.facebook.common.dextricks.DexStore;
import com.facebook.jni.HybridData;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ZstdInputStream extends FilterInputStream {
    private int mBufferSize;
    private final HybridData mHybridData;
    private byte[] mInBuf;
    private byte[] mOutBuf;
    private boolean sourceEOF;

    private native boolean canWrite();

    private static native HybridData initHybrid(int i);

    private native int nativeRead(byte[] bArr, int i);

    private native void nativeWrite(byte[] bArr, int i);

    static {
        AnonymousClass0CF.m856E("zstddecoder");
    }

    public ZstdInputStream(InputStream inputStream) {
        this(inputStream, DexStore.LOAD_RESULT_DEX2OAT_QUICKEN_ATTEMPTED);
    }

    public ZstdInputStream(InputStream inputStream, int i) {
        super(inputStream);
        this.mHybridData = initHybrid(i);
        this.mBufferSize = i;
        this.mInBuf = new byte[i];
        this.mOutBuf = new byte[i];
        this.sourceEOF = false;
    }

    private void decodeMoreBytes() {
        int read = this.in.read(this.mInBuf);
        if (read == -1) {
            this.sourceEOF = true;
        } else {
            nativeWrite(this.mInBuf, read);
        }
    }

    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr) != 1) {
            return -1;
        }
        return bArr[0];
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            int i3 = i + i2;
            if (i3 >= 0 && bArr.length - i3 >= 0) {
                if (i2 == 0) {
                    return 0;
                }
                int i4 = 0;
                while (i4 < i2) {
                    if (canWrite()) {
                        decodeMoreBytes();
                    }
                    int nativeRead = nativeRead(this.mOutBuf, Math.min(this.mBufferSize, i2 - i4));
                    if (this.sourceEOF) {
                        if (nativeRead == 0) {
                            throw new IOException("Unexpected end of ZSTD stream");
                        } else if (nativeRead == -1) {
                            return i4 == 0 ? -1 : i4;
                        }
                    }
                    System.arraycopy(this.mOutBuf, 0, bArr, i + i4, nativeRead);
                    i4 += nativeRead;
                }
            }
        }
        throw new IndexOutOfBoundsException();
    }
}
