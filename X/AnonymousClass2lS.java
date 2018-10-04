package X;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.facebook.video.heroplayer.ipc.DynamicPlayerSettings;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2lS */
public final class AnonymousClass2lS {
    /* renamed from: B */
    public final int f33587B;
    /* renamed from: C */
    public final int f33588C;
    /* renamed from: D */
    public final AnonymousClass2r9 f33589D;
    /* renamed from: E */
    public final AnonymousClass2kb f33590E;
    /* renamed from: F */
    public final AnonymousClass3sU f33591F;
    /* renamed from: G */
    public final Uri f33592G;
    /* renamed from: H */
    public final boolean f33593H;
    /* renamed from: I */
    public final boolean f33594I;
    /* renamed from: J */
    public AnonymousClass2rQ f33595J;
    /* renamed from: K */
    public final Handler f33596K;
    /* renamed from: L */
    public final AnonymousClass1Gy f33597L;
    /* renamed from: M */
    public final boolean f33598M;
    /* renamed from: N */
    public final boolean f33599N;
    /* renamed from: O */
    public final AnonymousClass43D f33600O;
    /* renamed from: P */
    public final AnonymousClass2qL f33601P;
    /* renamed from: Q */
    public final long f33602Q;
    /* renamed from: R */
    public final AnonymousClass2sz f33603R;
    /* renamed from: S */
    public final String f33604S;
    /* renamed from: T */
    public AnonymousClass2qn f33605T;
    /* renamed from: U */
    public final AnonymousClass3tL f33606U;
    /* renamed from: V */
    private final AnonymousClass3to f33607V;
    /* renamed from: W */
    private final long f33608W;
    /* renamed from: X */
    private final AnonymousClass3u3 f33609X;
    /* renamed from: Y */
    private final String f33610Y;
    /* renamed from: Z */
    private final AnonymousClass2kY f33611Z;
    /* renamed from: a */
    private final Context f33612a;
    /* renamed from: b */
    private final AnonymousClass2rY f33613b;
    /* renamed from: c */
    private final boolean f33614c;
    /* renamed from: d */
    private final AnonymousClass2s1 f33615d;
    /* renamed from: e */
    private final boolean f33616e;
    /* renamed from: f */
    private final boolean f33617f;
    /* renamed from: g */
    private final Map f33618g;
    /* renamed from: h */
    private final int f33619h;
    /* renamed from: i */
    private final int f33620i;
    /* renamed from: j */
    private final int f33621j;
    /* renamed from: k */
    private final AnonymousClass2py f33622k;
    /* renamed from: l */
    private final boolean f33623l;
    /* renamed from: m */
    private final AnonymousClass1H1 f33624m;
    /* renamed from: n */
    private final AnonymousClass3us f33625n;
    /* renamed from: o */
    private final AnonymousClass2rb f33626o;
    /* renamed from: p */
    private final AnonymousClass2qV f33627p;
    /* renamed from: q */
    private final int f33628q;
    /* renamed from: r */
    private final String f33629r;
    /* renamed from: s */
    private final long f33630s;
    /* renamed from: t */
    private final long f33631t;
    /* renamed from: u */
    private final AnonymousClass3ti f33632u;
    /* renamed from: v */
    private final AnonymousClass2lg f33633v;
    /* renamed from: w */
    private final String f33634w;
    /* renamed from: x */
    private final int f33635x;
    /* renamed from: y */
    private final AnonymousClass3tt f33636y;

