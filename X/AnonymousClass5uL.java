package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.C0164R;
import com.instagram.reels.fragment.ReelDashboardFragment;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.5uL */
public final class AnonymousClass5uL extends AnonymousClass0Rq {
    /* renamed from: B */
    public final List f69880B;
    /* renamed from: C */
    public final AnonymousClass5th f69881C;
    /* renamed from: D */
    public final Context f69882D;
    /* renamed from: E */
    public final AnonymousClass0qL f69883E;
    /* renamed from: F */
    public AnonymousClass0MI f69884F;
    /* renamed from: G */
    public AnonymousClass0Pj f69885G;
    /* renamed from: H */
    public AnonymousClass3bZ f69886H;
    /* renamed from: I */
    public final AnonymousClass0Cm f69887I;
    /* renamed from: J */
    public final Set f69888J;
    /* renamed from: K */
    public final AnonymousClass5uM f69889K;
    /* renamed from: L */
    private final AnonymousClass5tq f69890L;
    /* renamed from: M */
    private final boolean f69891M = AnonymousClass0J0.D(this.f69887I);
    /* renamed from: N */
    private final AnonymousClass2Lm f69892N;
    /* renamed from: O */
    private final AnonymousClass0Ro f69893O;
    /* renamed from: P */
    private final AnonymousClass5u9 f69894P;
    /* renamed from: Q */
    private final AnonymousClass0Tj f69895Q = AnonymousClass0Tj.B(this.f69887I);
    /* renamed from: R */
    private final AnonymousClass5uC f69896R;
    /* renamed from: S */
    private final AnonymousClass5uZ f69897S;
    /* renamed from: T */
    private final AnonymousClass5uF f69898T;
    /* renamed from: U */
    private final AnonymousClass5uK f69899U;

    public AnonymousClass5uL(Context context, ReelDashboardFragment reelDashboardFragment, AnonymousClass0Ro anonymousClass0Ro, AnonymousClass0Cm anonymousClass0Cm) {
        this.f69882D = context;
        this.f69887I = anonymousClass0Cm;
        this.f69897S = new AnonymousClass5uZ(context, reelDashboardFragment);
        this.f69898T = new AnonymousClass5uF(context, reelDashboardFragment);
        this.f69890L = new AnonymousClass5tq(context, reelDashboardFragment);
        this.f69894P = new AnonymousClass5u9(context, anonymousClass0Cm);
        this.f69896R = new AnonymousClass5uC(anonymousClass0Cm, reelDashboardFragment);
        this.f69899U = new AnonymousClass5uK(anonymousClass0Cm);
        this.f69889K = new AnonymousClass5uM(context, this.f69887I, reelDashboardFragment);
        this.f69881C = new AnonymousClass5th(context, reelDashboardFragment);
        this.f69892N = new AnonymousClass2Lm(context);
        AnonymousClass0qL anonymousClass0qL = new AnonymousClass0qL(context);
        this.f69883E = anonymousClass0qL;
        anonymousClass0qL.f10915C = context.getResources().getDimensionPixelSize(C0164R.dimen.reel_dashboard_viewer_row_padding);
        this.f69893O = anonymousClass0Ro;
        this.f69888J = new LinkedHashSet();
        this.f69880B = new ArrayList();
        D(new AnonymousClass0TB[]{this.f69897S, this.f69898T, this.f69894P, this.f69896R, this.f69899U, this.f69890L, this.f69889K, this.f69881C, this.f69892N, this.f69883E});
    }

    /* renamed from: B */
    public static void m28626B(AnonymousClass5uL anonymousClass5uL, int i) {
        anonymousClass5uL.m28629E(i, null);
    }

    /* renamed from: C */
    public static boolean m28627C(AnonymousClass5uL anonymousClass5uL, AnonymousClass0Ci anonymousClass0Ci) {
        return anonymousClass5uL.f69891M && AnonymousClass1Pw.L(anonymousClass5uL.f69895Q, anonymousClass0Ci);
    }

