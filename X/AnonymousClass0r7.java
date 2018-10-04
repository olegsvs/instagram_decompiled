package X;

import java.util.List;

/* renamed from: X.0r7 */
public final class AnonymousClass0r7 extends AnonymousClass0Pn {
    /* renamed from: B */
    public boolean f11106B;
    /* renamed from: C */
    public boolean f11107C;
    /* renamed from: D */
    public Long f11108D;
    /* renamed from: E */
    public AnonymousClass3Ui f11109E;
    /* renamed from: F */
    public String f11110F;
    /* renamed from: G */
    public String f11111G;
    /* renamed from: H */
    public String f11112H;
    /* renamed from: I */
    public Boolean f11113I;
    /* renamed from: J */
    public boolean f11114J;
    /* renamed from: K */
    public String f11115K;
    /* renamed from: L */
    public String f11116L;
    /* renamed from: M */
    public boolean f11117M;
    /* renamed from: N */
    public List f11118N;
    /* renamed from: O */
    public long f11119O;
    /* renamed from: P */
    public AnonymousClass1Cx f11120P;
    /* renamed from: Q */
    public Boolean f11121Q;
    /* renamed from: R */
    public Long f11122R;
    /* renamed from: S */
    public AnonymousClass1ND f11123S;
    /* renamed from: T */
    public Integer f11124T;
    /* renamed from: U */
    public String f11125U;
    /* renamed from: V */
    public AnonymousClass0Zg f11126V;
    /* renamed from: W */
    public int f11127W;
    /* renamed from: X */
    public Long f11128X;
    /* renamed from: Y */
    public boolean f11129Y;
    /* renamed from: Z */
    public List f11130Z;
    /* renamed from: a */
    public AnonymousClass3Uv f11131a;
    /* renamed from: b */
    public int f11132b;
    /* renamed from: c */
    public String f11133c;
    /* renamed from: d */
    public AnonymousClass0Ci f11134d;
    /* renamed from: e */
    public Integer f11135e;

    /* renamed from: F */
    public final int m7941F() {
        Boolean bool = this.f11121Q;
        if (bool == null) {
            return -1;
        }
        return bool.booleanValue();
    }

    /* renamed from: G */
    public final AnonymousClass0Zc m7942G() {
        AnonymousClass0Zc anonymousClass0Zc = this.f11120P;
        if (anonymousClass0Zc != null) {
            return anonymousClass0Zc;
        }
        AnonymousClass0Ci anonymousClass0Ci = this.f11134d;
        if (anonymousClass0Ci != null) {
            return new AnonymousClass0Zb(anonymousClass0Ci);
        }
        throw new UnsupportedOperationException("Reel response item should have either a user or multi-author reel owner");
    }

    /* renamed from: H */
    public final long m7943H() {
        Long l = this.f11122R;
        return l == null ? -9223372036854775807L : l.longValue();
    }

    /* renamed from: I */
    public final boolean m7944I() {
        return (this.f11115K == null || m7942G().gT() != AnonymousClass0Zd.USER || m7942G().getId() == null) ? false : true;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f11115K);
        stringBuilder.append(" ");
        stringBuilder.append(m7942G());
        stringBuilder.append(" ");
        List list = this.f11118N;
        stringBuilder.append(list != null ? Integer.valueOf(list.size()) : "EMPTY");
        return stringBuilder.toString();
    }
}
