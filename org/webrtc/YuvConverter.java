package org.webrtc;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.webrtc.ThreadUtils.ThreadChecker;
import org.webrtc.VideoFrame.I420Buffer;
import org.webrtc.VideoFrame.TextureBuffer;
import org.webrtc.VideoFrame.TextureBuffer.Type;

public class YuvConverter {
    private static final FloatBuffer DEVICE_RECTANGLE = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final String OES_FRAGMENT_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES tex;\nuniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 1.5 * xUnit).rgb);\n}\n";
    private static final String RGB_FRAGMENT_SHADER = "precision mediump float;\nvarying vec2 interp_tc;\n\nuniform sampler2D tex;\nuniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 1.5 * xUnit).rgb);\n}\n";
    private static final FloatBuffer TEXTURE_RECTANGLE = GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    private static final String VERTEX_SHADER = "varying vec2 interp_tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\n\nuniform mat4 texMatrix;\n\nvoid main() {\n    gl_Position = in_pos;\n    interp_tc = (texMatrix * in_tc).xy;\n}\n";
    private int coeffsLoc;
    private boolean released = false;
    private GlShader shader;
    private Type shaderTextureType;
    private int texMatrixLoc;
    private final GlTextureFrameBuffer textureFrameBuffer = new GlTextureFrameBuffer(6408);
    private final ThreadChecker threadChecker = new ThreadChecker();
    private int xUnitLoc;

    /* renamed from: org.webrtc.YuvConverter$1 */
    public /* synthetic */ class C02411 {
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
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.YuvConverter.1.<clinit>():void");
        }
    }

    public YuvConverter() {
        this.threadChecker.detachThread();
    }

    public I420Buffer convert(TextureBuffer textureBuffer) {
        int width = textureBuffer.getWidth();
        int height = textureBuffer.getHeight();
        int i = ((width + 7) / 8) * 8;
        int i2 = (height + 1) / 2;
        ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(((height + i2) + 1) * i);
        convert(nativeAllocateByteBuffer, width, height, i, textureBuffer.getTextureId(), RendererCommon.convertMatrixFromAndroidGraphicsMatrix(textureBuffer.getTransformMatrix()), textureBuffer.getType());
        int i3 = (i * height) + 0;
        int i4 = (i / 2) + i3;
        nativeAllocateByteBuffer.position(0);
        nativeAllocateByteBuffer.limit(i3);
        ByteBuffer slice = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i3);
        i2 *= i;
        nativeAllocateByteBuffer.limit(i3 + i2);
        ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i4);
        nativeAllocateByteBuffer.limit(i4 + i2);
        return JavaI420Buffer.wrap(width, height, slice, i, slice2, i, nativeAllocateByteBuffer.slice(), i, new -$$Lambda$YuvConverter$7X4NRtBwZ8S7c3AW7UqovfxQVrk(nativeAllocateByteBuffer));
    }

    public void convert(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, float[] fArr) {
        convert(byteBuffer, i, i2, i3, i4, fArr, Type.OES);
    }

    private void convert(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, float[] fArr, Type type) {
        this.threadChecker.checkIsOnValidThread();
        if (this.released) {
            throw new IllegalStateException("YuvConverter.convert called on released object");
        }
        Type type2 = type;
        if (type2 != r12.shaderTextureType) {
            initShader(type2);
        }
        r12.shader.useProgram();
        int i5 = i3;
        if (i3 % 8 == 0) {
            int i6 = i;
            if (i5 >= i6) {
                int i7 = (i + 3) / 4;
                int i8 = (i + 7) / 8;
                int i9 = i2;
                int i10 = (i2 + 1) / 2;
                int i11 = i2 + i10;
                if (byteBuffer.capacity() >= i3 * i11) {
                    float[] multiplyMatrices = RendererCommon.multiplyMatrices(fArr, RendererCommon.verticalFlipMatrix());
                    int i12 = i3 / 4;
                    r12.textureFrameBuffer.setSize(i12, i11);
                    GLES20.glBindFramebuffer(36160, r12.textureFrameBuffer.getFrameBufferId());
                    GlUtil.checkNoGLES2Error("glBindFramebuffer");
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(type2.getGlTarget(), i4);
                    GLES20.glUniformMatrix4fv(r12.texMatrixLoc, 1, false, multiplyMatrices, 0);
                    GLES20.glViewport(0, 0, i7, i9);
                    float f = (float) i6;
                    GLES20.glUniform2f(r12.xUnitLoc, multiplyMatrices[0] / f, multiplyMatrices[1] / f);
                    GLES20.glUniform4f(r12.coeffsLoc, 0.299f, 0.587f, 0.114f, 0.0f);
                    GLES20.glDrawArrays(5, 0, 4);
                    GLES20.glViewport(0, i9, i8, i10);
                    GLES20.glUniform2f(r12.xUnitLoc, (multiplyMatrices[0] * 2.0f) / f, (multiplyMatrices[1] * 2.0f) / f);
                    GLES20.glUniform4f(r12.coeffsLoc, -0.169f, -0.331f, 0.499f, 0.5f);
                    GLES20.glDrawArrays(5, 0, 4);
                    GLES20.glViewport(i3 / 8, i9, i8, i10);
                    GLES20.glUniform4f(r12.coeffsLoc, 0.499f, -0.418f, -0.0813f, 0.5f);
                    GLES20.glDrawArrays(5, 0, 4);
                    GLES20.glReadPixels(0, 0, i12, i11, 6408, 5121, byteBuffer);
                    GlUtil.checkNoGLES2Error("YuvConverter.convert");
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glBindTexture(3553, 0);
                    GLES20.glBindTexture(type2.getGlTarget(), 0);
                    return;
                }
                throw new IllegalArgumentException("YuvConverter.convert called with too small buffer");
            }
            throw new IllegalArgumentException("Invalid stride, must >= width");
        }
        throw new IllegalArgumentException("Invalid stride, must be a multiple of 8");
    }

    private void initShader(Type type) {
        String str;
        GlShader glShader = this.shader;
        if (glShader != null) {
            glShader.release();
        }
        switch (type.ordinal()) {
            case 0:
                str = OES_FRAGMENT_SHADER;
                break;
            case 1:
                str = RGB_FRAGMENT_SHADER;
                break;
            default:
                throw new IllegalArgumentException("Unsupported texture type.");
        }
        this.shaderTextureType = type;
        GlShader glShader2 = new GlShader(VERTEX_SHADER, str);
        this.shader = glShader2;
        glShader2.useProgram();
        this.texMatrixLoc = this.shader.getUniformLocation("texMatrix");
        this.xUnitLoc = this.shader.getUniformLocation("xUnit");
        this.coeffsLoc = this.shader.getUniformLocation("coeffs");
        GLES20.glUniform1i(this.shader.getUniformLocation("tex"), 0);
        GlUtil.checkNoGLES2Error("Initialize fragment shader uniform values.");
        this.shader.setVertexAttribArray("in_pos", 2, DEVICE_RECTANGLE);
        this.shader.setVertexAttribArray("in_tc", 2, TEXTURE_RECTANGLE);
    }

    public void release() {
        this.threadChecker.checkIsOnValidThread();
        this.released = true;
        GlShader glShader = this.shader;
        if (glShader != null) {
            glShader.release();
        }
        this.textureFrameBuffer.release();
    }
}
