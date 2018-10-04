package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import com.instagram.ui.widget.badgeicon.BadgeIconView;
import com.instagram.ui.widget.imagebutton.IgImageButton;
import com.instagram.ui.widget.imageview.BlinkingImageView;

/* renamed from: X.4oE */
public final class AnonymousClass4oE {
    /* renamed from: B */
    public final AnonymousClass0ct f57500B;
    /* renamed from: C */
    public final BlinkingImageView f57501C;
    /* renamed from: D */
    public final ImageView f57502D;
    /* renamed from: E */
    public final IgImageButton f57503E;
    /* renamed from: F */
    public final boolean f57504F;
    /* renamed from: G */
    public final SimpleVideoLayout f57505G;
    /* renamed from: H */
    public boolean f57506H;
    /* renamed from: I */
    public final Drawable f57507I;
    /* renamed from: J */
    public final TextView f57508J;
    /* renamed from: K */
    public final TextView f57509K;
    /* renamed from: L */
    public final ImageView f57510L;
    /* renamed from: M */
    public final AnonymousClass0ct f57511M;
    /* renamed from: N */
    public final View f57512N;
    /* renamed from: O */
    public final View f57513O;
    /* renamed from: P */
    private BadgeIconView f57514P;
    /* renamed from: Q */
    private CircularImageView f57515Q;

    public AnonymousClass4oE(SimpleVideoLayout simpleVideoLayout, IgImageButton igImageButton, ImageView imageView, View view, BlinkingImageView blinkingImageView, ImageView imageView2, TextView textView, TextView textView2, ViewStub viewStub, ImageView imageView3, ViewStub viewStub2, boolean z) {
        AnonymousClass0ct anonymousClass0ct;
        this.f57505G = simpleVideoLayout;
        this.f57503E = igImageButton;
        this.f57502D = imageView;
        this.f57513O = view;
        this.f57501C = blinkingImageView;
        this.f57512N = imageView2;
        this.f57508J = textView;
        this.f57509K = textView2;
        this.f57500B = new AnonymousClass0ct(viewStub);
        this.f57510L = imageView3;
        if (viewStub2 == null) {
            anonymousClass0ct = null;
        } else {
            anonymousClass0ct = new AnonymousClass0ct(viewStub2);
        }
        this.f57511M = anonymousClass0ct;
        this.f57504F = z;
        this.f57507I = blinkingImageView.getBackground();
        igImageButton.setEnableTouchOverlay(false);
        int intValue = ((Integer) AnonymousClass0CC.wO.G()).intValue();
        if (intValue > 0) {
            AnonymousClass0ag anonymousClass0ag = new AnonymousClass0ag();
            anonymousClass0ag.f6598C = intValue;
            igImageButton.setProgressiveImageConfig(anonymousClass0ag);
        }
    }

    /* renamed from: A */
    public final void m25110A(boolean z) {
        BlinkingImageView blinkingImageView = this.f57501C;
        boolean z2 = !this.f57506H && z;
        blinkingImageView.setBlinking(z2);
    }

    /* renamed from: B */
    public final void m25111B(String str, int i, int i2) {
        if (AnonymousClass4oE.m25109B(this)) {
            this.f57511M.D(0);
            this.f57515Q.setUrl(str);
            if (i == 0) {
                this.f57514P.setVisibility(8);
                return;
            }
            this.f57514P.setVisibility(0);
            this.f57514P.setIconDrawable(i);
            this.f57514P.setIconTintColorResource(i2);
        }
    }

    /* renamed from: B */
    private static boolean m25109B(AnonymousClass4oE anonymousClass4oE) {
        AnonymousClass0ct anonymousClass0ct = anonymousClass4oE.f57511M;
        if (anonymousClass0ct == null) {
            return false;
        }
        if (anonymousClass0ct.C()) {
            return true;
        }
        anonymousClass4oE.f57511M.D(0);
        anonymousClass4oE.f57515Q = (CircularImageView) anonymousClass4oE.f57511M.A().findViewById(C0164R.id.profile_picture);
        BadgeIconView badgeIconView = (BadgeIconView) anonymousClass4oE.f57511M.A().findViewById(C0164R.id.profile_picture_badge);
        anonymousClass4oE.f57514P = badgeIconView;
        badgeIconView.setIconSizeFactor(0.65f);
        return true;
    }
}
