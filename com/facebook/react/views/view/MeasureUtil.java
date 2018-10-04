package com.facebook.react.views.view;

import android.view.View.MeasureSpec;
import com.facebook.forker.Process;
import com.facebook.yoga.YogaMeasureMode;

public final class MeasureUtil {
    public static int getMeasureSpec(float f, YogaMeasureMode yogaMeasureMode) {
        if (yogaMeasureMode == YogaMeasureMode.EXACTLY) {
            return MeasureSpec.makeMeasureSpec((int) f, 1073741824);
        }
        if (yogaMeasureMode == YogaMeasureMode.AT_MOST) {
            return MeasureSpec.makeMeasureSpec((int) f, Process.WAIT_RESULT_TIMEOUT);
        }
        return MeasureSpec.makeMeasureSpec(0, 0);
    }
}
