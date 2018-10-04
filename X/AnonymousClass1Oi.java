package X;

import android.opengl.Matrix;
import com.instagram.common.math.Matrix4;

/* renamed from: X.1Oi */
public final class AnonymousClass1Oi {
    /* renamed from: B */
    public float f17995B = 1.0f;
    /* renamed from: C */
    public float f17996C = 0.0f;
    /* renamed from: D */
    public float f17997D = 1.0f;
    /* renamed from: E */
    public float f17998E = 1.0f;
    /* renamed from: F */
    public int f17999F;
    /* renamed from: G */
    public float f18000G;
    /* renamed from: H */
    public float f18001H;
    /* renamed from: I */
    public float f18002I;
    /* renamed from: J */
    public Matrix4 f18003J = new Matrix4();

    public AnonymousClass1Oi(int i) {
        this.f17999F = i;
    }

    /* renamed from: A */
    public final void m11181A(float f) {
        this.f18001H = f;
        AnonymousClass1Oi.m11180B(this);
    }

    /* renamed from: B */
    public static void m11180B(AnonymousClass1Oi anonymousClass1Oi) {
        anonymousClass1Oi.f18003J.m11188F();
        Matrix4 matrix4 = anonymousClass1Oi.f18003J;
        Matrix.translateM(matrix4.f18004B, 0, anonymousClass1Oi.f18000G, anonymousClass1Oi.f18001H, anonymousClass1Oi.f18002I);
        anonymousClass1Oi.f18003J.m11187E(1.0f / anonymousClass1Oi.f17995B, 1.0f, 1.0f);
        anonymousClass1Oi.f18003J.m11186D(anonymousClass1Oi.f17996C);
        anonymousClass1Oi.f18003J.m11187E(anonymousClass1Oi.f17997D * anonymousClass1Oi.f17995B, anonymousClass1Oi.f17998E, 1.0f);
    }
}