    public AnonymousClass2lS(Uri uri, String str, long j, String str2, Context context, Handler handler, Map map, AnonymousClass1Gy anonymousClass1Gy, DynamicPlayerSettings dynamicPlayerSettings, AnonymousClass3tt anonymousClass3tt, AnonymousClass3to anonymousClass3to, AnonymousClass2rY anonymousClass2rY, AnonymousClass3u3 anonymousClass3u3, AnonymousClass3sU anonymousClass3sU, AnonymousClass2kb anonymousClass2kb, AnonymousClass3tL anonymousClass3tL, boolean z, AnonymousClass2sz anonymousClass2sz, AnonymousClass2lg anonymousClass2lg, boolean z2, int i, boolean z3, String str3, String str4, AnonymousClass3ti anonymousClass3ti, AnonymousClass2r9 anonymousClass2r9, AnonymousClass1H1 anonymousClass1H1, AnonymousClass1Dz anonymousClass1Dz, AnonymousClass2s1 anonymousClass2s1, AnonymousClass43D anonymousClass43D, AnonymousClass2py anonymousClass2py, AnonymousClass2qV anonymousClass2qV, AnonymousClass2kY anonymousClass2kY) {
        AnonymousClass3sU anonymousClass3sU2 = anonymousClass3sU;
        AnonymousClass2td.m17605D(anonymousClass3sU2);
        this.f33592G = uri;
        this.f33604S = str;
        this.f33602Q = j;
        this.f33629r = str4;
        this.f33610Y = str2;
        this.f33612a = context;
        this.f33596K = handler;
        this.f33624m = anonymousClass1H1;
        Map map2 = map;
        this.f33588C = AnonymousClass1Gk.X(map2);
        this.f33587B = AnonymousClass1Gk.P(map2);
        this.f33635x = AnonymousClass1Gk.HC(map2);
        this.f33594I = AnonymousClass1Gk.a(map2);
        AnonymousClass1H1 anonymousClass1H12 = this.f33624m;
        AnonymousClass1Gy anonymousClass1Gy2 = anonymousClass1Gy;
        if (anonymousClass1H12 != null) {
            r0.f33621j = anonymousClass1H12.f16628E;
            r0.f33616e = false;
            r0.f33617f = false;
            r0.f33608W = (long) ((r0.f33624m.f16627D * 2) + JsonMappingException.MAX_REFS_TO_LIST);
            r0.f33619h = r0.f33624m.f16625B;
            r0.f33620i = r0.f33624m.f16627D;
            r0.f33601P = new AnonymousClass3sZ(new AnonymousClass3uf(r0.f33588C));
            r0.f33630s = (long) (r0.f33624m.f16625B * 2);
            r0.f33623l = r0.f33624m.f16626C;
        } else {
            boolean z4;
            DynamicPlayerSettings dynamicPlayerSettings2 = dynamicPlayerSettings;
            r0.f33621j = dynamicPlayerSettings2.f15864C;
            if (z2) {
                z4 = false;
            } else {
                z4 = AnonymousClass1Gk.CB(map2);
            }
            r0.f33617f = z4;
            r0.f33608W = AnonymousClass1Gk.Q(map2) * 1000;
            r0.f33619h = dynamicPlayerSettings2.f15867F;
            r0.f33620i = AnonymousClass1Gk.IB(map2);
            r0.f33616e = AnonymousClass1Gk.BB(map2);
            if (AnonymousClass1Gk.b(map2)) {
                r0.f33601P = new AnonymousClass3sY(new AnonymousClass3uf(r0.f33588C), null, null, AnonymousClass1Gk.g(map2), AnonymousClass1Gk.d(map2), 0, null, null, null, new AnonymousClass1hY(true, anonymousClass1Gy2.FB, new AtomicBoolean(false), anonymousClass1Gy2.kB, -1, AnonymousClass1Gk.h(map2), AnonymousClass1Gk.e(map2), 0, 0, anonymousClass1Dz));
            } else {
                r0.f33601P = new AnonymousClass3tl(new AnonymousClass3uf(r0.f33588C), null, null, AnonymousClass1Gk.h(map2), AnonymousClass1Gk.e(map2), AnonymousClass1Gk.g(map2), AnonymousClass1Gk.d(map2));
            }
            r0.f33630s = anonymousClass1Gy2.oB.f24779E;
            r0.f33623l = anonymousClass1Gy2.oB.f24778D;
        }
        r0.f33636y = anonymousClass3tt;
        r0.f33607V = anonymousClass3to;
        r0.f33613b = anonymousClass2rY;
        r0.f33609X = anonymousClass3u3;
        r0.f33591F = anonymousClass3sU2;
        r0.f33625n = anonymousClass3sU2.f45785F;
        r0.f33590E = anonymousClass2kb;
        r0.f33606U = anonymousClass3tL;
        r0.f33626o = AnonymousClass2rb.m17504B(AnonymousClass1Gk.i(map2));
        r0.f33631t = AnonymousClass1Gk.p(map2);
        r0.f33614c = AnonymousClass1Gk.dC(map2);
        r0.f33598M = z;
        r0.f33618g = map2;
        r0.f33597L = anonymousClass1Gy2;
        r0.f33593H = AnonymousClass1Gk.y(map2);
        r0.f33603R = anonymousClass2sz;
        r0.f33633v = anonymousClass2lg;
        r0.f33628q = i;
        r0.f33599N = z3;
        r0.f33634w = str3;
        r0.f33632u = anonymousClass3ti;
        r0.f33589D = anonymousClass2r9;
        r0.f33615d = anonymousClass2s1;
        r0.f33600O = anonymousClass43D;
        r0.f33622k = anonymousClass2py;
        r0.f33627p = anonymousClass2qV;
        r0.f33611Z = anonymousClass2kY;
    }

