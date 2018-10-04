package com.instagram.react.perf;

import X.AnonymousClass0cQ;
import X.AnonymousClass0xU;
import X.AnonymousClass5t5;
import android.content.Context;
import android.os.SystemClock;
import com.facebook.react.views.view.ReactViewGroup;

public final class IgReactPerformanceLoggerFlag extends ReactViewGroup {
    private final AnonymousClass5t5 mReactPerformanceFlagListener;

    public IgReactPerformanceLoggerFlag(Context context, AnonymousClass5t5 anonymousClass5t5) {
        super(context);
        this.mReactPerformanceFlagListener = anonymousClass5t5;
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, 2015222884);
        super.onAttachedToWindow();
        if (this.mReactPerformanceFlagListener != null) {
            AnonymousClass0xU anonymousClass0xU = AnonymousClass0xU.f12560b;
            anonymousClass0xU.f12574O.set(SystemClock.uptimeMillis());
            anonymousClass0xU.B();
        }
        AnonymousClass0cQ.O(this, 1411489335, N);
    }
}
