package org.webrtc;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import javax.microedition.khronos.egl.EGLContext;

public interface EglBase {
    public static final int[] CONFIG_PIXEL_BUFFER = new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12339, 1, 12344};
    public static final int[] CONFIG_PIXEL_RGBA_BUFFER = new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12339, 1, 12344};
    public static final int[] CONFIG_PLAIN = new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12344};
    public static final int[] CONFIG_RECORDABLE = new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, EGL_RECORDABLE_ANDROID, 1, 12344};
    public static final int[] CONFIG_RGBA = new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};
    public static final int EGL_OPENGL_ES2_BIT = 4;
    public static final int EGL_RECORDABLE_ANDROID = 12610;
    public static final Object lock = new Object();

    public final /* synthetic */ class -CC {
        public static EglBase create() {
            return create(null, EglBase.CONFIG_PLAIN);
        }

        public static EglBase create(Context context) {
            return create(context, EglBase.CONFIG_PLAIN);
        }

        public static EglBase create(Context context, int[] iArr) {
            if (EglBase14.isEGL14Supported() && (context == null || (context instanceof org.webrtc.EglBase14.Context))) {
                return new EglBase14((org.webrtc.EglBase14.Context) context, iArr);
            }
            return new EglBase10((org.webrtc.EglBase10.Context) context, iArr);
        }

        public static EglBase createEgl10(EGLContext eGLContext, int[] iArr) {
            return new EglBase10(new org.webrtc.EglBase10.Context(eGLContext), iArr);
        }

        public static EglBase createEgl10(int[] iArr) {
            return new EglBase10(null, iArr);
        }

        public static EglBase createEgl14(android.opengl.EGLContext eGLContext, int[] iArr) {
            return new EglBase14(new org.webrtc.EglBase14.Context(eGLContext), iArr);
        }

        public static EglBase createEgl14(int[] iArr) {
            return new EglBase14(null, iArr);
        }
    }

    public interface Context {
        long getNativeEglContext();
    }

    void createDummyPbufferSurface();

    void createPbufferSurface(int i, int i2);

    void createSurface(SurfaceTexture surfaceTexture);

    void createSurface(Surface surface);

    void detachCurrent();

    Context getEglBaseContext();

    boolean hasSurface();

    void makeCurrent();

    void release();

    void releaseSurface();

    int surfaceHeight();

    int surfaceWidth();

    void swapBuffers();

    void swapBuffers(long j);
}
