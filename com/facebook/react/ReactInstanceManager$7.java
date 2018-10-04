package com.facebook.react;

import android.os.Process;

public final class ReactInstanceManager$7 implements Runnable {
    public final /* synthetic */ ReactInstanceManager this$0;

    public ReactInstanceManager$7(ReactInstanceManager reactInstanceManager) {
        this.this$0 = reactInstanceManager;
    }

    public final void run() {
        Process.setThreadPriority(0);
    }
}
