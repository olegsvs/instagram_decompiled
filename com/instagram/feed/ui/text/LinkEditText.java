package com.instagram.feed.ui.text;

import X.AnonymousClass0cQ;
import X.AnonymousClass2M6;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.EditText;

public class LinkEditText extends EditText {
    public LinkEditText(Context context) {
        super(context);
    }

    public LinkEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LinkEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.M(this, -644205458);
        Layout layout = getLayout();
        boolean z = true;
        Object obj = (layout == null || !AnonymousClass2M6.m15193B(motionEvent, layout, this)) ? null : 1;
        if (obj == null) {
            if (!super.onTouchEvent(motionEvent)) {
                z = false;
            }
        }
        AnonymousClass0cQ.L(this, -1832881650, M);
        return z;
    }
}
