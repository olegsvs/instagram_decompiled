package com.facebook.react;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

public final class ReactInstanceManager$4 implements OnAttachStateChangeListener {
    public final /* synthetic */ ReactInstanceManager this$0;
    public final /* synthetic */ View val$decorView;

    public final void onViewDetachedFromWindow(View view) {
    }

    public ReactInstanceManager$4(ReactInstanceManager reactInstanceManager, View view) {
        this.this$0 = reactInstanceManager;
        this.val$decorView = view;
    }

    public final void onViewAttachedToWindow(View view) {
        this.val$decorView.removeOnAttachStateChangeListener(this);
        this.this$0.mDevSupportManager.setDevSupportEnabled(true);
    }
}
