package com.instagram.direct.fragment.inbox;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0EE;
import X.AnonymousClass0G5;
import X.AnonymousClass0Gn;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IL;
import X.AnonymousClass0IQ;
import X.AnonymousClass0IT;
import X.AnonymousClass0J7;
import X.AnonymousClass0NN;
import X.AnonymousClass0Px;
import X.AnonymousClass0QW;
import X.AnonymousClass0Sn;
import X.AnonymousClass0Tf;
import X.AnonymousClass0Tw;
import X.AnonymousClass0Vw;
import X.AnonymousClass0W7;
import X.AnonymousClass0cD;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eT;
import X.AnonymousClass0eV;
import X.AnonymousClass0eW;
import X.AnonymousClass0ea;
import X.AnonymousClass18O;
import X.AnonymousClass1T2;
import X.AnonymousClass1b2;
import X.AnonymousClass22r;
import X.AnonymousClass3In;
import X.AnonymousClass3e1;
import X.AnonymousClass4Ys;
import X.AnonymousClass4Yt;
import X.AnonymousClass4aC;
import X.AnonymousClass4aK;
import X.AnonymousClass4lG;
import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.DirectVisualMessageReplyViewModel;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.ui.widget.search.SearchController;
import java.util.ArrayList;
import java.util.List;

public class DirectSearchInboxFragment extends AnonymousClass0IJ implements AnonymousClass0QW, AnonymousClass4Yt, AnonymousClass0IT, AnonymousClass4aC {
    /* renamed from: B */
    public DirectThreadKey f65081B;
    /* renamed from: C */
    public RectF f65082C;
    /* renamed from: D */
    public AnonymousClass0Cm f65083D;
    /* renamed from: E */
    public String f65084E;
    /* renamed from: F */
    private int f65085F;
    /* renamed from: G */
    private AnonymousClass4aK f65086G;
    /* renamed from: H */
    private boolean f65087H;
    public TouchInterceptorFrameLayout mTouchInterceptorFrameLayout;

    public final void DCA(DirectShareTarget directShareTarget, String str, int i) {
    }

    public final void Dz() {
    }

    public final AnonymousClass0IQ NM() {
        return this;
    }

    public final void PLA() {
    }

    public final String getModuleName() {
        return "DIRECT_SEARCH_INBOX_FRAGMENT";
    }

    public final void ECA(DirectShareTarget directShareTarget, RectF rectF, String str) {
        AnonymousClass0Vw anonymousClass0Vw;
        AnonymousClass0IL anonymousClass0IL = this;
        DirectVisualMessageReplyViewModel B = AnonymousClass1b2.B(this.f65083D.B(), directShareTarget);
        AnonymousClass0Tw C = AnonymousClass0Tw.C(this.f65083D);
        String C2 = B.f27809D.C();
        AnonymousClass0W7 anonymousClass0W7 = null;
        if (C2 == null) {
            anonymousClass0Vw = null;
        } else {
            anonymousClass0Vw = C.c(C2);
        }
        if (anonymousClass0Vw != null) {
            Object obj;
            List f;
            if (isResumed()) {
                DirectThreadKey directThreadKey = this.f65081B;
                if (!(directThreadKey == null || !directThreadKey.equals(anonymousClass0Vw.F()) || anonymousClass0Vw.b())) {
                    obj = 1;
                    if (obj != null) {
                        f = C.f(anonymousClass0Vw.F(), this.f65084E);
                        if (!(f == null || f.isEmpty())) {
                            anonymousClass0W7 = (AnonymousClass0W7) f.get(f.size() - 1);
                        }
                    }
                }
            }
            obj = null;
            if (obj != null) {
                f = C.f(anonymousClass0Vw.F(), this.f65084E);
                anonymousClass0W7 = (AnonymousClass0W7) f.get(f.size() - 1);
            }
        }
        RectF rectF2 = rectF;
        String str2 = str;
        if (anonymousClass0W7 == null) {
            AnonymousClass3In DNA = AnonymousClass0J7.f2895B.O().B().jNA(B).yNA(rectF2).wNA(str2).vRA(AnonymousClass0G5.B(getContext(), C0164R.attr.quickCaptureVerticalTransitionAndBlackBackgroundEnabled, false) ? -16777216 : -1).DNA(AnonymousClass0cD.NORMAL);
            RectF rectF3 = this.f65082C;
            if (rectF3 != null) {
                DNA.AQA(rectF3);
            }
            new AnonymousClass0Sn(TransparentModalActivity.class, "direct_quick_reply_camera_fragment", DNA.LD(), getActivity(), this.f65083D.f1759C).D(this).B(getContext());
            getActivity().overridePendingTransition(0, 0);
        } else {
            new AnonymousClass0Sn(TransparentModalActivity.class, "direct_visual_reply_fragment", AnonymousClass0J7.f2895B.N().A(AnonymousClass1b2.C(getContext(), anonymousClass0Vw, anonymousClass0Vw.O(), this.f65083D), anonymousClass0Vw.F(), anonymousClass0W7.f5885O, AnonymousClass0Tf.f5226B.A(anonymousClass0W7.f5915s).XU(), str2, false, null, rectF, rectF2), getActivity(), anonymousClass0IL.f65083D.f1759C).D(anonymousClass0IL).B(getContext());
            getActivity().overridePendingTransition(0, 0);
        }
        getActivity().onBackPressed();
    }

