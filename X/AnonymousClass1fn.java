package X;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.facebook.C0164R;
import java.util.ArrayList;

/* renamed from: X.1fn */
public final class AnonymousClass1fn {
    /* renamed from: B */
    public static String f21250B = "http://help.instagram.com/227486307449481";

    /* renamed from: E */
    public static boolean m12432E(AnonymousClass0Ok anonymousClass0Ok) {
        return anonymousClass0Ok != null;
    }

    /* renamed from: B */
    public static void m12429B(AnonymousClass0IL anonymousClass0IL, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass3Bw anonymousClass3Bw, boolean z, AnonymousClass0Ok anonymousClass0Ok) {
        AnonymousClass1fn.m12431D(anonymousClass0IL, anonymousClass0Cm, anonymousClass3Bw, null, anonymousClass0Ok).A(z);
    }

    /* renamed from: C */
    public static AnonymousClass3nZ m12430C(AnonymousClass0EE anonymousClass0EE) {
        if (anonymousClass0EE != null) {
            return new AnonymousClass3nZ(anonymousClass0EE, null);
        }
        return new AnonymousClass3nZ("invite", null);
    }

    /* renamed from: D */
    public static AnonymousClass3yb m12431D(AnonymousClass0IL anonymousClass0IL, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass3Bw anonymousClass3Bw, AnonymousClass0EE anonymousClass0EE, AnonymousClass0Ok anonymousClass0Ok) {
        AnonymousClass0IL anonymousClass0IL2 = anonymousClass0IL;
        Activity activity = anonymousClass0IL.getActivity();
        if (activity.getParent() != null) {
            activity = activity.getParent();
        }
        String str = "android.permission.READ_CONTACTS";
        anonymousClass0IL = (AnonymousClass1Ba.m9838D(anonymousClass0IL.getContext(), str) || !AnonymousClass1Ba.m9843I(activity, str)) ? null : true;
        return new AnonymousClass3yb(anonymousClass0Ok, anonymousClass0EE, activity, anonymousClass3Bw, anonymousClass0IL2, anonymousClass0Cm, anonymousClass0IL);
    }

    /* renamed from: F */
    public static void m12433F(boolean z, AnonymousClass0EE anonymousClass0EE) {
        AnonymousClass0NN B = AnonymousClass0NN.m3291B("contacts_import_permissions", anonymousClass0EE);
        AnonymousClass0dl A = AnonymousClass0N2.m3261B().m3264A();
        if (A != null) {
            B.m3298F("phone_id", A.f7512B);
        }
        B.m3300H("enabled", z);
        B.m3310R();
    }

    /* renamed from: G */
    public static void m12434G(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0IL anonymousClass0IL, AnonymousClass3By anonymousClass3By, AnonymousClass0EE anonymousClass0EE) {
        AnonymousClass0IL anonymousClass0IL2 = anonymousClass0IL;
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        if (AnonymousClass1BO.m9814C(anonymousClass0IL.getContext(), anonymousClass0Cm)) {
            AnonymousClass1fn.m12437J(anonymousClass0IL, anonymousClass3By);
            return;
        }
        AnonymousClass1fn.m12441N(anonymousClass0Cm2, anonymousClass0IL2, AnonymousClass1fn.m12431D(anonymousClass0IL, anonymousClass0Cm, AnonymousClass3Bw.f38903D, anonymousClass0EE, null), AnonymousClass3Bw.f38903D, true, anonymousClass0EE, null);
    }

    /* renamed from: H */
    public static void m12435H(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0IL anonymousClass0IL, AnonymousClass0EE anonymousClass0EE) {
        AnonymousClass1fn.m12436I(anonymousClass0Cm, anonymousClass0IL, true, anonymousClass0EE, null);
    }

    /* renamed from: I */
    public static void m12436I(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0IL anonymousClass0IL, boolean z, AnonymousClass0EE anonymousClass0EE, AnonymousClass0Ok anonymousClass0Ok) {
        AnonymousClass0IL anonymousClass0IL2 = anonymousClass0IL;
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        if (AnonymousClass1BO.m9814C(anonymousClass0IL.getContext(), anonymousClass0Cm)) {
            AnonymousClass1fn.m12438K(anonymousClass0IL, anonymousClass0EE, anonymousClass0Cm, false, anonymousClass0Ok);
            return;
        }
        AnonymousClass0HV.m2008D(anonymousClass0Cm).m2050l(false);
        AnonymousClass1fn.m12433F(false, anonymousClass0EE);
        AnonymousClass1fn.m12441N(anonymousClass0Cm2, anonymousClass0IL2, AnonymousClass1fn.m12431D(anonymousClass0IL, anonymousClass0Cm, AnonymousClass3Bw.f38902C, anonymousClass0EE, anonymousClass0Ok), AnonymousClass3Bw.f38902C, z, anonymousClass0EE, anonymousClass0Ok);
    }

    /* renamed from: J */
    public static void m12437J(AnonymousClass0IL anonymousClass0IL, AnonymousClass3By anonymousClass3By) {
        AnonymousClass0IZ A = new AnonymousClass0IZ(anonymousClass0IL.getActivity()).m2307A();
        A.f2754D = AnonymousClass0IY.m2265B().m2271F(anonymousClass3By);
        A.m2308B();
    }

