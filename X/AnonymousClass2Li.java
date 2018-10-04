package X;

import android.graphics.Matrix;

/* renamed from: X.2Li */
public final class AnonymousClass2Li {
    /* renamed from: B */
    public final float f29384B;
    /* renamed from: C */
    public final int f29385C;
    /* renamed from: D */
    public final int f29386D;
    /* renamed from: E */
    public final int f29387E;
    /* renamed from: F */
    public final Matrix f29388F = new Matrix();
    /* renamed from: G */
    public final float f29389G;
    /* renamed from: H */
    public final float f29390H;
    /* renamed from: I */
    public final float f29391I;
    /* renamed from: J */
    public final float f29392J;
    /* renamed from: K */
    public final float f29393K;
    /* renamed from: L */
    public final float f29394L;
    /* renamed from: M */
    public final int f29395M;
    /* renamed from: N */
    public final int f29396N;

    public AnonymousClass2Li(AnonymousClass2cS anonymousClass2cS) {
        this.f29386D = anonymousClass2cS.f31620H;
        this.f29391I = anonymousClass2cS.m16500C();
        this.f29392J = anonymousClass2cS.m16501D();
        this.f29395M = anonymousClass2cS.f31616D.getBounds().width();
        this.f29385C = anonymousClass2cS.f31616D.getBounds().height();
        this.f29389G = anonymousClass2cS.f31625M;
        this.f29390H = anonymousClass2cS.f31626N;
        this.f29393K = anonymousClass2cS.m16502E();
        this.f29394L = anonymousClass2cS.m16503F();
        this.f29384B = anonymousClass2cS.f31615C;
        this.f29387E = anonymousClass2cS.f31622J;
        this.f29396N = anonymousClass2cS.f31637Y;
        anonymousClass2cS.m16504G(this.f29388F);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                AnonymousClass2Li anonymousClass2Li = (AnonymousClass2Li) obj;
                if (this.f29386D == anonymousClass2Li.f29386D) {
                    if (this.f29395M == anonymousClass2Li.f29395M) {
                        if (this.f29385C == anonymousClass2Li.f29385C) {
                            if (this.f29387E == anonymousClass2Li.f29387E) {
                                if (this.f29396N == anonymousClass2Li.f29396N) {
                                    if (Float.compare(anonymousClass2Li.f29391I, this.f29391I) == 0) {
                                        if (Float.compare(anonymousClass2Li.f29392J, this.f29392J) == 0) {
                                            if (Float.compare(anonymousClass2Li.f29389G, this.f29389G) == 0) {
                                                if (Float.compare(anonymousClass2Li.f29390H, this.f29390H) == 0) {
                                                    if (Float.compare(anonymousClass2Li.f29393K, this.f29393K) == 0) {
                                                        if (Float.compare(anonymousClass2Li.f29394L, this.f29394L) == 0) {
                                                            if (Float.compare(anonymousClass2Li.f29384B, this.f29384B) == 0) {
                                                                return this.f29388F.equals(anonymousClass2Li.f29388F);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((((((this.f29388F.hashCode() * 31) + this.f29386D) * 31) + this.f29395M) * 31) + this.f29385C) * 31) + this.f29387E) * 31) + this.f29396N) * 31;
        float f = this.f29391I;
        int i = 0;
        hashCode = (hashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        f = this.f29392J;
        hashCode = (hashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        f = this.f29389G;
        hashCode = (hashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        f = this.f29390H;
        hashCode = (hashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        f = this.f29393K;
        hashCode = (hashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        f = this.f29394L;
        hashCode = (hashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        f = this.f29384B;
        if (f != 0.0f) {
            i = Float.floatToIntBits(f);
        }
        return hashCode + i;
    }
}
