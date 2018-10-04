package X;

import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.shopping.model.ShippingAndReturnsPageSection;
import java.util.List;

/* renamed from: X.63K */
public final class AnonymousClass63K extends AnonymousClass0nJ {
    /* renamed from: B */
    public final List f71307B;

    public AnonymousClass63K(List list) {
        this.f71307B = list;
    }

    /* renamed from: B */
    public final int m28835B() {
        return this.f71307B.size();
    }

    /* renamed from: I */
    public final /* bridge */ /* synthetic */ void m28836I(AnonymousClass0oo anonymousClass0oo, int i) {
        AnonymousClass63J anonymousClass63J = (AnonymousClass63J) anonymousClass0oo;
        ShippingAndReturnsPageSection shippingAndReturnsPageSection = (ShippingAndReturnsPageSection) this.f71307B.get(i);
        anonymousClass63J.f71306C.setText(shippingAndReturnsPageSection.f43232C);
        i = anonymousClass63J.f71305B;
        String str = shippingAndReturnsPageSection.f43231B;
        i.setMovementMethod(LinkMovementMethod.getInstance());
        Spannable spannable = (Spannable) AnonymousClass2p1.C(new AnonymousClass63H(str), new String[0]);
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            spannable.setSpan(new AnonymousClass63I(i, uRLSpan), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 0);
        }
        i.setLinkTextColor(AnonymousClass0Ca.C(i.getContext(), C0164R.color.text_view_link_color));
        i.setText(spannable);
    }

    /* renamed from: J */
    public final AnonymousClass0oo m28837J(ViewGroup viewGroup, int i) {
        return new AnonymousClass63J(LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.product_details_secondary_information_section, viewGroup, false));
    }
}
