package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.16e */
public final class AnonymousClass16e implements AnonymousClass14l {
    /* renamed from: B */
    public final AnonymousClass0ct f14565B;
    /* renamed from: C */
    public final ViewStub f14566C;
    /* renamed from: D */
    public final AnonymousClass16f f14567D;
    /* renamed from: E */
    public View f14568E;
    /* renamed from: F */
    public final ViewStub f14569F;
    /* renamed from: G */
    public TextView f14570G;
    /* renamed from: H */
    public final ViewStub f14571H;
    /* renamed from: I */
    public ReelBrandingBadgeView f14572I;
    /* renamed from: J */
    public final AnonymousClass0ct f14573J;

    public AnonymousClass16e(View view) {
        this.f14567D = new AnonymousClass16f(view);
        this.f14571H = (ViewStub) view.findViewById(C0164R.id.offline_stub);
        this.f14569F = (ViewStub) view.findViewById(C0164R.id.empty_badge_stub);
        this.f14566C = (ViewStub) view.findViewById(C0164R.id.branding_badge_stub);
        this.f14565B = new AnonymousClass0ct((ViewStub) view.findViewById(C0164R.id.avatar_checkmark_overlay_stub));
        this.f14573J = new AnonymousClass0ct((ViewStub) view.findViewById(C0164R.id.suggested_highlight_add_icon));
    }

    public final GradientSpinner aQ() {
        return this.f14567D.aQ();
    }

    public final View kI() {
        return this.f14567D.kI();
    }
}
