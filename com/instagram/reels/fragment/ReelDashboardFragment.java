package com.instagram.reels.fragment;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cf;
import X.AnonymousClass0Ci;
import X.AnonymousClass0Cm;
import X.AnonymousClass0EE;
import X.AnonymousClass0F4;
import X.AnonymousClass0F6;
import X.AnonymousClass0F8;
import X.AnonymousClass0G5;
import X.AnonymousClass0GA;
import X.AnonymousClass0HV;
import X.AnonymousClass0Hj;
import X.AnonymousClass0Hx;
import X.AnonymousClass0IE;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IL;
import X.AnonymousClass0IS;
import X.AnonymousClass0IU;
import X.AnonymousClass0IW;
import X.AnonymousClass0IZ;
import X.AnonymousClass0Ib;
import X.AnonymousClass0Iw;
import X.AnonymousClass0J7;
import X.AnonymousClass0Jd;
import X.AnonymousClass0Jj;
import X.AnonymousClass0LH;
import X.AnonymousClass0MB;
import X.AnonymousClass0MI;
import X.AnonymousClass0NN;
import X.AnonymousClass0Nm;
import X.AnonymousClass0OA;
import X.AnonymousClass0ON;
import X.AnonymousClass0P7;
import X.AnonymousClass0PH;
import X.AnonymousClass0Pj;
import X.AnonymousClass0Pr;
import X.AnonymousClass0Ps;
import X.AnonymousClass0Pt;
import X.AnonymousClass0Pu;
import X.AnonymousClass0Px;
import X.AnonymousClass0QP;
import X.AnonymousClass0Qe;
import X.AnonymousClass0Qf;
import X.AnonymousClass0RF;
import X.AnonymousClass0Sb;
import X.AnonymousClass0Sn;
import X.AnonymousClass0TK;
import X.AnonymousClass0Ur;
import X.AnonymousClass0ZF;
import X.AnonymousClass0bx;
import X.AnonymousClass0bz;
import X.AnonymousClass0cJ;
import X.AnonymousClass0cN;
import X.AnonymousClass0cQ;
import X.AnonymousClass0dh;
import X.AnonymousClass0e5;
import X.AnonymousClass0e6;
import X.AnonymousClass0ea;
import X.AnonymousClass0hr;
import X.AnonymousClass0kV;
import X.AnonymousClass0lG;
import X.AnonymousClass0rF;
import X.AnonymousClass0sF;
import X.AnonymousClass0xy;
import X.AnonymousClass10U;
import X.AnonymousClass114;
import X.AnonymousClass14t;
import X.AnonymousClass15c;
import X.AnonymousClass160;
import X.AnonymousClass161;
import X.AnonymousClass173;
import X.AnonymousClass174;
import X.AnonymousClass177;
import X.AnonymousClass1Iu;
import X.AnonymousClass1RC;
import X.AnonymousClass1Zo;
import X.AnonymousClass1Zv;
import X.AnonymousClass1cM;
import X.AnonymousClass2GD;
import X.AnonymousClass2GM;
import X.AnonymousClass2I0;
import X.AnonymousClass3Io;
import X.AnonymousClass3Qs;
import X.AnonymousClass3b5;
import X.AnonymousClass3bR;
import X.AnonymousClass3bY;
import X.AnonymousClass3bZ;
import X.AnonymousClass3ld;
import X.AnonymousClass3le;
import X.AnonymousClass3nM;
import X.AnonymousClass41T;
import X.AnonymousClass59U;
import X.AnonymousClass5Bo;
import X.AnonymousClass5Bp;
import X.AnonymousClass5Br;
import X.AnonymousClass5CC;
import X.AnonymousClass5tf;
import X.AnonymousClass5tn;
import X.AnonymousClass5tv;
import X.AnonymousClass5u6;
import X.AnonymousClass5u7;
import X.AnonymousClass5uL;
import X.AnonymousClass5uW;
import X.AnonymousClass5up;
import X.AnonymousClass5uq;
import X.AnonymousClass5ur;
import X.AnonymousClass5us;
import X.AnonymousClass5ut;
import X.AnonymousClass5ux;
import X.AnonymousClass5uy;
import X.AnonymousClass5uz;
import X.AnonymousClass5v2;
import X.AnonymousClass5v3;
import X.AnonymousClass5v4;
import X.AnonymousClass5v5;
import X.AnonymousClass5v6;
import X.AnonymousClass5v7;
import X.AnonymousClass5v8;
import X.AnonymousClass5v9;
import X.AnonymousClass5x4;
import X.AnonymousClass5xK;
import X.AnonymousClass6Em;
import X.AnonymousClass6En;
import X.AnonymousClass6Er;
import X.AnonymousClass6Ev;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Toast;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.pendingmedia.model.PendingRecipient;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.triangleshape.TriangleShape;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class ReelDashboardFragment extends AnonymousClass0IJ implements AnonymousClass0IS, AnonymousClass5uW, AnonymousClass0QP, AnonymousClass3b5, AnonymousClass0F8, AnonymousClass3ld, AnonymousClass2GM {
    /* renamed from: c */
    private static final String f74042c = "ReelDashboardFragment";
    /* renamed from: B */
    public AnonymousClass5Br f74043B;
    /* renamed from: C */
    public AnonymousClass0PH f74044C;
    /* renamed from: D */
    public AnonymousClass0cN f74045D;
    /* renamed from: E */
    public int f74046E;
    /* renamed from: F */
    public AnonymousClass0kV f74047F;
    /* renamed from: G */
    public boolean f74048G;
    /* renamed from: H */
    public boolean f74049H;
    /* renamed from: I */
    public final Map f74050I = new HashMap();
    /* renamed from: J */
    public AnonymousClass0MI f74051J;
    /* renamed from: K */
    public AnonymousClass3le f74052K;
    /* renamed from: L */
    public String f74053L;
    /* renamed from: M */
    public AnonymousClass14t f74054M;
    /* renamed from: N */
    public AnonymousClass5CC f74055N;
    /* renamed from: O */
    public AnonymousClass0Cm f74056O;
    /* renamed from: P */
    public boolean f74057P;
    /* renamed from: Q */
    private int f74058Q;
    /* renamed from: R */
    private int f74059R;
    /* renamed from: S */
    private boolean f74060S;
    /* renamed from: T */
    private boolean f74061T;
    /* renamed from: U */
    private final AnonymousClass0hr f74062U = new AnonymousClass0hr(new AnonymousClass5uy(this));
    /* renamed from: V */
    private AnonymousClass5tf f74063V;
    /* renamed from: W */
    private Set f74064W;
    /* renamed from: X */
    private String f74065X;
    /* renamed from: Y */
    private AnonymousClass3bR f74066Y;
    /* renamed from: Z */
    private boolean f74067Z = true;
    /* renamed from: a */
    private int f74068a;
    /* renamed from: b */
    private final Map f74069b = new HashMap();
    public TouchInterceptorFrameLayout mContainer;
    public EmptyStateView mEmptyView;
    public ReboundViewPager mImageViewPager;
    public AnonymousClass5u7 mListAdapter;
    public ReboundViewPager mListViewPager;
    public AnonymousClass5tv mPagerAdapter;
    public ReboundViewPager mScrollOwner;

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void Aq(String str) {
        this.mEmptyView.E();
        Toast.makeText(getContext(), C0164R.string.network_error, 0).show();
    }

    /* renamed from: B */
    public static void m29903B(ReelDashboardFragment reelDashboardFragment, String str, String str2, AnonymousClass5v9 anonymousClass5v9) {
        AnonymousClass0Iw anonymousClass5ux = new AnonymousClass5ux(reelDashboardFragment, str, anonymousClass5v9);
        if (reelDashboardFragment.f74046E == 1) {
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(reelDashboardFragment.f74056O);
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
            AnonymousClass0Pt L = anonymousClass0Pt.L("live/%s/get_post_live_viewers_list/", new Object[]{str});
            if (str2 != null) {
                L.D("max_id", str2);
            }
            AnonymousClass0GA H = L.M(AnonymousClass1Zv.class).H();
            H.f2849B = anonymousClass5ux;
            reelDashboardFragment.schedule(H);
            return;
        }
        Object obj = reelDashboardFragment.f74056O;
        AnonymousClass0Pt anonymousClass0Pt2 = new AnonymousClass0Pt(obj);
        anonymousClass0Pt2.f4226J = AnonymousClass0Pu.GET;
        anonymousClass0Pt2.f4229M = AnonymousClass0IE.E("media/%s/list_reel_media_viewer/", new Object[]{str.split("_")[0]});
        if (str2 != null) {
            anonymousClass0Pt2.D("max_id", str2);
        }
        AnonymousClass0RF.C(anonymousClass0Pt2, obj);
        H = anonymousClass0Pt2.M(AnonymousClass1Zv.class).H();
        H.f2849B = anonymousClass5ux;
        reelDashboardFragment.schedule(H);
    }

    /* renamed from: C */
    public static void m29904C(ReelDashboardFragment reelDashboardFragment) {
        reelDashboardFragment.mEmptyView.setVisibility(0);
        reelDashboardFragment.mEmptyView.I();
        AnonymousClass0xy.B().yIA(reelDashboardFragment.f74053L, reelDashboardFragment.f74056O, reelDashboardFragment);
        AnonymousClass0xy.B().A(reelDashboardFragment.f74053L, reelDashboardFragment.f74056O, reelDashboardFragment.getModuleName());
    }

    /* renamed from: D */
    public static RectF m29905D(ReelDashboardFragment reelDashboardFragment) {
        ReboundViewPager reboundViewPager = reelDashboardFragment.mImageViewPager;
        if (reboundViewPager != null) {
            if (reboundViewPager.getCurrentActiveView() != null) {
                int[] iArr = new int[2];
                reelDashboardFragment = reelDashboardFragment.mImageViewPager.getCurrentActiveView();
                reelDashboardFragment.getLocationInWindow(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                return new RectF((float) i, (float) i2, (float) (i + reelDashboardFragment.getWidth()), (float) (i2 + reelDashboardFragment.getHeight()));
            }
        }
        float J = ((float) AnonymousClass0Nm.J(reelDashboardFragment.getContext())) / 2.0f;
        float I = ((float) AnonymousClass0Nm.I(reelDashboardFragment.getContext())) / 2.0f;
        return new RectF(J, I, J, I);
    }

    /* renamed from: E */
    public static AnonymousClass0lG m29906E(ReelDashboardFragment reelDashboardFragment) {
        return AnonymousClass0Jd.f2931B.O(reelDashboardFragment.getActivity(), reelDashboardFragment.f74056O);
    }

    /* renamed from: F */
    public static void m29907F(ReelDashboardFragment reelDashboardFragment, View view) {
        if (!reelDashboardFragment.f74060S) {
            reelDashboardFragment.f74060S = true;
            Parcelable L = AnonymousClass0Nm.L(view);
            Bundle bundle = new Bundle();
            bundle.putString("ReelDashboardAddToStoryCameraFragment.ARGUMENTS_KEY_ENTRY_POINT", "reel_dashboard");
            bundle.putParcelable("ReelDashboardAddToStoryCameraFragment.ARGUMENTS_KEY_ENTRY_VIEW_BOUNDS", L);
            new AnonymousClass0Sn(TransparentModalActivity.class, "reel_dashboard_add_to_story_camera", bundle, reelDashboardFragment.getActivity(), reelDashboardFragment.f74056O.f1759C).B(reelDashboardFragment.getContext());
        }
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        ReboundViewPager reboundViewPager = this.mImageViewPager;
        if (reboundViewPager != this.mScrollOwner) {
            reboundViewPager.M((float) anonymousClass0cN.E(), true);
        }
    }

    public final void Fq(String str, boolean z) {
        AnonymousClass0MI D = AnonymousClass0MB.C(this.f74056O).D(this.f74053L);
        this.f74051J = D;
        if (D.V()) {
            m29920S();
        } else {
            m29913L(this);
        }
    }

    /* renamed from: G */
    public static void m29908G(ReelDashboardFragment reelDashboardFragment, int i) {
        if (i >= 0 && i < reelDashboardFragment.f74054M.P()) {
            AnonymousClass0Pj F = reelDashboardFragment.f74054M.F(i);
            if (F.f4134F != null && F.f4134F.pC != null) {
                AnonymousClass0P7 anonymousClass0P7 = F.f4134F;
                int i2 = anonymousClass0P7.pC.f28126F;
                int i3 = i2 > 0 ? 1 : 0;
                AnonymousClass0NN.B("reel_viewer_dashboard_feedback", reelDashboardFragment).B("has_light_feedback", i3).F("media_id", anonymousClass0P7.EA()).B("total_feedback_count", i2).B("total_view_count", F.X()).R();
            }
        }
    }

    /* renamed from: H */
    public static void m29909H(ReelDashboardFragment reelDashboardFragment, int i) {
        if (i >= 0 && i < reelDashboardFragment.f74054M.P()) {
            AnonymousClass0Pj F = reelDashboardFragment.f74054M.F(i);
            if (!(F.f4134F == null || F.f4134F.pC == null || F.f4134F.pC.f28126F <= 0)) {
                boolean z = reelDashboardFragment.f74049H;
                AnonymousClass0NN.B("reel_viewer_dashboard_feedback_tray_scrolled", reelDashboardFragment).B("scrolled_light_feedback", z).B("scrolled_end_light_feedback", reelDashboardFragment.f74048G).R();
            }
        }
        reelDashboardFragment.f74049H = false;
        reelDashboardFragment.f74048G = false;
    }

    /* renamed from: I */
    public static void m29910I(ReelDashboardFragment reelDashboardFragment) {
        AnonymousClass5tv anonymousClass5tv = reelDashboardFragment.mPagerAdapter;
        if (anonymousClass5tv != null) {
            int count = anonymousClass5tv.getCount() - 1;
            Object obj = (count == 1 && reelDashboardFragment.mPagerAdapter.getItemViewType(count) == 1 && AnonymousClass0HV.D(reelDashboardFragment.f74056O).f2646B.getInt("reel_dashboard_add_to_story_nux_seen_count", 0) < 3) ? 1 : null;
            if (obj != null) {
                View D = reelDashboardFragment.mImageViewPager.D(count);
                if (D != null) {
                    Context context = D.getContext();
                    AnonymousClass173 B = new AnonymousClass173(reelDashboardFragment.getActivity(), new AnonymousClass174(context.getString(C0164R.string.reel_dashboard_add_to_story_entry_point_label))).B(0, (int) ((((float) D.getHeight()) / 2.0f) + ((float) context.getResources().getDimensionPixelSize(C0164R.dimen.reel_dashboard_add_to_story_item_tooltip_offset))), true, D);
                    B.f14642H = AnonymousClass177.BELOW_ANCHOR;
                    B.f14646L = true;
                    B.f14639E = true;
                    B.f14636B = false;
                    B.f14640F = new AnonymousClass5uq(reelDashboardFragment);
                    B.A().C();
                }
            }
        }
    }

    /* renamed from: J */
    public static void m29911J(ReelDashboardFragment reelDashboardFragment) {
        if (reelDashboardFragment.m29919R()) {
            reelDashboardFragment.getActivity().onBackPressed();
        }
    }

    /* renamed from: K */
    public static void m29912K(ReelDashboardFragment reelDashboardFragment, float f, RectF rectF) {
        if (reelDashboardFragment.mContainer != null) {
            double d = (double) f;
            float C = (float) AnonymousClass0dh.C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, 1.0d, 5.0d);
            reelDashboardFragment.mContainer.setScaleX(C);
            reelDashboardFragment.mContainer.setScaleY(C);
            float C2 = (float) AnonymousClass0dh.C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, (double) ((((float) (reelDashboardFragment.mContainer.getWidth() / 2)) - rectF.centerX()) * 5.0f));
            C = (float) AnonymousClass0dh.C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, (double) ((((float) (reelDashboardFragment.mContainer.getHeight() / 2)) - rectF.centerY()) * 5.0f));
            reelDashboardFragment.mContainer.setTranslationX(C2);
            reelDashboardFragment.mContainer.setTranslationY(C);
        }
    }

    /* renamed from: L */
    public static void m29913L(ReelDashboardFragment reelDashboardFragment) {
        AnonymousClass0LH.H(reelDashboardFragment.f74051J.f3384Q);
        AnonymousClass0F4.f2058E.A(AnonymousClass10U.class, reelDashboardFragment);
        reelDashboardFragment.f74054M = new AnonymousClass14t(reelDashboardFragment.f74051J, -1, false, reelDashboardFragment.f74064W);
        BaseAdapter baseAdapter = reelDashboardFragment.mPagerAdapter;
        baseAdapter.f69779D = reelDashboardFragment.f74054M;
        AnonymousClass0rF.B(baseAdapter, -1574714095);
        baseAdapter = reelDashboardFragment.mListAdapter;
        baseAdapter.f69835G = reelDashboardFragment.f74054M;
        AnonymousClass0rF.B(baseAdapter, -1416777687);
        reelDashboardFragment.mEmptyView.setVisibility(8);
        reelDashboardFragment.mImageViewPager.G(reelDashboardFragment.f74068a);
        reelDashboardFragment.mListViewPager.G(reelDashboardFragment.f74068a);
        if (reelDashboardFragment.f74067Z) {
            reelDashboardFragment.f74067Z = false;
            reelDashboardFragment.m29921T();
        }
    }

    /* renamed from: M */
    public static void m29914M(ReelDashboardFragment reelDashboardFragment) {
        reelDashboardFragment.f74051J.O();
        if (reelDashboardFragment.f74051J.V()) {
            reelDashboardFragment.m29920S();
            return;
        }
        int min = Math.min(reelDashboardFragment.mListViewPager.getCurrentRawDataIndex(), reelDashboardFragment.f74054M.P() - 1);
        float f = (float) min;
        reelDashboardFragment.mListViewPager.J(f);
        reelDashboardFragment.mImageViewPager.J(f);
        m29918Q(reelDashboardFragment, min);
    }

    /* renamed from: N */
    public static void m29915N(ReelDashboardFragment reelDashboardFragment, AnonymousClass0Ci anonymousClass0Ci) {
        AnonymousClass0J7.f2895B.Q(reelDashboardFragment.getActivity(), reelDashboardFragment.f74056O, "story_dashboard_reply", reelDashboardFragment).rQA(Collections.singletonList(new PendingRecipient(anonymousClass0Ci))).DZ();
    }

    /* renamed from: O */
    public static void m29916O(ReelDashboardFragment reelDashboardFragment, AnonymousClass0Pj anonymousClass0Pj) {
        String id;
        int A;
        if (anonymousClass0Pj.l()) {
            id = anonymousClass0Pj.f4134F.getId();
            A = anonymousClass0Pj.f4134F.TO().A();
        } else if (anonymousClass0Pj.pW()) {
            id = anonymousClass0Pj.f4131C.f4162P;
            A = AnonymousClass0ON.LIVE_REPLAY.A();
        } else {
            return;
        }
        AnonymousClass0NN.B("reel_more_action", reelDashboardFragment).F("action", "delete_post").B("reel_size", reelDashboardFragment.f74054M.G().size()).F("reel_type", reelDashboardFragment.f74051J.H()).B("reel_position", reelDashboardFragment.mListViewPager.getCurrentRawDataIndex()).F("m_pk", id).B("m_t", A).R();
    }

    public final void Od(AnonymousClass1cM anonymousClass1cM) {
        switch (anonymousClass1cM.f20622C.f3385R.eO().ordinal()) {
            case 2:
                String id = anonymousClass1cM.f20622C.f3385R.getId();
                AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(getActivity());
                anonymousClass0IZ.f2754D = AnonymousClass0Ib.f2781B.B().D(id, false, null);
                anonymousClass0IZ.B();
                return;
            case 3:
                String id2 = anonymousClass1cM.f20622C.f3385R.getId();
                AnonymousClass0IZ anonymousClass0IZ2 = new AnonymousClass0IZ(getActivity());
                anonymousClass0IZ2.f2754D = AnonymousClass3Qs.f41179B.A().m25253A(new Hashtag(id2));
                anonymousClass0IZ2.B();
                return;
            default:
                return;
        }
    }

    /* renamed from: P */
    public static void m29917P(ReelDashboardFragment reelDashboardFragment) {
        AnonymousClass5xK anonymousClass5xK = new AnonymousClass5xK(reelDashboardFragment.getContext(), reelDashboardFragment.getFragmentManager(), reelDashboardFragment.getLoaderManager());
        AnonymousClass0MI anonymousClass0MI = reelDashboardFragment.f74051J;
        anonymousClass5xK.f70285B = reelDashboardFragment;
        anonymousClass5xK.f70290G = anonymousClass0MI.F().size();
        AnonymousClass0EE anonymousClass0EE = anonymousClass5xK.f70285B;
        AnonymousClass0NN.B("reel_more_action", anonymousClass0EE).F("action", "'save_whole_story'").B("'reel_size'", anonymousClass5xK.f70290G).R();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("android.resource://");
        stringBuilder.append(anonymousClass5xK.f70286C.getPackageName());
        stringBuilder.append("/raw/silent_static_image_audio");
        anonymousClass5xK.f70291H = stringBuilder.toString();
        AnonymousClass114.E(anonymousClass5xK.f70288E);
        AnonymousClass0Px.B(anonymousClass5xK.f70286C, anonymousClass5xK.f70289F, new AnonymousClass6Ev(anonymousClass5xK, anonymousClass5xK.f70286C, anonymousClass0MI));
    }

    /* renamed from: Q */
    public static void m29918Q(ReelDashboardFragment reelDashboardFragment, int i) {
        reelDashboardFragment = reelDashboardFragment.getTargetFragment();
        if (reelDashboardFragment instanceof ReelViewerFragment) {
            AnonymousClass14t anonymousClass14t = ((ReelViewerFragment) reelDashboardFragment).f4312I;
            if (anonymousClass14t != null) {
                anonymousClass14t.S(i);
            }
        }
    }

    /* renamed from: R */
    private boolean m29919R() {
        AnonymousClass0IU fragmentManager = getFragmentManager();
        return (fragmentManager == null || !AnonymousClass0cJ.E(fragmentManager) || getActivity() == null) ? false : true;
    }

    /* renamed from: S */
    private void m29920S() {
        if (m29919R() && !getFragmentManager().Q("ReelViewerFragment.BACK_STACK_NAME", 1)) {
            getActivity().finish();
        }
    }

    /* renamed from: T */
    private void m29921T() {
        int i = this.f74068a;
        if (i >= 0) {
            if (i < this.f74054M.P()) {
                AnonymousClass0Pj F = this.f74054M.F(this.f74068a);
                AnonymousClass0NN B = AnonymousClass0NN.B("reel_more_action", this).F("action", "viewers_list_impression").B("reel_size", this.f74054M.G().size()).F("reel_type", this.f74051J.H()).B("reel_position", this.f74068a).F("m_pk", F.getId()).B("m_t", F.I());
                AnonymousClass160 E = AnonymousClass161.E(F);
                if (E != null) {
                    B.F("poll_id", E.f14397D);
                }
                B.R();
                m29908G(this, this.f74068a);
            }
        }
    }

    public final void Tg(AnonymousClass0MI anonymousClass0MI, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        AnonymousClass0MI anonymousClass0MI2 = anonymousClass0MI;
        List singletonList = Collections.singletonList(anonymousClass0MI);
        AnonymousClass3bR anonymousClass3bR = this.f74066Y;
        anonymousClass3bR.f42625M = this.f74065X;
        GradientSpinnerAvatarView gradientSpinnerAvatarView2 = gradientSpinnerAvatarView;
        anonymousClass3bR.f42622J = new AnonymousClass41T(gradientSpinnerAvatarView.getAvatarBounds(), new AnonymousClass5us(this));
        anonymousClass3bR.C(gradientSpinnerAvatarView2, anonymousClass0MI2, singletonList, singletonList, singletonList, AnonymousClass0Qf.REEL_VIEWER_LIST, null, null);
    }

    /* renamed from: U */
    private void m29922U(int i) {
        if (Z() instanceof AnonymousClass0Hj) {
            ((AnonymousClass0Hj) Z()).CSA(i);
        }
    }

    public final void Uv(AnonymousClass2GD anonymousClass2GD) {
        this.f74063V.m28609A(anonymousClass2GD);
    }

    public final void aGA(AnonymousClass1Zo anonymousClass1Zo) {
        AnonymousClass0bx C = AnonymousClass0bx.C(this.f74056O, anonymousClass1Zo.f20276K.getId(), "reel_dashboard_user");
        C.f6906F = getModuleName();
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(getActivity());
        anonymousClass0IZ.f2754D = AnonymousClass0Jj.f2938B.B().D(C.A());
        anonymousClass0IZ.B();
    }

    /* renamed from: b */
    public final void m29923b() {
        AnonymousClass5u7 anonymousClass5u7 = this.mListAdapter;
        AnonymousClass5u6 anonymousClass5u6 = (AnonymousClass5u6) anonymousClass5u7.f69832D.get(AnonymousClass0HV.D(anonymousClass5u7.f69838J).f2646B.getString("multi_author_story_viewers_list_megaphone_item_id", null));
        if (anonymousClass5u6 != null) {
            AnonymousClass5uL anonymousClass5uL = anonymousClass5u6.f69801B;
            AnonymousClass0HV.D(anonymousClass5uL.f69887I).f2646B.edit().putBoolean("dismissed_multi_author_story_viewers_list_megaphone", true).apply();
            AnonymousClass5uL.m28628D(anonymousClass5uL);
        }
    }

    /* renamed from: c */
    public final void m29924c(View view, AnonymousClass5tn anonymousClass5tn, AnonymousClass0Pj anonymousClass0Pj) {
        AnonymousClass0IZ anonymousClass0IZ;
        String str;
        String id;
        AnonymousClass0IL anonymousClass6En;
        Bundle bundle;
        switch (anonymousClass5tn.ordinal()) {
            case 0:
                if (!(anonymousClass0Pj.f4134F == null || anonymousClass0Pj.f4134F.pC == null)) {
                    AnonymousClass0NN.B("reel_tap_light_feedback_expand", this).B("total_feedback_count", anonymousClass0Pj.f4134F.pC.f28126F).R();
                }
                anonymousClass0IZ = new AnonymousClass0IZ(getActivity());
                AnonymousClass0Jd.f2931B.H();
                str = anonymousClass0Pj.f4136H;
                id = anonymousClass0Pj.getId();
                anonymousClass6En = new AnonymousClass6En();
                bundle = new Bundle();
                bundle.putString("ReelFeedbackRepliesListFragment.REEL_ID", str);
                bundle.putString("ReelFeedbackRepliesListFragment.REEL_ITEM_ID", id);
                anonymousClass6En.setArguments(bundle);
                anonymousClass0IZ.f2754D = anonymousClass6En;
                anonymousClass0IZ.B();
                return;
            case 1:
                AnonymousClass0NN.B("reel_more_action", this).F("action", "poll_result_see_all_click").B("reel_size", this.f74054M.G().size()).F("reel_type", this.f74051J.H()).B("reel_position", this.mListViewPager.getCurrentRawDataIndex()).F("m_pk", anonymousClass0Pj.getId()).B("m_t", anonymousClass0Pj.I()).F("poll_id", AnonymousClass161.E(anonymousClass0Pj).f14397D).R();
                anonymousClass0IZ = new AnonymousClass0IZ(getActivity());
                AnonymousClass0Jd.f2931B.H();
                str = anonymousClass0Pj.f4136H;
                id = anonymousClass0Pj.getId();
                anonymousClass6En = new ReelPollVotersTabbedFragment();
                bundle = new Bundle();
                bundle.putString("ReelPollVotersListFragment.REEL_ID", str);
                bundle.putString("ReelPollVotersListFragment.REEL_ITEM_ID", id);
                anonymousClass6En.setArguments(bundle);
                anonymousClass0IZ.f2754D = anonymousClass6En;
                anonymousClass0IZ.B();
                return;
            case 2:
                RectF L = AnonymousClass0Nm.L(view);
                AnonymousClass0Ur anonymousClass0Ur = new AnonymousClass0Ur(getContext());
                anonymousClass0Ur.A(getString(C0164R.string.loading));
                AnonymousClass0GA D = AnonymousClass1RC.D(getContext(), anonymousClass0Pj.f4134F, false, f74042c);
                D.f9990B = new AnonymousClass5ut(this, anonymousClass0Ur, L, anonymousClass0Pj);
                schedule(D);
                return;
            case 3:
                AnonymousClass0IZ anonymousClass0IZ2 = new AnonymousClass0IZ(getActivity());
                anonymousClass0IZ2.f2754D = AnonymousClass0Jd.f2931B.H().A(anonymousClass0Pj.f4136H, anonymousClass0Pj.getId());
                anonymousClass0IZ2.B();
                return;
            case 4:
                AnonymousClass0NN.B("reel_more_action", this).F("action", "slider_result_see_all_click").B("reel_size", this.f74054M.G().size()).F("reel_type", this.f74051J.H()).B("reel_position", this.mListViewPager.getCurrentRawDataIndex()).F("m_pk", anonymousClass0Pj.getId()).B("m_t", anonymousClass0Pj.I()).F("slider_id", ((AnonymousClass0ZF) anonymousClass0Pj.N(AnonymousClass15c.SLIDER).get(0)).f6312T.f15068E).R();
                anonymousClass0IZ = new AnonymousClass0IZ(getActivity());
                AnonymousClass0Jd.f2931B.H();
                str = anonymousClass0Pj.f4136H;
                id = anonymousClass0Pj.getId();
                anonymousClass6En = new AnonymousClass6Er();
                bundle = new Bundle();
                bundle.putString("ReelSliderVotersListFragment.REEL_ID", str);
                bundle.putString("ReelSliderVotersListFragment.REEL_ITEM_ID", id);
                anonymousClass6En.setArguments(bundle);
                anonymousClass0IZ.f2754D = anonymousClass6En;
                anonymousClass0IZ.B();
                return;
            default:
                throw new UnsupportedOperationException("Unknown CTA type");
        }
    }

    /* renamed from: d */
    public final void m29925d(AnonymousClass3bZ anonymousClass3bZ) {
        if (anonymousClass3bZ.f42657F == AnonymousClass3bY.FRIENDS_STICKER && anonymousClass3bZ.f42654C != null) {
            AnonymousClass0Jd.f2931B.H();
            String str = anonymousClass3bZ.f42654C;
            AnonymousClass0IL friendListEligibleViewersFragment = new FriendListEligibleViewersFragment();
            Bundle bundle = new Bundle();
            bundle.putString("FriendListEligibleViewersFragment.MEDIA_ID", str);
            friendListEligibleViewersFragment.setArguments(bundle);
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(getActivity());
            anonymousClass0IZ.f2754D = friendListEligibleViewersFragment;
            anonymousClass0IZ.B();
        } else if (anonymousClass3bZ.f42653B != null) {
            AnonymousClass0IW.T(Uri.parse(anonymousClass3bZ.f42653B), getContext());
            m29923b();
        }
    }

    public final void eDA(AnonymousClass1cM anonymousClass1cM) {
        AnonymousClass0Pj F = this.f74054M.F(this.mListViewPager.getCurrentWrappedDataIndex());
        if (this.f74043B == null) {
            this.f74043B = new AnonymousClass5Br(getContext(), this.f74056O);
        }
        AnonymousClass5Br anonymousClass5Br = this.f74043B;
        anonymousClass5Br.f61008C = new WeakReference(this);
        String name = anonymousClass1cM.f20622C.f3385R.getName();
        boolean q = F.q();
        boolean z = anonymousClass1cM.f20621B;
        OnClickListener anonymousClass5Bo = new AnonymousClass5Bo(anonymousClass5Br, anonymousClass1cM, F, this);
        if (z) {
            String string;
            if (q) {
                string = anonymousClass5Br.f61007B.getString(C0164R.string.unhide_video_from_multi_author_story_title);
            } else {
                string = anonymousClass5Br.f61007B.getString(C0164R.string.unhide_photo_from_multi_author_story_title);
            }
            new AnonymousClass0Sb(anonymousClass5Br.f61007B).G(new CharSequence[]{string}, anonymousClass5Bo).E(true).F(true).C().show();
            return;
        }
        String string2;
        CharSequence string3;
        if (q) {
            string2 = anonymousClass5Br.f61007B.getString(C0164R.string.hide_video_from_multi_author_story_title, new Object[]{name});
        } else {
            string2 = anonymousClass5Br.f61007B.getString(C0164R.string.hide_photo_from_multi_author_story_title, new Object[]{name});
        }
        if (q) {
            string3 = anonymousClass5Br.f61007B.getString(C0164R.string.hide_video_from_multi_author_story_message, new Object[]{name});
        } else {
            string3 = anonymousClass5Br.f61007B.getString(C0164R.string.hide_photo_from_multi_author_story_message, new Object[]{name});
        }
        new AnonymousClass0Sb(anonymousClass5Br.f61007B).R(string2).I(string3).L(C0164R.string.cancel, new AnonymousClass5Bp(anonymousClass5Br)).O(anonymousClass1cM.f20621B ? C0164R.string.ok : C0164R.string.hide_from_multi_author_story_button, anonymousClass5Bo).E(true).F(true).C().show();
    }

    public final void fDA(AnonymousClass0Ci anonymousClass0Ci) {
        ReelDashboardFragment reelDashboardFragment = this;
        if (this.f74052K == null) {
            this.f74052K = new AnonymousClass3le(getContext(), this.f74056O);
        }
        this.f74052K.A(anonymousClass0Ci, reelDashboardFragment, "dashboard", false, this.f74051J.Q());
    }

    public final String getModuleName() {
        String str = "reel_";
        if (this.f74046E == 1) {
            str = "replay_";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("dashboard");
        return stringBuilder.toString();
    }

    public final void iv() {
        AnonymousClass0rF.B(this.mListAdapter, -1587257368);
    }

    public final void ki(AnonymousClass1Zo anonymousClass1Zo, AnonymousClass0Ci anonymousClass0Ci, AnonymousClass0Pj anonymousClass0Pj, boolean z) {
        AnonymousClass3Io HRA;
        if (anonymousClass1Zo.f20270E != null && ((Boolean) AnonymousClass0CC.qF.H(this.f74056O)).booleanValue()) {
            HRA = AnonymousClass0J7.f2895B.O().C(this.f74056O, this, "reel_dashboard_poll_response").UQA(anonymousClass1Zo.f20269D).WQA(anonymousClass1Zo.f20270E.intValue()).HRA(AnonymousClass161.B(anonymousClass0Pj, anonymousClass1Zo));
        } else if (anonymousClass1Zo.f20275J == null || !((Boolean) AnonymousClass0CC.qF.H(this.f74056O)).booleanValue()) {
            HRA = AnonymousClass0J7.f2895B.O().C(this.f74056O, this, "reel_dashboard_viewer");
        } else {
            HRA = AnonymousClass0J7.f2895B.O().C(this.f74056O, this, "reel_dashboard_slider_response").gRA(anonymousClass1Zo.f20274I).hRA(anonymousClass1Zo.f20275J.floatValue());
        }
        HRA.tQA(anonymousClass0Pj.f4136H).vQA(anonymousClass0Pj.getId()).iOA(z).fSA(anonymousClass0Ci.getId());
        AnonymousClass0bz.B(getContext()).C(HRA.RD());
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f74044C.A(i, i2, intent);
    }

    public final boolean onBackPressed() {
        if (!this.f74057P) {
            if (this.f74051J != null) {
                if (m29906E(this).I()) {
                    return true;
                }
                this.f74057P = false;
                RectF D = m29905D(this);
                m29906E(this).F(this.f74051J, null, this.mImageViewPager.getCurrentWrappedDataIndex(), null, D, new AnonymousClass5v8(this, D), false, AnonymousClass0Qf.DASHBOARD, this.f74064W);
                return true;
            }
        }
        return false;
    }

    public final void onCreate(Bundle bundle) {
        Set set;
        AnonymousClass0IL anonymousClass0IL = this;
        int F = AnonymousClass0cQ.F(this, 2019536207);
        super.onCreate(bundle);
        this.f74056O = AnonymousClass0Ce.G(getArguments());
        this.f74068a = getArguments().getInt("ReelDashboardFragment.ARGUMENTS_KEY_EXTRA_STARTING_INDEX", 0);
        this.f74046E = getArguments().getInt("ReelDashboardFragment.ARGUMENTS_KEY_EXTRA_DASHBOARD_TYPE", 0);
        String str = "ReelDashboardFragment.ARGUMENTS_KEY_EXTRA_REEL_ITEMS_FILTER";
        if (getArguments().containsKey(str)) {
            set = (HashSet) getArguments().getSerializable(str);
        } else {
            set = Collections.emptySet();
        }
        this.f74064W = set;
        this.f74053L = getArguments().getString("ReelDashboardFragment.ARGUMENTS_KEY_EXTRA_REEL_ID");
        this.f74047F = new AnonymousClass0kV(getActivity(), this.f74056O);
        AnonymousClass0Iw anonymousClass5uz = new AnonymousClass5uz(this);
        AnonymousClass0GA B = AnonymousClass3nM.B(this.f74056O);
        B.f2849B = anonymousClass5uz;
        schedule(B);
        this.f74044C = AnonymousClass0Hx.f2719B.C(getContext(), new AnonymousClass5x4(this, getActivity()), this.f74056O.B());
        this.f74066Y = new AnonymousClass3bR(this.f74056O, this, this);
        this.f74065X = UUID.randomUUID().toString();
        this.f74061T = ((Boolean) AnonymousClass0CC.Fb.H(this.f74056O)).booleanValue();
        AnonymousClass0TK anonymousClass5tf = new AnonymousClass5tf(getActivity(), anonymousClass0IL, getLoaderManager(), this.f74056O, new AnonymousClass6Em(anonymousClass0IL));
        anonymousClass0IL.f74063V = anonymousClass5tf;
        registerLifecycleListener(anonymousClass5tf);
        AnonymousClass0cQ.G(anonymousClass0IL, 1766202546, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1917204365);
        this.f74062U.B();
        View inflate = layoutInflater.inflate(C0164R.layout.layout_reel_dashboard, viewGroup, false);
        if (getActivity() instanceof TransparentModalActivity) {
            inflate.findViewById(C0164R.id.container).setBackgroundColor(-1);
        }
        AnonymousClass0cQ.G(this, -899423657, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 1609922389);
        super.onDestroyView();
        for (AnonymousClass0OA anonymousClass0OA : this.f74050I.keySet()) {
            anonymousClass0OA.v((AnonymousClass0Qe) this.f74050I.get(anonymousClass0OA));
        }
        AnonymousClass0xy.B().G(this);
        this.f74050I.clear();
        this.f74062U.C();
        AnonymousClass0F4.f2058E.D(AnonymousClass10U.class, this);
        AnonymousClass0ea.E(Z().getWindow(), getView(), true);
        this.mImageViewPager.B();
        this.mListViewPager.B();
        Map map = this.f74069b;
        AnonymousClass5u7 anonymousClass5u7 = this.mListAdapter;
        Map hashMap = new HashMap();
        for (AnonymousClass5u6 anonymousClass5u6 : anonymousClass5u7.f69832D.values()) {
            hashMap.put(anonymousClass5u6.f69812M, anonymousClass5u6.f69813N.onSaveInstanceState());
        }
        map.putAll(hashMap);
        AnonymousClass0IU childFragmentManager = getChildFragmentManager();
        List<AnonymousClass0IL> J = childFragmentManager.J();
        if (J != null) {
            for (AnonymousClass0IL anonymousClass0IL : J) {
                if (anonymousClass0IL != null) {
                    childFragmentManager.B().L(anonymousClass0IL).G();
                }
            }
            childFragmentManager.D();
        }
        if (this.f74054M.P() > 0) {
            m29909H(this, Math.min(this.mListViewPager.getCurrentRawDataIndex(), this.f74054M.P() - 1));
        }
        ReelDashboardFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.G(this, 136487751, F);
    }

    public final /* bridge */ /* synthetic */ void onEvent(AnonymousClass0F6 anonymousClass0F6) {
        int I = AnonymousClass0cQ.I(this, -586336291);
        AnonymousClass10U anonymousClass10U = (AnonymousClass10U) anonymousClass0F6;
        int I2 = AnonymousClass0cQ.I(this, 1939963400);
        m29914M(this);
        AnonymousClass0cQ.H(this, -1310625489, I2);
        AnonymousClass0cQ.H(this, -247184501, I);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, 1159918194);
        super.onPause();
        this.f74045D.J(this);
        m29906E(this).K();
        this.f74068a = this.mImageViewPager.getCurrentDataIndex();
        AnonymousClass0cQ.G(this, -1075686609, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 1017581782);
        super.onResume();
        this.f74060S = false;
        this.f74045D.A(this);
        AnonymousClass0ea.E(Z().getWindow(), getView(), false);
        AnonymousClass0lG E = m29906E(this);
        if (E.G()) {
            if (E.f9477U == AnonymousClass0Qf.REEL_VIEWER_LIST) {
                E.B();
            } else {
                this.mImageViewPager.post(new AnonymousClass5up(this));
            }
        }
        AnonymousClass0cQ.G(this, -1779102417, F);
    }

    public final void onStart() {
        int F = AnonymousClass0cQ.F(this, 2025120144);
        super.onStart();
        m29922U(8);
        AnonymousClass0cQ.G(this, -1694315064, F);
    }

    public final void onStop() {
        int F = AnonymousClass0cQ.F(this, -336924494);
        super.onStop();
        m29922U(0);
        AnonymousClass0cQ.G(this, -1620898520, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        AnonymousClass0IJ anonymousClass0IJ = this;
        super.onViewCreated(view, bundle);
        this.f74059R = AnonymousClass0Nm.J(getContext()) / 5;
        this.f74058Q = getResources().getDimensionPixelOffset(C0164R.dimen.reel_dashboard_image_spacing);
        this.mContainer = (TouchInterceptorFrameLayout) view.findViewById(C0164R.id.container);
        view.findViewById(C0164R.id.button_close).setOnClickListener(new AnonymousClass5v2(this));
        if (this.f74046E == 0 && VERSION.SDK_INT > 18 && ((Boolean) AnonymousClass0CC.Rc.H(this.f74056O)).booleanValue()) {
            View findViewById = view.findViewById(C0164R.id.button_saveall);
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new AnonymousClass5v3(this));
        }
        view.findViewById(C0164R.id.button_settings).setOnClickListener(new AnonymousClass5v4(this));
        this.mEmptyView = (EmptyStateView) view.findViewById(16908292);
        if (this.f74046E == 0) {
            this.mEmptyView.J(new AnonymousClass5v5(this), AnonymousClass2I0.ERROR);
        }
        ReboundViewPager reboundViewPager = (ReboundViewPager) view.findViewById(C0164R.id.view_pager);
        this.mImageViewPager = reboundViewPager;
        reboundViewPager.setExtraBufferSize(4);
        this.mPagerAdapter = new AnonymousClass5tv(this.f74059R, AnonymousClass0Nm.H(getResources().getDisplayMetrics()), this.f74061T, this);
        this.mImageViewPager.setAdapter(this.mPagerAdapter);
        this.mImageViewPager.setOverridePageWidth(this.f74059R);
        this.mImageViewPager.setPageSpacing((float) this.f74058Q);
        this.mImageViewPager.A(new AnonymousClass5v6(this));
        this.mImageViewPager.setScrollMode(AnonymousClass1Iu.WHEEL_OF_FORTUNE);
        this.mImageViewPager.setItemPositioner(new AnonymousClass0sF(this.f74059R, this.f74058Q, 0.7f, 1.0f));
        this.mListViewPager = (ReboundViewPager) view.findViewById(C0164R.id.list_view_pager);
        AnonymousClass0Cm anonymousClass0Cm = this.f74056O;
        AnonymousClass5u7 anonymousClass5u7 = new AnonymousClass5u7(anonymousClass0Cm, anonymousClass0IJ, anonymousClass0IJ, AnonymousClass0Cf.F(anonymousClass0Cm), new AnonymousClass59U(), AnonymousClass0G5.B(getContext(), C0164R.attr.reelDashboardShareButtonEnabled, true), this.f74061T);
        anonymousClass0IJ.mListAdapter = anonymousClass5u7;
        Map map = anonymousClass0IJ.f74069b;
        anonymousClass5u7.f69840L.clear();
        anonymousClass5u7.f69840L.putAll(map);
        anonymousClass0IJ.mListAdapter.f69837I = anonymousClass0IJ.f74068a;
        anonymousClass0IJ.f74069b.clear();
        anonymousClass0IJ.mListViewPager.setAdapter(anonymousClass0IJ.mListAdapter);
        anonymousClass0IJ.f74045D = AnonymousClass0e6.B().C().O(AnonymousClass0e5.C(70.0d, 8.0d));
        anonymousClass0IJ.mListViewPager.A(new AnonymousClass5v7(anonymousClass0IJ));
        TriangleShape triangleShape = (TriangleShape) view.findViewById(C0164R.id.notch);
        triangleShape.setNotchCenterXOn(anonymousClass0IJ.mImageViewPager);
        triangleShape.invalidate();
        int i = anonymousClass0IJ.f74046E;
        if (i == 1) {
            AnonymousClass0Pr C = AnonymousClass0Pr.C(anonymousClass0IJ.f74056O);
            anonymousClass0IJ.f74051J = (AnonymousClass0MI) C.f4210B.get(AnonymousClass0Ps.REPLAY);
            m29913L(anonymousClass0IJ);
        } else if (i == 0) {
            AnonymousClass0MI D = AnonymousClass0MB.C(anonymousClass0IJ.f74056O).D(anonymousClass0IJ.f74053L);
            anonymousClass0IJ.f74051J = D;
            if (D == null) {
                m29904C(anonymousClass0IJ);
            } else {
                m29913L(anonymousClass0IJ);
            }
        }
    }

    public final void xs(AnonymousClass1Zo anonymousClass1Zo) {
        AnonymousClass0Ci anonymousClass0Ci = anonymousClass1Zo.f20276K;
        if (this.f74055N == null) {
            this.f74055N = new AnonymousClass5CC(Z());
        }
        this.f74055N.m25958A(anonymousClass0Ci, this.f74051J, new AnonymousClass5ur(this, anonymousClass1Zo));
    }
}
