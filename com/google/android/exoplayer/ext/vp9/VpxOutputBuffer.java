package com.google.android.exoplayer.ext.vp9;

import X.AnonymousClass3uv;
import java.nio.ByteBuffer;

public final class VpxOutputBuffer extends AnonymousClass3uv {
    public int colorspace;
    public ByteBuffer data;
    public int height;
    public int mode;
    private final VpxDecoder owner;
    public int width;
    public ByteBuffer[] yuvPlanes;
    public int[] yuvStrides;

    public VpxOutputBuffer(VpxDecoder vpxDecoder) {
        this.owner = vpxDecoder;
    }

    public void initForRgbFrame(int i, int i2) {
        this.width = i;
        this.height = i2;
        int i3 = (i * i2) * 2;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.capacity() < i3) {
            this.data = ByteBuffer.allocateDirect(i3);
            this.yuvPlanes = null;
        }
        this.data.position(0);
        this.data.limit(i3);
    }

    public void initForYuvFrame(int i, int i2, int i3, int i4, int i5) {
        this.width = i;
        this.height = i2;
        this.colorspace = i5;
        int i6 = i3 * i2;
        i2 = ((i2 + 1) / 2) * i4;
        int i7 = (i2 * 2) + i6;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.capacity() < i7) {
            this.data = ByteBuffer.allocateDirect(i7);
        }
        this.data.limit(i7);
        if (this.yuvPlanes == null) {
            this.yuvPlanes = new ByteBuffer[3];
        }
        this.data.position(0);
        this.yuvPlanes[0] = this.data.slice();
        this.yuvPlanes[0].limit(i6);
        this.data.position(i6);
        this.yuvPlanes[1] = this.data.slice();
        this.yuvPlanes[1].limit(i2);
        this.data.position(i6 + i2);
        this.yuvPlanes[2] = this.data.slice();
        this.yuvPlanes[2].limit(i2);
        if (this.yuvStrides == null) {
            this.yuvStrides = new int[3];
        }
        int[] iArr = this.yuvStrides;
        iArr[0] = i3;
        iArr[1] = i4;
        iArr[2] = i4;
    }

    public final void release() {
        this.owner.releaseOutputBuffer(this);
    }
}
