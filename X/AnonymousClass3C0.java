package X;

import android.content.Context;
import android.os.Binder;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.3C0 */
public final class AnonymousClass3C0 {
    /* renamed from: B */
    public static boolean m18944B(Context context) {
        if (((Boolean) AnonymousClass0CC.QL.G()).booleanValue()) {
            return AnonymousClass3C0.m18947E(context, Collections.emptySet(), Collections.unmodifiableSet(new HashSet(Collections.singletonList("JDi84d23vQJtX_ifWYs7Xlu4JLM"))));
        }
        return false;
    }

    /* renamed from: C */
    public static boolean m18945C(Context context) {
        int callingUid = Binder.getCallingUid();
        int i = context.getApplicationInfo().uid;
        if (callingUid != i) {
            if (context.getPackageManager().checkSignatures(i, callingUid) != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: D */
    public static boolean m18946D(Context context) {
        if (!AnonymousClass3C0.m18944B(context)) {
            if (!((Boolean) AnonymousClass0CC.pJ.G()).booleanValue() || !AnonymousClass3C0.m18947E(context, Collections.unmodifiableSet(new HashSet(Collections.singletonList("com.facebook.kototoro"))), Collections.unmodifiableSet(new HashSet(Collections.singletonList("GoRS3a2OGuGeDTeVe6y0xFgcNbo"))))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: E */
    public static boolean m18947E(android.content.Context r10, java.util.Set r11, java.util.Set r12) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = r10.getPackageManager();
        r1 = android.os.Binder.getCallingUid();
        r0 = r10.getPackageManager();
        r4 = r0.getPackagesForUid(r1);
        r3 = r4.length;
        r10 = 0;
        r2 = 0;
    L_0x0013:
        if (r2 >= r3) goto L_0x0067;
    L_0x0015:
        r8 = r4[r2];
        r0 = r11.isEmpty();
        if (r0 != 0) goto L_0x0024;
    L_0x001d:
        r0 = r11.contains(r8);
        if (r0 != 0) goto L_0x0024;
    L_0x0023:
        goto L_0x0064;
    L_0x0024:
        r0 = 64;
        r1 = r5.getPackageInfo(r8, r0);	 Catch:{ NameNotFoundException -> 0x0064 }
        r0 = r1.signatures;	 Catch:{ NameNotFoundException -> 0x0064 }
        if (r0 == 0) goto L_0x0064;	 Catch:{ NameNotFoundException -> 0x0064 }
    L_0x002e:
        r0 = r1.signatures;	 Catch:{ NameNotFoundException -> 0x0064 }
        r0 = r0.length;	 Catch:{ NameNotFoundException -> 0x0064 }
        r7 = 1;	 Catch:{ NameNotFoundException -> 0x0064 }
        if (r0 != r7) goto L_0x0064;	 Catch:{ NameNotFoundException -> 0x0064 }
    L_0x0034:
        r0 = r1.signatures;	 Catch:{ NameNotFoundException -> 0x0064 }
        r0 = r0[r10];	 Catch:{ NameNotFoundException -> 0x0064 }
        r9 = r0.toByteArray();	 Catch:{ NameNotFoundException -> 0x0064 }
        r0 = "SHA-1";	 Catch:{ NoSuchAlgorithmException -> 0x0068 }
        r6 = java.security.MessageDigest.getInstance(r0);	 Catch:{ NoSuchAlgorithmException -> 0x0068 }
        r1 = 0;	 Catch:{ NoSuchAlgorithmException -> 0x0068 }
        r0 = r9.length;	 Catch:{ NoSuchAlgorithmException -> 0x0068 }
        r6.update(r9, r1, r0);	 Catch:{ NoSuchAlgorithmException -> 0x0068 }
        r1 = r6.digest();	 Catch:{ NoSuchAlgorithmException -> 0x0068 }
        r0 = 11;	 Catch:{ NoSuchAlgorithmException -> 0x0068 }
        r0 = android.util.Base64.encodeToString(r1, r0);	 Catch:{ NoSuchAlgorithmException -> 0x0068 }
        r0 = r12.contains(r0);	 Catch:{ NameNotFoundException -> 0x0064 }
        if (r0 == 0) goto L_0x0064;	 Catch:{ NameNotFoundException -> 0x0064 }
    L_0x0057:
        r0 = r11.isEmpty();	 Catch:{ NameNotFoundException -> 0x0064 }
        if (r0 != 0) goto L_0x0063;	 Catch:{ NameNotFoundException -> 0x0064 }
    L_0x005d:
        r0 = r11.contains(r8);	 Catch:{ NameNotFoundException -> 0x0064 }
        if (r0 == 0) goto L_0x0064;	 Catch:{ NameNotFoundException -> 0x0064 }
    L_0x0063:
        return r7;	 Catch:{ NameNotFoundException -> 0x0064 }
    L_0x0064:
        r2 = r2 + 1;
        goto L_0x0013;
    L_0x0067:
        return r10;
    L_0x0068:
        r1 = move-exception;	 Catch:{ NameNotFoundException -> 0x0064 }
        r0 = new java.lang.RuntimeException;	 Catch:{ NameNotFoundException -> 0x0064 }
        r0.<init>(r1);	 Catch:{ NameNotFoundException -> 0x0064 }
        throw r0;	 Catch:{ NameNotFoundException -> 0x0064 }
        */
        throw new UnsupportedOperationException("Method not decompiled: X.3C0.E(android.content.Context, java.util.Set, java.util.Set):boolean");
    }
}
