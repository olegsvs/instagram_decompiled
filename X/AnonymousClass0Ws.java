package X;

/* renamed from: X.0Ws */
public enum AnonymousClass0Ws {
    ALL("inbox"),
    UNREAD("unread"),
    FLAGGED("flagged");
    
    /* renamed from: B */
    public String f6027B;

    private AnonymousClass0Ws(String str) {
        this.f6027B = str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: A */
    public final boolean m5171A(X.AnonymousClass0Vw r3) {
        /*
        r2 = this;
        r1 = X.AnonymousClass0Wr.f6022B;
        r0 = r2.ordinal();
        r0 = r1[r0];
        r2 = 0;
        r1 = 1;
        switch(r0) {
            case 1: goto L_0x0029;
            case 2: goto L_0x001c;
            case 3: goto L_0x000e;
            default: goto L_0x000d;
        };
    L_0x000d:
        return r2;
    L_0x000e:
        r0 = r3.m4944P();
        if (r0 != r1) goto L_0x000d;
    L_0x0014:
        r0 = X.AnonymousClass0Ws.m5170C(r3);
        if (r0 == 0) goto L_0x000d;
    L_0x001a:
        r2 = 1;
        goto L_0x000d;
    L_0x001c:
        r0 = r3.m4964j();
        if (r0 == 0) goto L_0x000d;
    L_0x0022:
        r0 = X.AnonymousClass0Ws.m5170C(r3);
        if (r0 == 0) goto L_0x000d;
    L_0x0028:
        goto L_0x001a;
    L_0x0029:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0Ws.A(X.0Vw):boolean");
    }

    /* renamed from: B */
    public static String m5169B(AnonymousClass0Ws anonymousClass0Ws) {
        return (anonymousClass0Ws == null || !(anonymousClass0Ws == FLAGGED || anonymousClass0Ws == UNREAD)) ? null : anonymousClass0Ws.f6027B;
    }

    /* renamed from: C */
    private static boolean m5170C(AnonymousClass0Vw anonymousClass0Vw) {
        return System.currentTimeMillis() - (anonymousClass0Vw.m4935G().longValue() / 1000) < 2592000000L;
    }
}
