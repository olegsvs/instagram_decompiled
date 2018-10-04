package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewStub;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.4bK */
public final class AnonymousClass4bK implements AnonymousClass10I {
    /* renamed from: B */
    public final View f55608B;
    /* renamed from: C */
    public ViewStub f55609C;
    /* renamed from: D */
    public final AnonymousClass5VE f55610D;
    /* renamed from: E */
    public CircularImageView f55611E;
    /* renamed from: F */
    public GradientSpinner f55612F;

    public AnonymousClass4bK(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Um anonymousClass0Um, View view, AnonymousClass5VE anonymousClass5VE) {
        this.f55608B = view.findViewById(C0164R.id.avatar_container);
        this.f55611E = (CircularImageView) view.findViewById(C0164R.id.row_profile_header_imageview);
        this.f55612F = (GradientSpinner) view.findViewById(C0164R.id.reel_ring);
        this.f55609C = (ViewStub) view.findViewById(C0164R.id.empty_badge_stub);
        this.f55610D = anonymousClass5VE;
        this.f55612F.E();
        this.f55612F.setGradientColors(anonymousClass0Um == AnonymousClass0Um.FAVORITES ? C0164R.style.CloseFriendsGradientPatternStyle : C0164R.style.GradientPatternStyle);
        this.f55612F.B();
        AnonymousClass0Ci B = anonymousClass0Cm.B();
        if (B.DQ() != null) {
            this.f55611E.setUrl(B.DQ());
        } else {
            this.f55611E.setImageDrawable(AnonymousClass0Ca.E(context, C0164R.drawable.profile_anonymous_user));
        }
        AnonymousClass15z anonymousClass15z = new AnonymousClass15z(this.f55608B);
        anonymousClass15z.f14386F = true;
        anonymousClass15z.f14385E = new AnonymousClass4bJ(this);
        anonymousClass15z.A();
    }

    public final GradientSpinner aQ() {
        return this.f55612F;
    }

    public final void eV() {
        kI().setVisibility(4);
    }

    public final RectF iI() {
        return AnonymousClass0Nm.L(kI());
    }

    public final View kI() {
        return this.f55608B;
    }

    public final void xTA() {
        kI().setVisibility(0);
    }
}
