package com.instagram.realtimeclient;

public class RealtimeStoreKey {

    public class ShimValueWithId {
        public String id;
    }

    public static java.lang.String getKey(com.instagram.realtimeclient.RealtimeOperation r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = r4.path;
        r0 = "/direct_v2";
        r0 = r3.startsWith(r0);
        if (r0 == 0) goto L_0x000b;
    L_0x000a:
        return r3;
    L_0x000b:
        r2 = 0;
        r0 = r4.value;	 Catch:{ Exception -> 0x0012 }
        r2 = com.instagram.realtimeclient.RealtimeStoreKey_ShimValueWithId__JsonHelper.parseFromJson(r0);	 Catch:{ Exception -> 0x0012 }
    L_0x0012:
        if (r2 == 0) goto L_0x000a;
    L_0x0014:
        r0 = r2.id;
        if (r0 != 0) goto L_0x0019;
    L_0x0018:
        goto L_0x000a;
    L_0x0019:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r3);
        r0 = "/";
        r1.append(r0);
        r0 = r2.id;
        r1.append(r0);
        r0 = r1.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.realtimeclient.RealtimeStoreKey.getKey(com.instagram.realtimeclient.RealtimeOperation):java.lang.String");
    }
}