    /* renamed from: B */
    public static AnonymousClass3ty m17099B(AnonymousClass2lS anonymousClass2lS, AnonymousClass3uC anonymousClass3uC) {
        boolean z = false;
        AnonymousClass2rq A = anonymousClass3uC.m21306A(0);
        int A2 = A.m17527A(1);
        AnonymousClass2rl anonymousClass2rl = A2 != -1 ? (AnonymousClass2rl) A.f35143B.get(A2) : null;
        if (anonymousClass2rl != null) {
            String str = ((AnonymousClass3uE) anonymousClass2rl.f35134D.get(0)).f46394D.f35070S;
            if (str.equals("audio/mp4") || str.equals("audio/mp4a-latm") || str.equals("audio/webm")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Creating Audio Sample Source: ");
                stringBuilder.append(str);
                stringBuilder.toString();
                AnonymousClass2lS anonymousClass2lS2 = anonymousClass2lS;
                AnonymousClass2t8 anonymousClass3sV = new AnonymousClass3sV(anonymousClass2lS2, null, null, AnonymousClass1e7.f20933H, anonymousClass2lS2.f33632u, null);
                AnonymousClass2t7 dF = anonymousClass3sV.dF();
                boolean z2 = anonymousClass2lS2.f33599N;
                if (!z2) {
                    anonymousClass3sV = null;
                }
                boolean kC = AnonymousClass1Gk.kC(anonymousClass2lS2.f33618g);
                boolean jC = AnonymousClass1Gk.jC(anonymousClass2lS2.f33618g);
                boolean z3 = anonymousClass2lS2.f33597L.ZC;
                boolean z4 = anonymousClass2lS2.f33597L.MB;
                if (anonymousClass2lS2.f33624m != null) {
                    z = true;
                }
                int i = anonymousClass2lS2.f33597L.XB;
                long j = anonymousClass2lS2.f33597L.UB;
                AnonymousClass2rf anonymousClass2rf = new AnonymousClass2rf(kC, jC, z3, z4, z, i, false, anonymousClass2lS2.f33597L.AB, j, false, anonymousClass2lS2.f33597L.TB, anonymousClass2lS2.f33597L.BB);
                AnonymousClass2rM anonymousClass3u8 = new AnonymousClass3u8(anonymousClass2lS2.f33625n, new AnonymousClass3uA(1, null, false, false), dF, new AnonymousClass3u7(), null, (long) anonymousClass2lS2.f33621j, 0, anonymousClass2lS2.f33596K, null, 0, true, anonymousClass2lS2.f33617f, anonymousClass2lS2.f33620i, anonymousClass2lS2.f33619h, anonymousClass2lS2.f33608W, anonymousClass2lS2.f33616e, anonymousClass2lS2.f33626o, anonymousClass2lS2.f33631t, anonymousClass2lS2.f33614c, false, false, 0, anonymousClass2lS2.f33628q, z2, anonymousClass3sV, anonymousClass2lS2.f33623l, anonymousClass2lS2.f33634w, anonymousClass2lS2.createManifestPreprocessor(), anonymousClass2rf);
                AnonymousClass2qn anonymousClass3u4;
                if (anonymousClass2lS2.f33597L.RC) {
                    anonymousClass3u4 = new AnonymousClass3u4(anonymousClass3u8, anonymousClass2lS2.f33601P, anonymousClass2lS2.f33587B * anonymousClass2lS2.f33588C, anonymousClass2lS2.f33596K, null, 1002, 3, false, anonymousClass2lS2.f33593H, anonymousClass2lS2.f33599N, false, 1000, anonymousClass2lS2.f33589D);
                } else {
                    anonymousClass3u4 = new AnonymousClass3u5(anonymousClass3u8, anonymousClass2lS2.f33601P, anonymousClass2lS2.f33587B * anonymousClass2lS2.f33588C, anonymousClass2lS2.f33596K, null, 1002, 3, false, anonymousClass2lS2.f33593H, anonymousClass2lS2.f33599N, false, 1000, anonymousClass2lS2.f33589D);
                }
                AnonymousClass2lg anonymousClass2lg = anonymousClass2lS2.f33633v;
                if (anonymousClass2lg != null) {
                    return anonymousClass2lg.createTrackRenderer(r2, str, anonymousClass2lS2.f33615d);
                }
                return new AnonymousClass45s(r2, AnonymousClass2qT.f34819B, anonymousClass2lS2.f33615d, true, anonymousClass2lS2.f33596K, anonymousClass2lS2.f33607V, anonymousClass2lS2.f33627p);
            }
        }
        return null;
    }

