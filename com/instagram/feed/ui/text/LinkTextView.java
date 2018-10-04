package com.instagram.feed.ui.text;

import X.AnonymousClass0cQ;
import X.AnonymousClass2M6;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;

public class LinkTextView extends TextView {
    public LinkTextView(Context context) {
        super(context);
    }

    public LinkTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LinkTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.m5863M(this, -1518675000);
        Layout layout = getLayout();
        boolean z = true;
        Object obj = (layout == null || !AnonymousClass2M6.B(motionEvent, layout, this)) ? null : 1;
        if (obj == null) {
            if (!super.onTouchEvent(motionEvent)) {
                z = false;
            }
        }
        AnonymousClass0cQ.m5862L(this, 1375740748, M);
        return z;
    }
}
