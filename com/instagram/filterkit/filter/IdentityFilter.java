package com.instagram.filterkit.filter;

import X.AnonymousClass28h;
import X.AnonymousClass28j;
import X.AnonymousClass28k;
import X.AnonymousClass2Vh;
import X.AnonymousClass2Vi;
import X.AnonymousClass2eF;
import X.AnonymousClass2eK;
import X.AnonymousClass3Oj;
import android.opengl.GLES20;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.common.math.Matrix4;
import com.instagram.util.video.VideoBridge;

public class IdentityFilter extends BaseSimpleFilter {
    public static final Creator CREATOR = new AnonymousClass3Oj();
    /* renamed from: B */
    public float f50107B;
    /* renamed from: C */
    public boolean f50108C;
    /* renamed from: D */
    private final float[] f50109D;
    /* renamed from: E */
    private boolean f50110E;
    /* renamed from: F */
    private boolean f50111F;
    /* renamed from: G */
    private AnonymousClass2eF f50112G;
    /* renamed from: H */
    private final Matrix4 f50113H;
    /* renamed from: I */
    private AnonymousClass2eK f50114I;

    public IdentityFilter() {
        this.f50113H = new Matrix4();
        this.f50109D = new float[3];
        this.f50107B = 1.0f;
    }

    public IdentityFilter(Parcel parcel) {
        super(parcel);
        this.f50113H = new Matrix4();
        this.f50109D = new float[3];
        this.f50107B = 1.0f;
        this.f50113H.G((Matrix4) parcel.readParcelable(Matrix4.class.getClassLoader()));
        boolean z = false;
        this.f50111F = parcel.readInt() == 1;
        this.f50110E = parcel.readInt() == 1;
        if (parcel.readInt() == 1) {
            z = true;
        }
        this.f50108C = z;
        this.f50107B = parcel.readFloat();
    }

    /* renamed from: A */
    public final void mo5432A(AnonymousClass2Vi anonymousClass2Vi) {
        if (this.f50108C) {
            GLES20.glBindFramebuffer(36160, anonymousClass2Vi.QM());
            AnonymousClass28j.m14579B("IdentityFilter.clearFrameBuffer:glBindFramebuffer");
            float[] fArr = this.f50109D;
            GLES20.glClearColor(fArr[0], fArr[1], fArr[2], this.f50107B);
            GLES20.glClear(16384);
        }
    }

    /* renamed from: B */
    public final AnonymousClass28h mo5433B(AnonymousClass28k anonymousClass28k) {
        int compileProgram = VideoBridge.compileProgram("Identity", true);
        if (compileProgram == 0) {
            return null;
        }
        AnonymousClass28h anonymousClass28h = new AnonymousClass28h(compileProgram);
        this.f50112G = (AnonymousClass2eF) anonymousClass28h.m14572B("u_enableVertexTransform");
        this.f50114I = (AnonymousClass2eK) anonymousClass28h.m14572B("u_vertexTransform");
        return anonymousClass28h;
    }

    /* renamed from: C */
    public final boolean mo5434C() {
        return this.f50110E;
    }

    /* renamed from: E */
    public final void mo5436E(AnonymousClass28h anonymousClass28h, AnonymousClass28k anonymousClass28k, AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi) {
        anonymousClass28h.m14576F("image", anonymousClass2Vh.getTextureId());
        this.f50112G.m16728C(this.f50111F);
        if (this.f50111F) {
            this.f50114I.m16735C(this.f50113H.f18005C);
        }
    }

    /* renamed from: F */
    public final void m23073F(Matrix4 matrix4) {
        if (matrix4 != null) {
            this.f50111F = true;
            this.f50113H.G(matrix4);
        } else {
            this.f50111F = false;
            this.f50113H.F();
        }
        invalidate();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f50113H, i);
        parcel.writeInt(this.f50111F);
        parcel.writeInt(this.f50110E);
        parcel.writeInt(this.f50108C);
        parcel.writeFloat(this.f50107B);
    }
}
