package X;

import com.facebook.common.dextricks.StartupQEsConfig;

/* renamed from: X.1Qq */
public final class AnonymousClass1Qq implements AnonymousClass0QP {
    /* renamed from: B */
    public final AnonymousClass0cN f18467B;
    /* renamed from: C */
    public final AnonymousClass4Ye f18468C;
    /* renamed from: D */
    public float f18469D;
    /* renamed from: E */
    public AnonymousClass4Yf f18470E;
    /* renamed from: F */
    public float f18471F;
    /* renamed from: G */
    public AnonymousClass4Yg f18472G;
    /* renamed from: H */
    public boolean f18473H;
    /* renamed from: I */
    public final int f18474I;

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public AnonymousClass1Qq(AnonymousClass4Ye anonymousClass4Ye, int i) {
        this.f18468C = anonymousClass4Ye;
        this.f18474I = i;
        AnonymousClass0cN C = AnonymousClass0e6.m6190B().m6193C();
        this.f18467B = C.m5756A(this);
    }

    /* renamed from: A */
    public final void m11374A(float f) {
        if (f >= 0.0f) {
            if (f != 0.0f || this.f18471F >= ((float) (this.f18474I / 2))) {
                this.f18467B.m5771P((double) f).m5769N((double) this.f18474I);
                return;
            }
        }
        this.f18467B.m5771P((double) f).m5769N(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
    }

    /* renamed from: B */
    public final void m11375B(float f) {
        if (!this.f18473H) {
            this.f18473H = true;
            this.f18467B.m5766K();
            AnonymousClass4Yf anonymousClass4Yf = this.f18470E;
            if (anonymousClass4Yf != null) {
                anonymousClass4Yf.dCA();
            }
            this.f18468C.onStart();
        }
        this.f18469D -= f;
        if (this.f18469D < 0.0f) {
            this.f18472G = AnonymousClass4Yg.f55192E;
            this.f18471F = ((float) this.f18474I) + this.f18469D;
        } else {
            this.f18472G = AnonymousClass4Yg.f55193F;
            this.f18471F = this.f18469D;
        }
        this.f18467B.m5767L((double) this.f18471F);
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        double E = anonymousClass0cN.m5760E();
        double d = (double) this.f18471F;
        Double.isNaN(d);
        this.f18469D += (float) (E - d);
        this.f18471F = (float) anonymousClass0cN.m5760E();
        if (anonymousClass0cN.m5760E() > StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) {
            if (anonymousClass0cN.m5760E() < ((double) this.f18474I)) {
                this.f18468C.Es(this.f18472G, Math.round(this.f18471F));
                return;
            }
        }
        float E2 = (float) anonymousClass0cN.m5760E();
        if (this.f18473H) {
            Object obj = ((E2 > 0.0f || this.f18472G != AnonymousClass4Yg.f55192E) && (E2 < ((float) this.f18474I) || this.f18472G != AnonymousClass4Yg.f55193F)) ? null : 1;
            this.f18468C.ak(obj != null ? AnonymousClass4Yg.f55191D : AnonymousClass4Yg.f55190C);
            this.f18469D = 0.0f;
            this.f18471F = 0.0f;
            if (obj != null) {
                AnonymousClass4Yf anonymousClass4Yf = this.f18470E;
                if (anonymousClass4Yf != null) {
                    anonymousClass4Yf.cCA(this.f18468C.hK());
                }
            }
            this.f18473H = false;
        }
    }
}
