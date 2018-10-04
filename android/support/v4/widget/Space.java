package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.facebook.forker.Process;

public class Space extends View {
    public final void draw(Canvas canvas) {
    }

    public Space(Context context) {
        this(context, null);
    }

    public Space(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Space(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }

    /* renamed from: B */
    private static int m13161B(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        if (mode == Process.WAIT_RESULT_TIMEOUT) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode != 1073741824) {
            return i;
        }
        return size;
    }

    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(m13161B(getSuggestedMinimumWidth(), i), m13161B(getSuggestedMinimumHeight(), i2));
    }
}
