package com.instagram.ui.widget.scrollview;

import X.AnonymousClass0eS;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ScrollView;
import com.facebook.forker.Process;

public class MaxHeightScrollView extends ScrollView {
    /* renamed from: B */
    private int f62071B;

    public MaxHeightScrollView(Context context) {
        super(context);
        m26226B(context, null);
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26226B(context, attributeSet);
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m26226B(context, attributeSet);
    }

    /* renamed from: B */
    private void m26226B(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.MaxHeightScrollView);
            this.f62071B = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3 = this.f62071B;
        if (i3 > 0) {
            i2 = MeasureSpec.makeMeasureSpec(i3, Process.WAIT_RESULT_TIMEOUT);
        }
        super.onMeasure(i, i2);
    }
}
