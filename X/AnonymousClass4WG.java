package X;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.pendingmedia.model.BrandedContentTag;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.4WG */
public final class AnonymousClass4WG extends AnonymousClass0Ie {
    /* renamed from: B */
    public AnonymousClass2JC f54809B;
    /* renamed from: C */
    public boolean f54810C;
    /* renamed from: D */
    public BrandedContentTag f54811D;
    /* renamed from: E */
    public boolean f54812E;
    /* renamed from: F */
    public AnonymousClass1To f54813F;
    /* renamed from: G */
    public AnonymousClass0iO f54814G;
    /* renamed from: H */
    public AnonymousClass2bo f54815H;
    /* renamed from: I */
    public AnonymousClass0Cm f54816I;
    /* renamed from: J */
    private AnonymousClass2Ik f54817J;
    /* renamed from: K */
    private final AnonymousClass0F8 f54818K = new AnonymousClass4W2(this);

    public final String getModuleName() {
        return "share_advanced_settings";
    }

    /* renamed from: B */
    public static String m24398B(AnonymousClass4WG anonymousClass4WG, ArrayList arrayList, boolean z) {
        if (!z) {
            return anonymousClass4WG.getString(C0164R.string.settings_viewers_choose_locations_feature_off);
        }
        return anonymousClass4WG.getResources().getQuantityString(C0164R.plurals.on_x_countries, arrayList.size(), new Object[]{Integer.valueOf(arrayList.size())});
    }

    /* renamed from: C */
    public static void m24399C(AnonymousClass4WG anonymousClass4WG, boolean z) {
        anonymousClass4WG.f54813F.f18979C = z;
        AnonymousClass2MX.m15226J(z, anonymousClass4WG);
        AnonymousClass0rF.B(anonymousClass4WG.f54809B, 1029227096);
        AnonymousClass0F4.f2058E.C(new AnonymousClass4WD());
    }

