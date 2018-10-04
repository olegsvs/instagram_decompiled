package X;

/* renamed from: X.0LV */
public enum AnonymousClass0LV {
    STRONG,
    STRONG_EXPIRABLE,
    STRONG_EVICTABLE,
    STRONG_EXPIRABLE_EVICTABLE,
    WEAK,
    WEAK_EXPIRABLE,
    WEAK_EVICTABLE,
    WEAK_EXPIRABLE_EVICTABLE;
    
    /* renamed from: K */
    public static final AnonymousClass0LV[][] f3249K = null;

    /* renamed from: B */
    public abstract AnonymousClass0Lw mo714B(AnonymousClass0Li anonymousClass0Li, Object obj, int i, AnonymousClass0Lw anonymousClass0Lw);

    static {
        r1 = new AnonymousClass0LV[3][];
        r1[0] = new AnonymousClass0LV[]{r9, r8, r7, r6};
        r1[1] = new AnonymousClass0LV[0];
        r1[2] = new AnonymousClass0LV[]{r5, r4, r3, r2};
        f3249K = r1;
    }

    /* renamed from: A */
    public AnonymousClass0Lw mo715A(AnonymousClass0Li anonymousClass0Li, AnonymousClass0Lw anonymousClass0Lw, AnonymousClass0Lw anonymousClass0Lw2) {
        return mo714B(anonymousClass0Li, anonymousClass0Lw.getKey(), anonymousClass0Lw.dM(), anonymousClass0Lw2);
    }

    /* renamed from: B */
    public static final void m2971B(AnonymousClass0Lw anonymousClass0Lw, AnonymousClass0Lw anonymousClass0Lw2) {
        AnonymousClass0LM.m2942B(anonymousClass0Lw.yP(), anonymousClass0Lw2);
        AnonymousClass0LM.m2942B(anonymousClass0Lw2, anonymousClass0Lw.kO());
        AnonymousClass0Lw anonymousClass0Lw3 = AnonymousClass25P.f25752C;
        anonymousClass0Lw.vPA(anonymousClass0Lw3);
        anonymousClass0Lw.fQA(anonymousClass0Lw3);
    }

    /* renamed from: C */
    public static final void m2972C(AnonymousClass0Lw anonymousClass0Lw, AnonymousClass0Lw anonymousClass0Lw2) {
        anonymousClass0Lw2.BOA(anonymousClass0Lw.hL());
        AnonymousClass0LM.m2943C(anonymousClass0Lw.zP(), anonymousClass0Lw2);
        AnonymousClass0LM.m2943C(anonymousClass0Lw2, anonymousClass0Lw.lO());
        AnonymousClass0Lw anonymousClass0Lw3 = AnonymousClass25P.f25752C;
        anonymousClass0Lw.wPA(anonymousClass0Lw3);
        anonymousClass0Lw.gQA(anonymousClass0Lw3);
    }

    /* renamed from: D */
    public static AnonymousClass0LV m2973D(AnonymousClass0LI anonymousClass0LI, boolean z, boolean z2) {
        return f3249K[anonymousClass0LI.ordinal()][z | (z2 ? 2 : 0)];
    }
}
