package X;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: X.445 */
public final class AnonymousClass445 extends AnonymousClass3vb {
    /* renamed from: B */
    public boolean f49359B;
    /* renamed from: C */
    public long f49360C;
    /* renamed from: D */
    public long f49361D;
    /* renamed from: E */
    public Handler f49362E;
    /* renamed from: F */
    public AnonymousClass3wV f49363F;
    /* renamed from: G */
    public final AnonymousClass2wh f49364G;
    /* renamed from: H */
    public IOException f49365H;
    /* renamed from: I */
    public long f49366I;
    /* renamed from: J */
    public final Runnable f49367J;
    /* renamed from: K */
    public final Runnable f49368K;
    /* renamed from: L */
    public int f49369L;
    /* renamed from: M */
    private final AnonymousClass2x1 f49370M;
    /* renamed from: N */
    private final AnonymousClass2wO f49371N;
    /* renamed from: O */
    private AnonymousClass2yC f49372O;
    /* renamed from: P */
    private int f49373P;
    /* renamed from: Q */
    private Uri f49374Q;
    /* renamed from: R */
    private final long f49375R;
    /* renamed from: S */
    private AnonymousClass3w7 f49376S;
    /* renamed from: T */
    private final AnonymousClass3vz f49377T;
    /* renamed from: U */
    private final AnonymousClass2yB f49378U;
    /* renamed from: V */
    private final AnonymousClass2yM f49379V;
    /* renamed from: W */
    private boolean f49380W;
    /* renamed from: X */
    private long f49381X;
    /* renamed from: Y */
    private final AnonymousClass2yN f49382Y;
    /* renamed from: Z */
    private Uri f49383Z;
    /* renamed from: a */
    private final Object f49384a;
    /* renamed from: b */
    private final int f49385b;
    /* renamed from: c */
    private final SparseArray f49386c;
    /* renamed from: d */
    private final AnonymousClass2xB f49387d;
    /* renamed from: e */
    private final boolean f49388e;
    /* renamed from: f */
    private final Object f49389f;

    static {
        String str = "goog.exo.dash";
        synchronized (AnonymousClass2uJ.class) {
            if (AnonymousClass2uJ.f35550B.add(str)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(AnonymousClass2uJ.f35551C);
                stringBuilder.append(", ");
                stringBuilder.append(str);
                AnonymousClass2uJ.f35551C = stringBuilder.toString();
            }
        }
    }

    public AnonymousClass445(AnonymousClass3w7 anonymousClass3w7, Uri uri, AnonymousClass2yB anonymousClass2yB, AnonymousClass2yN anonymousClass2yN, AnonymousClass2x1 anonymousClass2x1, AnonymousClass2wO anonymousClass2wO, int i, long j, Object obj) {
        this.f49374Q = uri;
        this.f49376S = anonymousClass3w7;
        this.f49383Z = uri;
        this.f49378U = anonymousClass2yB;
        this.f49382Y = anonymousClass2yN;
        this.f49370M = anonymousClass2x1;
        this.f49385b = i;
        this.f49375R = j;
        this.f49371N = anonymousClass2wO;
        this.f49389f = obj;
        this.f49388e = anonymousClass3w7 != null;
        this.f49364G = this.f46979B.m17868K(0, null, 0);
        this.f49384a = new Object();
        this.f49386c = new SparseArray();
        this.f49387d = new AnonymousClass3vw(this);
        this.f49361D = -9223372036854775807L;
        if (this.f49388e) {
            AnonymousClass2yO.m18017F(anonymousClass3w7.f47112D ^ true);
            this.f49377T = null;
            this.f49367J = null;
            this.f49368K = null;
            this.f49379V = new AnonymousClass3wW();
            return;
        }
        this.f49377T = new AnonymousClass3vz(this);
        this.f49379V = new AnonymousClass3w0(this);
        this.f49367J = new AnonymousClass2x4(this);
        this.f49368K = new AnonymousClass2x5(this);
    }