    /* renamed from: D */
    public static void m24400D(AnonymousClass4WG anonymousClass4WG, BrandedContentTag brandedContentTag) {
        anonymousClass4WG.f54811D = brandedContentTag;
        AnonymousClass0F4.f2058E.C(new AnonymousClass4WB(anonymousClass4WG.f54811D));
        AnonymousClass2NY B;
        if (anonymousClass4WG.f54811D != null) {
            B = AnonymousClass2NY.m15348B();
            B.f29741l++;
            anonymousClass4WG.f54817J.f28743C = anonymousClass4WG.f54811D.f27936D;
        } else {
            B = AnonymousClass2NY.m15348B();
            int i = B.f29741l;
            if (i > 0) {
                B.f29741l = i - 1;
            }
            anonymousClass4WG.f54817J.f28743C = null;
        }
        AnonymousClass0rF.B(anonymousClass4WG.f54809B, -1962616319);
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1936254429);
        super.onCreate(bundle);
        this.f54812E = getArguments().getBoolean("COMMENTS_DISABLED");
        this.f54816I = AnonymousClass0Ce.G(getArguments());
        this.f54814G = new AnonymousClass0iO(this.f54816I, this, this, new AnonymousClass4W3(this));
        String string = getArguments().getString("BRANDED_CONTENT_TAG");
        if (string != null) {
            try {
                this.f54811D = AnonymousClass2bB.parseFromJson(string);
            } catch (Throwable e) {
                AnonymousClass0Gn.L(getModuleName(), e);
            }
        }
        this.f54810C = getArguments().getBoolean("PARTNER_BOOST_ENABLED");
        this.f54809B = new AnonymousClass2JC(getContext());
        Collection arrayList = new ArrayList();
        arrayList.add(new AnonymousClass2If((int) C0164R.string.comments));
        AnonymousClass1To anonymousClass1To = new AnonymousClass1To(C0164R.string.turn_off_commenting, false, new AnonymousClass4W4(this));
        anonymousClass1To.f18979C = this.f54812E;
        arrayList.add(anonymousClass1To);
        arrayList.add(new AnonymousClass2JP(getResources().getString(C0164R.string.turn_off_comments_setting_description)));
        if (AnonymousClass2MX.m15225I(this.f54816I)) {
            boolean z = AnonymousClass2MX.m15221E(this.f54816I) && AnonymousClass0Mt.C();
            this.f54813F = new AnonymousClass1To(C0164R.string.feed_auto_xpost_to_fb_label, z, new AnonymousClass4WA(this), new AnonymousClass4W1(this));
            arrayList.add(new AnonymousClass2If(getString(C0164R.string.preferences_label)));
            arrayList.add(this.f54813F);
            arrayList.add(new AnonymousClass2JP(getString(C0164R.string.feed_auto_xpost_to_fb_explanation)));
        }
        if (this.f54816I.B().H()) {
            arrayList.add(new AnonymousClass2If((int) C0164R.string.branded_content));
            this.f54817J = new AnonymousClass2Ik((int) C0164R.string.tag_business_partner, new AnonymousClass4W6(this, new AnonymousClass4W5(this)));
            arrayList.add(this.f54817J);
            String string2 = getString(C0164R.string.learn_more_text);
            FragmentActivity activity = getActivity();
            AnonymousClass0Cm anonymousClass0Cm = this.f54816I;
            String string3 = getString(C0164R.string.add_partner_post_description, new Object[]{string2});
            String str = "https://help.instagram.com/128845584325492";
            Context context = getContext();
            AnonymousClass239 anonymousClass239 = AnonymousClass239.CREATE;
            arrayList.add(new AnonymousClass2JP(AnonymousClass32u.m18286B(activity, anonymousClass0Cm, string3, string2, str, context, anonymousClass239, getModuleName())));
            AnonymousClass4WG.m24400D(this, this.f54811D);
            if (((Boolean) AnonymousClass0CC.VC.H(this.f54816I)).booleanValue()) {
                AnonymousClass1To anonymousClass1To2 = new AnonymousClass1To(C0164R.string.allow_business_partner_to_promote, false, new AnonymousClass4W7(this));
                anonymousClass1To2.f18979C = this.f54810C;
                arrayList.add(anonymousClass1To2);
                arrayList.add(new AnonymousClass2JP(AnonymousClass32u.m18286B(getActivity(), this.f54816I, getString(C0164R.string.allow_business_partner_promote_description, new Object[]{string2}), string2, str, getContext(), anonymousClass239, getModuleName())));
            }
        }
        if (AnonymousClass0yJ.D(this.f54816I)) {
            arrayList.add(new AnonymousClass2If((int) C0164R.string.profile_close_friends_description));
            arrayList.add(new AnonymousClass2bo((int) C0164R.string.edit_your_close_friends_button_continue, new AnonymousClass4W8(this)));
        }
        if (((Boolean) AnonymousClass0CC.PU.H(this.f54816I)).booleanValue()) {
            String str2 = "feed";
            ArrayList arrayList2 = new ArrayList(AnonymousClass0HV.D(this.f54816I).R(str2));
            z = AnonymousClass0HV.D(this.f54816I).Q(str2);
            arrayList.add(new AnonymousClass2If((int) C0164R.string.settings_viewers_choose_locations_title));
            this.f54815H = new AnonymousClass2bo(AnonymousClass4WG.m24398B(this, arrayList2, z), new AnonymousClass4W9(this));
            arrayList.add(this.f54815H);
            arrayList.add(new AnonymousClass2JP(getString(C0164R.string.feed_settings_viewers_choose_locations_description)));
            AnonymousClass0F4.f2058E.A(AnonymousClass4WE.class, this.f54818K);
        }
        this.f54809B.setItems(arrayList);
        setListAdapter(this.f54809B);
        AnonymousClass0cQ.G(this, -1807267032, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -548346810);
        View inflate = layoutInflater.inflate(C0164R.layout.fragment_share_advanced_settings, viewGroup, false);
        AnonymousClass0cQ.G(this, -643618491, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, -207257627);
        super.onDestroy();
        AnonymousClass0F4.f2058E.D(AnonymousClass4WE.class, this.f54818K);
        AnonymousClass0cQ.G(this, -93015258, F);
    }
}
