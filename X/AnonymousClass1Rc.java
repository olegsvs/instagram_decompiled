package X;

import com.facebook.react.ReactInstanceManager$ReactInstanceEventListener;
import com.facebook.react.bridge.ReactContext;
import com.instagram.react.delegate.IgReactDelegate;

/* renamed from: X.1Rc */
public final class AnonymousClass1Rc implements ReactInstanceManager$ReactInstanceEventListener {
    /* renamed from: B */
    public final /* synthetic */ IgReactDelegate f18612B;

    public AnonymousClass1Rc(IgReactDelegate igReactDelegate) {
        this.f18612B = igReactDelegate;
    }

    public final void onReactContextInitialized(ReactContext reactContext) {
        if (!this.f18612B.f4805B && this.f18612B.mFrameLayout != null) {
            this.f18612B.mFrameLayout.removeView(this.f18612B.mLoadingIndicator);
            IgReactDelegate.m4253B(this.f18612B);
            IgReactDelegate.m4255D(this.f18612B).removeReactInstanceEventListener(this.f18612B.f4808E);
            this.f18612B.f4808E = null;
        }
    }
}
