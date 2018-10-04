package com.instagram.creation.photo.edit.filter;

import X.AnonymousClass28e;
import X.AnonymousClass28f;
import X.AnonymousClass28h;
import X.AnonymousClass28j;
import X.AnonymousClass28k;
import X.AnonymousClass28p;
import X.AnonymousClass28q;
import X.AnonymousClass2Mf;
import X.AnonymousClass2Mk;
import X.AnonymousClass2Vh;
import X.AnonymousClass2Vi;
import X.AnonymousClass2eF;
import X.AnonymousClass2eL;
import X.AnonymousClass2eN;
import X.AnonymousClass2eP;
import X.AnonymousClass3GW;
import X.AnonymousClass3Oq;
import X.AnonymousClass3Or;
import android.opengl.GLES20;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.filterkit.filter.BaseFilter;
import com.instagram.util.creation.ShaderBridge;

public class GaussianBlurFilter extends BaseFilter {
    public static final Creator CREATOR = new AnonymousClass3GW();
    /* renamed from: L */
    private static final AnonymousClass2Mf f49537L = AnonymousClass2Mk.m15236B();
    /* renamed from: B */
    private AnonymousClass2eF f49538B;
    /* renamed from: C */
    private AnonymousClass28h f49539C;
    /* renamed from: D */
    private AnonymousClass2eP f49540D;
    /* renamed from: E */
    private AnonymousClass2eN f49541E;
    /* renamed from: F */
    private AnonymousClass2eL f49542F;
    /* renamed from: G */
    private int f49543G = Integer.MAX_VALUE;
    /* renamed from: H */
    private float f49544H;
    /* renamed from: I */
    private AnonymousClass3Or f49545I;
    /* renamed from: J */
    private AnonymousClass28p f49546J = new AnonymousClass28p();
    /* renamed from: K */
    private AnonymousClass2eP f49547K;

    public final int describeContents() {
        return 0;
    }

    public GaussianBlurFilter(Parcel parcel) {
        super(parcel);
        m22700A(parcel.readFloat());
    }

    /* renamed from: A */
    public final void m22700A(float f) {
        this.f49544H = f;
        invalidate();
    }

    public final void QE(AnonymousClass28k anonymousClass28k) {
        super.QE(anonymousClass28k);
        AnonymousClass28h anonymousClass28h = this.f49539C;
        if (anonymousClass28h != null) {
            GLES20.glDeleteProgram(anonymousClass28h.f26592C);
            this.f49539C = null;
        }
    }

    public final void QPA(int i) {
        this.f49543G = i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" Sigma: ");
        stringBuilder.append(Float.toString(this.f49544H));
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f49544H);
    }

    public final void yJA(AnonymousClass28k anonymousClass28k, AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi) {
        if (!anonymousClass28k.m14591C(this)) {
            int compileProgram = ShaderBridge.compileProgram("GaussianBlur");
            if (compileProgram == 0) {
                compileProgram = ShaderBridge.compileProgram("GaussianBlurFixed");
            }
            if (compileProgram != 0) {
                this.f49539C = new AnonymousClass28h(compileProgram);
                this.f49542F = (AnonymousClass2eL) this.f49539C.m14572B("kernelSize");
                this.f49541E = (AnonymousClass2eN) this.f49539C.m14572B("initialGaussian");
                this.f49538B = (AnonymousClass2eF) this.f49539C.m14572B("blurAlongX");
                this.f49547K = (AnonymousClass2eP) this.f49539C.m14572B("width");
                this.f49540D = (AnonymousClass2eP) this.f49539C.m14572B("height");
                this.f49545I = new AnonymousClass3Or(this.f49539C);
                anonymousClass28k.m14593E(this);
            } else {
                throw new AnonymousClass3Oq();
            }
        }
        float f = this.f49544H;
        double d = (double) (f * f);
        Double.isNaN(d);
        double exp = Math.exp(-0.5d / d);
        AnonymousClass2eN anonymousClass2eN = this.f49541E;
        double sqrt = 1.0d / Math.sqrt(6.283185307179586d);
        d = (double) this.f49544H;
        Double.isNaN(d);
        anonymousClass2eN.m16742C((float) (sqrt * d), (float) exp, (float) (exp * exp));
        this.f49542F.m16738C(this.f49544H * 3.0f);
        this.f49547K.m16749C(anonymousClass2Vh.getWidth());
        this.f49540D.m16749C(anonymousClass2Vh.getHeight());
        this.f49539C.m14574D("position", 2, 8, f49537L.f29571C);
        this.f49539C.m14574D("transformedTextureCoordinate", 2, 8, f49537L.f29572D);
        this.f49539C.m14574D("staticTextureCoordinate", 2, 8, f49537L.f29572D);
        AnonymousClass28j.m14579B("GaussianBlurFilter.blurX:setCoordinates");
        String str = "image";
        this.f49539C.m14577G(str, anonymousClass2Vh.getTextureId(), AnonymousClass28f.NEAREST, AnonymousClass28e.CLAMP);
        this.f49538B.m16728C(true);
        AnonymousClass28q F = anonymousClass28k.m14594F(anonymousClass2Vi.jQ(), anonymousClass2Vi.hQ());
        GLES20.glBindFramebuffer(36160, F.QM());
        AnonymousClass28j.m14579B("GaussianBlurFilter.blurX:glBindFramebuffer");
        F.RU(this.f49546J);
        this.f49545I.m19522A(this.f49546J, this.f49543G);
        this.f49539C.m14577G(str, F.getTextureId(), AnonymousClass28f.NEAREST, AnonymousClass28e.CLAMP);
        this.f49538B.m16728C(false);
        GLES20.glBindFramebuffer(36160, anonymousClass2Vi.QM());
        AnonymousClass28j.m14579B("GaussianBlurFilter.blur:glBindFramebuffer");
        anonymousClass2Vi.RU(this.f49546J);
        this.f49545I.m19522A(this.f49546J, this.f49543G);
        cb();
        anonymousClass28k.m14596H(F, null);
        anonymousClass28k.m14596H(anonymousClass2Vh, null);
        this.f48221B = false;
    }
}
