package X;

import android.app.Activity;
import android.graphics.RectF;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.5pG */
public final class AnonymousClass5pG extends AnonymousClass0VA {
    /* renamed from: B */
    public final Activity f69207B;
    /* renamed from: C */
    public final UserDetailFragment f69208C;
    /* renamed from: D */
    public final boolean f69209D;
    /* renamed from: E */
    public AnonymousClass0MC f69210E;
    /* renamed from: F */
    public final AnonymousClass0Cm f69211F;

    public AnonymousClass5pG(Activity activity, AnonymousClass0Cm anonymousClass0Cm, UserDetailFragment userDetailFragment, boolean z) {
        this.f69207B = activity;
        this.f69211F = anonymousClass0Cm;
        this.f69208C = userDetailFragment;
        this.f69209D = z;
    }

    /* renamed from: A */
    public final void m28487A(AnonymousClass0MI anonymousClass0MI, String str) {
        RectF rectF;
        if (this.f69209D) {
            AnonymousClass10I G = UserDetailFragment.G(this.f69208C);
            if (G == null) {
                rectF = null;
            } else {
                rectF = G.iI();
            }
        } else {
            rectF = null;
        }
        AnonymousClass0MI anonymousClass0MI2 = anonymousClass0MI;
        AnonymousClass0MC FD = new AnonymousClass0MD(this.f69207B).A().XB("PendingMediaStore.INTENT_ACTION_PENDING_MEDIA_CHANGED", new AnonymousClass5pF(this, anonymousClass0MI)).FD();
        this.f69210E = FD;
        FD.A();
        AnonymousClass0Jd.f2931B.X(this.f69211F, this.f69207B, anonymousClass0MI2, rectF, str);
    }

    public final void ei() {
        AnonymousClass0MC anonymousClass0MC = this.f69210E;
        if (anonymousClass0MC != null) {
            anonymousClass0MC.B();
            this.f69210E = null;
        }
    }
}
