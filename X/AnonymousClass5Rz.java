package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5Rz */
public final class AnonymousClass5Rz extends AnonymousClass4EI implements AnonymousClass0iC {
    /* renamed from: B */
    public final List f63665B = new ArrayList();
    /* renamed from: C */
    public final AnonymousClass4EZ f63666C;
    /* renamed from: D */
    public boolean f63667D;
    /* renamed from: E */
    public boolean f63668E;
    /* renamed from: F */
    public boolean f63669F = false;
    /* renamed from: G */
    public AnonymousClass0P7 f63670G;
    /* renamed from: H */
    public AnonymousClass4Fl f63671H = AnonymousClass4Fl.NONE;
    /* renamed from: I */
    public AnonymousClass0m3 f63672I;
    /* renamed from: J */
    public AnonymousClass4Ee f63673J = AnonymousClass4Ee.f51844E;
    /* renamed from: K */
    public final AnonymousClass4Ep f63674K;
    /* renamed from: L */
    private Integer f63675L;
    /* renamed from: M */
    private final AnonymousClass35S f63676M;
    /* renamed from: N */
    private AnonymousClass0SK f63677N;
    /* renamed from: O */
    private int f63678O;
    /* renamed from: P */
    private final AnonymousClass4EM f63679P;
    /* renamed from: Q */
    private final AnonymousClass2IE f63680Q;
    /* renamed from: R */
    private final AnonymousClass2Lm f63681R;
    /* renamed from: S */
    private final AnonymousClass0Ro f63682S;
    /* renamed from: T */
    private final AnonymousClass2Lm f63683T;
    /* renamed from: U */
    private final AnonymousClass0Ro f63684U;
    /* renamed from: V */
    private final AnonymousClass4Ed f63685V;
    /* renamed from: W */
    private boolean f63686W;
    /* renamed from: X */
    private final AnonymousClass1Wa f63687X;
    /* renamed from: Y */
    private String f63688Y;
    /* renamed from: Z */
    private int f63689Z;
    /* renamed from: a */
    private final AnonymousClass4Ef f63690a;
    /* renamed from: b */
    private final boolean f63691b;
    /* renamed from: c */
    private boolean f63692c;
    /* renamed from: d */
    private boolean f63693d;
    /* renamed from: e */
    private final AnonymousClass2Lm f63694e;
    /* renamed from: f */
    private final AnonymousClass0Ro f63695f;

    public AnonymousClass5Rz(Context context, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ro anonymousClass0Ro, AnonymousClass0Ro anonymousClass0Ro2, AnonymousClass5SC anonymousClass5SC, AnonymousClass35P anonymousClass35P, AnonymousClass5S7 anonymousClass5S7, AnonymousClass0kW anonymousClass0kW, AnonymousClass1cS anonymousClass1cS, AnonymousClass4G8 anonymousClass4G8, AnonymousClass5SA anonymousClass5SA, AnonymousClass0Ro anonymousClass0Ro3, boolean z) {
        Context context2 = context;
        super(context);
        this.f63676M = new AnonymousClass35S(context, anonymousClass35P);
        AnonymousClass5SC anonymousClass5SC2 = anonymousClass5SC;
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        this.f63666C = new AnonymousClass4EZ(context2, anonymousClass0Cm2, anonymousClass5SC2, true, anonymousClass0kW, anonymousClass1cS, anonymousClass4G8);
        this.f63679P = new AnonymousClass4EM(context);
        this.f63674K = new AnonymousClass4Ep(context, anonymousClass5S7);
        this.f63694e = new AnonymousClass2Lm(context);
        this.f63695f = anonymousClass0Ro;
        this.f63683T = new AnonymousClass2Lm(context);
        this.f63684U = anonymousClass0Ro2;
        this.f63681R = new AnonymousClass2Lm(context);
        this.f63682S = anonymousClass0Ro3;
        this.f63685V = new AnonymousClass4Ed(context, anonymousClass0Cm, anonymousClass5SC2);
        this.f63687X = new AnonymousClass1Wa(context2, anonymousClass0PZ, false, false, false, true, anonymousClass0Cm2, null);
        this.f63690a = new AnonymousClass4Ef(context2, anonymousClass5SA);
        this.f63680Q = new AnonymousClass2IE(context2);
        this.f63691b = z;
        D(new AnonymousClass0TB[]{this.f63687X, this.f63676M, this.f63666C, this.f63674K, this.f63681R, this.f63694e, this.f63683T, this.f63679P, this.f63685V, this.f63690a, this.f63680Q});
    }

