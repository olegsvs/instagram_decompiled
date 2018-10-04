package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.HandlerThread;

/* renamed from: X.3th */
public final class AnonymousClass3th {
    /* renamed from: B */
    public AnonymousClass1vX f46112B;
    /* renamed from: C */
    public AnonymousClass1vZ f46113C;
    /* renamed from: D */
    public EGLSurface f46114D;
    /* renamed from: E */
    public volatile AnonymousClass3tE f46115E;
    /* renamed from: F */
    public final AnonymousClass1hb f46116F;
    /* renamed from: G */
    public SurfaceTexture f46117G;
    /* renamed from: H */
    public int f46118H;
    /* renamed from: I */
    public int f46119I;
    /* renamed from: J */
    public int f46120J;
    /* renamed from: K */
    public AnonymousClass2Rg f46121K;
    /* renamed from: L */
    private final float[] f46122L = new float[16];

    public AnonymousClass3th(AnonymousClass3tE anonymousClass3tE) {
        this.f46115E = anonymousClass3tE;
        HandlerThread handlerThread = new HandlerThread("VideoRendererThread");
        handlerThread.start();
        this.f46116F = new AnonymousClass1hb(this, handlerThread.getLooper());
        AnonymousClass1hb anonymousClass1hb = this.f46116F;
        anonymousClass1hb.sendMessage(anonymousClass1hb.obtainMessage(1));
    }

    /* renamed from: B */
    public static void m21183B(AnonymousClass3th anonymousClass3th) {
        SurfaceTexture surfaceTexture = anonymousClass3th.f46117G;
        if (surfaceTexture != null) {
            if (anonymousClass3th.f46121K == null) {
                anonymousClass3th.f46112B.m13776A(anonymousClass3th.f46114D);
                anonymousClass3th.f46117G.updateTexImage();
                return;
            }
            surfaceTexture.updateTexImage();
            try {
                anonymousClass3th.f46121K.m13781C();
                GLES20.glViewport(0, 0, anonymousClass3th.f46120J, anonymousClass3th.f46119I);
                anonymousClass3th.f46117G.getTransformMatrix(anonymousClass3th.f46122L);
                anonymousClass3th.f46113C.m13784B(anonymousClass3th.f46118H, anonymousClass3th.f46122L, false);
                anonymousClass3th.f46121K.m13782D();
            } catch (Throwable e) {
                AnonymousClass1Gl.F("VideoSurfaceRendererImpl", e, "Invalid WindowSurface.", new Object[0]);
            }
        }
    }

    /* renamed from: C */
    public static void m21184C(AnonymousClass3th anonymousClass3th) {
        if (anonymousClass3th.f46121K != null) {
            GLES20.glFinish();
            anonymousClass3th.f46121K.m15746E();
            anonymousClass3th.f46121K = null;
        }
    }
}
