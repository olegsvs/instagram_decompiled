package org.webrtc;

import android.opengl.GLES20;

public class GlTextureFrameBuffer {
    private int frameBufferId;
    private int height;
    private final int pixelFormat;
    private int textureId;
    private int width;

    public GlTextureFrameBuffer(int i) {
        switch (i) {
            case 6407:
            case 6408:
            case 6409:
                this.pixelFormat = i;
                this.width = 0;
                this.height = 0;
                return;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid pixel format: ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public int getFrameBufferId() {
        return this.frameBufferId;
    }

    public int getHeight() {
        return this.height;
    }

    public int getTextureId() {
        return this.textureId;
    }

    public int getWidth() {
        return this.width;
    }

    public void release() {
        GLES20.glDeleteTextures(1, new int[]{this.textureId}, 0);
        this.textureId = 0;
        GLES20.glDeleteFramebuffers(1, new int[]{this.frameBufferId}, 0);
        this.frameBufferId = 0;
        this.width = 0;
        this.height = 0;
    }

    public void setSize(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        StringBuilder stringBuilder;
        if (i <= 0 || i2 <= 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid size: ");
            stringBuilder.append(i);
            stringBuilder.append("x");
            stringBuilder.append(i4);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i != this.width || i4 != this.height) {
            this.width = i;
            this.height = i4;
            if (this.textureId == 0) {
                this.textureId = GlUtil.generateTexture(3553);
            }
            if (this.frameBufferId == 0) {
                int[] iArr = new int[1];
                GLES20.glGenFramebuffers(1, iArr, 0);
                this.frameBufferId = iArr[0];
            }
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.textureId);
            int i5 = this.pixelFormat;
            GLES20.glTexImage2D(3553, 0, i5, i3, i4, 0, i5, 5121, null);
            GLES20.glBindTexture(3553, 0);
            GlUtil.checkNoGLES2Error("GlTextureFrameBuffer setSize");
            GLES20.glBindFramebuffer(36160, this.frameBufferId);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.textureId, 0);
            int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
            if (glCheckFramebufferStatus == 36053) {
                GLES20.glBindFramebuffer(36160, 0);
                return;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Framebuffer not complete, status: ");
            stringBuilder.append(glCheckFramebufferStatus);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
