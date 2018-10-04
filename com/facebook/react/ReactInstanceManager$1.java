package com.facebook.react;

import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;

public final class ReactInstanceManager$1 implements DefaultHardwareBackBtnHandler {
    public final /* synthetic */ ReactInstanceManager this$0;

    public ReactInstanceManager$1(ReactInstanceManager reactInstanceManager) {
        this.this$0 = reactInstanceManager;
    }

    public final void invokeDefaultOnBackPressed() {
        ReactInstanceManager.invokeDefaultOnBackPressed(this.this$0);
    }
}
