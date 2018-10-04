package com.instagram.ui.widget.touchconstrainedrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class TouchConstrainedRecyclerView extends RecyclerView {
    public TouchConstrainedRecyclerView(Context context) {
        super(context);
    }

    public TouchConstrainedRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchConstrainedRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && Y(motionEvent.getX(), motionEvent.getY()) == null) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
