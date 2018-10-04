package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.19E */
public final class AnonymousClass19E extends AnonymousClass0Iw {
    /* renamed from: B */
    public final String f15096B;
    /* renamed from: C */
    public final AnonymousClass0TH f15097C;
    /* renamed from: D */
    public final Context f15098D;
    /* renamed from: E */
    public final AnonymousClass0TG f15099E;
    /* renamed from: F */
    public final AnonymousClass0TD f15100F;
    /* renamed from: G */
    public final AnonymousClass0o1 f15101G;
    /* renamed from: H */
    public final boolean f15102H;
    /* renamed from: I */
    public final AnonymousClass0Cm f15103I;
    /* renamed from: J */
    public final /* synthetic */ AnonymousClass0T6 f15104J;
    /* renamed from: K */
    private final AnonymousClass0Fz f15105K;

    public AnonymousClass19E(AnonymousClass0T6 anonymousClass0T6, Context context, AnonymousClass0Fz anonymousClass0Fz, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0TD anonymousClass0TD, boolean z, String str, AnonymousClass0TG anonymousClass0TG, AnonymousClass0TH anonymousClass0TH, AnonymousClass0o1 anonymousClass0o1) {
        this.f15104J = anonymousClass0T6;
        this.f15098D = context;
        this.f15105K = anonymousClass0Fz;
        this.f15097C = anonymousClass0TH;
        this.f15100F = anonymousClass0TD;
        this.f15103I = anonymousClass0Cm;
        this.f15102H = z;
        this.f15096B = str;
        this.f15099E = anonymousClass0TG;
        this.f15101G = anonymousClass0o1;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.m5859I(this, 605483335);
        if (this.f15102H) {
            AnonymousClass0T6.m4461O(this.f15104J, this.f15098D, this.f15105K, this.f15103I, this.f15100F, false, this.f15096B, this.f15099E, this.f15097C, this.f15101G);
        }
        AnonymousClass0cQ.m5858H(this, -1969790117, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.m5859I(this, 321017019);
        AnonymousClass199 anonymousClass199 = (AnonymousClass199) obj;
        int I2 = AnonymousClass0cQ.m5859I(this, 2062308337);
        if (this.f15101G.isEmpty()) {
            AnonymousClass0TH anonymousClass0TH = this.f15097C;
            anonymousClass0TH.f5128F.clear();
            anonymousClass0TH.f5126D.A();
        } else {
            int size;
            AnonymousClass0TH anonymousClass0TH2 = this.f15097C;
            AnonymousClass0o1 anonymousClass0o1 = this.f15101G;
            anonymousClass0TH2.f5128F.clear();
            Comparator anonymousClass0oB = new AnonymousClass0oB(anonymousClass0TH2.f5125C.f10227C, anonymousClass0TH2.f5127E);
            Collection arrayList = new ArrayList(anonymousClass0o1.size());
            List<AnonymousClass0o2> cM = anonymousClass0o1.cM();
            if (cM.size() <= 1 || !((Boolean) AnonymousClass0CC.gZ.m846H(anonymousClass0TH2.f5130H)).booleanValue()) {
                for (AnonymousClass0o2 CI : cM) {
                    arrayList.add(anonymousClass0o1.CI(CI).get(0));
                }
                size = arrayList.size();
            } else {
                for (AnonymousClass0o2 CI2 : cM) {
                    arrayList.addAll(anonymousClass0o1.CI(CI2));
                }
                Collections.sort(arrayList, anonymousClass0oB);
                size = 1;
            }
            AnonymousClass0o1 anonymousClass0oC = new AnonymousClass0oC();
            anonymousClass0oC.f10237B.addAll(arrayList);
            AnonymousClass5rJ anonymousClass5rJ = anonymousClass0TH2.f5126D;
            Context context = anonymousClass0TH2.f5124B.getContext();
            String str = anonymousClass0TH2.f5130H.f1759C;
            AnonymousClass0TE anonymousClass0TE = anonymousClass0TH2.f5129G;
            boolean z = false;
            anonymousClass5rJ.f69426C = false;
            List<AnonymousClass3ai> CI3 = anonymousClass0oC.CI(anonymousClass0TE);
            if (CI3 != null && !CI3.isEmpty()) {
                size = Math.min(size, CI3.size());
                for (AnonymousClass3ai anonymousClass3ai : CI3) {
                    if (size <= 0) {
                        break;
                    }
                    String str2 = anonymousClass5rJ.f69431H;
                    if (str2 != null) {
                        if (str2.equals(anonymousClass3ai.FQ())) {
                            z = AnonymousClass5rJ.B(anonymousClass5rJ, anonymousClass0TH2, anonymousClass3ai, context, str);
                            break;
                        }
                    } else if (AnonymousClass5rJ.B(anonymousClass5rJ, anonymousClass0TH2, anonymousClass3ai, context, str)) {
                        size--;
                        z = true;
                    }
                }
            }
            if (anonymousClass5rJ.f69429F != null && (!anonymousClass5rJ.f69426C || r9 <= 0)) {
                anonymousClass5rJ.f69429F.ws(null);
            }
            if (!z) {
                AnonymousClass3ac anonymousClass3ac = anonymousClass5rJ.f69428E;
                if (anonymousClass3ac != null) {
                    anonymousClass3ac.ns();
                }
            }
        }
        AnonymousClass0cQ.m5858H(this, -1707006673, I2);
        AnonymousClass0cQ.m5858H(this, -1165930049, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        Object obj2 = obj;
        int I = AnonymousClass0cQ.m5859I(this, 311678265);
        AnonymousClass199 anonymousClass199 = (AnonymousClass199) obj2;
        int I2 = AnonymousClass0cQ.m5859I(this, 1332850004);
        if (!this.f15102H) {
            AnonymousClass0Cm anonymousClass0Cm = r9.f15103I;
            String str = r9.f15096B;
            long currentTimeMillis = System.currentTimeMillis();
            Long l = anonymousClass199.f15082C;
            long longValue = l != null ? l.longValue() : AnonymousClass199.f15080D;
            AnonymousClass0HV.m2008D(anonymousClass0Cm).f2646B.edit().putLong(AnonymousClass0HV.m2009E(str), currentTimeMillis).apply();
            if (longValue != AnonymousClass199.f15080D) {
                AnonymousClass0HV.m2008D(anonymousClass0Cm).f2646B.edit().putLong(AnonymousClass0HV.m2010F(str), TimeUnit.SECONDS.toMillis(longValue)).apply();
            }
        }
        long F = AnonymousClass5qG.F(r9.f15103I, r9.f15096B);
        List<AnonymousClass0o2> C = AnonymousClass0TF.m4479C(r9.f15100F);
        List<AnonymousClass0o3> arrayList = new ArrayList(C.size());
        for (AnonymousClass0o2 A : C) {
            arrayList.add(A.m7674A());
        }
        for (AnonymousClass0o3 anonymousClass0o3 : arrayList) {
            AnonymousClass0o2 B = AnonymousClass0TF.m4478B(r9.f15100F, anonymousClass0o3);
            List<AnonymousClass19A> D = AnonymousClass0T6.m4450D(r9.f15104J, anonymousClass199, B, TimeUnit.MILLISECONDS.toSeconds(F), r9.f15103I);
            if (D != null) {
                for (AnonymousClass19A anonymousClass19A : D) {
                    AnonymousClass0TG anonymousClass0TG = r9.f15099E;
                    AnonymousClass0Cm anonymousClass0Cm2 = r9.f15103I;
                    AnonymousClass0ok anonymousClass0ok = null;
                    if (!(anonymousClass19A == null || anonymousClass19A.f15084C == null || !AnonymousClass0T6.m4451E(anonymousClass19A.f15084C.f15088C))) {
                        AnonymousClass0ok anonymousClass0ok2 = (AnonymousClass0ok) anonymousClass19A.f15084C.f15088C.get(0);
                        Collection noneOf = EnumSet.noneOf(AnonymousClass0oD.class);
                        if ((AnonymousClass0T6.m4448B(anonymousClass0ok2.f10337C, noneOf, anonymousClass0Cm2) & (AnonymousClass0T6.m4448B(anonymousClass0ok2.f10339E, noneOf, anonymousClass0Cm2) & AnonymousClass0T6.m4448B(anonymousClass0ok2.f10340F, noneOf, anonymousClass0Cm2))) != 0) {
                            if (anonymousClass0TG.f5120B.containsAll(noneOf)) {
                                anonymousClass0ok = anonymousClass0ok2;
                            }
                        }
                    }
                    if (anonymousClass0ok != null) {
                        long longValue2 = anonymousClass19A.m9651A() != null ? anonymousClass19A.m9651A().longValue() : anonymousClass19A.f15083B != null ? TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + anonymousClass19A.f15083B.longValue() : 0;
                        AnonymousClass0oj A2 = r9.f15104J.f5092E.m4468A(r9.f15103I.f1759C, anonymousClass19A.f15084C.f15093H);
                        if (A2 == null) {
                            A2 = new AnonymousClass0oj(r9.f15103I.f1759C, anonymousClass19A.f15084C.f15093H, longValue2);
                            r9.f15104J.f5092E.f5094C.m4473A(A2);
                        }
                        if (!r9.f15104J.f5089B) {
                            boolean z;
                            boolean booleanValue;
                            AnonymousClass19O B2;
                            boolean z2;
                            AnonymousClass0db C2;
                            String str2;
                            AnonymousClass0EE anonymousClass0EE = r9.f15104J;
                            Context context = r9.f15098D;
                            AnonymousClass19C anonymousClass19C = anonymousClass19A.f15084C;
                            boolean z3 = false;
                            if (!(anonymousClass19C.f15092G == null || anonymousClass19C.f15092G.intValue() == 0)) {
                                int size;
                                int intValue = anonymousClass19C.f15092G.intValue();
                                synchronized (A2) {
                                    size = A2.f10328B.size();
                                }
                                if (intValue <= size) {
                                    z = false;
                                    booleanValue = ((Boolean) AnonymousClass0E6.m1317C(AnonymousClass0CC.pZ)).booleanValue();
                                    if (anonymousClass19C.f15087B != null && booleanValue) {
                                        B2 = AnonymousClass19M.m9662B(context, anonymousClass19C.f15087B);
                                        if (B2 != null) {
                                            if (B2.GHA(anonymousClass0EE.f5092E, A2)) {
                                                z2 = false;
                                                C2 = AnonymousClass0db.m6067C();
                                                C2.m6076I("impressions_pass", z).m6076I("contextual_filters_pass", z2);
                                                str2 = (z || !z2) ? "ig_qp_local_filters_failed" : "ig_qp_local_filters_succeeded";
                                                AnonymousClass0T6.m4453G(AnonymousClass0NN.m3291B(str2, anonymousClass0EE).m3296D("eligibility", C2), B, anonymousClass19C.f15093H, false);
                                                if (z && z2) {
                                                    z3 = true;
                                                }
                                                if (!z3) {
                                                }
                                            }
                                        }
                                    }
                                    z2 = true;
                                    C2 = AnonymousClass0db.m6067C();
                                    C2.m6076I("impressions_pass", z).m6076I("contextual_filters_pass", z2);
                                    if (z) {
                                    }
                                    AnonymousClass0T6.m4453G(AnonymousClass0NN.m3291B(str2, anonymousClass0EE).m3296D("eligibility", C2), B, anonymousClass19C.f15093H, false);
                                    z3 = true;
                                    if (z3) {
                                    }
                                }
                            }
                            z = true;
                            booleanValue = ((Boolean) AnonymousClass0E6.m1317C(AnonymousClass0CC.pZ)).booleanValue();
                            B2 = AnonymousClass19M.m9662B(context, anonymousClass19C.f15087B);
                            if (B2 != null) {
                                if (B2.GHA(anonymousClass0EE.f5092E, A2)) {
                                    z2 = false;
                                    C2 = AnonymousClass0db.m6067C();
                                    C2.m6076I("impressions_pass", z).m6076I("contextual_filters_pass", z2);
                                    if (z) {
                                    }
                                    AnonymousClass0T6.m4453G(AnonymousClass0NN.m3291B(str2, anonymousClass0EE).m3296D("eligibility", C2), B, anonymousClass19C.f15093H, false);
                                    z3 = true;
                                    if (z3) {
                                    }
                                }
                            }
                            z2 = true;
                            C2 = AnonymousClass0db.m6067C();
                            C2.m6076I("impressions_pass", z).m6076I("contextual_filters_pass", z2);
                            if (z) {
                            }
                            AnonymousClass0T6.m4453G(AnonymousClass0NN.m3291B(str2, anonymousClass0EE).m3296D("eligibility", C2), B, anonymousClass19C.f15093H, false);
                            z3 = true;
                            if (z3) {
                            }
                        }
                        r9.f15101G.VB(AnonymousClass0T0.m4440B(r9.f15103I.f1759C, anonymousClass0ok, anonymousClass19A.f15084C.f15094I, anonymousClass19A.f15084C.f15089D, anonymousClass19A.f15084C.f15093H, r9.f15100F, anonymousClass0o3, longValue2, anonymousClass19A.f15084C.f15092G.intValue(), anonymousClass19A.f15086E.intValue(), A2));
                    }
                }
                continue;
            }
        }
        AnonymousClass0cQ.m5858H(r9, -1518307819, I2);
        AnonymousClass0cQ.m5858H(r9, -589855416, I);
    }
}
