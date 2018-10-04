package X;

import android.os.Bundle;

/* renamed from: X.1P7 */
public enum AnonymousClass1P7 {
    ARGUMENT_DEFAULT_FLOW,
    ARGUMENT_SMS_RESET_FLOW,
    ARGUMENT_EDIT_PROFILE_FLOW,
    ARGUMENT_TWOFAC_FLOW,
    ARGUMENT_LOGIN_IS_VETTED_SUPPORT_FLOW,
    ARGUMENT_TWO_FAC_LOGIN_SUPPORT_FLOW,
    ARGUMENT_ADD_PHONE_NUMBER_FLOW;

    /* renamed from: B */
    public static AnonymousClass1P7 m11232B(Bundle bundle) {
        return AnonymousClass1P7.values()[bundle.getInt("flow_key")];
    }

    /* renamed from: C */
    public static void m11233C(Bundle bundle, AnonymousClass1P7 anonymousClass1P7) {
        bundle.putInt("flow_key", anonymousClass1P7.ordinal());
    }
}
