package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.login.api.RegistrationFlowExtras;
import java.util.ArrayList;

/* renamed from: X.0Op */
public final class AnonymousClass0Op {
    /* renamed from: A */
    public final AnonymousClass0IL m3653A(AnonymousClass0Cm anonymousClass0Cm) {
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.USER_ID", anonymousClass0Cm.f1759C);
        AnonymousClass0IL anonymousClass4z9 = new AnonymousClass4z9();
        anonymousClass4z9.setArguments(bundle);
        return anonymousClass4z9;
    }

    /* renamed from: B */
    public static AnonymousClass0IL m3652B(RegistrationFlowExtras registrationFlowExtras, String str, String str2, String str3) {
        boolean z;
        Bundle G;
        String str4;
        AnonymousClass0IL anonymousClass584;
        boolean z2 = false;
        if (registrationFlowExtras == null) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                z = false;
                AnonymousClass0LH.m2924B(z);
                G = registrationFlowExtras == null ? registrationFlowExtras.G() : new Bundle();
                if (!(str == null || str2 == null)) {
                    G.putString("phone_number_key", str);
                    G.putString("query_key", str2);
                }
                str4 = "arg_is_reg_flow";
                if (registrationFlowExtras != null) {
                    z2 = true;
                }
                G.putBoolean(str4, z2);
                G.putString("IgSessionManager.USER_ID", str3);
                anonymousClass584 = new AnonymousClass584();
                anonymousClass584.setArguments(G);
                return anonymousClass584;
            }
        }
        z = true;
        AnonymousClass0LH.m2924B(z);
        if (registrationFlowExtras == null) {
        }
        G.putString("phone_number_key", str);
        G.putString("query_key", str2);
        str4 = "arg_is_reg_flow";
        if (registrationFlowExtras != null) {
            z2 = true;
        }
        G.putBoolean(str4, z2);
        G.putString("IgSessionManager.USER_ID", str3);
        anonymousClass584 = new AnonymousClass584();
        anonymousClass584.setArguments(G);
        return anonymousClass584;
    }

    /* renamed from: B */
    public final AnonymousClass0IL m3654B(ArrayList arrayList, boolean z) {
        Bundle bundle = new Bundle();
        if (z) {
            AnonymousClass1P7.m11233C(bundle, AnonymousClass1P7.ARGUMENT_TWOFAC_FLOW);
        }
        bundle.putStringArrayList("backup_codes_key", arrayList);
        AnonymousClass0IL anonymousClass4zI = new AnonymousClass4zI();
        anonymousClass4zI.setArguments(bundle);
        return anonymousClass4zI;
    }

    /* renamed from: C */
    public final AnonymousClass0IL m3655C(Bundle bundle, String str) {
        bundle.putString("IgSessionManager.USER_ID", str);
        AnonymousClass0IL anonymousClass56t = new AnonymousClass56t();
        anonymousClass56t.setArguments(bundle);
        return anonymousClass56t;
    }

    /* renamed from: D */
    public final AnonymousClass0IL m3656D(String str, String str2, AnonymousClass1P7 anonymousClass1P7) {
        AnonymousClass0IL anonymousClass50K = new AnonymousClass50K();
        Bundle bundle = new Bundle();
        bundle.putString("ARGUMENT_OMNISTRING", str);
        if (str2 != null) {
            bundle.putString("ARGUMENT_TWOFAC_IDENTIFIER", str2);
        }
        AnonymousClass1P7.m11233C(bundle, anonymousClass1P7);
        anonymousClass50K.setArguments(bundle);
        return anonymousClass50K;
    }

    /* renamed from: E */
    public final AnonymousClass0IL m3657E(String str, String str2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.USER_ID", str);
        bundle.putString("com.instagram.android.login.fragment.ARGUMENT_OMNISTRING", str2);
        bundle.putBoolean("com.instagram.android.login.fragment.ARGUMENT_USER_IS_VALID", z);
        AnonymousClass0IL anonymousClass4zn = new AnonymousClass4zn();
        anonymousClass4zn.setArguments(bundle);
        return anonymousClass4zn;
    }

    /* renamed from: F */
    public final AnonymousClass0IL m3658F(Bundle bundle, String str) {
        bundle.putString("IgSessionManager.USER_ID", str);
        AnonymousClass0IL anonymousClass57c = new AnonymousClass57c();
        anonymousClass57c.setArguments(bundle);
        return anonymousClass57c;
    }

    /* renamed from: G */
    public final AnonymousClass0IL m3659G(String str, String str2, String str3, String str4) {
        AnonymousClass0IL anonymousClass0II = new AnonymousClass0II();
        Bundle bundle = new Bundle();
        bundle.putString("argument_reset_token", str);
        bundle.putString("argument_user_id", str2);
        bundle.putString("argument_user_name", str3);
        bundle.putString("argument_profile_pic_url", str4);
        anonymousClass0II.setArguments(bundle);
        return anonymousClass0II;
    }

    /* renamed from: H */
    public final AnonymousClass0IL m3660H(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0IL anonymousClass50A = new AnonymousClass50A();
        if (anonymousClass0Cm != null) {
            Bundle bundle = new Bundle();
            bundle.putString("IgSessionManager.USER_ID", anonymousClass0Cm.f1759C);
            anonymousClass50A.setArguments(bundle);
        }
        return anonymousClass50A;
    }

    /* renamed from: I */
    public final AnonymousClass0IL m3661I() {
        return new AnonymousClass1PK();
    }

    /* renamed from: J */
    public final AnonymousClass0IL m3662J(String str, String str2, String str3, boolean z, boolean z2, boolean z3, Bundle bundle, boolean z4, boolean z5, boolean z6) {
        if (!((Boolean) AnonymousClass0CC.sh.m914G()).booleanValue()) {
            if (!z4) {
                bundle.putString("ARGUMENT_TWOFAC_IDENTIFIER", str);
                bundle.putString("ARGUMENT_OMNISTRING", str2);
                bundle.putString("ARGUMENT_OBFUSCATED_PHONE_NUMBER", str3);
                bundle.putBoolean("ARGUMENT_SHOW_MESSENGER_CODE_OPTION", z);
                bundle.putBoolean("ARGUMENT_IS_FROM_ONE_CLICK_FLOW", z5);
                str = new AnonymousClass5Z8();
                bundle.putBoolean("ARGUMENT_SHOULD_REMEMBER_PASSWORD", z6);
                str.setArguments(bundle);
                return str;
            }
        }
        bundle.putString("argument_two_fac_identifier", str);
        bundle.putString("argument_username", str2);
        bundle.putString("argument_abfuscated_phone_number", str3);
        bundle.putBoolean("argument_is_from_one_click_flow", z5);
        bundle.putBoolean("argument_sms_two_factor_on", z2);
        bundle.putBoolean("argument_totp_two_factor_on", z3);
        if (z3) {
            bundle.putInt("argument_two_fac_clear_method", AnonymousClass2Dw.f27727D.A());
        } else {
            bundle.putInt("argument_two_fac_clear_method", AnonymousClass2Dw.f27729F.A());
        }
        str = new AnonymousClass52L();
        bundle.putBoolean("ARGUMENT_SHOULD_REMEMBER_PASSWORD", z6);
        str.setArguments(bundle);
        return str;
    }
}
