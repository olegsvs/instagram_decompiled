package com.fasterxml.jackson.core.io;

import java.io.InputStream;

public final class MergedStream extends InputStream {
    public byte[] _buffer;
    public final IOContext _context;
    public final int _end;
    public final InputStream _in;
    public int _ptr;

    public MergedStream(IOContext iOContext, InputStream inputStream, byte[] bArr, int i, int i2) {
        this._context = iOContext;
        this._in = inputStream;
        this._buffer = bArr;
        this._ptr = i;
        this._end = i2;
    }

    public final int available() {
        if (this._buffer != null) {
            return this._end - this._ptr;
        }
        return this._in.available();
    }

    public final void close() {
        freeMergedBuffer();
        this._in.close();
    }

    private void freeMergedBuffer() {
        byte[] bArr = this._buffer;
        if (bArr != null) {
            this._buffer = null;
            IOContext iOContext = this._context;
            if (iOContext != null) {
                iOContext.releaseReadIOBuffer(bArr);
            }
        }
    }

    public final void mark(int i) {
        if (this._buffer == null) {
            this._in.mark(i);
        }
    }

    public final boolean markSupported() {
        return this._buffer == null && this._in.markSupported();
    }

    public final int read() {
        byte[] bArr = this._buffer;
        if (bArr == null) {
            return this._in.read();
        }
        int i = this._ptr;
        this._ptr = i + 1;
        int i2 = bArr[i] & 255;
        if (this._ptr >= this._end) {
            freeMergedBuffer();
        }
        return i2;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (this._buffer == null) {
            return this._in.read(bArr, i, i2);
        }
        int i3 = this._end - this._ptr;
        if (i2 > i3) {
            i2 = i3;
        }
        System.arraycopy(this._buffer, this._ptr, bArr, i, i2);
        i3 = this._ptr + i2;
        this._ptr = i3;
        if (i3 >= this._end) {
            freeMergedBuffer();
        }
        return i2;
    }

    public final void reset() {
        if (this._buffer == null) {
            this._in.reset();
        }
    }

    public final long skip(long j) {
        long j2;
        if (this._buffer != null) {
            int i = this._end;
            int i2 = this._ptr;
            long j3 = (long) (i - i2);
            if (j3 > j) {
                this._ptr = i2 + ((int) j);
                return j;
            }
            freeMergedBuffer();
            j2 = j3 + 0;
            j -= j3;
        } else {
            j2 = 0;
        }
        if (j > 0) {
            j2 += this._in.skip(j);
        }
        return j2;
    }
}
