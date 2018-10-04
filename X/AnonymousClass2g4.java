package X;

import com.facebook.android.maps.model.LatLng;

/* renamed from: X.2g4 */
public final class AnonymousClass2g4 {
    /* renamed from: B */
    public double f32300B;
    /* renamed from: C */
    public double f32301C;
    /* renamed from: D */
    public double f32302D;
    /* renamed from: E */
    public double f32303E;
    /* renamed from: F */
    private boolean f32304F = false;

    /* renamed from: A */
    public final AnonymousClass2g4 m16857A(LatLng latLng) {
        if (!this.f32304F) {
            this.f32302D = latLng.f16936B;
            this.f32301C = latLng.f16936B;
            this.f32300B = latLng.f16937C;
            this.f32303E = latLng.f16937C;
            this.f32304F = true;
        }
        if (latLng.f16936B > this.f32301C) {
            this.f32301C = latLng.f16936B;
        } else if (latLng.f16936B < this.f32302D) {
            this.f32302D = latLng.f16936B;
        }
        double B = AnonymousClass2g5.m16858B(this.f32300B, this.f32303E);
        double B2 = AnonymousClass2g5.m16858B(latLng.f16937C, this.f32303E);
        double B3 = AnonymousClass2g5.m16858B(this.f32300B, latLng.f16937C);
        if (Double.compare(B2, B) > 0 || Double.compare(B3, B) > 0) {
            if (B2 <= B3) {
                this.f32300B = latLng.f16937C;
            } else {
                this.f32303E = latLng.f16937C;
            }
        }
        return this;
    }
}
