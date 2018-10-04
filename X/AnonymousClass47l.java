package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.47l */
public final class AnonymousClass47l {
    /* renamed from: B */
    private final ConnectivityManager f50558B = ((ConnectivityManager) this.f50559C.getSystemService("connectivity"));
    /* renamed from: C */
    private final Context f50559C;
    /* renamed from: D */
    private final Locale f50560D = Locale.getDefault();
    /* renamed from: E */
    private final AnonymousClass47m f50561E;
    /* renamed from: F */
    private final TelephonyManager f50562F = ((TelephonyManager) this.f50559C.getSystemService("phone"));

    /* renamed from: B */
    private static String m23316B(int i) {
        switch (i) {
            case 1:
                return "GPRS";
            case 2:
                return "EDGE";
            case 3:
                return "UMTS";
            case 4:
                return "CDMA";
            case 5:
                return "EVDO_0";
            case 6:
                return "EVDO_A";
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return "1xRTT";
            case 8:
                return "HSDPA";
            case 9:
                return "HSUPA";
            case 10:
                return "HSPA";
            case 11:
                return "IDEN";
            case 12:
                return "EVDO_B";
            case ParserMinimalBase.INT_CR /*13*/:
                return "LTE";
            case 14:
                return "EHRPD";
            case 15:
                return "HSPAP";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: C */
    private static String m23317C(int i) {
        switch (i) {
            case 0:
                return "NONE";
            case 1:
                return "GSM";
            case 2:
                return "CDMA";
            case 3:
                return "SIP";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: D */
    private static String m23318D(int i) {
        switch (i) {
            case 1:
                return "ABSENT";
            case 2:
                return "PIN_REQUIRED";
            case 3:
                return "PUK_REQUIRED";
            case 4:
                return "NETWORK_LOCKED";
            case 5:
                return "READY";
            default:
                return "UNKNOWN";
        }
    }

    public AnonymousClass47l(Context context) {
        this.f50559C = context;
        this.f50561E = new AnonymousClass47m(context);
    }

    /* renamed from: A */
    public final ArrayList m23320A() {
        if (this.f50562F == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            LinkedHashMap E = AnonymousClass47l.m23319E(this, i);
            if (E != null) {
                arrayList.add(E);
            }
        }
        return arrayList;
    }

    /* renamed from: E */
    private static java.util.LinkedHashMap m23319E(X.AnonymousClass47l r4, int r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = new java.util.LinkedHashMap;
        r2.<init>();
        r0 = r4.f50561E;
        r3 = r0.m23331H(r5);
        r0 = -1;
        if (r3 != r0) goto L_0x0010;
    L_0x000e:
        r0 = 0;
        return r0;
    L_0x0010:
        r1 = "index";
        r0 = java.lang.Integer.valueOf(r5);
        r2.put(r1, r0);
        r1 = "state";
        r0 = X.AnonymousClass47l.m23318D(r3);
        r2.put(r1, r0);
        r1 = "carrier";
        r0 = r4.f50561E;
        r0 = r0.m23327D(r5);
        r2.put(r1, r0);
        r1 = "sim_carrier_name";
        r0 = r4.f50561E;
        r0 = r0.m23332I(r5);
        r2.put(r1, r0);
        r1 = "sim_display_name";
        r0 = r4.f50561E;
        r0 = r0.m23334K(r5);
        r2.put(r1, r0);
        r1 = "carrier_country_iso";
        r0 = r4.f50561E;
        r0 = r0.m23326C(r5);
        r2.put(r1, r0);
        r0 = r4.f50561E;
        r0 = r0.m23328E(r5);
        r1 = "network_type";
        r0 = X.AnonymousClass47l.m23316B(r0);
        r2.put(r1, r0);
        r0 = r4.f50561E;
        r0 = r0.m23330G(r5);
        r1 = "phone_type";
        r0 = X.AnonymousClass47l.m23317C(r0);
        r2.put(r1, r0);
        r1 = "country_iso";
        r0 = r4.f50561E;
        r0 = r0.m23333J(r5);
        r2.put(r1, r0);
        r0 = 5;
        if (r3 != r0) goto L_0x0092;
    L_0x007a:
        r1 = "operator";
        r0 = r4.f50561E;
        r0 = r0.m23335L(r5);
        r2.put(r1, r0);
        if (r5 != 0) goto L_0x0092;
    L_0x0087:
        r1 = "sim_operator_name";
        r0 = r4.f50562F;
        r0 = r0.getSimOperatorName();
        r2.put(r1, r0);
    L_0x0092:
        r1 = "phone_number";	 Catch:{ SecurityException -> 0x009e }
        r0 = r4.f50561E;	 Catch:{ SecurityException -> 0x009e }
        r0 = r0.m23329F(r5);	 Catch:{ SecurityException -> 0x009e }
        r2.put(r1, r0);	 Catch:{ SecurityException -> 0x009e }
        goto L_0x00a5;	 Catch:{ SecurityException -> 0x009e }
    L_0x009e:
        r1 = "phone_number";
        r0 = "SecurityException";
        r2.put(r1, r0);
    L_0x00a5:
        r1 = "serial_number";
        r0 = r4.f50561E;
        r0 = r0.m23336M(r5);
        r2.put(r1, r0);
        r1 = "subscriber_id";
        r0 = r4.f50561E;
        r0 = r0.m23337N(r5);
        r2.put(r1, r0);
        r1 = "device_locale";
        r0 = r4.f50560D;
        r0 = r0.toString();
        r2.put(r1, r0);
        r0 = r4.f50558B;
        r0 = r0.getActiveNetworkInfo();
        if (r0 == 0) goto L_0x00d7;
    L_0x00ce:
        r1 = "network_info";
        r0 = r0.getExtraInfo();
        r2.put(r1, r0);
    L_0x00d7:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.47l.E(X.47l, int):java.util.LinkedHashMap");
    }
}
