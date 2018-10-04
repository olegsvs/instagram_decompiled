package com.instagram.ui.widget.textview;

import X.AnonymousClass0cQ;
import android.content.Context;
import android.text.Layout;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;

public class CommentTextView extends TextView {
    public CommentTextView(Context context) {
        super(context);
    }

    public CommentTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CommentTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.M(this, -1953878172);
        if (motionEvent.getAction() == 0) {
            int x = (((int) motionEvent.getX()) - getTotalPaddingLeft()) + getScrollX();
            int y = (((int) motionEvent.getY()) - getTotalPaddingTop()) + getScrollY();
            Layout layout = getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) x);
            if (getText() == null || !(getText() instanceof Spannable) || ((ClickableSpan[]) ((Spannable) getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class)).length == 0) {
                AnonymousClass0cQ.L(this, -192586435, M);
                return false;
            }
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            AnonymousClass0cQ.L(this, 2089807832, M);
            return onTouchEvent;
        }
        onTouchEvent = super.onTouchEvent(motionEvent);
        AnonymousClass0cQ.L(this, -184921541, M);
        return onTouchEvent;
    }
}
