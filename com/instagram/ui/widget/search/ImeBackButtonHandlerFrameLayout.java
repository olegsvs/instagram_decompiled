package com.instagram.ui.widget.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.widget.FrameLayout;

public class ImeBackButtonHandlerFrameLayout extends FrameLayout {
    /* renamed from: B */
    private SearchController f43825B;

    public ImeBackButtonHandlerFrameLayout(Context context) {
        this(context, null);
    }

    public ImeBackButtonHandlerFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ImeBackButtonHandlerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (this.f43825B != null) {
            DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (!(this.f43825B.f48694F || keyDispatcherState == null)) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    keyDispatcherState.startTracking(keyEvent, this);
                } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && keyDispatcherState.isTracking(keyEvent)) {
                    return this.f43825B.m22218F();
                }
                return true;
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    public void setBackListener(SearchController searchController) {
        this.f43825B = searchController;
    }
}
