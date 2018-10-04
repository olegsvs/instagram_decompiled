package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.C0164R;
import com.instagram.model.hashtag.Hashtag;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Uq */
public final class AnonymousClass1Uq extends AnonymousClass0Rq implements AnonymousClass3Ix, AnonymousClass0iD, AnonymousClass1bW, AnonymousClass1fI, AnonymousClass4oA, AnonymousClass0Rr, AnonymousClass0iC, AnonymousClass4n5 {
    /* renamed from: B */
    public final AnonymousClass4sT f19172B;
    /* renamed from: C */
    public final AnonymousClass4mq f19173C = new AnonymousClass4mq();
    /* renamed from: D */
    public final AnonymousClass1Wa f19174D;
    /* renamed from: E */
    public final AnonymousClass4nt f19175E;
    /* renamed from: F */
    public final AnonymousClass0qS f19176F;
    /* renamed from: G */
    public final AnonymousClass2Lm f19177G;
    /* renamed from: H */
    public final AnonymousClass0Ro f19178H;
    /* renamed from: I */
    public final Map f19179I = new HashMap();
    /* renamed from: J */
    public final Map f19180J = new HashMap();
    /* renamed from: K */
    public final Map f19181K = new HashMap();
    /* renamed from: L */
    public final AnonymousClass4nz f19182L;
    /* renamed from: M */
    public final AnonymousClass3J1 f19183M = new AnonymousClass3J1();
    /* renamed from: N */
    public final AnonymousClass4o0 f19184N;
    /* renamed from: O */
    public final AnonymousClass0Cm f19185O;
    /* renamed from: P */
    private final AnonymousClass5Xz f19186P;
    /* renamed from: Q */
    private final Map f19187Q = new HashMap();
    /* renamed from: R */
    private boolean f19188R = false;
    /* renamed from: S */
    private final AnonymousClass1VC f19189S;
    /* renamed from: T */
    private final AnonymousClass2Hx f19190T;
    /* renamed from: U */
    private final AnonymousClass0qL f19191U;
    /* renamed from: V */
    private final String f19192V;
    /* renamed from: W */
    private final AnonymousClass4s6 f19193W;
    /* renamed from: X */
    private final AnonymousClass5EX f19194X;
    /* renamed from: Y */
    private final AnonymousClass4mx f19195Y;
    /* renamed from: Z */
    private AnonymousClass3J2 f19196Z;
    /* renamed from: a */
    private final AnonymousClass4n3 f19197a;
    /* renamed from: b */
    private final AnonymousClass4n1 f19198b = new AnonymousClass5Xt(this);
    /* renamed from: c */
    private final Map f19199c = new HashMap();

