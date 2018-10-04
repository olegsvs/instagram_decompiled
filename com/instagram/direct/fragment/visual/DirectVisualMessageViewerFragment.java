package com.instagram.direct.fragment.visual;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ca;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Ci;
import X.AnonymousClass0Cm;
import X.AnonymousClass0Cn;
import X.AnonymousClass0E6;
import X.AnonymousClass0EA;
import X.AnonymousClass0EE;
import X.AnonymousClass0F4;
import X.AnonymousClass0F8;
import X.AnonymousClass0Gn;
import X.AnonymousClass0HV;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IL;
import X.AnonymousClass0IQ;
import X.AnonymousClass0IS;
import X.AnonymousClass0Iw;
import X.AnonymousClass0Ix;
import X.AnonymousClass0LH;
import X.AnonymousClass0Lq;
import X.AnonymousClass0Ls;
import X.AnonymousClass0MJ;
import X.AnonymousClass0NN;
import X.AnonymousClass0Nm;
import X.AnonymousClass0ON;
import X.AnonymousClass0P7;
import X.AnonymousClass0PZ;
import X.AnonymousClass0Pt;
import X.AnonymousClass0Pu;
import X.AnonymousClass0Pv;
import X.AnonymousClass0QI;
import X.AnonymousClass0QS;
import X.AnonymousClass0QU;
import X.AnonymousClass0QW;
import X.AnonymousClass0QZ;
import X.AnonymousClass0Qb;
import X.AnonymousClass0Qd;
import X.AnonymousClass0RN;
import X.AnonymousClass0Sn;
import X.AnonymousClass0TK;
import X.AnonymousClass0Tw;
import X.AnonymousClass0U4;
import X.AnonymousClass0UP;
import X.AnonymousClass0UT;
import X.AnonymousClass0Uu;
import X.AnonymousClass0V0;
import X.AnonymousClass0Vm;
import X.AnonymousClass0Vw;
import X.AnonymousClass0W7;
import X.AnonymousClass0WH;
import X.AnonymousClass0WS;
import X.AnonymousClass0Ww;
import X.AnonymousClass0X5;
import X.AnonymousClass0XB;
import X.AnonymousClass0ZF;
import X.AnonymousClass0cN;
import X.AnonymousClass0cQ;
import X.AnonymousClass0ct;
import X.AnonymousClass0dw;
import X.AnonymousClass0e6;
import X.AnonymousClass0e8;
import X.AnonymousClass0ea;
import X.AnonymousClass0gV;
import X.AnonymousClass0gb;
import X.AnonymousClass0hj;
import X.AnonymousClass0jC;
import X.AnonymousClass0w0;
import X.AnonymousClass0w9;
import X.AnonymousClass14H;
import X.AnonymousClass14e;
import X.AnonymousClass15I;
import X.AnonymousClass15d;
import X.AnonymousClass160;
import X.AnonymousClass18S;
import X.AnonymousClass1Pk;
import X.AnonymousClass1Sc;
import X.AnonymousClass1Si;
import X.AnonymousClass1Zb;
import X.AnonymousClass1dZ;
import X.AnonymousClass1iG;
import X.AnonymousClass2G6;
import X.AnonymousClass4Yj;
import X.AnonymousClass4ZJ;
import X.AnonymousClass4ZK;
import X.AnonymousClass4ZL;
import X.AnonymousClass4ZS;
import X.AnonymousClass4ZT;
import X.AnonymousClass4ZU;
import X.AnonymousClass4ZV;
import X.AnonymousClass4ZW;
import X.AnonymousClass4dK;
import X.AnonymousClass4dL;
import X.AnonymousClass4dM;
import X.AnonymousClass4dO;
import X.AnonymousClass4dP;
import X.AnonymousClass4dQ;
import X.AnonymousClass4dR;
import X.AnonymousClass4dS;
import X.AnonymousClass4dT;
import X.AnonymousClass4dU;
import X.AnonymousClass4dV;
import X.AnonymousClass4dW;
import X.AnonymousClass4dX;
import X.AnonymousClass4dY;
import X.AnonymousClass4dZ;
import X.AnonymousClass4da;
import X.AnonymousClass4e0;
import X.AnonymousClass4go;
import X.AnonymousClass4gp;
import X.AnonymousClass4gq;
import X.AnonymousClass4lK;
import X.AnonymousClass4lb;
import X.AnonymousClass4mC;
import X.AnonymousClass59D;
import X.AnonymousClass59I;
import X.AnonymousClass5Bm;
import X.AnonymousClass5Bn;
import X.AnonymousClass5CD;
import X.AnonymousClass5E8;
import X.AnonymousClass5EB;
import X.AnonymousClass5Vq;
import X.AnonymousClass5Vr;
import X.AnonymousClass5Vs;
import X.AnonymousClass5Wv;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.facebook.proxygen.TraceEventType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.venue.Venue;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;
import com.instagram.ui.widget.volume.VolumeIndicator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import org.webrtc.audio.WebRtcAudioRecord;

public class DirectVisualMessageViewerFragment extends AnonymousClass0IJ implements AnonymousClass0IS, AnonymousClass0QS, AnonymousClass0QU, AnonymousClass0QW, AnonymousClass0QZ, AnonymousClass0Qb, AnonymousClass0QI, AnonymousClass0Qd, OnKeyListener {
    /* renamed from: B */
    public AnonymousClass59D f65456B;
    /* renamed from: C */
    public AnonymousClass0MJ f65457C;
    /* renamed from: D */
    public float f65458D = 0.0f;
    /* renamed from: E */
    public AnonymousClass0Tw f65459E;
    /* renamed from: F */
    public AnonymousClass0W7 f65460F;
    /* renamed from: G */
    public String f65461G;
    /* renamed from: H */
    public RectF f65462H;
    /* renamed from: I */
    public boolean f65463I;
    /* renamed from: J */
    public AnonymousClass0w0 f65464J;
    /* renamed from: K */
    public boolean f65465K = false;
    /* renamed from: L */
    public boolean f65466L = false;
    /* renamed from: M */
    public final AnonymousClass0XB f65467M = new AnonymousClass4dW(this);
    /* renamed from: N */
    public AnonymousClass5Vr f65468N;
    /* renamed from: O */
    public boolean f65469O;
    /* renamed from: P */
    public int f65470P = 3;
    /* renamed from: Q */
    public String f65471Q;
    /* renamed from: R */
    public AnonymousClass0jC f65472R;
    /* renamed from: S */
    public CircularImageView f65473S;
    /* renamed from: T */
    public AnonymousClass59I f65474T;
    /* renamed from: U */
    public String f65475U;
    /* renamed from: V */
    public boolean f65476V;
    /* renamed from: W */
    public int f65477W;
    /* renamed from: X */
    public int f65478X;
    /* renamed from: Y */
    public AnonymousClass5E8 f65479Y;
    /* renamed from: Z */
    public AnonymousClass5EB f65480Z;
    /* renamed from: a */
    public boolean f65481a = true;
    /* renamed from: b */
    public boolean f65482b;
    /* renamed from: c */
    public AnonymousClass0Vw f65483c;
    /* renamed from: d */
    public Toast f65484d;
    /* renamed from: e */
    public AnonymousClass0Cm f65485e;
    /* renamed from: f */
    public AnonymousClass4gq f65486f;
    /* renamed from: g */
    public boolean f65487g;
    /* renamed from: h */
    public String f65488h;
    /* renamed from: i */
    private AnonymousClass4lb f65489i;
    /* renamed from: j */
    private AnonymousClass4ZS f65490j;
    /* renamed from: k */
    private AnonymousClass0Iw f65491k;
    /* renamed from: l */
    private final AnonymousClass0F8 f65492l = new AnonymousClass4dV(this);
    /* renamed from: m */
    private int f65493m;
    public View mBackgroundDimmer;
    public AnonymousClass0ct mBlurImageViewContainerStubHolder;
    public EditText mComposerEditText;
    public TextWatcher mComposerTextWatcher;
    public AnonymousClass4ZK mContentHolder;
    public View mContentView;
    public View mItemView;
    public AnonymousClass0hj mKeyboardHeightChangeDetector;
    public AnonymousClass1Pk mPhotoTimerController;
    public SegmentedProgressBar mProgressBar;
    public AnonymousClass5Bn mReelViewerShadowAnimator;
    public View mReplyComposerContainer;
    public View mRootView;
    public AnonymousClass0ct mSparklerAnimationStubHolder;
    public View mTextSendButton;
    public AnonymousClass4mC mVideoPlayer;
    public View mViewerInfoContainer;
    public VolumeIndicator mVolumeIndicator;
    /* renamed from: n */
    private AnonymousClass0PZ f65494n;
    /* renamed from: o */
    private boolean f65495o;
    /* renamed from: p */
    private boolean f65496p;
    /* renamed from: q */
    private AnonymousClass1Zb f65497q;
    /* renamed from: r */
    private AnonymousClass4e0 f65498r;
    /* renamed from: s */
    private boolean f65499s;
    /* renamed from: t */
    private final AnonymousClass0F8 f65500t = new AnonymousClass4dT(this);
    /* renamed from: u */
    private boolean f65501u;
    /* renamed from: v */
    private final HashSet f65502v = new HashSet();
    /* renamed from: w */
    private boolean f65503w;
    /* renamed from: x */
    private String f65504x;
    /* renamed from: y */
    private DirectThreadKey f65505y;

    public final void Bu() {
    }

    public final void Du(AnonymousClass0ZF anonymousClass0ZF) {
    }

    public final AnonymousClass0IQ NM() {
        return this;
    }

    public final String getModuleName() {
        return "direct_story_viewer_fragment";
    }

    public final void zt() {
    }

    public final void Au(AnonymousClass15I anonymousClass15I, AnonymousClass160 anonymousClass160, AnonymousClass0P7 anonymousClass0P7, int i) {
        if (i < anonymousClass160.f14398E.size()) {
            AnonymousClass0U4.C(this.f65485e).B(new AnonymousClass0UT(this.f65505y, this.f65486f.B().f56303N, i));
            AnonymousClass1dZ.D(m27214K(this).f56305P).f6307O = Integer.valueOf(i);
            anonymousClass15I.B(this.f65485e, null);
            AnonymousClass0HV.D(this.f65485e).f2646B.edit().putBoolean("has_ever_voted_on_direct_poll", true).apply();
            return;
        }
        AnonymousClass0Gn.H("DirectVisualMessageViewerFragment", "Selected poll index out of bounds");
    }

    public final void Aw(AnonymousClass0ZF anonymousClass0ZF) {
        m27230a(this, "tapped");
    }

    /* renamed from: B */
    public static void m27205B(DirectVisualMessageViewerFragment directVisualMessageViewerFragment) {
        int i = directVisualMessageViewerFragment.f65486f.f56316B + 1;
        int min = Math.min(i + 2, directVisualMessageViewerFragment.f65486f.D());
        while (i < min) {
            AnonymousClass4go C = directVisualMessageViewerFragment.f65486f.C(i);
            if (C != null) {
                if (C.f56296G && (((Boolean) AnonymousClass0CC.SG.H(directVisualMessageViewerFragment.f65485e)).booleanValue() || ((Boolean) AnonymousClass0E6.D(AnonymousClass0CC.ea, directVisualMessageViewerFragment.f65485e)).booleanValue())) {
                    AnonymousClass1iG.B(directVisualMessageViewerFragment.f65485e, new AnonymousClass4dU(directVisualMessageViewerFragment, C), directVisualMessageViewerFragment.f65486f.f56319E, C.f56303N);
                } else {
                    m27227X(directVisualMessageViewerFragment, C);
                }
                i++;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid index ");
                stringBuilder.append(i);
                stringBuilder.append(", size is ");
                stringBuilder.append(directVisualMessageViewerFragment.f65486f.D());
                throw new IndexOutOfBoundsException(stringBuilder.toString());
            }
        }
    }

    public final void Bw(AnonymousClass0ZF anonymousClass0ZF) {
        m27231b(this, "resume");
    }

    /* renamed from: C */
    public static boolean m27206C(DirectVisualMessageViewerFragment directVisualMessageViewerFragment) {
        return ((m27214K(directVisualMessageViewerFragment).f56298I ^ 1) == 0 || directVisualMessageViewerFragment.mBackgroundDimmer.getVisibility() == 0) ? false : true;
    }

    public final boolean CX() {
        return m27214K(this).E();
    }

