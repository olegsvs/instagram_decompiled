package X;

import com.facebook.react.ReactRootView;
import com.facebook.react.ReactRootView.ReactRootViewEventListener;
import com.facebook.react.bridge.ReactContext;
import com.instagram.react.delegate.IgReactDelegate;
import com.instagram.react.delegate.IgReactDelegate$RCTViewEventEmitter;

/* renamed from: X.5rR */
public final class AnonymousClass5rR implements ReactRootViewEventListener {
    /* renamed from: B */
    public final /* synthetic */ IgReactDelegate f69442B;

    public AnonymousClass5rR(IgReactDelegate igReactDelegate) {
        this.f69442B = igReactDelegate;
    }

    public final void onAttachedToReactInstance(ReactRootView reactRootView) {
        ReactContext currentReactContext = IgReactDelegate.D(this.f69442B).getCurrentReactContext();
        if (this.f69442B.f4807D && currentReactContext != null) {
            this.f69442B.f4807D = false;
        }
        if (currentReactContext != null) {
            ((IgReactDelegate$RCTViewEventEmitter) currentReactContext.getJSModule(IgReactDelegate$RCTViewEventEmitter.class)).emit("viewDidAppear", Integer.valueOf(reactRootView.getRootViewTag()));
        }
    }
}
