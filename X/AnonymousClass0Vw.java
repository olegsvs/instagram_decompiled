package X;

import android.text.TextUtils;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.model.PendingRecipient;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: X.0Vw */
public final class AnonymousClass0Vw implements Cloneable {
    /* renamed from: w */
    public static final Comparator f5799w = new AnonymousClass1fB();
    /* renamed from: x */
    public static final Comparator f5800x = new AnonymousClass1fC();
    /* renamed from: y */
    public static final Comparator f5801y = new AnonymousClass1bD();
    /* renamed from: B */
    public AnonymousClass0Ci f5802B;
    /* renamed from: C */
    public int f5803C;
    /* renamed from: D */
    public int f5804D;
    /* renamed from: E */
    public boolean f5805E;
    /* renamed from: F */
    public boolean f5806F;
    /* renamed from: G */
    public AnonymousClass0Ci f5807G;
    /* renamed from: H */
    public boolean f5808H;
    /* renamed from: I */
    public boolean f5809I;
    /* renamed from: J */
    public final AnonymousClass4gz f5810J = new AnonymousClass1T4(this);
    /* renamed from: K */
    public boolean f5811K;
    /* renamed from: L */
    public boolean f5812L;
    /* renamed from: M */
    public AnonymousClass4gz f5813M = new AnonymousClass0XI(this);
    /* renamed from: N */
    public boolean f5814N;
    /* renamed from: O */
    public boolean f5815O;
    /* renamed from: P */
    public boolean f5816P;
    /* renamed from: Q */
    public Boolean f5817Q;
    /* renamed from: R */
    public boolean f5818R;
    /* renamed from: S */
    public AnonymousClass4gz f5819S = new AnonymousClass5WU(this);
    /* renamed from: T */
    public Long f5820T;
    /* renamed from: U */
    public AnonymousClass0W7 f5821U;
    /* renamed from: V */
    public AnonymousClass0W7 f5822V;
    /* renamed from: W */
    public AnonymousClass0W7 f5823W;
    /* renamed from: X */
    public AnonymousClass0W7 f5824X;
    /* renamed from: Y */
    public List f5825Y;
    /* renamed from: Z */
    public AnonymousClass0X8 f5826Z = AnonymousClass0X8.UNSET;
    /* renamed from: a */
    public AnonymousClass0WF f5827a;
    /* renamed from: b */
    public AnonymousClass0WF f5828b;
    /* renamed from: c */
    public List f5829c;
    /* renamed from: d */
    public AnonymousClass0W7 f5830d;
    /* renamed from: e */
    public AnonymousClass0W7 f5831e;
    /* renamed from: f */
    public float f5832f;
    /* renamed from: g */
    public int f5833g;
    /* renamed from: h */
    public int f5834h;
    /* renamed from: i */
    public String f5835i;
    /* renamed from: j */
    public String f5836j;
    /* renamed from: k */
    public int f5837k = 0;
    /* renamed from: l */
    public String f5838l;
    /* renamed from: m */
    public String f5839m;
    /* renamed from: n */
    public String f5840n;
    /* renamed from: o */
    public int f5841o;
    /* renamed from: p */
    public HashMap f5842p = new HashMap();
    /* renamed from: q */
    public String f5843q;
    /* renamed from: r */
    public String f5844r;
    /* renamed from: s */
    public String f5845s;
    /* renamed from: t */
    public String f5846t;
    /* renamed from: u */
    public String f5847u;
    /* renamed from: v */
    public String f5848v;

