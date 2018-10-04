package org.webrtc;

import java.util.Map.Entry;

public class JniHelper {
    public static Object getKey(Entry entry) {
        return entry.getKey();
    }

    public static byte[] getStringBytes(java.lang.String r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "ISO-8859-1";	 Catch:{ UnsupportedEncodingException -> 0x0007 }
        r0 = r1.getBytes(r0);	 Catch:{ UnsupportedEncodingException -> 0x0007 }
        return r0;	 Catch:{ UnsupportedEncodingException -> 0x0007 }
    L_0x0007:
        r1 = new java.lang.RuntimeException;
        r0 = "ISO-8859-1 is unsupported";
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.JniHelper.getStringBytes(java.lang.String):byte[]");
    }

    public static Object getStringClass() {
        return String.class;
    }

    public static Object getValue(Entry entry) {
        return entry.getValue();
    }
}