    /* renamed from: D */
    public static void m27207D(DirectVisualMessageViewerFragment directVisualMessageViewerFragment, boolean z) {
        CircularImageView circularImageView = directVisualMessageViewerFragment.f65473S;
        if (circularImageView != null && directVisualMessageViewerFragment.mContentView != null) {
            if (z) {
                circularImageView.setLayerType(2, null);
                directVisualMessageViewerFragment.mContentView.setLayerType(2, null);
                return;
            }
            circularImageView.setLayerType(0, null);
            directVisualMessageViewerFragment.mContentView.setLayerType(0, null);
        }
    }

    /* renamed from: E */
    public static void m27208E(DirectVisualMessageViewerFragment directVisualMessageViewerFragment, int i, boolean z) {
        if (!directVisualMessageViewerFragment.f65495o) {
            Object obj;
            int height;
            Object obj2;
            float centerX;
            float centerY;
            float f;
            float f2;
            AnonymousClass14H N;
            AnonymousClass5Bn anonymousClass5Bn;
            AnonymousClass0cN C;
            RectF L;
            AnonymousClass14H K;
            directVisualMessageViewerFragment.f65495o = true;
            if (directVisualMessageViewerFragment.f65456B.m25847B()) {
                AnonymousClass59D anonymousClass59D = directVisualMessageViewerFragment.f65456B;
                if (anonymousClass59D.m25847B()) {
                    anonymousClass59D.f60562E.A(false);
                }
            }
            m27221R(directVisualMessageViewerFragment);
            m27228Y(directVisualMessageViewerFragment, i);
            if (directVisualMessageViewerFragment.mContentHolder != null) {
                if (directVisualMessageViewerFragment.isResumed()) {
                    obj = null;
                    if (obj != null) {
                        directVisualMessageViewerFragment.getActivity().finish();
                    } else if (directVisualMessageViewerFragment.f65462H != null) {
                        m27207D(directVisualMessageViewerFragment, true);
                        height = directVisualMessageViewerFragment.Z().getWindow().getDecorView().getHeight();
                        m27212I(directVisualMessageViewerFragment).G(z ? (float) (-height) : (float) height).N();
                    } else {
                        AnonymousClass0LH.E(directVisualMessageViewerFragment.f65462H);
                        m27207D(directVisualMessageViewerFragment, true);
                        obj2 = null;
                        if (!"inbox".equals(directVisualMessageViewerFragment.f65461G)) {
                            if (m27214K(directVisualMessageViewerFragment).f56303N != null && m27214K(directVisualMessageViewerFragment).f56303N.equals(directVisualMessageViewerFragment.f65471Q)) {
                            }
                            if (directVisualMessageViewerFragment.f65487g || obj2 == null) {
                                if (obj2 != null) {
                                    centerX = directVisualMessageViewerFragment.f65462H.centerX();
                                    centerY = directVisualMessageViewerFragment.f65462H.centerY();
                                } else {
                                    centerX = (float) (directVisualMessageViewerFragment.f65478X / 2);
                                    centerY = (float) (directVisualMessageViewerFragment.f65477W / 2);
                                }
                                f = 0.0f;
                                f2 = 0.0f;
                            } else {
                                f2 = directVisualMessageViewerFragment.f65462H.width() / ((float) directVisualMessageViewerFragment.f65478X);
                                f = directVisualMessageViewerFragment.f65462H.height() / ((float) directVisualMessageViewerFragment.f65477W);
                                centerX = 0.0f;
                                centerY = 0.0f;
                            }
                            N = m27212I(directVisualMessageViewerFragment).C(1.0f, f2, centerX).D(1.0f, f, centerY).N();
                            if (directVisualMessageViewerFragment.f65487g && obj2 != null) {
                                N.H(0.0f, directVisualMessageViewerFragment.f65462H.left).I(0.0f, directVisualMessageViewerFragment.f65462H.top).f13849O = new AnonymousClass4dR(directVisualMessageViewerFragment);
                            }
                            N.N();
                            AnonymousClass14H.C(directVisualMessageViewerFragment.mRootView).J().C(directVisualMessageViewerFragment.mRootView.getScaleX(), 1.0f, -1.0f).D(directVisualMessageViewerFragment.mRootView.getScaleY(), 1.0f, -1.0f).G(0.0f).K(true).L(AnonymousClass14e.f13963B).N();
                            anonymousClass5Bn = directVisualMessageViewerFragment.mReelViewerShadowAnimator;
                            C = AnonymousClass0e6.B().C();
                            C.f7108F = true;
                            C.L((double) anonymousClass5Bn.f60998B).A(new AnonymousClass5Bm(anonymousClass5Bn)).N(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
                        }
                        L = AnonymousClass0Nm.L(directVisualMessageViewerFragment.mContentHolder.f55354T);
                        centerX = L.width() / ((float) directVisualMessageViewerFragment.f65473S.getWidth());
                        centerY = directVisualMessageViewerFragment.f65462H.width() / ((float) directVisualMessageViewerFragment.f65473S.getWidth());
                        K = AnonymousClass14H.C(directVisualMessageViewerFragment.f65473S).C(centerX, centerY, 0.0f).D(centerX, centerY, 0.0f).H(L.left, directVisualMessageViewerFragment.f65462H.left).I(L.top, directVisualMessageViewerFragment.f65462H.top).L(AnonymousClass14e.f13963B).K(true);
                        K.f13863c = 0;
                        K.f13862b = 4;
                        K.N();
                        obj2 = 1;
                        if (directVisualMessageViewerFragment.f65487g) {
                        }
                        if (obj2 != null) {
                            centerX = (float) (directVisualMessageViewerFragment.f65478X / 2);
                            centerY = (float) (directVisualMessageViewerFragment.f65477W / 2);
                        } else {
                            centerX = directVisualMessageViewerFragment.f65462H.centerX();
                            centerY = directVisualMessageViewerFragment.f65462H.centerY();
                        }
                        f = 0.0f;
                        f2 = 0.0f;
                        N = m27212I(directVisualMessageViewerFragment).C(1.0f, f2, centerX).D(1.0f, f, centerY).N();
                        N.H(0.0f, directVisualMessageViewerFragment.f65462H.left).I(0.0f, directVisualMessageViewerFragment.f65462H.top).f13849O = new AnonymousClass4dR(directVisualMessageViewerFragment);
                        N.N();
                        AnonymousClass14H.C(directVisualMessageViewerFragment.mRootView).J().C(directVisualMessageViewerFragment.mRootView.getScaleX(), 1.0f, -1.0f).D(directVisualMessageViewerFragment.mRootView.getScaleY(), 1.0f, -1.0f).G(0.0f).K(true).L(AnonymousClass14e.f13963B).N();
                        anonymousClass5Bn = directVisualMessageViewerFragment.mReelViewerShadowAnimator;
                        C = AnonymousClass0e6.B().C();
                        C.f7108F = true;
                        C.L((double) anonymousClass5Bn.f60998B).A(new AnonymousClass5Bm(anonymousClass5Bn)).N(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
                    }
                }
            }
            obj = 1;
            if (obj != null) {
                directVisualMessageViewerFragment.getActivity().finish();
            } else if (directVisualMessageViewerFragment.f65462H != null) {
                AnonymousClass0LH.E(directVisualMessageViewerFragment.f65462H);
                m27207D(directVisualMessageViewerFragment, true);
                obj2 = null;
                if (!"inbox".equals(directVisualMessageViewerFragment.f65461G)) {
                    L = AnonymousClass0Nm.L(directVisualMessageViewerFragment.mContentHolder.f55354T);
                    centerX = L.width() / ((float) directVisualMessageViewerFragment.f65473S.getWidth());
                    centerY = directVisualMessageViewerFragment.f65462H.width() / ((float) directVisualMessageViewerFragment.f65473S.getWidth());
                    K = AnonymousClass14H.C(directVisualMessageViewerFragment.f65473S).C(centerX, centerY, 0.0f).D(centerX, centerY, 0.0f).H(L.left, directVisualMessageViewerFragment.f65462H.left).I(L.top, directVisualMessageViewerFragment.f65462H.top).L(AnonymousClass14e.f13963B).K(true);
                    K.f13863c = 0;
                    K.f13862b = 4;
                    K.N();
                }
                obj2 = 1;
                if (directVisualMessageViewerFragment.f65487g) {
                }
                if (obj2 != null) {
                    centerX = directVisualMessageViewerFragment.f65462H.centerX();
                    centerY = directVisualMessageViewerFragment.f65462H.centerY();
                } else {
                    centerX = (float) (directVisualMessageViewerFragment.f65478X / 2);
                    centerY = (float) (directVisualMessageViewerFragment.f65477W / 2);
                }
                f = 0.0f;
                f2 = 0.0f;
                N = m27212I(directVisualMessageViewerFragment).C(1.0f, f2, centerX).D(1.0f, f, centerY).N();
                N.H(0.0f, directVisualMessageViewerFragment.f65462H.left).I(0.0f, directVisualMessageViewerFragment.f65462H.top).f13849O = new AnonymousClass4dR(directVisualMessageViewerFragment);
                N.N();
                AnonymousClass14H.C(directVisualMessageViewerFragment.mRootView).J().C(directVisualMessageViewerFragment.mRootView.getScaleX(), 1.0f, -1.0f).D(directVisualMessageViewerFragment.mRootView.getScaleY(), 1.0f, -1.0f).G(0.0f).K(true).L(AnonymousClass14e.f13963B).N();
                anonymousClass5Bn = directVisualMessageViewerFragment.mReelViewerShadowAnimator;
                C = AnonymousClass0e6.B().C();
                C.f7108F = true;
                C.L((double) anonymousClass5Bn.f60998B).A(new AnonymousClass5Bm(anonymousClass5Bn)).N(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
            } else {
                m27207D(directVisualMessageViewerFragment, true);
                height = directVisualMessageViewerFragment.Z().getWindow().getDecorView().getHeight();
                if (z) {
                }
                m27212I(directVisualMessageViewerFragment).G(z ? (float) (-height) : (float) height).N();
            }
        }
    }

    public final void Eu(AnonymousClass0ZF anonymousClass0ZF) {
        this.f65501u = true;
        Bundle bundle;
        switch (anonymousClass0ZF.f6315W.ordinal()) {
            case 1:
                m27218O(this, anonymousClass0ZF.f6317Y.getId());
                return;
            case 2:
                Venue venue = anonymousClass0ZF.f6318Z;
                bundle = new Bundle();
                bundle.putString("LocationFeedFragment.ARGUMENT_LOCATION_VENUE_ID", venue.getId());
                new AnonymousClass0Sn(ModalActivity.class, "location_feed", bundle, getActivity(), this.f65485e.f1759C).B(getContext());
                return;
            case 3:
                Parcelable parcelable = anonymousClass0ZF.f6297E;
                bundle = new Bundle();
                bundle.putParcelable("HashtagFeedFragment.ARGUMENT_HASHTAG", parcelable);
                new AnonymousClass0Sn(ModalActivity.class, "hashtag_feed", bundle, getActivity(), this.f65485e.f1759C).B(getContext());
                return;
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                if (anonymousClass0ZF.f6306N.f28169H != null) {
                    m27218O(this, anonymousClass0ZF.f6306N.f28169H.getId());
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Unknown interactive type");
        }
    }

    /* renamed from: F */
    public static void m27209F(DirectVisualMessageViewerFragment directVisualMessageViewerFragment) {
        FrameLayout frameLayout = (FrameLayout) directVisualMessageViewerFragment.mBlurImageViewContainerStubHolder.A();
        IgImageView igImageView = (IgImageView) frameLayout.findViewById(C0164R.id.direct_visual_message_blur_image_view);
        switch (2) {
            case 0:
                igImageView.setImageRenderer(null);
                break;
            case 1:
                igImageView.setImageRenderer(AnonymousClass4lK.f56903C);
                break;
            case 2:
                igImageView.setImageRenderer(AnonymousClass4lK.f56902B);
                break;
            default:
                throw new IllegalArgumentException("Unsupported BlurSetting");
        }
        String str = directVisualMessageViewerFragment.f65486f.B().f56306Q;
        if (str != null) {
            igImageView.setUrl(str);
        } else {
            igImageView.A();
        }
        frameLayout.setForeground(new ColorDrawable(AnonymousClass0Ca.C(directVisualMessageViewerFragment.getContext(), C0164R.color.black_50_transparent)));
        AnonymousClass14H K = AnonymousClass14H.C(frameLayout).B(1.0f).K(true);
        K.f13863c = 0;
        K.N();
    }

    public final void FAA() {
        m27230a(this, "dialog");
    }

    public final /* bridge */ /* synthetic */ void Fv(Object obj) {
        AnonymousClass4go anonymousClass4go = (AnonymousClass4go) obj;
        m27225V(this, false);
    }

    /* renamed from: G */
    public static void m27210G(DirectVisualMessageViewerFragment directVisualMessageViewerFragment) {
        if (directVisualMessageViewerFragment.mBlurImageViewContainerStubHolder.C()) {
            directVisualMessageViewerFragment = AnonymousClass14H.C(directVisualMessageViewerFragment.mBlurImageViewContainerStubHolder.A()).B(0.0f).K(true);
            directVisualMessageViewerFragment.f13862b = 8;
            directVisualMessageViewerFragment.N();
        }
    }

    /* renamed from: H */
    public static String m27211H(DirectVisualMessageViewerFragment directVisualMessageViewerFragment) {
        return directVisualMessageViewerFragment.mComposerEditText.getText().toString().trim();
    }

    public final /* bridge */ /* synthetic */ void Hv(Object obj) {
        AnonymousClass4go anonymousClass4go = (AnonymousClass4go) obj;
        this.mProgressBar.setProgress(0.0f);
    }

    /* renamed from: I */
    public static AnonymousClass14H m27212I(DirectVisualMessageViewerFragment directVisualMessageViewerFragment) {
        AnonymousClass14H K = AnonymousClass14H.C(directVisualMessageViewerFragment.mContentView).J().K(true);
        K.f13863c = 0;
        K.f13862b = 4;
        K = K.L(AnonymousClass14e.f13963B);
        K.f13848N = new AnonymousClass4dS(directVisualMessageViewerFragment);
        return K;
    }

    /* renamed from: J */
    public static AnonymousClass14H m27213J(DirectVisualMessageViewerFragment directVisualMessageViewerFragment) {
        AnonymousClass14H K = AnonymousClass14H.C(directVisualMessageViewerFragment.mContentView).J().K(true);
        K.f13863c = 0;
        K = K.L(AnonymousClass14e.f13963B);
        K.f13848N = new AnonymousClass4dQ(directVisualMessageViewerFragment);
        return K;
    }

    /* renamed from: K */
    public static AnonymousClass4go m27214K(DirectVisualMessageViewerFragment directVisualMessageViewerFragment) {
        return directVisualMessageViewerFragment.f65486f.B();
    }

    /* renamed from: L */
    public static void m27215L(DirectVisualMessageViewerFragment directVisualMessageViewerFragment) {
        m27221R(directVisualMessageViewerFragment);
        m27228Y(directVisualMessageViewerFragment, 10);
        if (directVisualMessageViewerFragment.m27239b(directVisualMessageViewerFragment.f65485e.B()) == -1) {
            m27208E(directVisualMessageViewerFragment, 10, true);
        } else {
            m27219P(directVisualMessageViewerFragment);
        }
    }

    /* renamed from: M */
    public static boolean m27216M(DirectVisualMessageViewerFragment directVisualMessageViewerFragment) {
        return m27214K(directVisualMessageViewerFragment).f56298I;
    }

    /* renamed from: N */
    public static boolean m27217N(DirectVisualMessageViewerFragment directVisualMessageViewerFragment, float f) {
        float round = (float) Math.round(f);
        if (directVisualMessageViewerFragment.f65496p) {
            if (round >= ((float) directVisualMessageViewerFragment.f65493m)) {
                return true;
            }
        } else if (round <= ((float) directVisualMessageViewerFragment.f65493m)) {
            return true;
        }
        return false;
    }

    public final TouchInterceptorFrameLayout NT() {
        return (TouchInterceptorFrameLayout) getView().findViewById(C0164R.id.direct_visual_message_viewer_root_container);
    }

    public final /* bridge */ /* synthetic */ void Nv(Object obj, float f) {
        AnonymousClass4go anonymousClass4go = (AnonymousClass4go) obj;
        this.mProgressBar.setProgress(f);
        this.f65458D = f;
    }

    /* renamed from: O */
    public static void m27218O(DirectVisualMessageViewerFragment directVisualMessageViewerFragment, String str) {
        directVisualMessageViewerFragment.f65499s = true;
        Bundle bundle = new Bundle();
        bundle.putString("UserDetailFragment.EXTRA_USER_ID", str);
        new AnonymousClass0Sn(ModalActivity.class, "profile", bundle, directVisualMessageViewerFragment.getActivity(), directVisualMessageViewerFragment.f65485e.f1759C).B(directVisualMessageViewerFragment.getContext());
    }

    /* renamed from: P */
    public static void m27219P(DirectVisualMessageViewerFragment directVisualMessageViewerFragment) {
        int D;
        AnonymousClass0IL anonymousClass0IL = directVisualMessageViewerFragment;
        AnonymousClass4go B = anonymousClass0IL.f65486f.B();
        int i = anonymousClass0IL.f65486f.f56316B;
        AnonymousClass4gq anonymousClass4gq = anonymousClass0IL.f65486f;
        if (anonymousClass0IL.f65480Z == null) {
            anonymousClass0IL.f65480Z = anonymousClass0IL.f65479Y.m26007B(new AnonymousClass5Wv(anonymousClass0IL.f65485e, anonymousClass4gq.f56319E, B.getId()));
        }
        anonymousClass0IL.f65470P = 1;
        if (anonymousClass0IL.f65466L) {
            D = anonymousClass0IL.f65486f.D();
        } else {
            D = anonymousClass0IL.f65486f.f56321G;
        }
        anonymousClass0IL.f65490j.f55385J = D;
        int i2 = 0;
        anonymousClass0IL.mProgressBar.setVisibility(0);
        anonymousClass0IL.mProgressBar.setSegments(D);
        anonymousClass0IL.mProgressBar.B(i, m27216M(anonymousClass0IL), anonymousClass0IL.f65486f.B().f56303N);
        Context context = anonymousClass0IL.getContext();
        AnonymousClass4ZK anonymousClass4ZK = anonymousClass0IL.mContentHolder;
        AnonymousClass4gq anonymousClass4gq2 = anonymousClass0IL.f65486f;
        AnonymousClass0Cm anonymousClass0Cm = anonymousClass0IL.f65485e;
        AnonymousClass0Ci B2 = anonymousClass0Cm.B();
        anonymousClass4ZK.f55338D.D();
        anonymousClass4ZK.f55338D.C(C0164R.id.listener_id_for_direct_visual_message_item_viewer_image_binding);
        anonymousClass4ZK.f55342H.setVisibility(0);
        if (anonymousClass4ZK.f55336B.f55197E != null) {
            anonymousClass4ZK.f55336B.f55197E.setVisibility(8);
        }
        if (anonymousClass4ZK.f55352R.f14281C != null) {
            anonymousClass4ZK.f55352R.f14281C.setVisibility(8);
        }
        ViewGroup viewGroup = anonymousClass4ZK.f55353S.f14252B;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        if (B.f56294E) {
            int i3 = 8;
            anonymousClass4ZK.f55341G.setVisibility(8);
            boolean E = B.E();
            AnonymousClass4lK.B(anonymousClass4ZK.f55338D, E);
            if (B.C()) {
                AnonymousClass15I anonymousClass15I = anonymousClass4ZK.f55353S;
                AnonymousClass0P7 anonymousClass0P7 = B.f56299J;
                AnonymousClass15d.B(anonymousClass15I, anonymousClass0P7, B.f56305P, anonymousClass0IL, B.f56295F, anonymousClass0Cm, B.f56309T);
                if (!AnonymousClass4ZL.B(anonymousClass4ZK.f55352R, B, anonymousClass0Cm)) {
                    AnonymousClass4Yj.B(anonymousClass4ZK.f55336B, B);
                }
            }
            anonymousClass4ZK.f55338D.E(C0164R.id.listener_id_for_direct_visual_message_item_viewer_image_binding, new AnonymousClass4ZJ(E, anonymousClass0IL, anonymousClass4gq2, i, B));
            anonymousClass4ZK.f55338D.setEnableProgressBar(E ^ 1);
            String str = B.f56306Q;
            if (str != null) {
                anonymousClass4ZK.f55338D.setUrl(str);
            } else {
                anonymousClass4ZK.f55338D.D();
                AnonymousClass0Gn.C("DirectVisualMessageViewerItemBinder", "DirectVisualMessageViewerItem.getSizedImageUrl() is null.");
            }
            anonymousClass4ZK.f55338D.setVisibility(0);
            AnonymousClass0gb ET = AnonymousClass0gV.B(anonymousClass0Cm).ET();
            AnonymousClass0ct anonymousClass0ct = anonymousClass4ZK.f55351Q;
            if (ET.B("ig_zero_rating_data_banner")) {
                i3 = 0;
            }
            anonymousClass0ct.D(i3);
        } else {
            anonymousClass4ZK.f55338D.setVisibility(8);
            anonymousClass4ZK.f55341G.setText(B.E() ? C0164R.string.direct_video_no_longer_available : C0164R.string.direct_photo_no_longer_available);
            anonymousClass4ZK.f55341G.setVisibility(0);
        }
        AnonymousClass0Ci anonymousClass0Ci = B.f56309T;
        AnonymousClass0LH.E(anonymousClass0Ci);
        anonymousClass4ZK.f55354T.setUrl(anonymousClass0Ci.DQ());
        anonymousClass4ZK.f55346L.setText(anonymousClass0Ci.uT());
        anonymousClass4ZK.f55337C.setVisibility(4);
        if (B.B() || B.f56291B == null) {
            anonymousClass4ZK.f55347M.setVisibility(8);
        } else {
            String C = AnonymousClass0dw.C((double) B.f56291B.longValue(), (double) (System.currentTimeMillis() / 1000));
            anonymousClass4ZK.f55347M.setText(context.getResources().getString(C0164R.string.direct_story_from_archive, new Object[]{C}));
            anonymousClass4ZK.f55347M.setVisibility(0);
        }
        int size = anonymousClass4gq2.f56318D.size();
        if (size == 1 && !anonymousClass0Ci.getId().equals(B2.getId())) {
            anonymousClass4ZK.f55345K.setText(context.getResources().getString(C0164R.string.direct_expiring_media_to_you));
        } else if (size > 1) {
            anonymousClass4ZK.f55345K.setText(context.getResources().getString(C0164R.string.direct_expiring_media_to_group, new Object[]{anonymousClass4gq2.f56320F}));
        }
        anonymousClass4ZK.f55349O.setText(AnonymousClass0dw.I(context, (double) Long.valueOf(B.f56307R / 1000000).longValue()));
        anonymousClass0IL.mPhotoTimerController.D();
        if (!anonymousClass0IL.mVideoPlayer.m25031D(anonymousClass0IL.mContentHolder, B)) {
            anonymousClass0IL.mVideoPlayer.m25038K("scroll");
        }
        if (B.f56294E) {
            AnonymousClass0P7 anonymousClass0P72 = B.f56299J;
            if (anonymousClass0P72 != null) {
                AnonymousClass0Ls y = anonymousClass0P72.y(anonymousClass0IL.getContext());
                anonymousClass0IL.f65472R.D(anonymousClass0P72, y.f3292C, y.f3296G, false);
                anonymousClass0IL.f65472R.C(anonymousClass0P72, anonymousClass0IL.mContentHolder.f55338D);
            }
            AnonymousClass0Nm.i(anonymousClass0IL.mReplyComposerContainer, 0);
            if (B.D()) {
                anonymousClass0IL.mPhotoTimerController.A(B, anonymousClass0IL.mContentHolder.f55338D, B.f56304O.longValue() * 1000, anonymousClass0IL.f65463I);
            } else if (B.E()) {
                if (anonymousClass0IL.mVideoPlayer.m25031D(anonymousClass0IL.mContentHolder, B)) {
                    m27226W(anonymousClass0IL, anonymousClass0IL.f65486f, i, B);
                    AnonymousClass4mC anonymousClass4mC = anonymousClass0IL.mVideoPlayer;
                    anonymousClass4mC.m25037J(-anonymousClass4mC.m25029B(), "loop");
                } else {
                    AnonymousClass4ZK anonymousClass4ZK2 = anonymousClass0IL.mContentHolder;
                    if (!anonymousClass0IL.f65463I) {
                        i2 = 4;
                    }
                    anonymousClass4ZK2.ZSA(i2);
                    anonymousClass0IL.f65498r.B(anonymousClass0IL.getContext(), new AnonymousClass5Vq(anonymousClass0IL, i, B), B, B.f56296G, anonymousClass0IL.f65504x, B.f56303N, anonymousClass0IL.f65494n);
                    if (!anonymousClass0IL.f65463I) {
                        anonymousClass0IL.mContentHolder.ZSA(4);
                    }
                }
            }
        } else {
            anonymousClass0IL.mContentHolder.ZSA(4);
            AnonymousClass0Nm.i(anonymousClass0IL.mReplyComposerContainer, 8);
            anonymousClass0IL.f65470P = 4;
        }
        m27205B(anonymousClass0IL);
        if (anonymousClass0IL.f65481a && !anonymousClass0IL.f65465K && !anonymousClass0IL.f65466L) {
            boolean z;
            AnonymousClass0Vw anonymousClass0Vw = anonymousClass0IL.f65483c;
            synchronized (anonymousClass0Vw) {
                z = anonymousClass0Vw.f5805E;
            }
            if (!z || i + 3 < anonymousClass0IL.f65486f.D()) {
                if (i == anonymousClass0IL.f65486f.f56321G - 1) {
                    AnonymousClass18S.B(anonymousClass0IL.f65485e).B(anonymousClass0IL.f65483c, null, null);
                    return;
                } else if (anonymousClass0IL.f65486f.D() >= anonymousClass0IL.f65486f.f56321G || i + 3 < anonymousClass0IL.f65486f.D()) {
                    return;
                }
            }
            anonymousClass0IL.m27233d();
        }
    }

    public final void PLA() {
        this.f65489i.m25008A();
    }

    /* renamed from: Q */
    public static void m27220Q(DirectVisualMessageViewerFragment directVisualMessageViewerFragment, AnonymousClass4go anonymousClass4go) {
        String str = anonymousClass4go.f56303N;
        AnonymousClass4ZS anonymousClass4ZS = directVisualMessageViewerFragment.f65490j;
        String str2 = anonymousClass4go.f56301L;
        if (!(str2 == null || anonymousClass4ZS.f55377B.contains(str2))) {
            if (anonymousClass4go.D()) {
                anonymousClass4ZS.f55379D++;
            } else {
                anonymousClass4ZS.f55381F++;
            }
            if (anonymousClass4go.f56298I) {
                anonymousClass4ZS.f55382G++;
            } else if (anonymousClass4go.f56297H) {
                anonymousClass4ZS.f55378C++;
            } else {
                anonymousClass4ZS.f55380E++;
            }
            anonymousClass4ZS.f55377B.add(str2);
        }
        if (str != null && !directVisualMessageViewerFragment.f65502v.contains(str)) {
            AnonymousClass0W7 V = directVisualMessageViewerFragment.f65459E.V(directVisualMessageViewerFragment.f65483c.F(), str);
            if (V == null) {
                return;
            }
            if (!anonymousClass4go.f56297H || V.Z(directVisualMessageViewerFragment.f65485e.B())) {
                directVisualMessageViewerFragment.f65502v.add(str);
                directVisualMessageViewerFragment.f65459E.BA(directVisualMessageViewerFragment.f65483c.F(), str, directVisualMessageViewerFragment.f65475U, directVisualMessageViewerFragment.f65466L);
                if (!directVisualMessageViewerFragment.f65466L) {
                    AnonymousClass0U4.C(directVisualMessageViewerFragment.f65485e).B(AnonymousClass0UP.B(directVisualMessageViewerFragment.f65483c.F(), V));
                } else if (!((Boolean) AnonymousClass0E6.D(AnonymousClass0CC.eI, directVisualMessageViewerFragment.f65485e)).booleanValue()) {
                    AnonymousClass0Cn anonymousClass0Cn = directVisualMessageViewerFragment.f65485e;
                    str = directVisualMessageViewerFragment.f65486f.f56319E;
                    String id = directVisualMessageViewerFragment.f65486f.B().getId();
                    AnonymousClass0Pt N = new AnonymousClass0Pt(anonymousClass0Cn).N();
                    N.f4226J = AnonymousClass0Pu.f4247G;
                    Object[] objArr = new Object[]{str};
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("[");
                    stringBuilder.append(id);
                    stringBuilder.append("]");
                    AnonymousClass0Ix.D(N.L("direct_v2/visual_threads/%s/item_replayed/", objArr).D("item_ids", stringBuilder.toString()).M(AnonymousClass0Pv.class).H());
                }
            }
        }
    }

    /* renamed from: R */
    public static void m27221R(DirectVisualMessageViewerFragment directVisualMessageViewerFragment) {
        AnonymousClass4go B = directVisualMessageViewerFragment.f65486f.B();
        if (directVisualMessageViewerFragment.f65470P != 3 && B.f56294E) {
            AnonymousClass5EB anonymousClass5EB = directVisualMessageViewerFragment.f65480Z;
            if (anonymousClass5EB != null) {
                directVisualMessageViewerFragment.f65479Y.m26006A(anonymousClass5EB);
                directVisualMessageViewerFragment.f65480Z = null;
            }
            AnonymousClass0MJ anonymousClass0MJ = directVisualMessageViewerFragment.f65457C;
            if (anonymousClass0MJ != null) {
                directVisualMessageViewerFragment.f65464J.J(anonymousClass0MJ, -1);
                directVisualMessageViewerFragment.f65464J.E(directVisualMessageViewerFragment.f65457C, -1);
                directVisualMessageViewerFragment.f65457C = null;
            }
            if (B.f56299J != null) {
                directVisualMessageViewerFragment.f65472R.E(directVisualMessageViewerFragment.getContext(), B.f56299J);
            }
            directVisualMessageViewerFragment.f65470P = 3;
        }
    }

    public final /* bridge */ /* synthetic */ void Rf(Object obj, int i, int i2) {
        AnonymousClass4go anonymousClass4go = (AnonymousClass4go) obj;
        VolumeIndicator volumeIndicator = this.mVolumeIndicator;
        if (volumeIndicator != null) {
            volumeIndicator.m26247A(i, i2);
        }
        m27224U(this, anonymousClass4go);
    }

    /* renamed from: S */
    public static void m27222S(DirectVisualMessageViewerFragment directVisualMessageViewerFragment) {
        if (directVisualMessageViewerFragment.mContentHolder == null) {
            return;
        }
        if (directVisualMessageViewerFragment.f65462H == null) {
            m27207D(directVisualMessageViewerFragment, true);
            m27213J(directVisualMessageViewerFragment).I((float) (-directVisualMessageViewerFragment.mContentView.getHeight()), 0.0f).N();
            return;
        }
        AnonymousClass0LH.E(directVisualMessageViewerFragment.f65462H);
        AnonymousClass0Ci anonymousClass0Ci = directVisualMessageViewerFragment.f65486f.B().f56309T;
        AnonymousClass0LH.E(anonymousClass0Ci);
        directVisualMessageViewerFragment.f65473S.setUrl(anonymousClass0Ci.DQ());
        m27207D(directVisualMessageViewerFragment, true);
        if ("inbox".equals(directVisualMessageViewerFragment.f65461G)) {
            RectF L = AnonymousClass0Nm.L(directVisualMessageViewerFragment.mContentHolder.f55354T);
            float width = directVisualMessageViewerFragment.f65462H.width() / ((float) directVisualMessageViewerFragment.f65473S.getWidth());
            float width2 = L.width() / ((float) directVisualMessageViewerFragment.f65473S.getWidth());
            AnonymousClass14H K = AnonymousClass14H.C(directVisualMessageViewerFragment.f65473S).C(width, width2, 0.0f).D(width, width2, 0.0f).H(directVisualMessageViewerFragment.f65462H.left, L.left).I(directVisualMessageViewerFragment.f65462H.top, L.top).L(AnonymousClass14e.f13963B).K(true);
            K.f13863c = 0;
            K.f13862b = 4;
            K.N();
        }
        float width3 = directVisualMessageViewerFragment.f65487g ? directVisualMessageViewerFragment.f65462H.width() / ((float) directVisualMessageViewerFragment.f65478X) : 0.0f;
        AnonymousClass14H D = m27213J(directVisualMessageViewerFragment).C(width3, 1.0f, directVisualMessageViewerFragment.f65487g ? 0.0f : directVisualMessageViewerFragment.f65462H.centerX()).D(directVisualMessageViewerFragment.f65487g ? directVisualMessageViewerFragment.f65462H.height() / ((float) directVisualMessageViewerFragment.f65477W) : 0.0f, 1.0f, directVisualMessageViewerFragment.f65487g ? 0.0f : directVisualMessageViewerFragment.f65462H.centerY());
        if (directVisualMessageViewerFragment.f65487g) {
            D.H(directVisualMessageViewerFragment.f65462H.left, 0.0f).I(directVisualMessageViewerFragment.f65462H.top, 0.0f).f13849O = new AnonymousClass4dP(directVisualMessageViewerFragment);
        }
        D.N();
    }

    public final void Sp(int i, boolean z) {
        this.f65469O = i > 0;
        this.f65489i.f56957B = this.f65469O ^ true;
        if (i == 0) {
            this.mComposerEditText.clearFocus();
        }
        AnonymousClass14H.C(this.mReplyComposerContainer).J().K(true).G((float) (-i)).N();
    }

    /* renamed from: T */
    public static boolean m27223T(DirectVisualMessageViewerFragment directVisualMessageViewerFragment) {
        Object H = m27211H(directVisualMessageViewerFragment);
        if (TextUtils.isEmpty(H)) {
            return false;
        }
        AnonymousClass0Uu.B(directVisualMessageViewerFragment.f65485e).F(directVisualMessageViewerFragment.f65483c.F(), H);
        directVisualMessageViewerFragment.mComposerEditText.setText(JsonProperty.USE_DEFAULT_NAME);
        directVisualMessageViewerFragment.mComposerEditText.clearFocus();
        AnonymousClass0Nm.N(directVisualMessageViewerFragment.mComposerEditText);
        directVisualMessageViewerFragment.mComposerEditText.postDelayed(new AnonymousClass4dM(directVisualMessageViewerFragment), 500);
        return true;
    }

    /* renamed from: U */
    public static void m27224U(DirectVisualMessageViewerFragment directVisualMessageViewerFragment, AnonymousClass4go anonymousClass4go) {
        AnonymousClass4mC anonymousClass4mC = directVisualMessageViewerFragment.mVideoPlayer;
        if (anonymousClass4mC != null && anonymousClass4mC.m25032E() && anonymousClass4go != null && anonymousClass4go.TTA()) {
            CharSequence E = AnonymousClass2G6.E(anonymousClass4go.f56305P);
            Toast toast = directVisualMessageViewerFragment.f65484d;
            if (toast != null) {
                toast.cancel();
            }
            toast = Toast.makeText(directVisualMessageViewerFragment.getContext(), E, 0);
            directVisualMessageViewerFragment.f65484d = toast;
            toast.show();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: V */
    public static void m27225V(com.instagram.direct.fragment.visual.DirectVisualMessageViewerFragment r5, boolean r6) {
        /*
        r4 = 1;
        if (r6 == 0) goto L_0x0005;
    L_0x0003:
        r3 = 1;
        goto L_0x0006;
    L_0x0005:
        r3 = 5;
    L_0x0006:
        r0 = r5.mSparklerAnimationStubHolder;
        r0 = r0.C();
        if (r0 == 0) goto L_0x0025;
    L_0x000e:
        r0 = r5.mSparklerAnimationStubHolder;
        r2 = r0.A();
        r0 = r2.getBackground();
        r0 = (android.graphics.drawable.AnimationDrawable) r0;
        r0.stop();
        r1 = new android.view.View[r4];
        r0 = 0;
        r1[r0] = r2;
        X.AnonymousClass14H.E(r4, r1);
    L_0x0025:
        r0 = r5.f65486f;
        r2 = r0.f56316B;
        r1 = 1;
        r2 = r2 + r1;
        r0 = r0.f56317C;
        r0 = r0.size();
        if (r2 >= r0) goto L_0x0034;
    L_0x0033:
        goto L_0x0035;
    L_0x0034:
        r1 = 0;
    L_0x0035:
        if (r1 == 0) goto L_0x0049;
    L_0x0037:
        r0 = r5.f65486f;
        r2 = r0.f56316B;
        r1 = r0.f56321G;
        r0 = 1;
        r1 = r1 - r0;
        if (r2 >= r1) goto L_0x0042;
    L_0x0041:
        goto L_0x0043;
    L_0x0042:
        r0 = 0;
    L_0x0043:
        if (r0 == 0) goto L_0x0049;
    L_0x0045:
        r5.m27237h(r3);
        goto L_0x005e;
    L_0x0049:
        r0 = r5.f65465K;
        if (r0 != 0) goto L_0x0053;
    L_0x004d:
        if (r6 == 0) goto L_0x0045;
    L_0x004f:
        m27208E(r5, r3, r4);
        goto L_0x005e;
    L_0x0053:
        r0 = r5.f65468N;
        if (r0 != 0) goto L_0x005e;
    L_0x0057:
        r0 = new X.5Vr;
        r0.<init>(r5, r6);
        r5.f65468N = r0;
    L_0x005e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.visual.DirectVisualMessageViewerFragment.V(com.instagram.direct.fragment.visual.DirectVisualMessageViewerFragment, boolean):void");
    }

    /* renamed from: W */
    public static void m27226W(DirectVisualMessageViewerFragment directVisualMessageViewerFragment, AnonymousClass4gq anonymousClass4gq, int i, AnonymousClass4go anonymousClass4go) {
        if (i == directVisualMessageViewerFragment.f65486f.f56316B) {
            if (directVisualMessageViewerFragment.f65470P == 1) {
                if (directVisualMessageViewerFragment.f65463I) {
                    AnonymousClass0Lq anonymousClass0Lq;
                    m27220Q(directVisualMessageViewerFragment, anonymousClass4go);
                    AnonymousClass0MJ anonymousClass4ZU = new AnonymousClass4ZU(anonymousClass4go.f56301L);
                    AnonymousClass0Ci anonymousClass0Ci = anonymousClass4go.f56309T;
                    anonymousClass4ZU.f55394D = anonymousClass4go.f56301L;
                    anonymousClass4ZU.f55395E = anonymousClass4go.f56302M;
                    anonymousClass4ZU.f55399I = directVisualMessageViewerFragment.f65488h;
                    anonymousClass4ZU.f55396F = Integer.valueOf(i);
                    anonymousClass4ZU.f55397G = Integer.valueOf(anonymousClass4gq.D());
                    anonymousClass4ZU.f55398H = anonymousClass4gq.f56319E;
                    anonymousClass4ZU.f55393C = Boolean.valueOf(directVisualMessageViewerFragment.f65466L);
                    if (anonymousClass0Ci != null) {
                        anonymousClass0Lq = anonymousClass0Ci.f1751t;
                    } else {
                        anonymousClass0Lq = AnonymousClass0Lq.FollowStatusUnknown;
                    }
                    anonymousClass4ZU.f55392B = anonymousClass0Lq;
                    anonymousClass4ZU.f55400J = anonymousClass4go.f56311V;
                    directVisualMessageViewerFragment.f65457C = anonymousClass4ZU;
                    directVisualMessageViewerFragment.f65464J.F(directVisualMessageViewerFragment.f65457C, i, -1, null);
                    directVisualMessageViewerFragment.f65464J.K(directVisualMessageViewerFragment.f65457C, i, AnonymousClass0w9.f12221D);
                    directVisualMessageViewerFragment.f65482b = false;
                    directVisualMessageViewerFragment.f65470P = 2;
                    AnonymousClass0ZF D = AnonymousClass1dZ.D(anonymousClass4go.f56305P);
                    if (D != null && directVisualMessageViewerFragment.f65497q.A(D.A())) {
                        directVisualMessageViewerFragment.f65497q.B(directVisualMessageViewerFragment.mContentHolder.f55353S, anonymousClass4go.f56309T);
                    }
                } else {
                    directVisualMessageViewerFragment.f65482b = true;
                }
            }
        }
    }

    /* renamed from: X */
    public static void m27227X(DirectVisualMessageViewerFragment directVisualMessageViewerFragment, AnonymousClass4go anonymousClass4go) {
        AnonymousClass18S.B(directVisualMessageViewerFragment.f65485e).C(anonymousClass4go.E() ? anonymousClass4go.JU() : null, anonymousClass4go.f56306Q);
    }

    /* renamed from: Y */
    public static void m27228Y(DirectVisualMessageViewerFragment directVisualMessageViewerFragment, int i) {
        double d;
        DirectVisualMessageViewerFragment directVisualMessageViewerFragment2 = directVisualMessageViewerFragment;
        AnonymousClass4go K = m27214K(directVisualMessageViewerFragment2);
        AnonymousClass0Ci anonymousClass0Ci = K.f56309T;
        AnonymousClass0LH.E(anonymousClass0Ci);
        if (!m27206C(directVisualMessageViewerFragment2)) {
            d = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
        } else if (K.D()) {
            d = (double) directVisualMessageViewerFragment2.mPhotoTimerController.f18222F;
            Double.isNaN(d);
            d /= 1000.0d;
        } else {
            d = directVisualMessageViewerFragment2.mVideoPlayer.m25030C();
        }
        if (d > StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) {
            AnonymousClass4ZS anonymousClass4ZS = directVisualMessageViewerFragment2.f65490j;
            anonymousClass4ZS.f55384I += d;
        }
        AnonymousClass0EE anonymousClass0EE = directVisualMessageViewerFragment2.f65494n;
        String str = directVisualMessageViewerFragment2.f65488h;
        AnonymousClass0ON anonymousClass0ON = K.f56302M;
        String str2 = directVisualMessageViewerFragment2.f65504x;
        String id = K.getId();
        String id2 = anonymousClass0Ci.getId();
        int i2 = directVisualMessageViewerFragment2.f65486f.f56316B;
        int D = directVisualMessageViewerFragment2.f65486f.D();
        double B = K.D() ? (double) directVisualMessageViewerFragment2.mPhotoTimerController.f18226J : (double) directVisualMessageViewerFragment2.mVideoPlayer.m25029B();
        double d2 = (double) directVisualMessageViewerFragment2.f65458D;
        String str3 = K.f56311V;
        boolean z = directVisualMessageViewerFragment2.f65466L;
        AnonymousClass0Lq anonymousClass0Lq = anonymousClass0Ci.f1751t;
        double d3 = B;
        double max = Math.max(Math.min(B, B * d2), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        d3 = Math.max(Math.min(d3, B - max), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(id);
        stringBuilder.append("_");
        stringBuilder.append(id2);
        AnonymousClass0NN F = AnonymousClass0NN.B("direct_story_playback_navigation", anonymousClass0EE).F("m_pk", stringBuilder.toString()).F("viewer_session_id", str).B("m_t", anonymousClass0ON.A()).B("action", i).B("source", 1).F("thread_id", str2).B("reel_size", D).B("reel_position", i2).A("time_elapsed", max / 1000.0d).A("time_remaining", d3 / 1000.0d).B("is_replay", z).F("reply_type", str3).F("follow_status", AnonymousClass0Ci.D(anonymousClass0Lq));
        if (d > StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) {
            F.A("pause_duration", d);
        }
        F.R();
    }

    public final void YFA(Object obj, boolean z, int i) {
        AnonymousClass4go anonymousClass4go = (AnonymousClass4go) obj;
    }

    /* renamed from: Z */
    public static void m27229Z(DirectVisualMessageViewerFragment directVisualMessageViewerFragment, boolean z) {
        if (directVisualMessageViewerFragment.f65503w != z) {
            directVisualMessageViewerFragment.f65503w = z;
            AnonymousClass4ZK anonymousClass4ZK = directVisualMessageViewerFragment.mContentHolder;
            if (anonymousClass4ZK != null) {
                AnonymousClass5CD.m25960C(anonymousClass4ZK.f55337C, z);
            }
        }
    }

    /* renamed from: a */
    public static void m27230a(DirectVisualMessageViewerFragment directVisualMessageViewerFragment, String str) {
        directVisualMessageViewerFragment.mVideoPlayer.m25034G(str);
        directVisualMessageViewerFragment.mPhotoTimerController.B();
    }

    /* renamed from: b */
    public final int m27239b(AnonymousClass0Ci anonymousClass0Ci) {
        AnonymousClass4go C;
        int i = this.f65486f.f56316B;
        int c = m27232c(this, i);
        while (c != i) {
            C = this.f65486f.C(c);
            AnonymousClass0LH.E(C);
            if (m27236g(this, C, anonymousClass0Ci)) {
                this.f65486f.f56316B = c;
                return c;
            }
            c = m27232c(this, c);
        }
        C = this.f65486f.B();
        AnonymousClass0LH.E(C);
        if (m27236g(this, C, anonymousClass0Ci)) {
            return this.f65486f.f56316B;
        }
        return -1;
    }

    /* renamed from: b */
    public static void m27231b(DirectVisualMessageViewerFragment directVisualMessageViewerFragment, String str) {
        if (m27214K(directVisualMessageViewerFragment).D()) {
            directVisualMessageViewerFragment.mPhotoTimerController.C();
        } else if (m27214K(directVisualMessageViewerFragment).E()) {
            directVisualMessageViewerFragment.mVideoPlayer.m25036I(str);
        }
        m27210G(directVisualMessageViewerFragment);
    }

    /* renamed from: c */
    private static int m27232c(DirectVisualMessageViewerFragment directVisualMessageViewerFragment, int i) {
        return i == 0 ? directVisualMessageViewerFragment.f65486f.D() - 1 : i - 1;
    }

    /* renamed from: d */
    private void m27233d() {
        this.f65465K = true;
        AnonymousClass18S.B(this.f65485e).B(this.f65483c, this.f65491k, Integer.valueOf(20));
    }

    public final void dt(Object obj) {
        AnonymousClass4go anonymousClass4go = (AnonymousClass4go) obj;
    }

    /* renamed from: e */
    private void m27234e() {
        if (this.mContentHolder != null) {
            this.mContentView.setVisibility(4);
            AnonymousClass4go B = this.f65486f.B();
            this.mContentHolder.f55338D.C(C0164R.id.direct_visual_message_viewer_fragment_image_view_id);
            if (B.f56294E) {
                this.mContentHolder.f55338D.E(C0164R.id.direct_visual_message_viewer_fragment_image_view_id, new AnonymousClass4dO(this));
            } else {
                m27222S(this);
            }
            m27219P(this);
        }
    }

    public final void et(Object obj) {
        AnonymousClass4go anonymousClass4go = (AnonymousClass4go) obj;
    }

    /* renamed from: f */
    private AnonymousClass4gq m27235f(DirectThreadKey directThreadKey, String str, String str2) {
        List arrayList;
        AnonymousClass0Tw anonymousClass0Tw = this.f65459E;
        synchronized (anonymousClass0Tw) {
            AnonymousClass0WH S = anonymousClass0Tw.S(directThreadKey);
            if (S != null) {
                synchronized (S) {
                    arrayList = new ArrayList(S.I());
                    if (((Boolean) AnonymousClass0CC.Vh.G()).booleanValue() || ((Boolean) AnonymousClass0E6.C(AnonymousClass0CC.eI)).booleanValue()) {
                        Collection C;
                        synchronized (S) {
                            C = AnonymousClass0Ww.C(S.f5957I, S.f5952D);
                        }
                        arrayList.addAll(C);
                        Collections.sort(arrayList, AnonymousClass0W7.GB);
                    }
                }
            } else {
                arrayList = Collections.emptyList();
            }
        }
        if (arrayList.isEmpty()) {
            AnonymousClass0Gn.C("DirectVisualMessageViewerFragment", "getVisualMessagesForVisualHistory is empty");
            return null;
        }
        int i;
        if (str == null && str2 == null) {
            AnonymousClass0W7 L = this.f65483c.L();
            AnonymousClass0W7 K = this.f65483c.K();
            if (L != null) {
                str = L.f5885O;
            } else if (K != null) {
                str = K.f5885O;
            } else {
                str = null;
            }
        }
        int size;
        int i2;
        if (str != null) {
            size = arrayList.size();
            i = -1;
            for (i2 = 0; i2 < size; i2++) {
                if (str.equals(((AnonymousClass0W7) arrayList.get(i2)).f5885O)) {
                    i = i2;
                }
            }
        } else if (str2 != null) {
            size = arrayList.size();
            i = -1;
            for (i2 = 0; i2 < size; i2++) {
                if (str2.equals(((AnonymousClass0W7) arrayList.get(i2)).f5875E)) {
                    i = i2;
                }
            }
        } else {
            i = -1;
        }
        if (i == -1) {
            Object V = str != null ? this.f65459E.V(directThreadKey, str) : str2 != null ? this.f65459E.U(directThreadKey, AnonymousClass0V0.EXPIRING_MEDIA, str2) : null;
            if (V == null) {
                arrayList = null;
            } else {
                arrayList = Collections.singletonList(V);
            }
            i = 0;
        }
        if (arrayList != null) {
            return new AnonymousClass4gq(getContext(), this.f65485e, this.f65483c, arrayList, arrayList.size(), i);
        }
        AnonymousClass0Gn.C("DirectVisualMessageViewerFragment", "No visual messages to play.");
        return null;
    }

    public final void ft(Object obj) {
        AnonymousClass4go anonymousClass4go = (AnonymousClass4go) obj;
    }

    /* renamed from: g */
    private static boolean m27236g(DirectVisualMessageViewerFragment directVisualMessageViewerFragment, AnonymousClass4go anonymousClass4go, AnonymousClass0Ci anonymousClass0Ci) {
        AnonymousClass0W7 V;
        if (anonymousClass4go.f56303N != null) {
            if (anonymousClass4go.C()) {
                V = directVisualMessageViewerFragment.f65459E.V(directVisualMessageViewerFragment.f65483c.F(), anonymousClass4go.f56303N);
                return V == null && (!V.A() || V.Z(anonymousClass0Ci));
            }
        }
        V = directVisualMessageViewerFragment.f65459E.U(directVisualMessageViewerFragment.f65483c.F(), AnonymousClass0V0.EXPIRING_MEDIA, anonymousClass4go.f56292C);
        if (V == null) {
        }
    }

    /* renamed from: h */
    private void m27237h(int i) {
        m27221R(this);
        m27228Y(this, i);
        int i2 = this.f65486f.f56316B;
        if (m27238i(this.f65485e.B()) == -1) {
            m27208E(this, i, true);
            return;
        }
        m27219P(this);
        if (this.f65486f.C(i2).f56298I) {
            this.mProgressBar.A(i2);
        }
    }

    public final void hFA(Object obj) {
        AnonymousClass4go anonymousClass4go = (AnonymousClass4go) obj;
    }

    /* renamed from: i */
    private int m27238i(AnonymousClass0Ci anonymousClass0Ci) {
        AnonymousClass4go C;
        int i = this.f65486f.f56316B;
        int D = (i + 1) % this.f65486f.D();
        while (D != i) {
            C = this.f65486f.C(D);
            AnonymousClass0LH.E(C);
            if (m27236g(this, C, anonymousClass0Ci)) {
                this.f65486f.f56316B = D;
                return D;
            }
            D = (D + 1) % this.f65486f.D();
        }
        C = this.f65486f.B();
        AnonymousClass0LH.E(C);
        if (m27236g(this, C, anonymousClass0Ci)) {
            return this.f65486f.f56316B;
        }
        return -1;
    }

    public final void kFA(Object obj) {
        AnonymousClass4go anonymousClass4go = (AnonymousClass4go) obj;
    }

    public final void oDA() {
        m27231b(this, "resume");
    }

    public final boolean onBackPressed() {
        m27208E(this, 8, true);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        Object obj;
        String str;
        StringBuilder stringBuilder;
        String string;
        DirectThreadKey directThreadKey;
        String str2;
        AnonymousClass4gq anonymousClass4gq;
        List d;
        int T;
        List f;
        int min;
        AnonymousClass0W7 V;
        AnonymousClass0TK anonymousClass0w0;
        AnonymousClass0EE anonymousClass0EE;
        String str3;
        boolean z;
        AnonymousClass0TK anonymousClass0jC;
        int F = AnonymousClass0cQ.F(this, 1050311907);
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        AnonymousClass0Cm G = AnonymousClass0Ce.G(getArguments());
        this.f65485e = G;
        this.f65459E = AnonymousClass0Tw.C(G);
        this.f65479Y = AnonymousClass5E8.m26001B(this.f65485e);
        Bundle arguments = getArguments();
        this.f65491k = new AnonymousClass4dX(this);
        this.f65466L = arguments.getBoolean("DirectStoryViewerFragment.ARGUMENTS_IS_REPLAY");
        this.f65487g = arguments.getBoolean("DirectVisualMessageViewerFragment.NEEDS_THUMBNAIL_ANIMATION");
        this.f65475U = arguments.getString("DirectVisualMessageViewerFragment.REPLAY_SESSION_ID");
        int i = arguments.getInt("DirectStoryViewerFragment.ARGUMENT_UNSEEN_STORIES_COUNT");
        int i2 = arguments.getInt("DirectStoryViewerFragment.ARGUMENT_SEEN_STORIES_COUNT");
        DirectThreadKey directThreadKey2 = (DirectThreadKey) arguments.getParcelable("DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
        this.f65505y = directThreadKey2;
        this.f65504x = directThreadKey2.f5871C;
        this.f65483c = this.f65459E.c(this.f65504x);
        this.f65496p = AnonymousClass0e8.D(getContext());
        this.f65478X = AnonymousClass0Nm.J(getContext());
        this.f65477W = AnonymousClass0Nm.I(getContext());
        Context context = getContext();
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(C0164R.dimen.reel_viewer_forward_backward_dividing_line);
        int J = AnonymousClass0Nm.J(context);
        if (AnonymousClass0e8.D(context)) {
            dimensionPixelOffset = J - dimensionPixelOffset;
        }
        r0.f65493m = dimensionPixelOffset;
        r0.f65456B = new AnonymousClass59D(getActivity(), r0);
        r0.f65497q = new AnonymousClass1Zb(getContext(), r0.f65485e, "direct_surface");
        String string2 = arguments.getString("DirectFragment.ENTRY_POINT");
        r0.f65461G = string2;
        dimensionPixelOffset = string2.hashCode();
        if (dimensionPixelOffset != -874443254) {
            if (dimensionPixelOffset != 3452698) {
                if (dimensionPixelOffset == 100344454) {
                    if (string2.equals("inbox")) {
                        obj = null;
                        switch (obj) {
                            case null:
                                str = "direct_inbox";
                                break;
                            case 1:
                                str = "direct_thread_toggle";
                                break;
                            case 2:
                                str = "direct_push_notifications";
                                break;
                            default:
                                str = "unknown";
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("entry point ");
                                stringBuilder.append(r0.f65461G);
                                stringBuilder.append(" is unexpected.");
                                AnonymousClass0Gn.H("DirectVisualMessageViewerFragment", stringBuilder.toString());
                                break;
                        }
                        r0.f65494n = new AnonymousClass4dY(r0, str);
                        if (r0.f65483c == null) {
                            AnonymousClass0NN.B("direct_thread_summary_null_in_viewer", r0).F("entry_point", r0.f65461G).F("thread_id", r0.f65504x).H("is_replay", r0.f65466L).B("unseenStoriesCount", i).B("seenStoriesCount", i2).R();
                            AnonymousClass0LH.F(r0.f65483c, "Summary is null");
                        }
                        r0.f65488h = UUID.randomUUID().toString();
                        r0.f65471Q = arguments.getString("DirectStoryViewerFragment.ARGUMENTS_MESSAGE_ID");
                        string = arguments.getString("DirectStoryViewerFragment.ARGUMENTS_MESSAGE_CLIENT_CONTEXT");
                        if (((Boolean) AnonymousClass0CC.eI.H(r0.f65485e)).booleanValue()) {
                            directThreadKey = r0.f65505y;
                            str2 = r0.f65471Q;
                            anonymousClass4gq = null;
                            if (str2 == null) {
                                if (string == null) {
                                    if (r0.f65466L) {
                                        d = r0.f65459E.d(directThreadKey, null);
                                        if (d.isEmpty()) {
                                            T = r0.f65483c.T();
                                            J = d.size();
                                            T = Math.min(100, Math.max(T, J));
                                            anonymousClass4gq = new AnonymousClass4gq(getContext(), r0.f65485e, r0.f65483c, d.subList(0, Math.min(J, T)), T, null);
                                        } else {
                                            AnonymousClass0Gn.C("DirectVisualMessageViewerFragment", "getUnseenVisualMessages is empty");
                                        }
                                    } else {
                                        f = r0.f65459E.f(directThreadKey, r0.f65475U);
                                        min = Math.min(100, f.size());
                                        anonymousClass4gq = new AnonymousClass4gq(getContext(), r0.f65485e, r0.f65483c, f.subList(0, min), min, null);
                                    }
                                    r0.f65486f = anonymousClass4gq;
                                }
                            }
                            if (str2 == null) {
                                V = r0.f65459E.V(directThreadKey, str2);
                            } else {
                                V = r0.f65459E.U(directThreadKey, AnonymousClass0V0.EXPIRING_MEDIA, string);
                            }
                            r0.f65460F = V;
                            if (V != null) {
                                AnonymousClass0Gn.C("DirectVisualMessageViewerFragment", "Message not available");
                            } else {
                                if (V.Z(r0.f65485e.B()) || !((Boolean) AnonymousClass0CC.LI.H(r0.f65485e)).booleanValue()) {
                                    f = Collections.singletonList(r0.f65460F);
                                } else {
                                    AnonymousClass0Tw anonymousClass0Tw = r0.f65459E;
                                    AnonymousClass0XB anonymousClass0XB = r0.f65467M;
                                    synchronized (anonymousClass0Tw) {
                                        AnonymousClass0WH S = anonymousClass0Tw.S(directThreadKey);
                                        if (S != null) {
                                            synchronized (S) {
                                                AnonymousClass0WS anonymousClass0WS;
                                                if (str2 != null) {
                                                    AnonymousClass0WS R = S.f5958J.R();
                                                    anonymousClass0WS = new AnonymousClass0WS(R.f5986D, str2, R.f5984B);
                                                } else {
                                                    anonymousClass0WS = S.f5958J.R();
                                                }
                                                f = AnonymousClass0Ww.C(AnonymousClass0WH.B(S, anonymousClass0WS), anonymousClass0XB);
                                            }
                                        } else {
                                            f = null;
                                        }
                                    }
                                    if (f == null) {
                                        AnonymousClass0Gn.C("fetch_message_from_thread_range_failed", "Null list received from thread range");
                                        f = Collections.singletonList(r0.f65460F);
                                    } else {
                                        f.add(0, r0.f65460F);
                                    }
                                }
                                r0.f65481a = false;
                                min = Math.min(100, f.size());
                                anonymousClass4gq = new AnonymousClass4gq(getContext(), r0.f65485e, r0.f65483c, f.subList(0, min), min, null);
                            }
                            r0.f65486f = anonymousClass4gq;
                        } else {
                            r0.f65486f = m27235f(r0.f65505y, r0.f65471Q, string);
                        }
                        if (r0.f65486f == null) {
                            r0.f65486f = new AnonymousClass4gq(getContext(), r0.f65485e, r0.f65483c, new ArrayList(), 0, 0);
                            getActivity().finish();
                        }
                        r0.f65462H = (RectF) arguments.getParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_ENTRY_VIEW_BOUNDS");
                        anonymousClass0w0 = new AnonymousClass0w0(r0.f65494n, new AnonymousClass4ZV(), r0.f65485e);
                        r0.f65464J = anonymousClass0w0;
                        registerLifecycleListener(anonymousClass0w0);
                        synchronized (AnonymousClass4ZT.class) {
                            if (AnonymousClass4ZT.f55391B == null) {
                                AnonymousClass4ZT.f55391B = new AnonymousClass4ZT();
                            }
                        }
                        anonymousClass0EE = r0.f65494n;
                        string2 = r0.f65488h;
                        str3 = r0.f65504x;
                        z = r0.f65466L;
                        if (bundle2 == null) {
                            AnonymousClass0NN.B("direct_story_playback_entry", anonymousClass0EE).F("viewer_session_id", string2).B("new_reel_count", i).B("viewed_reel_count", i2).F("thread_id", str3).H("is_replay", z).R();
                        }
                        anonymousClass0jC = new AnonymousClass0jC(r0.f65494n, false, getContext());
                        r0.f65472R = anonymousClass0jC;
                        registerLifecycleListener(anonymousClass0jC);
                        AnonymousClass0cQ.G(r0, -106180562, F);
                    }
                }
            } else if (string2.equals(TraceEventType.Push)) {
                obj = 2;
                switch (obj) {
                    case null:
                        str = "direct_inbox";
                        break;
                    case 1:
                        str = "direct_thread_toggle";
                        break;
                    case 2:
                        str = "direct_push_notifications";
                        break;
                    default:
                        str = "unknown";
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("entry point ");
                        stringBuilder.append(r0.f65461G);
                        stringBuilder.append(" is unexpected.");
                        AnonymousClass0Gn.H("DirectVisualMessageViewerFragment", stringBuilder.toString());
                        break;
                }
                r0.f65494n = new AnonymousClass4dY(r0, str);
                if (r0.f65483c == null) {
                    AnonymousClass0NN.B("direct_thread_summary_null_in_viewer", r0).F("entry_point", r0.f65461G).F("thread_id", r0.f65504x).H("is_replay", r0.f65466L).B("unseenStoriesCount", i).B("seenStoriesCount", i2).R();
                    AnonymousClass0LH.F(r0.f65483c, "Summary is null");
                }
                r0.f65488h = UUID.randomUUID().toString();
                r0.f65471Q = arguments.getString("DirectStoryViewerFragment.ARGUMENTS_MESSAGE_ID");
                string = arguments.getString("DirectStoryViewerFragment.ARGUMENTS_MESSAGE_CLIENT_CONTEXT");
                if (((Boolean) AnonymousClass0CC.eI.H(r0.f65485e)).booleanValue()) {
                    directThreadKey = r0.f65505y;
                    str2 = r0.f65471Q;
                    anonymousClass4gq = null;
                    if (str2 == null) {
                        if (string == null) {
                            if (r0.f65466L) {
                                d = r0.f65459E.d(directThreadKey, null);
                                if (d.isEmpty()) {
                                    T = r0.f65483c.T();
                                    J = d.size();
                                    T = Math.min(100, Math.max(T, J));
                                    anonymousClass4gq = new AnonymousClass4gq(getContext(), r0.f65485e, r0.f65483c, d.subList(0, Math.min(J, T)), T, null);
                                } else {
                                    AnonymousClass0Gn.C("DirectVisualMessageViewerFragment", "getUnseenVisualMessages is empty");
                                }
                            } else {
                                f = r0.f65459E.f(directThreadKey, r0.f65475U);
                                min = Math.min(100, f.size());
                                anonymousClass4gq = new AnonymousClass4gq(getContext(), r0.f65485e, r0.f65483c, f.subList(0, min), min, null);
                            }
                            r0.f65486f = anonymousClass4gq;
                        }
                    }
                    if (str2 == null) {
                        V = r0.f65459E.U(directThreadKey, AnonymousClass0V0.EXPIRING_MEDIA, string);
                    } else {
                        V = r0.f65459E.V(directThreadKey, str2);
                    }
                    r0.f65460F = V;
                    if (V != null) {
                        if (V.Z(r0.f65485e.B())) {
                        }
                        f = Collections.singletonList(r0.f65460F);
                        r0.f65481a = false;
                        min = Math.min(100, f.size());
                        anonymousClass4gq = new AnonymousClass4gq(getContext(), r0.f65485e, r0.f65483c, f.subList(0, min), min, null);
                    } else {
                        AnonymousClass0Gn.C("DirectVisualMessageViewerFragment", "Message not available");
                    }
                    r0.f65486f = anonymousClass4gq;
                } else {
                    r0.f65486f = m27235f(r0.f65505y, r0.f65471Q, string);
                }
                if (r0.f65486f == null) {
                    r0.f65486f = new AnonymousClass4gq(getContext(), r0.f65485e, r0.f65483c, new ArrayList(), 0, 0);
                    getActivity().finish();
                }
                r0.f65462H = (RectF) arguments.getParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_ENTRY_VIEW_BOUNDS");
                anonymousClass0w0 = new AnonymousClass0w0(r0.f65494n, new AnonymousClass4ZV(), r0.f65485e);
                r0.f65464J = anonymousClass0w0;
                registerLifecycleListener(anonymousClass0w0);
                synchronized (AnonymousClass4ZT.class) {
                    if (AnonymousClass4ZT.f55391B == null) {
                        AnonymousClass4ZT.f55391B = new AnonymousClass4ZT();
                    }
                }
                anonymousClass0EE = r0.f65494n;
                string2 = r0.f65488h;
                str3 = r0.f65504x;
                z = r0.f65466L;
                if (bundle2 == null) {
                    AnonymousClass0NN.B("direct_story_playback_entry", anonymousClass0EE).F("viewer_session_id", string2).B("new_reel_count", i).B("viewed_reel_count", i2).F("thread_id", str3).H("is_replay", z).R();
                }
                anonymousClass0jC = new AnonymousClass0jC(r0.f65494n, false, getContext());
                r0.f65472R = anonymousClass0jC;
                registerLifecycleListener(anonymousClass0jC);
                AnonymousClass0cQ.G(r0, -106180562, F);
            }
        } else if (string2.equals("thread")) {
            obj = 1;
            switch (obj) {
                case null:
                    str = "direct_inbox";
                    break;
                case 1:
                    str = "direct_thread_toggle";
                    break;
                case 2:
                    str = "direct_push_notifications";
                    break;
                default:
                    str = "unknown";
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("entry point ");
                    stringBuilder.append(r0.f65461G);
                    stringBuilder.append(" is unexpected.");
                    AnonymousClass0Gn.H("DirectVisualMessageViewerFragment", stringBuilder.toString());
                    break;
            }
            r0.f65494n = new AnonymousClass4dY(r0, str);
            if (r0.f65483c == null) {
                AnonymousClass0NN.B("direct_thread_summary_null_in_viewer", r0).F("entry_point", r0.f65461G).F("thread_id", r0.f65504x).H("is_replay", r0.f65466L).B("unseenStoriesCount", i).B("seenStoriesCount", i2).R();
                AnonymousClass0LH.F(r0.f65483c, "Summary is null");
            }
            r0.f65488h = UUID.randomUUID().toString();
            r0.f65471Q = arguments.getString("DirectStoryViewerFragment.ARGUMENTS_MESSAGE_ID");
            string = arguments.getString("DirectStoryViewerFragment.ARGUMENTS_MESSAGE_CLIENT_CONTEXT");
            if (((Boolean) AnonymousClass0CC.eI.H(r0.f65485e)).booleanValue()) {
                r0.f65486f = m27235f(r0.f65505y, r0.f65471Q, string);
            } else {
                directThreadKey = r0.f65505y;
                str2 = r0.f65471Q;
                anonymousClass4gq = null;
                if (str2 == null) {
                    if (string == null) {
                        if (r0.f65466L) {
                            f = r0.f65459E.f(directThreadKey, r0.f65475U);
                            min = Math.min(100, f.size());
                            anonymousClass4gq = new AnonymousClass4gq(getContext(), r0.f65485e, r0.f65483c, f.subList(0, min), min, null);
                        } else {
                            d = r0.f65459E.d(directThreadKey, null);
                            if (d.isEmpty()) {
                                AnonymousClass0Gn.C("DirectVisualMessageViewerFragment", "getUnseenVisualMessages is empty");
                            } else {
                                T = r0.f65483c.T();
                                J = d.size();
                                T = Math.min(100, Math.max(T, J));
                                anonymousClass4gq = new AnonymousClass4gq(getContext(), r0.f65485e, r0.f65483c, d.subList(0, Math.min(J, T)), T, null);
                            }
                        }
                        r0.f65486f = anonymousClass4gq;
                    }
                }
                if (str2 == null) {
                    V = r0.f65459E.V(directThreadKey, str2);
                } else {
                    V = r0.f65459E.U(directThreadKey, AnonymousClass0V0.EXPIRING_MEDIA, string);
                }
                r0.f65460F = V;
                if (V != null) {
                    AnonymousClass0Gn.C("DirectVisualMessageViewerFragment", "Message not available");
                } else {
                    if (V.Z(r0.f65485e.B())) {
                    }
                    f = Collections.singletonList(r0.f65460F);
                    r0.f65481a = false;
                    min = Math.min(100, f.size());
                    anonymousClass4gq = new AnonymousClass4gq(getContext(), r0.f65485e, r0.f65483c, f.subList(0, min), min, null);
                }
                r0.f65486f = anonymousClass4gq;
            }
            if (r0.f65486f == null) {
                r0.f65486f = new AnonymousClass4gq(getContext(), r0.f65485e, r0.f65483c, new ArrayList(), 0, 0);
                getActivity().finish();
            }
            r0.f65462H = (RectF) arguments.getParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_ENTRY_VIEW_BOUNDS");
            anonymousClass0w0 = new AnonymousClass0w0(r0.f65494n, new AnonymousClass4ZV(), r0.f65485e);
            r0.f65464J = anonymousClass0w0;
            registerLifecycleListener(anonymousClass0w0);
            synchronized (AnonymousClass4ZT.class) {
                if (AnonymousClass4ZT.f55391B == null) {
                    AnonymousClass4ZT.f55391B = new AnonymousClass4ZT();
                }
            }
            anonymousClass0EE = r0.f65494n;
            string2 = r0.f65488h;
            str3 = r0.f65504x;
            z = r0.f65466L;
            if (bundle2 == null) {
                AnonymousClass0NN.B("direct_story_playback_entry", anonymousClass0EE).F("viewer_session_id", string2).B("new_reel_count", i).B("viewed_reel_count", i2).F("thread_id", str3).H("is_replay", z).R();
            }
            anonymousClass0jC = new AnonymousClass0jC(r0.f65494n, false, getContext());
            r0.f65472R = anonymousClass0jC;
            registerLifecycleListener(anonymousClass0jC);
            AnonymousClass0cQ.G(r0, -106180562, F);
        }
        obj = -1;
        switch (obj) {
            case null:
                str = "direct_inbox";
                break;
            case 1:
                str = "direct_thread_toggle";
                break;
            case 2:
                str = "direct_push_notifications";
                break;
            default:
                str = "unknown";
                stringBuilder = new StringBuilder();
                stringBuilder.append("entry point ");
                stringBuilder.append(r0.f65461G);
                stringBuilder.append(" is unexpected.");
                AnonymousClass0Gn.H("DirectVisualMessageViewerFragment", stringBuilder.toString());
                break;
        }
        r0.f65494n = new AnonymousClass4dY(r0, str);
        if (r0.f65483c == null) {
            AnonymousClass0NN.B("direct_thread_summary_null_in_viewer", r0).F("entry_point", r0.f65461G).F("thread_id", r0.f65504x).H("is_replay", r0.f65466L).B("unseenStoriesCount", i).B("seenStoriesCount", i2).R();
            AnonymousClass0LH.F(r0.f65483c, "Summary is null");
        }
        r0.f65488h = UUID.randomUUID().toString();
        r0.f65471Q = arguments.getString("DirectStoryViewerFragment.ARGUMENTS_MESSAGE_ID");
        string = arguments.getString("DirectStoryViewerFragment.ARGUMENTS_MESSAGE_CLIENT_CONTEXT");
        if (((Boolean) AnonymousClass0CC.eI.H(r0.f65485e)).booleanValue()) {
            directThreadKey = r0.f65505y;
            str2 = r0.f65471Q;
            anonymousClass4gq = null;
            if (str2 == null) {
                if (string == null) {
                    if (r0.f65466L) {
                        d = r0.f65459E.d(directThreadKey, null);
                        if (d.isEmpty()) {
                            T = r0.f65483c.T();
                            J = d.size();
                            T = Math.min(100, Math.max(T, J));
                            anonymousClass4gq = new AnonymousClass4gq(getContext(), r0.f65485e, r0.f65483c, d.subList(0, Math.min(J, T)), T, null);
                        } else {
                            AnonymousClass0Gn.C("DirectVisualMessageViewerFragment", "getUnseenVisualMessages is empty");
                        }
                    } else {
                        f = r0.f65459E.f(directThreadKey, r0.f65475U);
                        min = Math.min(100, f.size());
                        anonymousClass4gq = new AnonymousClass4gq(getContext(), r0.f65485e, r0.f65483c, f.subList(0, min), min, null);
                    }
                    r0.f65486f = anonymousClass4gq;
                }
            }
            if (str2 == null) {
                V = r0.f65459E.U(directThreadKey, AnonymousClass0V0.EXPIRING_MEDIA, string);
            } else {
                V = r0.f65459E.V(directThreadKey, str2);
            }
            r0.f65460F = V;
            if (V != null) {
                if (V.Z(r0.f65485e.B())) {
                }
                f = Collections.singletonList(r0.f65460F);
                r0.f65481a = false;
                min = Math.min(100, f.size());
                anonymousClass4gq = new AnonymousClass4gq(getContext(), r0.f65485e, r0.f65483c, f.subList(0, min), min, null);
            } else {
                AnonymousClass0Gn.C("DirectVisualMessageViewerFragment", "Message not available");
            }
            r0.f65486f = anonymousClass4gq;
        } else {
            r0.f65486f = m27235f(r0.f65505y, r0.f65471Q, string);
        }
        if (r0.f65486f == null) {
            r0.f65486f = new AnonymousClass4gq(getContext(), r0.f65485e, r0.f65483c, new ArrayList(), 0, 0);
            getActivity().finish();
        }
        r0.f65462H = (RectF) arguments.getParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_ENTRY_VIEW_BOUNDS");
        anonymousClass0w0 = new AnonymousClass0w0(r0.f65494n, new AnonymousClass4ZV(), r0.f65485e);
        r0.f65464J = anonymousClass0w0;
        registerLifecycleListener(anonymousClass0w0);
        synchronized (AnonymousClass4ZT.class) {
            if (AnonymousClass4ZT.f55391B == null) {
                AnonymousClass4ZT.f55391B = new AnonymousClass4ZT();
            }
        }
        anonymousClass0EE = r0.f65494n;
        string2 = r0.f65488h;
        str3 = r0.f65504x;
        z = r0.f65466L;
        if (bundle2 == null) {
            AnonymousClass0NN.B("direct_story_playback_entry", anonymousClass0EE).F("viewer_session_id", string2).B("new_reel_count", i).B("viewed_reel_count", i2).F("thread_id", str3).H("is_replay", z).R();
        }
        anonymousClass0jC = new AnonymousClass0jC(r0.f65494n, false, getContext());
        r0.f65472R = anonymousClass0jC;
        registerLifecycleListener(anonymousClass0jC);
        AnonymousClass0cQ.G(r0, -106180562, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1196286989);
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = (TouchInterceptorFrameLayout) layoutInflater.inflate(C0164R.layout.fragment_direct_visual_message_viewer, viewGroup, false);
        this.mReelViewerShadowAnimator = new AnonymousClass5Bn(getActivity().getWindow().getDecorView());
        this.f65489i = new AnonymousClass4lb(this.f65485e, touchInterceptorFrameLayout, new AnonymousClass5Vs(this, getContext().getResources().getDimensionPixelSize(C0164R.dimen.direct_expiring_media_pause_sparkler_size) / 2));
        touchInterceptorFrameLayout.requestFocus();
        touchInterceptorFrameLayout.setOnKeyListener(this);
        AnonymousClass0cQ.G(this, 2024826434, F);
        return touchInterceptorFrameLayout;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 344370618);
        super.onDestroyView();
        this.mKeyboardHeightChangeDetector.D(this);
        AnonymousClass4lb anonymousClass4lb = this.f65489i;
        anonymousClass4lb.m25008A();
        anonymousClass4lb.f56959D.destroy();
        this.mContentHolder.f55338D.C(C0164R.id.direct_visual_message_viewer_fragment_image_view_id);
        this.mContentHolder.f55338D.C(C0164R.id.listener_id_for_direct_visual_message_item_viewer_image_binding);
        this.f65498r.A();
        this.f65498r = null;
        AnonymousClass14H.C(this.f65473S).J();
        AnonymousClass14H.C(this.mContentView).J();
        this.mPhotoTimerController.D();
        this.mVideoPlayer.m25035H("fragment_paused");
        DirectVisualMessageViewerFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0ea.E(Z().getWindow(), Z().getWindow().getDecorView(), true);
        AnonymousClass0cQ.G(this, 492604723, F);
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        return this.mVideoPlayer.m25033F(view, i, keyEvent);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, 769107051);
        super.onPause();
        AnonymousClass4ZS anonymousClass4ZS = this.f65490j;
        AnonymousClass0NN G = AnonymousClass0NN.B("direct_story_session_summary", this.f65494n).F("viewer_session_id", anonymousClass4ZS.f55390O).B("photos_consumed", anonymousClass4ZS.f55379D).B("videos_consumed", anonymousClass4ZS.f55381F).G("reel_session_consumption_list", anonymousClass4ZS.f55377B);
        String str = "is_replay";
        String str2 = anonymousClass4ZS.f55383H ? "1" : "0";
        double elapsedRealtime = (double) (SystemClock.elapsedRealtime() - anonymousClass4ZS.f55386K);
        Double.isNaN(elapsedRealtime);
        G = G.F(str, str2).F("thread_id", anonymousClass4ZS.f55387L).B("reel_size", anonymousClass4ZS.f55385J).A("time_elapsed", elapsedRealtime / 1000.0d).B("one_view_consumed", anonymousClass4ZS.f55382G).B("replayable_consumed", anonymousClass4ZS.f55380E).B("permanent_consumed", anonymousClass4ZS.f55378C).A("pause_duration", anonymousClass4ZS.f55384I);
        str = anonymousClass4ZS.f55389N;
        if (str != null) {
            G.F("direct_story_tray_session_id", str);
        }
        Integer num = anonymousClass4ZS.f55388M;
        if (num != null) {
            G.B("tray_position", num.intValue());
        }
        G.R();
        m27230a(this, "fragment_paused");
        AnonymousClass5EB anonymousClass5EB = this.f65480Z;
        if (anonymousClass5EB != null) {
            this.f65479Y.m26006A(anonymousClass5EB);
            this.f65480Z = null;
        }
        this.f65479Y.m26009D();
        this.f65498r.A();
        AnonymousClass0F4.f2058E.D(AnonymousClass0X5.class, this.f65492l);
        AnonymousClass0F4.f2058E.D(AnonymousClass0RN.class, this.f65500t);
        this.mKeyboardHeightChangeDetector.C();
        this.mComposerEditText.removeTextChangedListener(this.mComposerTextWatcher);
        this.mComposerEditText.setOnFocusChangeListener(null);
        if (!(this.f65476V || this.f65501u || this.f65499s)) {
            m27208E(this, 9, true);
        }
        this.f65456B.f60561D = null;
        this.f65497q.f20245C = null;
        AnonymousClass0cQ.G(this, -1638731097, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -930315149);
        super.onResume();
        this.f65501u = false;
        this.f65499s = false;
        this.f65476V = false;
        this.f65489i.m25008A();
        this.f65490j.f55386K = SystemClock.elapsedRealtime();
        AnonymousClass0ea.E(Z().getWindow(), Z().getWindow().getDecorView(), false);
        if (this.f65463I) {
            m27231b(this, "resume");
        }
        this.f65479Y.m26008C(getContext());
        if (this.f65480Z == null) {
            this.f65480Z = this.f65479Y.m26007B(new AnonymousClass5Wv(this.f65485e, this.f65486f.f56319E, this.f65486f.B().getId()));
        }
        if (this.f65486f.D() < this.f65486f.f56321G) {
            String str;
            AnonymousClass0Tw C = AnonymousClass0Tw.C(this.f65485e);
            DirectThreadKey F2 = this.f65483c.F();
            AnonymousClass4gq anonymousClass4gq = this.f65486f;
            if (anonymousClass4gq.f56317C.isEmpty()) {
                str = null;
            } else {
                List list = anonymousClass4gq.f56317C;
                str = ((AnonymousClass4go) list.get(list.size() - 1)).f56303N;
            }
            List d = C.d(F2, str);
            if (d != null) {
                this.f65486f.A(AnonymousClass4gp.B(d, getContext()));
            }
        }
        AnonymousClass0F4.f2058E.A(AnonymousClass0X5.class, this.f65492l);
        AnonymousClass0F4.f2058E.A(AnonymousClass0RN.class, this.f65500t);
        this.mKeyboardHeightChangeDetector.B(getActivity());
        this.mComposerEditText.addTextChangedListener(this.mComposerTextWatcher);
        this.mComposerEditText.setOnFocusChangeListener(new AnonymousClass4dL(this));
        AnonymousClass1Sc.B(this.f65485e).A(this.f65483c.O());
        AnonymousClass0EA B = AnonymousClass0EA.B();
        AnonymousClass0Cm anonymousClass0Cm = this.f65485e;
        B.A(anonymousClass0Cm, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, AnonymousClass0Vm.B(anonymousClass0Cm.f1759C, this.f65504x, null));
        this.f65456B.f60561D = this;
        this.f65497q.f20245C = this;
        AnonymousClass0cQ.G(this, 1057224784, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mVideoPlayer = new AnonymousClass4mC(getContext(), this, new AnonymousClass4ZW(this.f65486f, this.f65466L, this.f65494n, this.f65488h), this.f65485e, getModuleName());
        this.mPhotoTimerController = new AnonymousClass1Pk(this);
        this.mRootView = view.findViewById(C0164R.id.direct_visual_message_viewer_root_container);
        this.mContentView = view.findViewById(C0164R.id.direct_expiring_media_viewer_content);
        this.mItemView = view.findViewById(C0164R.id.direct_expiring_media_viewer_container);
        this.mViewerInfoContainer = this.mContentView.findViewById(C0164R.id.viewer_info_header);
        this.mProgressBar = (SegmentedProgressBar) view.findViewById(C0164R.id.progress_bar);
        this.f65473S = (CircularImageView) view.findViewById(C0164R.id.profile_transition_view);
        this.mContentHolder = new AnonymousClass4ZK(getContext(), this.mContentView, this.f65485e);
        this.mContentView.setTag(this.mContentHolder);
        this.mVolumeIndicator = (VolumeIndicator) view.findViewById(C0164R.id.direct_expiring_media_viewer_volume_indicator);
        this.f65490j = new AnonymousClass4ZS(null, null, this.f65488h, this.f65466L, this.f65504x);
        this.f65498r = new AnonymousClass4e0(this.f65485e);
        View findViewById = view.findViewById(C0164R.id.direct_visual_message_viewer_composer);
        this.mReplyComposerContainer = findViewById;
        this.mComposerEditText = (EditText) findViewById.findViewById(C0164R.id.direct_expiring_media_viewer_composer_edit_text);
        this.mBackgroundDimmer = view.findViewById(C0164R.id.background_dimmer);
        this.mComposerEditText.setOnEditorActionListener(new AnonymousClass4dZ(this));
        findViewById = this.mReplyComposerContainer.findViewById(C0164R.id.direct_expiring_media_viewer_composer_camera_button);
        findViewById.setOnClickListener(new AnonymousClass4da(this, findViewById));
        findViewById = this.mReplyComposerContainer.findViewById(C0164R.id.direct_expiring_media_text_send_button);
        this.mTextSendButton = findViewById;
        findViewById.setOnClickListener(new AnonymousClass1Si(this));
        this.mComposerTextWatcher = new AnonymousClass4dK(this);
        AnonymousClass0hj anonymousClass0hj = new AnonymousClass0hj();
        this.mKeyboardHeightChangeDetector = anonymousClass0hj;
        anonymousClass0hj.A(this);
        this.mSparklerAnimationStubHolder = new AnonymousClass0ct((ViewStub) view.findViewById(C0164R.id.direct_expiring_media_view_once_pause_sparkler_stub));
        this.mBlurImageViewContainerStubHolder = new AnonymousClass0ct((ViewStub) view.findViewById(C0164R.id.direct_expiring_media_blur_image_stub));
        this.f65474T = new AnonymousClass59I(getContext(), this.mItemView, this);
        if (this.f65486f.f56321G > 0) {
            m27234e();
        }
    }

    public final void rFA(Object obj, int i) {
        AnonymousClass4go anonymousClass4go = (AnonymousClass4go) obj;
    }

    public final void tFA(Object obj, int i) {
        AnonymousClass4go anonymousClass4go = (AnonymousClass4go) obj;
    }

    public final /* bridge */ /* synthetic */ void vFA(Object obj, Object obj2, int i, boolean z) {
        AnonymousClass4go anonymousClass4go = (AnonymousClass4go) obj;
        AnonymousClass4ZK anonymousClass4ZK = (AnonymousClass4ZK) obj2;
        m27226W(this, this.f65486f, i, anonymousClass4go);
        if (!z) {
            m27224U(this, anonymousClass4go);
        }
    }
}
