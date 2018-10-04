package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.ui.viewpager.ScrollingOptionalViewPager;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;

/* renamed from: X.4mV */
public final class AnonymousClass4mV extends AnonymousClass0IJ implements AnonymousClass0Ii, AnonymousClass2Hy, AnonymousClass0bt, AnonymousClass0mS, AnonymousClass3Bj {
    /* renamed from: B */
    public int f57157B = 0;
    /* renamed from: C */
    public AnonymousClass0iO f57158C;
    /* renamed from: D */
    public FixedTabBar f57159D;
    /* renamed from: E */
    public ViewPager f57160E;
    /* renamed from: F */
    public boolean f57161F;
    /* renamed from: G */
    public AnonymousClass4mU f57162G;
    /* renamed from: H */
    public boolean f57163H = true;
    /* renamed from: I */
    public AnonymousClass0Cm f57164I;
    /* renamed from: J */
    private final AnonymousClass0F8 f57165J = new AnonymousClass4mO(this);
    /* renamed from: K */
    private final AnonymousClass0F8 f57166K = new AnonymousClass4mP(this);

    public final void Vk() {
    }

    public final boolean bW() {
        return false;
    }

    public final String getModuleName() {
        return "discover_people";
    }

    /* renamed from: B */
    public static int m25044B(AnonymousClass4mV anonymousClass4mV, int i) {
        return anonymousClass4mV.f57161F ? (anonymousClass4mV.f57162G.getCount() - 1) - i : i;
    }

    /* renamed from: C */
    public static String m25045C(AnonymousClass4mV anonymousClass4mV, int i) {
        switch (AnonymousClass4mV.m25044B(anonymousClass4mV, i)) {
            case null:
                return "discover_people_suggested";
            case 1:
                return "discover_people_facebook";
            case 2:
                return "discover_people_contacts";
            default:
                throw new IllegalArgumentException("Invalid target mode");
        }
    }

    /* renamed from: D */
    public static AnonymousClass0IL m25046D(AnonymousClass4mV anonymousClass4mV) {
        return anonymousClass4mV.f57162G.K(anonymousClass4mV.f57157B);
    }

    /* renamed from: E */
    public static AnonymousClass4mh m25047E(AnonymousClass4mV anonymousClass4mV) {
        return (AnonymousClass4mh) anonymousClass4mV.f57162G.K(AnonymousClass4mV.m25044B(anonymousClass4mV, 0));
    }

    /* renamed from: F */
    private void m25048F() {
        if ((getArguments().getInt("DiscoverPeopleFragment.EXTRA_CURRENT_MODE") == 0 ? 1 : null) != null) {
            AnonymousClass4mV.m25049G(this);
        }
    }

