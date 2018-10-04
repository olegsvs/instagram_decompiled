package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.C0164R;
import java.util.ArrayList;

/* renamed from: X.3XI */
public final class AnonymousClass3XI {
    /* renamed from: B */
    public final AnonymousClass0IL f42039B;
    /* renamed from: C */
    public final AnonymousClass0Cm f42040C;
    /* renamed from: D */
    private final AnonymousClass0EE f42041D;

    public AnonymousClass3XI(AnonymousClass0IL anonymousClass0IL, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0EE anonymousClass0EE) {
        this.f42039B = anonymousClass0IL;
        this.f42040C = anonymousClass0Cm;
        this.f42041D = anonymousClass0EE;
    }

    /* renamed from: A */
    public final void m19866A() {
        this.f42040C.E(AnonymousClass3X5.class);
        AnonymousClass3Wn.m19823B().m19830D();
        AnonymousClass1Qv.D(this.f42040C, this.f42039B.getActivity(), this.f42041D);
    }

    /* renamed from: B */
    public static AnonymousClass2Na m19861B(AnonymousClass0Ik anonymousClass0Ik) {
        switch (anonymousClass0Ik.ordinal()) {
            case null:
                return AnonymousClass2Na.FOLLOW_FRIENDS_FB;
            case 1:
                return AnonymousClass2Na.FOLLOW_FRIENDS_CI;
            case 2:
                return AnonymousClass2Na.INVITE_FB_FRIENDS;
            default:
                return null;
        }
    }

    /* renamed from: B */
    public final void m19867B() {
        AnonymousClass1Pj.H(this.f42040C.B().uT());
        AnonymousClass0Fr.FacebookSsoSuccess.A().H("is_facebook_linking_flow", true).F("instagram_id", this.f42040C.f1759C).R();
        AnonymousClass0e0.B(AnonymousClass0Fr.FacebookSsoSuccess.H());
        AnonymousClass0Cn anonymousClass0Cn = this.f42040C;
        AnonymousClass2HK anonymousClass2HK = AnonymousClass2HK.FB_LOGIN;
        AnonymousClass0FO.f2124D = false;
        AnonymousClass0FO.a(anonymousClass0Cn, AnonymousClass2H2.STORE_TOKEN_ENDPOINT, AnonymousClass0a2.B(anonymousClass0Cn), false, anonymousClass2HK);
        AnonymousClass1Qv.D(this.f42040C, this.f42039B.getActivity(), this.f42041D);
    }

    /* renamed from: C */
    public static void m19862C(AnonymousClass3XI anonymousClass3XI, AnonymousClass1Bb anonymousClass1Bb, Bundle bundle, boolean z) {
        switch (anonymousClass1Bb.ordinal()) {
            case 0:
                AnonymousClass3XI.m19865F(AnonymousClass0Fr.ContactsUpsellAccepted, z);
                AnonymousClass1fn.L(anonymousClass3XI.f42039B.getActivity(), anonymousClass3XI.f42041D, anonymousClass3XI.f42040C, anonymousClass3XI.f42039B.getString(C0164R.string.find_contacts_options), anonymousClass3XI.f42039B.getArguments().getStringArrayList("NuxHelper.ARGUMENT_SEEN_SOURCES"), true, anonymousClass3XI.f42040C.f1759C);
                return;
            case 2:
                anonymousClass3XI.m19864E(AnonymousClass0Fr.ContactsUpsellAutoDeclined, bundle, z);
                return;
            default:
                anonymousClass3XI.m19864E(AnonymousClass0Fr.ContactsUpsellDeclined, bundle, z);
                return;
        }
    }

