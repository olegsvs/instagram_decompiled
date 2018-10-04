package X;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import com.google.android.exoplayer2.video.DummySurface;
import java.util.Locale;

/* renamed from: X.2ym */
public final class AnonymousClass2ym extends HandlerThread implements Callback {
    /* renamed from: B */
    public AnonymousClass2yU f36563B;
    /* renamed from: C */
    public Handler f36564C;
    /* renamed from: D */
    public Error f36565D;
    /* renamed from: E */
    public RuntimeException f36566E;
    /* renamed from: F */
    public DummySurface f36567F;

    public AnonymousClass2ym() {
        super("dummySurface");
    }

    public final boolean handleMessage(Message message) {
        EGLSurface eGLSurface;
        Throwable th;
        Message message2 = message;
        AnonymousClass2ym anonymousClass2ym = this;
        switch (message2.what) {
            case 1:
                try {
                    AnonymousClass2yT anonymousClass2yT;
                    int i = message2.arg1;
                    AnonymousClass2yO.m18016E(this.f36563B);
                    OnFrameAvailableListener onFrameAvailableListener = this.f36563B;
                    EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                    if (eglGetDisplay != null) {
                        int[] iArr = new int[2];
                        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                            onFrameAvailableListener.f36519C = eglGetDisplay;
                            EGLConfig[] eGLConfigArr = new EGLConfig[1];
                            int[] iArr2 = new int[1];
                            if (!EGL14.eglChooseConfig(onFrameAvailableListener.f36519C, AnonymousClass2yU.f36517H, 0, eGLConfigArr, 0, 1, iArr2, null) || iArr2[0] <= 0 || eGLConfigArr[0] == null) {
                                throw new AnonymousClass2yT(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", new Object[]{Boolean.valueOf(r6), Integer.valueOf(iArr2[0]), eGLConfigArr[0]}));
                            }
                            int[] iArr3;
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            EGLDisplay eGLDisplay = onFrameAvailableListener.f36519C;
                            if (i == 0) {
                                iArr3 = new int[]{12440, 2, 12344};
                            } else {
                                iArr3 = new int[]{12440, 2, 12992, 1, 12344};
                            }
                            EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr3, 0);
                            if (eglCreateContext != null) {
                                onFrameAvailableListener.f36518B = eglCreateContext;
                                eGLDisplay = onFrameAvailableListener.f36519C;
                                EGLContext eGLContext = onFrameAvailableListener.f36518B;
                                if (i == 1) {
                                    eGLSurface = EGL14.EGL_NO_SURFACE;
                                } else {
                                    if (i == 2) {
                                        iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                                    } else {
                                        iArr = new int[]{12375, 1, 12374, 1, 12344};
                                    }
                                    eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
                                    if (eGLSurface == null) {
                                        anonymousClass2yT = new AnonymousClass2yT("eglCreatePbufferSurface failed");
                                    }
                                }
                                if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
                                    onFrameAvailableListener.f36521E = eGLSurface;
                                    GLES20.glGenTextures(1, onFrameAvailableListener.f36523G, 0);
                                    int glGetError = GLES20.glGetError();
                                    if (glGetError == 0) {
                                        onFrameAvailableListener.f36522F = new SurfaceTexture(onFrameAvailableListener.f36523G[0]);
                                        onFrameAvailableListener.f36522F.setOnFrameAvailableListener(onFrameAvailableListener);
                                        anonymousClass2ym.f36567F = new DummySurface(anonymousClass2ym, (SurfaceTexture) AnonymousClass2yO.m18016E(anonymousClass2ym.f36563B.f36522F), i != 0);
                                        synchronized (anonymousClass2ym) {
                                            try {
                                                notify();
                                            } catch (Throwable th2) {
                                                th = th2;
                                                throw th;
                                            }
                                        }
                                        break;
                                    }
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("glGenTextures failed. Error: ");
                                    stringBuilder.append(Integer.toHexString(glGetError));
                                    throw new AnonymousClass2yT(stringBuilder.toString());
                                }
                                anonymousClass2yT = new AnonymousClass2yT("eglMakeCurrent failed");
                            } else {
                                anonymousClass2yT = new AnonymousClass2yT("eglCreateContext failed");
                            }
                        } else {
                            anonymousClass2yT = new AnonymousClass2yT("eglInitialize failed");
                        }
                    } else {
                        anonymousClass2yT = new AnonymousClass2yT("eglGetDisplay failed");
                    }
                    throw anonymousClass2yT;
                } catch (Throwable e) {
                    Log.e("DummySurface", "Failed to initialize dummy surface", e);
                    anonymousClass2ym.f36566E = e;
                    synchronized (anonymousClass2ym) {
                        notify();
                        break;
                    }
                } catch (Throwable e2) {
                    try {
                        Log.e("DummySurface", "Failed to initialize dummy surface", e2);
                        anonymousClass2ym.f36565D = e2;
                        synchronized (anonymousClass2ym) {
                            notify();
                            break;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        break;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    throw th;
                }
                break;
            case 2:
                AnonymousClass2yO.m18016E(this.f36563B);
                AnonymousClass2yU anonymousClass2yU = this.f36563B;
                AnonymousClass0OR.G(anonymousClass2yU.f36520D, anonymousClass2yU, 828415867);
                EGLContext eGLContext2;
                try {
                    if (anonymousClass2yU.f36522F != null) {
                        anonymousClass2yU.f36522F.release();
                        GLES20.glDeleteTextures(1, anonymousClass2yU.f36523G, 0);
                    }
                    eGLSurface = anonymousClass2yU.f36521E;
                    if (!(eGLSurface == null || eGLSurface.equals(EGL14.EGL_NO_SURFACE))) {
                        EGL14.eglDestroySurface(anonymousClass2yU.f36519C, anonymousClass2yU.f36521E);
                    }
                    eGLContext2 = anonymousClass2yU.f36518B;
                    if (eGLContext2 != null) {
                        EGL14.eglDestroyContext(anonymousClass2yU.f36519C, eGLContext2);
                    }
                    anonymousClass2yU.f36519C = null;
                    anonymousClass2yU.f36518B = null;
                    anonymousClass2yU.f36521E = null;
                    anonymousClass2yU.f36522F = null;
                    break;
                } catch (Throwable th5) {
                    quit();
                }
                quit();
                return true;
        }
        return true;
        throw th;
    }
}
