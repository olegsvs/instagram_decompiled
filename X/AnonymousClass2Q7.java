package X;

import java.util.Map;

/* renamed from: X.2Q7 */
public abstract class AnonymousClass2Q7 implements AnonymousClass1tS {
    /* renamed from: B */
    public int f30282B = 10;
    /* renamed from: C */
    public String f30283C;
    /* renamed from: D */
    public AnonymousClass1td f30284D;
    /* renamed from: E */
    public String f30285E;
    /* renamed from: F */
    public String f30286F;
    /* renamed from: G */
    public AnonymousClass1tX f30287G;
    /* renamed from: H */
    public long f30288H;
    /* renamed from: I */
    private volatile Map f30289I;

    public AnonymousClass2Q7(AnonymousClass1tX anonymousClass1tX, AnonymousClass1th anonymousClass1th, int i, AnonymousClass1td anonymousClass1td) {
        String str = "unknown";
        this.f30286F = str;
        this.f30285E = str;
        this.f30283C = str;
        if (anonymousClass1th == null || anonymousClass1th.f23823G == null) {
            throw new AnonymousClass1tc("Bad config");
        } else if (anonymousClass1th.f23823G.intValue() == i) {
            if (anonymousClass1th.f23818B != null && anonymousClass1th.f23818B.intValue() > 0) {
                this.f30282B = anonymousClass1th.f23818B.intValue();
            }
            if (anonymousClass1th.f23821E != null) {
                this.f30286F = anonymousClass1th.f23821E;
            }
            if (anonymousClass1th.f23820D != null) {
                this.f30285E = anonymousClass1th.f23820D;
            }
            this.f30287G = anonymousClass1tX;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(anonymousClass1th.f23819C);
            stringBuilder.append(":");
            stringBuilder.append(anonymousClass1th.f23823G);
            this.f30283C = stringBuilder.toString();
            this.f30288H = anonymousClass1th.f23822F;
            this.f30284D = anonymousClass1td;
        } else {
            throw new AnonymousClass1tc("Unsupported config version");
        }
    }

    public final AnonymousClass1tX TQ() {
        return this.f30287G;
    }

    public final void ZKA(String str, String str2) {
        this.f30284D.sIA(this, AnonymousClass1tc.m13638B(str, str2), this.f30282B);
    }

    public final String eP() {
        return this.f30286F;
    }

    public final String getName() {
        return this.f30285E;
    }

    public final long xR() {
        return this.f30288H;
    }

    public final String yT() {
        return this.f30283C;
    }
}
