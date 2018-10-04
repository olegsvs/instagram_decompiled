package X;

import android.graphics.PointF;
import com.instagram.ui.widget.drawing.common.Point2;

/* renamed from: X.2c6 */
public final class AnonymousClass2c6 implements AnonymousClass2Kz {
    /* renamed from: B */
    public double f31568B;
    /* renamed from: C */
    public double f31569C = 8.0d;
    /* renamed from: D */
    private AnonymousClass2Ku f31570D;
    /* renamed from: E */
    private final float f31571E;
    /* renamed from: F */
    private final Point2 f31572F = new Point2();
    /* renamed from: G */
    private final Point2 f31573G = new Point2();
    /* renamed from: H */
    private final Point2 f31574H = new Point2();
    /* renamed from: I */
    private final float f31575I;
    /* renamed from: J */
    private final Point2 f31576J = new Point2();

    public AnonymousClass2c6(float f, float f2) {
        this.f31575I = f;
        this.f31571E = f2;
    }

    /* renamed from: A */
    public final void m16469A() {
        this.f31572F.m15123B(this.f31573G, this.f31574H);
        this.f31572F.m15125D(this.f31575I);
        this.f31576J.m15122A(this.f31572F);
        this.f31576J.m15125D(this.f31571E);
        this.f31574H.m15122A(this.f31576J);
        this.f31568B += this.f31569C;
        this.f31570D.m15119A(this.f31574H, (long) this.f31568B);
    }

    public final void SOA(AnonymousClass2Kw anonymousClass2Kw) {
        this.f31573G.set(anonymousClass2Kw.f29191B);
        long j = anonymousClass2Kw.f29192C;
        while (this.f31568B + this.f31569C < ((double) j)) {
            m16469A();
        }
    }

    public final void UUA(AnonymousClass2Kw anonymousClass2Kw) {
        this.f31570D = new AnonymousClass2Ku(anonymousClass2Kw.f29191B, anonymousClass2Kw.f29192C);
        this.f31568B = (double) anonymousClass2Kw.f29192C;
        this.f31574H.set(anonymousClass2Kw.f29191B);
        this.f31576J.set(0.0f, 0.0f);
    }

    public final AnonymousClass2c2 pR() {
        return this.f31570D.f29179B;
    }

    public final void wE(long j) {
        float C = this.f31574H.m15124C(this.f31573G);
        PointF point2 = new Point2();
        float f = C;
        while (C > 0.0f && r2 > 0.0f) {
            point2.set(this.f31574H);
            m16469A();
            f = this.f31574H.m15124C(point2);
            C -= f;
        }
    }
}