    public AnonymousClass1Uq(Context context, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass4nz anonymousClass4nz, AnonymousClass4o0 anonymousClass4o0, AnonymousClass4nt anonymousClass4nt, AnonymousClass1Wa anonymousClass1Wa, AnonymousClass0Ro anonymousClass0Ro, AnonymousClass5Xz anonymousClass5Xz, AnonymousClass4sY anonymousClass4sY, AnonymousClass5Y0 anonymousClass5Y0, AnonymousClass3J2 anonymousClass3J2, AnonymousClass0Cm anonymousClass0Cm, String str) {
        this.f19182L = anonymousClass4nz;
        this.f19184N = anonymousClass4o0;
        this.f19175E = anonymousClass4nt;
        this.f19174D = anonymousClass1Wa;
        Context context2 = context;
        this.f19177G = new AnonymousClass2Lm(context);
        this.f19189S = new AnonymousClass1VC(context);
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        this.f19193W = new AnonymousClass4s6(context, anonymousClass0Cm2);
        this.f19191U = new AnonymousClass0qL(context);
        this.f19178H = anonymousClass0Ro;
        this.f19197a = new AnonymousClass4n3(context, this.f19198b);
        this.f19186P = anonymousClass5Xz;
        this.f19196Z = anonymousClass3J2;
        Resources resources = context.getResources();
        AnonymousClass2Hx anonymousClass2Hx = new AnonymousClass2Hx();
        anonymousClass2Hx.f28600F = C0164R.drawable.empty_state_camera;
        anonymousClass2Hx.f28608N = resources.getString(C0164R.string.no_posts_yet);
        this.f19190T = anonymousClass2Hx;
        this.f19192V = str;
        AnonymousClass4sY anonymousClass4sY2 = anonymousClass4sY;
        this.f19176F = new AnonymousClass0qS(context2, anonymousClass4sY2, anonymousClass0Cm2, anonymousClass0PZ, "account_recs");
        this.f19195Y = new AnonymousClass4mx(anonymousClass5Y0);
        this.f19185O = anonymousClass0Cm2;
        this.f19194X = new AnonymousClass5EX(context);
        AnonymousClass3J2 anonymousClass3J22 = this.f19196Z;
        Map hashMap = new HashMap();
        for (AnonymousClass3J2 put : AnonymousClass4n4.B(this.f19185O).f57273B) {
            hashMap.put(put, new AnonymousClass4sU());
        }
        AnonymousClass4sU anonymousClass4sU = (AnonymousClass4sU) AnonymousClass0LH.m2927E(hashMap.get(anonymousClass3J22));
        AnonymousClass4sT anonymousClass4sT = new AnonymousClass4sT(hashMap, new AnonymousClass1W3(anonymousClass4sU), new AnonymousClass5by(anonymousClass4sU, AnonymousClass1ew.f21063B));
        anonymousClass4sT.A();
        this.f19172B = anonymousClass4sT;
        m4249D(this.f19191U, this.f19182L, this.f19184N, this.f19175E, this.f19174D, this.f19177G, this.f19189S, this.f19193W, this.f19197a, this.f19176F, this.f19195Y, this.f19194X);
    }

    /* renamed from: B */
    public static void m11613B(AnonymousClass1Uq anonymousClass1Uq) {
        AnonymousClass3Iz anonymousClass3Iz = (AnonymousClass3Iz) anonymousClass1Uq.f19181K.get(anonymousClass1Uq.f19196Z);
        if (anonymousClass3Iz != null) {
            AnonymousClass4sX I = anonymousClass1Uq.m11623I(anonymousClass1Uq.dR());
            anonymousClass1Uq.m4247B(anonymousClass3Iz, I != null ? I.A() : null, anonymousClass1Uq.f19195Y);
        }
    }

    /* renamed from: C */
    public static void m11614C(AnonymousClass1Uq anonymousClass1Uq) {
        if (!anonymousClass1Uq.f19183M.f39985C.isEmpty()) {
            anonymousClass1Uq.m4247B(anonymousClass1Uq.f19183M, anonymousClass1Uq.f19196Z, anonymousClass1Uq.f19197a);
        }
    }

