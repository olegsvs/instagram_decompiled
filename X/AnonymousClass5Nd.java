package X;

import java.nio.FloatBuffer;

/* renamed from: X.5Nd */
public final class AnonymousClass5Nd {
    /* renamed from: I */
    private static final FloatBuffer f62798I = AnonymousClass1va.D(f62799J);
    /* renamed from: J */
    private static final float[] f62799J = new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    /* renamed from: K */
    public static final FloatBuffer f62800K = AnonymousClass1va.D(f62801L);
    /* renamed from: L */
    private static final float[] f62801L = new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    /* renamed from: M */
    private static final FloatBuffer f62802M = AnonymousClass1va.D(f62803N);
    /* renamed from: N */
    private static final float[] f62803N = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    /* renamed from: B */
    public int f62804B = 2;
    /* renamed from: C */
    public FloatBuffer f62805C = f62800K;
    /* renamed from: D */
    public FloatBuffer f62806D = f62802M;
    /* renamed from: E */
    public int f62807E;
    /* renamed from: F */
    public FloatBuffer f62808F = f62798I;
    /* renamed from: G */
    public int f62809G;
    /* renamed from: H */
    public int f62810H;

    public AnonymousClass5Nd() {
        int length = f62799J.length;
        int i = this.f62804B;
        this.f62809G = length / i;
        this.f62807E = 8;
        this.f62810H = i * 4;
    }
}
