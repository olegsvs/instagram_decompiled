package com.facebook.react;

import X.AnonymousClass0CM;

public final class ReactInstanceManager$9 implements Runnable {
    public final /* synthetic */ ReactInstanceManager this$0;
    public final /* synthetic */ int val$rootTag;
    public final /* synthetic */ ReactRootView val$rootView;

    public ReactInstanceManager$9(ReactInstanceManager reactInstanceManager, int i, ReactRootView reactRootView) {
        this.this$0 = reactInstanceManager;
        this.val$rootTag = i;
        this.val$rootView = reactRootView;
    }

    public final void run() {
        AnonymousClass0CM.J(8192, "pre_rootView.onAttachedToReactInstance", this.val$rootTag);
        this.val$rootView.onAttachedToReactInstance();
    }
}
