package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.13J */
public final class AnonymousClass13J extends AnonymousClass0oo implements AnonymousClass10N {
    /* renamed from: B */
    public final CircularImageView f13679B;
    /* renamed from: C */
    public final IgImageView f13680C;
    /* renamed from: D */
    public final View f13681D;
    /* renamed from: E */
    public final TextView f13682E;
    /* renamed from: F */
    public final TextView f13683F;
    /* renamed from: G */
    public final View f13684G;
    /* renamed from: H */
    public AnonymousClass13M f13685H;
    /* renamed from: I */
    public String f13686I;
    /* renamed from: J */
    public final AnonymousClass13K f13687J;

    public final int BN() {
        return 0;
    }

    public final GradientSpinner aQ() {
        return null;
    }

    public final void qC(float f) {
    }

    public final void wQA(AnonymousClass3bB anonymousClass3bB) {
    }

    public final int zM() {
        return 0;
    }

    public AnonymousClass13J(View view) {
        super(view);
        this.f13684G = view;
        this.f13680C = (IgImageView) view.findViewById(C0164R.id.background_content);
        this.f13681D = view.findViewById(C0164R.id.background_content_black_overlay);
        this.f13679B = (CircularImageView) view.findViewById(C0164R.id.owner_avatar);
        this.f13683F = (TextView) view.findViewById(C0164R.id.highlight_title);
        this.f13682E = (TextView) view.findViewById(C0164R.id.highlight_owner);
        this.f13687J = AnonymousClass16X.m9431B(view, this);
        Context context = this.f13684G.getContext();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0164R.dimen.tray_item_background_content_width);
        int H = (int) (((float) dimensionPixelSize) / AnonymousClass0Nm.m3429H(AnonymousClass0Nm.m3428G(context)));
        if (this.f13684G.getLayoutParams() == null) {
            LayoutParams anonymousClass12d = new AnonymousClass12d(dimensionPixelSize, H);
            anonymousClass12d.leftMargin = context.getResources().getDimensionPixelSize(C0164R.dimen.tray_in_feed_item_margin);
            anonymousClass12d.rightMargin = context.getResources().getDimensionPixelSize(C0164R.dimen.tray_in_feed_item_margin);
            this.f13684G.setLayoutParams(anonymousClass12d);
            return;
        }
        AnonymousClass0Nm.m3445X(this.f13684G, dimensionPixelSize, H);
    }

    public final View UM() {
        return this.f13684G;
    }

    public final View VQ() {
        return this.f13684G;
    }

    public final String XQ() {
        return this.f13686I;
    }

    public final View dN() {
        return this.f13683F;
    }

    public final void eV() {
        this.f13679B.setVisibility(4);
    }

    public final RectF iI() {
        return AnonymousClass0Nm.m3433L(this.f13679B);
    }

    public final View jI() {
        return this.f13679B;
    }

    public final View kI() {
        return this.f13679B;
    }

    public final void lU(float f) {
        float f2 = 1.0f - f;
        this.f13679B.setAlpha(f2);
        this.f13681D.setAlpha(f2);
    }

    public final RectF rM() {
        return AnonymousClass0Nm.m3433L(this.f13684G);
    }

    public final AnonymousClass13M tO() {
        return this.f13685H;
    }

    public final View xO() {
        return this.f13684G;
    }

    public final void xTA() {
        this.f13679B.setVisibility(0);
    }
}
