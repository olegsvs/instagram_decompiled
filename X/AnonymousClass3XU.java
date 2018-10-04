package X;

import android.text.TextWatcher;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.phonenumber.model.CountryCodeData;

/* renamed from: X.3XU */
public final class AnonymousClass3XU {
    /* renamed from: B */
    public final ImageView f42061B;
    /* renamed from: C */
    public AnonymousClass3a7 f42062C;
    /* renamed from: D */
    public final TextView f42063D;
    /* renamed from: E */
    public final AnonymousClass0IJ f42064E;
    /* renamed from: F */
    public boolean f42065F = false;
    /* renamed from: G */
    public final AutoCompleteTextView f42066G;
    /* renamed from: H */
    public AnonymousClass3a4 f42067H;
    /* renamed from: I */
    public String f42068I;
    /* renamed from: J */
    public final TextWatcher f42069J = new AnonymousClass3XR(this);
    /* renamed from: K */
    private final AnonymousClass2Na f42070K;

    public AnonymousClass3XU(AnonymousClass0IJ anonymousClass0IJ, AnonymousClass2Na anonymousClass2Na, AutoCompleteTextView autoCompleteTextView, TextView textView, CountryCodeData countryCodeData, ImageView imageView) {
        this.f42066G = autoCompleteTextView;
        this.f42061B = imageView;
        this.f42070K = anonymousClass2Na;
        this.f42063D = textView;
        this.f42064E = anonymousClass0IJ;
        this.f42067H = new AnonymousClass3a4(countryCodeData, this.f42064E.getActivity(), this.f42066G, this.f42070K, this.f42063D);
    }

    /* renamed from: A */
    public final void m19880A() {
        this.f42063D.setEnabled(false);
        this.f42066G.setEnabled(false);
        this.f42061B.setVisibility(4);
    }

    /* renamed from: B */
    public final void m19881B() {
        this.f42063D.setEnabled(true);
        this.f42066G.setEnabled(true);
        this.f42061B.setVisibility(AnonymousClass0Nm.P(this.f42066G) ? 4 : 0);
    }

    /* renamed from: C */
    public final CountryCodeData m19882C() {
        return this.f42067H.f42401C;
    }

    /* renamed from: D */
    public final String m19883D() {
        if (this.f42067H.f42401C == null) {
            return JsonProperty.USE_DEFAULT_NAME;
        }
        return AnonymousClass3X4.m19839D(this.f42067H.f42401C.m14823A(), AnonymousClass0Nm.K(this.f42066G));
    }

    /* renamed from: E */
    public final void m19884E() {
        if (AnonymousClass0Nm.P(this.f42066G)) {
            this.f42067H.m20067A();
            this.f42065F = AnonymousClass0Nm.P(this.f42066G) ^ 1;
            this.f42068I = this.f42066G.getText().toString();
        }
    }

    /* renamed from: F */
    public final void m19885F(CountryCodeData countryCodeData) {
        if (this.f42067H.f42401C != null) {
            AnonymousClass0Fr.CountryCodeChange.G(this.f42070K, AnonymousClass0Oh.PHONE).m15361B("from_country", this.f42067H.f42401C.f28032B).m15361B("from_code", this.f42067H.f42401C.f28033C).m15361B("to_country", countryCodeData.f28032B).m15361B("to_code", countryCodeData.f28033C).m15364E();
        }
        this.f42067H.f42401C = countryCodeData;
        this.f42063D.setText(countryCodeData.m14825C());
        this.f42067H.m20068B();
    }
}
