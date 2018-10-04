package X;

import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.follow.chaining.FollowChainingButton;
import com.instagram.hashtag.ui.HashtagFollowButton;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.4sF */
public final class AnonymousClass4sF implements AnonymousClass10I {
    /* renamed from: B */
    public View f58032B;
    /* renamed from: C */
    public HashtagFollowButton f58033C;
    /* renamed from: D */
    public FollowChainingButton f58034D;
    /* renamed from: E */
    public FrameLayout f58035E;
    /* renamed from: F */
    public TextView f58036F;
    /* renamed from: G */
    public TextView f58037G;
    /* renamed from: H */
    public final ColorDrawable f58038H = new ColorDrawable(AnonymousClass0Ca.C(this.f58032B.getContext(), C0164R.color.grey_0));
    /* renamed from: I */
    public ReelBrandingBadgeView f58039I;
    /* renamed from: J */
    public CircularImageView f58040J;
    /* renamed from: K */
    public GradientSpinner f58041K;
    /* renamed from: L */
    public View f58042L;

    public AnonymousClass4sF(View view) {
        this.f58032B = view.findViewById(C0164R.id.hashtag_feed_header_container);
        this.f58042L = view.findViewById(C0164R.id.reel);
        this.f58041K = (GradientSpinner) view.findViewById(C0164R.id.reel_ring);
        CircularImageView circularImageView = (CircularImageView) view.findViewById(C0164R.id.profile_image);
        this.f58040J = circularImageView;
        circularImageView.setScaleType(ScaleType.CENTER_CROP);
        this.f58039I = (ReelBrandingBadgeView) view.findViewById(C0164R.id.branding_badge);
        this.f58037G = (TextView) view.findViewById(C0164R.id.hashtag_media_count);
        this.f58033C = (HashtagFollowButton) view.findViewById(C0164R.id.follow_button);
        this.f58036F = (TextView) view.findViewById(C0164R.id.hashtag_header_subtitle);
        this.f58034D = (FollowChainingButton) view.findViewById(C0164R.id.follow_chaining_button);
        this.f58035E = (FrameLayout) view.findViewById(C0164R.id.follow_chaining_container);
        this.f58040J.setPlaceHolderColor(this.f58038H);
    }

    public final GradientSpinner aQ() {
        return this.f58041K;
    }

    public final void eV() {
        this.f58040J.setVisibility(4);
    }

    public final RectF iI() {
        return AnonymousClass0Nm.L(this.f58040J);
    }

    public final View kI() {
        return this.f58040J;
    }

    public final void xTA() {
        this.f58040J.setVisibility(0);
    }
}