    /* renamed from: D */
    public static void m11615D(AnonymousClass1Uq anonymousClass1Uq) {
        anonymousClass1Uq.f19188R = true;
        anonymousClass1Uq.f19172B.A();
        anonymousClass1Uq.m4248C();
        anonymousClass1Uq.m4246A(null, anonymousClass1Uq.f19191U);
        if (anonymousClass1Uq.f19172B.D() == 0) {
            if (anonymousClass1Uq.f19172B.f58078D == AnonymousClass0nS.GRID) {
                AnonymousClass1Uq.m11614C(anonymousClass1Uq);
                AnonymousClass1Uq.m11613B(anonymousClass1Uq);
                AnonymousClass1Uq.m11616E(anonymousClass1Uq);
            } else {
                AnonymousClass1Uq.m11616E(anonymousClass1Uq);
            }
        } else if (anonymousClass1Uq.f19172B.f58078D == AnonymousClass0nS.GRID) {
            AnonymousClass1Uq.m11614C(anonymousClass1Uq);
            AnonymousClass1Uq.m11613B(anonymousClass1Uq);
            int i = 0;
            int i2 = 0;
            while (i < anonymousClass1Uq.f19172B.D()) {
                r3 = anonymousClass1Uq.f19172B.B(i);
                AnonymousClass1Xu LO;
                if (r3 instanceof AnonymousClass44t) {
                    AnonymousClass44t anonymousClass44t = (AnonymousClass44t) r3;
                    LO = anonymousClass1Uq.LO(anonymousClass44t.getId());
                    LO.m11797B(i2, i == anonymousClass1Uq.f19172B.D() - 1);
                    anonymousClass1Uq.m4247B(anonymousClass44t, LO, anonymousClass1Uq.f19182L);
                } else if (r3 instanceof AnonymousClass44v) {
                    AnonymousClass44v anonymousClass44v = (AnonymousClass44v) r3;
                    LO = anonymousClass1Uq.LO(anonymousClass44v.getId());
                    LO.m11797B(i2, i == anonymousClass1Uq.f19172B.D() - 1);
                    anonymousClass1Uq.m4247B(anonymousClass44v, LO, anonymousClass1Uq.f19184N);
                    i2++;
                } else if (r3 instanceof AnonymousClass44s) {
                    AnonymousClass44s anonymousClass44s = (AnonymousClass44s) r3;
                    LO = anonymousClass1Uq.LO(((AnonymousClass1e0) anonymousClass44s.A().f20795E).f20829D);
                    LO.m11797B(i2, i == anonymousClass1Uq.f19172B.D() - 1);
                    anonymousClass1Uq.m4247B(anonymousClass44s, LO, anonymousClass1Uq.f19175E);
                } else {
                    if (r3 instanceof AnonymousClass44u) {
                        AnonymousClass44u anonymousClass44u = (AnonymousClass44u) r3;
                        if (anonymousClass44u.A().f20802L == AnonymousClass1dy.ACCOUNT_RECS_AS_NETEGO) {
                            AnonymousClass0ly anonymousClass0ly = (AnonymousClass0ly) anonymousClass44u.A().f20795E;
                            if (!anonymousClass0ly.m7416F()) {
                                AnonymousClass4mq anonymousClass4mq = anonymousClass1Uq.f19173C;
                                AnonymousClass0qo anonymousClass0qo = (AnonymousClass0qo) anonymousClass4mq.f57253C.get(Integer.valueOf(i2));
                                if (anonymousClass0qo == null) {
                                    anonymousClass0qo = new AnonymousClass0qo();
                                    anonymousClass0qo.f11010E = i2;
                                    anonymousClass4mq.f57253C.put(Integer.valueOf(i2), anonymousClass0qo);
                                }
                                anonymousClass0qo.f11014I = false;
                                anonymousClass1Uq.m4247B(anonymousClass0ly, anonymousClass0qo, anonymousClass1Uq.f19176F);
                            }
                        }
                    }
                    r1 = new StringBuilder();
                    r1.append("Unhandled grid object type: ");
                    r1.append(r3.getClass());
                    throw new IllegalStateException(r1.toString());
                }
                i2++;
                i++;
            }
            anonymousClass1Uq.m4246A(anonymousClass1Uq.f19178H, anonymousClass1Uq.f19177G);
        } else {
            int i3 = 0;
            while (i3 < anonymousClass1Uq.f19172B.D()) {
                r3 = anonymousClass1Uq.f19172B.B(i3);
                if (r3 instanceof AnonymousClass0P7) {
                    AnonymousClass0P7 anonymousClass0P7 = (AnonymousClass0P7) r3;
                    AnonymousClass0m3 RO = anonymousClass1Uq.RO(anonymousClass0P7);
                    RO.f9717z = i3;
                    anonymousClass1Uq.m4247B(anonymousClass0P7, RO, anonymousClass1Uq.f19174D);
                    i3++;
                } else {
                    r1 = new StringBuilder();
                    r1.append("Unhandled feed object type: ");
                    r1.append(r3.getClass());
                    throw new IllegalStateException(r1.toString());
                }
            }
        }
        anonymousClass1Uq.m4250E();
    }

