package X;

import android.os.Build.VERSION;
import android.text.Layout;
import android.text.StaticLayout;

/* renamed from: X.2Jb */
public final class AnonymousClass2Jb {
    /* renamed from: B */
    public static int m15014B(Layout layout) {
        int i = 0;
        if (layout != null) {
            if (layout.getLineCount() != 0) {
                int i2 = Integer.MAX_VALUE;
                while (i < layout.getLineCount()) {
                    i2 = Math.min(i2, (int) layout.getLineLeft(i));
                    i++;
                }
                return i2;
            }
        }
        return 0;
    }

    /* renamed from: C */
    public static int m15015C(Layout layout) {
        int i = 0;
        if (layout == null) {
            return 0;
        }
        if (VERSION.SDK_INT <= 19 && (layout instanceof StaticLayout)) {
            float lineDescent = (float) (layout.getLineDescent(layout.getLineCount() - 1) - layout.getLineAscent(layout.getLineCount() - 1));
            lineDescent -= (lineDescent - layout.getSpacingAdd()) / layout.getSpacingMultiplier();
            double d;
            if (lineDescent >= 0.0f) {
                d = (double) lineDescent;
                Double.isNaN(d);
                i = (int) (d + 0.5d);
            } else {
                d = (double) (-lineDescent);
                Double.isNaN(d);
                i = -((int) (d + 0.5d));
            }
        }
        return layout.getHeight() - i;
    }

    /* renamed from: D */
    public static int m15016D(Layout layout) {
        int i = 0;
        if (layout == null) {
            return 0;
        }
        int lineCount = layout.getLineCount();
        int i2 = 0;
        while (i < lineCount) {
            i2 = Math.max(i2, Math.round(layout.getLineRight(i) - layout.getLineLeft(i)));
            i++;
        }
        return i2;
    }
}
