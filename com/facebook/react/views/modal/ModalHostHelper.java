package com.facebook.react.views.modal;

import X.AnonymousClass0LR;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;

public final class ModalHostHelper {
    private static final Point MAX_POINT = new Point();
    private static final Point MIN_POINT = new Point();
    private static final Point SIZE_POINT = new Point();

    public static Point getModalHostSize(Context context) {
        Display defaultDisplay = ((WindowManager) AnonymousClass0LR.D((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        defaultDisplay.getCurrentSizeRange(MIN_POINT, MAX_POINT);
        defaultDisplay.getSize(SIZE_POINT);
        int[] iArr = new int[1];
        int i = 0;
        iArr[0] = 16843277;
        boolean z = context.getTheme().obtainStyledAttributes(iArr).getBoolean(0, false);
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (z && identifier > 0) {
            i = (int) resources.getDimension(identifier);
        }
        Point point = SIZE_POINT;
        if (point.x < point.y) {
            return new Point(MIN_POINT.x, MAX_POINT.y + i);
        }
        return new Point(MAX_POINT.x, MIN_POINT.y + i);
    }
}
