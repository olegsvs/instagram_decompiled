package com.instagram.nux.ui;

import X.AnonymousClass0EH;
import X.AnonymousClass3Y7;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class NetzDgTermsTextView extends TextView {
    public NetzDgTermsTextView(Context context) {
        super(context);
        m19927B();
    }

    public NetzDgTermsTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m19927B();
    }

    public NetzDgTermsTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m19927B();
    }

    public NetzDgTermsTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m19927B();
    }

    /* renamed from: B */
    private void m19927B() {
        if (AnonymousClass0EH.B()) {
            setVisibility(0);
            setClickable(true);
            setOnClickListener(new AnonymousClass3Y7(this));
            return;
        }
        setVisibility(8);
    }
}
