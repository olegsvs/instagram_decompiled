package com.facebook.proxygen;

import java.util.Map;

public final class TraceEventUtil {
    public static boolean readBooleanMeta(Map map, String str, boolean z) {
        if (!map.containsKey(str)) {
            return z;
        }
        if (!Boolean.parseBoolean((String) map.get(str))) {
            if (!((String) map.get(str)).equals("1")) {
                return false;
            }
        }
        return true;
    }

    public static int readIntMeta(java.util.Map r1, java.lang.String r2, int r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r1.containsKey(r2);
        if (r0 != 0) goto L_0x0007;
    L_0x0006:
        return r3;
    L_0x0007:
        r0 = r1.get(r2);	 Catch:{ NumberFormatException -> 0x0012 }
        r0 = (java.lang.String) r0;	 Catch:{ NumberFormatException -> 0x0012 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x0012 }
        return r0;	 Catch:{ NumberFormatException -> 0x0012 }
    L_0x0012:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.proxygen.TraceEventUtil.readIntMeta(java.util.Map, java.lang.String, int):int");
    }

    public static String readStrMeta(Map map, String str, String str2) {
        if (map.containsKey(str)) {
            return (String) map.get(str);
        }
        return str2;
    }
}