    /* renamed from: A */
    public final void mo5255A(AnonymousClass3uy anonymousClass3uy, boolean z) {
        if (this.f49388e) {
            AnonymousClass445.m22513C(this, false);
            return;
        }
        this.f49372O = this.f49378U.eF();
        this.f49363F = new AnonymousClass3wV("Loader:DashMediaSource");
        this.f49362E = new Handler();
        AnonymousClass445.m22515E(this);
    }

    /* renamed from: B */
    public static void m22512B(AnonymousClass445 anonymousClass445, IOException iOException) {
        Log.e("DashMediaSource", "Failed to resolve UtcTiming element.", iOException);
        AnonymousClass445.m22513C(anonymousClass445, true);
    }

    /* renamed from: C */
    public final void mo5256C() {
        this.f49380W = false;
        this.f49372O = null;
        AnonymousClass3wV anonymousClass3wV = this.f49363F;
        if (anonymousClass3wV != null) {
            anonymousClass3wV.m21633C(null);
            this.f49363F = null;
        }
        this.f49381X = 0;
        this.f49366I = 0;
        this.f49376S = this.f49388e ? this.f49376S : null;
        this.f49383Z = this.f49374Q;
        this.f49365H = null;
        Handler handler = this.f49362E;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f49362E = null;
        }
        this.f49360C = 0;
        this.f49369L = 0;
        this.f49361D = -9223372036854775807L;
        this.f49359B = false;
        this.f49373P = 0;
        this.f49386c.clear();
    }

    /* renamed from: C */
    public static void m22513C(AnonymousClass445 anonymousClass445, boolean z) {
        AnonymousClass3vb anonymousClass3vb;
        Object obj;
        long B;
        long B2;
        int i = 0;
        while (true) {
            anonymousClass3vb = anonymousClass445;
            if (i >= anonymousClass3vb.f49386c.size()) {
                break;
            }
            int keyAt = anonymousClass3vb.f49386c.keyAt(i);
            if (keyAt >= anonymousClass3vb.f49373P) {
                AnonymousClass444 anonymousClass444 = (AnonymousClass444) anonymousClass3vb.f49386c.valueAt(i);
                AnonymousClass3w7 anonymousClass3w7 = anonymousClass3vb.f49376S;
                keyAt -= anonymousClass3vb.f49373P;
                anonymousClass444.f49347J = anonymousClass3w7;
                anonymousClass444.f49350M = keyAt;
                AnonymousClass2xC anonymousClass2xC = anonymousClass444.f49351N;
                anonymousClass2xC.f36181F = false;
                anonymousClass2xC.f36179D = -9223372036854775807L;
                anonymousClass2xC.f36183H = anonymousClass3w7;
                Iterator it = anonymousClass2xC.f36184I.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Long) ((Entry) it.next()).getKey()).longValue() < anonymousClass2xC.f36183H.f47116H) {
                        it.remove();
                    }
                }
                AnonymousClass3vt[] anonymousClass3vtArr = anonymousClass444.f49352O;
                if (anonymousClass3vtArr != null) {
                    for (AnonymousClass3vt anonymousClass3vt : anonymousClass3vtArr) {
                        ((AnonymousClass3vu) anonymousClass3vt.f47056C).KWA(anonymousClass3w7, keyAt);
                    }
                    anonymousClass444.f49340C.mh(anonymousClass444);
                }
                anonymousClass444.f49345H = anonymousClass3w7.m21577A(keyAt).f36209C;
                for (AnonymousClass3w5 anonymousClass3w5 : anonymousClass444.f49344G) {
                    for (AnonymousClass2xG anonymousClass2xG : anonymousClass444.f49345H) {
                        if (anonymousClass2xG.m17908A().equals(anonymousClass3w5.f47098B.m17908A())) {
                            anonymousClass3w5.m21574B(anonymousClass2xG, anonymousClass3w7.f47112D);
                            break;
                        }
                    }
                }
            }
            i++;
        }
        i = anonymousClass3vb.f49376S.m21578B() - 1;
        AnonymousClass2x6 B3 = AnonymousClass2x6.m17893B(anonymousClass3vb.f49376S.m21577A(0), anonymousClass3vb.f49376S.m21579C(0));
        AnonymousClass2x6 B4 = AnonymousClass2x6.m17893B(anonymousClass3vb.f49376S.m21577A(i), anonymousClass3vb.f49376S.m21579C(i));
        long j = B3.f36168C;
        long j2 = B4.f36167B;
        if (!anonymousClass3vb.f49376S.f47112D || B4.f36169D) {
            obj = null;
        } else {
            j2 = Math.min((anonymousClass3vb.m22516F() - AnonymousClass2uA.m17666B(anonymousClass3vb.f49376S.f47110B)) - AnonymousClass2uA.m17666B(anonymousClass3vb.f49376S.m21577A(i).f36211E), j2);
            if (anonymousClass3vb.f49376S.f47118J != -9223372036854775807L) {
                B = j2 - AnonymousClass2uA.m17666B(anonymousClass3vb.f49376S.f47118J);
                while (B < 0 && i > 0) {
                    i--;
                    B += anonymousClass3vb.f49376S.m21579C(i);
                }
                if (i == 0) {
                    j = Math.max(j, B);
                } else {
                    j = anonymousClass3vb.f49376S.m21579C(0);
                }
            }
            obj = 1;
        }
        j2 -= j;
        for (i = 0; i < anonymousClass3vb.f49376S.m21578B() - 1; i++) {
            j2 += anonymousClass3vb.f49376S.m21579C(i);
        }
        if (anonymousClass3vb.f49376S.f47112D) {
            B = anonymousClass3vb.f49375R;
            if (B == -1) {
                B = anonymousClass3vb.f49376S.f47117I != -9223372036854775807L ? anonymousClass3vb.f49376S.f47117I : 30000;
            }
            B2 = j2 - AnonymousClass2uA.m17666B(B);
            if (B2 < 5000000) {
                B2 = Math.min(5000000, j2 / 2);
            }
        } else {
            B2 = 0;
        }
        anonymousClass3vb.m21527B(new AnonymousClass3vv(anonymousClass3vb.f49376S.f47110B, (anonymousClass3vb.f49376S.f47110B + anonymousClass3vb.f49376S.m21577A(0).f36211E) + AnonymousClass2uA.m17667C(j), anonymousClass3vb.f49373P, j, j2, B2, anonymousClass3vb.f49376S, anonymousClass3vb.f49389f), anonymousClass3vb.f49376S);
        if (!anonymousClass3vb.f49388e) {
            AnonymousClass0OR.G(anonymousClass3vb.f49362E, anonymousClass3vb.f49368K, -277292144);
            if (obj != null) {
                AnonymousClass0OR.F(anonymousClass3vb.f49362E, anonymousClass3vb.f49368K, 5000, 845719359);
            }
            if (anonymousClass3vb.f49380W) {
                AnonymousClass445.m22515E(anonymousClass3vb);
            } else if (z && anonymousClass3vb.f49376S.f47112D && anonymousClass3vb.f49376S.f47114F != -9223372036854775807L) {
                j2 = anonymousClass3vb.f49376S.f47114F;
                if (j2 == 0) {
                    j2 = 5000;
                }
                AnonymousClass0OR.F(anonymousClass3vb.f49362E, anonymousClass3vb.f49367J, Math.max(0, (anonymousClass3vb.f49381X + j2) - SystemClock.elapsedRealtime()), -966273791);
            }
        }
    }

    /* renamed from: D */
    public final void m22520D(AnonymousClass3wX anonymousClass3wX, long j, long j2) {
        this.f49364G.m17859B(anonymousClass3wX.f47175C, anonymousClass3wX.f47177E, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, anonymousClass3wX.f47174B);
    }

    /* renamed from: D */
    public static void m22514D(AnonymousClass445 anonymousClass445, AnonymousClass2xN anonymousClass2xN, AnonymousClass2yN anonymousClass2yN) {
        anonymousClass445.m22517G(new AnonymousClass3wX(anonymousClass445.f49372O, Uri.parse(anonymousClass2xN.f36231C), 5, anonymousClass2yN), new AnonymousClass3w1(anonymousClass445), 1);
    }

    /* renamed from: E */
    public final void m22521E(AnonymousClass3wX anonymousClass3wX, long j, long j2) {
        AnonymousClass3wX anonymousClass3wX2 = anonymousClass3wX;
        long j3 = j;
        j = j2;
        this.f49364G.m17861D(anonymousClass3wX.f47175C, anonymousClass3wX.f47177E, j3, j, anonymousClass3wX.f47174B);
        AnonymousClass3w7 anonymousClass3w7 = (AnonymousClass3w7) anonymousClass3wX2.f47176D;
        AnonymousClass3w7 anonymousClass3w72 = this.f49376S;
        int B = anonymousClass3w72 == null ? 0 : anonymousClass3w72.m21578B();
        long j4 = anonymousClass3w7.m21577A(0).f36211E;
        int i = 0;
        while (i < B && r4.f49376S.m21577A(i).f36211E < j4) {
            i++;
        }
        if (anonymousClass3w7.f47112D) {
            Object obj;
            int i2;
            if (B - i > anonymousClass3w7.m21578B()) {
                Log.w("DashMediaSource", "Loaded out of sync manifest");
            } else {
                if (!r4.f49359B) {
                    if (r4.f49361D == -9223372036854775807L || anonymousClass3w7.f47116H * 1000 > r4.f49361D) {
                        obj = null;
                        if (obj == null) {
                            i2 = r4.f49369L;
                            r4.f49369L = i2 + 1;
                            if (i2 >= r4.f49385b) {
                                AnonymousClass0OR.F(r4.f49362E, r4.f49367J, (long) Math.min((r4.f49369L - 1) * JsonMappingException.MAX_REFS_TO_LIST, 5000), -966273791);
                                return;
                            } else {
                                r4.f49365H = new AnonymousClass2x2();
                                return;
                            }
                        }
                        r4.f49369L = 0;
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Loaded stale dynamic manifest: ");
                stringBuilder.append(anonymousClass3w7.f47116H);
                stringBuilder.append(", ");
                stringBuilder.append(r4.f49359B);
                stringBuilder.append(", ");
                stringBuilder.append(r4.f49361D);
                Log.w("DashMediaSource", stringBuilder.toString());
            }
            obj = 1;
            if (obj == null) {
                r4.f49369L = 0;
            } else {
                i2 = r4.f49369L;
                r4.f49369L = i2 + 1;
                if (i2 >= r4.f49385b) {
                    r4.f49365H = new AnonymousClass2x2();
                    return;
                } else {
                    AnonymousClass0OR.F(r4.f49362E, r4.f49367J, (long) Math.min((r4.f49369L - 1) * JsonMappingException.MAX_REFS_TO_LIST, 5000), -966273791);
                    return;
                }
            }
        }
        r4.f49376S = anonymousClass3w7;
        r4.f49380W &= r4.f49376S.f47112D;
        r4.f49381X = j3 - j;
        r4.f49366I = j3;
        if (r4.f49376S.f47113E != null) {
            synchronized (r4.f49384a) {
                if (anonymousClass3wX2.f47175C.f36497I == r4.f49383Z) {
                    r4.f49383Z = r4.f49376S.f47113E;
                }
            }
        }
        if (B != 0) {
            r4.f49373P += i;
            AnonymousClass445.m22513C(r4, true);
        } else if (r4.f49376S.f47119K != null) {
            AnonymousClass2xN anonymousClass2xN = r4.f49376S.f47119K;
            String str = anonymousClass2xN.f36230B;
            if (!AnonymousClass2yi.m18082C(str, "urn:mpeg:dash:utc:direct:2014")) {
                if (!AnonymousClass2yi.m18082C(str, "urn:mpeg:dash:utc:direct:2012")) {
                    if (!AnonymousClass2yi.m18082C(str, "urn:mpeg:dash:utc:http-iso:2014")) {
                        if (!AnonymousClass2yi.m18082C(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                            if (!AnonymousClass2yi.m18082C(str, "urn:mpeg:dash:utc:http-xsdate:2014")) {
                                if (!AnonymousClass2yi.m18082C(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                                    AnonymousClass445.m22512B(r4, new IOException("Unsupported UTC timing scheme"));
                                }
                            }
                            AnonymousClass445.m22514D(r4, anonymousClass2xN, new AnonymousClass3w2());
                        }
                    }
                    AnonymousClass445.m22514D(r4, anonymousClass2xN, new AnonymousClass3vy());
                }
            }
            try {
                r4.f49360C = AnonymousClass2yi.m18102W(anonymousClass2xN.f36231C) - r4.f49366I;
                AnonymousClass445.m22513C(r4, true);
            } catch (IOException e) {
                AnonymousClass445.m22512B(r4, e);
            }
        } else {
            AnonymousClass445.m22513C(r4, true);
        }
    }

    /* renamed from: E */
    public static void m22515E(AnonymousClass445 anonymousClass445) {
        AnonymousClass0OR.G(anonymousClass445.f49362E, anonymousClass445.f49367J, -1293751035);
        if (anonymousClass445.f49363F.m21631A()) {
            anonymousClass445.f49380W = true;
            return;
        }
        Uri uri;
        synchronized (anonymousClass445.f49384a) {
            uri = anonymousClass445.f49383Z;
        }
        anonymousClass445.f49380W = false;
        anonymousClass445.m22517G(new AnonymousClass3wX(anonymousClass445.f49372O, uri, 4, anonymousClass445.f49382Y), anonymousClass445.f49377T, anonymousClass445.f49385b);
    }

    /* renamed from: F */
    private long m22516F() {
        if (this.f49360C != 0) {
            return AnonymousClass2uA.m17666B(SystemClock.elapsedRealtime() + this.f49360C);
        }
        return AnonymousClass2uA.m17666B(System.currentTimeMillis());
    }

    /* renamed from: G */
    private void m22517G(AnonymousClass3wX anonymousClass3wX, AnonymousClass2yG anonymousClass2yG, int i) {
        this.f49364G.m17864G(anonymousClass3wX.f47175C, anonymousClass3wX.f47177E, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, this.f49363F.m21634D(anonymousClass3wX, anonymousClass2yG, i));
    }

    public final void RJA(AnonymousClass3vk anonymousClass3vk) {
        AnonymousClass444 anonymousClass444 = (AnonymousClass444) anonymousClass3vk;
        AnonymousClass2xC anonymousClass2xC = anonymousClass444.f49351N;
        anonymousClass2xC.f36186K = true;
        anonymousClass2xC.f36180E.removeCallbacksAndMessages(null);
        for (AnonymousClass3vt C : anonymousClass444.f49352O) {
            C.m21566C(anonymousClass444);
        }
        anonymousClass444.f49343F.m17866I();
        this.f49386c.remove(anonymousClass444.f49346I);
    }

    public final AnonymousClass3vk pF(AnonymousClass2wU anonymousClass2wU, AnonymousClass2yA anonymousClass2yA) {
        AnonymousClass2wU anonymousClass2wU2 = anonymousClass2wU;
        int i = anonymousClass2wU2.f36076D;
        long j = this.f49376S.m21577A(i).f36211E;
        AnonymousClass2yO.m18013B(anonymousClass2wU != null);
        AnonymousClass3vk anonymousClass444 = new AnonymousClass444(this.f49373P + i, this.f49376S, i, this.f49370M, this.f49385b, this.f46979B.m17868K(0, anonymousClass2wU2, j), this.f49360C, this.f49379V, anonymousClass2yA, this.f49371N, this.f49387d);
        this.f49386c.put(anonymousClass444.f49346I, anonymousClass444);
        return anonymousClass444;
    }

    public final void ub() {
        this.f49379V.sb();
    }
}