    /* renamed from: C */
    public final void m19868C(Context context, AnonymousClass0Ik anonymousClass0Ik, boolean z) {
        Object obj;
        String str;
        ArrayList stringArrayList;
        if (m19870E()) {
            AnonymousClass0Fr.RegNextPressed.C(AnonymousClass3XI.m19861B(anonymousClass0Ik)).R();
        }
        if (anonymousClass0Ik != null) {
            if (anonymousClass0Ik == AnonymousClass0Ik.Facebook) {
                obj = "facebook_friends_algorithm";
            } else if (anonymousClass0Ik == AnonymousClass0Ik.Contacts) {
                obj = "contact_importer_algorithm";
            }
            if (!(obj == null || this.f42039B.getArguments() == null)) {
                str = "NuxHelper.ARGUMENT_SEEN_SOURCES";
                stringArrayList = this.f42039B.getArguments().getStringArrayList(str);
                if (stringArrayList == null) {
                    stringArrayList = new ArrayList();
                }
                stringArrayList.add(obj);
                this.f42039B.getArguments().putStringArrayList(str, stringArrayList);
            }
            if (m19869D()) {
                m19867B();
                return;
            } else if (anonymousClass0Ik != AnonymousClass0Ik.Facebook && AnonymousClass0FO.X(this.f42040C) && AnonymousClass0a2.K(this.f42040C)) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("IS_SIGN_UP_FLOW", true);
                bundle.putBoolean("ShouldSkipContactImport", z);
                AnonymousClass0iy.NUX.A(bundle, AnonymousClass0a2.B(this.f42040C), AnonymousClass0a2.I(this.f42040C));
                AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f42039B.getActivity());
                AnonymousClass0GO.C().A();
                AnonymousClass0IL anonymousClass5SP = new AnonymousClass5SP();
                anonymousClass5SP.setArguments(bundle);
                anonymousClass0IZ.f2754D = anonymousClass5SP;
                anonymousClass0IZ.B();
                return;
            } else if ((anonymousClass0Ik != AnonymousClass0Ik.Facebook || anonymousClass0Ik == AnonymousClass0Ik.InviteFacebookFriends) && !z) {
                m19872G();
            } else {
                m19871F(null);
                return;
            }
        }
        obj = null;
        str = "NuxHelper.ARGUMENT_SEEN_SOURCES";
        stringArrayList = this.f42039B.getArguments().getStringArrayList(str);
        if (stringArrayList == null) {
            stringArrayList = new ArrayList();
        }
        stringArrayList.add(obj);
        this.f42039B.getArguments().putStringArrayList(str, stringArrayList);
        if (m19869D()) {
            m19867B();
            return;
        }
        if (anonymousClass0Ik != AnonymousClass0Ik.Facebook) {
        }
        if (anonymousClass0Ik != AnonymousClass0Ik.Facebook) {
        }
        m19872G();
    }

    /* renamed from: D */
    public static AnonymousClass1Bb m19863D(AnonymousClass3XI anonymousClass3XI) {
        String str = "android.permission.READ_CONTACTS";
        if (AnonymousClass1Ba.D(anonymousClass3XI.f42039B.getContext(), str)) {
            return AnonymousClass1Bb.GRANTED;
        }
        if (AnonymousClass1Ba.E(anonymousClass3XI.f42039B.getActivity(), str)) {
            return AnonymousClass1Bb.DENIED;
        }
        return AnonymousClass1Bb.DENIED_DONT_ASK_AGAIN;
    }

    /* renamed from: D */
    public final boolean m19869D() {
        return this.f42039B.getArguments() != null && this.f42039B.getArguments().getBoolean("NuxHelper.ARGUMENT_IS_FACEBOOK_LINKING_FLOW");
    }

    /* renamed from: E */
    private void m19864E(AnonymousClass0Fr anonymousClass0Fr, Bundle bundle, boolean z) {
        AnonymousClass3XI.m19865F(anonymousClass0Fr, z);
        AnonymousClass0HV.D(this.f42040C).l(false);
        AnonymousClass1fn.F(false, this.f42041D);
        m19871F(bundle);
    }

    /* renamed from: E */
    public final boolean m19870E() {
        return this.f42039B.getArguments() != null && this.f42039B.getArguments().getBoolean("IS_SIGN_UP_FLOW");
    }

    /* renamed from: F */
    private static void m19865F(AnonymousClass0Fr anonymousClass0Fr, boolean z) {
        anonymousClass0Fr = anonymousClass0Fr.C(AnonymousClass2Na.CONTACTS_UPSELL);
        if (z) {
            anonymousClass0Fr.H("silent", true);
        }
        anonymousClass0Fr.R();
    }

    /* renamed from: F */
    public final void m19871F(Bundle bundle) {
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f42039B.getActivity());
        AnonymousClass0GO.C().A();
        if (bundle == null) {
            bundle = this.f42039B.getArguments();
        }
        AnonymousClass0IL anonymousClass56X = new AnonymousClass56X();
        anonymousClass56X.setArguments(bundle);
        anonymousClass0IZ.f2754D = anonymousClass56X;
        anonymousClass0IZ.A().B();
    }

    /* renamed from: G */
    public final void m19872G() {
        if (this.f42040C.B().B()) {
            AnonymousClass0Fr.ContactsUpsellViewed.C(AnonymousClass2Na.CONTACTS_UPSELL).R();
            AnonymousClass0Cm anonymousClass0Cm = this.f42040C;
            Class cls = AnonymousClass3X5.class;
            AnonymousClass3X5 anonymousClass3X5 = (AnonymousClass3X5) anonymousClass0Cm.A(cls);
            if (anonymousClass3X5 == null) {
                anonymousClass3X5 = new AnonymousClass3X5();
                anonymousClass0Cm.D(cls, anonymousClass3X5);
            }
            Object obj = (anonymousClass3X5.f42007B == AnonymousClass0Oh.FACEBOOK || !((Boolean) AnonymousClass0E6.B(AnonymousClass0CC.JF)).booleanValue()) ? null : 1;
            if (obj != null) {
                AnonymousClass3XI.m19862C(this, AnonymousClass3XI.m19863D(this), null, true);
            } else {
                AnonymousClass1Ba.H(this.f42039B.getActivity(), new AnonymousClass3XH(this, null), new String[]{"android.permission.READ_CONTACTS"});
            }
            return;
        }
        m19871F(null);
    }
}
