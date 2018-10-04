package X;

import android.graphics.Color;

/* renamed from: X.1lz */
public final class AnonymousClass1lz {
    /* renamed from: B */
    public static final ThreadLocal f22520B = new ThreadLocal();

    /* renamed from: J */
    private static float m12965J(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: K */
    private static int m12966K(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: B */
    public static int m12957B(float[] fArr) {
        int round;
        int round2;
        int round3;
        float f = fArr[0];
        float f2 = fArr[1];
        fArr = fArr[2];
        float abs = (1.0f - Math.abs((fArr * 2.0f) - 1.0f)) * f2;
        fArr -= 0.5f * abs;
        float abs2 = (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f) / 60) {
            case 0:
                round = Math.round((abs + fArr) * 255.0f);
                round2 = Math.round((abs2 + fArr) * 255.0f);
                round3 = Math.round(fArr * 1132396544);
                break;
            case 1:
                round = Math.round((abs2 + fArr) * 255.0f);
                round2 = Math.round((abs + fArr) * 255.0f);
                round3 = Math.round(fArr * 1132396544);
                break;
            case 2:
                round = Math.round(fArr * 255.0f);
                round2 = Math.round((abs + fArr) * 255.0f);
                round3 = Math.round((abs2 + fArr) * 255.0f);
                break;
            case 3:
                round = Math.round(fArr * 255.0f);
                round2 = Math.round((abs2 + fArr) * 255.0f);
                round3 = Math.round((abs + fArr) * 255.0f);
                break;
            case 4:
                round = Math.round((abs2 + fArr) * 255.0f);
                round2 = Math.round(fArr * 255.0f);
                round3 = Math.round((abs + fArr) * 255.0f);
                break;
            case 5:
            case 6:
                round = Math.round((abs + fArr) * 255.0f);
                round2 = Math.round(fArr * 255.0f);
                round3 = Math.round((abs2 + fArr) * 255.0f);
                break;
            default:
                round3 = 0;
                round = 0;
                round2 = 0;
                break;
        }
        return Color.rgb(AnonymousClass1lz.m12966K(round, 0, 255), AnonymousClass1lz.m12966K(round2, 0, 255), AnonymousClass1lz.m12966K(round3, 0, 255));
    }

    /* renamed from: C */
    public static void m12958C(int i, int i2, int i3, float[] fArr) {
        float f = ((float) i) / 255.0f;
        i = ((float) i2) / 1132396544;
        i3 = ((float) i3) / 1132396544;
        i2 = Math.max(f, Math.max(i, i3));
        float min = Math.min(f, Math.min(i, i3));
        float f2 = i2 - min;
        float f3 = (i2 + min) / 2.0f;
        if (i2 == min) {
            i = 0;
            f2 = 0.0f;
        } else {
            i = i2 == f ? ((i - i3) / f2) % 1086324736 : i2 == i ? ((i3 - f) / f2) + 1073741824 : ((f - i) / f2) + 1082130432;
            f2 /= 1.0f - Math.abs((2.0f * f3) - 1.0f);
        }
        i = (i * 1114636288) % 1135869952;
        if (i < 0) {
            i += 1135869952;
        }
        fArr[0] = AnonymousClass1lz.m12965J(i, 0.0f, 360.0f);
        fArr[1] = AnonymousClass1lz.m12965J(f2, 0.0f, 1.0f);
        fArr[2] = AnonymousClass1lz.m12965J(f3, 0.0f, 1.0f);
    }

    /* renamed from: D */
    public static double m12959D(int i, int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                int alpha = Color.alpha(i2);
                int alpha2 = Color.alpha(i);
                int i3 = 255 - (((255 - alpha) * (255 - alpha2)) / 255);
                i = Color.argb(i3, AnonymousClass1lz.m12963H(Color.red(i), alpha2, Color.red(i2), alpha, i3), AnonymousClass1lz.m12963H(Color.green(i), alpha2, Color.green(i2), alpha, i3), AnonymousClass1lz.m12963H(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
            }
            double E = AnonymousClass1lz.m12960E(i) + 0.05d;
            double E2 = AnonymousClass1lz.m12960E(i2) + 0.05d;
            return Math.max(E, E2) / Math.min(E, E2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("background can not be translucent: #");
        stringBuilder.append(Integer.toHexString(i2));
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: E */
    public static double m12960E(int i) {
        double[] dArr = (double[]) f22520B.get();
        if (dArr == null) {
            dArr = new double[3];
            f22520B.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length == 3) {
            double d = (double) red;
            Double.isNaN(d);
            d /= 255.0d;
            if (d < 0.04045d) {
                d /= 12.92d;
            } else {
                d = Math.pow((d + 0.055d) / 1.055d, 2.4d);
            }
            double d2 = (double) green;
            Double.isNaN(d2);
            d2 /= 255.0d;
            if (d2 < 0.04045d) {
                d2 /= 12.92d;
            } else {
                d2 = Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            }
            double d3 = (double) blue;
            Double.isNaN(d3);
            d3 /= 255.0d;
            if (d3 < 0.04045d) {
                d3 /= 12.92d;
            } else {
                d3 = Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            }
            dArr[0] = (((0.4124d * d) + (0.3576d * d2)) + (0.1805d * d3)) * 100.0d;
            dArr[1] = (((0.2126d * d) + (0.7152d * d2)) + (0.0722d * d3)) * 100.0d;
            dArr[2] = (((d * 0.0193d) + (d2 * 0.1192d)) + (d3 * 0.9505d)) * 100.0d;
            return dArr[1] / 100.0d;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    /* renamed from: F */
    public static int m12961F(int i, int i2, float f) {
        int i3 = 255;
        if (Color.alpha(i2) == 255) {
            double d = (double) f;
            if (AnonymousClass1lz.m12959D(AnonymousClass1lz.m12964I(i, 255), i2) < d) {
                return -1;
            }
            int i4 = 0;
            for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
                int i6 = (i4 + i3) / 2;
                if (AnonymousClass1lz.m12959D(AnonymousClass1lz.m12964I(i, i6), i2) < d) {
                    i4 = i6;
                } else {
                    i3 = i6;
                }
            }
            return i3;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("background can not be translucent: #");
        stringBuilder.append(Integer.toHexString(i2));
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: G */
    public static void m12962G(int i, float[] fArr) {
        AnonymousClass1lz.m12958C(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    /* renamed from: H */
    public static int m12963H(int i, int i2, int i3, int i4, int i5) {
        return i5 == 0 ? 0 : (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    /* renamed from: I */
    public static int m12964I(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