    /* renamed from: K */
    public static void m12438K(AnonymousClass0IL anonymousClass0IL, AnonymousClass0EE anonymousClass0EE, AnonymousClass0Cm anonymousClass0Cm, boolean z, AnonymousClass0Ok anonymousClass0Ok) {
        AnonymousClass0HV.m2008D(anonymousClass0Cm).m2050l(true);
        AnonymousClass1fn.m12433F(true, anonymousClass0EE);
        if (!(anonymousClass0IL instanceof AnonymousClass3Bj)) {
            if (anonymousClass0IL.getParentFragment() == null || !(anonymousClass0IL.getParentFragment() instanceof AnonymousClass3Bj)) {
                if (z || anonymousClass0IL.getFragmentManager() == null || AnonymousClass0cJ.m5755E(anonymousClass0IL.getFragmentManager())) {
                    anonymousClass0IL = new AnonymousClass0IZ(anonymousClass0IL.getActivity()).m2307A();
                    anonymousClass0IL.f2754D = AnonymousClass3Ip.f39973B.A().A(2);
                    anonymousClass0IL.m2308B();
                    return;
                }
                return;
            }
        }
        AnonymousClass0F4.f2058E.m1505B(new AnonymousClass3Bx());
    }

    /* renamed from: L */
    public static void m12439L(FragmentActivity fragmentActivity, AnonymousClass0EE anonymousClass0EE, AnonymousClass0Cm anonymousClass0Cm, String str, ArrayList arrayList, boolean z, String str2) {
        AnonymousClass0IL B;
        AnonymousClass0HV.m2008D(anonymousClass0Cm).m2050l(true);
        AnonymousClass1fn.m12433F(true, anonymousClass0EE);
        String str3 = str;
        ArrayList arrayList2 = arrayList;
        if (str2 == null) {
            AnonymousClass0Jp.f2944B.mo668A();
            B = AnonymousClass0So.m4409B(AnonymousClass0Ik.Contacts, null, str3, true, false, false, arrayList2, null);
        } else {
            B = AnonymousClass0Jp.f2944B.mo668A().m4410A(str, true, arrayList, str2);
        }
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(fragmentActivity);
        anonymousClass0IZ.f2754D = B;
        if (z) {
            anonymousClass0IZ.m2307A();
        }
        anonymousClass0IZ.m2308B();
    }

    /* renamed from: M */
    public static void m12440M(AnonymousClass0IL anonymousClass0IL, AnonymousClass0EE anonymousClass0EE, AnonymousClass0Cm anonymousClass0Cm, boolean z) {
        AnonymousClass0Sb L = new AnonymousClass0Sb(anonymousClass0IL.getContext()).m4375Q(C0164R.string.disconnect_contacts_dialog_title).m4366H(C0164R.string.disconnect_contacts_dialog_msg).m4373O(C0164R.string.disconnect, new AnonymousClass3Bt(anonymousClass0IL, anonymousClass0Cm, new AnonymousClass3Bq(anonymousClass0Cm, anonymousClass0EE, z, anonymousClass0IL))).m4363E(true).m4370L(C0164R.string.cancel, new AnonymousClass3Bs());
        L.f4940D.setOnCancelListener(new AnonymousClass3Br());
        L.m4361C().show();
    }

    /* renamed from: N */
    private static void m12441N(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0IL anonymousClass0IL, AnonymousClass3yb anonymousClass3yb, AnonymousClass3Bw anonymousClass3Bw, boolean z, AnonymousClass0EE anonymousClass0EE, AnonymousClass0Ok anonymousClass0Ok) {
        Context context = anonymousClass0IL.getContext();
        AnonymousClass0P2 anonymousClass0P2 = new AnonymousClass0P2(context);
        String string = context.getString(C0164R.string.learn_more);
        AnonymousClass3nZ C = AnonymousClass1fn.m12430C(anonymousClass0EE);
        switch (anonymousClass3Bw.ordinal()) {
            case 0:
                anonymousClass0P2.m3732V(C0164R.string.contact_import_dialog_title);
                anonymousClass0P2.m3721K(C0164R.string.contact_import_permissions_dialog_subtitle);
                break;
            case 1:
                anonymousClass0P2.m3732V(C0164R.string.contact_import_dialog_title_invite);
                anonymousClass0P2.m3721K(C0164R.string.contact_import_permissions_dialog_subtitle_invite);
                break;
            default:
                break;
        }
        AnonymousClass0Ok anonymousClass0Ok2 = anonymousClass0Ok;
        anonymousClass0P2.m3714D(string, new AnonymousClass3Bm(anonymousClass0Ok2, context, anonymousClass0Cm, string, C), anonymousClass0Ok == null, AnonymousClass2Ca.f27442D);
        anonymousClass0P2.m3729S(C0164R.string.contact_import_dialog_button_text, new AnonymousClass3Bn(anonymousClass0Ok2, anonymousClass3yb, C));
        anonymousClass0P2.m3724N(C0164R.string.contact_import_dialog_button_close, new AnonymousClass3Bo(anonymousClass0Ok2, anonymousClass0Cm, C));
        if (AnonymousClass1fn.m12432E(anonymousClass0Ok2)) {
            anonymousClass0P2.m3715E(false);
        }
        anonymousClass0P2.m3719I(AnonymousClass0Ca.m939E(context, C0164R.drawable.ci_modal_facepile));
        anonymousClass0P2.m3711A().show();
        if (AnonymousClass1fn.m12432E(anonymousClass0Ok2)) {
            AnonymousClass0Fr.AllowContactsSyncUpsellViewed.m1687C(AnonymousClass2Na.f29752H).m3310R();
        }
        AnonymousClass3nZ.B(C, "invite_import_contacts_education_dialog_impression").m3300H("user_initiated", z).m3310R();
    }
}
