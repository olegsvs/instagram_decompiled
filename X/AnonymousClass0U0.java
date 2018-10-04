package X;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.0U0 */
public abstract class AnonymousClass0U0 implements AnonymousClass0OV {
    /* renamed from: B */
    public long f5323B = System.currentTimeMillis();
    /* renamed from: C */
    public String f5324C = UUID.randomUUID().toString();
    /* renamed from: D */
    public String f5325D = "queued";
    /* renamed from: E */
    public int f5326E;
    /* renamed from: F */
    public Set f5327F = new HashSet();

    /* renamed from: A */
    public abstract String mo1287A();

    /* renamed from: B */
    public abstract boolean mo1290B();

    /* renamed from: C */
    public final boolean m4673C() {
        return this.f5326E > 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: D */
    public final void m4674D(java.lang.String r8) {
        /*
        r7 = this;
        r0 = r7.f5325D;
        r0 = r0.equals(r8);
        if (r0 == 0) goto L_0x0009;
    L_0x0008:
        return;
    L_0x0009:
        r6 = r7.f5325D;
        r0 = r6.hashCode();
        r5 = 1885454214; // 0x7061bf86 float:2.7946266E29 double:9.31538154E-315;
        r4 = 1501196714; // 0x597a71aa float:4.40585745E15 double:7.41689724E-315;
        r3 = -948696717; // 0xffffffffc7740973 float:-62473.45 double:NaN;
        r2 = -1;
        r1 = 0;
        if (r0 == r3) goto L_0x0035;
    L_0x001c:
        if (r0 == r4) goto L_0x002b;
    L_0x001e:
        if (r0 == r5) goto L_0x0021;
    L_0x0020:
        goto L_0x003f;
    L_0x0021:
        r0 = "upload_failed_transient";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x003f;
    L_0x0029:
        r0 = 1;
        goto L_0x0040;
    L_0x002b:
        r0 = "upload_failed_permanent";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x003f;
    L_0x0033:
        r0 = 2;
        goto L_0x0040;
    L_0x0035:
        r0 = "queued";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x003f;
    L_0x003d:
        r0 = 0;
        goto L_0x0040;
    L_0x003f:
        r0 = -1;
    L_0x0040:
        switch(r0) {
            case 0: goto L_0x005b;
            case 1: goto L_0x0044;
            case 2: goto L_0x007a;
            default: goto L_0x0043;
        };
    L_0x0043:
        goto L_0x007a;
    L_0x0044:
        r0 = r8.hashCode();
        if (r0 == r3) goto L_0x004b;
    L_0x004a:
        goto L_0x0054;
    L_0x004b:
        r0 = "queued";
        r0 = r8.equals(r0);
        if (r0 == 0) goto L_0x0054;
    L_0x0053:
        r2 = 0;
    L_0x0054:
        if (r2 == 0) goto L_0x0057;
    L_0x0056:
        goto L_0x007a;
    L_0x0057:
        r7.f5326E = r1;
    L_0x0059:
        r1 = 1;
        goto L_0x007a;
    L_0x005b:
        r0 = r8.hashCode();
        if (r0 == r4) goto L_0x006e;
    L_0x0061:
        if (r0 == r5) goto L_0x0064;
    L_0x0063:
        goto L_0x0077;
    L_0x0064:
        r0 = "upload_failed_transient";
        r0 = r8.equals(r0);
        if (r0 == 0) goto L_0x0077;
    L_0x006c:
        r2 = 0;
        goto L_0x0077;
    L_0x006e:
        r0 = "upload_failed_permanent";
        r0 = r8.equals(r0);
        if (r0 == 0) goto L_0x0077;
    L_0x0076:
        r2 = 1;
    L_0x0077:
        switch(r2) {
            case 0: goto L_0x0059;
            case 1: goto L_0x0059;
            default: goto L_0x007a;
        };
    L_0x007a:
        if (r1 == 0) goto L_0x007f;
    L_0x007c:
        r7.f5325D = r8;
        return;
    L_0x007f:
        r2 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Invalid transition from ";
        r1.append(r0);
        r0 = r7.f5325D;
        r1.append(r0);
        r0 = " to ";
        r1.append(r0);
        r1.append(r8);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0U0.D(java.lang.String):void");
    }

    public final String hT() {
        return mo1287A();
    }
}
