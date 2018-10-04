package com.instagram.igtv.viewer;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Ci;
import X.AnonymousClass0Cm;
import X.AnonymousClass0EE;
import X.AnonymousClass0EF;
import X.AnonymousClass0F4;
import X.AnonymousClass0F8;
import X.AnonymousClass0Fz;
import X.AnonymousClass0GA;
import X.AnonymousClass0Gn;
import X.AnonymousClass0Gs;
import X.AnonymousClass0HV;
import X.AnonymousClass0IG;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IL;
import X.AnonymousClass0IS;
import X.AnonymousClass0IW;
import X.AnonymousClass0It;
import X.AnonymousClass0Iw;
import X.AnonymousClass0LQ;
import X.AnonymousClass0Lo;
import X.AnonymousClass0Nm;
import X.AnonymousClass0P7;
import X.AnonymousClass0PZ;
import X.AnonymousClass0Px;
import X.AnonymousClass0QQ;
import X.AnonymousClass0Sb;
import X.AnonymousClass0Sn;
import X.AnonymousClass0TK;
import X.AnonymousClass0TL;
import X.AnonymousClass0TP;
import X.AnonymousClass0Ur;
import X.AnonymousClass0bN;
import X.AnonymousClass0bP;
import X.AnonymousClass0bt;
import X.AnonymousClass0cK;
import X.AnonymousClass0cQ;
import X.AnonymousClass0cY;
import X.AnonymousClass0dd;
import X.AnonymousClass0e5;
import X.AnonymousClass0eT;
import X.AnonymousClass0hq;
import X.AnonymousClass0hr;
import X.AnonymousClass0i6;
import X.AnonymousClass0lj;
import X.AnonymousClass0n2;
import X.AnonymousClass0n5;
import X.AnonymousClass0n8;
import X.AnonymousClass0nB;
import X.AnonymousClass0nO;
import X.AnonymousClass0rF;
import X.AnonymousClass0w7;
import X.AnonymousClass0xR;
import X.AnonymousClass0xa;
import X.AnonymousClass107;
import X.AnonymousClass13e;
import X.AnonymousClass13f;
import X.AnonymousClass1It;
import X.AnonymousClass1Iv;
import X.AnonymousClass1Iw;
import X.AnonymousClass1W1;
import X.AnonymousClass1W5;
import X.AnonymousClass22q;
import X.AnonymousClass26W;
import X.AnonymousClass2CH;
import X.AnonymousClass2CP;
import X.AnonymousClass2CT;
import X.AnonymousClass2CW;
import X.AnonymousClass2NV;
import X.AnonymousClass3f3;
import X.AnonymousClass3gC;
import X.AnonymousClass3gK;
import X.AnonymousClass3gP;
import X.AnonymousClass4uW;
import X.AnonymousClass4uo;
import X.AnonymousClass4uq;
import X.AnonymousClass4ut;
import X.AnonymousClass4uw;
import X.AnonymousClass4v0;
import X.AnonymousClass4vg;
import X.AnonymousClass4vh;
import X.AnonymousClass4vi;
import X.AnonymousClass4vl;
import X.AnonymousClass4vn;
import X.AnonymousClass4vo;
import X.AnonymousClass4vp;
import X.AnonymousClass4vq;
import X.AnonymousClass4vs;
import X.AnonymousClass4vt;
import X.AnonymousClass4vx;
import X.AnonymousClass4vy;
import X.AnonymousClass4vz;
import X.AnonymousClass4w0;
import X.AnonymousClass4w1;
import X.AnonymousClass4w2;
import X.AnonymousClass4w6;
import X.AnonymousClass4w7;
import X.AnonymousClass4wA;
import X.AnonymousClass4wB;
import X.AnonymousClass4wC;
import X.AnonymousClass4wD;
import X.AnonymousClass4wE;
import X.AnonymousClass4wH;
import X.AnonymousClass4wM;
import X.AnonymousClass4wT;
import X.AnonymousClass4wV;
import X.AnonymousClass4ws;
import X.AnonymousClass4ww;
import X.AnonymousClass4wx;
import X.AnonymousClass4x6;
import X.AnonymousClass4xG;
import X.AnonymousClass4xO;
import X.AnonymousClass5Jk;
import X.AnonymousClass5YN;
import X.AnonymousClass5YQ;
import X.AnonymousClass5YR;
import X.AnonymousClass5YS;
import X.AnonymousClass5YT;
import X.AnonymousClass5YU;
import X.AnonymousClass5YV;
import X.AnonymousClass5Yb;
import X.AnonymousClass5Yc;
import X.AnonymousClass5c0;
import X.AnonymousClass5c1;
import X.AnonymousClass5c2;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.BaseAdapter;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.igtv.logging.IGTVLaunchAnalytics;
import com.instagram.igtv.ui.GestureManagerFrameLayout;
import com.instagram.igtv.uploadflow.UploadFlowActivity;
import com.instagram.igtv.viewer.tvguide.IGTVSearchController;
import com.instagram.modal.ModalActivity;
import com.instagram.ui.widget.volume.VolumeIndicator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class IGTVViewerFragment extends AnonymousClass0IJ implements AnonymousClass0hq, AnonymousClass0PZ, OnDismissListener, AnonymousClass0IS, AnonymousClass0QQ, AnonymousClass4uo, AnonymousClass4vl, AnonymousClass0TL, AnonymousClass0bt, AnonymousClass4ww {
    /* renamed from: B */
    public boolean f66087B;
    /* renamed from: C */
    public AnonymousClass4wH f66088C;
    /* renamed from: D */
    public AnonymousClass2CW f66089D;
    /* renamed from: E */
    public AnonymousClass4wx f66090E;
    /* renamed from: F */
    public boolean f66091F;
    /* renamed from: G */
    public String f66092G;
    /* renamed from: H */
    public AnonymousClass4vy f66093H;
    /* renamed from: I */
    public boolean f66094I;
    /* renamed from: J */
    public AnonymousClass4wH f66095J;
    /* renamed from: K */
    public String f66096K;
    /* renamed from: L */
    public boolean f66097L;
    /* renamed from: M */
    public RectF f66098M;
    /* renamed from: N */
    public boolean f66099N;
    /* renamed from: O */
    public String f66100O;
    /* renamed from: P */
    public boolean f66101P;
    /* renamed from: Q */
    public AnonymousClass0Cm f66102Q;
    /* renamed from: R */
    public AnonymousClass1W1 f66103R;
    /* renamed from: S */
    private boolean f66104S;
    /* renamed from: T */
    private Uri f66105T;
    /* renamed from: U */
    private AnonymousClass4vn f66106U;
    /* renamed from: V */
    private IGTVLaunchAnalytics f66107V;
    /* renamed from: W */
    private AnonymousClass0n2 f66108W;
    /* renamed from: X */
    private String f66109X;
    /* renamed from: Y */
    private Bundle f66110Y;
    /* renamed from: Z */
    private final AnonymousClass0hr f66111Z = new AnonymousClass0hr(new AnonymousClass4w7(this));
    /* renamed from: a */
    private AnonymousClass0n5 f66112a;
    /* renamed from: b */
    private AnonymousClass26W f66113b;
    /* renamed from: c */
    private AnonymousClass4vs f66114c;
    /* renamed from: d */
    private AnonymousClass1W5 f66115d;
    /* renamed from: e */
    private boolean f66116e;
    /* renamed from: f */
    private AnonymousClass4uw f66117f;
    /* renamed from: g */
    private AnonymousClass4xO f66118g;
    /* renamed from: h */
    private final AnonymousClass0F8 f66119h;
    /* renamed from: i */
    private final AnonymousClass4ws f66120i = new AnonymousClass4ws();
    public AnonymousClass4vp mAudioController;
    private AnonymousClass0cK mBackStackChangedListener;
    public ReboundViewPager mChannelPager;
    public AnonymousClass5YN mChromeRevealGestureObserver;
    public AnonymousClass4vo mDragToDismissController;
    public View mDrawerContent;
    public AnonymousClass4ut mGestureManager;
    public InAppNuxContoller mInAppNuxContoller;
    public View mInnerContainer;
    public View mInsightsView;
    public AnonymousClass5YR mModalDrawerController;
    public GestureManagerFrameLayout mRootView;
    public IGTVSearchController mSearchController;
    public AnonymousClass5Yb mTVGuideController;
    public AnonymousClass4uW mTVGuideImpressionManager;
    public AnonymousClass4uW mTVViewerImpressionManager;
    public AnonymousClass4wV mVideoPlaybackStateManager;
    public AnonymousClass5YS mVideoPlayerController;
    public AnonymousClass5YT mVideoSeekObserver;
    public VolumeIndicator mVolumeIndicator;
    public AnonymousClass0Ur mWebLinkShimProgressDialog;

    public final void Kt(int i, int i2) {
    }

    public final void RGA(View view) {
    }

    public final boolean bW() {
        return true;
    }

    public final void bf(AnonymousClass4uq anonymousClass4uq, float f, float f2, float f3) {
    }

    public final void bi(float f) {
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public IGTVViewerFragment() {
        AnonymousClass4wH anonymousClass4wH = AnonymousClass4wH.NOT_STARTED;
        this.f66088C = anonymousClass4wH;
        this.f66095J = anonymousClass4wH;
        this.f66094I = true;
        this.mBackStackChangedListener = new AnonymousClass4wB(this);
        this.f66119h = new AnonymousClass4wC(this);
    }

    public final void At(int i) {
        AnonymousClass0n8 D = m27456D(this);
        if (this.f66093H.getCount() - i < 5 && D != null && D.L()) {
            AnonymousClass4vg.m25394D(this.f66102Q).m25396B(getContext(), getLoaderManager(), D.f10006B, D.f10008D, this.f66089D, new AnonymousClass5c1(this));
        }
        AnonymousClass4uq.m25339B(getContext()).m25345C();
        AnonymousClass5YU g = m27487g(i);
        if (g != null) {
            g.yPA(false);
            AnonymousClass2CT NU = g.NU();
            if (NU != null) {
                NU.f27420H = false;
                m27464L(this);
            }
        }
    }

    /* renamed from: B */
    public static void m27454B(IGTVViewerFragment iGTVViewerFragment, AnonymousClass0P7 anonymousClass0P7) {
        if (!iGTVViewerFragment.f66094I) {
            iGTVViewerFragment.mVideoPlaybackStateManager.f58672B = 0;
        }
        iGTVViewerFragment.f66094I = false;
        if (anonymousClass0P7.xB) {
            AnonymousClass4wV anonymousClass4wV = iGTVViewerFragment.mVideoPlaybackStateManager;
            anonymousClass4wV.f58672B++;
            return;
        }
        iGTVViewerFragment.mVideoPlaybackStateManager.f58672B = 0;
    }

    public final void Bt(int i) {
        m27481c(this.f66093H.m25431A(i));
        AnonymousClass5YU g = m27487g(i);
        if (g != null) {
            g.yPA(true);
        }
    }

    /* renamed from: C */
    public static void m27455C(IGTVViewerFragment iGTVViewerFragment) {
        iGTVViewerFragment.f66095J = AnonymousClass4wH.COMPLETED;
        m27464L(iGTVViewerFragment);
        AnonymousClass4vi.m25397B(iGTVViewerFragment.getContext()).m25404F(false);
        AnonymousClass0F4.f2058E.B(new AnonymousClass22q());
        iGTVViewerFragment.mTVGuideController.m27548C();
        iGTVViewerFragment.m27480b();
    }

    /* renamed from: D */
    public static AnonymousClass0n8 m27456D(IGTVViewerFragment iGTVViewerFragment) {
        iGTVViewerFragment = m27457E(iGTVViewerFragment);
        if (iGTVViewerFragment != null) {
            return iGTVViewerFragment.f27414B;
        }
        return null;
    }

    /* renamed from: E */
    public static AnonymousClass2CT m27457E(IGTVViewerFragment iGTVViewerFragment) {
        return iGTVViewerFragment.f66090E.f58743C;
    }

    /* renamed from: F */
    public static boolean m27458F(IGTVViewerFragment iGTVViewerFragment) {
        return !iGTVViewerFragment.f66101P && iGTVViewerFragment.f66116e;
    }

    /* renamed from: G */
    public static void m27459G(IGTVViewerFragment iGTVViewerFragment, AnonymousClass0n8 anonymousClass0n8, boolean z, boolean z2) {
        iGTVViewerFragment.mTVGuideController.m27554I(Collections.singletonList(anonymousClass0n8));
        if (!iGTVViewerFragment.f66097L) {
            iGTVViewerFragment.mTVGuideController.m27549D(anonymousClass0n8.f10015K, z, z2);
            iGTVViewerFragment.f66097L = true;
        }
        iGTVViewerFragment.mTVGuideController.m27555J(true);
        AnonymousClass4uq.m25339B(iGTVViewerFragment.getContext()).m25345C();
        if (anonymousClass0n8.K().size() > 0) {
            AnonymousClass2CT I = anonymousClass0n8.I(0);
            iGTVViewerFragment.f66090E.m25474B(I);
            if (I != null && I.S()) {
                m27454B(iGTVViewerFragment, I.G());
            }
            m27468P(iGTVViewerFragment);
            return;
        }
        AnonymousClass0IG.C(iGTVViewerFragment.getContext(), C0164R.string.error);
    }

    /* renamed from: H */
    public static void m27460H(IGTVViewerFragment iGTVViewerFragment) {
        if (m27458F(iGTVViewerFragment)) {
            m27461I(iGTVViewerFragment);
            iGTVViewerFragment.mVideoPlaybackStateManager.m25454L(true);
        } else if (iGTVViewerFragment.f66101P) {
            iGTVViewerFragment.m27474V();
        } else {
            iGTVViewerFragment.m27473U();
        }
    }

    /* renamed from: I */
    public static void m27461I(IGTVViewerFragment iGTVViewerFragment) {
        if (iGTVViewerFragment.f66096K != null) {
            AnonymousClass0P7 A = AnonymousClass107.f13182C.A(iGTVViewerFragment.f66096K);
            if (A != null) {
                m27469Q(iGTVViewerFragment, A);
                return;
            }
            AnonymousClass4vg D = AnonymousClass4vg.m25394D(iGTVViewerFragment.f66102Q);
            Context context = iGTVViewerFragment.getContext();
            AnonymousClass0Fz loaderManager = iGTVViewerFragment.getLoaderManager();
            String str = iGTVViewerFragment.f66096K;
            AnonymousClass0Iw anonymousClass4vz = new AnonymousClass4vz(iGTVViewerFragment);
            AnonymousClass0GA B = AnonymousClass0It.B(str, D.f58529C);
            B.f2849B = anonymousClass4vz;
            AnonymousClass0Px.B(context, loaderManager, B);
            return;
        }
        Uri uri = iGTVViewerFragment.f66105T;
        if (uri != null) {
            AnonymousClass0GA B2 = AnonymousClass5Jk.m26248B(iGTVViewerFragment.f66102Q, uri.toString());
            B2.f2849B = new AnonymousClass4w0(iGTVViewerFragment);
            iGTVViewerFragment.schedule(B2);
        }
    }

    /* renamed from: J */
    public static void m27462J(IGTVViewerFragment iGTVViewerFragment, AnonymousClass5YU anonymousClass5YU) {
        if (anonymousClass5YU.getPosition() == iGTVViewerFragment.mChannelPager.getCurrentRawDataIndex() && !iGTVViewerFragment.mVideoPlaybackStateManager.m25456N()) {
            if ((500 > System.currentTimeMillis() - iGTVViewerFragment.mVideoSeekObserver.f66150C ? 1 : null) == null) {
                iGTVViewerFragment.f66094I = true;
                iGTVViewerFragment.mChannelPager.I(0.0f, 1);
            }
        }
    }

    /* renamed from: K */
    public static void m27463K(IGTVViewerFragment iGTVViewerFragment, AnonymousClass1W5 anonymousClass1W5) {
        AnonymousClass2CT E = m27457E(iGTVViewerFragment);
        switch (AnonymousClass4wA.f58628B[anonymousClass1W5.ordinal()]) {
            case 1:
                iGTVViewerFragment.mModalDrawerController.m27503A(E, false);
                return;
            case 2:
                iGTVViewerFragment.mModalDrawerController.m27505C(E, false);
                return;
            case 3:
                iGTVViewerFragment.mModalDrawerController.m27504B(E, false);
                return;
            default:
                return;
        }
    }

    /* renamed from: L */
    public static void m27464L(IGTVViewerFragment iGTVViewerFragment) {
        AnonymousClass5YS anonymousClass5YS = iGTVViewerFragment.mVideoPlayerController;
        if (anonymousClass5YS != null) {
            anonymousClass5YS.m27513C();
            iGTVViewerFragment.mVideoPlayerController.f66137B = iGTVViewerFragment.mAudioController.f58567C;
            for (int c = iGTVViewerFragment.m27483c(); c <= iGTVViewerFragment.m27484d(); c++) {
                View D = iGTVViewerFragment.mChannelPager.D(c);
                if (D != null) {
                    if (D.getWidth() != 0) {
                        float floor = (((float) Math.floor((double) ((iGTVViewerFragment.mAudioController.f58567C * (1.0f - (Math.abs(D.getTranslationX()) / ((float) D.getWidth())))) * 25.0f))) * 4.0f) / 100.0f;
                        AnonymousClass5YU g = iGTVViewerFragment.m27487g(c);
                        if (g != null) {
                            AnonymousClass4vx anonymousClass4vx = (AnonymousClass4vx) iGTVViewerFragment.mVideoPlayerController.f66142G.get(g);
                            if (anonymousClass4vx != null) {
                                anonymousClass4vx.m25430H(floor);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: M */
    public static void m27465M(IGTVViewerFragment iGTVViewerFragment, boolean z) {
        if (z) {
            AnonymousClass4uq.m25339B(iGTVViewerFragment.getContext()).m25344B(false);
            iGTVViewerFragment.mTVGuideController.m27546A(false);
            iGTVViewerFragment.mInAppNuxContoller.m25438D();
        } else {
            m27464L(iGTVViewerFragment);
            iGTVViewerFragment.mTVGuideController.m27553H(true);
            iGTVViewerFragment.f66097L = true;
        }
        iGTVViewerFragment.mChromeRevealGestureObserver.f66073C = z ^ 1;
        iGTVViewerFragment.mVideoSeekObserver.f66149B = z ^ 1;
        iGTVViewerFragment.mTVGuideController.m27555J(z ^ 1);
        AnonymousClass4uq.m25339B(iGTVViewerFragment.getContext()).f58408E = z;
        AnonymousClass4v0.m25353B(iGTVViewerFragment.getActivity()).m25365J(z);
        iGTVViewerFragment.mVideoPlaybackStateManager.m25449G(z);
        iGTVViewerFragment.mChannelPager.setDraggingEnabled(z ^ true);
    }

    /* renamed from: N */
    public static void m27466N(IGTVViewerFragment iGTVViewerFragment, AnonymousClass0n8 anonymousClass0n8) {
        BaseAdapter baseAdapter = iGTVViewerFragment.f66093H;
        if (baseAdapter == null) {
            return;
        }
        if (iGTVViewerFragment.mChannelPager != null) {
            baseAdapter.f58604B = anonymousClass0n8;
            baseAdapter.f58605C.clear();
            baseAdapter.f58605C.addAll(anonymousClass0n8.J());
            AnonymousClass0rF.B(baseAdapter, -864730585);
            AnonymousClass4vs anonymousClass4vs = iGTVViewerFragment.f66114c;
            List list = iGTVViewerFragment.f66093H.f58605C;
            AnonymousClass0cY D = AnonymousClass0cY.D(anonymousClass4vs.f58578C);
            D.B(anonymousClass4vs.f58577B);
            for (int i = 0; i < list.size(); i++) {
                AnonymousClass2CT anonymousClass2CT = (AnonymousClass2CT) list.get(i);
                if (anonymousClass2CT.S()) {
                    String E = anonymousClass2CT.E();
                    AnonymousClass0P7 G = anonymousClass2CT.G();
                    D.A(anonymousClass4vs.f58577B, new AnonymousClass0nO(new AnonymousClass0i6(E, G.OA()), new AnonymousClass4vt(G, i)));
                }
            }
            D.G();
            int currentWrappedDataIndex = iGTVViewerFragment.mChannelPager.getCurrentWrappedDataIndex();
            AnonymousClass2CT A = iGTVViewerFragment.f66093H.m25431A(currentWrappedDataIndex);
            if (A != null && A.S()) {
                iGTVViewerFragment.f66114c.m25419B(A.G(), currentWrappedDataIndex);
            }
        }
    }

    /* renamed from: O */
    public static void m27467O(IGTVViewerFragment iGTVViewerFragment) {
        iGTVViewerFragment.mTVGuideController.m27554I(iGTVViewerFragment.f66089D.f27430E);
        iGTVViewerFragment.mTVGuideController.m27555J(true);
        iGTVViewerFragment.mTVGuideController.m27556K(false);
        AnonymousClass2CT a = iGTVViewerFragment.m27479a();
        if (a != null) {
            iGTVViewerFragment.f66118g.m25487A(a.f27414B);
            iGTVViewerFragment.f66090E.m25474B(a);
        }
        if (iGTVViewerFragment.mInAppNuxContoller.m25437C(iGTVViewerFragment.f66101P, m27458F(iGTVViewerFragment))) {
            m27465M(iGTVViewerFragment, true);
        } else {
            AnonymousClass4uq.m25339B(iGTVViewerFragment.getContext()).m25345C();
        }
        m27468P(iGTVViewerFragment);
        if (!(iGTVViewerFragment.f66091F || iGTVViewerFragment.f66097L || iGTVViewerFragment.f66095J == AnonymousClass4wH.RUNNING || iGTVViewerFragment.mInAppNuxContoller.m25437C(iGTVViewerFragment.f66101P, m27458F(iGTVViewerFragment)))) {
            boolean z = true;
            iGTVViewerFragment.f66097L = true;
            AnonymousClass5Yb anonymousClass5Yb = iGTVViewerFragment.mTVGuideController;
            if (iGTVViewerFragment.f66095J != AnonymousClass4wH.COMPLETED) {
                z = false;
            }
            anonymousClass5Yb.m27553H(z);
        }
        AnonymousClass2CT A = iGTVViewerFragment.f66093H.m25431A(iGTVViewerFragment.mChannelPager.getCurrentWrappedDataIndex());
        if (A != null && A.S()) {
            m27454B(iGTVViewerFragment, A.G());
        }
    }

    /* renamed from: P */
    public static void m27468P(IGTVViewerFragment iGTVViewerFragment) {
        AnonymousClass2CT E = m27457E(iGTVViewerFragment);
        if (E != null || m27458F(iGTVViewerFragment) || iGTVViewerFragment.f66101P) {
            AnonymousClass0n8 anonymousClass0n8 = E.f27414B;
            if (!AnonymousClass0LQ.B(E.f27414B, iGTVViewerFragment.f66093H.f58604B)) {
                m27466N(iGTVViewerFragment, anonymousClass0n8);
            }
            if (!AnonymousClass0LQ.B(iGTVViewerFragment.f66093H.m25431A(iGTVViewerFragment.mChannelPager.getCurrentWrappedDataIndex()), E)) {
                iGTVViewerFragment.mChannelPager.G(anonymousClass0n8.K().indexOf(E.G()));
            }
            iGTVViewerFragment.m27480b();
            m27464L(iGTVViewerFragment);
            return;
        }
        for (AnonymousClass0n8 anonymousClass0n82 : iGTVViewerFragment.f66089D.f27430E) {
            if ((anonymousClass0n82.f10016L.isEmpty() ^ 1) != 0) {
                m27466N(iGTVViewerFragment, anonymousClass0n82);
                iGTVViewerFragment.f66090E.m25474B(anonymousClass0n82.I(0));
                break;
            }
        }
    }

    /* renamed from: Q */
    public static void m27469Q(IGTVViewerFragment iGTVViewerFragment, AnonymousClass0P7 anonymousClass0P7) {
        if (m27472T(anonymousClass0P7)) {
            AnonymousClass4wx anonymousClass4wx = iGTVViewerFragment.f66090E;
            AnonymousClass2CW anonymousClass2CW = iGTVViewerFragment.f66089D;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("media_");
            stringBuilder.append(anonymousClass0P7.getId());
            String stringBuilder2 = stringBuilder.toString();
            AnonymousClass0n8 anonymousClass0n8 = (AnonymousClass0n8) anonymousClass2CW.f27427B.get(stringBuilder2);
            if (anonymousClass0n8 == null) {
                anonymousClass0n8 = new AnonymousClass0n8(stringBuilder2, AnonymousClass13f.SINGLE_MEDIA, anonymousClass0P7.MA().f1757z, anonymousClass0P7);
                anonymousClass2CW.E(anonymousClass0n8, true);
            }
            anonymousClass4wx.m25474B(anonymousClass0n8.F(anonymousClass0P7));
            return;
        }
        AnonymousClass0IG.C(iGTVViewerFragment.getContext(), C0164R.string.error);
    }

    /* renamed from: R */
    private float m27470R() {
        return ((Double) AnonymousClass0CC.nO.H(this.f66102Q)).floatValue();
    }

    /* renamed from: S */
    private void m27471S() {
        Iterator it = AnonymousClass4uq.m25339B(getContext()).f58410G.iterator();
        while (it.hasNext()) {
            if (this == ((AnonymousClass4uo) ((WeakReference) it.next()).get())) {
                it.remove();
            }
        }
        this.f66111Z.C();
        this.mTVGuideController.f66230P.C();
        m27481c(m27457E(this));
        AnonymousClass3gP.B(this.f66102Q).Q();
        this.mVideoPlaybackStateManager.m25448F(false);
        AnonymousClass5YS anonymousClass5YS = this.mVideoPlayerController;
        if (((Boolean) AnonymousClass0CC.DM.H(anonymousClass5YS.f66144I)).booleanValue()) {
            AnonymousClass5YS.m27508C(anonymousClass5YS, "fragment_paused");
        }
    }

    /* renamed from: T */
    private static boolean m27472T(AnonymousClass0P7 anonymousClass0P7) {
        if (anonymousClass0P7.wY()) {
            if (anonymousClass0P7.gA()) {
                return true;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id: ");
        stringBuilder.append(anonymousClass0P7.NO());
        stringBuilder.append(" type: ");
        stringBuilder.append(anonymousClass0P7.TO());
        AnonymousClass0Gn.H("InvalidVideoMediaInIGTVFeed", stringBuilder.toString());
        return false;
    }

    /* renamed from: U */
    private void m27473U() {
        if (m27478Z(this)) {
            this.mTVGuideController.m27556K(true);
            AnonymousClass0Px.B(getContext(), getLoaderManager(), AnonymousClass4vg.m25392B(AnonymousClass4vg.m25394D(this.f66102Q), false, new AnonymousClass5c0(this)));
        }
    }

    public final void Uf(AnonymousClass4wx anonymousClass4wx, AnonymousClass2CT anonymousClass2CT, AnonymousClass2CT anonymousClass2CT2) {
        if (this.f66101P) {
            this.mVideoPlaybackStateManager.m25452J(true);
        }
        if (anonymousClass2CT != null) {
            int i = (!anonymousClass2CT.W() || anonymousClass2CT.A()) ? 0 : 1;
            this.mChannelPager.setDraggingEnabled(i ^ true);
        }
        m27468P(this);
    }

    /* renamed from: V */
    private void m27474V() {
        if (m27478Z(this)) {
            AnonymousClass0n8 C = this.f66089D.C(this.f66109X);
            if (C == null || C.K().size() <= 0) {
                this.mTVGuideController.m27556K(true);
                AnonymousClass4vg.m25394D(this.f66102Q).m25395A(getContext(), getLoaderManager(), this.f66109X, this.f66089D, new AnonymousClass5c2(this));
                return;
            }
            m27459G(this, C, false, false);
        }
    }

    /* renamed from: W */
    private boolean m27475W() {
        ReboundViewPager reboundViewPager = this.mChannelPager;
        if (reboundViewPager == null) {
            return false;
        }
        float currentOffset = reboundViewPager.getCurrentOffset();
        if (currentOffset == ((float) Math.floor((double) currentOffset)) && this.mChannelPager.getScrollState() == AnonymousClass1Iw.IDLE) {
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private void m27476X() {
        if (this.mRootView != null) {
            AnonymousClass4vi.m25397B(getContext()).m25404F(true);
            this.mRootView.setVisibility(4);
            this.f66095J = AnonymousClass4wH.RUNNING;
            this.mRootView.post(new AnonymousClass4wE(this));
        }
    }

    /* renamed from: Y */
    private void m27477Y(boolean z) {
        View view = AnonymousClass0eT.E(getActivity()).f7727C;
        ViewParent viewParent = (ViewGroup) getActivity().findViewById(C0164R.id.layout_container_main).getParent();
        if (view != null) {
            AnonymousClass5YR anonymousClass5YR = this.mModalDrawerController;
            if (anonymousClass5YR == null) {
                return;
            }
            if (viewParent != null) {
                if (z) {
                    if (view.getParent() != anonymousClass5YR.f66121B) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    anonymousClass5YR.f66121B.addView(view, 1);
                } else if (view.getParent() != viewParent) {
                    ((ViewGroup) view.getParent()).removeView(view);
                    viewParent.addView(view, 1);
                }
            }
        }
    }

    /* renamed from: Z */
    private static boolean m27478Z(IGTVViewerFragment iGTVViewerFragment) {
        return iGTVViewerFragment.f66093H.isEmpty() && !iGTVViewerFragment.f66087B;
    }

    /* renamed from: a */
    private AnonymousClass2CT m27479a() {
        String str = this.f66109X;
        if (str != null) {
            if (this.f66096K != null) {
                AnonymousClass0n8 C = this.f66089D.C(str);
                if (C != null) {
                    AnonymousClass0P7 anonymousClass0P7 = (AnonymousClass0P7) C.f10009E.get(this.f66096K);
                    if (anonymousClass0P7 == null) {
                        anonymousClass0P7 = AnonymousClass107.f13182C.A(this.f66096K);
                    }
                    if (anonymousClass0P7 != null) {
                        AnonymousClass2CT F = C.F(anonymousClass0P7);
                        this.f66109X = null;
                        this.f66096K = null;
                        return F;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final float m27482b() {
        AnonymousClass5YU g = m27487g(this.mChannelPager.getCurrentRawDataIndex());
        return g != null ? this.mVideoPlayerController.m27511A(g).floatValue() : -2.0f;
    }

    /* renamed from: b */
    private void m27480b() {
        AnonymousClass5YR anonymousClass5YR = this.mModalDrawerController;
        int i = 1;
        Object obj = (anonymousClass5YR == null || !anonymousClass5YR.f66123D.C()) ? null : 1;
        boolean isEmpty = this.f66093H.isEmpty();
        Object obj2 = this.f66095J == AnonymousClass4wH.RUNNING ? 1 : null;
        if (!(isEmpty && obj == null)) {
            if (obj2 == null) {
                i = 0;
            }
        }
        if (i == (this.f66108W.f9986G ^ 1) && this.mInnerContainer != null) {
            return;
        }
        if (i != 0) {
            this.mInnerContainer.setBackgroundDrawable(this.f66108W);
            this.f66108W.B();
            return;
        }
        this.mInnerContainer.setBackgroundDrawable(null);
        this.f66108W.A();
    }

    /* renamed from: c */
    public final int m27483c() {
        return AnonymousClass0nB.C((int) Math.floor((double) (this.mChannelPager.getCurrentOffset() + m27470R())), 0, this.f66093H.getCount() - 1);
    }

    /* renamed from: c */
    private void m27481c(AnonymousClass2CT anonymousClass2CT) {
        if (anonymousClass2CT != null) {
            if (anonymousClass2CT.S()) {
                AnonymousClass3gP B = AnonymousClass3gP.B(this.f66102Q);
                String K = anonymousClass2CT.K();
                int i = anonymousClass2CT.f27415C / JsonMappingException.MAX_REFS_TO_LIST;
                AnonymousClass3gK anonymousClass3gK = new AnonymousClass3gK();
                anonymousClass3gK.f43267B.f43265C.put(K, new AnonymousClass3gC(i));
                AnonymousClass3gP.C(B, anonymousClass3gK);
            }
        }
    }

    public final void cf(AnonymousClass4uq anonymousClass4uq, float f, float f2, float f3) {
        AnonymousClass4v0.m25353B(getActivity()).m25357B(f2);
    }

    public final void ci(boolean z) {
        if (z) {
            this.mChannelPager.setDraggingEnabled(false);
            this.mTVGuideController.m27546A(true);
            this.mTVGuideController.m27555J(false);
            AnonymousClass4uq.m25339B(getActivity()).f58406C = true;
        } else {
            this.mChannelPager.setDraggingEnabled(true);
            this.mTVGuideController.m27555J(true);
            AnonymousClass4uq.m25339B(getActivity()).f58406C = false;
        }
        AnonymousClass4v0.m25353B(getActivity()).m25358C(this.f66106U.m25409C());
        this.mVideoPlaybackStateManager.m25445C(z);
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        AnonymousClass5YR anonymousClass5YR = this.mModalDrawerController;
        if (anonymousClass5YR != null) {
            anonymousClass5YR.configureActionBar(anonymousClass0eT);
        }
    }

    /* renamed from: d */
    public final int m27484d() {
        return AnonymousClass0nB.C((int) Math.ceil((double) (this.mChannelPager.getCurrentOffset() - m27470R())), 0, this.f66093H.getCount() - 1);
    }

    /* renamed from: e */
    public final String m27485e() {
        return this.mVideoPlaybackStateManager.m25443A();
    }

    public final void eCA(int i, int i2) {
        AnonymousClass2CT A = this.f66093H.m25431A(i2);
        if (A != null && A.S()) {
            AnonymousClass1W1 anonymousClass1W1 = this.f66103R;
            Object obj = i < i2 ? 1 : null;
            AnonymousClass0P7 G = A.G();
            AnonymousClass0bP C = AnonymousClass1W1.C(anonymousClass1W1, obj != null ? "swipe_forward" : "swipe_back", A.C(), this.mChannelPager.getCurrentDataIndex());
            C.F(G);
            AnonymousClass0bN.f(C.B(), AnonymousClass0dd.REGULAR);
        }
    }

    /* renamed from: f */
    public final String m27486f() {
        AnonymousClass5YU g = m27487g(this.mChannelPager.getCurrentRawDataIndex());
        if (g == null) {
            return "null";
        }
        String str;
        if (g.NU().T()) {
            str = "PendingMedia";
        } else {
            str = g.NU().K();
        }
        return str;
    }

    /* renamed from: g */
    public final AnonymousClass5YU m27487g(int i) {
        i = this.mChannelPager.D(i);
        return (i == 0 || !(i.getTag() instanceof AnonymousClass5YU)) ? null : (AnonymousClass5YU) i.getTag();
    }

    public final String getModuleName() {
        return this.f66103R.f19423B;
    }

    /* renamed from: h */
    public final void m27488h() {
        if (getActivity().getWindow() != null) {
            AnonymousClass4v0.m25353B(getActivity()).m25363H();
            AnonymousClass4uq.m25339B(getContext()).m25345C();
            this.mChromeRevealGestureObserver.f66073C = true;
            this.mVideoSeekObserver.f66149B = true;
            this.mVideoPlaybackStateManager.m25453K(false);
        }
    }

    /* renamed from: i */
    public final void m27489i(AnonymousClass2CT anonymousClass2CT) {
        if ((TextUtils.isEmpty(anonymousClass2CT.D()) ^ 1) != 0) {
            if (this.f66106U.m25409C()) {
                this.f66106U.m25408B(true);
                return;
            }
            this.f66106U.f58552B.N(1.0d);
            if (this.f66120i.m25459A(anonymousClass2CT)) {
                AnonymousClass0w7.D(getContext());
            }
        }
    }

    /* renamed from: j */
    public final void m27490j(AnonymousClass0P7 anonymousClass0P7) {
        AnonymousClass0xR.D(getActivity(), anonymousClass0P7.j(), this.f66102Q.f1759C, anonymousClass0P7.NO());
    }

    /* renamed from: k */
    public final void m27491k(AnonymousClass2CT anonymousClass2CT, int i) {
        AnonymousClass2CT anonymousClass2CT2 = anonymousClass2CT;
        if (anonymousClass2CT != null) {
            this.mVideoPlaybackStateManager.m25446D(true);
            AnonymousClass0EE anonymousClass4wT = new AnonymousClass4wT(getActivity(), this, this, getResources(), anonymousClass2CT2, i, this.f66102Q, this);
            if (AnonymousClass0LQ.B(anonymousClass2CT2.N(), this.f66102Q.B())) {
                anonymousClass4wT.m25442A(r8, r8);
                return;
            }
            AnonymousClass0xa anonymousClass4w6 = new AnonymousClass4w6(r8, anonymousClass2CT2);
            ArrayList arrayList = new ArrayList();
            CharSequence[] charSequenceArr = new CharSequence[arrayList.size()];
            arrayList.add(anonymousClass4wT.f58668I.getString(C0164R.string.report_options));
            if (anonymousClass4wT.f58662C.N().qB != AnonymousClass0Lo.PrivacyStatusPrivate) {
                arrayList.add(anonymousClass4wT.f58668I.getString(C0164R.string.igtv_copy_link));
                AnonymousClass3f3.G(anonymousClass4wT, anonymousClass4wT.f58662C.E(), "igtv_action_sheet", "copy_link");
            }
            if (((Boolean) AnonymousClass0CC.lO.H(anonymousClass4wT.f58670K)).booleanValue()) {
                arrayList.add(anonymousClass4wT.f58668I.getString(anonymousClass4wT.f58662C.G().vA() ? C0164R.string.unsave : C0164R.string.save));
            }
            if (((Boolean) AnonymousClass0CC.qP.H(anonymousClass4wT.f58670K)).booleanValue()) {
                arrayList.add(anonymousClass4wT.f58668I.getString(C0164R.string.saved_to_staff_picks_button));
            }
            CharSequence[] charSequenceArr2 = (CharSequence[]) arrayList.toArray(charSequenceArr);
            AnonymousClass4wT.m25441C(anonymousClass4wT, charSequenceArr2, new AnonymousClass4wM(anonymousClass4wT, charSequenceArr2, anonymousClass4w6, r8), r8).show();
            AnonymousClass3f3.B(anonymousClass4wT, anonymousClass4wT.f58662C.E(), "igtv_action_sheet");
        }
    }

    public final String kR() {
        return this.f66100O;
    }

    /* renamed from: l */
    public final void m27492l(AnonymousClass0Ci anonymousClass0Ci, boolean z) {
        if (!z) {
            if (m27458F(this) && this.f66104S) {
                AnonymousClass0n8 B = this.f66089D.B(anonymousClass0Ci);
                this.mTVGuideController.m27554I(Collections.singletonList(B));
                this.f66109X = B.f10006B;
                this.f66096K = null;
                this.f66104S = false;
                this.mTVGuideController.m27555J(true);
                this.f66090E.m25474B(m27457E(this));
                m27468P(this);
            }
            this.f66103R.C(m27457E(this));
            this.mTVGuideController.m27549D(anonymousClass0Ci, true, this.mTVGuideController.f66228N.C());
        }
    }

    public final void ly(float f, float f2, AnonymousClass1Iw anonymousClass1Iw) {
        m27464L(this);
        AnonymousClass4vi.m25397B(getActivity()).m25400B(m27475W() ^ 1);
    }

    /* renamed from: m */
    public final void m27493m(boolean z, boolean z2) {
        this.f66103R.E(z);
        if (z2) {
            AnonymousClass0bP B = AnonymousClass1W1.B(this.f66103R, "igtv_playback_navigation");
            B.f6726B = z ? "show_guide" : "hide_guide";
            AnonymousClass0bN.f(B.B(), AnonymousClass0dd.REGULAR);
        }
    }

    /* renamed from: n */
    public final boolean m27494n(MotionEvent motionEvent) {
        if (!this.f66106U.m25409C()) {
            if (m27487g(this.mChannelPager.getCurrentWrappedDataIndex()) != null) {
                this.mTVGuideController.m27546A(true);
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public final void m27495o() {
        if (((Boolean) AnonymousClass0CC.uL.H(this.f66102Q)).booleanValue()) {
            this.f66117f.f58429C = true;
            Context context = getContext();
            Intent intent = new Intent(context, UploadFlowActivity.class);
            intent.putExtra("IgSessionManager.USER_ID", this.f66102Q.f1759C);
            intent.putExtra("com.instagram.igtv.uploadflow.extra.EXTRA_IGTV_VIEWER_SESSION_ID", this.f66103R.kR());
            AnonymousClass0IW.I(intent, context);
            return;
        }
        new AnonymousClass0Sb(getContext()).Q(C0164R.string.igtv_uploads_unavailable_title).H(C0164R.string.igtv_uploads_unavailable_description).O(C0164R.string.ok, new AnonymousClass4w2(this)).C().show();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == 1) {
            AnonymousClass5Yb anonymousClass5Yb = this.mTVGuideController;
            anonymousClass5Yb.f66227M.m27527D(AnonymousClass4x6.SETTINGS);
        }
    }

    public final boolean onBackPressed() {
        Object obj;
        boolean z = true;
        if (this.f66088C != AnonymousClass4wH.RUNNING) {
            if (!this.f66099N) {
                if (this.mInAppNuxContoller.m25436B()) {
                    this.mInAppNuxContoller.m25435A();
                } else if (!this.f66106U.m25410D()) {
                    if (!this.mModalDrawerController.m27506D()) {
                        if (!this.mTVGuideController.m27550E()) {
                            if (this.mSearchController.m27535A()) {
                                this.mSearchController.f66210F.A(true, 0.0f);
                            } else if (this.f66088C != AnonymousClass4wH.NOT_STARTED || this.mDragToDismissController == null) {
                                z = false;
                            } else {
                                this.f66088C = AnonymousClass4wH.RUNNING;
                                this.mDragToDismissController.m25412A(this.mRootView.getY(), 0.0f);
                                this.f66092G = "tap_back_button";
                            }
                        }
                    }
                }
                if (!z) {
                    obj = (this.f66101P || m27458F(this)) ? null : 1;
                    if (obj != null) {
                        this.f66089D.f27428C = System.currentTimeMillis();
                    }
                }
                return z;
            }
        }
        z = true ^ this.f66099N;
        if (z) {
            if (!this.f66101P) {
            }
            if (obj != null) {
                this.f66089D.f27428C = System.currentTimeMillis();
            }
        }
        return z;
    }

    public final void onCreate(Bundle bundle) {
        AnonymousClass0IL anonymousClass0IL = this;
        int F = AnonymousClass0cQ.F(this, -1435809400);
        super.onCreate(bundle);
        getActivity().D().A(this.mBackStackChangedListener);
        AnonymousClass4vi.m25397B(getActivity()).f58532B = this;
        Bundle arguments = getArguments();
        AnonymousClass0Cm G = AnonymousClass0Ce.G(arguments);
        this.f66102Q = G;
        AnonymousClass4vg.m25394D(G).f58528B.clear();
        AnonymousClass2CW anonymousClass2CW = AnonymousClass0TP.f5187Q;
        AnonymousClass0TP.f5187Q = null;
        this.f66089D = anonymousClass2CW;
        if (anonymousClass2CW == null) {
            this.f66089D = new AnonymousClass2CW(this.f66102Q);
        }
        this.f66100O = arguments.getString("igtv_session_id_arg");
        this.f66096K = arguments.getString("igtv_launch_to_media_id_arg");
        Object string = arguments.getString("igtv_short_url");
        if (!TextUtils.isEmpty(string)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("https://www.instagram.com/tv/");
            stringBuilder.append(string);
            this.f66105T = Uri.parse(stringBuilder.toString());
        }
        this.f66104S = arguments.getBoolean("igtv_allow_channel_nav_in_single_media_mode");
        this.f66109X = arguments.getString("igtv_launch_to_channel_id_arg");
        this.f66110Y = arguments.getBundle("igtv_viewer_launch_target_destination_bundle");
        this.f66098M = (RectF) arguments.getParcelable("igtv_source_rect_arg");
        this.f66091F = arguments.getBoolean("igtv_disable_auto_launch_tv_guide", false);
        this.f66116e = arguments.getBoolean("igtv_viewer_single_media_mode", false);
        this.f66101P = arguments.getBoolean("igtv_viewer_single_channel_mode", false);
        this.f66087B = arguments.getBoolean("igtv_allow_chaining", false);
        this.f66103R = new AnonymousClass1W1(this, this.f66100O, arguments.getString("igtv_base_analytics_module_arg"));
        IGTVLaunchAnalytics iGTVLaunchAnalytics = (IGTVLaunchAnalytics) arguments.getParcelable("igtv_launch_analytics");
        this.f66107V = iGTVLaunchAnalytics;
        if (iGTVLaunchAnalytics == null) {
            this.f66107V = new IGTVLaunchAnalytics();
        }
        if (this.f66107V.f13867D == null) {
            String str = this.f66096K;
            if (str != null) {
                this.f66107V.f13867D = str;
            }
        }
        AnonymousClass0n2 anonymousClass0n2 = new AnonymousClass0n2(getContext());
        this.f66108W = anonymousClass0n2;
        anonymousClass0n2.A();
        this.f66090E = new AnonymousClass4wx();
        this.f66118g = new AnonymousClass4xO();
        AnonymousClass4vn anonymousClass4vn = new AnonymousClass4vn();
        this.f66106U = anonymousClass4vn;
        anonymousClass4vn.m25407A(this);
        anonymousClass0IL.mTVViewerImpressionManager = new AnonymousClass4uW(new AnonymousClass5YV(), anonymousClass0IL, anonymousClass0IL, this.f66102Q, anonymousClass0IL.f66100O);
        anonymousClass0IL.f66093H = new AnonymousClass4vy(anonymousClass0IL.f66102Q, anonymousClass0IL, anonymousClass0IL, anonymousClass0IL.f66106U, anonymousClass0IL.mTVViewerImpressionManager);
        anonymousClass0IL.f66117f = new AnonymousClass4uw(getActivity());
        anonymousClass0IL.f66114c = new AnonymousClass4vs(getContext(), anonymousClass0IL.f66102Q, getModuleName());
        anonymousClass0IL.mTVGuideImpressionManager = new AnonymousClass4uW(new AnonymousClass5Yc(), anonymousClass0IL, anonymousClass0IL, anonymousClass0IL.f66102Q, anonymousClass0IL.f66100O);
        anonymousClass0IL.f66112a = new AnonymousClass0n5(getContext(), anonymousClass0IL.f66102Q, anonymousClass0IL, anonymousClass0IL.f66089D);
        AnonymousClass0lj anonymousClass0lj = new AnonymousClass0lj();
        anonymousClass0lj.L(anonymousClass0IL.f66117f);
        anonymousClass0lj.L(anonymousClass0IL.f66114c);
        anonymousClass0lj.L(anonymousClass0IL.mTVGuideImpressionManager);
        anonymousClass0lj.L(anonymousClass0IL.mTVViewerImpressionManager);
        a(anonymousClass0lj);
        if (arguments.getBoolean("igtv_allow_tv_guide_reset")) {
            anonymousClass0IL.f66089D.F();
        }
        Activity activity = getActivity();
        Map map = AnonymousClass26W.f26030C;
        AnonymousClass26W anonymousClass26W = (AnonymousClass26W) map.get(activity);
        if (anonymousClass26W == null) {
            anonymousClass26W = new AnonymousClass26W(activity);
            map.put(activity, anonymousClass26W);
        }
        anonymousClass0IL.f66113b = anonymousClass26W;
        anonymousClass0IL.f66113b.f26031B = AnonymousClass2CH.B(getContext(), anonymousClass0IL.f66102Q);
        AnonymousClass0cQ.G(anonymousClass0IL, 5655047, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1121295768);
        AnonymousClass0TK anonymousClass4vp = new AnonymousClass4vp(getActivity(), this, this.f66102Q);
        this.mAudioController = anonymousClass4vp;
        registerLifecycleListener(anonymousClass4vp);
        View inflate = layoutInflater.inflate(C0164R.layout.igtv_viewer, viewGroup, false);
        AnonymousClass0cQ.G(this, -1975301595, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, -1634301594);
        super.onDestroy();
        getActivity().D().S(this.mBackStackChangedListener);
        AnonymousClass0cQ.G(this, 1000593790, F);
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -335720572);
        super.onDestroyView();
        m27477Y(false);
        AnonymousClass0F4.f2058E.D(AnonymousClass13e.class, this.f66119h);
        this.f66090E.f58742B.clear();
        if (this.f66099N) {
            AnonymousClass1W1 anonymousClass1W1 = this.f66103R;
            String str = this.f66092G;
            AnonymousClass0bP B = AnonymousClass1W1.B(anonymousClass1W1, "igtv_viewer_exit");
            if (str != null) {
                B.f6726B = str;
            }
            AnonymousClass0bN.f(B.B(), AnonymousClass0dd.REGULAR);
            this.f66092G = null;
        }
        ((AnonymousClass4vh) AnonymousClass2CP.f27395B.B()).f58530B = new WeakReference(null);
        this.mTVGuideController.destroy();
        AnonymousClass5YS.m27508C(this.mVideoPlayerController, "fragment_paused");
        this.mChannelPager.K(this);
        AnonymousClass4vo anonymousClass4vo = this.mDragToDismissController;
        if (anonymousClass4vo != null) {
            anonymousClass4vo.destroy();
        }
        AnonymousClass5YR anonymousClass5YR = this.mModalDrawerController;
        this.f66115d = anonymousClass5YR.f66123D.C() ? anonymousClass5YR.f66124E : null;
        this.mModalDrawerController.destroy();
        unregisterLifecycleListener(this.mSearchController);
        unregisterLifecycleListener(this.mAudioController);
        AnonymousClass0n5 anonymousClass0n5 = this.f66112a;
        anonymousClass0n5.f9998D.B();
        anonymousClass0n5.f9998D = null;
        AnonymousClass4vg.m25394D(this.f66102Q).f58528B.clear();
        IGTVViewerFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.G(this, 63103832, F);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.mVideoPlaybackStateManager.m25446D(false);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -511535282);
        super.onPause();
        if (!this.f66113b.f26031B) {
            m27471S();
        }
        AnonymousClass0cQ.G(this, 388273337, F);
    }

    public final void onPictureInPictureModeChanged(boolean z) {
        if (z) {
            this.mTVGuideController.m27546A(true);
            this.mTVGuideController.m27555J(false);
        } else {
            this.mTVGuideController.m27555J(true);
        }
        AnonymousClass4uq.m25339B(getContext()).m25347E(z);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 822033574);
        super.onResume();
        if (this.f66106U.m25409C()) {
            if (this.f66120i.m25459A(m27457E(this))) {
                AnonymousClass0w7.D(getContext());
            }
        }
        AnonymousClass4uq.m25339B(getContext()).m25343A(this);
        if (this.f66097L) {
            AnonymousClass4uq.m25339B(getContext()).m25345C();
        }
        this.f66111Z.B();
        this.mTVGuideController.f66230P.B();
        this.f66112a.C();
        m27460H(this);
        Bundle bundle = this.f66110Y;
        if (bundle != null) {
            bundle.putBoolean("CommentThreadFragment.COMMENTS_FOR_IGTV_SHARE", true);
            this.f66110Y = null;
            new AnonymousClass0Sn(ModalActivity.class, "comments", bundle, getActivity(), this.f66102Q.f1759C).B(getActivity().getApplicationContext());
        } else {
            AnonymousClass1W5 anonymousClass1W5 = this.f66115d;
            if (anonymousClass1W5 != null) {
                this.f66115d = null;
                if (this.mDrawerContent.getHeight() > 0) {
                    m27463K(this, anonymousClass1W5);
                } else {
                    this.mDrawerContent.addOnLayoutChangeListener(new AnonymousClass4w1(this, anonymousClass1W5));
                }
            }
        }
        this.mVideoPlaybackStateManager.m25448F(true);
        m27480b();
        AnonymousClass0cQ.G(this, -263152050, F);
    }

    public final void onStop() {
        int F = AnonymousClass0cQ.F(this, 1784025454);
        super.onStop();
        if (this.f66113b.f26031B) {
            m27471S();
        }
        AnonymousClass0cQ.G(this, -321592405, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        boolean L;
        AnonymousClass4uW anonymousClass4uW;
        AnonymousClass5Yb anonymousClass5Yb;
        GestureManagerFrameLayout gestureManagerFrameLayout;
        List arrayList;
        List arrayList2;
        GestureManagerFrameLayout gestureManagerFrameLayout2;
        int i;
        AnonymousClass1W1 anonymousClass1W1;
        IGTVLaunchAnalytics iGTVLaunchAnalytics;
        AnonymousClass0bP B;
        View view2 = view;
        super.onViewCreated(view2, bundle);
        this.mVideoPlaybackStateManager = new AnonymousClass4wV();
        this.mInnerContainer = view2.findViewById(C0164R.id.inner_container);
        m27480b();
        this.mInsightsView = view2.findViewById(C0164R.id.insights_container);
        AnonymousClass0TK inAppNuxContoller = new InAppNuxContoller(view2, this.f66102Q, this);
        this.mInAppNuxContoller = inAppNuxContoller;
        registerLifecycleListener(inAppNuxContoller);
        ((AnonymousClass4vh) AnonymousClass2CP.f27395B.B()).f58530B = new WeakReference(this);
        this.mVideoPlayerController = new AnonymousClass5YS(this, this.f66102Q, this, this.f66100O);
        this.mVideoPlaybackStateManager.f58679I = new WeakReference(this.mVideoPlayerController);
        this.mVolumeIndicator = (VolumeIndicator) view2.findViewById(C0164R.id.volume_indicator);
        ReboundViewPager reboundViewPager = (ReboundViewPager) view2.findViewById(C0164R.id.viewer_pager);
        this.mChannelPager = reboundViewPager;
        reboundViewPager.setMinPagingVelocity((int) AnonymousClass0Nm.C(getContext(), StartupQEsConfig.DEFAULT_IDLE_MAX_INTERVAL_MS));
        this.mRootView = (GestureManagerFrameLayout) view2.findViewById(C0164R.id.root_container);
        view2.findViewById(C0164R.id.system_window_spy).addOnLayoutChangeListener(new AnonymousClass4wD(this));
        Activity activity = getActivity();
        AnonymousClass0Fz loaderManager = getLoaderManager();
        ViewGroup viewGroup = (ViewGroup) view2;
        AnonymousClass4xO anonymousClass4xO = this.f66118g;
        AnonymousClass4wx anonymousClass4wx = this.f66090E;
        AnonymousClass0Cm anonymousClass0Cm = this.f66102Q;
        boolean F = m27458F(this);
        if (!this.f66101P) {
            if (!m27458F(r0) || !r0.f66104S) {
                z = false;
                L = AnonymousClass0EF.L(getContext());
                anonymousClass4uW = r0.mTVGuideImpressionManager;
                anonymousClass5Yb = new AnonymousClass5Yb(activity, loaderManager, viewGroup, r0, anonymousClass4xO, anonymousClass4wx, anonymousClass0Cm, F, z, L, anonymousClass4uW, r0.f66103R, r0.f66089D, r0.f66087B);
                r0.mTVGuideController = anonymousClass5Yb;
                anonymousClass5Yb.m27555J(false);
                r0.mSearchController = new IGTVSearchController(r0, r0.mRootView, r0.f66102Q, r0, r0.f66103R);
                registerLifecycleListener(r0.mSearchController);
                r0.mChannelPager.setBufferBias(((Boolean) AnonymousClass0CC.AM.H(r0.f66102Q)).booleanValue() ? AnonymousClass1Iv.BIAS_CENTER : AnonymousClass1Iv.BIAS_END);
                r0.mChannelPager.setAdapter(r0.f66093H);
                r0.mChannelPager.setPageSpacing(0.0f);
                r0.mChannelPager.A(r0);
                r0.mChannelPager.setSpringConfig(AnonymousClass1It.PAGING, AnonymousClass0e5.C(40.0d, 9.0d));
                r0.mChannelPager.setItemPositioner(new AnonymousClass4vq(r0.f66102Q, AnonymousClass0Nm.C(getContext(), 5500)));
                if (AnonymousClass0HV.D(r0.f66102Q).f2646B.getBoolean("felix_debug_overlay_enabled", false)) {
                    AnonymousClass5YS anonymousClass5YS = r0.mVideoPlayerController;
                    ViewGroup viewGroup2 = r0.mRootView;
                    TextView textView = new TextView(viewGroup2.getContext());
                    anonymousClass5YS.f66138C = textView;
                    textView.setLayoutParams(new LayoutParams(-2, -2));
                    anonymousClass5YS.f66138C.setText(anonymousClass5YS.f66140E);
                    anonymousClass5YS.f66138C.setTextColor(-16711936);
                    anonymousClass5YS.f66138C.setBackgroundColor(Color.argb(128, 0, 0, 0));
                    anonymousClass5YS.f66138C.setTextSize(12.0f);
                    int C = (int) AnonymousClass0Nm.C(viewGroup2.getContext(), 8);
                    anonymousClass5YS.f66138C.setPadding(C, C, C, C);
                    viewGroup2.addView(anonymousClass5YS.f66138C);
                }
                r0.mVideoSeekObserver = new AnonymousClass5YT(getContext(), r0);
                r0.mChromeRevealGestureObserver = new AnonymousClass5YN(getContext(), r0);
                gestureManagerFrameLayout = r0.mRootView;
                arrayList = new ArrayList();
                arrayList2 = new ArrayList();
                arrayList.add(r0.mSearchController);
                arrayList.add(r0.mTVGuideController);
                if (!getArguments().getBoolean("disable_drag_to_dismiss")) {
                    AnonymousClass4vo anonymousClass4vo = new AnonymousClass4vo(view2, r0);
                    r0.mDragToDismissController = anonymousClass4vo;
                    arrayList.add(anonymousClass4vo);
                }
                arrayList2.add(r0.mChromeRevealGestureObserver);
                arrayList2.add(r0.mVideoSeekObserver);
                r0.mGestureManager = new AnonymousClass4ut(gestureManagerFrameLayout, arrayList, arrayList2);
                r0.f66090E.m25473A(r0);
                if (m27458F(r0)) {
                    if (r0.f66101P) {
                        m27467O(r0);
                    }
                } else if (!r0.f66104S) {
                    r0.mTVGuideController.m27555J(false);
                }
                r0.mDrawerContent = view2.findViewById(C0164R.id.drawer_content);
                gestureManagerFrameLayout2 = (GestureManagerFrameLayout) view2.findViewById(C0164R.id.modal_drawer_container);
                r0.mModalDrawerController = new AnonymousClass5YR(getActivity(), getChildFragmentManager(), gestureManagerFrameLayout2, (ViewGroup) r0.mDrawerContent, 0.7f, r0.f66102Q, r0, r0, new AnonymousClass5YQ(r0, gestureManagerFrameLayout2));
                m27477Y(true);
                AnonymousClass0F4.f2058E.A(AnonymousClass13e.class, r0.f66119h);
                i = 1 ^ getArguments().getBoolean("igtv_do_not_animate_launch", false);
                if (AnonymousClass0EF.L(getContext()) && r0.f66095J == AnonymousClass4wH.NOT_STARTED && i != 0) {
                    m27476X();
                } else {
                    m27455C(r0);
                }
                anonymousClass1W1 = r0.f66103R;
                iGTVLaunchAnalytics = r0.f66107V;
                B = AnonymousClass1W1.B(anonymousClass1W1, "igtv_viewer_entry");
                if (iGTVLaunchAnalytics != null) {
                    if (iGTVLaunchAnalytics.f13866C != null) {
                        B.iB = Boolean.valueOf(iGTVLaunchAnalytics.f13866C.booleanValue());
                    }
                    if (iGTVLaunchAnalytics.f13865B != null) {
                        B.dB = Boolean.valueOf(iGTVLaunchAnalytics.f13865B.booleanValue());
                    }
                    if (iGTVLaunchAnalytics.f13867D != null) {
                        B.QC = iGTVLaunchAnalytics.f13867D;
                    }
                }
                AnonymousClass0bN.f(B.B(), AnonymousClass0dd.REGULAR);
                r11.f66112a.B();
            }
        }
        z = true;
        L = AnonymousClass0EF.L(getContext());
        anonymousClass4uW = r0.mTVGuideImpressionManager;
        anonymousClass5Yb = new AnonymousClass5Yb(activity, loaderManager, viewGroup, r0, anonymousClass4xO, anonymousClass4wx, anonymousClass0Cm, F, z, L, anonymousClass4uW, r0.f66103R, r0.f66089D, r0.f66087B);
        r0.mTVGuideController = anonymousClass5Yb;
        anonymousClass5Yb.m27555J(false);
        r0.mSearchController = new IGTVSearchController(r0, r0.mRootView, r0.f66102Q, r0, r0.f66103R);
        registerLifecycleListener(r0.mSearchController);
        if (((Boolean) AnonymousClass0CC.AM.H(r0.f66102Q)).booleanValue()) {
        }
        r0.mChannelPager.setBufferBias(((Boolean) AnonymousClass0CC.AM.H(r0.f66102Q)).booleanValue() ? AnonymousClass1Iv.BIAS_CENTER : AnonymousClass1Iv.BIAS_END);
        r0.mChannelPager.setAdapter(r0.f66093H);
        r0.mChannelPager.setPageSpacing(0.0f);
        r0.mChannelPager.A(r0);
        r0.mChannelPager.setSpringConfig(AnonymousClass1It.PAGING, AnonymousClass0e5.C(40.0d, 9.0d));
        r0.mChannelPager.setItemPositioner(new AnonymousClass4vq(r0.f66102Q, AnonymousClass0Nm.C(getContext(), 5500)));
        if (AnonymousClass0HV.D(r0.f66102Q).f2646B.getBoolean("felix_debug_overlay_enabled", false)) {
            AnonymousClass5YS anonymousClass5YS2 = r0.mVideoPlayerController;
            ViewGroup viewGroup22 = r0.mRootView;
            TextView textView2 = new TextView(viewGroup22.getContext());
            anonymousClass5YS2.f66138C = textView2;
            textView2.setLayoutParams(new LayoutParams(-2, -2));
            anonymousClass5YS2.f66138C.setText(anonymousClass5YS2.f66140E);
            anonymousClass5YS2.f66138C.setTextColor(-16711936);
            anonymousClass5YS2.f66138C.setBackgroundColor(Color.argb(128, 0, 0, 0));
            anonymousClass5YS2.f66138C.setTextSize(12.0f);
            int C2 = (int) AnonymousClass0Nm.C(viewGroup22.getContext(), 8);
            anonymousClass5YS2.f66138C.setPadding(C2, C2, C2, C2);
            viewGroup22.addView(anonymousClass5YS2.f66138C);
        }
        r0.mVideoSeekObserver = new AnonymousClass5YT(getContext(), r0);
        r0.mChromeRevealGestureObserver = new AnonymousClass5YN(getContext(), r0);
        gestureManagerFrameLayout = r0.mRootView;
        arrayList = new ArrayList();
        arrayList2 = new ArrayList();
        arrayList.add(r0.mSearchController);
        arrayList.add(r0.mTVGuideController);
        if (getArguments().getBoolean("disable_drag_to_dismiss")) {
            AnonymousClass4vo anonymousClass4vo2 = new AnonymousClass4vo(view2, r0);
            r0.mDragToDismissController = anonymousClass4vo2;
            arrayList.add(anonymousClass4vo2);
        }
        arrayList2.add(r0.mChromeRevealGestureObserver);
        arrayList2.add(r0.mVideoSeekObserver);
        r0.mGestureManager = new AnonymousClass4ut(gestureManagerFrameLayout, arrayList, arrayList2);
        r0.f66090E.m25473A(r0);
        if (m27458F(r0)) {
            if (r0.f66101P) {
                m27467O(r0);
            }
        } else if (r0.f66104S) {
            r0.mTVGuideController.m27555J(false);
        }
        r0.mDrawerContent = view2.findViewById(C0164R.id.drawer_content);
        gestureManagerFrameLayout2 = (GestureManagerFrameLayout) view2.findViewById(C0164R.id.modal_drawer_container);
        r0.mModalDrawerController = new AnonymousClass5YR(getActivity(), getChildFragmentManager(), gestureManagerFrameLayout2, (ViewGroup) r0.mDrawerContent, 0.7f, r0.f66102Q, r0, r0, new AnonymousClass5YQ(r0, gestureManagerFrameLayout2));
        m27477Y(true);
        AnonymousClass0F4.f2058E.A(AnonymousClass13e.class, r0.f66119h);
        i = 1 ^ getArguments().getBoolean("igtv_do_not_animate_launch", false);
        if (AnonymousClass0EF.L(getContext())) {
        }
        m27455C(r0);
        anonymousClass1W1 = r0.f66103R;
        iGTVLaunchAnalytics = r0.f66107V;
        B = AnonymousClass1W1.B(anonymousClass1W1, "igtv_viewer_entry");
        if (iGTVLaunchAnalytics != null) {
            if (iGTVLaunchAnalytics.f13866C != null) {
                B.iB = Boolean.valueOf(iGTVLaunchAnalytics.f13866C.booleanValue());
            }
            if (iGTVLaunchAnalytics.f13865B != null) {
                B.dB = Boolean.valueOf(iGTVLaunchAnalytics.f13865B.booleanValue());
            }
            if (iGTVLaunchAnalytics.f13867D != null) {
                B.QC = iGTVLaunchAnalytics.f13867D;
            }
        }
        AnonymousClass0bN.f(B.B(), AnonymousClass0dd.REGULAR);
        r11.f66112a.B();
    }

    /* renamed from: p */
    public final boolean m27496p() {
        AnonymousClass4wV anonymousClass4wV = this.mVideoPlaybackStateManager;
        if (!(anonymousClass4wV.f58673C || anonymousClass4wV.f58676F || !anonymousClass4wV.f58675E || anonymousClass4wV.f58674D || (anonymousClass4wV.f58678H && anonymousClass4wV.f58677G))) {
            if (anonymousClass4wV.f58672B < 3) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    public final void m27497q(Drawable drawable) {
        if (!(getActivity() == null || getActivity().getWindow() == null)) {
            if (getActivity().getWindow().getDecorView() != null) {
                getActivity().getWindow().getDecorView().setBackgroundDrawable(drawable);
            }
        }
    }

    public final void uy(AnonymousClass1Iw anonymousClass1Iw, AnonymousClass1Iw anonymousClass1Iw2) {
        this.mVideoPlaybackStateManager.m25455M(anonymousClass1Iw == AnonymousClass1Iw.DRAGGING);
    }

    public final void xn(boolean z, boolean z2) {
        AnonymousClass5Yb anonymousClass5Yb = this.mTVGuideController;
        if (anonymousClass5Yb != null) {
            if (z2) {
                anonymousClass5Yb.f66232R.m25477A(AnonymousClass4xG.UPLOAD_FAILED, true);
            } else if (z) {
                anonymousClass5Yb.f66232R.m25477A(AnonymousClass4xG.UPLOADING, true);
            } else {
                anonymousClass5Yb.f66232R.m25477A(AnonymousClass4xG.NORMAL, true);
            }
        }
    }

    public final void ys(int i, int i2) {
        AnonymousClass0P7 G;
        AnonymousClass2CT A = this.f66093H.m25431A(i);
        this.f66090E.m25474B(A);
        if (A != null && A.S()) {
            G = A.G();
            if (!(G.OA() == null || G.OA().f8562L == null)) {
                AnonymousClass2NV anonymousClass2NV = G.OA().f8562L;
                if (!anonymousClass2NV.A().isEmpty() && ((Boolean) AnonymousClass0CC.BM.H(this.f66102Q)).booleanValue()) {
                    AnonymousClass0Gs.f2431j.D((String) anonymousClass2NV.A().get(0)).B();
                }
            }
        }
        this.f66120i.m25460B(getContext(), getLoaderManager(), this.f66102Q, A);
        if (A.S()) {
            G = A.G();
            this.f66114c.m25419B(G, i);
            if (G != null) {
                m27454B(this, G);
            }
        }
    }
}
