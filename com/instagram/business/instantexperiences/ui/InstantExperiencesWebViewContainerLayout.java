package com.instagram.business.instantexperiences.ui;

import X.AnonymousClass5dW;
import X.AnonymousClass5hG;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class InstantExperiencesWebViewContainerLayout extends FrameLayout {
    /* renamed from: B */
    private AnonymousClass5dW f68197B;
    /* renamed from: C */
    private AnonymousClass5hG f68198C;

    public InstantExperiencesWebViewContainerLayout(Context context) {
        super(context);
    }

    public InstantExperiencesWebViewContainerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InstantExperiencesWebViewContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AnonymousClass5dW getWebView() {
        return this.f68197B;
    }

    public void setWebView(AnonymousClass5dW anonymousClass5dW) {
        removeAllViews();
        addView(anonymousClass5dW);
        AnonymousClass5hG anonymousClass5hG = this.f68198C;
        if (anonymousClass5hG != null) {
            anonymousClass5hG.onWebViewChange(this.f68197B, anonymousClass5dW);
        }
        this.f68197B = anonymousClass5dW;
    }

    public void setWebViewChangeListner(AnonymousClass5hG anonymousClass5hG) {
        this.f68198C = anonymousClass5hG;
    }
}