    /* renamed from: E */
    public static void m11616E(AnonymousClass1Uq anonymousClass1Uq) {
        if (anonymousClass1Uq.f19178H.uX()) {
            anonymousClass1Uq.m4247B(new AnonymousClass2Hx(), AnonymousClass2I0.f28622F, anonymousClass1Uq.f19189S);
        } else if (anonymousClass1Uq.f19178H.UX()) {
            anonymousClass1Uq.m4247B(new AnonymousClass2Hx(), AnonymousClass2I0.f28620D, anonymousClass1Uq.f19189S);
        } else {
            anonymousClass1Uq.m11618G();
        }
    }

    public final AnonymousClass3Jt EU(int i) {
        i = getItem(i);
        if (i instanceof AnonymousClass44s) {
            AnonymousClass44s anonymousClass44s = (AnonymousClass44s) i;
            return AnonymousClass3Jm.B(anonymousClass44s.A(), anonymousClass44s.f48171B);
        } else if (!(i instanceof AnonymousClass44v)) {
            return null;
        } else {
            AnonymousClass44v anonymousClass44v = (AnonymousClass44v) i;
            return AnonymousClass3Jm.B(anonymousClass44v.C(), anonymousClass44v.f48169B);
        }
    }

    /* renamed from: F */
    public final void m11620F(AnonymousClass3J2 anonymousClass3J2) {
        AnonymousClass4sU B = AnonymousClass4sT.B(this.f19172B, anonymousClass3J2);
        B.f58080B.clear();
        AnonymousClass4sU.B(B);
        this.f19187Q.clear();
    }

    /* renamed from: F */
    private static boolean m11617F(AnonymousClass1Uq anonymousClass1Uq) {
        AnonymousClass5EY anonymousClass5EY = (AnonymousClass5EY) anonymousClass1Uq.f19179I.get(anonymousClass1Uq.f19196Z);
        if (anonymousClass5EY != null) {
            if (!anonymousClass5EY.A()) {
                AnonymousClass4sX I = anonymousClass1Uq.m11623I(anonymousClass1Uq.f19196Z);
                if (I == null || I.f58092B == null) {
                    anonymousClass1Uq.m4247B(null, anonymousClass5EY, anonymousClass1Uq.f19194X);
                    return true;
                }
            }
        }
        return false;
    }

    public final void FOA(AnonymousClass0jZ anonymousClass0jZ) {
        this.f19174D.f19557L = anonymousClass0jZ;
    }

    public final int FU(AnonymousClass3Jt anonymousClass3Jt) {
        String id = anonymousClass3Jt.f40104D.getId();
        if (this.f19173C.f57252B.containsKey(id)) {
            return this.f19173C.A(id).f19896D;
        }
        return -1;
    }

    public final boolean FX() {
        return this.f19188R;
    }

    /* renamed from: G */
    private void m11618G() {
        if (!AnonymousClass1Uq.m11617F(this)) {
            AnonymousClass3J2 dR = dR();
            if (this.f19180J.containsKey(dR)) {
                m4247B(this.f19180J.get(dR), AnonymousClass2I0.f28619C, this.f19189S);
            } else if (dR() == AnonymousClass3J2.f39988E) {
                m4246A(this.f19192V, this.f19193W);
            } else {
                m4247B(this.f19190T, AnonymousClass2I0.f28619C, this.f19189S);
            }
        }
    }

