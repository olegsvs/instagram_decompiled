package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import com.instagram.filterkit.filter.BaseFilter;
import com.instagram.filterkit.filter.VideoFilter;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: X.42q */
public final class AnonymousClass42q implements AnonymousClass3oX, AnonymousClass3qG {
    /* renamed from: B */
    public final AnonymousClass2Mf f48854B = AnonymousClass2Mk.m15236B();
    /* renamed from: C */
    public AnonymousClass2Vh f48855C;
    /* renamed from: D */
    public final AnonymousClass3qJ f48856D;
    /* renamed from: E */
    public AnonymousClass1Km f48857E;
    /* renamed from: F */
    public VideoFilter f48858F;
    /* renamed from: G */
    public VideoFilter f48859G;
    /* renamed from: H */
    public AnonymousClass2Mf f48860H;
    /* renamed from: I */
    public AnonymousClass28b f48861I;
    /* renamed from: J */
    public volatile boolean f48862J;
    /* renamed from: K */
    public AnonymousClass2fM f48863K;
    /* renamed from: L */
    public AnonymousClass2fM f48864L;
    /* renamed from: M */
    public AnonymousClass2fM f48865M;
    /* renamed from: N */
    public volatile boolean f48866N;
    /* renamed from: O */
    public final AnonymousClass42r f48867O;
    /* renamed from: P */
    public int f48868P;
    /* renamed from: Q */
    public int f48869Q;
    /* renamed from: R */
    public AnonymousClass5TW f48870R;
    /* renamed from: S */
    public BaseFilter f48871S;
    /* renamed from: T */
    public boolean f48872T;
    /* renamed from: U */
    public VideoFilter f48873U;
    /* renamed from: V */
    private boolean f48874V;

    public AnonymousClass42q(AnonymousClass28b anonymousClass28b, boolean z, boolean z2) {
        this.f48861I = anonymousClass28b;
        this.f48856D = null;
        this.f48867O = new AnonymousClass42r(anonymousClass28b, z2);
        this.f48873U = AnonymousClass3Os.m19524C();
        this.f48858F = AnonymousClass3Os.m19523B();
        this.f48874V = z;
        this.f48862J = z2;
    }

    public AnonymousClass42q(Context context, AnonymousClass28b anonymousClass28b, boolean z, boolean z2) {
        this.f48861I = anonymousClass28b;
        this.f48856D = new AnonymousClass3qJ(context, true);
        this.f48867O = new AnonymousClass42r(anonymousClass28b, z2);
        this.f48873U = AnonymousClass3Os.m19524C();
        this.f48858F = AnonymousClass3Os.m19523B();
        this.f48874V = z;
        this.f48862J = z2;
    }

    /* renamed from: A */
    public final SurfaceTexture m22275A() {
        return this.f48867O.f48876C;
    }

    /* renamed from: B */
    public final void m22276B(AnonymousClass1Km anonymousClass1Km) {
        if (this.f48856D != null) {
            AnonymousClass1sj anonymousClass1sj = new AnonymousClass1sj(anonymousClass1Km.f17224U, anonymousClass1Km.f17214K, AnonymousClass3Zn.m20049E(anonymousClass1Km.f17218O.intValue()), true);
            AnonymousClass1sj anonymousClass1sj2 = new AnonymousClass1sj(this.f48869Q, this.f48868P);
            AnonymousClass3qJ anonymousClass3qJ = this.f48856D;
            EGLContext eGLContext = this.f48861I.f26568B;
            AnonymousClass0LH.F(eGLContext, "GlContext.setupContext() hasn't been called yet!");
            AnonymousClass3qJ.m20885B(anonymousClass3qJ, new AnonymousClass2Vd(eGLContext), anonymousClass1sj, anonymousClass1sj2);
            this.f48856D.f45212G = new AnonymousClass42p(this);
        }
        if (this.f48874V) {
            this.f48857E = anonymousClass1Km;
            float f = anonymousClass1Km.f17206C;
            float f2 = anonymousClass1Km.f17205B;
            int B = AnonymousClass3Zn.m20046B(anonymousClass1Km);
            this.f48860H.f29571C.put(AnonymousClass2Mk.m15239E(f, f2, anonymousClass1Km.f17217N));
            this.f48860H.f29571C.position(0);
            FloatBuffer floatBuffer = this.f48860H.f29572D;
            if (AnonymousClass3Zn.m20047C(anonymousClass1Km) || anonymousClass1Km.f17215L) {
                B = 0;
            }
            floatBuffer.put(AnonymousClass2Mk.m15241G(B));
            this.f48860H.f29572D.position(0);
            AnonymousClass42q.m22274B(this);
            this.f48866N = true;
            return;
        }
        this.f48867O.f48878E.m19532A(anonymousClass1Km);
    }

