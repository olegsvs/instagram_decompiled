package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2KL */
public final class AnonymousClass2KL {
    /* renamed from: B */
    public boolean f28974B = true;
    /* renamed from: C */
    public long f28975C;
    /* renamed from: D */
    public final List f28976D = new ArrayList();
    /* renamed from: E */
    public AnonymousClass0i5 f28977E;

    public AnonymousClass2KL(AnonymousClass0i5 anonymousClass0i5) {
        this.f28977E = anonymousClass0i5;
    }

    /* renamed from: A */
    public final void m15086A(int i, int i2) {
        AnonymousClass2KL anonymousClass2KL = this;
        AnonymousClass2NV anonymousClass2NV = this.f28977E.f8562L;
        int i3 = i;
        int i4 = i2;
        if (anonymousClass2NV != null) {
            if (!anonymousClass2NV.m15340A().isEmpty()) {
                long E = AnonymousClass0Gd.E();
                if (anonymousClass2KL.f28974B) {
                    AnonymousClass0Ea.f1980C.Y(1900591, AnonymousClass1dF.C(anonymousClass2KL.f28977E.f8557G), "thumbnail_requested");
                }
                i = AnonymousClass2KL.m15084D(anonymousClass2NV, i);
                int E2 = AnonymousClass2KL.m15085E(anonymousClass2NV, i);
                if (E2 != -1) {
                    if (i != -1) {
                        AnonymousClass0Gs.f2431j.D((String) anonymousClass2NV.m15340A().get(E2)).C(new AnonymousClass1Xd(anonymousClass2KL, new boolean[]{true}, i3, i4, E, anonymousClass2NV, i)).B();
                        return;
                    }
                }
                AnonymousClass2KL.m15083C(anonymousClass2KL, i3, i2);
                return;
            }
        }
        AnonymousClass2KL.m15083C(anonymousClass2KL, i, i2);
        if (anonymousClass2NV != null && anonymousClass2NV.m15340A().isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Thumbnail info missing sprite URL. videoId: ");
            stringBuilder.append(anonymousClass2KL.f28977E.f8557G);
            AnonymousClass0Gn.C("VideoThumbnailController", stringBuilder.toString());
        }
    }

    /* renamed from: B */
    public static Rect m15082B(Bitmap bitmap, AnonymousClass2NV anonymousClass2NV, int i) {
        if (anonymousClass2NV != null) {
            i %= anonymousClass2NV.f29679B;
            double d = (double) anonymousClass2NV.f29682E;
            double d2 = (double) anonymousClass2NV.f29683F;
            int i2 = anonymousClass2NV.f29684G;
            double d3 = (double) (i % i2);
            Double.isNaN(d2);
            Double.isNaN(d3);
            d3 *= d2;
            double d4 = (double) (i / i2);
            Double.isNaN(d);
            Double.isNaN(d4);
            d3 += 1.0d;
            d4 = (d4 * d) + 1.0d;
            i2 = ((int) d) - 2;
            d2 = (double) (((int) d2) - 2);
            Double.isNaN(d2);
            d2 += d3;
            if (d2 <= ((double) bitmap.getWidth())) {
                double d5 = (double) i2;
                Double.isNaN(d5);
                d5 += d4;
                if (d5 <= ((double) bitmap.getHeight())) {
                    Rect rect = new Rect();
                    rect.set((int) d3, (int) d4, (int) d2, (int) d5);
                    return rect;
                }
            }
        }
        return null;
    }

    /* renamed from: C */
    public static void m15083C(AnonymousClass2KL anonymousClass2KL, int i, int i2) {
        for (AnonymousClass0vX RDA : anonymousClass2KL.f28976D) {
            RDA.RDA(i, i2);
        }
    }

    /* renamed from: D */
    private static int m15084D(AnonymousClass2NV anonymousClass2NV, int i) {
        return anonymousClass2NV == null ? -1 : (int) (((float) i) / (anonymousClass2NV.f29681D * 1000.0f));
    }

    /* renamed from: E */
    private static int m15085E(AnonymousClass2NV anonymousClass2NV, int i) {
        if (anonymousClass2NV != null) {
            i /= anonymousClass2NV.f29679B;
            if (i >= 0) {
                if (i <= anonymousClass2NV.m15340A().size() - 1) {
                    int intValue = ((Integer) AnonymousClass0CC.dY.G()).intValue();
                    int i2 = i + 1;
                    int i3 = i;
                    while (true) {
                        if ((i3 < 0 || i - i3 >= intValue) && (i2 >= anonymousClass2NV.m15340A().size() || i2 - i >= intValue)) {
                            return i;
                        }
                        if (i3 >= 0) {
                            AnonymousClass0Gs.f2431j.E((String) anonymousClass2NV.m15340A().get(i3), "VideoThumbnailController");
                            i3--;
                        }
                        if (i2 < anonymousClass2NV.m15340A().size()) {
                            AnonymousClass0Gs.f2431j.E((String) anonymousClass2NV.m15340A().get(i2), "VideoThumbnailController");
                            i2++;
                        }
                    }
                    return i;
                }
            }
        }
        return -1;
    }
}
