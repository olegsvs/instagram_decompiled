package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.instagram.filterkit.filter.BaseFilter;
import com.instagram.filterkit.filter.OESCopyFilter;
import com.instagram.filterkit.filter.RegionTrackingFilter;
import com.instagram.filterkit.filter.VideoFilter;
import com.instagram.filterkit.filter.resize.ResizeFilter;

/* renamed from: X.3qC */
public final class AnonymousClass3qC {
    /* renamed from: b */
    private static final Class f45170b = AnonymousClass3qC.class;
    /* renamed from: B */
    public AnonymousClass2eX f45171B;
    /* renamed from: C */
    public int f45172C;
    /* renamed from: D */
    private final AnonymousClass2Mf f45173D;
    /* renamed from: E */
    private AnonymousClass3q4 f45174E;
    /* renamed from: F */
    private final AnonymousClass28k f45175F;
    /* renamed from: G */
    private AnonymousClass1uu f45176G;
    /* renamed from: H */
    private final boolean f45177H;
    /* renamed from: I */
    private OESCopyFilter f45178I;
    /* renamed from: J */
    private final AnonymousClass3Oy f45179J;
    /* renamed from: K */
    private AnonymousClass2Vh f45180K;
    /* renamed from: L */
    private int f45181L;
    /* renamed from: M */
    private final int f45182M;
    /* renamed from: N */
    private final int f45183N;
    /* renamed from: O */
    private final AnonymousClass2Vi f45184O;
    /* renamed from: P */
    private final int f45185P;
    /* renamed from: Q */
    private final int f45186Q;
    /* renamed from: R */
    private final int f45187R;
    /* renamed from: S */
    private final int f45188S;
    /* renamed from: T */
    private final RegionTrackingFilter f45189T;
    /* renamed from: U */
    private final boolean f45190U;
    /* renamed from: V */
    private ResizeFilter f45191V;
    /* renamed from: W */
    private AnonymousClass2eX f45192W;
    /* renamed from: X */
    private final float[] f45193X;
    /* renamed from: Y */
    private AnonymousClass2eX f45194Y;
    /* renamed from: Z */
    private final boolean f45195Z;
    /* renamed from: a */
    private int f45196a;

    public AnonymousClass3qC(Context context, AnonymousClass0OA anonymousClass0OA, int i, int i2) {
        this(context, anonymousClass0OA, i, i2, false);
    }

    public AnonymousClass3qC(Context context, AnonymousClass0OA anonymousClass0OA, int i, int i2, boolean z) {
        this.f45193X = new float[16];
        this.f45172C = -12345;
        this.f45175F = new AnonymousClass28k(context);
        this.f45173D = AnonymousClass2Mk.m15236B();
        this.f45189T = anonymousClass0OA.i() ? new RegionTrackingFilter(anonymousClass0OA.MC) : null;
        this.f45188S = i;
        this.f45187R = i2;
        this.f45186Q = anonymousClass0OA.sB;
        this.f45185P = anonymousClass0OA.pB;
        this.f45177H = anonymousClass0OA.jB;
        int min = Math.min(this.f45186Q, this.f45185P);
        float f = anonymousClass0OA.f3795I;
        int i3;
        switch (AnonymousClass3qB.f45169B[AnonymousClass2Mp.m15243B(f).ordinal()]) {
            case 1:
                this.f45183N = min;
                this.f45182M = min;
                break;
            case 2:
                i3 = this.f45185P;
                this.f45182M = i3;
                this.f45183N = (int) ((((float) i3) * f) + 0.5f);
                break;
            case 3:
                i3 = this.f45186Q;
                this.f45183N = i3;
                this.f45182M = (int) ((((float) i3) / f) + 0.5f);
                break;
            default:
                throw new UnsupportedOperationException("Unknown aspect type");
        }
        boolean z2 = true;
        boolean z3 = this.f45183N >= ((Integer) AnonymousClass0E6.C(AnonymousClass0CC.oU)).intValue() && AnonymousClass2Mq.m15247B() && !AnonymousClass0FH.f2099C.E();
        this.f45190U = z3;
        if (z3 || !z) {
            z2 = false;
        }
        this.f45195Z = z2;
        if (!this.f45195Z) {
            this.f45178I = new OESCopyFilter();
        }
        AnonymousClass3Oy anonymousClass3Oy = new AnonymousClass3Oy();
        this.f45179J = anonymousClass3Oy;
        anonymousClass3Oy.m19532A(anonymousClass0OA.bC);
        this.f45179J.m19533B(anonymousClass0OA.bC);
        this.f45184O = AnonymousClass28m.m14601D(this.f45188S, this.f45187R);
        Matrix.setIdentityM(this.f45193X, 0);
    }

