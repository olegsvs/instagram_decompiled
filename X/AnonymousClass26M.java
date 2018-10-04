package X;

import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;

/* renamed from: X.26M */
public final class AnonymousClass26M {
    /* renamed from: B */
    public static Path m14433B(float f, int i, float f2, float f3) {
        Path path = new Path();
        float[] fArr = new float[8];
        if (AnonymousClass26L.TOP_LEFT.m14432B(i)) {
            fArr[0] = f;
            fArr[1] = f;
        }
        if (AnonymousClass26L.TOP_RIGHT.m14432B(i)) {
            fArr[2] = f;
            fArr[3] = f;
        }
        if (AnonymousClass26L.BOTTOM_RIGHT.m14432B(i)) {
            fArr[4] = f;
            fArr[5] = f;
        }
        if (AnonymousClass26L.BOTTOM_LEFT.m14432B(i)) {
            fArr[6] = f;
            fArr[7] = f;
        }
        path.addRoundRect(new RectF(0.0f, 0.0f, f2, f3), fArr, Direction.CW);
        return path;
    }
}
