package com.instagram.feed.ui.text;

import X.AnonymousClass0cQ;
import X.AnonymousClass2M6;
import android.content.Context;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class IgLikeTextView extends BulletAwareTextView {
    public IgLikeTextView(Context context) {
        super(context);
    }

    public IgLikeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IgLikeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.m5863M(this, -726500127);
        Layout layout = getLayout();
        boolean z = false;
        if ((layout != null ? AnonymousClass2M6.B(motionEvent, layout, this) : false) || super.onTouchEvent(motionEvent)) {
            z = true;
        }
        AnonymousClass0cQ.m5862L(this, 1462814487, M);
        return z;
    }

    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i == 16) {
            Layout layout = getLayout();
            if (layout != null) {
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) layout.getText()).getSpans(0, 0, ClickableSpan.class);
                if (clickableSpanArr.length > 0) {
                    clickableSpanArr[0].onClick(this);
                }
            }
        }
        return super.performAccessibilityAction(i, bundle);
    }
}