    /* renamed from: B */
    public static void m22274B(AnonymousClass42q anonymousClass42q) {
        AnonymousClass2Mf anonymousClass2Mf;
        VideoFilter videoFilter = anonymousClass42q.f48858F;
        if (anonymousClass42q.f48862J) {
            anonymousClass2Mf = anonymousClass42q.f48867O.f48878E.f40800B;
        } else {
            anonymousClass2Mf = anonymousClass42q.f48860H;
        }
        videoFilter.f49568I = anonymousClass2Mf;
        anonymousClass42q.f48873U.f49568I = anonymousClass42q.f48862J ? anonymousClass42q.f48854B : anonymousClass42q.f48860H;
        videoFilter = anonymousClass42q.f48859G;
        if (videoFilter != null) {
            videoFilter.f49568I = anonymousClass42q.f48854B;
        }
    }

    /* renamed from: C */
    public final void m22277C(VideoFilter videoFilter) {
        AnonymousClass2Mf anonymousClass2Mf;
        this.f48858F = videoFilter;
        if (this.f48862J) {
            anonymousClass2Mf = this.f48867O.f48878E.f40800B;
        } else {
            anonymousClass2Mf = this.f48860H;
        }
        videoFilter.f49568I = anonymousClass2Mf;
    }

    /* renamed from: D */
    public final void m22278D(boolean z) {
        this.f48867O.f48879F = z;
    }

    public final void FQA(AnonymousClass36h anonymousClass36h) {
        AnonymousClass3qJ anonymousClass3qJ = this.f48856D;
        if (anonymousClass3qJ != null) {
            anonymousClass3qJ.m20889D(anonymousClass36h);
        }
    }

    public final void KLA() {
        AnonymousClass3qJ anonymousClass3qJ = this.f48856D;
        if (anonymousClass3qJ != null) {
            anonymousClass3qJ.m20888C();
        }
    }

    public final void QLA(int i, int i2) {
        this.f48867O.QLA(i, i2);
        this.f48863K.m16802A(i, i2);
        this.f48864L.m16802A(i, i2);
        AnonymousClass2fM anonymousClass2fM = this.f48865M;
        if (anonymousClass2fM != null) {
            anonymousClass2fM.m16802A(i, i2);
        }
    }

    public final void iH() {
        AnonymousClass3qJ anonymousClass3qJ = this.f48856D;
        if (anonymousClass3qJ != null) {
            anonymousClass3qJ.m20886A();
        }
        this.f48867O.iH();
    }

    public final void tV(int i, int i2) {
        this.f48869Q = i;
        this.f48868P = i2;
        this.f48867O.tV(i, i2);
        this.f48863K = new AnonymousClass2fM(i, i2);
        this.f48864L = new AnonymousClass2fM(i, i2);
        this.f48858F.m22723A();
        this.f48873U.m22723A();
        if (this.f48871S != null) {
            this.f48865M = new AnonymousClass2fM(i, i2);
        }
        this.f48860H = AnonymousClass2Mk.m15236B();
        AnonymousClass42q.m22274B(this);
    }

