package com.facebook.react.uimanager;

import X.AnonymousClass0LR;
import android.view.View;

public final class RootViewUtil {
    public static RootView getRootView(View view) {
        while (!(view instanceof RootView)) {
            view = view.getParent();
            if (view == null) {
                return null;
            }
            AnonymousClass0LR.B(view instanceof View);
            view = view;
        }
        return (RootView) view;
    }
}
