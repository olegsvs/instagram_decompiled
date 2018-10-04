package com.facebook.react.uimanager;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;

public final class ReactClippingViewGroupHelper {
    private static final Rect sHelperRect = new Rect();

    public static void calculateClippingRect(View view, Rect rect) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            if (parent instanceof ReactClippingViewGroup) {
                ReactClippingViewGroup reactClippingViewGroup = (ReactClippingViewGroup) parent;
                if (reactClippingViewGroup.getRemoveClippedSubviews()) {
                    reactClippingViewGroup.getClippingRect(sHelperRect);
                    Rect rect2 = sHelperRect;
                    if (rect2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                        rect2.offset(-view.getLeft(), -view.getTop());
                        rect2.offset(view.getScrollX(), view.getScrollY());
                        rect.set(rect2);
                        return;
                    }
                }
            }
            view.getDrawingRect(rect);
            return;
        }
        rect.setEmpty();
    }
}
