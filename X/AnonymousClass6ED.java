package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.C0164R;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.imageview.PulsingMultiImageView;

/* renamed from: X.6ED */
public final class AnonymousClass6ED implements AnonymousClass5nF {
    /* renamed from: B */
    public final FrameLayout f73104B;
    /* renamed from: C */
    public final PulsingMultiImageView f73105C = ((PulsingMultiImageView) this.f73104B.findViewById(C0164R.id.tray_double_avatar_back));
    /* renamed from: D */
    public final PulsingMultiImageView f73106D = ((PulsingMultiImageView) this.f73104B.findViewById(C0164R.id.tray_double_avatar_front));
    /* renamed from: E */
    public final GradientSpinner f73107E;
    /* renamed from: F */
    public final View f73108F;

    public AnonymousClass6ED(View view) {
        FrameLayout frameLayout = (FrameLayout) view.findViewById(C0164R.id.cobroadcast_avatar_container);
        this.f73104B = frameLayout;
        this.f73107E = (GradientSpinner) frameLayout.findViewById(C0164R.id.seen_state_circle_front);
        View findViewById = this.f73104B.findViewById(C0164R.id.double_avatar_live_badge);
        this.f73108F = findViewById;
        findViewById.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass5mW(this));
    }

    public final GradientSpinner aQ() {
        return this.f73107E;
    }

    public final void eV() {
        this.f73104B.setVisibility(4);
    }

    public final RectF iI() {
        return AnonymousClass0Nm.L(kI());
    }

    public final View kI() {
        return this.f73104B;
    }

    public final boolean lI(Rect rect) {
        return kI().getGlobalVisibleRect(rect);
    }

    public final void xTA() {
        this.f73104B.setVisibility(0);
    }
}