    /* renamed from: G */
    public final boolean m11621G(String str) {
        AnonymousClass4sT anonymousClass4sT = this.f19172B;
        if (anonymousClass4sT.f58078D == AnonymousClass0nS.GRID) {
            AnonymousClass5Xs anonymousClass5Xs = anonymousClass4sT.f58077C;
            AnonymousClass5Xs.B(anonymousClass5Xs);
            return anonymousClass5Xs.D(str, anonymousClass5Xs.f65990B);
        }
        anonymousClass5Xs = anonymousClass4sT.f58076B;
        AnonymousClass5Xs.B(anonymousClass5Xs);
        return anonymousClass5Xs.D(str, anonymousClass5Xs.f65990B);
    }

    /* renamed from: H */
    public final int m11622H() {
        return m11624J(dR());
    }

    /* renamed from: H */
    private void m11619H(AnonymousClass0nS anonymousClass0nS) {
        if (this.f19172B.E(anonymousClass0nS)) {
            if (anonymousClass0nS == AnonymousClass0nS.GRID) {
                this.f19174D.m11734A();
                AnonymousClass0nL.m7653B().m7654A();
            }
            AnonymousClass1Uq.m11615D(this);
            AnonymousClass5Xz anonymousClass5Xz = this.f19186P;
            if (anonymousClass0nS == AnonymousClass0nS.FEED) {
                AnonymousClass4nC anonymousClass4nC = anonymousClass5Xz.f65998B.f58161E;
                if (anonymousClass4nC != null) {
                    anonymousClass4nC.A();
                }
            }
        }
    }

    /* renamed from: I */
    public final AnonymousClass4sX m11623I(AnonymousClass3J2 anonymousClass3J2) {
        return (AnonymousClass4sX) this.f19199c.get(anonymousClass3J2);
    }

    /* renamed from: J */
    public final int m11624J(AnonymousClass3J2 anonymousClass3J2) {
        return this.f19183M.A(anonymousClass3J2);
    }

    /* renamed from: K */
    public final boolean m11625K(AnonymousClass3J2 anonymousClass3J2) {
        return AnonymousClass4sT.B(this.f19172B, anonymousClass3J2).f58080B.size() == 0;
    }

    /* renamed from: L */
    public final void m11626L(AnonymousClass3J2 anonymousClass3J2, boolean z) {
        if (this.f19196Z != anonymousClass3J2) {
            this.f19196Z = anonymousClass3J2;
            AnonymousClass4sT anonymousClass4sT = this.f19172B;
            AnonymousClass4sU B = AnonymousClass4sT.B(anonymousClass4sT, anonymousClass3J2);
            anonymousClass4sT.f58077C.E(B);
            anonymousClass4sT.f58076B.E(B);
            this.f19172B.A();
            if (z) {
                AnonymousClass5Xz anonymousClass5Xz = this.f19186P;
                anonymousClass5Xz.f65998B.f58166J.D(anonymousClass3J2);
                anonymousClass5Xz.f65998B.f58165I.m11736C(AnonymousClass0uC.m8217K(anonymousClass5Xz.f65998B.eM(), anonymousClass3J2.toString(), anonymousClass5Xz.f65998B.f58159C.m11624J(anonymousClass3J2)));
                if (anonymousClass5Xz.f65998B.f58159C.m11625K(anonymousClass3J2)) {
                    AnonymousClass4tE.J(anonymousClass5Xz.f65998B, true, false, AnonymousClass4s5.C(anonymousClass5Xz.f65998B.f58176T, 20643841, anonymousClass3J2.toString()));
                }
                Hashtag eM = anonymousClass5Xz.f65998B.eM();
                int J = anonymousClass5Xz.f65998B.f58159C.m11624J(anonymousClass3J2);
                AnonymousClass0NN F = AnonymousClass0NN.m3292C("hashtag_feed_button_tapped", anonymousClass5Xz.f65998B.getModuleName()).m3298F("session_id", anonymousClass5Xz.f65998B.f58181Y);
                AnonymousClass0uC.m8208B(F, eM);
                AnonymousClass0uC.m8211E(F, anonymousClass3J2, J);
                F.m3310R();
                if (anonymousClass3J2 == AnonymousClass3J2.f39988E) {
                    AnonymousClass4nC anonymousClass4nC = anonymousClass5Xz.f65998B.f58161E;
                    if (anonymousClass4nC != null) {
                        anonymousClass4nC.A();
                    }
                    anonymousClass5Xz.f65998B.f58183a.H("context_switch", false);
                }
            }
            AnonymousClass1Uq.m11615D(this);
        }
    }

