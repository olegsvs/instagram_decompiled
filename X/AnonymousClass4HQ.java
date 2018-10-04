package X;

import android.hardware.Camera.Size;
import com.facebook.forker.Process;
import java.util.List;

/* renamed from: X.4HQ */
public final class AnonymousClass4HQ implements AnonymousClass2nn {
    /* renamed from: B */
    public int f52332B;
    /* renamed from: C */
    public int f52333C;
    /* renamed from: D */
    public float f52334D;

    public AnonymousClass4HQ(int i, float f) {
        this(i, i, f);
    }

    public AnonymousClass4HQ(int i, int i2, float f) {
        this.f52332B = i;
        this.f52333C = i2;
        this.f52334D = f;
    }

    /* renamed from: B */
    public static Size m23748B(List list, int i, float f) {
        Size size = null;
        int i2 = Process.WAIT_RESULT_TIMEOUT;
        double d = Double.MAX_VALUE;
        double d2 = Double.MAX_VALUE;
        Size size2 = null;
        for (Size size3 : list) {
            int i3 = size3.height * size3.width;
            if (i3 > i2) {
                size2 = size3;
                i2 = i3;
            }
            int min = Math.min((int) (((float) size3.width) / f), size3.height) - i;
            if (((double) Math.abs(min)) <= d) {
                if (((double) Math.abs(min)) == d) {
                    double abs = (double) Math.abs(f - (((float) size3.width) / ((float) size3.height)));
                    double d3 = (double) f;
                    Double.isNaN(d3);
                    if (abs > Math.abs(d3 - d2)) {
                    }
                }
                d = (double) Math.abs(min);
                d2 = (double) (((float) size3.width) / ((float) size3.height));
                size = size3;
            }
        }
        return (size != null || size2 == null) ? size : size2;
    }

    public final AnonymousClass2nm GU(List list, List list2, AnonymousClass2nC anonymousClass2nC, int i, int i2) {
        return new AnonymousClass2nm(AnonymousClass4HQ.m23748B(AnonymousClass2nw.m17222C(list), this.f52332B, this.f52334D), AnonymousClass4HQ.m23748B(AnonymousClass2nw.m17223D(AnonymousClass4I4.m23764B(list2, list)), this.f52333C, this.f52334D));
    }

    public final AnonymousClass2nm QP(List list, List list2, AnonymousClass2nC anonymousClass2nC, int i, int i2) {
        return new AnonymousClass2nm(AnonymousClass4HQ.m23748B(AnonymousClass2nw.m17222C(list), this.f52332B, this.f52334D), AnonymousClass4HQ.m23748B(AnonymousClass2nw.m17223D(list2), this.f52333C, this.f52334D));
    }

    public final AnonymousClass2nm tP(List list, int i, int i2) {
        Size B = AnonymousClass4HQ.m23748B(list, this.f52332B, this.f52334D);
        return new AnonymousClass2nm(B, B);
    }

    public final AnonymousClass2nm vJ(List list, List list2, List list3, AnonymousClass2nC anonymousClass2nC, AnonymousClass2nC anonymousClass2nC2, int i, int i2) {
        return new AnonymousClass2nm(AnonymousClass4HQ.m23748B(AnonymousClass2nw.m17222C(list), this.f52332B, this.f52334D), AnonymousClass4HQ.m23748B(AnonymousClass2nw.m17223D(AnonymousClass4I4.m23764B(list3, list2)), this.f52333C, this.f52334D));
    }
}