    /* renamed from: G */
    private static void m25049G(AnonymousClass4mV anonymousClass4mV) {
        AnonymousClass0HV D = AnonymousClass0HV.D(anonymousClass4mV.f57164I);
        long C = AnonymousClass0Gd.C();
        if (C - D.f2646B.getLong("last_seen_upsell_on_discover_people_timestamp", 0) >= 86400000) {
            if (AnonymousClass1BO.C(anonymousClass4mV.getContext(), anonymousClass4mV.f57164I)) {
                Object obj = (AnonymousClass0HV.D(anonymousClass4mV.f57164I).f2646B.getBoolean("seen_facebook_connect_dialog", false) || AnonymousClass0a2.K(anonymousClass4mV.f57164I)) ? null : 1;
                if (obj != null) {
                    D.f2646B.edit().putBoolean("seen_facebook_connect_dialog", true).apply();
                    if (((Boolean) AnonymousClass0CC.VL.H(anonymousClass4mV.f57164I)).booleanValue()) {
                        D.KA(C);
                        if (((Boolean) AnonymousClass0CC.XL.H(anonymousClass4mV.f57164I)).booleanValue()) {
                            AnonymousClass0iO anonymousClass0iO = anonymousClass4mV.f57158C;
                            Context context = anonymousClass4mV.getContext();
                            AnonymousClass0mR anonymousClass0mR = AnonymousClass0mR.FOLLOW_PEOPLE;
                            AnonymousClass0NN.B("fbc_upsell_dialog_impression", anonymousClass4mV).R();
                            Dialog C2 = new AnonymousClass0Sb(context, C0164R.layout.facebook_connect_dialog).C();
                            ((TextView) C2.findViewById(C0164R.id.facebook_connect_dialog_title_view)).setText(C0164R.string.find_facebook_friends_title);
                            ((TextView) C2.findViewById(C0164R.id.facebook_connect_dialog_subtitle_view)).setText(C0164R.string.find_facebook_friends_subtitle);
                            C2.findViewById(C0164R.id.facebook_connect_dialog_close_button).setOnClickListener(new AnonymousClass2HB(anonymousClass0iO, C2, anonymousClass4mV));
                            C2.findViewById(C0164R.id.facebook_connect_dialog_connect_button).setOnClickListener(new AnonymousClass2HC(anonymousClass0iO, C2, anonymousClass4mV, anonymousClass0mR));
                            C2.show();
                            return;
                        }
                        AnonymousClass0iO anonymousClass0iO2 = anonymousClass4mV.f57158C;
                        Context context2 = anonymousClass4mV.getContext();
                        AnonymousClass0mR anonymousClass0mR2 = AnonymousClass0mR.FOLLOW_PEOPLE;
                        AnonymousClass0NN.B("fbc_upsell_dialog_impression", anonymousClass4mV).R();
                        AnonymousClass0P2 anonymousClass0P2 = new AnonymousClass0P2(context2);
                        if (((Boolean) AnonymousClass0CC.WL.H(anonymousClass0iO2.f8704E)).booleanValue()) {
                            anonymousClass0P2.I(AnonymousClass0Ca.E(context2, C0164R.drawable.fb_connect_facepile));
                        } else {
                            anonymousClass0P2.J(AnonymousClass0Ca.E(context2, C0164R.drawable.fb_connect), Integer.valueOf(C0164R.color.facebook_logo_blue));
                        }
                        anonymousClass0P2.V(C0164R.string.find_facebook_friends_title);
                        anonymousClass0P2.K(C0164R.string.find_facebook_friends_subtitle);
                        anonymousClass0P2.S(C0164R.string.connect_to_facebook, new AnonymousClass2H9(anonymousClass0iO2, anonymousClass4mV, anonymousClass0mR2));
                        anonymousClass0P2.N(C0164R.string.not_now, new AnonymousClass2HA(anonymousClass0iO2, anonymousClass4mV));
                        anonymousClass0P2.A().show();
                    }
                }
            } else if (D.f2646B.getBoolean("seen_contact_import_dialog", false)) {
                AnonymousClass0HV D2 = AnonymousClass0HV.D(anonymousClass4mV.f57164I);
                long C3 = AnonymousClass0Gd.C();
                long j = C3 - D2.f2646B.getLong("last_time_seen_contact_import_weekly_upsell", 0);
                int i = D2.f2646B.getInt("num_times_seen_contact_import_weekly_upsell", 0);
                if ((j > 604800000 && i < 3) || (((Boolean) AnonymousClass0CC.Ee.H(anonymousClass4mV.f57164I)).booleanValue() && i < ((Integer) AnonymousClass0CC.Fe.H(anonymousClass4mV.f57164I)).intValue())) {
                    D2.f2646B.edit().putLong("last_time_seen_contact_import_weekly_upsell", C3).apply();
                    D2.KA(C3);
                    D2.f2646B.edit().putInt("num_times_seen_contact_import_weekly_upsell", i + 1).apply();
                    AnonymousClass1fn.I(anonymousClass4mV.f57164I, anonymousClass4mV.getParentFragment() == null ? anonymousClass4mV : anonymousClass4mV.getParentFragment(), false, anonymousClass4mV, null);
                }
            } else {
                D.f2646B.edit().putBoolean("seen_contact_import_dialog", true).apply();
                D.KA(C);
                AnonymousClass1fn.I(anonymousClass4mV.f57164I, anonymousClass4mV.getParentFragment() == null ? anonymousClass4mV : anonymousClass4mV.getParentFragment(), false, anonymousClass4mV, null);
            }
        }
    }

    /* renamed from: H */
    private void m25050H(int i) {
        if (Z() instanceof AnonymousClass0Hj) {
            ((AnonymousClass0Hj) Z()).CSA(i);
        }
    }

