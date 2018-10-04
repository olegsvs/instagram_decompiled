package com.instagram.react.delegate;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ca;
import X.AnonymousClass0Gn;
import X.AnonymousClass0Hj;
import X.AnonymousClass0IL;
import X.AnonymousClass0Il;
import X.AnonymousClass0Im;
import X.AnonymousClass0Nm;
import X.AnonymousClass0Rx;
import X.AnonymousClass0xU;
import X.AnonymousClass0xV;
import X.AnonymousClass1Rc;
import X.AnonymousClass5rQ;
import X.AnonymousClass5rR;
import X.AnonymousClass696;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactInstanceManager$ReactInstanceEventListener;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.DoubleTapReloadRecognizer;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.instagram.react.modules.exceptionmanager.IgReactExceptionManager;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public class IgReactDelegate extends AnonymousClass0Rx implements NativeModuleCallExceptionHandler {
    /* renamed from: B */
    public boolean f4805B = false;
    /* renamed from: C */
    public boolean f4806C = false;
    /* renamed from: D */
    public boolean f4807D = true;
    /* renamed from: E */
    public ReactInstanceManager$ReactInstanceEventListener f4808E;
    /* renamed from: F */
    public ReactRootView f4809F;
    /* renamed from: G */
    private AnonymousClass696 f4810G;
    /* renamed from: H */
    private DefaultHardwareBackBtnHandler f4811H;
    /* renamed from: I */
    private DoubleTapReloadRecognizer f4812I;
    /* renamed from: J */
    private IgReactExceptionManager f4813J;
    /* renamed from: K */
    private boolean f4814K;
    /* renamed from: L */
    private int f4815L;
    /* renamed from: M */
    private AnonymousClass0Im f4816M;
    /* renamed from: N */
    private Bundle f4817N;
    /* renamed from: O */
    private boolean f4818O;
    public FrameLayout mFrameLayout;
    public View mInlineNavBar;
    public View mInlineNavCloseButton;
    public TextView mInlineNavTitle;
    public SpinnerImageView mLoadingIndicator;

    public IgReactDelegate(AnonymousClass0IL anonymousClass0IL) {
        super(anonymousClass0IL);
    }

    /* renamed from: A */
    public final void mo1201A(Bundle bundle) {
        this.f4814K = mo1205E().getBoolean("IgReactFragment.ARGUMENT_IS_INLINE_NAV_BAR_ENABLED");
        this.f4816M = AnonymousClass0Il.getInstance().getReactInstanceHolder();
        this.f4811H = new AnonymousClass5rQ(this);
        IgReactExceptionManager instance = IgReactExceptionManager.getInstance();
        this.f4813J = instance;
        instance.addExceptionHandler(this);
        this.f4812I = new DoubleTapReloadRecognizer();
        if (this.f4817N == null) {
            this.f4817N = bundle != null ? bundle.getBundle("IgReactFragment.SAVED_RN_BUNDLE") : new Bundle();
        }
        AnonymousClass0Im anonymousClass0Im = this.f4816M;
        anonymousClass0Im.f2826B++;
        bundle = mo1205E().getString("IgReactFragment.TTI_EVENT_NAME");
        if (bundle != null) {
            AnonymousClass0xU.f12560b.m8554C(AnonymousClass0xV.ReactNative, bundle, null);
        }
    }

    /* renamed from: B */
    public final void mo1202B() {
        AnonymousClass0Nm.m3435N(m4254C(this).getWindow().getDecorView());
        m4254C(this).getWindow().setSoftInputMode(48);
        if (!this.f4805B) {
            m4255D(this).onHostPause(m4254C(this));
        }
        if (this.f4818O && (m4254C(this) instanceof AnonymousClass0Hj)) {
            ((AnonymousClass0Hj) m4254C(this)).CSA(0);
        }
        m4254C(this).setRequestedOrientation(this.f4815L);
    }

    /* renamed from: B */
    public static void m4253B(IgReactDelegate igReactDelegate) {
        if (igReactDelegate.f4814K) {
            LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = igReactDelegate.f4819B.getResources().getDimensionPixelOffset(C0164R.dimen.inline_nav_bar_height);
            igReactDelegate.mFrameLayout.addView(igReactDelegate.f4809F, layoutParams);
            View inflate = LayoutInflater.from(igReactDelegate.mo1206F()).inflate(C0164R.layout.react_inline_nav_bar, igReactDelegate.mFrameLayout, false);
            igReactDelegate.mInlineNavBar = inflate;
            TextView textView = (TextView) inflate.findViewById(C0164R.id.react_inline_title);
            igReactDelegate.mInlineNavTitle = textView;
            textView.setText(igReactDelegate.mo1205E().getString("IgReactFragment.ARGUMENT_TITLE"));
            igReactDelegate.mInlineNavCloseButton = igReactDelegate.mInlineNavBar.findViewById(C0164R.id.react_inline_close_button);
            AnonymousClass696 anonymousClass696 = igReactDelegate.f4810G;
            if (!(anonymousClass696 == null || anonymousClass696.f72263B.m11810b() == null || anonymousClass696.f72263B.f19939B.mo1205E() == null)) {
                anonymousClass696.f72263B.m11810b().setGravity(17);
                anonymousClass696.f72263B.m11810b().setTextColor(-1);
                ((FrameLayout.LayoutParams) anonymousClass696.f72263B.m11810b().getLayoutParams()).leftMargin = 0;
                anonymousClass696.f72263B.m11810b().setText(anonymousClass696.f72263B.getText(C0164R.string.iglive_ssi_banner_title));
                anonymousClass696.f72263B.m11810b().setTextSize(0, anonymousClass696.f72263B.getResources().getDimension(C0164R.dimen.font_medium));
                anonymousClass696.f72263B.f19939B.mo1205E().setBackgroundResource(C0164R.drawable.iglive_ssi_banner);
            }
            igReactDelegate.mFrameLayout.addView(igReactDelegate.mInlineNavBar);
        } else {
            igReactDelegate.mFrameLayout.addView(igReactDelegate.f4809F);
        }
        AnonymousClass696 anonymousClass6962 = igReactDelegate.f4810G;
        if (anonymousClass6962 != null && anonymousClass6962.f72263B.f19939B.mo1207G() != null) {
            anonymousClass6962.f72263B.f19939B.mo1207G().setBackgroundColor(AnonymousClass0Ca.m937C(anonymousClass6962.f72263B.getContext(), C0164R.color.white));
        }
    }

    /* renamed from: C */
    public static FragmentActivity m4254C(IgReactDelegate igReactDelegate) {
        return igReactDelegate.f4819B.getActivity();
    }

    /* renamed from: C */
    public final void mo1203C() {
        if (this.f4805B && this.mFrameLayout != null && ((Boolean) AnonymousClass0CC.Da.m845G()).booleanValue()) {
            this.f4805B = false;
            this.f4809F = new ReactRootView(m4254C(this));
            this.mFrameLayout.removeAllViews();
            mo1208H();
        }
        if (!this.f4805B) {
            m4255D(this).onHostResume(m4254C(this), this.f4811H);
            ReactContext currentReactContext = m4255D(this).getCurrentReactContext();
            if (!(this.f4807D || currentReactContext == null)) {
                ((IgReactDelegate$RCTViewEventEmitter) currentReactContext.getJSModule(IgReactDelegate$RCTViewEventEmitter.class)).emit("viewDidAppear", Integer.valueOf(mo1208H()));
            }
        }
        m4254C(this).getWindow().setSoftInputMode(16);
        boolean z = mo1205E().getBoolean("IgReactFragment.ARGUMENT_SHOULD_HIDE_MAIN_TAB");
        this.f4818O = z;
        if (z && (m4254C(this) instanceof AnonymousClass0Hj)) {
            ((AnonymousClass0Hj) m4254C(this)).CSA(8);
        }
        this.f4815L = m4254C(this).getRequestedOrientation();
        m4254C(this).setRequestedOrientation(mo1205E().getInt("IgReactFragment.ARGUMENT_ORIENTATION"));
    }

    /* renamed from: D */
    public final View mo1204D() {
        return this.mFrameLayout;
    }

    /* renamed from: D */
    public static ReactInstanceManager m4255D(IgReactDelegate igReactDelegate) {
        return igReactDelegate.f4816M.m2340C();
    }

    /* renamed from: E */
    private Bundle mo1205E() {
        return this.f4819B.getArguments();
    }

    /* renamed from: E */
    public final View m4264E() {
        return this.mInlineNavBar;
    }

    /* renamed from: F */
    private Context mo1206F() {
        return this.f4819B.getContext();
    }

    /* renamed from: F */
    public final TextView m4265F() {
        return this.mInlineNavTitle;
    }

    /* renamed from: G */
    public final View m4266G() {
        return this.f4809F;
    }

    /* renamed from: G */
    private void mo1207G() {
        FrameLayout frameLayout = this.mFrameLayout;
        if (!(frameLayout == null || this.f4809F == null)) {
            frameLayout.removeAllViews();
            View inflate = LayoutInflater.from(mo1206F()).inflate(C0164R.layout.react_error_layout, this.mFrameLayout, false);
            inflate.setBackgroundColor(-1);
            this.mFrameLayout.addView(inflate);
            this.f4809F = null;
        }
        this.f4805B = true;
    }

    /* renamed from: H */
    public final int m4267H() {
        ReactRootView reactRootView = this.f4809F;
        return reactRootView != null ? reactRootView.getRootViewTag() : 0;
    }

    /* renamed from: H */
    private void mo1208H() {
        Bundle bundle = mo1205E().getBundle("IgReactFragment.ARGUMENT_INITIAL_PROPS");
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBundle("fragmentSavedInstanceState", this.f4817N);
        if (this.f4816M.m2341D()) {
            m4253B(this);
        } else {
            SpinnerImageView spinnerImageView = new SpinnerImageView(mo1206F());
            this.mLoadingIndicator = spinnerImageView;
            spinnerImageView.setImageResource(C0164R.drawable.spinner_large);
            LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.mFrameLayout.addView(this.mLoadingIndicator, layoutParams);
            this.f4808E = new AnonymousClass1Rc(this);
            m4255D(this).addReactInstanceEventListener(this.f4808E);
        }
        this.f4809F.startReactApplication(m4255D(this), mo1205E().getString("IgReactFragment.ARGUMENT_APP_KEY"), bundle);
    }

    /* renamed from: I */
    public final Bundle mo1209I() {
        return this.f4817N;
    }

    /* renamed from: J */
    public final void mo1210J(int i, int i2, Intent intent) {
        if (!this.f4805B) {
            m4255D(this).onActivityResult(m4254C(this), i, i2, intent);
        }
    }

    /* renamed from: K */
    public final View mo1211K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(mo1206F());
        this.mFrameLayout = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        if (this.f4809F == null) {
            this.f4809F = new ReactRootView(m4254C(this));
        }
        this.f4809F.setEventListener(new AnonymousClass5rR(this));
        return this.mFrameLayout;
    }

    /* renamed from: L */
    public final void mo1212L() {
        this.f4813J.removeExceptionHandler(this);
        if (!this.f4805B) {
            ReactRootView reactRootView = this.f4809F;
            if (reactRootView != null) {
                reactRootView.unmountReactApplication();
                this.f4809F = null;
            }
            m4255D(this).onHostDestroy(m4254C(this));
        }
        AnonymousClass0Im anonymousClass0Im = this.f4816M;
        int i = anonymousClass0Im.f2826B - 1;
        anonymousClass0Im.f2826B = i;
        if (i < 0) {
            AnonymousClass0Gn.m1876C(AnonymousClass0Im.class.getName(), "Negative count of active fragments");
        }
    }

    /* renamed from: M */
    public final void mo1213M() {
        if (this.f4808E != null) {
            m4255D(this).removeReactInstanceEventListener(this.f4808E);
            this.f4808E = null;
        }
        if (!this.f4805B) {
            View view = this.f4809F;
            if (view != null) {
                this.mFrameLayout.removeView(view);
                this.f4809F.setEventListener(null);
            }
        }
        IgReactDelegateLifecycleUtil.cleanupReferences(this);
    }

    /* renamed from: N */
    public final void mo1214N(Bundle bundle) {
        Bundle bundle2 = this.f4817N;
        if (bundle2 != null) {
            bundle.putBundle("IgReactFragment.SAVED_RN_BUNDLE", bundle2);
        }
    }

    /* renamed from: O */
    public final void mo1215O(View view, Bundle bundle) {
        if (this.f4805B) {
            mo1207G();
        } else if (this.f4807D) {
            mo1208H();
        } else if (this.f4816M.m2341D()) {
            m4253B(this);
        }
    }

    /* renamed from: P */
    public final void mo1216P(AnonymousClass696 anonymousClass696) {
        this.f4810G = anonymousClass696;
    }

    /* renamed from: Q */
    public final void mo1217Q(boolean z) {
        if (this.mInlineNavCloseButton != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mInlineNavTitle.getLayoutParams();
            if (z) {
                layoutParams.leftMargin = this.f4819B.getResources().getDimensionPixelOffset(C0164R.dimen.inline_nav_bar_height);
                this.mInlineNavCloseButton.setVisibility(0);
                return;
            }
            layoutParams.leftMargin = this.f4819B.getResources().getDimensionPixelOffset(C0164R.dimen.title_margin_left);
            this.mInlineNavCloseButton.setVisibility(8);
        }
    }

    /* renamed from: R */
    public final void mo1218R(Bundle bundle) {
        this.f4817N.putAll(bundle);
    }

    /* renamed from: S */
    public final void mo1219S(Bundle bundle) {
        UiThreadUtil.assertOnUiThread();
        mo1205E().putBundle("IgReactFragment.ARGUMENT_INITIAL_PROPS", bundle);
        ReactRootView reactRootView = this.f4809F;
        if (reactRootView != null) {
            reactRootView.setAppProperties(bundle);
        }
    }

    public final void handleException(Exception exception) {
        mo1207G();
    }

    public final boolean onBackPressed() {
        if (this.f4806C || this.f4805B) {
            return false;
        }
        m4255D(this).onBackPressed();
        return true;
    }

    public final boolean sU(int i, KeyEvent keyEvent) {
        if (!this.f4805B && m4255D(this).getDevSupportManager().getDevSupportEnabled()) {
            if (i == 82) {
                m4255D(this).getDevSupportManager().showDevOptionsDialog();
                return true;
            } else if (this.f4812I.didDoubleTapR(i, m4254C(this).getCurrentFocus())) {
                m4255D(this).getDevSupportManager().handleReloadJS();
                return true;
            }
        }
        return false;
    }
}
