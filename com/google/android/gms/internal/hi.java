package com.google.android.gms.internal;

import X.AnonymousClass1zx;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class hi {
    /* renamed from: B */
    private static Uri f25133B = Uri.parse("content://com.google.android.gsf.gservices");
    /* renamed from: C */
    private static Uri f25134C = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    /* renamed from: D */
    public static final AtomicBoolean f25135D = new AtomicBoolean();
    /* renamed from: E */
    private static HashMap f25136E;
    /* renamed from: F */
    private static HashMap f25137F = new HashMap();
    /* renamed from: G */
    private static HashMap f25138G = new HashMap();
    /* renamed from: H */
    private static HashMap f25139H = new HashMap();
    /* renamed from: I */
    private static HashMap f25140I = new HashMap();
    /* renamed from: J */
    public static Object f25141J;
    /* renamed from: K */
    private static boolean f25142K;
    /* renamed from: L */
    private static String[] f25143L = new String[0];

    static {
        Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        Pattern.compile("^(0|false|f|off|no|n)$", 2);
    }

    /* renamed from: B */
    public static void m14126B(ContentResolver contentResolver) {
        if (f25136E == null) {
            f25135D.set(false);
            f25136E = new HashMap();
            f25141J = new Object();
            f25142K = false;
            contentResolver.registerContentObserver(f25133B, true, new AnonymousClass1zx(null));
            return;
        }
        if (f25135D.getAndSet(false)) {
            f25136E.clear();
            f25137F.clear();
            f25138G.clear();
            f25139H.clear();
            f25140I.clear();
            f25141J = new Object();
            f25142K = false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: C */
    private static java.lang.Object m14127C(java.util.HashMap r2, java.lang.String r3, java.lang.Object r4) {
        /*
        r1 = com.google.android.gms.internal.hi.class;
        monitor-enter(r1);
        r0 = r2.containsKey(r3);	 Catch:{ all -> 0x0016 }
        if (r0 == 0) goto L_0x0013;
    L_0x0009:
        r0 = r2.get(r3);	 Catch:{ all -> 0x0016 }
        if (r0 == 0) goto L_0x0010;
    L_0x000f:
        goto L_0x0011;
    L_0x0010:
        r0 = r4;
    L_0x0011:
        monitor-exit(r1);	 Catch:{ all -> 0x0016 }
        return r0;
    L_0x0013:
        monitor-exit(r1);	 Catch:{ all -> 0x0016 }
        r0 = 0;
        return r0;
    L_0x0016:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0016 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.hi.C(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* renamed from: D */
    private static Map m14128D(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f25134C, null, null, strArr, null);
        Map treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }

    /* renamed from: E */
    private static void m14129E(Object obj, String str, String str2) {
        synchronized (hi.class) {
            if (obj == f25141J) {
                f25136E.put(str, str2);
            }
        }
    }

    /* renamed from: F */
    private static void m14130F(ContentResolver contentResolver, String[] strArr) {
        f25136E.putAll(m14128D(contentResolver, strArr));
        f25142K = true;
    }

    public static long getLong(android.content.ContentResolver r7, java.lang.String r8, long r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = com.google.android.gms.internal.hi.class;
        monitor-enter(r1);
        m14126B(r7);	 Catch:{ all -> 0x0045 }
        r6 = f25141J;	 Catch:{ all -> 0x0045 }
        monitor-exit(r1);	 Catch:{ all -> 0x0045 }
        r1 = f25139H;
        r4 = 0;
        r0 = java.lang.Long.valueOf(r4);
        r3 = m14127C(r1, r8, r0);
        r3 = (java.lang.Long) r3;
        if (r3 == 0) goto L_0x001e;
    L_0x0019:
        r0 = r3.longValue();
        return r0;
    L_0x001e:
        r0 = 0;
        r0 = zza(r7, r8, r0);
        if (r0 != 0) goto L_0x0026;
    L_0x0025:
        goto L_0x002f;
    L_0x0026:
        r0 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x002f }
        r3 = java.lang.Long.valueOf(r0);	 Catch:{ NumberFormatException -> 0x002f }
        r4 = r0;	 Catch:{ NumberFormatException -> 0x002f }
    L_0x002f:
        r2 = f25139H;
        r1 = com.google.android.gms.internal.hi.class;
        monitor-enter(r1);
        r0 = f25141J;	 Catch:{ all -> 0x0042 }
        if (r6 != r0) goto L_0x0040;	 Catch:{ all -> 0x0042 }
    L_0x0038:
        r2.put(r8, r3);	 Catch:{ all -> 0x0042 }
        r0 = f25136E;	 Catch:{ all -> 0x0042 }
        r0.remove(r8);	 Catch:{ all -> 0x0042 }
    L_0x0040:
        monitor-exit(r1);	 Catch:{ all -> 0x0042 }
        return r4;	 Catch:{ all -> 0x0042 }
    L_0x0042:
        r0 = move-exception;	 Catch:{ all -> 0x0042 }
        monitor-exit(r1);	 Catch:{ all -> 0x0042 }
    L_0x0044:
        throw r0;
    L_0x0045:
        r0 = move-exception;	 Catch:{ all -> 0x0045 }
        monitor-exit(r1);	 Catch:{ all -> 0x0045 }
        goto L_0x0044;	 Catch:{ all -> 0x0045 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.hi.getLong(android.content.ContentResolver, java.lang.String, long):long");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String zza(android.content.ContentResolver r13, java.lang.String r14, java.lang.String r15) {
        /*
        r7 = com.google.android.gms.internal.hi.class;
        monitor-enter(r7);
        r8 = r13;
        m14126B(r13);	 Catch:{ all -> 0x009c }
        r4 = f25141J;	 Catch:{ all -> 0x009c }
        r0 = f25136E;	 Catch:{ all -> 0x009c }
        r0 = r0.containsKey(r14);	 Catch:{ all -> 0x009c }
        r3 = 0;
        if (r0 == 0) goto L_0x0020;
    L_0x0012:
        r0 = f25136E;	 Catch:{ all -> 0x009c }
        r0 = r0.get(r14);	 Catch:{ all -> 0x009c }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x009c }
        if (r0 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001e;
    L_0x001d:
        r0 = r3;
    L_0x001e:
        monitor-exit(r7);	 Catch:{ all -> 0x009c }
        return r0;
    L_0x0020:
        r6 = f25143L;	 Catch:{ all -> 0x009c }
        r5 = r6.length;	 Catch:{ all -> 0x009c }
        r2 = 0;
        r1 = 0;
    L_0x0025:
        if (r1 >= r5) goto L_0x005a;
    L_0x0027:
        r0 = r6[r1];	 Catch:{ all -> 0x009c }
        r0 = r14.startsWith(r0);	 Catch:{ all -> 0x009c }
        if (r0 == 0) goto L_0x0057;
    L_0x002f:
        r0 = f25142K;	 Catch:{ all -> 0x009c }
        if (r0 == 0) goto L_0x003b;
    L_0x0033:
        r0 = f25136E;	 Catch:{ all -> 0x009c }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x009c }
        if (r0 == 0) goto L_0x0055;
    L_0x003b:
        r0 = f25143L;	 Catch:{ all -> 0x009c }
        m14130F(r13, r0);	 Catch:{ all -> 0x009c }
        r0 = f25136E;	 Catch:{ all -> 0x009c }
        r0 = r0.containsKey(r14);	 Catch:{ all -> 0x009c }
        if (r0 == 0) goto L_0x0055;
    L_0x0048:
        r0 = f25136E;	 Catch:{ all -> 0x009c }
        r0 = r0.get(r14);	 Catch:{ all -> 0x009c }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x009c }
        if (r0 == 0) goto L_0x0053;
    L_0x0052:
        goto L_0x001e;
    L_0x0053:
        r0 = r3;
        goto L_0x001e;
    L_0x0055:
        monitor-exit(r7);	 Catch:{ all -> 0x009c }
    L_0x0056:
        return r3;
    L_0x0057:
        r1 = r1 + 1;
        goto L_0x0025;
    L_0x005a:
        monitor-exit(r7);	 Catch:{ all -> 0x009c }
        r9 = f25133B;
        r10 = 0;
        r11 = 0;
        r1 = 1;
        r12 = new java.lang.String[r1];
        r12[r2] = r14;
        r13 = 0;
        r2 = r8.query(r9, r10, r11, r12, r13);
        if (r2 == 0) goto L_0x008c;
    L_0x006b:
        r0 = r2.moveToFirst();	 Catch:{ all -> 0x0095 }
        if (r0 != 0) goto L_0x0072;
    L_0x0071:
        goto L_0x008c;
    L_0x0072:
        r1 = r2.getString(r1);	 Catch:{ all -> 0x0095 }
        if (r1 == 0) goto L_0x007f;
    L_0x0078:
        r0 = r1.equals(r3);	 Catch:{ all -> 0x0095 }
        if (r0 == 0) goto L_0x007f;
    L_0x007e:
        r1 = r3;
    L_0x007f:
        m14129E(r4, r14, r1);	 Catch:{ all -> 0x0095 }
        if (r1 == 0) goto L_0x0085;
    L_0x0084:
        goto L_0x0086;
    L_0x0085:
        r1 = r3;
    L_0x0086:
        if (r2 == 0) goto L_0x008b;
    L_0x0088:
        r2.close();
    L_0x008b:
        return r1;
    L_0x008c:
        m14129E(r4, r14, r3);	 Catch:{ all -> 0x0095 }
        if (r2 == 0) goto L_0x0056;
    L_0x0091:
        r2.close();
        goto L_0x0056;
    L_0x0095:
        r0 = move-exception;
        if (r2 == 0) goto L_0x009b;
    L_0x0098:
        r2.close();
    L_0x009b:
        throw r0;
    L_0x009c:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x009c }
        goto L_0x009b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.hi.zza(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void zzb(android.content.ContentResolver r8, java.lang.String... r9) {
        /*
        r0 = r9.length;
        if (r0 != 0) goto L_0x0004;
    L_0x0003:
        return;
    L_0x0004:
        r7 = com.google.android.gms.internal.hi.class;
        monitor-enter(r7);
        m14126B(r8);	 Catch:{ all -> 0x0077 }
        r0 = f25143L;	 Catch:{ all -> 0x0077 }
        r1 = r0.length;	 Catch:{ all -> 0x0077 }
        r0 = r9.length;	 Catch:{ all -> 0x0077 }
        r1 = r1 + r0;
        r0 = r1 << 2;
        r0 = r0 / 3;
        r0 = r0 + 1;
        r6 = new java.util.HashSet;	 Catch:{ all -> 0x0077 }
        r6.<init>(r0);	 Catch:{ all -> 0x0077 }
        r0 = f25143L;	 Catch:{ all -> 0x0077 }
        r0 = java.util.Arrays.asList(r0);	 Catch:{ all -> 0x0077 }
        r6.addAll(r0);	 Catch:{ all -> 0x0077 }
        r5 = new java.util.ArrayList;	 Catch:{ all -> 0x0077 }
        r5.<init>();	 Catch:{ all -> 0x0077 }
        r4 = r9.length;	 Catch:{ all -> 0x0077 }
        r3 = 0;
        r2 = 0;
    L_0x002b:
        if (r2 >= r4) goto L_0x003b;
    L_0x002d:
        r1 = r9[r2];	 Catch:{ all -> 0x0077 }
        r0 = r6.add(r1);	 Catch:{ all -> 0x0077 }
        if (r0 == 0) goto L_0x0038;
    L_0x0035:
        r5.add(r1);	 Catch:{ all -> 0x0077 }
    L_0x0038:
        r2 = r2 + 1;
        goto L_0x002b;
    L_0x003b:
        r0 = r5.isEmpty();	 Catch:{ all -> 0x0077 }
        if (r0 == 0) goto L_0x0044;
    L_0x0041:
        r1 = new java.lang.String[r3];	 Catch:{ all -> 0x0077 }
        goto L_0x005e;
    L_0x0044:
        r0 = r6.size();	 Catch:{ all -> 0x0077 }
        r0 = new java.lang.String[r0];	 Catch:{ all -> 0x0077 }
        r0 = r6.toArray(r0);	 Catch:{ all -> 0x0077 }
        r0 = (java.lang.String[]) r0;	 Catch:{ all -> 0x0077 }
        f25143L = r0;	 Catch:{ all -> 0x0077 }
        r0 = r5.size();	 Catch:{ all -> 0x0077 }
        r0 = new java.lang.String[r0];	 Catch:{ all -> 0x0077 }
        r1 = r5.toArray(r0);	 Catch:{ all -> 0x0077 }
        r1 = (java.lang.String[]) r1;	 Catch:{ all -> 0x0077 }
    L_0x005e:
        r0 = f25142K;	 Catch:{ all -> 0x0077 }
        if (r0 == 0) goto L_0x0072;
    L_0x0062:
        r0 = f25136E;	 Catch:{ all -> 0x0077 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0077 }
        if (r0 == 0) goto L_0x006b;
    L_0x006a:
        goto L_0x0072;
    L_0x006b:
        r0 = r1.length;	 Catch:{ all -> 0x0077 }
        if (r0 == 0) goto L_0x0075;
    L_0x006e:
        m14130F(r8, r1);	 Catch:{ all -> 0x0077 }
        goto L_0x0075;
    L_0x0072:
        r1 = f25143L;	 Catch:{ all -> 0x0077 }
        goto L_0x006e;
    L_0x0075:
        monitor-exit(r7);	 Catch:{ all -> 0x0077 }
        goto L_0x0003;
    L_0x0077:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x0077 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.hi.zzb(android.content.ContentResolver, java.lang.String[]):void");
    }
}
