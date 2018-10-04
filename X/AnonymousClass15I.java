package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: X.15I */
public final class AnonymousClass15I implements AnonymousClass15J, AnonymousClass15K {
    /* renamed from: B */
    public ViewGroup f14252B;
    /* renamed from: C */
    public AnonymousClass13K f14253C;
    /* renamed from: D */
    public View f14254D;
    /* renamed from: E */
    public ImageView f14255E;
    /* renamed from: F */
    public AnonymousClass0ZF f14256F;
    /* renamed from: G */
    public AnonymousClass0P7 f14257G;
    /* renamed from: H */
    public final ViewStub f14258H;
    /* renamed from: I */
    public TextView f14259I;
    /* renamed from: J */
    public AnonymousClass13K f14260J;
    /* renamed from: K */
    public View f14261K;
    /* renamed from: L */
    public View f14262L;
    /* renamed from: M */
    public AnonymousClass0QI f14263M;

    public final void Ux(AnonymousClass13K anonymousClass13K) {
    }

    public final void Xq(View view) {
    }

    public final void Ye(AnonymousClass13K anonymousClass13K) {
    }

    public final void Ze(AnonymousClass13K anonymousClass13K) {
    }

    public AnonymousClass15I(ViewStub viewStub) {
        this.f14258H = viewStub;
    }

    /* renamed from: A */
    public final AnonymousClass13K m9301A(View view) {
        AnonymousClass15z anonymousClass15z = new AnonymousClass15z(view);
        anonymousClass15z.f14382B = this;
        anonymousClass15z.f14393M = true;
        anonymousClass15z.f14386F = true;
        anonymousClass15z = anonymousClass15z.m9346C(false);
        anonymousClass15z.f14389I = 0.85f;
        anonymousClass15z.f14390J = AnonymousClass15d.f14333B;
        anonymousClass15z.f14385E = this;
        return anonymousClass15z.m9344A();
    }

    /* renamed from: B */
    public final void m9302B(AnonymousClass0Cm anonymousClass0Cm, Runnable runnable) {
        AnonymousClass162 anonymousClass162 = (AnonymousClass162) this.f14255E.getDrawable();
        anonymousClass162.m9359B(AnonymousClass161.m9349D(anonymousClass0Cm, this.f14256F.m5343A()));
        anonymousClass162.f14404D = runnable;
        anonymousClass162.f14422V.m5769N(1.0d);
    }

    public final void ae(AnonymousClass13K anonymousClass13K) {
        float A = anonymousClass13K.m9099A();
        AnonymousClass162 anonymousClass162 = (AnonymousClass162) this.f14255E.getDrawable();
        if (anonymousClass13K.f13694G == this.f14254D) {
            anonymousClass162.f14406F = A;
            anonymousClass162.invalidateSelf();
            return;
        }
        anonymousClass162.f14417Q = A;
        anonymousClass162.invalidateSelf();
    }

    public final boolean yCA(View view) {
        int i = 0;
        this.f14253C.m9103F(false);
        this.f14260J.m9103F(false);
        AnonymousClass162 anonymousClass162 = (AnonymousClass162) this.f14255E.getDrawable();
        if (view == this.f14254D) {
            anonymousClass162.f14423W = Integer.valueOf(0);
            anonymousClass162.invalidateSelf();
        } else {
            anonymousClass162.f14423W = Integer.valueOf(1);
            anonymousClass162.invalidateSelf();
        }
        AnonymousClass0QI anonymousClass0QI = this.f14263M;
        AnonymousClass160 A = this.f14256F.m5343A();
        AnonymousClass0P7 anonymousClass0P7 = this.f14257G;
        if (view != this.f14254D) {
            i = 1;
        }
        anonymousClass0QI.Au(this, A, anonymousClass0P7, i);
        return true;
    }
}
