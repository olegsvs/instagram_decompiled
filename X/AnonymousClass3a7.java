package X;

import android.app.Dialog;
import android.graphics.ColorFilter;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.facebook.C0164R;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: X.3a7 */
public final class AnonymousClass3a7 extends AnonymousClass1Pn {
    /* renamed from: B */
    public AnonymousClass3a2 f42408B;
    /* renamed from: C */
    public AnonymousClass3a1 f42409C;
    /* renamed from: D */
    public SearchEditText f42410D;
    /* renamed from: E */
    private List f42411E;

    public final void onActivityCreated(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1913745824);
        super.onActivityCreated(bundle);
        this.f15926D.getWindow().setSoftInputMode(36);
        AnonymousClass0cQ.G(this, -1897744351, F);
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1698677988);
        super.onCreate(bundle);
        AnonymousClass25b anonymousClass25b = new AnonymousClass25b((TelephonyManager) getContext().getSystemService("phone"));
        PhoneNumberUtil C = PhoneNumberUtil.m13830C(getContext());
        this.f42411E = new ArrayList();
        for (Locale locale : new AnonymousClass25Z(anonymousClass25b, Locale.getDefault().getLanguage())) {
            int E = C.m13856E(locale.getCountry());
            if (E != 0) {
                this.f42411E.add(new CountryCodeData(String.valueOf(E), locale.getDisplayCountry(), locale.getCountry()));
            }
        }
        Collections.sort(this.f42411E);
        AnonymousClass0cQ.G(this, 1129334271, F);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        super.onCreateDialog(bundle);
        AnonymousClass0Sb anonymousClass0Sb = new AnonymousClass0Sb(getContext());
        anonymousClass0Sb.R(getString(C0164R.string.select_your_country).toUpperCase(Locale.getDefault()));
        View inflate = LayoutInflater.from(getContext()).inflate(C0164R.layout.dialog_country_codes, null);
        ListView listView = (ListView) inflate.findViewById(C0164R.id.country_code_list);
        SearchEditText searchEditText = (SearchEditText) inflate.findViewById(C0164R.id.search);
        this.f42410D = searchEditText;
        searchEditText.setOnFilterTextListener(new AnonymousClass3a6(this));
        ColorFilter B = AnonymousClass0ca.B(AnonymousClass0Ca.C(getContext(), C0164R.color.grey_5));
        this.f42410D.getCompoundDrawablesRelative()[0].mutate().setColorFilter(B);
        this.f42410D.setClearButtonColorFilter(B);
        ListAdapter anonymousClass3a2 = new AnonymousClass3a2(getContext(), this.f42411E);
        this.f42408B = anonymousClass3a2;
        listView.setAdapter(anonymousClass3a2);
        anonymousClass0Sb.T(inflate);
        anonymousClass0Sb.E(true);
        anonymousClass0Sb.F(true);
        Dialog C = anonymousClass0Sb.C();
        listView.setOnItemClickListener(new AnonymousClass3a5(this));
        return C;
    }
}
