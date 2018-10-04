package X;

import android.text.TextUtils;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.Locale;

/* renamed from: X.3a6 */
public final class AnonymousClass3a6 implements AnonymousClass0VE {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3a7 f42407B;

    public final void Fz(SearchEditText searchEditText, String str) {
    }

    public AnonymousClass3a6(AnonymousClass3a7 anonymousClass3a7) {
        this.f42407B = anonymousClass3a7;
    }

    public final void Gz(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        String G = AnonymousClass0IE.G(charSequence);
        i = this.f42407B.f42408B;
        i2 = G.toLowerCase(Locale.getDefault());
        i.f42398C.clear();
        if (TextUtils.isEmpty(i2)) {
            i.f42398C.addAll(i.f42397B);
        } else {
            charSequence = i.f42397B.size();
            for (int i4 = 0; i4 < charSequence; i4++) {
                CountryCodeData countryCodeData = (CountryCodeData) i.f42397B.get(i4);
                if (AnonymousClass0IE.P(countryCodeData.m14824B(), i2, 0) || AnonymousClass0IE.P(countryCodeData.f28033C, i2, 0) || AnonymousClass0IE.P(countryCodeData.m14823A(), i2, 0)) {
                    i.f42398C.add(countryCodeData);
                }
            }
        }
        AnonymousClass0rF.B(i, -1075342464);
    }
}