    /* renamed from: C */
    public static void m26591C(AnonymousClass5Rz anonymousClass5Rz, List list, List list2, boolean z) {
        if (!list2.isEmpty()) {
            for (AnonymousClass0SK anonymousClass0SK : list2) {
                AnonymousClass4EO G = anonymousClass5Rz.G(anonymousClass0SK);
                boolean contains = anonymousClass5Rz.f51756F.contains(anonymousClass0SK);
                boolean E = AnonymousClass5Rz.m26593E(list, anonymousClass0SK, z);
                G.f51790F = contains;
                G.f51789E = E;
                G.f51786B = anonymousClass5Rz.f63667D;
                G.f51787C = anonymousClass5Rz.f63668E;
                G.f51793I = false;
                anonymousClass5Rz.B(anonymousClass0SK, G, anonymousClass5Rz.f63666C);
            }
        }
    }

    /* renamed from: D */
    public static boolean m26592D(AnonymousClass5Rz anonymousClass5Rz) {
        anonymousClass5Rz = anonymousClass5Rz.f63670G;
        return (anonymousClass5Rz == null || anonymousClass5Rz.rB.C().f11811B.size() <= null) ? null : true;
    }

    /* renamed from: E */
    public static boolean m26593E(List list, AnonymousClass0SK anonymousClass0SK, boolean z) {
        if (!z) {
            return false;
        }
        AnonymousClass0SK anonymousClass0SK2 = (AnonymousClass0SK) list.get(list.size() - 1);
        if (!anonymousClass0SK2.F()) {
            return anonymousClass0SK2.equals(anonymousClass0SK);
        }
        list = anonymousClass0SK2.E();
        return ((AnonymousClass0SK) list.get(list.size() - 1)).equals(anonymousClass0SK);
    }

    /* renamed from: F */
    public static void m26594F(AnonymousClass5Rz anonymousClass5Rz, AnonymousClass0SK anonymousClass0SK) {
        if ((anonymousClass0SK.f4897Q == AnonymousClass28L.Always ? 1 : null) != null && !anonymousClass0SK.f4894N) {
            anonymousClass5Rz.B(anonymousClass0SK, null, anonymousClass5Rz.f63685V);
        }
    }

    public final void FOA(AnonymousClass0jZ anonymousClass0jZ) {
        this.f63687X.f19557L = anonymousClass0jZ;
    }

    public final boolean FX() {
        return this.f63686W;
    }

    /* renamed from: G */
    public final AnonymousClass4EO m26595G(AnonymousClass0SK anonymousClass0SK) {
        AnonymousClass4EO anonymousClass4EO = (AnonymousClass4EO) this.f51752B.get(anonymousClass0SK.XP());
        if (anonymousClass4EO != null) {
            return anonymousClass4EO;
        }
        anonymousClass4EO = new AnonymousClass4EO();
        this.f51752B.put(anonymousClass0SK.XP(), anonymousClass4EO);
        return anonymousClass4EO;
    }

    /* renamed from: K */
    public final AnonymousClass0SK m26596K() {
        return this.f63677N;
    }