    public final void Uk() {
        this.f57163H = false;
        this.f57158C.A(AnonymousClass0mR.FOLLOW_PEOPLE);
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.c(C0164R.drawable.instagram_arrow_back_24, new AnonymousClass4mQ(this));
        anonymousClass0eT.Z(C0164R.string.discover_people);
        anonymousClass0eT.l(false);
    }

    public final void hPA(int i) {
        if (this.f57157B == i) {
            oLA();
        }
        this.f57160E.setCurrentItem(i);
    }

    public final void oLA() {
        ((AnonymousClass0Ih) AnonymousClass4mV.m25046D(this)).oLA();
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -522974507);
        super.onCreate(bundle);
        this.f57161F = AnonymousClass0e8.D(getContext());
        this.f57162G = new AnonymousClass4mU(this, getChildFragmentManager());
        this.f57164I = AnonymousClass0Ce.G(getArguments());
        this.f57158C = new AnonymousClass0iO(this.f57164I, this, this, new AnonymousClass0iw(this, AnonymousClass0iy.DEFAULT));
        AnonymousClass0cQ.G(this, 318876957, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -569786789);
        View inflate = layoutInflater.inflate(C0164R.layout.fragment_discover_people, viewGroup, false);
        AnonymousClass0cQ.G(this, -1598141473, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 1651356671);
        this.f57160E = null;
        this.f57159D = null;
        this.f57162G.f17324B = null;
        getArguments().putInt("DiscoverPeopleFragment.EXTRA_CURRENT_MODE", this.f57157B);
        super.onDestroyView();
        AnonymousClass0cQ.G(this, 1155380403, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -1678797001);
        super.onPause();
        if (this.f57163H) {
            m25050H(0);
        }
        AnonymousClass0cQ.G(this, -1907500723, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 513274251);
        super.onResume();
        this.f57163H = true;
        m25050H(8);
        m25048F();
        AnonymousClass0cQ.G(this, 1115096063, F);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("DiscoverPeopleFragment.EXTRA_CURRENT_MODE", this.f57157B);
        super.onSaveInstanceState(bundle);
    }

    public final void onStart() {
        int F = AnonymousClass0cQ.F(this, -958773003);
        super.onStart();
        AnonymousClass0F4.f2058E.A(AnonymousClass3Bx.class, this.f57165J).A(AnonymousClass0mT.class, this.f57166K);
        AnonymousClass0cQ.G(this, 607649755, F);
    }

    public final void onStop() {
        int F = AnonymousClass0cQ.F(this, -939759594);
        super.onStop();
        AnonymousClass0F4.f2058E.D(AnonymousClass3Bx.class, this.f57165J).D(AnonymousClass0mT.class, this.f57166K);
        AnonymousClass0cQ.G(this, -1953177401, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f57159D = (FixedTabBar) view.findViewById(C0164R.id.fixed_tabbar_view);
        this.f57160E = (ScrollingOptionalViewPager) view.findViewById(C0164R.id.explore_people_pager);
        this.f57162G.f17324B = this.f57160E;
        this.f57160E.setAdapter(this.f57162G);
        AnonymousClass1Ar anonymousClass4mR = new AnonymousClass4mR(this);
        this.f57160E.B(anonymousClass4mR);
        this.f57160E.B(this.f57159D);
        this.f57160E.post(new AnonymousClass4mS(this, anonymousClass4mR));
        this.f57159D.setDelegate(this);
        this.f57159D.setTabs(new AnonymousClass4mT(this));
        if (bundle == null || !bundle.containsKey("DiscoverPeopleFragment.EXTRA_CURRENT_MODE")) {
            Bundle arguments = getArguments();
            if (arguments == null || !arguments.containsKey("DiscoverPeopleFragment.EXTRA_CURRENT_MODE")) {
                hPA(AnonymousClass4mV.m25044B(this, 0));
                return;
            } else {
                hPA(AnonymousClass4mV.m25044B(this, arguments.getInt("DiscoverPeopleFragment.EXTRA_CURRENT_MODE")));
                return;
            }
        }
        hPA(AnonymousClass4mV.m25044B(this, bundle.getInt("DiscoverPeopleFragment.EXTRA_CURRENT_MODE")));
    }
}
