package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.328 */
public final class AnonymousClass328 {
    /* renamed from: B */
    public final TextView f37179B;
    /* renamed from: C */
    public final IgImageView f37180C;
    /* renamed from: D */
    public final ImageView f37181D;
    /* renamed from: E */
    public final TextView f37182E;
    /* renamed from: F */
    public final View f37183F;
    /* renamed from: G */
    public final View f37184G;
    /* renamed from: H */
    public AnonymousClass32D f37185H;
    /* renamed from: I */
    public final TextView f37186I;

    public AnonymousClass328(View view, IgImageView igImageView, ImageView imageView, TextView textView, TextView textView2, View view2, TextView textView3) {
        this.f37183F = view;
        this.f37180C = igImageView;
        this.f37181D = imageView;
        this.f37186I = textView;
        this.f37182E = textView2;
        this.f37184G = view2;
        this.f37179B = textView3;
    }

    /* renamed from: A */
    public final void m18242A(boolean z) {
        this.f37183F.setActivated(z);
        this.f37181D.setVisibility(z ? 0 : 8);
    }
}
