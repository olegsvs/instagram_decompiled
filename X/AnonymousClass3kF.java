package X;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: X.3kF */
public final class AnonymousClass3kF implements OnPreDrawListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3kR f43932B;
    /* renamed from: C */
    public final /* synthetic */ int f43933C;
    /* renamed from: D */
    public final /* synthetic */ int f43934D;
    /* renamed from: E */
    public final /* synthetic */ boolean f43935E;

    public AnonymousClass3kF(AnonymousClass3kR anonymousClass3kR, int i, int i2, boolean z) {
        this.f43932B = anonymousClass3kR;
        this.f43933C = i;
        this.f43934D = i2;
        this.f43935E = z;
    }

    public final boolean onPreDraw() {
        float f;
        this.f43932B.f43950C.getViewTreeObserver().removeOnPreDrawListener(this);
        AnonymousClass3kR anonymousClass3kR = this.f43932B;
        int i = this.f43933C;
        int i2 = this.f43934D;
        boolean z = this.f43935E;
        if (!z) {
            i2 -= anonymousClass3kR.f43950C.getHeight();
        }
        anonymousClass3kR.f43950C.setTranslationY((float) (((i2 - anonymousClass3kR.f43960M.top) - anonymousClass3kR.f43951D.getPaddingTop()) + (z ? -anonymousClass3kR.f43950C.getPaddingTop() : anonymousClass3kR.f43950C.getPaddingBottom())));
        View upperNub = z ? anonymousClass3kR.f43950C.getUpperNub() : anonymousClass3kR.f43950C.getLowerNub();
        int width = anonymousClass3kR.f43950C.getWidth();
        i -= upperNub.getWidth() / 2;
        int paddingLeft = ((i - (width / 2)) + (anonymousClass3kR.f43950C.getPaddingLeft() / 2)) - anonymousClass3kR.f43960M.left;
        AnonymousClass3kM anonymousClass3kM = anonymousClass3kR.f43958K;
        AnonymousClass3kM anonymousClass3kM2 = AnonymousClass3kM.INSET;
        if (anonymousClass3kM.equals(anonymousClass3kM2) && paddingLeft < 0) {
            paddingLeft = 0 - anonymousClass3kR.f43950C.getPaddingLeft();
        }
        int J = AnonymousClass0Nm.J(anonymousClass3kR.f43950C.getContext());
        if (anonymousClass3kR.f43963P.equals(anonymousClass3kM2) && r8 + width > J) {
            paddingLeft = (J - width) + anonymousClass3kR.f43950C.getPaddingRight();
        }
        anonymousClass3kR.f43950C.setX((float) paddingLeft);
        i -= (int) anonymousClass3kR.f43950C.getX();
        anonymousClass3kR.f43959L = i;
        upperNub.setX((float) i);
        int i3 = 4;
        anonymousClass3kR.f43950C.getUpperNub().setVisibility(z ? 0 : 4);
        View lowerNub = anonymousClass3kR.f43950C.getLowerNub();
        if (!z) {
            i3 = 0;
        }
        lowerNub.setVisibility(i3);
        i2 = this.f43932B.f43959L + ((this.f43935E ? this.f43932B.f43950C.getUpperNub() : this.f43932B.f43950C.getLowerNub()).getWidth() / 2);
        anonymousClass3kR = this.f43932B;
        boolean z2 = this.f43935E;
        AnonymousClass3kQ anonymousClass3kQ = anonymousClass3kR.f43962O;
        anonymousClass3kR.f43959L = i2;
        anonymousClass3kR.f43965R = z2;
        AnonymousClass14H C = AnonymousClass14H.C(anonymousClass3kR.f43950C).J().C(0.0f, 1.0f, (float) i2);
        if (z2) {
            f = 0.0f;
        } else {
            f = (float) anonymousClass3kR.f43950C.getHeight();
        }
        C = C.D(0.0f, 1.0f, f).A(0.0f, 1.0f);
        C.f13863c = 0;
        C.f13849O = new AnonymousClass3kJ(anonymousClass3kR);
        C.f13848N = new AnonymousClass3kI(anonymousClass3kR, anonymousClass3kQ);
        C.N();
        return false;
    }
}
