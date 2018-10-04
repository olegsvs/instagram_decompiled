package X;

import android.content.Context;
import android.os.Build.VERSION;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.47m */
public final class AnonymousClass47m {
    /* renamed from: B */
    public final Context f50563B;
    /* renamed from: C */
    private final AnonymousClass47k f50564C = new AnonymousClass47k(this.f50563B);
    /* renamed from: D */
    private final TelephonyManager f50565D;

    public AnonymousClass47m(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f50563B = applicationContext;
        this.f50565D = (TelephonyManager) applicationContext.getSystemService("phone");
    }

    /* renamed from: A */
    public final boolean m23324A() {
        return this.f50563B.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0;
    }

    /* renamed from: B */
    public static SubscriptionInfo m23321B(AnonymousClass47m anonymousClass47m, int i) {
        if (VERSION.SDK_INT < 22) {
            return null;
        }
        if (!anonymousClass47m.m23324A()) {
            return null;
        }
        SubscriptionManager from = SubscriptionManager.from(anonymousClass47m.f50563B);
        if (from != null) {
            return from.getActiveSubscriptionInfoForSimSlotIndex(i);
        }
        return null;
    }

    /* renamed from: B */
    public final String m23325B(int i) {
        String str = null;
        if (this.f50563B.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
            return null;
        }
        if (this.f50565D == null) {
            return null;
        }
        if (VERSION.SDK_INT >= 23) {
            str = this.f50565D.getDeviceId(i);
        }
        return (str == null && i == 0) ? this.f50565D.getDeviceId() : str;
    }

    /* renamed from: C */
    public final String m23326C(int i) {
        TelephonyManager telephonyManager = this.f50565D;
        return (telephonyManager == null || i != 0) ? null : telephonyManager.getNetworkCountryIso();
    }

    /* renamed from: C */
    private static String m23322C(AnonymousClass47m anonymousClass47m, int i) {
        i = AnonymousClass47m.m23321B(anonymousClass47m, i);
        return (i == 0 || i.getDisplayName() == null) ? null : i.getDisplayName().toString();
    }

    /* renamed from: D */
    public final String m23327D(int i) {
        String O = m23338O(i);
        if (!AnonymousClass47m.m23323D(O)) {
            return O;
        }
        TelephonyManager telephonyManager = this.f50565D;
        return (telephonyManager == null || i != 0) ? null : telephonyManager.getNetworkOperatorName();
    }

    /* renamed from: D */
    private static boolean m23323D(String str) {
        if (str != null) {
            if (!str.equals(JsonProperty.USE_DEFAULT_NAME)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: E */
    public final int m23328E(int i) {
        TelephonyManager telephonyManager = this.f50565D;
        return (telephonyManager == null || i != 0) ? -1 : telephonyManager.getNetworkType();
    }

    /* renamed from: F */
    public final String m23329F(int i) {
        if (!m23324A()) {
            if ((this.f50563B.checkCallingOrSelfPermission("android.permission.READ_SMS") == 0 ? 1 : null) == null) {
                return null;
            }
        }
        SubscriptionInfo B = AnonymousClass47m.m23321B(this, i);
        String number = B != null ? B.getNumber() : null;
        if (!AnonymousClass47m.m23323D(number)) {
            return number;
        }
        TelephonyManager telephonyManager = this.f50565D;
        if (telephonyManager == null || i != 0) {
            return AnonymousClass47k.m23313B(this.f50564C, "getLine1Number", i);
        }
        return telephonyManager.getLine1Number();
    }

    /* renamed from: G */
    public final int m23330G(int r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r1 = r1.f50565D;
        r0 = -1;
        if (r1 == 0) goto L_0x000d;
    L_0x0005:
        if (r2 != 0) goto L_0x000d;
    L_0x0007:
        r0 = r1.getPhoneType();	 Catch:{ NotFoundException -> 0x000c }
        return r0;	 Catch:{ NotFoundException -> 0x000c }
    L_0x000c:
        return r0;
    L_0x000d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.47m.G(int):int");
    }

    /* renamed from: H */
    public final int m23331H(int i) {
        if (AnonymousClass47m.m23321B(this, i) == null) {
            TelephonyManager telephonyManager = this.f50565D;
            if (telephonyManager != null && i == 0) {
                return telephonyManager.getSimState();
            }
            if (!this.f50564C.f50555B) {
                return -1;
            }
        }
        return 0;
    }

    /* renamed from: I */
    public final String m23332I(int i) {
        String O = m23338O(i);
        return !AnonymousClass47m.m23323D(O) ? O : null;
    }

    /* renamed from: J */
    public final String m23333J(int i) {
        SubscriptionInfo B = AnonymousClass47m.m23321B(this, i);
        String countryIso = B != null ? B.getCountryIso() : null;
        if (!AnonymousClass47m.m23323D(countryIso)) {
            return countryIso;
        }
        TelephonyManager telephonyManager = this.f50565D;
        return (telephonyManager == null || i != 0) ? null : telephonyManager.getSimCountryIso();
    }

    /* renamed from: K */
    public final String m23334K(int i) {
        String C = AnonymousClass47m.m23322C(this, i);
        return !AnonymousClass47m.m23323D(C) ? C : null;
    }

    /* renamed from: L */
    public final String m23335L(int i) {
        String stringBuilder;
        SubscriptionInfo B = AnonymousClass47m.m23321B(this, i);
        if (B != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(String.valueOf(B.getMcc()));
            stringBuilder2.append(String.valueOf(B.getMnc()));
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = null;
        }
        if (!AnonymousClass47m.m23323D(stringBuilder)) {
            return stringBuilder;
        }
        TelephonyManager telephonyManager = this.f50565D;
        return (telephonyManager == null || i != 0) ? null : telephonyManager.getSimOperator();
    }

    /* renamed from: M */
    public final String m23336M(int i) {
        if (!m23324A()) {
            return null;
        }
        SubscriptionInfo B = AnonymousClass47m.m23321B(this, i);
        String iccId = B != null ? B.getIccId() : null;
        if (!AnonymousClass47m.m23323D(iccId)) {
            return iccId;
        }
        TelephonyManager telephonyManager = this.f50565D;
        if (telephonyManager == null || i != 0) {
            return AnonymousClass47k.m23313B(this.f50564C, "getIccSerialNumber", i);
        }
        return telephonyManager.getSimSerialNumber();
    }

    /* renamed from: N */
    public final String m23337N(int i) {
        if (!m23324A()) {
            return null;
        }
        TelephonyManager telephonyManager = this.f50565D;
        if (telephonyManager == null || i != 0) {
            return AnonymousClass47k.m23313B(this.f50564C, "getSubscriberId", i);
        }
        return telephonyManager.getSubscriberId();
    }

    /* renamed from: O */
    public final String m23338O(int i) {
        i = AnonymousClass47m.m23321B(this, i);
        return (i == 0 || i.getCarrierName() == null) ? null : i.getCarrierName().toString();
    }

    /* renamed from: P */
    public final String m23339P(int i) {
        SubscriptionInfo B = AnonymousClass47m.m23321B(this, i);
        return B != null ? String.valueOf(B.getMcc()) : null;
    }

    /* renamed from: Q */
    public final String m23340Q(int i) {
        SubscriptionInfo B = AnonymousClass47m.m23321B(this, i);
        return B != null ? String.valueOf(B.getMnc()) : null;
    }
}
