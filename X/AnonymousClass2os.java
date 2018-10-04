package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.2os */
public final class AnonymousClass2os {
    /* renamed from: B */
    private final AnonymousClass2or f34367B = new AnonymousClass2or();

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: A */
    public final java.util.List m17303A(X.AnonymousClass2of r19, java.util.List r20) {
        /*
        r18 = this;
        r4 = r18;
        r10 = r19;
        r2 = r20;
        if (r19 != 0) goto L_0x000d;
    L_0x0008:
        r0 = r4.m17304B(r2);
        return r0;
    L_0x000d:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = r2.isEmpty();
        if (r1 == 0) goto L_0x0043;
    L_0x0018:
        r14 = new java.util.HashSet;
        r14.<init>();
        r15 = new java.util.ArrayList;
        r15.<init>();
        r1 = X.AnonymousClass2oj.INSTALLER_NOT_INSTALLED;
        r14.add(r1);
        r1 = X.AnonymousClass2os.m17301B(r10);
        r14.addAll(r1);
        r6 = new X.2ok;
        r7 = 0;
        r7 = (X.AnonymousClass1Fo) r7;
        r1 = 0;
        r11 = java.lang.Integer.valueOf(r1);
        r8 = 3;
        r9 = 0;
        r12 = 0;
        r13 = 0;
        r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15);
        r0.add(r6);
        return r0;
    L_0x0043:
        r9 = r2.iterator();
    L_0x0047:
        r1 = r9.hasNext();
        if (r1 == 0) goto L_0x0128;
    L_0x004d:
        r14 = r9.next();
        r14 = (X.AnonymousClass2oi) r14;
        r3 = new java.util.HashSet;
        r3.<init>();
        r1 = X.AnonymousClass2os.m17301B(r10);
        r3.addAll(r1);
        r1 = X.AnonymousClass2os.m17302C(r14);
        r3.addAll(r1);
        r2 = X.AnonymousClass2oq.f34365B;
        r1 = r10.f34321D;
        r1 = r1.ordinal();
        r1 = r2[r1];
        r8 = 4;
        r7 = 2;
        r6 = 3;
        r5 = 1;
        r2 = 0;
        switch(r1) {
            case 1: goto L_0x00d1;
            case 2: goto L_0x0095;
            case 3: goto L_0x008b;
            default: goto L_0x0078;
        };
    L_0x0078:
        r16 = java.lang.Integer.valueOf(r2);
        r1 = X.AnonymousClass2oj.UNRECOGNIZED_CONFIGURATION;
        r3.add(r1);
    L_0x0081:
        r6 = new java.util.HashSet;
        r6.<init>();
        r5 = r3.iterator();
        goto L_0x00f6;
    L_0x008b:
        r16 = java.lang.Integer.valueOf(r2);
        r1 = X.AnonymousClass2oj.APP_MANAGER_BAD_SIGNATURE;
        r3.add(r1);
        goto L_0x0081;
    L_0x0095:
        r1 = r14.f34336D;
        r1 = r1.ordinal();
        switch(r1) {
            case 0: goto L_0x00cc;
            case 1: goto L_0x00c2;
            case 2: goto L_0x00bd;
            case 3: goto L_0x00b3;
            case 4: goto L_0x00a9;
            case 5: goto L_0x009f;
            default: goto L_0x009e;
        };
    L_0x009e:
        goto L_0x0078;
    L_0x009f:
        r16 = java.lang.Integer.valueOf(r8);
        r1 = X.AnonymousClass2oj.INCOMPATIBLE;
        r3.add(r1);
        goto L_0x0081;
    L_0x00a9:
        r16 = java.lang.Integer.valueOf(r7);
        r1 = X.AnonymousClass2oj.INCOMPATIBLE;
        r3.add(r1);
        goto L_0x0081;
    L_0x00b3:
        r16 = java.lang.Integer.valueOf(r2);
        r1 = X.AnonymousClass2oj.INSTALLER_BAD_SIGNATURE;
        r3.add(r1);
        goto L_0x0081;
    L_0x00bd:
        r16 = java.lang.Integer.valueOf(r6);
        goto L_0x0081;
    L_0x00c2:
        r16 = java.lang.Integer.valueOf(r5);
        r1 = X.AnonymousClass2oj.INCOMPATIBLE;
        r3.add(r1);
        goto L_0x0081;
    L_0x00cc:
        r16 = java.lang.Integer.valueOf(r5);
        goto L_0x0081;
    L_0x00d1:
        r1 = r14.f34336D;
        r1 = r1.ordinal();
        switch(r1) {
            case 0: goto L_0x00c2;
            case 1: goto L_0x00cc;
            case 2: goto L_0x00e5;
            case 3: goto L_0x00b3;
            case 4: goto L_0x00e0;
            case 5: goto L_0x00db;
            default: goto L_0x00da;
        };
    L_0x00da:
        goto L_0x0078;
    L_0x00db:
        r16 = java.lang.Integer.valueOf(r8);
        goto L_0x0081;
    L_0x00e0:
        r16 = java.lang.Integer.valueOf(r7);
        goto L_0x0081;
    L_0x00e5:
        r16 = java.lang.Integer.valueOf(r6);
        r2 = r14.f34337E;
        r1 = 63328846; // 0x3c6524e float:1.165629E-36 double:3.1288607E-316;
        if (r2 >= r1) goto L_0x0081;
    L_0x00f0:
        r1 = X.AnonymousClass2oj.INCOMPATIBLE;
        r3.add(r1);
        goto L_0x0081;
    L_0x00f6:
        r1 = r5.hasNext();
        if (r1 == 0) goto L_0x010a;
    L_0x00fc:
        r2 = r5.next();
        r2 = (X.AnonymousClass2oj) r2;
        r1 = r2.f34348B;
        if (r1 == 0) goto L_0x00f6;
    L_0x0106:
        r6.add(r2);
        goto L_0x00f6;
    L_0x010a:
        r11 = new X.2ok;
        r12 = 0;
        r12 = (X.AnonymousClass1Fo) r12;
        r13 = 3;
        r17 = r6.isEmpty();
        r18 = r3.isEmpty();
        r20 = new java.util.ArrayList;
        r20.<init>();
        r15 = r10;
        r19 = r3;
        r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20);
        r0.add(r11);
        goto L_0x0047;
    L_0x0128:
        r1 = r4.f34367B;
        java.util.Collections.sort(r0, r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2os.A(X.2of, java.util.List):java.util.List");
    }

    /* renamed from: B */
    public final List m17304B(List list) {
        List arrayList = new ArrayList();
        if (list.isEmpty()) {
            Set hashSet = new HashSet();
            hashSet.add(AnonymousClass2oj.APP_MANAGER_NOT_INSTALLED);
            hashSet.add(AnonymousClass2oj.INSTALLER_NOT_INSTALLED);
            arrayList.add(new AnonymousClass2ok((AnonymousClass1Fo) null, 3, null, null, Integer.valueOf(0), false, false, hashSet, new ArrayList()));
            return arrayList;
        }
        for (AnonymousClass2oi anonymousClass2oi : list) {
            Integer valueOf;
            Set hashSet2 = new HashSet();
            hashSet2.add(AnonymousClass2oj.APP_MANAGER_NOT_INSTALLED);
            hashSet2.addAll(AnonymousClass2os.m17302C(anonymousClass2oi));
            switch (AnonymousClass2oq.f34366C[anonymousClass2oi.f34336D.ordinal()]) {
                case 1:
                case 2:
                    valueOf = Integer.valueOf(1);
                    break;
                case 3:
                    valueOf = Integer.valueOf(3);
                    break;
                case 5:
                    valueOf = Integer.valueOf(2);
                    break;
                case 6:
                    valueOf = Integer.valueOf(4);
                    break;
                default:
                    valueOf = Integer.valueOf(0);
                    break;
            }
            arrayList.add(new AnonymousClass2ok((AnonymousClass1Fo) null, 3, anonymousClass2oi, null, valueOf, false, false, hashSet2, new ArrayList()));
        }
        Collections.sort(arrayList, this.f34367B);
        return arrayList;
    }

    /* renamed from: B */
    public static final Set m17301B(AnonymousClass2of anonymousClass2of) {
        Set hashSet = new HashSet();
        if (!anonymousClass2of.f34320C) {
            hashSet.add(AnonymousClass2oj.APP_MANAGER_DISABLED);
        }
        if (anonymousClass2of.f34321D == AnonymousClass2oe.APP_MANAGER_UNKNOWN_SIGN) {
            hashSet.add(AnonymousClass2oj.APP_MANAGER_BAD_SIGNATURE);
        }
        return hashSet;
    }

    /* renamed from: C */
    public static final Set m17302C(AnonymousClass2oi anonymousClass2oi) {
        Set hashSet = new HashSet();
        if (!anonymousClass2oi.f34334B) {
            hashSet.add(AnonymousClass2oj.INSTALLER_DISABLED);
        }
        if (anonymousClass2oi.f34335C.isEmpty()) {
            hashSet.add(AnonymousClass2oj.INSTALLER_NO_PRIVILEGES);
        }
        if (anonymousClass2oi.f34336D == AnonymousClass2oh.FB_INSTALLER_UNKNOWN_SIGN) {
            hashSet.add(AnonymousClass2oj.INSTALLER_BAD_SIGNATURE);
        }
        return hashSet;
    }
}