    public final void zJA(AnonymousClass2Vi anonymousClass2Vi) {
        this.f48867O.zJA(this.f48863K);
        AnonymousClass3qJ anonymousClass3qJ = this.f48856D;
        if (anonymousClass3qJ != null) {
            anonymousClass3qJ.m20887B(r1.f48867O.f48877D);
        }
        AnonymousClass2Vh anonymousClass2Vh = r1.f48855C;
        if (anonymousClass2Vh == null) {
            anonymousClass2Vh = r1.f48863K;
        }
        AnonymousClass28k anonymousClass28k = r1.f48861I.f26570D;
        AnonymousClass2Vi anonymousClass2Vi2 = anonymousClass2Vi;
        if (r1.f48872T) {
            AnonymousClass0LH.B(r1.f48859G == null);
            r1.f48858F.yJA(anonymousClass28k, anonymousClass2Vh, r1.f48864L);
            BaseFilter baseFilter = r1.f48871S;
            if (baseFilter != null) {
                try {
                    baseFilter.yJA(anonymousClass28k, r1.f48864L, r1.f48865M);
                } catch (Throwable e) {
                    AnonymousClass0Dc.G("FullRenderer", "Secondary filter failed", e);
                    AnonymousClass0Gn.L("FullRenderer render exception", e);
                }
                r1.f48873U.yJA(anonymousClass28k, r1.f48865M, anonymousClass2Vi2);
                return;
            }
            r1.f48873U.yJA(anonymousClass28k, r1.f48864L, anonymousClass2Vi2);
            return;
        }
        AnonymousClass5TW anonymousClass5TW = r1.f48870R;
        if (anonymousClass5TW != null) {
            synchronized (anonymousClass5TW.f64459J) {
                boolean z = false;
                if (anonymousClass5TW.f64457H != AnonymousClass4Yg.END_CURRENT) {
                    if (anonymousClass5TW.f64457H != AnonymousClass4Yg.END_NEXT) {
                        int intValue = ((Integer) anonymousClass5TW.f64455F.get(anonymousClass5TW.f64453D)).intValue();
                        int intValue2 = ((Integer) anonymousClass5TW.f64455F.get(anonymousClass5TW.f64458I)).intValue();
                        AnonymousClass3zz anonymousClass3zz;
                        int i;
                        int B;
                        if (anonymousClass5TW.f64457H == AnonymousClass4Yg.LEFT) {
                            anonymousClass5TW.f64454E.m21980M(intValue, AnonymousClass5TW.B(anonymousClass5TW, intValue), anonymousClass5TW.f64456G, anonymousClass5TW.f64452C, anonymousClass5TW.f64451B);
                            anonymousClass3zz = anonymousClass5TW.f64454E;
                            i = anonymousClass5TW.f64460K;
                            B = AnonymousClass5TW.B(anonymousClass5TW, intValue2);
                            if (intValue2 != intValue) {
                                z = true;
                            }
                            anonymousClass3zz.m21981N(intValue2, i, B, z);
                        } else {
                            anonymousClass5TW.f64454E.m21980M(intValue2, AnonymousClass5TW.B(anonymousClass5TW, intValue2), anonymousClass5TW.f64456G, anonymousClass5TW.f64452C, anonymousClass5TW.f64451B);
                            anonymousClass3zz = anonymousClass5TW.f64454E;
                            i = anonymousClass5TW.f64460K;
                            B = AnonymousClass5TW.B(anonymousClass5TW, intValue);
                            if (intValue2 != intValue) {
                                z = true;
                            }
                            anonymousClass3zz.m21981N(intValue, i, B, z);
                        }
                    }
                }
                int intValue3 = ((Integer) anonymousClass5TW.f64455F.get(anonymousClass5TW.f64453D)).intValue();
                anonymousClass5TW.f64454E.m21980M(intValue3, AnonymousClass5TW.B(anonymousClass5TW, intValue3), anonymousClass5TW.f64456G, anonymousClass5TW.f64452C, anonymousClass5TW.f64451B);
                anonymousClass5TW.f64454E.m21981N(0, Integer.MAX_VALUE, 100, false);
            }
        }
        if (r1.f48859G != null) {
            r1.f48858F.yJA(anonymousClass28k, anonymousClass2Vh, r1.f48864L);
            r1.f48859G.yJA(anonymousClass28k, r1.f48864L, anonymousClass2Vi2);
            return;
        }
        r1.f48858F.yJA(anonymousClass28k, anonymousClass2Vh, anonymousClass2Vi2);
    }
}