    /* renamed from: M */
    public final void m26597M() {
        Object obj;
        AnonymousClass0SK anonymousClass0SK;
        this.f63686W = true;
        C();
        AnonymousClass0P7 anonymousClass0P7 = this.f63670G;
        if (anonymousClass0P7 != null) {
            anonymousClass0P7.rB.B();
            if (this.f63671H == AnonymousClass4Fl.FULL) {
                B(this.f63670G, this.f63672I, this.f63687X);
                A(AnonymousClass2ID.FULL_WIDTH, this.f63680Q);
            }
        }
        if (this.f63671H == AnonymousClass4Fl.FULL) {
            AnonymousClass0m3 anonymousClass0m3 = this.f63672I;
            if (anonymousClass0m3 != null) {
                if (anonymousClass0m3.oY()) {
                    obj = null;
                    if (obj != null) {
                        if (this.f63671H == AnonymousClass4Fl.NONE) {
                            anonymousClass0SK = this.f63677N;
                            if (anonymousClass0SK != null) {
                                AnonymousClass4EO G = G(anonymousClass0SK);
                                boolean contains = this.f51756F.contains(this.f63677N);
                                boolean isEmpty = this.f63665B.isEmpty();
                                G.f51790F = contains;
                                G.f51789E = isEmpty;
                                G.f51793I = true;
                                G.f51786B = this.f63667D;
                                G.f51787C = this.f63668E;
                                B(this.f63677N, G, this.f63666C);
                            }
                        }
                        if (this.f63673J.f51846C) {
                            B(this.f63670G, this.f63673J, this.f63690a);
                        }
                        if (((Boolean) AnonymousClass0CC.AF.G()).booleanValue() || !this.f63682S.tX()) {
                            Integer num = this.f63675L;
                            if (num != null && num.intValue() > 0) {
                                B(new AnonymousClass35R(AnonymousClass35Q.COMMENTS, this.f63675L, this.f63688Y), null, this.f63676M);
                            }
                            if (AnonymousClass5Rz.m26592D(this) && this.f63669F) {
                                m26598N(this.f63670G.rB.C().f11811B, true, false);
                            }
                            if (this.f63693d) {
                                B(this.f63695f, null, this.f63694e);
                            }
                            List list = this.f63665B;
                            int i = (AnonymousClass5Rz.m26592D(this) || this.f63669F) ? 0 : 1;
                            m26598N(list, false, i ^ true);
                            if (this.f63692c) {
                                A(this.f63684U, this.f63683T);
                            }
                            if (AnonymousClass5Rz.m26592D(this) && !this.f63669F) {
                                m26598N(this.f63670G.rB.C().f11811B, false, true);
                            }
                            if (AnonymousClass0Gk.K(this.f63670G, this.f63678O)) {
                                B(this.f63670G, new AnonymousClass1bL(this.f63689Z, this.f63678O), this.f63679P);
                            }
                        } else {
                            B(this.f63682S, null, this.f63681R);
                        }
                    }
                    E();
                }
            }
        }
        obj = 1;
        if (obj != null) {
            if (this.f63671H == AnonymousClass4Fl.NONE) {
                anonymousClass0SK = this.f63677N;
                if (anonymousClass0SK != null) {
                    AnonymousClass4EO G2 = G(anonymousClass0SK);
                    boolean contains2 = this.f51756F.contains(this.f63677N);
                    boolean isEmpty2 = this.f63665B.isEmpty();
                    G2.f51790F = contains2;
                    G2.f51789E = isEmpty2;
                    G2.f51793I = true;
                    G2.f51786B = this.f63667D;
                    G2.f51787C = this.f63668E;
                    B(this.f63677N, G2, this.f63666C);
                }
            }
            if (this.f63673J.f51846C) {
                B(this.f63670G, this.f63673J, this.f63690a);
            }
            if (((Boolean) AnonymousClass0CC.AF.G()).booleanValue()) {
            }
            Integer num2 = this.f63675L;
            B(new AnonymousClass35R(AnonymousClass35Q.COMMENTS, this.f63675L, this.f63688Y), null, this.f63676M);
            m26598N(this.f63670G.rB.C().f11811B, true, false);
            if (this.f63693d) {
                B(this.f63695f, null, this.f63694e);
            }
            List list2 = this.f63665B;
            if (AnonymousClass5Rz.m26592D(this)) {
            }
            m26598N(list2, false, i ^ true);
            if (this.f63692c) {
                A(this.f63684U, this.f63683T);
            }
            m26598N(this.f63670G.rB.C().f11811B, false, true);
            if (AnonymousClass0Gk.K(this.f63670G, this.f63678O)) {
                B(this.f63670G, new AnonymousClass1bL(this.f63689Z, this.f63678O), this.f63679P);
            }
        }
        E();
    }

