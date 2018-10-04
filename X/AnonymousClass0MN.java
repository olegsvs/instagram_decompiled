package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.0MN */
public final class AnonymousClass0MN {
    /* renamed from: B */
    public static Boolean f3406B;
    /* renamed from: C */
    private static Boolean f3407C;

    /* renamed from: B */
    public static boolean m3158B() {
        if (f3407C == null) {
            boolean z;
            String str = Build.MODEL;
            if (!(str.contains("R831K") || str.contains("R1001") || str.contains("C2305") || str.contains("Discovery") || str.contains("1201") || str.contains("R821") || str.contains("LG-D686") || str.contains("R831") || str.contains("LG-D680") || str.contains("HUAWEI G610-U15") || str.contains("Lenovo S820_ROW") || str.contains("R2001") || str.contains("2013023") || str.contains("R827") || str.contains("HUAWEI G610-U20") || str.contains("GT-S7262") || str.contains("Rio") || str.contains("Lenovo S820") || str.contains("Lenovo A606") || str.contains("Avvio_793") || str.contains("Lenovo A316i") || str.contains("ONE TOUCH 4033A") || str.contains("R1011") || str.contains("Lenovo S920") || str.contains("iris700") || str.contains("Vodafone 785") || str.contains("ALCATEL ONE TOUCH 5036A") || str.contains("R819") || str.contains("vivo Y15") || str.contains("Lenovo A369i") || str.contains("ADVAN S5E Pro") || ((((Boolean) AnonymousClass0CC.f1470g.m845G()).booleanValue() && str.contains("Z10")) || str.contains("GT-I8190") || str.contains("C2304") || str.contains("ALCATEL ONE TOUCH 7047D") || str.contains("PMP3007C3G") || str.contains("ALCATEL ONE TOUCH 6030A") || str.contains("IQ4404") || str.contains("IQ456") || str.contains("LG-E455f") || str.contains("Lenovo A516") || str.contains("Lenovo P780_ROW") || str.contains("XT918") || str.contains("ADVAN S4A") || str.contains("HUAWEI G700-U20") || str.contains("EVERCOSS A7R") || str.contains("ALCATEL ONE TOUCH 4037T") || str.contains("Lenovo A319") || str.contains("Lenovo P780") || str.contains("HUAWEI Y320-U151") || str.contains("Lenovo S650") || str.contains("LG-D213AR") || str.contains("Lenovo A536") || str.contains("LG-E450f") || str.contains("A7S*") || str.contains("LG-E460") || str.contains("ONE TOUCH 6012A") || str.contains("V370") || str.contains("KAZAM Trooper2 50") || str.contains("ALCATEL ONE TOUCH 6012X") || str.contains("HM NOTE 1W") || str.contains("HUAWEI Y330-U01") || str.contains("PAP4322DUO") || str.contains("Lenovo S930") || str.contains("Lenovo S960") || str.contains("MyPhone Rio 2 Craze") || str.contains("BLU STUDIO 5.0 II") || str.contains("IQ4403") || str.contains("M4 SS1070") || str.contains("Lenovo S850") || str.contains("HUAWEI G700-U10") || str.contains("A7S") || str.contains("OWN_S4025") || str.contains("Golf") || str.contains("LG-D100") || str.contains("Beeline Smart 3") || str.contains("KENEKSI-ZETA") || str.contains("LG-X145") || str.contains("M4 SS1060") || str.contains("ONE TOUCH 4016A") || str.contains("6037Y") || str.contains("Z160") || str.contains("ALCATEL ONE TOUCH Fierce") || str.contains("HUAWEI Y520-U22") || str.contains("ALCATEL ONE TOUCH 7041X") || str.contains("JY-G4S") || str.contains("Lenovo A526") || str.contains("ALCATEL ONE TOUCH 5036D") || str.contains("LG-D213") || str.contains("Bucare Y330-U05") || str.contains("LG-E455") || str.contains("HUAWEI Y600-U151")))) {
                if (!str.contains("IQ4416")) {
                    z = false;
                    f3407C = Boolean.valueOf(z);
                }
            }
            z = true;
            f3407C = Boolean.valueOf(z);
        }
        return f3407C.booleanValue();
    }

    /* renamed from: C */
    public static boolean m3159C() {
        return !Build.MANUFACTURER.equalsIgnoreCase("nokia");
    }

    /* renamed from: D */
    public static boolean m3160D() {
        return Build.MODEL.startsWith("LG-E61") ^ 1;
    }

    /* renamed from: E */
    public static boolean m3161E() {
        return (((Boolean) AnonymousClass0CC.di.m845G()).booleanValue() && AnonymousClass0MN.m3158B()) || (!AnonymousClass0CB.m840J() && AnonymousClass0FZ.m1634B().f2177B.getBoolean("force_legacy_render", false));
    }

    /* renamed from: F */
    public static boolean m3162F(Context context) {
        return (AnonymousClass0MM.m3155K(context) || AnonymousClass0HV.m2007C().m2040b()) && AnonymousClass0MN.m3163G(context);
    }

    /* renamed from: G */
    public static boolean m3163G(Context context) {
        if (AnonymousClass0MM.m3153I(context)) {
            Boolean bool = f3406B;
            if (bool != null) {
                return bool.booleanValue() ^ true;
            }
        }
        return true;
    }
}