    /* renamed from: A */
    public final synchronized AnonymousClass0Vw m4929A() {
        AnonymousClass0Vw anonymousClass0Vw;
        try {
            anonymousClass0Vw = (AnonymousClass0Vw) super.clone();
            anonymousClass0Vw.f5842p = new HashMap(this.f5842p);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        return anonymousClass0Vw;
    }

    /* renamed from: B */
    public final synchronized AnonymousClass0WF m4930B(String str) {
        AnonymousClass0WF anonymousClass0WF;
        anonymousClass0WF = (AnonymousClass0WF) this.f5842p.get(str);
        if (anonymousClass0WF == null) {
            anonymousClass0WF = this.f5827a;
        } else if (this.f5827a != null && this.f5827a.m5052A(anonymousClass0WF.f5948D) >= 0) {
            anonymousClass0WF = this.f5827a;
        }
        return anonymousClass0WF;
    }

    /* renamed from: B */
    public static String m4927B(String str) {
        if (str != null) {
            str = AnonymousClass0Cg.f1704B.m978B(str);
            if (str != null && TextUtils.isEmpty(str.uT())) {
                return str.uT();
            }
        }
        return null;
    }

    /* renamed from: C */
    public final synchronized int m4931C() {
        return this.f5803C;
    }

    /* renamed from: C */
    public static boolean m4928C(AnonymousClass0Vw anonymousClass0Vw, String str, String str2, String str3) {
        if (str3.equals(str)) {
            return true;
        }
        AnonymousClass0WG B = anonymousClass0Vw.m4927B(str);
        if (B == null || str2 == null || B.m5052A(str2) < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public final synchronized int m4932D() {
        return this.f5804D;
    }

    /* renamed from: E */
    public final synchronized AnonymousClass0Ci m4933E() {
        return this.f5807G;
    }

    /* renamed from: F */
    public final synchronized DirectThreadKey m4934F() {
        return new DirectThreadKey(this.f5836j, PendingRecipient.m5175B(this.f5829c));
    }

    /* renamed from: G */
    public final synchronized Long m4935G() {
        return this.f5820T;
    }

    /* renamed from: H */
    public final synchronized AnonymousClass0W7 m4936H() {
        return this.f5821U;
    }

    /* renamed from: I */
    public final synchronized AnonymousClass0X8 m4937I() {
        return this.f5826Z;
    }

    /* renamed from: J */
    public final synchronized List m4938J() {
        return this.f5829c;
    }

    /* renamed from: K */
    public final synchronized AnonymousClass0W7 m4939K() {
        return this.f5830d;
    }

    /* renamed from: L */
    public final synchronized AnonymousClass0W7 m4940L() {
        return this.f5831e;
    }

    /* renamed from: M */
    public final synchronized int m4941M() {
        return this.f5833g;
    }

    /* renamed from: N */
    public final synchronized int m4942N() {
        return this.f5834h;
    }

    /* renamed from: O */
    public final synchronized String m4943O() {
        return this.f5836j;
    }

    /* renamed from: P */
    public final synchronized int m4944P() {
        return this.f5837k;
    }

    /* renamed from: Q */
    public final synchronized String m4945Q() {
        return this.f5838l;
    }

    /* renamed from: R */
    public final synchronized AnonymousClass0WS m4946R() {
        AnonymousClass0WU anonymousClass0WU;
        anonymousClass0WU = AnonymousClass0Wx.f6073C;
        return AnonymousClass0WS.m5140B(anonymousClass0WU, AnonymousClass0Wx.m5189C(this.f5838l, this.f5806F, false), anonymousClass0WU.f5989C);
    }

    /* renamed from: S */
    public final synchronized String m4947S() {
        return this.f5839m;
    }

    /* renamed from: T */
    public final synchronized int m4948T() {
        return this.f5841o;
    }

    /* renamed from: U */
    public final synchronized String m4949U() {
        return this.f5843q;
    }

    /* renamed from: V */
    public final synchronized String m4950V() {
        return this.f5846t;
    }

    /* renamed from: W */
    public final synchronized String m4951W() {
        return this.f5847u;
    }

    /* renamed from: X */
    public final synchronized AnonymousClass0WS m4952X() {
        if (((Boolean) AnonymousClass0CC.eI.m845G()).booleanValue()) {
            AnonymousClass0WU anonymousClass0WU = AnonymousClass0Wx.f6073C;
            return AnonymousClass0WS.m5140B(anonymousClass0WU, this.f5848v != null ? this.f5848v : (String) anonymousClass0WU.f5990D, this.f5847u != null ? this.f5847u : (String) anonymousClass0WU.f5990D);
        }
        AnonymousClass0WU anonymousClass0WU2 = AnonymousClass0Wx.f6073C;
        return AnonymousClass0WS.m5140B(anonymousClass0WU2, anonymousClass0WU2.f5990D, AnonymousClass0Wx.m5188B(this.f5846t, this.f5805E, false));
    }

    /* renamed from: Y */
    public final synchronized boolean m4953Y() {
        return m4936H() != null;
    }

    /* renamed from: Z */
    public final synchronized boolean m4954Z() {
        return this.f5806F;
    }

    /* renamed from: a */
    public final synchronized boolean m4955a() {
        boolean z;
        z = (this.f5823W == null || m4963i(this.f5802B.getId(), this.f5823W)) ? false : true;
        return z;
    }

    /* renamed from: b */
    public final synchronized boolean m4956b() {
        return this.f5831e != null;
    }

    /* renamed from: c */
    public final synchronized boolean m4957c() {
        return this.f5808H;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return m4929A();
    }

    /* renamed from: d */
    public final synchronized boolean m4958d() {
        boolean z;
        z = true;
        if (this.f5829c.size() <= 1) {
            z = false;
        }
        return z;
    }

    /* renamed from: e */
    public final synchronized boolean m4959e() {
        return ((Boolean) this.f5810J.C()).booleanValue();
    }

    /* renamed from: f */
    public final synchronized boolean m4960f() {
        return ((Boolean) this.f5813M.C()).booleanValue();
    }

    /* renamed from: g */
    public final synchronized boolean m4961g() {
        return this.f5814N;
    }

    /* renamed from: h */
    public final synchronized boolean m4962h() {
        return this.f5815O;
    }

    /* renamed from: i */
    public final synchronized boolean m4963i(String str, AnonymousClass0W7 anonymousClass0W7) {
        return AnonymousClass0Vw.m4928C(this, str, anonymousClass0W7.f5885O, anonymousClass0W7.f5918v);
    }

    /* renamed from: j */
    public final synchronized boolean m4964j() {
        boolean z;
        if (!(m4956b() || m4955a())) {
            if (!m4959e()) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    /* renamed from: k */
    public final synchronized boolean m4965k() {
        if (this.f5817Q != null) {
            return this.f5817Q.booleanValue();
        }
        return this.f5816P;
    }

    /* renamed from: l */
    public final synchronized boolean m4966l() {
        return ((Boolean) this.f5819S.C()).booleanValue();
    }

    /* renamed from: m */
    public final synchronized void m4967m(String str, String str2, String str3, AnonymousClass0X8 anonymousClass0X8, AnonymousClass0Ci anonymousClass0Ci, List list, List list2, String str4, String str5, Map map, Long l, float f, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str6, String str7) {
        this.f5845s = str;
        this.f5836j = str2;
        this.f5840n = str3;
        this.f5826Z = anonymousClass0X8;
        this.f5807G = anonymousClass0Ci;
        m4971q(list);
        this.f5825Y = new ArrayList(list2);
        this.f5839m = str4;
        this.f5835i = str5;
        for (Entry entry : map.entrySet()) {
            m4976v((String) entry.getKey(), (AnonymousClass0WF) entry.getValue());
        }
        this.f5820T = l;
        this.f5832f = f;
        this.f5834h = i;
        this.f5833g = i2;
        this.f5804D = i3;
        this.f5803C = i4;
        this.f5815O = z;
        this.f5814N = z5;
        this.f5837k = i5;
        this.f5810J.F(Boolean.valueOf(z2));
        this.f5813M.F(Boolean.valueOf(z3));
        this.f5819S.F(Boolean.valueOf(z4));
        this.f5808H = z6;
        this.f5843q = str6;
        this.f5844r = str7;
    }

    /* renamed from: n */
    public final synchronized void m4968n(boolean z) {
        this.f5805E = z;
    }

    /* renamed from: o */
    public final synchronized void m4969o(boolean z) {
        this.f5809I = z;
    }

    /* renamed from: p */
    public final synchronized void m4970p(AnonymousClass0WF anonymousClass0WF) {
        this.f5828b = anonymousClass0WF;
    }

    /* renamed from: q */
    public final synchronized void m4971q(List list) {
        if (this.f5829c != list) {
            this.f5829c = new ArrayList(list);
        }
    }

    /* renamed from: r */
    public final synchronized void m4972r(boolean z) {
        this.f5815O = z;
    }

    /* renamed from: s */
    public final synchronized void m4973s(String str) {
        this.f5838l = str;
    }

    /* renamed from: t */
    public final synchronized void m4974t(int i) {
        this.f5841o = i;
    }

    /* renamed from: u */
    public final synchronized void m4975u(boolean z) {
        this.f5816P = z;
    }

    /* renamed from: v */
    public final synchronized boolean m4976v(String str, AnonymousClass0WF anonymousClass0WF) {
        AnonymousClass0WF anonymousClass0WF2 = (AnonymousClass0WF) this.f5842p.get(str);
        if (anonymousClass0WF2 != null) {
            if (anonymousClass0WF2.m5052A(anonymousClass0WF.f5948D) >= 0) {
                return false;
            }
        }
        this.f5842p.put(str, anonymousClass0WF);
        return true;
    }
}
