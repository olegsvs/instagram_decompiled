package X;

import android.app.Dialog;
import android.content.DialogInterface.OnClickListener;
import com.facebook.C0164R;
import com.instagram.model.shopping.Product;

/* renamed from: X.63W */
public final class AnonymousClass63W {
    /* renamed from: B */
    public final Dialog f71323B;
    /* renamed from: C */
    public final AnonymousClass0IL f71324C;
    /* renamed from: D */
    public final String f71325D;
    /* renamed from: E */
    public final CharSequence[] f71326E;
    /* renamed from: F */
    public final Product f71327F;
    /* renamed from: G */
    public final int f71328G;
    /* renamed from: H */
    public final AnonymousClass0Cm f71329H;
    /* renamed from: I */
    private final OnClickListener f71330I = new AnonymousClass63V(this);

    public AnonymousClass63W(AnonymousClass0IL anonymousClass0IL, int i, AnonymousClass0Cm anonymousClass0Cm, Product product, String str) {
        this.f71324C = anonymousClass0IL;
        this.f71329H = anonymousClass0Cm;
        this.f71328G = i;
        this.f71327F = product;
        this.f71325D = str;
        this.f71326E = new CharSequence[]{this.f71324C.getString(C0164R.string.shopping_viewer_add_posts), this.f71324C.getString(C0164R.string.shopping_viewer_remove_posts)};
        this.f71323B = new AnonymousClass0Sb(this.f71324C.getContext()).G(this.f71326E, this.f71330I).F(true).C();
    }
}
