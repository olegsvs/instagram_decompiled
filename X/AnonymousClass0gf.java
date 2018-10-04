package X;

import android.net.Uri;

/* renamed from: X.0gf */
public final class AnonymousClass0gf {
    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    public static boolean m6670B(java.lang.String r3) {
        /*
        if (r3 == 0) goto L_0x005a;
    L_0x0002:
        r0 = "instagram.com";
        r0 = r3.equals(r0);
        if (r0 != 0) goto L_0x0015;
    L_0x000a:
        r0 = ".instagram.com";
        r0 = r3.endsWith(r0);
        if (r0 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0015;
    L_0x0013:
        r0 = 0;
        goto L_0x0016;
    L_0x0015:
        r0 = 1;
    L_0x0016:
        if (r0 != 0) goto L_0x0058;
    L_0x0018:
        r0 = X.AnonymousClass0fz.m6579E();
        if (r0 == 0) goto L_0x0055;
    L_0x001e:
        r0 = "\\.";
        r3 = r3.split(r0);
        r0 = r3.length;
        r2 = 4;
        if (r0 < r2) goto L_0x0050;
    L_0x0028:
        r0 = r3.length;
        r0 = r0 + -2;
        r1 = r3[r0];
        r0 = "facebook";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0050;
    L_0x0035:
        r0 = r3.length;
        r0 = r0 + -3;
        r1 = r3[r0];
        r0 = "sb";
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x004e;
    L_0x0042:
        r0 = r3.length;
        r0 = r0 - r2;
        r1 = r3[r0];
        r0 = "dev";
        r0 = r1.startsWith(r0);
        if (r0 == 0) goto L_0x0050;
    L_0x004e:
        r0 = 1;
        goto L_0x0051;
    L_0x0050:
        r0 = 0;
    L_0x0051:
        if (r0 == 0) goto L_0x0055;
    L_0x0053:
        r0 = 1;
        goto L_0x0056;
    L_0x0055:
        r0 = 0;
    L_0x0056:
        if (r0 == 0) goto L_0x005a;
    L_0x0058:
        r0 = 1;
        goto L_0x005b;
    L_0x005a:
        r0 = 0;
    L_0x005b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0gf.B(java.lang.String):boolean");
    }

    /* renamed from: C */
    public static boolean m6671C(String str) {
        return (str == null || AnonymousClass0gf.m6670B(Uri.parse(str).getHost()) == null) ? null : true;
    }
}
