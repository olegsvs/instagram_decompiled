package com.fasterxml.jackson.core.util;

import com.facebook.common.dextricks.StartupQEsConfig;
import com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

public final class ByteArrayBuilder extends OutputStream {
    private static final byte[] NO_BYTES = new byte[0];
    private final BufferRecycler _bufferRecycler;
    private byte[] _currBlock;
    private int _currBlockPtr;
    private final LinkedList _pastBlocks;
    private int _pastLen;

    public final void close() {
    }

    public final void flush() {
    }

    public ByteArrayBuilder() {
        this(null);
    }

    public ByteArrayBuilder(int i) {
        this(null, i);
    }

    public ByteArrayBuilder(BufferRecycler bufferRecycler) {
        this(bufferRecycler, StartupQEsConfig.DEFAULT_IDLE_MAX_INTERVAL_MS);
    }

    public ByteArrayBuilder(BufferRecycler bufferRecycler, int i) {
        this._pastBlocks = new LinkedList();
        this._bufferRecycler = bufferRecycler;
        if (bufferRecycler == null) {
            this._currBlock = new byte[i];
        } else {
            this._currBlock = bufferRecycler.allocByteBuffer(ByteBufferType.WRITE_CONCAT_BUFFER);
        }
    }

    private void _allocMore() {
        int length = this._pastLen + this._currBlock.length;
        this._pastLen = length;
        int max = Math.max(length >> 1, JsonMappingException.MAX_REFS_TO_LIST);
        if (max > 262144) {
            max = 262144;
        }
        this._pastBlocks.add(this._currBlock);
        this._currBlock = new byte[max];
        this._currBlockPtr = 0;
    }

    public final void append(int i) {
        if (this._currBlockPtr >= this._currBlock.length) {
            _allocMore();
        }
        byte[] bArr = this._currBlock;
        int i2 = this._currBlockPtr;
        this._currBlockPtr = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public final void appendThreeBytes(int i) {
        int i2 = this._currBlockPtr;
        int i3 = i2 + 2;
        byte[] bArr = this._currBlock;
        if (i3 < bArr.length) {
            this._currBlockPtr = i2 + 1;
            bArr[i2] = (byte) (i >> 16);
            i3 = this._currBlockPtr;
            this._currBlockPtr = i3 + 1;
            bArr[i3] = (byte) (i >> 8);
            i3 = this._currBlockPtr;
            this._currBlockPtr = i3 + 1;
            bArr[i3] = (byte) i;
            return;
        }
        append(i >> 16);
        append(i >> 8);
        append(i);
    }

    public final void appendTwoBytes(int i) {
        int i2 = this._currBlockPtr;
        int i3 = i2 + 1;
        byte[] bArr = this._currBlock;
        if (i3 < bArr.length) {
            this._currBlockPtr = i2 + 1;
            bArr[i2] = (byte) (i >> 8);
            i3 = this._currBlockPtr;
            this._currBlockPtr = i3 + 1;
            bArr[i3] = (byte) i;
            return;
        }
        append(i >> 8);
        append(i);
    }

    public final byte[] completeAndCoalesce(int i) {
        this._currBlockPtr = i;
        return toByteArray();
    }

    public final byte[] finishCurrentSegment() {
        _allocMore();
        return this._currBlock;
    }

    public final byte[] getCurrentSegment() {
        return this._currBlock;
    }

    public final int getCurrentSegmentLength() {
        return this._currBlockPtr;
    }

    public final void release() {
        reset();
        BufferRecycler bufferRecycler = this._bufferRecycler;
        if (bufferRecycler != null && this._currBlock != null) {
            bufferRecycler.releaseByteBuffer(ByteBufferType.WRITE_CONCAT_BUFFER, this._currBlock);
            this._currBlock = null;
        }
    }

    public final void reset() {
        this._pastLen = 0;
        this._currBlockPtr = 0;
        if (!this._pastBlocks.isEmpty()) {
            this._pastBlocks.clear();
        }
    }

    public final byte[] resetAndGetFirstSegment() {
        reset();
        return this._currBlock;
    }

    public final void setCurrentSegmentLength(int i) {
        this._currBlockPtr = i;
    }

    public final byte[] toByteArray() {
        int i = this._pastLen + this._currBlockPtr;
        if (i == 0) {
            return NO_BYTES;
        }
        Object obj = new byte[i];
        Iterator it = this._pastBlocks.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            byte[] bArr = (byte[]) it.next();
            int length = bArr.length;
            System.arraycopy(bArr, 0, obj, i2, length);
            i2 += length;
        }
        System.arraycopy(this._currBlock, 0, obj, i2, this._currBlockPtr);
        i2 += this._currBlockPtr;
        if (i2 == i) {
            if (!this._pastBlocks.isEmpty()) {
                reset();
            }
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Internal error: total len assumed to be ");
        stringBuilder.append(i);
        stringBuilder.append(", copied ");
        stringBuilder.append(i2);
        stringBuilder.append(" bytes");
        throw new RuntimeException(stringBuilder.toString());
    }

    public final void write(int i) {
        append(i);
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        while (true) {
            int min = Math.min(this._currBlock.length - this._currBlockPtr, i2);
            if (min > 0) {
                System.arraycopy(bArr, i, this._currBlock, this._currBlockPtr, min);
                i += min;
                this._currBlockPtr += min;
                i2 -= min;
            }
            if (i2 > 0) {
                _allocMore();
            } else {
                return;
            }
        }
    }
}
