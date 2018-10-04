package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public abstract class BaseReader extends Reader {
    public byte[] _buffer;
    public final IOContext _context;
    public InputStream _in;
    public int _length;
    public int _ptr;
    public char[] _tmpBuf = null;

    public BaseReader(IOContext iOContext, InputStream inputStream, byte[] bArr, int i, int i2) {
        this._context = iOContext;
        this._in = inputStream;
        this._buffer = bArr;
        this._ptr = i;
        this._length = i2;
    }

    public void close() {
        InputStream inputStream = this._in;
        if (inputStream != null) {
            this._in = null;
            freeBuffers();
            inputStream.close();
        }
    }

    public final void freeBuffers() {
        byte[] bArr = this._buffer;
        if (bArr != null) {
            this._buffer = null;
            this._context.releaseReadIOBuffer(bArr);
        }
    }

    public int read() {
        if (this._tmpBuf == null) {
            this._tmpBuf = new char[1];
        }
        if (read(this._tmpBuf, 0, 1) < 1) {
            return -1;
        }
        return this._tmpBuf[0];
    }

    public static final void reportBounds(char[] cArr, int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("read(buf,");
        stringBuilder.append(i);
        stringBuilder.append(",");
        stringBuilder.append(i2);
        stringBuilder.append("), cbuf[");
        stringBuilder.append(cArr.length);
        stringBuilder.append("]");
        throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
    }

    public static final void reportStrangeStream() {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }
}
