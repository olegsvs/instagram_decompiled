package X;

import android.graphics.Color;

/* renamed from: X.26h */
public final class AnonymousClass26h {
    /* renamed from: B */
    public static int m14459B(int i, float f) {
        return (i & 16777215) | (((int) (f * 255.0f)) << 24);
    }

    /* renamed from: G */
    public static int m14464G(int i, int i2) {
        float f = (float) i;
        if (f > 127.5f) {
            float f2 = 255.0f - f;
            return (int) ((((float) i2) * (f2 / 127.5f)) + (f - f2));
        }
        return (int) (((float) i2) * (f / 127.5f));
    }

    /* renamed from: C */
    public static int m14460C(int i) {
        float[] fArr = new float[3];
        if (((double) (((float) Color.alpha(i)) / 255.0f)) >= 0.3d) {
            if (AnonymousClass26h.m14461D(i) <= 0.85f) {
                return -1;
            }
        }
        Color.colorToHSV(i, fArr);
        if (fArr[0] == 0.0f) {
            return -16777216;
        }
        fArr[1] = 1.0f;
        fArr[2] = 0.4f;
        return Color.HSVToColor(fArr);
    }

    /* renamed from: D */
    public static float m14461D(int i) {
        return ((((((float) Color.red(i)) / 255.0f) * 299.0f) + ((((float) Color.green(i)) / 255.0f) * 587.0f)) + ((((float) Color.blue(i)) / 255.0f) * 114.0f)) / 1000.0f;
    }

    /* renamed from: E */
    public static int m14462E(int i) {
        if (((double) AnonymousClass26h.m14461D(i)) < 0.25d) {
            return AnonymousClass26h.m14459B(-1, 0.25f);
        }
        return Color.rgb(Math.max(Color.red(i) - 30, 0), Math.max(Color.green(i) - 30, 0), Math.max(Color.blue(i) - 30, 0));
    }

    /* renamed from: F */
    public static int m14463F(int i, int i2, float f) {
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        return Color.rgb(red + ((int) (((float) (Color.red(i2) - red)) * f)), green + ((int) (((float) (Color.green(i2) - green)) * f)), blue + ((int) (((float) (Color.blue(i2) - blue)) * f)));
    }
}
