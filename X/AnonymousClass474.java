package X;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.474 */
public final class AnonymousClass474 {
    /* renamed from: B */
    public final Context f50388B;
    /* renamed from: C */
    public final TelephonyManager f50389C;
    /* renamed from: D */
    private final ActivityManager f50390D = ((ActivityManager) this.f50388B.getSystemService("activity"));
    /* renamed from: E */
    private final AnonymousClass47m f50391E = new AnonymousClass47m(this.f50388B);

    /* renamed from: J */
    private static String m23285J(int i) {
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

    public AnonymousClass474(Context context) {
        this.f50388B = context;
        this.f50389C = (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: B */
    public static void m23277B(X.AnonymousClass474 r2, java.util.Map r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = r2.f50388B;
        r0 = "android.permission.ACCESS_NETWORK_STATE";
        r0 = r1.checkCallingOrSelfPermission(r0);
        if (r0 == 0) goto L_0x000b;
    L_0x000a:
        return;
    L_0x000b:
        r1 = r2.f50388B;	 Catch:{ Throwable -> 0x0055 }
        r0 = "connectivity";	 Catch:{ Throwable -> 0x0055 }
        r0 = r1.getSystemService(r0);	 Catch:{ Throwable -> 0x0055 }
        r0 = (android.net.ConnectivityManager) r0;	 Catch:{ Throwable -> 0x0055 }
        r2 = r0.getActiveNetworkInfo();	 Catch:{ Throwable -> 0x0055 }
        if (r2 == 0) goto L_0x000a;	 Catch:{ Throwable -> 0x0055 }
    L_0x001b:
        r1 = "network_info";	 Catch:{ Throwable -> 0x0055 }
        r0 = r2.getExtraInfo();	 Catch:{ Throwable -> 0x0055 }
        r3.put(r1, r0);	 Catch:{ Throwable -> 0x0055 }
        r1 = r2.getType();	 Catch:{ Throwable -> 0x0055 }
        r0 = 1;	 Catch:{ Throwable -> 0x0055 }
        if (r1 != r0) goto L_0x0039;	 Catch:{ Throwable -> 0x0055 }
    L_0x002b:
        r0 = r2.isConnected();	 Catch:{ Throwable -> 0x0055 }
        if (r0 == 0) goto L_0x0039;	 Catch:{ Throwable -> 0x0055 }
    L_0x0031:
        r1 = "network_type";	 Catch:{ Throwable -> 0x0055 }
        r0 = "wifi";	 Catch:{ Throwable -> 0x0055 }
        r3.put(r1, r0);	 Catch:{ Throwable -> 0x0055 }
        goto L_0x0054;	 Catch:{ Throwable -> 0x0055 }
    L_0x0039:
        r0 = r2.getType();	 Catch:{ Throwable -> 0x0055 }
        if (r0 != 0) goto L_0x004d;	 Catch:{ Throwable -> 0x0055 }
    L_0x003f:
        r0 = r2.isConnected();	 Catch:{ Throwable -> 0x0055 }
        if (r0 == 0) goto L_0x004d;	 Catch:{ Throwable -> 0x0055 }
    L_0x0045:
        r1 = "network_type";	 Catch:{ Throwable -> 0x0055 }
        r0 = "mobile";	 Catch:{ Throwable -> 0x0055 }
        r3.put(r1, r0);	 Catch:{ Throwable -> 0x0055 }
        goto L_0x0054;	 Catch:{ Throwable -> 0x0055 }
    L_0x004d:
        r1 = "network_type";	 Catch:{ Throwable -> 0x0055 }
        r0 = "unknown";	 Catch:{ Throwable -> 0x0055 }
        r3.put(r1, r0);	 Catch:{ Throwable -> 0x0055 }
    L_0x0054:
        goto L_0x000a;	 Catch:{ Throwable -> 0x0055 }
    L_0x0055:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.474.B(X.474, java.util.Map):void");
    }

    /* renamed from: C */
    public static String m23278C(AnonymousClass474 anonymousClass474) {
        if (anonymousClass474.f50391E.m23324A() && VERSION.SDK_INT >= 18) {
            TelephonyManager telephonyManager = anonymousClass474.f50389C;
            if (telephonyManager != null) {
                return telephonyManager.getGroupIdLevel1();
            }
        }
        return null;
    }

    /* renamed from: D */
    public static java.lang.String m23279D() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = java.net.NetworkInterface.getNetworkInterfaces();	 Catch:{ Exception -> 0x002f }
    L_0x0004:
        r0 = r3.hasMoreElements();	 Catch:{ Exception -> 0x002f }
        if (r0 == 0) goto L_0x002f;	 Catch:{ Exception -> 0x002f }
    L_0x000a:
        r0 = r3.nextElement();	 Catch:{ Exception -> 0x002f }
        r0 = (java.net.NetworkInterface) r0;	 Catch:{ Exception -> 0x002f }
        r2 = r0.getInetAddresses();	 Catch:{ Exception -> 0x002f }
    L_0x0014:
        r0 = r2.hasMoreElements();	 Catch:{ Exception -> 0x002f }
        if (r0 == 0) goto L_0x0004;	 Catch:{ Exception -> 0x002f }
    L_0x001a:
        r1 = r2.nextElement();	 Catch:{ Exception -> 0x002f }
        r1 = (java.net.InetAddress) r1;	 Catch:{ Exception -> 0x002f }
        r0 = r1.isLoopbackAddress();	 Catch:{ Exception -> 0x002f }
        if (r0 != 0) goto L_0x0014;	 Catch:{ Exception -> 0x002f }
    L_0x0026:
        r0 = r1 instanceof java.net.Inet4Address;	 Catch:{ Exception -> 0x002f }
        if (r0 == 0) goto L_0x0014;	 Catch:{ Exception -> 0x002f }
    L_0x002a:
        r0 = r1.getHostAddress();	 Catch:{ Exception -> 0x002f }
        return r0;	 Catch:{ Exception -> 0x002f }
    L_0x002f:
        r0 = "";
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.474.D():java.lang.String");
    }

    /* renamed from: E */
    public static java.lang.String m23280E() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = java.net.NetworkInterface.getNetworkInterfaces();	 Catch:{ Exception -> 0x004e }
    L_0x0004:
        r0 = r4.hasMoreElements();	 Catch:{ Exception -> 0x004e }
        if (r0 == 0) goto L_0x004e;	 Catch:{ Exception -> 0x004e }
    L_0x000a:
        r0 = r4.nextElement();	 Catch:{ Exception -> 0x004e }
        r0 = (java.net.NetworkInterface) r0;	 Catch:{ Exception -> 0x004e }
        r3 = r0.getInetAddresses();	 Catch:{ Exception -> 0x004e }
    L_0x0014:
        r0 = r3.hasMoreElements();	 Catch:{ Exception -> 0x004e }
        if (r0 == 0) goto L_0x0004;	 Catch:{ Exception -> 0x004e }
    L_0x001a:
        r1 = r3.nextElement();	 Catch:{ Exception -> 0x004e }
        r1 = (java.net.InetAddress) r1;	 Catch:{ Exception -> 0x004e }
        r0 = r1.isLoopbackAddress();	 Catch:{ Exception -> 0x004e }
        if (r0 != 0) goto L_0x0014;	 Catch:{ Exception -> 0x004e }
    L_0x0026:
        r0 = r1 instanceof java.net.Inet6Address;	 Catch:{ Exception -> 0x004e }
        if (r0 == 0) goto L_0x0014;	 Catch:{ Exception -> 0x004e }
    L_0x002a:
        r2 = r1.getHostAddress();	 Catch:{ Exception -> 0x004e }
        r0 = "fe80";	 Catch:{ Exception -> 0x004e }
        r0 = r2.startsWith(r0);	 Catch:{ Exception -> 0x004e }
        if (r0 != 0) goto L_0x0014;	 Catch:{ Exception -> 0x004e }
    L_0x0036:
        r0 = "FE80";	 Catch:{ Exception -> 0x004e }
        r0 = r2.startsWith(r0);	 Catch:{ Exception -> 0x004e }
        if (r0 == 0) goto L_0x003f;	 Catch:{ Exception -> 0x004e }
    L_0x003e:
        goto L_0x0014;	 Catch:{ Exception -> 0x004e }
    L_0x003f:
        r0 = 37;	 Catch:{ Exception -> 0x004e }
        r1 = r2.indexOf(r0);	 Catch:{ Exception -> 0x004e }
        if (r1 >= 0) goto L_0x0048;	 Catch:{ Exception -> 0x004e }
    L_0x0047:
        goto L_0x004d;	 Catch:{ Exception -> 0x004e }
    L_0x0048:
        r0 = 0;	 Catch:{ Exception -> 0x004e }
        r2 = r2.substring(r0, r1);	 Catch:{ Exception -> 0x004e }
    L_0x004d:
        return r2;	 Catch:{ Exception -> 0x004e }
    L_0x004e:
        r0 = "";
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.474.E():java.lang.String");
    }

    /* renamed from: F */
    public static long m23281F(AnonymousClass474 anonymousClass474) {
        if (VERSION.SDK_INT < 16) {
            return -1;
        }
        MemoryInfo memoryInfo = new MemoryInfo();
        anonymousClass474.f50390D.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem / 1048576;
    }

    /* renamed from: G */
    public static int m23282G(X.AnonymousClass474 r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = r3.f50388B;
        r0 = "android.permission.ACCESS_NETWORK_STATE";
        r0 = r1.checkCallingOrSelfPermission(r0);
        r2 = -1;
        if (r0 == 0) goto L_0x000c;
    L_0x000b:
        return r2;
    L_0x000c:
        r1 = r3.f50388B;	 Catch:{ Throwable -> 0x0021 }
        r0 = "connectivity";	 Catch:{ Throwable -> 0x0021 }
        r0 = r1.getSystemService(r0);	 Catch:{ Throwable -> 0x0021 }
        r0 = (android.net.ConnectivityManager) r0;	 Catch:{ Throwable -> 0x0021 }
        r0 = r0.getActiveNetworkInfo();	 Catch:{ Throwable -> 0x0021 }
        if (r0 == 0) goto L_0x000b;	 Catch:{ Throwable -> 0x0021 }
    L_0x001c:
        r0 = r0.isRoaming();	 Catch:{ Throwable -> 0x0021 }
        return r0;	 Catch:{ Throwable -> 0x0021 }
    L_0x0021:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.474.G(X.474):int");
    }

    /* renamed from: H */
    public static Map m23283H(AnonymousClass474 anonymousClass474) {
        Map linkedHashMap = new LinkedHashMap();
        if (anonymousClass474.f50389C != null) {
            for (int i = 0; i < 2; i++) {
                AnonymousClass474.m23284I(anonymousClass474, linkedHashMap, i);
            }
        }
        return linkedHashMap;
    }

    /* renamed from: I */
    private static void m23284I(AnonymousClass474 anonymousClass474, Map map, int i) {
        int H = anonymousClass474.f50391E.m23331H(i);
        if (H != -1) {
            if (i == 0) {
                map.put("state_1", AnonymousClass474.m23285J(H));
                map.put("imei_1", anonymousClass474.f50391E.m23325B(i));
                map.put("carrier_1", anonymousClass474.f50391E.m23338O(i));
                map.put("mcc_1", anonymousClass474.f50391E.m23339P(i));
                map.put("mnc_1", anonymousClass474.f50391E.m23340Q(i));
            } else if (i == 1) {
                map.put("state_2", AnonymousClass474.m23285J(H));
                map.put("imei_2", anonymousClass474.f50391E.m23325B(i));
                map.put("carrier_2", anonymousClass474.f50391E.m23338O(i));
                map.put("mcc_2", anonymousClass474.f50391E.m23339P(i));
                map.put("mnc_2", anonymousClass474.f50391E.m23340Q(i));
            }
        }
    }
}
