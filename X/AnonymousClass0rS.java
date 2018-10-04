package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.0rS */
public final class AnonymousClass0rS extends AnonymousClass0oo {
    /* renamed from: B */
    public final ViewGroup f11195B;
    /* renamed from: C */
    public final ViewGroup f11196C;
    /* renamed from: D */
    public final ViewGroup f11197D;
    /* renamed from: E */
    public final ImageView f11198E;
    /* renamed from: F */
    public final ImageView f11199F;
    /* renamed from: G */
    public String f11200G;
    /* renamed from: H */
    public final IgImageView f11201H;
    /* renamed from: I */
    public final TextView f11202I;
    /* renamed from: J */
    public final TextView f11203J;
    /* renamed from: K */
    public final TextView f11204K;
    /* renamed from: L */
    public final TextView f11205L;
    /* renamed from: M */
    public final TextView f11206M;

    public AnonymousClass0rS(View view) {
        super(view);
        this.f11195B = (ViewGroup) view.findViewById(C0164R.id.megaphone_content);
        ImageView imageView = (ImageView) view.findViewById(C0164R.id.dismiss_button);
        this.f11198E = imageView;
        imageView.getDrawable().mutate().setColorFilter(AnonymousClass0ca.m5921B(AnonymousClass0Ca.m937C(view.getContext(), C0164R.color.grey_5)));
        this.f11206M = (TextView) view.findViewById(C0164R.id.title);
        this.f11202I = (TextView) view.findViewById(C0164R.id.message);
        this.f11201H = (IgImageView) view.findViewById(C0164R.id.megaphone_icon);
        this.f11199F = (ImageView) view.findViewById(C0164R.id.megaphone_social_context_facepile);
        this.f11205L = (TextView) view.findViewById(C0164R.id.megaphone_social_context_text);
        this.f11197D = (ViewGroup) view.findViewById(C0164R.id.button_placeholder);
        ViewGroup B = AnonymousClass0rU.m7959B(this.f11195B, this.f11197D, null, null, AnonymousClass0rT.TWO_BUTTON_VERTICAL_WITH_PRIMARY_INVERSE);
        this.f11196C = B;
        if (B != null) {
            this.f11203J = (TextView) B.findViewById(C0164R.id.primary_button);
            this.f11204K = (TextView) this.f11196C.findViewById(C0164R.id.inverse_primary_button);
            return;
        }
        this.f11203J = null;
        this.f11204K = null;
    }
}
