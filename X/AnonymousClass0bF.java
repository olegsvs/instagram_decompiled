package X;

/* renamed from: X.0bF */
public final class AnonymousClass0bF implements AnonymousClass0Nf {
    /* renamed from: B */
    public final AnonymousClass0FI f6683B;
    /* renamed from: C */
    private final AnonymousClass0Nf f6684C;
    /* renamed from: D */
    private final AnonymousClass0bG f6685D = new AnonymousClass0bG(this);
    /* renamed from: E */
    private final AnonymousClass0H6 f6686E;
    /* renamed from: F */
    private final AnonymousClass0bK f6687F;

    public AnonymousClass0bF(AnonymousClass0Nf anonymousClass0Nf, AnonymousClass0FI anonymousClass0FI, AnonymousClass0H6 anonymousClass0H6, AnonymousClass0bK anonymousClass0bK) {
        this.f6683B = anonymousClass0FI;
        this.f6684C = anonymousClass0Nf;
        this.f6686E = anonymousClass0H6;
        this.f6687F = anonymousClass0bK;
    }

    public final AnonymousClass0aL pUA(AnonymousClass0a8 anonymousClass0a8, AnonymousClass0aA anonymousClass0aA, AnonymousClass0gT anonymousClass0gT) {
        AnonymousClass0FI anonymousClass0FI = this.f6683B;
        synchronized (anonymousClass0FI) {
            if (anonymousClass0FI.f2104C) {
                AnonymousClass248 anonymousClass248 = (AnonymousClass248) anonymousClass0FI.f2107F.get(anonymousClass0a8);
                if (anonymousClass248 == null) {
                    anonymousClass248 = new AnonymousClass248(anonymousClass0a8.f6448H.toString());
                    anonymousClass0FI.f2107F.put(anonymousClass0a8, anonymousClass248);
                }
                anonymousClass248.f25592N = AnonymousClass0Gd.m1838C();
                if (anonymousClass0a8.f6442B != null) {
                    anonymousClass248.f25586H = anonymousClass0a8.f6442B.getContentLength();
                }
            } else {
                AnonymousClass0go anonymousClass0go = (AnonymousClass0go) anonymousClass0FI.f2106E.get(anonymousClass0a8);
                if (anonymousClass0go == null) {
                    anonymousClass0go = new AnonymousClass0go(anonymousClass0a8.f6448H.toString(), AnonymousClass0MM.m3146B(anonymousClass0FI.f2103B.getActiveNetworkInfo()));
                    anonymousClass0FI.f2106E.put(anonymousClass0a8, anonymousClass0go);
                }
                anonymousClass0go.f8284P = AnonymousClass0Gd.m1838C();
                anonymousClass0go.f8285Q = AnonymousClass0Gd.m1840E();
                if (anonymousClass0a8.m5431C("InstagramTraceToken") != null) {
                    anonymousClass0go.f8282N = (String) anonymousClass0a8.m5431C("InstagramTraceToken");
                }
                if (anonymousClass0a8.m5431C("InstagramTraceEnabled") != null) {
                    anonymousClass0go.f8275G = ((Boolean) anonymousClass0a8.m5431C("InstagramTraceEnabled")).booleanValue();
                }
                if (anonymousClass0a8.m5431C("Cdn") != null) {
                    anonymousClass0go.f8270B = new AnonymousClass245((AnonymousClass246) anonymousClass0a8.m5431C("Cdn"));
                }
                if (anonymousClass0a8.f6442B != null) {
                    anonymousClass0go.f8278J = anonymousClass0a8.f6442B.getContentLength();
                }
            }
        }
        anonymousClass0gT.m6621A(this.f6685D);
        if (this.f6686E != null && anonymousClass0aA.f6460H == AnonymousClass0Qv.Image) {
            AnonymousClass0b8.m5521B();
            AnonymousClass0H6 anonymousClass0H6 = this.f6686E;
            String uri = anonymousClass0a8.f6448H.toString();
            String str = "Stub";
            int C = AnonymousClass0H6.m1946C(uri);
            synchronized (anonymousClass0H6.f2526B) {
                if (AnonymousClass0H6.m1947D(anonymousClass0H6, C)) {
                    anonymousClass0H6.f2528D.m1451Y(23396353, C, "DID_SEND_REQUEST");
                    anonymousClass0H6.f2528D.markerAnnotate(23396353, C, "TRACE_TOKEN", str);
                }
            }
            AnonymousClass22v.B(AnonymousClass0H6.m1946C(uri), "NETWORK");
        }
        if (this.f6687F != null && anonymousClass0aA.f6460H == AnonymousClass0Qv.Video) {
            AnonymousClass22v.B(anonymousClass0a8.f6448H.toString().hashCode(), "NETWORK");
        }
        return this.f6684C.pUA(anonymousClass0a8, anonymousClass0aA, anonymousClass0gT);
    }
}