    /* renamed from: N */
    public final void m26598N(List list, boolean z, boolean z2) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass0SK anonymousClass0SK = (AnonymousClass0SK) list.get(z ? (size - i) - 1 : i);
            AnonymousClass4EO G = G(anonymousClass0SK);
            boolean contains = this.f51756F.contains(anonymousClass0SK);
            boolean E = AnonymousClass5Rz.m26593E(list, anonymousClass0SK, z2);
            G.f51790F = contains;
            G.f51789E = E;
            G.f51793I = false;
            G.f51786B = this.f63667D;
            G.f51787C = this.f63668E;
            B(anonymousClass0SK, G, this.f63666C);
            if ((anonymousClass0SK.f4885E > 0 ? 1 : null) != null) {
                List B = AnonymousClass4EI.B(Collections.unmodifiableList(anonymousClass0SK.C().f26518I));
                boolean isEmpty = B.isEmpty();
                Object obj = 1;
                if (B.size() <= 1) {
                    obj = null;
                }
                if (anonymousClass0SK.C().f26512C) {
                    if (anonymousClass0SK.C().f26511B || !isEmpty) {
                        B(anonymousClass0SK, AnonymousClass4Eo.Previous, this.f63674K);
                    } else {
                        B(anonymousClass0SK, AnonymousClass4Eo.Initial, this.f63674K);
                    }
                } else if (obj != null) {
                    B(anonymousClass0SK, AnonymousClass4Eo.Hide, this.f63674K);
                }
                AnonymousClass5Rz.m26594F(this, anonymousClass0SK);
                AnonymousClass5Rz.m26591C(this, list, B, z2);
                if (anonymousClass0SK.C().f26511B) {
                    B(anonymousClass0SK, AnonymousClass4Eo.More, this.f63674K);
                }
            } else {
                AnonymousClass5Rz.m26594F(this, anonymousClass0SK);
            }
        }
    }

    /* renamed from: O */
    public final int m26599O() {
        int i = 0;
        while (i < getCount()) {
            if ((getItem(i) instanceof AnonymousClass0SK) && !((AnonymousClass0SK) getItem(i)).equals(this.f63677N)) {
                return i;
            }
            i++;
        }
        return getCount();
    }

    /* renamed from: P */
    public final void m26600P(AnonymousClass0P7 anonymousClass0P7, int i, int i2) {
        if (!anonymousClass0P7.equals(this.f63670G)) {
            this.f63670G = anonymousClass0P7;
            AnonymousClass0m3 anonymousClass0m3 = new AnonymousClass0m3(this.f63670G);
            this.f63672I = anonymousClass0m3;
            anonymousClass0m3.f9717z = 0;
            this.f63672I.f9715x = AnonymousClass0a4.COMMENTS_VIEW;
        }
        this.f63689Z = i;
        this.f63678O = i2;
        this.f63693d = anonymousClass0P7.rB.f11801D;
        this.f63692c = anonymousClass0P7.rB.f11802E;
        this.f63667D = anonymousClass0P7.mA();
        this.f63668E = anonymousClass0P7.nA();
        if (this.f63691b && anonymousClass0P7.SA()) {
            this.f63677N = anonymousClass0P7.f4028c;
        } else {
            this.f63677N = null;
        }
        Integer num = anonymousClass0P7.f4014O;
        this.f63675L = Integer.valueOf(num == null ? 0 : num.intValue());
        this.f63688Y = anonymousClass0P7.yB;
        this.f63665B.clear();
        this.f63665B.addAll(AnonymousClass4EI.B(anonymousClass0P7.D().f11811B));
        M();
    }

    public final AnonymousClass0m3 RO(AnonymousClass0P7 anonymousClass0P7) {
        return this.f63672I;
    }

    public final void Tc() {
        this.f63686W = false;
    }

    public final void cH() {
        M();
    }

    public final void fNA(AnonymousClass0jx anonymousClass0jx) {
        this.f63687X.B(anonymousClass0jx);
    }
}
