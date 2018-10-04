package X;

import java.util.Collection;

/* renamed from: X.0p3 */
public final class AnonymousClass0p3 {
    /* renamed from: B */
    public int f10463B;
    /* renamed from: C */
    public String f10464C;
    /* renamed from: D */
    public AnonymousClass13Z f10465D;
    /* renamed from: E */
    private final AnonymousClass0Kh f10466E;
    /* renamed from: F */
    private int f10467F;
    /* renamed from: G */
    private final Object f10468G;
    /* renamed from: H */
    private boolean f10469H = false;
    /* renamed from: I */
    private final Object f10470I;
    /* renamed from: J */
    private AnonymousClass0p4 f10471J;

    public AnonymousClass0p3(Object obj, Object obj2) {
        this.f10468G = obj;
        this.f10470I = obj2;
        this.f10466E = new AnonymousClass0Kh();
    }

    /* renamed from: A */
    public final AnonymousClass0pB m7776A() {
        int i;
        AnonymousClass0p4 anonymousClass0p4 = this.f10471J;
        if (anonymousClass0p4 != null) {
            i = this.f10463B;
            if (i > 0) {
                anonymousClass0p4.f10473B += i;
            }
        }
        anonymousClass0p4 = this.f10471J;
        if (anonymousClass0p4 != null) {
            i = this.f10467F;
            if (i > 0) {
                anonymousClass0p4.f10474C += i;
            }
        }
        if (this.f10465D == null) {
            this.f10465D = AnonymousClass13Z.f13743B;
        }
        return new AnonymousClass0pB(this.f10468G, this.f10470I, this.f10464C, this.f10466E, this.f10469H, this.f10463B, this.f10467F, this.f10471J, this.f10465D);
    }

    /* renamed from: B */
    public final AnonymousClass0p3 m7777B(AnonymousClass1cS anonymousClass1cS) {
        if (this.f10466E.m2842B(anonymousClass1cS.II()) == null) {
            this.f10466E.m2846F(anonymousClass1cS.II(), anonymousClass1cS);
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActionType already registered: ");
        stringBuilder.append(anonymousClass1cS.II());
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: C */
    public final AnonymousClass0p3 m7778C(Collection collection) {
        for (AnonymousClass1cS B : collection) {
            m7777B(B);
        }
        return this;
    }

    /* renamed from: D */
    public final AnonymousClass0p3 m7779D() {
        this.f10469H = true;
        return this;
    }

    /* renamed from: E */
    public final AnonymousClass0p3 m7780E(AnonymousClass0p4 anonymousClass0p4) {
        if (anonymousClass0p4 == AnonymousClass0p4.f10472D) {
            anonymousClass0p4 = null;
        }
        this.f10471J = anonymousClass0p4;
        return this;
    }
}
