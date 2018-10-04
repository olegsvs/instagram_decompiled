package X;

import android.graphics.Bitmap;
import android.util.SparseIntArray;
import java.nio.ByteBuffer;

/* renamed from: X.1ut */
public final class AnonymousClass1ut {
    /* renamed from: B */
    public String f24077B;
    /* renamed from: C */
    public int f24078C;
    /* renamed from: D */
    public final SparseIntArray f24079D;
    /* renamed from: E */
    public Bitmap f24080E;
    /* renamed from: F */
    public ByteBuffer f24081F;
    /* renamed from: G */
    public int f24082G;
    /* renamed from: H */
    public int f24083H;
    /* renamed from: I */
    public int f24084I = 3553;
    /* renamed from: J */
    public int f24085J;

    public AnonymousClass1ut() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.f24079D = sparseIntArray;
        sparseIntArray.put(10241, 9729);
        this.f24079D.put(10240, 9729);
        this.f24079D.put(10242, 33071);
        this.f24079D.put(10243, 33071);
        this.f24082G = -1;
    }

    /* renamed from: A */
    public final AnonymousClass1uu m13709A() {
        return new AnonymousClass1uu(this);
    }

    /* renamed from: B */
    public final AnonymousClass1ut m13710B(int i, int i2) {
        this.f24079D.put(i, i2);
        return this;
    }
}