    public final TouchInterceptorFrameLayout NT() {
        return this.mTouchInterceptorFrameLayout;
    }

    /* renamed from: Q */
    public final void m27100Q() {
        super.Q();
        if (this.f65087H) {
            AnonymousClass4aK anonymousClass4aK = this.f65086G;
            if (anonymousClass4aK.f55492H == null) {
                Context context = anonymousClass4aK.f55487C;
                AnonymousClass3e1 C = AnonymousClass1T2.C(context, anonymousClass4aK.f55493I, new AnonymousClass0Px(context, anonymousClass4aK.f55488D), anonymousClass4aK, (String) AnonymousClass0CC.hG.H(anonymousClass4aK.f55493I), true, "raven", true, true, true);
                anonymousClass4aK.f55492H = C;
                C.EPA(anonymousClass4aK.f55489E);
            }
            anonymousClass4aK.f55491G.G(false, 0.0f);
            this.f65087H = false;
        }
        AnonymousClass0ea.D(getActivity(), AnonymousClass0G5.D(getContext(), C0164R.attr.backgroundColorPrimaryDark));
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.k(false);
        AnonymousClass22r B = AnonymousClass0eW.B(AnonymousClass0eV.DEFAULT);
        B.f25417K = true;
        B.f25419M = AnonymousClass0G5.D(getContext(), C0164R.attr.backgroundColorPrimaryDark);
        anonymousClass0eT.d(B.B());
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1532412558);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f65083D = AnonymousClass0Ce.G(arguments);
        this.f65082C = (RectF) arguments.getParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_ON_DIRECT_SEND_SUCCESS_EXIT_BOUNDS");
        this.f65084E = arguments.getString("DirectInboxFragment.DIRECT_VISUAL_MESSAGE_REPLAY_SESSION_ID");
        this.f65081B = (DirectThreadKey) arguments.getParcelable("DirectInboxFragment.DIRECT_VISUAL_MESSAGE_REPLAY_THREAD_KEY");
        this.f65085F = arguments.getInt("DirectInboxSearchFragment.DIRECT_CONTAINER_MARGIN_BOTTOM_PX");
        AnonymousClass0cQ.G(this, 1019970068, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 2055900340);
        this.mTouchInterceptorFrameLayout = new TouchInterceptorFrameLayout(getContext());
        AnonymousClass4aK anonymousClass4aK = new AnonymousClass4aK(getContext(), this.f65083D, getLoaderManager(), this.f65085F, this, this, this);
        this.f65086G = anonymousClass4aK;
        Activity activity = getActivity();
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.mTouchInterceptorFrameLayout;
        anonymousClass4aK.f55489E = new AnonymousClass4Ys(anonymousClass4aK.f55487C, anonymousClass4aK.f55493I, anonymousClass4aK.f55490F, anonymousClass4aK);
        anonymousClass4aK.f55491G = new SearchController(activity, touchInterceptorFrameLayout, anonymousClass4aK.f55486B, anonymousClass4aK.f55489E, anonymousClass4aK, null, null);
        registerLifecycleListener(anonymousClass4aK.f55491G);
        this.f65087H = true;
        View view = this.mTouchInterceptorFrameLayout;
        AnonymousClass0cQ.G(this, 1018948069, F);
        return view;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 1653010746);
        super.onDestroyView();
        DirectSearchInboxFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass4aK anonymousClass4aK = this.f65086G;
        if (anonymousClass4aK != null) {
            AnonymousClass3e1 anonymousClass3e1 = anonymousClass4aK.f55492H;
            if (anonymousClass3e1 != null) {
                anonymousClass3e1.EPA(null);
            }
            this.f65086G = null;
        }
        AnonymousClass0cQ.G(this, 164354339, F);
    }

    public final void yz(int i, DirectShareTarget directShareTarget, String str) {
        DirectShareTarget directShareTarget2 = directShareTarget;
        DirectThreadKey directThreadKey = directShareTarget2.f5604E;
        if (directThreadKey == null) {
            AnonymousClass0Gn.H("DirectSearchInboxFragment", "thread key should never be null");
            return;
        }
        AnonymousClass0EE anonymousClass0EE = this.f65086G;
        AnonymousClass3e1 anonymousClass3e1 = anonymousClass0EE.f55492H;
        AnonymousClass0NN.B("direct_compose_select_recipient", anonymousClass0EE).B("position", i).F("thread_id", directThreadKey.f5871C).B("search_query_length", anonymousClass3e1 != null ? anonymousClass3e1.LQ().length() : 0).R();
        String str2 = directThreadKey.f5871C;
        Object B = directShareTarget2.B();
        String str3 = str;
        AnonymousClass0Sn D = new AnonymousClass0Sn(ModalActivity.class, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, AnonymousClass0J7.f2895B.N().C(str2, null, new ArrayList(B), false, 0, str3, r1.f65084E, null, AnonymousClass4lG.B(str3).f56888B), getActivity(), r1.f65083D.f1759C).D(r1);
        D.f5013B = ModalActivity.f5023D;
        D.f5016E = AnonymousClass18O.F(B);
        D.B(getContext());
    }
}