    /* renamed from: A */
    public final void m20882A(long j, SurfaceTexture surfaceTexture, AnonymousClass3Of anonymousClass3Of, VideoFilter videoFilter, BaseFilter baseFilter, boolean z) {
        AnonymousClass2Mf anonymousClass2Mf;
        AnonymousClass2Vh anonymousClass2Vh;
        AnonymousClass28j.m14579B("onDrawFrame start");
        surfaceTexture.getTransformMatrix(this.f45193X);
        if (z) {
            GLES20.glClearColor(0.0f, 1.0f, 0.0f, 1.0f);
            GLES20.glClear(16640);
        }
        if (!this.f45195Z) {
            GLES20.glUseProgram(this.f45181L);
            VideoFilter videoFilter2 = this.f45178I;
            if (this.f45177H) {
                anonymousClass2Mf = this.f45173D;
            } else {
                anonymousClass2Mf = this.f45179J.f40800B;
            }
            videoFilter2.f49568I = anonymousClass2Mf;
            this.f45178I.f50118B = this.f45193X;
            this.f45178I.yJA(this.f45175F, this.f45180K, this.f45171B);
        }
        if (anonymousClass3Of != null) {
            AnonymousClass1uu anonymousClass1uu = this.f45176G;
            AnonymousClass3qJ anonymousClass3qJ = anonymousClass3Of.f40786C;
            AnonymousClass0LH.F(anonymousClass3qJ.f45214I, "init() hasn't been called yet!");
            AnonymousClass1sl anonymousClass1sl = anonymousClass3qJ.f45214I;
            anonymousClass1sl.f32822C = anonymousClass1uu;
            AnonymousClass1sk anonymousClass1sk = anonymousClass1sl.f32821B;
            if (anonymousClass1sk != null) {
                anonymousClass1sk.Uc(anonymousClass1sl);
            }
            anonymousClass3qJ.f45210E = false;
            synchronized (anonymousClass3qJ.f45213H) {
                while (!anonymousClass3qJ.f45207B) {
                    try {
                        anonymousClass3qJ.f45213H.wait(2500);
                        if (!anonymousClass3qJ.f45207B) {
                            throw new RuntimeException("Timed out waiting for CameraCore frame.");
                        }
                    } catch (Throwable e) {
                        AnonymousClass0Gn.G("IG-CameraCoreRenderer", e);
                    }
                }
                anonymousClass3qJ.f45207B = false;
            }
            anonymousClass2Vh = anonymousClass3qJ.f45208C;
        } else {
            anonymousClass2Vh = this.f45195Z ? this.f45180K : this.f45171B;
        }
        try {
            if (this.f45190U && anonymousClass2Vh.getWidth() != this.f45184O.getWidth()) {
                AnonymousClass28j.m14579B("TranscodeTextureRenderer");
                this.f45191V.yJA(this.f45175F, anonymousClass2Vh, this.f45192W);
                anonymousClass2Vh = this.f45192W;
            }
        } catch (Throwable e2) {
            AnonymousClass0Dc.C(f45170b, "Video resize failed", e2);
            AnonymousClass0Gn.G("TranscodeTextureRenderer render exception", e2);
        }
        videoFilter.f49569J = this.f45174E != null;
        if (this.f45195Z) {
            videoFilter.f49568I = this.f45179J.f40800B;
            videoFilter.m22730H(this.f45193X);
        } else {
            if (this.f45177H) {
                anonymousClass2Mf = this.f45179J.f40800B;
            } else {
                anonymousClass2Mf = this.f45173D;
            }
            videoFilter.f49568I = anonymousClass2Mf;
        }
        videoFilter.yJA(this.f45175F, anonymousClass2Vh, baseFilter != null ? this.f45194Y : this.f45184O);
        if (baseFilter != null) {
            try {
                baseFilter.yJA(this.f45175F, this.f45194Y, this.f45184O);
            } catch (Throwable e3) {
                AnonymousClass0Dc.C(f45170b, "Secondary filter failed", e3);
                AnonymousClass0Gn.L("TranscodeTextureRenderer render exception", e3);
            }
        }
        RegionTrackingFilter regionTrackingFilter = this.f45189T;
        long j2 = j;
        if (regionTrackingFilter != null) {
            try {
                regionTrackingFilter.f48240C = Math.round((float) (j / 1000));
                this.f45189T.yJA(this.f45175F, null, this.f45184O);
            } catch (Throwable e32) {
                AnonymousClass0Dc.C(f45170b, "Region tracking filter failed", e32);
                AnonymousClass0Gn.L("TranscodeTextureRenderer render exception", e32);
            }
        }
        GLES20.glFinish();
        AnonymousClass3q4 anonymousClass3q4 = this.f45174E;
        if (anonymousClass3q4 != null) {
            anonymousClass3q4.m20872A(this.f45184O, this.f45172C, this.f45193X, j2);
        }
    }

    /* renamed from: B */
    public final void m20883B(VideoFilter videoFilter, BaseFilter baseFilter, AnonymousClass3q4 anonymousClass3q4) {
        AnonymousClass1ut anonymousClass1ut = new AnonymousClass1ut();
        anonymousClass1ut.f24084I = 36197;
        AnonymousClass1uu A = anonymousClass1ut.m13709A();
        this.f45176G = A;
        int i = A.f24087C;
        this.f45172C = i;
        this.f45180K = AnonymousClass28m.m14599B(i, this.f45186Q, this.f45185P);
        if (!this.f45195Z) {
            this.f45181L = this.f45178I.m22723A();
            this.f45171B = AnonymousClass28m.m14600C(this.f45183N, this.f45182M);
        }
        if (this.f45190U) {
            this.f45191V = new ResizeFilter(true);
            this.f45192W = AnonymousClass28m.m14600C(this.f45188S, this.f45187R);
        }
        if (baseFilter != null) {
            this.f45194Y = AnonymousClass28m.m14600C(this.f45188S, this.f45187R);
        }
        if (!this.f45195Z) {
            this.f45196a = GLES20.glGetUniformLocation(this.f45181L, "transformMatrix");
            AnonymousClass28j.m14579B("glGetUniformLocation uSTMatrix");
            if (this.f45196a == -1) {
                throw new RuntimeException("Could not get attrib location for uSTMatrix");
            }
        }
        boolean z = this.f45195Z;
        AnonymousClass0LH.I(videoFilter.f49574O == 0, "useSamplerExternalOES must be set prior to calling getProgram");
        videoFilter.f49581V = z;
        videoFilter.m22723A();
        this.f45174E = anonymousClass3q4;
    }
}