    /* renamed from: C */
    public static AnonymousClass3ty m17100C(AnonymousClass2lS anonymousClass2lS, AnonymousClass3uC anonymousClass3uC, AnonymousClass2lI anonymousClass2lI, AnonymousClass43D anonymousClass43D) {
        AnonymousClass2rq A = anonymousClass3uC.m21306A(0);
        int A2 = A.m17527A(0);
        AnonymousClass2rl anonymousClass2rl = A2 != -1 ? (AnonymousClass2rl) A.f35143B.get(A2) : null;
        if (anonymousClass2rl == null) {
            return null;
        }
        AnonymousClass3ue anonymousClass3ue;
        AnonymousClass45C anonymousClass45C;
        boolean z;
        String str = ((AnonymousClass3uE) anonymousClass2rl.f35134D.get(0)).f46394D.f35070S;
        if (!(str.equals("video/avc") || str.equals("video/mp4") || str.equals("video/x-vnd.on2.vp9"))) {
            if (!str.equals("video/webm")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected mime type: ");
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Creating Video Sample Source: ");
        stringBuilder2.append(str);
        stringBuilder2.toString();
        boolean z2 = true;
        AnonymousClass2lS anonymousClass2lS2 = anonymousClass2lS;
        if (anonymousClass2rl.f35134D.size() <= 1 || !anonymousClass2lS2.f33594I) {
            if (anonymousClass2rl.f35134D.size() > 1) {
                anonymousClass2lS2.f33595J = new AnonymousClass3sK(anonymousClass2lS2.f33590E.m17024C(anonymousClass2lS2.f33604S));
            } else {
                anonymousClass2lS2.f33595J = new AnonymousClass3u7();
            }
            anonymousClass3ue = null;
            anonymousClass45C = null;
            z = false;
        } else {
            AnonymousClass2lI anonymousClass2lI2 = anonymousClass2lI;
            if (anonymousClass2lI != null) {
                anonymousClass45C = anonymousClass2lI2.f33515O;
            } else {
                anonymousClass45C = null;
            }
            anonymousClass3ue = new AnonymousClass45E();
            AnonymousClass2kx anonymousClass2kx = new AnonymousClass2kx();
            anonymousClass2kx.m17069F(anonymousClass2lS2.f33604S);
            anonymousClass2kx.m17068E(anonymousClass2lS2.f33610Y);
            anonymousClass2kx.m17067D(anonymousClass2lS2.f33629r);
            anonymousClass2kx.f33342D = anonymousClass2lS2.f33599N;
            anonymousClass2kx.f33341C = anonymousClass2lS2.f33624m != null;
            anonymousClass2lS2.f33595J = new AnonymousClass3sJ(anonymousClass2lS2.f33612a, anonymousClass2kx, anonymousClass3ue, anonymousClass2lS2.f33632u, anonymousClass2lS2.f33618g, anonymousClass2lS2.f33590E, anonymousClass2lI2, null, anonymousClass2lS2.f33597L.f16573D, anonymousClass2lS2.f33611Z);
            z = true;
        }
        boolean D = AnonymousClass2lS.m17101D(anonymousClass2lS2, anonymousClass2rl);
        AnonymousClass2t8 anonymousClass3sV = new AnonymousClass3sV(anonymousClass2lS2, anonymousClass3ue, anonymousClass45C, AnonymousClass1e7.f20935J, anonymousClass2lS2.f33632u, anonymousClass43D);
        AnonymousClass2t7 dF = anonymousClass3sV.dF();
        boolean z3 = anonymousClass2lS2.f33599N;
        if (!z3) {
            anonymousClass3sV = null;
        }
        boolean kC = AnonymousClass1Gk.kC(anonymousClass2lS2.f33618g);
        boolean jC = AnonymousClass1Gk.jC(anonymousClass2lS2.f33618g);
        boolean z4 = anonymousClass2lS2.f33597L.ZC;
        boolean z5 = anonymousClass2lS2.f33597L.MB;
        if (anonymousClass2lS2.f33624m == null) {
            z2 = false;
        }
        anonymousClass2lS2.f33605T = AnonymousClass2lS.m17102E(anonymousClass2lS2, new AnonymousClass3u8(anonymousClass2lS2.f33625n, new AnonymousClass3uA(0, anonymousClass2lS2.f33612a, anonymousClass2lS2.f33597L.f16573D.f16545a, false), dF, anonymousClass2lS2.f33595J, null, (long) anonymousClass2lS2.f33621j, 0, anonymousClass2lS2.f33596K, anonymousClass2lS2.f33613b, 0, true, anonymousClass2lS2.f33617f, anonymousClass2lS2.f33620i, anonymousClass2lS2.f33619h, anonymousClass2lS2.f33608W, anonymousClass2lS2.f33616e, anonymousClass2lS2.f33626o, anonymousClass2lS2.f33631t, anonymousClass2lS2.f33614c, z, D, 0, anonymousClass2lS2.f33628q, z3, anonymousClass3sV, anonymousClass2lS2.f33623l, anonymousClass2lS2.f33634w, anonymousClass2lS2.createManifestPreprocessor(), new AnonymousClass2rf(kC, jC, z4, z5, z2, anonymousClass2lS2.f33597L.XB, false, anonymousClass2lS2.f33597L.AB, anonymousClass2lS2.f33597L.UB, false, anonymousClass2lS2.f33597L.TB, anonymousClass2lS2.f33597L.BB)), D);
        return AnonymousClass2lh.m17118B(anonymousClass2lS2.f33612a, anonymousClass2lS2.f33597L, anonymousClass2lS2.f33605T, ((AnonymousClass3uE) anonymousClass2rl.f35134D.get(0)).f46394D.f35056E, anonymousClass2lS2.f33615d, anonymousClass2lS2.f33596K, anonymousClass2lS2.f33600O, anonymousClass2lS2.f33622k, anonymousClass2lS2.f33636y, anonymousClass2lS2.f33627p, false);
    }

    /* renamed from: D */
    public static boolean m17101D(AnonymousClass2lS anonymousClass2lS, AnonymousClass2rl anonymousClass2rl) {
        return (anonymousClass2lS.f33603R == null || anonymousClass2rl == null || anonymousClass2rl.f35132B == null || anonymousClass2rl.f35132B.m17522A() == null) ? null : true;
    }

    /* renamed from: E */
    private static AnonymousClass2qn m17102E(AnonymousClass2lS anonymousClass2lS, AnonymousClass2rM anonymousClass2rM, boolean z) {
        AnonymousClass2rM anonymousClass2rM2 = anonymousClass2rM;
        if (anonymousClass2lS.f33597L.RC) {
            return new AnonymousClass3u4(anonymousClass2rM2, anonymousClass2lS.f33601P, anonymousClass2lS.f33635x * anonymousClass2lS.f33588C, anonymousClass2lS.f33596K, anonymousClass2lS.f33609X, 1001, 3, false, anonymousClass2lS.f33593H, anonymousClass2lS.f33599N, false, 1000, anonymousClass2lS.f33589D);
        }
        return z ? new AnonymousClass3u6(anonymousClass2rM2, anonymousClass2lS.f33601P, anonymousClass2lS.f33635x * anonymousClass2lS.f33588C, anonymousClass2lS.f33596K, anonymousClass2lS.f33609X, 1001, 3, anonymousClass2lS.f33593H) : new AnonymousClass3u5(anonymousClass2rM2, anonymousClass2lS.f33601P, anonymousClass2lS.f33635x * anonymousClass2lS.f33588C, anonymousClass2lS.f33596K, anonymousClass2lS.f33609X, 1001, 3, false, anonymousClass2lS.f33593H, anonymousClass2lS.f33599N, false, 1000, anonymousClass2lS.f33589D);
    }

    public AnonymousClass2ro createManifestPreprocessor() {
        return (this.f33599N && this.f33624m == null) ? new AnonymousClass3sX(this.f33630s) : null;
    }

    public static String getDashVideoStreams(AnonymousClass2rl anonymousClass2rl, boolean z) {
        if (anonymousClass2rl == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (AnonymousClass3uE anonymousClass3uE : anonymousClass2rl.f35134D) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(anonymousClass3uE.f46394D.f35065N != null ? anonymousClass3uE.f46394D.f35065N : anonymousClass3uE.f46394D.f35068Q);
        }
        if (!z && stringBuilder.length() > 0 && anonymousClass2rl.f35134D.size() > 1) {
            stringBuilder.insert(0, "cbr(");
            stringBuilder.append(")");
        }
        if (stringBuilder.length() > 0) {
            return stringBuilder.toString();
        }
        return null;
    }
}
