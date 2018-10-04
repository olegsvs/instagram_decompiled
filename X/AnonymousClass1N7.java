package X;

import android.view.View;
import android.widget.FrameLayout;
import com.facebook.C0164R;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.imageview.PulsingMultiImageView;

/* renamed from: X.1N7 */
public final class AnonymousClass1N7 implements AnonymousClass14l {
    /* renamed from: B */
    public final FrameLayout f17765B;
    /* renamed from: C */
    public final PulsingMultiImageView f17766C = ((PulsingMultiImageView) this.f17765B.findViewById(C0164R.id.tray_double_avatar_back));
    /* renamed from: D */
    public final PulsingMultiImageView f17767D = ((PulsingMultiImageView) this.f17765B.findViewById(C0164R.id.tray_double_avatar_front));
    /* renamed from: E */
    public final GradientSpinner f17768E;
    /* renamed from: F */
    public final View f17769F;

    public AnonymousClass1N7(View view) {
        FrameLayout frameLayout = (FrameLayout) view.findViewById(C0164R.id.avatar_container);
        this.f17765B = frameLayout;
        this.f17768E = (GradientSpinner) frameLayout.findViewById(C0164R.id.seen_state_circle_front);
        View findViewById = this.f17765B.findViewById(C0164R.id.double_avatar_live_badge);
        this.f17769F = findViewById;
        findViewById.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass1N8(this));
    }

    public final GradientSpinner aQ() {
        return this.f17768E;
    }

    public final View kI() {
        return this.f17767D;
    }
}
