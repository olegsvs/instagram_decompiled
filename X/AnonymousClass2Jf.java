package X;

import java.util.Locale;

/* renamed from: X.2Jf */
public enum AnonymousClass2Jf {
    LEFT,
    CENTER,
    RIGHT;

    /* renamed from: A */
    public final int m15027A() {
        switch (ordinal()) {
            case 0:
                return 3;
            case 1:
                return 1;
            case 2:
                return 5;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown alignment: ");
                stringBuilder.append(this);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    public static X.AnonymousClass2Jf m15025B(android.text.Layout.Alignment r3) {
        /*
        r1 = X.AnonymousClass2Je.f28865B;
        r0 = r3.ordinal();
        r0 = r1[r0];
        switch(r0) {
            case 1: goto L_0x0031;
            case 2: goto L_0x002e;
            case 3: goto L_0x0022;
            default: goto L_0x000b;
        };
    L_0x000b:
        r2 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Unknown alignment: ";
        r1.append(r0);
        r1.append(r3);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
    L_0x0022:
        r0 = X.AnonymousClass2Jf.m15026C();
        if (r0 == 0) goto L_0x002b;
    L_0x0028:
        r0 = LEFT;
        goto L_0x002d;
    L_0x002b:
        r0 = RIGHT;
    L_0x002d:
        return r0;
    L_0x002e:
        r0 = CENTER;
        return r0;
    L_0x0031:
        r0 = X.AnonymousClass2Jf.m15026C();
        if (r0 == 0) goto L_0x0028;
    L_0x0037:
        goto L_0x002b;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2Jf.B(android.text.Layout$Alignment):X.2Jf");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    public final android.text.Layout.Alignment m15028B() {
        /*
        r3 = this;
        r0 = r3.ordinal();
        switch(r0) {
            case 0: goto L_0x002d;
            case 1: goto L_0x002a;
            case 2: goto L_0x001e;
            default: goto L_0x0007;
        };
    L_0x0007:
        r2 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Unknown alignment: ";
        r1.append(r0);
        r1.append(r3);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
    L_0x001e:
        r0 = X.AnonymousClass2Jf.m15026C();
        if (r0 == 0) goto L_0x0027;
    L_0x0024:
        r0 = android.text.Layout.Alignment.ALIGN_NORMAL;
        goto L_0x0029;
    L_0x0027:
        r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE;
    L_0x0029:
        return r0;
    L_0x002a:
        r0 = android.text.Layout.Alignment.ALIGN_CENTER;
        return r0;
    L_0x002d:
        r0 = X.AnonymousClass2Jf.m15026C();
        if (r0 == 0) goto L_0x0024;
    L_0x0033:
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2Jf.B():android.text.Layout$Alignment");
    }

    /* renamed from: C */
    private static boolean m15026C() {
        byte directionality = Character.getDirectionality(Locale.getDefault().getDisplayName().charAt(0));
        if (directionality == (byte) 1 || directionality == (byte) 2) {
            return true;
        }
        return false;
    }
}
