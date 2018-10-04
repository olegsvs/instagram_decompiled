package com.instagram.creation.capture;

import X.AnonymousClass0Ca;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.C0164R;

public class FocusIndicatorView extends View {
    public FocusIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: A */
    public final void m23752A() {
        setDrawable(C0164R.drawable.ic_focus_failed);
    }

    /* renamed from: B */
    public final void m23753B() {
        setDrawable(C0164R.drawable.ic_focus_focusing);
    }

    /* renamed from: C */
    public final void m23754C() {
        setDrawable(C0164R.drawable.ic_focus_focused);
    }

    private void setDrawable(int i) {
        setBackground(AnonymousClass0Ca.E(getContext(), i));
    }
}
