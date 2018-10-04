package X;

import android.graphics.Point;

/* renamed from: X.2er */
public class AnonymousClass2er extends AnonymousClass2cF {
    /* renamed from: B */
    public AnonymousClass2cB f32111B;
    /* renamed from: C */
    public float f32112C;
    /* renamed from: D */
    public AnonymousClass2LF f32113D;
    /* renamed from: E */
    public final AnonymousClass2LN f32114E;
    /* renamed from: F */
    private int f32115F;

    public AnonymousClass2er(AnonymousClass2LN anonymousClass2LN) {
        this(anonymousClass2LN.JJ(), anonymousClass2LN);
    }

    public AnonymousClass2er(String str, AnonymousClass2LN anonymousClass2LN) {
        super(str);
        this.f32115F = 16777215;
        this.f32112C = 1.0f;
        this.f32113D = AnonymousClass2LF.f29228J;
        this.f32114E = anonymousClass2LN;
    }

    /* renamed from: B */
    public static void m16765B(AnonymousClass2er anonymousClass2er) {
        AnonymousClass2cB anonymousClass2cB = anonymousClass2er.f32111B;
        if (anonymousClass2cB != null) {
            anonymousClass2cB.f31591C = anonymousClass2er.f32113D;
            anonymousClass2er.f32111B.f31592D = anonymousClass2er.f32115F;
            anonymousClass2er.f32111B.f31590B = anonymousClass2er.f32112C;
        }
    }

    public final void EW(AnonymousClass2LE anonymousClass2LE) {
        this.f32114E.EW(anonymousClass2LE);
    }

    public final AnonymousClass2LE LK() {
        return this.f32114E.LK();
    }

    public void LNA(int i) {
        super.LNA(i);
        this.f32114E.LNA(i);
    }

    public final void PPA(float[] fArr) {
        super.PPA(fArr);
        this.f32114E.PPA(fArr);
    }

    public final void XMA(int i) {
        super.XMA(i);
        this.f32114E.XMA(i);
    }

    public final void eRA(float f) {
        super.eRA(f);
        this.f32114E.eRA(f);
    }

    public final boolean isValid() {
        return this.f32114E.isValid();
    }

    public AnonymousClass2cG jF() {
        if (this.f32111B != null) {
            AnonymousClass2cG anonymousClass2fA = new AnonymousClass2fA(this);
            anonymousClass2fA.mo3633A(this);
            return anonymousClass2fA;
        }
        throw new IllegalStateException("backed brush can't make a mark without a backing");
    }

    public final void oMA(Point point) {
        super.oMA(point);
        if (point != null && this.f32111B == null && point.x * point.y > 0) {
            this.f32111B = new AnonymousClass2cB(LK(), point.x, point.y);
            AnonymousClass2er.m16765B(this);
            this.f32111B.m16486A();
        }
    }

    public final void pMA(AnonymousClass2LF anonymousClass2LF) {
        super.pMA(anonymousClass2LF);
        this.f32114E.pMA(anonymousClass2LF);
    }
}
