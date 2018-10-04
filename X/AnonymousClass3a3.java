package X;

import android.content.Context;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.phonenumber.model.CountryCodeData;
import java.util.Locale;

/* renamed from: X.3a3 */
public final class AnonymousClass3a3 {
    /* renamed from: B */
    public static void m20061B(String str, String str2, String str3, boolean z, Bundle bundle) {
        bundle.putString("COUNTRY_CODE", str2);
        bundle.putString("NATIONAL_NUMBER", str3);
        bundle.putBoolean("IS_PHONE_CONFIRMED", z);
        bundle.putString("PHONE_NUMBER", str);
    }

    /* renamed from: C */
    public static Bundle m20062C(String str, String str2, String str3, boolean z, boolean z2, Bundle bundle) {
        AnonymousClass3a3.m20061B(str, str2, str3, false, bundle);
        AnonymousClass1P7.C(bundle, z ? AnonymousClass1P7.ARGUMENT_TWOFAC_FLOW : AnonymousClass1P7.ARGUMENT_EDIT_PROFILE_FLOW);
        bundle.putBoolean("HAS_SMS_CONSENT", z2);
        return bundle;
    }

    /* renamed from: D */
    public static String m20063D(Bundle bundle) {
        return bundle.getString("PHONE_NUMBER");
    }

    /* renamed from: E */
    public static CountryCodeData m20064E(Context context) {
        String toUpperCase = new AnonymousClass25b((TelephonyManager) context.getSystemService("phone")).m14372A().toUpperCase(Locale.US);
        String str = "US";
        if (TextUtils.isEmpty(toUpperCase)) {
            toUpperCase = str;
        }
        return new CountryCodeData(String.valueOf(PhoneNumberUtil.m13830C(context).m13856E(toUpperCase)), toUpperCase);
    }
}
