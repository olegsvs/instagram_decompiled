package org.webrtc;

import android.graphics.Matrix;
import android.graphics.Point;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.webrtc.RendererCommon.GlDrawer;
import org.webrtc.VideoFrame.I420Buffer;
import org.webrtc.VideoFrame.TextureBuffer;
import org.webrtc.VideoFrame.TextureBuffer.Type;

public class VideoFrameDrawer {
    public static final float[] srcPoints = new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};
    private final float[] dstPoints = new float[6];
    private VideoFrame lastI420Frame;
    private int renderHeight;
    private final Matrix renderMatrix = new Matrix();
    private final Point renderSize = new Point();
    private int renderWidth;
    private final YuvUploader yuvUploader = new YuvUploader();

    /* renamed from: org.webrtc.VideoFrameDrawer$1 */
    public /* synthetic */ class C02401 {
        public static final /* synthetic */ int[] $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type = new int[Type.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = org.webrtc.VideoFrame.TextureBuffer.Type.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type = r0;
            r2 = $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0 = org.webrtc.VideoFrame.TextureBuffer.Type.OES;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r2 = $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0 = org.webrtc.VideoFrame.TextureBuffer.Type.RGB;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r0 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.VideoFrameDrawer.1.<clinit>():void");
        }
    }

    public class YuvUploader {
        private ByteBuffer copyBuffer;
        private int[] yuvTextures;

        public int[] getYuvTextures() {
            return this.yuvTextures;
        }

        public void release() {
            this.copyBuffer = null;
            int[] iArr = this.yuvTextures;
            if (iArr != null) {
                GLES20.glDeleteTextures(3, iArr, 0);
                this.yuvTextures = null;
            }
        }

        public int[] uploadFromBuffer(I420Buffer i420Buffer) {
            return uploadYuvData(i420Buffer.getWidth(), i420Buffer.getHeight(), new int[]{i420Buffer.getStrideY(), i420Buffer.getStrideU(), i420Buffer.getStrideV()}, new ByteBuffer[]{i420Buffer.getDataY(), i420Buffer.getDataU(), i420Buffer.getDataV()});
        }

        public int[] uploadYuvData(int i, int i2, int[] iArr, ByteBuffer[] byteBufferArr) {
            int i3;
            int[] iArr2 = new int[3];
            int i4 = 0;
            iArr2[0] = i;
            int i5 = i / 2;
            iArr2[1] = i5;
            iArr2[2] = i5;
            r2 = new int[3];
            int i6 = i2 / 2;
            r2[1] = i6;
            r2[2] = i6;
            int i7 = 0;
            for (i3 = 0; i3 < 3; i3++) {
                if (iArr[i3] > iArr2[i3]) {
                    i7 = Math.max(i7, iArr2[i3] * r2[i3]);
                }
            }
            if (i7 > 0) {
                ByteBuffer byteBuffer = this.copyBuffer;
                if (byteBuffer == null || byteBuffer.capacity() < i7) {
                    this.copyBuffer = ByteBuffer.allocateDirect(i7);
                }
            }
            if (this.yuvTextures == null) {
                this.yuvTextures = new int[3];
                for (i3 = 0; i3 < 3; i3++) {
                    this.yuvTextures[i3] = GlUtil.generateTexture(3553);
                }
            }
            while (i4 < 3) {
                Buffer buffer;
                GLES20.glActiveTexture(33984 + i4);
                GLES20.glBindTexture(3553, this.yuvTextures[i4]);
                if (iArr[i4] == iArr2[i4]) {
                    buffer = byteBufferArr[i4];
                } else {
                    YuvHelper.copyPlane(byteBufferArr[i4], iArr[i4], this.copyBuffer, iArr2[i4], iArr2[i4], r2[i4]);
                    buffer = this.copyBuffer;
                }
                GLES20.glTexImage2D(3553, 0, 6409, iArr2[i4], r2[i4], 0, 6409, 5121, buffer);
                i4++;
            }
            return this.yuvTextures;
        }
    }

    private void calculateTransformedRenderSize(int i, int i2, Matrix matrix) {
        if (matrix == null) {
            this.renderWidth = i;
            this.renderHeight = i2;
            return;
        }
        matrix.mapPoints(this.dstPoints, srcPoints);
        for (int i3 = 0; i3 < 3; i3++) {
            float[] fArr = this.dstPoints;
            int i4 = i3 * 2;
            fArr[i4] = fArr[i4] * ((float) i);
            i4++;
            fArr[i4] = fArr[i4] * ((float) i2);
        }
        float[] fArr2 = this.dstPoints;
        this.renderWidth = distance(fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
        fArr2 = this.dstPoints;
        this.renderHeight = distance(fArr2[0], fArr2[1], fArr2[4], fArr2[5]);
    }

    private static int distance(float f, float f2, float f3, float f4) {
        return (int) Math.round(Math.hypot((double) (f3 - f), (double) (f4 - f2)));
    }

    public void drawFrame(VideoFrame videoFrame, GlDrawer glDrawer) {
        drawFrame(videoFrame, glDrawer, null);
    }

    public void drawFrame(VideoFrame videoFrame, GlDrawer glDrawer, Matrix matrix) {
        drawFrame(videoFrame, glDrawer, matrix, 0, 0, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
    }

    public void drawFrame(VideoFrame videoFrame, GlDrawer glDrawer, Matrix matrix, int i, int i2, int i3, int i4) {
        calculateTransformedRenderSize(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), matrix);
        boolean z = videoFrame.getBuffer() instanceof TextureBuffer;
        this.renderMatrix.reset();
        this.renderMatrix.preTranslate(0.5f, 0.5f);
        if (!z) {
            this.renderMatrix.preScale(1.0f, -1.0f);
        }
        this.renderMatrix.preRotate((float) videoFrame.getRotation());
        this.renderMatrix.preTranslate(-0.5f, -0.5f);
        if (matrix != null) {
            this.renderMatrix.preConcat(matrix);
        }
        GlDrawer glDrawer2 = glDrawer;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        if (z) {
            this.lastI420Frame = null;
            drawTexture(glDrawer2, (TextureBuffer) videoFrame.getBuffer(), this.renderMatrix, this.renderWidth, this.renderHeight, i5, i6, i7, i8);
            return;
        }
        if (videoFrame != this.lastI420Frame) {
            this.lastI420Frame = videoFrame;
            VideoFrame.Buffer toI420 = videoFrame.getBuffer().toI420();
            this.yuvUploader.uploadFromBuffer(toI420);
            toI420.release();
        }
        glDrawer2.drawYuv(this.yuvUploader.getYuvTextures(), RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.renderMatrix), this.renderWidth, this.renderHeight, i5, i6, i7, i8);
    }

    public static void drawTexture(GlDrawer glDrawer, TextureBuffer textureBuffer, Matrix matrix, int i, int i2, int i3, int i4, int i5, int i6) {
        Matrix matrix2 = new Matrix(textureBuffer.getTransformMatrix());
        matrix2.preConcat(matrix);
        matrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2);
        switch (textureBuffer.getType().ordinal()) {
            case 0:
                glDrawer.drawOes(textureBuffer.getTextureId(), matrix, i, i2, i3, i4, i5, i6);
                return;
            case 1:
                glDrawer.drawRgb(textureBuffer.getTextureId(), matrix, i, i2, i3, i4, i5, i6);
                return;
            default:
                throw new RuntimeException("Unknown texture type.");
        }
    }

    public void release() {
        this.yuvUploader.release();
        this.lastI420Frame = null;
    }
}
