package X;

import android.view.View;
import com.facebook.C0164R;
import com.instagram.business.ui.BusinessNavBar;

/* renamed from: X.35j */
public final class AnonymousClass35j extends AnonymousClass0VA {
    /* renamed from: B */
    public boolean f37745B;
    /* renamed from: C */
    public BusinessNavBar f37746C;
    /* renamed from: D */
    public AnonymousClass35i f37747D;
    /* renamed from: E */
    private View f37748E;

    public AnonymousClass35j(AnonymousClass35i anonymousClass35i, BusinessNavBar businessNavBar) {
        this(anonymousClass35i, businessNavBar, C0164R.string.next, -1);
    }

    public AnonymousClass35j(AnonymousClass35i anonymousClass35i, BusinessNavBar businessNavBar, int i, int i2) {
        this.f37747D = anonymousClass35i;
        this.f37746C = businessNavBar;
        this.f37746C.setPrimaryButtonText(i);
        if (i2 != -1) {
            this.f37746C.setSecondaryButtonText(i2);
        } else {
            this.f37746C.m18470E(false);
        }
    }

    public AnonymousClass35j(AnonymousClass35i anonymousClass35i, BusinessNavBar businessNavBar, int i, int i2, View view) {
        this(anonymousClass35i, businessNavBar, i, i2);
        this.f37748E = view;
        this.f37746C.m18468C(this.f37748E, true);
    }

    /* renamed from: A */
    public final void m18471A() {
        this.f37745B = false;
        this.f37746C.setShowProgressBarOnPrimaryButton(this.f37745B);
        this.f37747D.FH();
    }

    /* renamed from: B */
    public final void m18472B() {
        this.f37745B = true;
        this.f37746C.setShowProgressBarOnPrimaryButton(this.f37745B);
        this.f37747D.bG();
    }

    public final void gi() {
        super.gi();
        this.f37747D = null;
        this.f37746C = null;
    }

    public final void wh(View view) {
        super.wh(view);
        this.f37746C.setPrimaryButtonOnclickListeners(new AnonymousClass35g(this));
        this.f37746C.setSecondaryButtonOnclickListeners(new AnonymousClass35h(this));
    }
}
