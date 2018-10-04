package com.instagram.ui.widget.proxy;

import X.AnonymousClass0gE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import java.util.ArrayList;

public class ProxyFrameLayout extends FrameLayout {
    /* renamed from: B */
    public OnClickListener f7209B;
    /* renamed from: C */
    public final ArrayList f7210C = new ArrayList();
    /* renamed from: D */
    public boolean f7211D = true;

    public ProxyFrameLayout(Context context) {
        super(context);
        super.setOnClickListener(new AnonymousClass0gE(this));
    }

    public ProxyFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setOnClickListener(new AnonymousClass0gE(this));
    }

    public ProxyFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setOnClickListener(new AnonymousClass0gE(this));
    }

    /* renamed from: A */
    public final void m5925A(OnClickListener onClickListener) {
        this.f7210C.add(onClickListener);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f7209B = onClickListener;
    }

    public void setProxyToOnClickListener(boolean z) {
        this.f7211D = z;
    }
}
