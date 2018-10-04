package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1u6 */
public final class AnonymousClass1u6 {
    /* renamed from: B */
    public final AnonymousClass1u9 f23921B;
    /* renamed from: C */
    public final AnonymousClass1u1 f23922C;
    /* renamed from: D */
    public final boolean f23923D;
    /* renamed from: E */
    public final boolean f23924E;
    /* renamed from: F */
    public boolean f23925F;
    /* renamed from: G */
    public final boolean f23926G;
    /* renamed from: H */
    public final AnonymousClass1u2 f23927H;
    /* renamed from: I */
    public final AnonymousClass1u3 f23928I;
    /* renamed from: J */
    public final Map f23929J;
    /* renamed from: K */
    public final AnonymousClass1uG f23930K;
    /* renamed from: L */
    public final boolean f23931L;
    /* renamed from: M */
    public final String f23932M;
    /* renamed from: N */
    public final String f23933N;
    /* renamed from: O */
    private final AnonymousClass1u4 f23934O;
    /* renamed from: P */
    private final String f23935P;

    public AnonymousClass1u6(AnonymousClass1u2 anonymousClass1u2, Map map, AnonymousClass1u4 anonymousClass1u4, AnonymousClass1u1 anonymousClass1u1, String str, String str2, String str3, boolean z) {
        this(anonymousClass1u2, map, anonymousClass1u4, anonymousClass1u1, str, str2, str3, false, false, null, z);
    }

    public AnonymousClass1u6(AnonymousClass1u2 anonymousClass1u2, Map map, AnonymousClass1u4 anonymousClass1u4, AnonymousClass1u1 anonymousClass1u1, String str, String str2, String str3, boolean z, boolean z2, AnonymousClass1u3 anonymousClass1u3, boolean z3) {
        AnonymousClass1u2 anonymousClass1u22 = anonymousClass1u2;
        Map map2 = map;
        AnonymousClass1u4 anonymousClass1u42 = anonymousClass1u4;
        AnonymousClass1u1 anonymousClass1u12 = anonymousClass1u1;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        this(anonymousClass1u22, map2, anonymousClass1u42, anonymousClass1u12, str4, str5, str6, z, z2, anonymousClass1u3, false, false, z3);
    }

    public AnonymousClass1u6(AnonymousClass1u2 anonymousClass1u2, Map map, AnonymousClass1u4 anonymousClass1u4, AnonymousClass1u1 anonymousClass1u1, String str, String str2, String str3, boolean z, boolean z2, AnonymousClass1u3 anonymousClass1u3, boolean z3, boolean z4, boolean z5) {
        this.f23927H = anonymousClass1u2;
        if (map == null) {
            map = new HashMap();
        }
        this.f23929J = map;
        if (anonymousClass1u4 == null) {
            anonymousClass1u4 = new AnonymousClass1u4();
        }
        this.f23934O = anonymousClass1u4;
        this.f23930K = new AnonymousClass1uG(this.f23934O);
        this.f23922C = anonymousClass1u1;
        this.f23921B = new AnonymousClass1u9(anonymousClass1u1);
        this.f23935P = str;
        this.f23932M = str2;
        this.f23933N = str3;
        this.f23925F = z;
        this.f23923D = z2;
        this.f23928I = anonymousClass1u3;
        this.f23926G = z3;
        this.f23924E = z4;
        this.f23931L = z5;
    }

    /* renamed from: A */
    public final boolean m13651A() {
        String str = this.f23935P;
        if (str == null) {
            return false;
        }
        return str.equals("2");
    }
}