    /* renamed from: D */
    public static void m28628D(AnonymousClass5uL anonymousClass5uL) {
        AnonymousClass0Pj anonymousClass0Pj;
        AnonymousClass0P7 anonymousClass0P7;
        Object obj;
        anonymousClass5uL.C();
        AnonymousClass0HV D = AnonymousClass0HV.D(anonymousClass5uL.f69887I);
        String string = D.f2646B.getString("multi_author_story_viewers_list_megaphone_item_id", null);
        AnonymousClass3bZ anonymousClass3bZ = anonymousClass5uL.f69886H;
        if (!(anonymousClass3bZ == null || anonymousClass5uL.f69885G == null || !anonymousClass3bZ.f42655D || D.f2646B.getBoolean("dismissed_multi_author_story_viewers_list_megaphone", false) || (string != null && !string.equals(anonymousClass5uL.f69885G.getId())))) {
            if (string == null) {
                D.f2646B.edit().putString("multi_author_story_viewers_list_megaphone_item_id", anonymousClass5uL.f69885G.getId()).apply();
            }
            if (anonymousClass5uL.f69886H.f42656E == null) {
                anonymousClass5uL.f69886H.f42656E = AnonymousClass5ue.m28632B(anonymousClass5uL.f69882D, anonymousClass5uL.f69885G);
            }
            anonymousClass5uL.A(anonymousClass5uL.f69886H, anonymousClass5uL.f69897S);
        }
        if (AnonymousClass0Co.B(anonymousClass5uL.f69887I)) {
            anonymousClass0Pj = anonymousClass5uL.f69885G;
            if (anonymousClass0Pj != null && anonymousClass0Pj.i()) {
                AnonymousClass3bZ anonymousClass3bZ2 = new AnonymousClass3bZ(AnonymousClass3bY.INTERNAL_ONLY_MEDIA_FYI);
                anonymousClass3bZ2.f42656E = anonymousClass5uL.f69882D.getResources().getString(C0164R.string.viewer_list_internal_only_media_megaphone_title);
                anonymousClass5uL.A(anonymousClass3bZ2, anonymousClass5uL.f69897S);
            }
        }
        anonymousClass0Pj = anonymousClass5uL.f69885G;
        if (!(anonymousClass0Pj == null || anonymousClass0Pj.f4134F == null || !anonymousClass5uL.f69885G.Z())) {
            anonymousClass3bZ = new AnonymousClass3bZ(AnonymousClass3bY.FRIENDS_STICKER);
            anonymousClass3bZ.f42654C = anonymousClass5uL.f69885G.f4134F.EA();
            anonymousClass5uL.A(anonymousClass3bZ, anonymousClass5uL.f69897S);
        }
        anonymousClass0Pj = anonymousClass5uL.f69885G;
        if (anonymousClass0Pj == null || !anonymousClass0Pj.l()) {
            anonymousClass0P7 = null;
        } else {
            anonymousClass0P7 = anonymousClass5uL.f69885G.f4134F;
        }
        if (!((Boolean) AnonymousClass0CC.WN.H(anonymousClass5uL.f69887I)).booleanValue() || anonymousClass0P7 == null || anonymousClass0P7.pC == null || anonymousClass0P7.pC.f28125E == null || anonymousClass0P7.pC.f28125E.isEmpty()) {
            obj = null;
        } else {
            int J = AnonymousClass0Nm.J(anonymousClass5uL.f69882D);
            int dimensionPixelOffset = anonymousClass5uL.f69882D.getResources().getDimensionPixelOffset(C0164R.dimen.feedback_list_size);
            List list = anonymousClass0P7.pC.f28125E;
            anonymousClass5uL.m28629E(C0164R.string.reel_dashboard_feedback_section_title, dimensionPixelOffset * list.size() > J ? new AnonymousClass5tg(AnonymousClass5tn.FEEDBACK_RESULT_SEE_ALL, anonymousClass5uL.f69882D.getResources().getString(C0164R.string.see_all), anonymousClass5uL.f69885G) : null);
            anonymousClass5uL.A(list, anonymousClass5uL.f69890L);
            obj = 1;
        }
        if (!(anonymousClass0P7 == null || anonymousClass0P7.TC == null || anonymousClass0P7.TC.isEmpty())) {
            anonymousClass5uL.A(anonymousClass5uL.f69885G, anonymousClass5uL.f69894P);
            AnonymousClass1If anonymousClass1If = (AnonymousClass1If) anonymousClass0P7.TC.get(0);
            List<AnonymousClass1Ih> list2 = anonymousClass1If.f16898E;
            if (!list2.isEmpty()) {
                anonymousClass5uL.A(new AnonymousClass5tg(AnonymousClass5tn.POLL_RESULT_SHARE, anonymousClass5uL.f69882D.getResources().getString(C0164R.string.polling_share_results_label), anonymousClass5uL.f69885G), anonymousClass5uL.f69881C);
                String str = anonymousClass1If.f16897D;
                boolean z = anonymousClass1If.f16896C;
                AnonymousClass5uL.m28626B(anonymousClass5uL, C0164R.string.reel_dashboard_poll_section_title);
                anonymousClass5uL.A(null, anonymousClass5uL.f69883E);
                for (AnonymousClass1Ih anonymousClass1Ih : list2) {
                    AnonymousClass1Zo anonymousClass1Zo = new AnonymousClass1Zo(anonymousClass5uL.f69884F, anonymousClass5uL.f69885G, anonymousClass1Ih.f16899B, AnonymousClass5uL.m28627C(anonymousClass5uL, anonymousClass1Ih.f16899B));
                    anonymousClass1Zo.f20269D = str;
                    anonymousClass1Zo.f20270E = Integer.valueOf(anonymousClass1Ih.f16900C);
                    anonymousClass5uL.A(anonymousClass1Zo, anonymousClass5uL.f69889K);
                }
                if (z) {
                    anonymousClass5uL.A(new AnonymousClass5tg(AnonymousClass5tn.POLL_RESULT_SEE_ALL, anonymousClass5uL.f69882D.getResources().getString(C0164R.string.see_all), anonymousClass5uL.f69885G), anonymousClass5uL.f69881C);
                } else {
                    anonymousClass5uL.A(null, anonymousClass5uL.f69883E);
                }
                obj = 1;
            }
        }
        AnonymousClass1IU B = AnonymousClass5BR.m25941B(anonymousClass5uL.f69885G);
        if (!(B == null || B.f16883I.isEmpty())) {
            int size = B.f16883I.size();
            J = anonymousClass5uL.f69882D.getResources().getDimensionPixelSize(C0164R.dimen.question_response_card_width);
            dimensionPixelOffset = AnonymousClass0Nm.J(anonymousClass5uL.f69882D);
            if (!B.f16878D) {
                if (size * J <= dimensionPixelOffset) {
                    AnonymousClass5uL.m28626B(anonymousClass5uL, C0164R.string.reel_dashboard_question_responses_section_title);
                    anonymousClass5uL.A(anonymousClass5uL.f69885G, anonymousClass5uL.f69896R);
                    obj = 1;
                }
            }
            anonymousClass5uL.m28629E(C0164R.string.reel_dashboard_question_responses_section_title, new AnonymousClass5tg(AnonymousClass5tn.QUESTION_RESULT_SEE_ALL, anonymousClass5uL.f69882D.getResources().getString(C0164R.string.see_all), anonymousClass5uL.f69885G));
            anonymousClass5uL.A(anonymousClass5uL.f69885G, anonymousClass5uL.f69896R);
            obj = 1;
        }
        if (!(anonymousClass0P7 == null || anonymousClass0P7.ZC == null || anonymousClass0P7.ZC.isEmpty())) {
            anonymousClass5uL.A(anonymousClass5uL.f69885G, anonymousClass5uL.f69899U);
            AnonymousClass1L9 anonymousClass1L9 = (AnonymousClass1L9) anonymousClass0P7.ZC.get(0);
            if (!anonymousClass1L9.f17292E.isEmpty()) {
                AnonymousClass1Zo anonymousClass1Zo2;
                AnonymousClass5uL.m28626B(anonymousClass5uL, C0164R.string.reel_dashboard_slider_results_section_title);
                anonymousClass5uL.A(null, anonymousClass5uL.f69883E);
                AnonymousClass2GU Q = AnonymousClass0f4.B(anonymousClass5uL.f69887I).Q(((AnonymousClass0ZF) anonymousClass5uL.f69885G.N(AnonymousClass15c.SLIDER).get(0)).f6312T);
                for (AnonymousClass1LB anonymousClass1LB : anonymousClass1L9.f17292E) {
                    if (Q == null || !anonymousClass1LB.f17294C.getId().equals(Q.f28303D.f17294C.getId())) {
                        anonymousClass1Zo2 = new AnonymousClass1Zo(anonymousClass5uL.f69884F, anonymousClass5uL.f69885G, anonymousClass1LB.f17294C, AnonymousClass5uL.m28627C(anonymousClass5uL, anonymousClass1LB.f17294C));
                        anonymousClass1Zo2.f20274I = anonymousClass1L9.f17291D;
                        anonymousClass1Zo2.f20275J = Float.valueOf(anonymousClass1LB.f17293B);
                        anonymousClass5uL.A(anonymousClass1Zo2, anonymousClass5uL.f69889K);
                    }
                }
                if (Q != null) {
                    AnonymousClass1LB anonymousClass1LB2 = Q.f28303D;
                    anonymousClass1Zo2 = new AnonymousClass1Zo(anonymousClass5uL.f69884F, anonymousClass5uL.f69885G, anonymousClass1LB2.f17294C, AnonymousClass5uL.m28627C(anonymousClass5uL, anonymousClass1LB2.f17294C));
                    anonymousClass1Zo2.f20274I = anonymousClass1L9.f17291D;
                    anonymousClass1Zo2.f20275J = Float.valueOf(anonymousClass1LB2.f17293B);
                    anonymousClass5uL.A(anonymousClass1Zo2, anonymousClass5uL.f69889K);
                }
                if (anonymousClass1L9.f17289B) {
                    anonymousClass5uL.A(new AnonymousClass5tg(AnonymousClass5tn.SLIDER_RESULT_SEE_ALL, anonymousClass5uL.f69882D.getResources().getString(C0164R.string.see_all), anonymousClass5uL.f69885G), anonymousClass5uL.f69881C);
                } else {
                    anonymousClass5uL.A(null, anonymousClass5uL.f69883E);
                }
            }
            obj = 1;
        }
        if (obj != null) {
            AnonymousClass5uL.m28626B(anonymousClass5uL, C0164R.string.reel_dashboard_viewers_section_title);
        }
        if (!anonymousClass5uL.f69880B.isEmpty()) {
            anonymousClass5uL.A(null, anonymousClass5uL.f69883E);
            for (AnonymousClass1cM anonymousClass1Zo3 : anonymousClass5uL.f69880B) {
                anonymousClass5uL.A(new AnonymousClass1Zo(anonymousClass5uL.f69885G, anonymousClass1Zo3), anonymousClass5uL.f69889K);
            }
        }
        if (!anonymousClass5uL.f69888J.isEmpty()) {
            anonymousClass5uL.A(null, anonymousClass5uL.f69883E);
            for (AnonymousClass0Ci anonymousClass0Ci : anonymousClass5uL.f69888J) {
                anonymousClass5uL.A(new AnonymousClass1Zo(anonymousClass5uL.f69884F, anonymousClass5uL.f69885G, anonymousClass0Ci, AnonymousClass5uL.m28627C(anonymousClass5uL, anonymousClass0Ci)), anonymousClass5uL.f69889K);
            }
        }
        AnonymousClass0Ro anonymousClass0Ro = anonymousClass5uL.f69893O;
        if (anonymousClass0Ro != null && anonymousClass0Ro.QV()) {
            anonymousClass5uL.A(anonymousClass5uL.f69893O, anonymousClass5uL.f69892N);
        }
        anonymousClass5uL.A(null, anonymousClass5uL.f69883E);
        anonymousClass5uL.E();
    }

    /* renamed from: E */
    private void m28629E(int i, AnonymousClass5tg anonymousClass5tg) {
        int dimensionPixelSize = this.f69882D.getResources().getDimensionPixelSize(C0164R.dimen.row_padding);
        Drawable anonymousClass2Lj = new AnonymousClass2Lj(this.f69882D, 1.0f, C0164R.color.grey_2, 48);
        anonymousClass2Lj.A(dimensionPixelSize, 0, dimensionPixelSize, 0);
        A(new AnonymousClass5uE(this.f69882D.getResources().getString(i), anonymousClass2Lj, anonymousClass5tg), this.f69898T);
    }

    public final void notifyDataSetChanged() {
        E();
    }
}
