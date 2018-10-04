package com.instagram.common.ui.text;

import X.AnonymousClass0cQ;
import X.AnonymousClass23B;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.facebook.forker.Process;

public class TightTextView extends AnonymousClass23B {
    /* renamed from: B */
    private boolean f30967B = true;

    public TightTextView(Context context) {
        super(context);
    }

    public TightTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TightTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void onMeasure(int i, int i2) {
        int N = AnonymousClass0cQ.N(this, -744288736);
        super.onMeasure(i, i2);
        if (this.f30967B) {
            if (MeasureSpec.getMode(i) != 1073741824) {
                Layout layout = getLayout();
                if (layout != null) {
                    int i3;
                    int lineCount = layout.getLineCount();
                    float f = 0.0f;
                    for (i3 = 0; i3 < lineCount; i3++) {
                        if (layout.getLineWidth(i3) > f) {
                            f = layout.getLineWidth(i3);
                        }
                    }
                    i3 = (((int) Math.ceil((double) f)) + getCompoundPaddingLeft()) + getCompoundPaddingRight();
                    if (i3 < getMeasuredWidth()) {
                        super.onMeasure(MeasureSpec.makeMeasureSpec(i3, Process.WAIT_RESULT_TIMEOUT), i2);
                    }
                }
            }
            AnonymousClass0cQ.O(this, 481974070, N);
            return;
        }
        AnonymousClass0cQ.O(this, 1808413649, N);
    }

    public void setTightMeasurementEnabled(boolean z) {
        this.f30967B = z;
    }
}
