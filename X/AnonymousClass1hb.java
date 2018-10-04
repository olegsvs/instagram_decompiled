package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;

/* renamed from: X.1hb */
public final class AnonymousClass1hb extends Handler {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3th f21531B;

    public AnonymousClass1hb(AnonymousClass3th anonymousClass3th, Looper looper) {
        this.f21531B = anonymousClass3th;
        super(looper);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        AnonymousClass3th anonymousClass3th;
        EGLSurface eglCreatePbufferSurface;
        switch (i) {
            case 1:
                anonymousClass3th = this.f21531B;
                message = new AnonymousClass1vX();
                anonymousClass3th.f46112B = message;
                eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(message.f24228C, message.f24227B, new int[]{12375, 1, 12374, 1, 12344}, 0);
                AnonymousClass1vX.B("eglCreatePbufferSurface");
                if (eglCreatePbufferSurface != null) {
                    anonymousClass3th.f46114D = eglCreatePbufferSurface;
                    anonymousClass3th.f46112B.A(anonymousClass3th.f46114D);
                    AnonymousClass1vZ anonymousClass1vZ = new AnonymousClass1vZ(new AnonymousClass1vd(AnonymousClass1vc.f24241D));
                    anonymousClass3th.f46113C = anonymousClass1vZ;
                    anonymousClass3th.f46118H = anonymousClass1vZ.A();
                    SurfaceTexture surfaceTexture = new SurfaceTexture(anonymousClass3th.f46118H);
                    anonymousClass3th.f46117G = surfaceTexture;
                    surfaceTexture.setOnFrameAvailableListener(new AnonymousClass2q1(anonymousClass3th));
                    if (anonymousClass3th.f46115E != null) {
                        AnonymousClass3tE anonymousClass3tE = anonymousClass3th.f46115E;
                        Surface surface = new Surface(anonymousClass3th.f46117G);
                        AnonymousClass2pd anonymousClass2pd = anonymousClass3tE.f46019B;
                        AnonymousClass2pd.P(anonymousClass2pd, anonymousClass2pd.f34571L.obtainMessage(20, surface));
                        return;
                    }
                    return;
                }
                throw new RuntimeException("surface was null");
            case 2:
                AnonymousClass3th anonymousClass3th2 = this.f21531B;
                Surface surface2 = (Surface) message.obj;
                AnonymousClass3th.C(anonymousClass3th2);
                if (surface2 != null && surface2.isValid()) {
                    try {
                        anonymousClass3th2.f46121K = new AnonymousClass2Rg(anonymousClass3th2.f46112B, surface2, false);
                        anonymousClass3th2.f46121K.C();
                    } catch (Throwable e) {
                        AnonymousClass1Gl.m10576F("VideoSurfaceRendererImpl", e, "Failed to create WindowSurface.", new Object[0]);
                    }
                    AnonymousClass1vY anonymousClass1vY = anonymousClass3th2.f46121K;
                    if (anonymousClass1vY != null) {
                        anonymousClass3th2.f46120J = anonymousClass1vY.B();
                        anonymousClass3th2.f46119I = anonymousClass3th2.f46121K.A();
                    }
                }
                return;
            case 3:
                AnonymousClass3th.B(this.f21531B);
                return;
            case 4:
                AnonymousClass3th.C(this.f21531B);
                return;
            case 5:
                anonymousClass3th = this.f21531B;
                AnonymousClass1vX anonymousClass1vX = anonymousClass3th.f46112B;
                if (anonymousClass1vX != null) {
                    anonymousClass1vX.A(anonymousClass3th.f46114D);
                    if (anonymousClass3th.f46118H > 0) {
                        GLES20.glDeleteTextures(1, new int[]{anonymousClass3th.f46118H}, 0);
                    }
                }
                SurfaceTexture surfaceTexture2 = anonymousClass3th.f46117G;
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                    anonymousClass3th.f46117G = null;
                }
                AnonymousClass3th.C(anonymousClass3th);
                AnonymousClass1vZ anonymousClass1vZ2 = anonymousClass3th.f46113C;
                if (anonymousClass1vZ2 != null) {
                    anonymousClass1vZ2.C(true);
                    anonymousClass3th.f46113C = null;
                }
                eglCreatePbufferSurface = anonymousClass3th.f46114D;
                if (eglCreatePbufferSurface != null) {
                    anonymousClass3th.f46112B.C(eglCreatePbufferSurface);
                    anonymousClass3th.f46114D = null;
                }
                AnonymousClass1vX anonymousClass1vX2 = anonymousClass3th.f46112B;
                if (anonymousClass1vX2 != null) {
                    anonymousClass1vX2.B();
                    anonymousClass3th.f46112B = null;
                }
                ((HandlerThread) anonymousClass3th.f46116F.getLooper().getThread()).quit();
                return;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid msg what:");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
