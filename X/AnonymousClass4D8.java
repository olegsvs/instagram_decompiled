package X;

import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.4D8 */
public final class AnonymousClass4D8 extends AnonymousClass0Ie implements AnonymousClass0IS, AnonymousClass36X, AnonymousClass33O, AnonymousClass0IT {
    /* renamed from: N */
    public static final String f51529N = "com.instagram.business.fragment.EditBusinessFBPageFragment";
    /* renamed from: B */
    public boolean f51530B;
    /* renamed from: C */
    public String f51531C;
    /* renamed from: D */
    public String f51532D;
    /* renamed from: E */
    public Map f51533E;
    /* renamed from: F */
    public List f51534F;
    /* renamed from: G */
    public View f51535G;
    /* renamed from: H */
    public AnonymousClass3x3 f51536H;
    /* renamed from: I */
    public ImageView f51537I;
    /* renamed from: J */
    public AnonymousClass0Cm f51538J;
    /* renamed from: K */
    private TextView f51539K;
    /* renamed from: L */
    private boolean f51540L;
    /* renamed from: M */
    private boolean f51541M;

    public final String getModuleName() {
        return "edit_business_fb_page";
    }

    public final void th() {
    }

    /* renamed from: A */
    public final void m23550A() {
        AnonymousClass0GA A = AnonymousClass1Dj.B(AnonymousClass0a2.B(this.f51538J)).C(new AnonymousClass29P(StringFormatUtil.formatStrLocaleSafe("{\"%s\":\"%s\"}", "0", "ADMINISTER"))).A();
        A.f2849B = new AnonymousClass4D4(this);
        schedule(A);
    }

    /* renamed from: B */
    public final void m23551B(AnonymousClass2W3 anonymousClass2W3) {
        String str = anonymousClass2W3.f31095I;
        if (!str.equals(this.f51531C)) {
            new AnonymousClass0P2(getContext()).V(C0164R.string.switch_facebook_page).K(C0164R.string.switch_facebook_page_explain).S(C0164R.string.ok, new AnonymousClass4D7(this, str, anonymousClass2W3)).N(C0164R.string.cancel, new AnonymousClass4D5(this, str)).A().show();
        }
    }

    /* renamed from: B */
    public static void m23546B(AnonymousClass4D8 anonymousClass4D8, List list, String str) {
        if (anonymousClass4D8.f51530B) {
            List<String> arrayList = new ArrayList(anonymousClass4D8.f51534F);
            arrayList.removeAll(list);
            String str2 = anonymousClass4D8.f51532D;
            AnonymousClass0NN F = AnonymousClass33e.EDIT_PROFILE_FINISH_STEP.m18380A().F("step", "create_page").F("entry_point", str2).F("fb_user_id", AnonymousClass0a2.I(anonymousClass4D8.f51538J));
            AnonymousClass0lA B = AnonymousClass0lA.B();
            for (String C : arrayList) {
                B.C(C);
            }
            String str3 = "page_id";
            AnonymousClass0db F2 = AnonymousClass0db.C().F(str3, B);
            F.D("available_options", F2).D("default_values", AnonymousClass0db.C().G(str3, str));
            F.R();
        }
    }