    public final AnonymousClass1Xu LO(String str) {
        return this.f19173C.A(str);
    }

    public final int LR(Object obj) {
        return dR() == AnonymousClass3J2.f39989F ? 0 : 1;
    }

    /* renamed from: M */
    public final boolean m11627M(AnonymousClass3J2 anonymousClass3J2, AnonymousClass4sX anonymousClass4sX) {
        AnonymousClass4sX anonymousClass4sX2 = (AnonymousClass4sX) this.f19199c.get(anonymousClass3J2);
        if (anonymousClass4sX2 != null) {
            if (anonymousClass4sX2.equals(anonymousClass4sX)) {
                return false;
            }
        }
        m11620F(anonymousClass3J2);
        this.f19199c.put(anonymousClass3J2, anonymousClass4sX);
        AnonymousClass1Uq.m11615D(this);
        return true;
    }

    /* renamed from: N */
    public final void m11628N(String str, AnonymousClass0P7 anonymousClass0P7, AnonymousClass5Po anonymousClass5Po) {
        if (AnonymousClass4sj.f58118B[anonymousClass5Po.ordinal()] == 1) {
            int i = 0;
            while (i < getCount()) {
                Object item = getItem(i);
                AnonymousClass1e0 anonymousClass1e0 = null;
                if (item instanceof AnonymousClass44s) {
                    item = ((AnonymousClass44s) item).A().f20795E;
                    if (item != null && (item instanceof AnonymousClass1e0)) {
                        anonymousClass1e0 = (AnonymousClass1e0) item;
                    }
                } else if (item instanceof AnonymousClass44v) {
                    AnonymousClass1du C = ((AnonymousClass44v) item).C();
                    if (C != null && C.f20802L == AnonymousClass1dy.CHANNEL) {
                        anonymousClass1e0 = (AnonymousClass1e0) C.f20795E;
                    }
                }
                if (anonymousClass1e0 == null || !anonymousClass1e0.f20829D.equals(str)) {
                    i++;
                } else {
                    anonymousClass1e0.f20830E = anonymousClass0P7;
                    m4250E();
                    return;
                }
            }
        }
    }

    public final void OH() {
        m11619H(AnonymousClass0nS.FEED);
    }

    public final AnonymousClass0m3 RO(AnonymousClass0P7 anonymousClass0P7) {
        return this.f19173C.RO(anonymousClass0P7);
    }

    public final void Tc() {
        this.f19188R = false;
    }

    public final void UOA(int i) {
        this.f19191U.f10915C = i;
        AnonymousClass1Uq.m11615D(this);
    }

    public final void XH() {
        m11619H(AnonymousClass0nS.GRID);
    }

    public final Object aM(Object obj) {
        return this.f19172B.C(obj);
    }

    public final void cH() {
        AnonymousClass1Uq.m11615D(this);
    }

    public final AnonymousClass3J2 dR() {
        return this.f19196Z;
    }

    public final boolean dX() {
        return this.f19172B.f58078D == AnonymousClass0nS.FEED;
    }

    public final void fNA(AnonymousClass0jx anonymousClass0jx) {
        this.f19174D.m11735B(anonymousClass0jx);
    }

    public final AnonymousClass3J2 iS(Object obj) {
        return dR();
    }

    public final int jS(Object obj) {
        return m11622H();
    }

    public final void notifyDataSetChanged() {
        AnonymousClass1Uq.m11615D(this);
    }
}