    public final void Bx(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = getString(C0164R.string.error_msg_switch_page);
        }
        AnonymousClass0IG.I(str);
        AnonymousClass4D8.m23547C(this, str2, str);
    }

    /* renamed from: C */
    public static void m23547C(AnonymousClass4D8 anonymousClass4D8, String str, String str2) {
        String str3 = anonymousClass4D8.f51532D;
        String str4 = anonymousClass4D8.f51531C;
        String I = AnonymousClass0a2.I(anonymousClass4D8.f51538J);
        String str5 = "page_id";
        AnonymousClass0db G = AnonymousClass0db.C().G(str5, str4);
        AnonymousClass33e.EDIT_PROFILE_SUBMIT_ERROR.m18380A().F("entry_point", str3).F("fb_user_id", I).F("step", "page_change").D("default_values", G).D("selected_values", AnonymousClass0db.C().G(str5, str)).F("error_message", str2).R();
    }

    /* renamed from: D */
    public static void m23548D(AnonymousClass4D8 anonymousClass4D8) {
        anonymousClass4D8.m23550A();
        anonymousClass4D8.setListAdapter(anonymousClass4D8.f51536H);
        AnonymousClass2IF.m14981B(anonymousClass4D8.f51536H.isEmpty(), anonymousClass4D8.getView());
    }

    /* renamed from: E */
    private void m23549E(boolean z) {
        this.f51540L = z;
        this.f51536H.f47300E = z;
        AnonymousClass0eT.D(AnonymousClass0eT.E(getActivity()));
    }

    public final void Ex() {
        m23549E(false);
    }

    public final void Jx() {
        m23549E(true);
    }

    public final void Lt(AnonymousClass2W3 anonymousClass2W3) {
        m23551B(anonymousClass2W3);
    }

    public final void Px(String str) {
        AnonymousClass0IG.G(getContext(), C0164R.string.page_switched);
        this.f51533E.put(str, this.f51538J.B().uT());
        this.f51533E.remove(this.f51531C);
        String str2 = this.f51532D;
        String str3 = this.f51531C;
        String I = AnonymousClass0a2.I(this.f51538J);
        String str4 = "page_id";
        AnonymousClass0db G = AnonymousClass0db.C().G(str4, str3);
        AnonymousClass33e.EDIT_PROFILE_SUBMIT.m18380A().F("entry_point", str2).F("fb_user_id", I).F("step", "page_change").D("default_values", G).D("selected_values", AnonymousClass0db.C().G(str4, str)).R();
        this.f51531C = str;
        AnonymousClass3x3 anonymousClass3x3 = this.f51536H;
        anonymousClass3x3.m21673H(this.f51531C);
        AnonymousClass3x3.m21670C(anonymousClass3x3);
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.Z(C0164R.string.facebook_page);
        anonymousClass0eT.c(C0164R.drawable.instagram_arrow_back_24, new AnonymousClass4D3(this));
        AnonymousClass22r B = AnonymousClass0eW.B(AnonymousClass0eV.DEFAULT);
        B.f25408B = AnonymousClass0ca.B(AnonymousClass0Ca.C(getContext(), C0164R.color.black));
        anonymousClass0eT.d(B.m14277B());
        anonymousClass0eT.m(this.f51540L, null);
        anonymousClass0eT.Y(this.f51540L);
    }

    public final boolean onBackPressed() {
        AnonymousClass33a.m18357B(this.f51532D, "page_change", AnonymousClass0a2.I(this.f51538J));
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 2107892518);
        super.onCreate(bundle);
        this.f51532D = getArguments().getString("entry_point");
        AnonymousClass0lj anonymousClass0lj = new AnonymousClass0lj();
        anonymousClass0lj.L(new AnonymousClass235(getActivity()));
        registerLifecycleListenerSet(anonymousClass0lj);
        AnonymousClass0Cm G = AnonymousClass0Ce.G(getArguments());
        this.f51538J = G;
        this.f51531C = G.B().lB;
        this.f51536H = new AnonymousClass3x3(getContext(), this);
        this.f51533E = new HashMap();
        this.f51534F = new ArrayList();
        AnonymousClass0cQ.G(this, -75179511, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 381946027);
        View inflate = layoutInflater.inflate(C0164R.layout.edit_business_fb_page_view, viewGroup, false);
        AnonymousClass0cQ.G(this, 1490347579, F);
        return inflate;
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -26026926);
        super.onResume();
        if (this.f51541M) {
            this.f51541M = false;
            m23550A();
        }
        AnonymousClass0cQ.G(this, -540530219, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f51535G = view.findViewById(C0164R.id.page_list_group);
        this.f51536H.f47298C = false;
        AnonymousClass4D8.m23548D(this);
        TextView textView = (TextView) view.findViewById(C0164R.id.business_fb_page_footer_text);
        this.f51539K = textView;
        textView.setText(Html.fromHtml(getString(C0164R.string.create_admin_page)));
        this.f51539K.setOnClickListener(new AnonymousClass4D1(this));
        ImageView imageView = (ImageView) view.findViewById(C0164R.id.refresh);
        this.f51537I = imageView;
        imageView.setVisibility(8);
        this.f51537I.setOnClickListener(new AnonymousClass4D2(this));
    }

    public final void vSA(AnonymousClass2W3 anonymousClass2W3) {
        this.f51536H.m21673H(this.f51531C);
    }
}
