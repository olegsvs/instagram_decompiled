package com.instagram.common.math;

import X.AnonymousClass1Oj;
import X.AnonymousClass25e;
import android.opengl.Matrix;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.nio.FloatBuffer;

public class Matrix4 implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1Oj();
    /* renamed from: B */
    public final float[] f18004B;
    /* renamed from: C */
    public final FloatBuffer f18005C;

    public final int describeContents() {
        return 0;
    }

    public Matrix4() {
        float[] fArr = new float[16];
        this.f18004B = fArr;
        this.f18005C = FloatBuffer.wrap(fArr);
        m11188F();
    }

    public Matrix4(Parcel parcel) {
        float[] fArr = new float[16];
        this.f18004B = fArr;
        this.f18005C = FloatBuffer.wrap(fArr);
        parcel.readFloatArray(this.f18004B);
    }

    public Matrix4(Matrix4 matrix4) {
        float[] fArr = new float[16];
        this.f18004B = fArr;
        this.f18005C = FloatBuffer.wrap(fArr);
        System.arraycopy(matrix4.f18004B, 0, this.f18004B, 0, 16);
    }

    /* renamed from: A */
    public final void m11183A(Matrix4 matrix4) {
        m11184B(matrix4.f18004B);
    }

    /* renamed from: B */
    public static Matrix4 m11182B(float f, float f2, float f3) {
        Matrix4 matrix4 = new Matrix4();
        matrix4.m11187E(f, f2, f3);
        return matrix4;
    }

    /* renamed from: B */
    public final void m11184B(float[] fArr) {
        Object obj = new float[16];
        Matrix.multiplyMM(obj, 0, this.f18004B, 0, fArr, 0);
        System.arraycopy(obj, 0, this.f18004B, 0, 16);
    }

    /* renamed from: C */
    public final AnonymousClass25e m11185C(AnonymousClass25e anonymousClass25e) {
        AnonymousClass25e anonymousClass25e2 = new AnonymousClass25e();
        anonymousClass25e2.f25782C = (((this.f18004B[0] * anonymousClass25e.f25782C) + (this.f18004B[4] * anonymousClass25e.f25783D)) + (this.f18004B[8] * anonymousClass25e.f25784E)) + (this.f18004B[12] * anonymousClass25e.f25781B);
        anonymousClass25e2.f25783D = (((this.f18004B[1] * anonymousClass25e.f25782C) + (this.f18004B[5] * anonymousClass25e.f25783D)) + (this.f18004B[9] * anonymousClass25e.f25784E)) + (this.f18004B[13] * anonymousClass25e.f25781B);
        anonymousClass25e2.f25784E = (((this.f18004B[2] * anonymousClass25e.f25782C) + (this.f18004B[6] * anonymousClass25e.f25783D)) + (this.f18004B[10] * anonymousClass25e.f25784E)) + (this.f18004B[14] * anonymousClass25e.f25781B);
        anonymousClass25e2.f25781B = (((this.f18004B[3] * anonymousClass25e.f25782C) + (this.f18004B[7] * anonymousClass25e.f25783D)) + (this.f18004B[11] * anonymousClass25e.f25784E)) + (this.f18004B[15] * anonymousClass25e.f25781B);
        return anonymousClass25e2;
    }

    /* renamed from: D */
    public final void m11186D(float f) {
        Matrix.rotateM(this.f18004B, 0, f, 0.0f, 0.0f, 1.0f);
    }

    /* renamed from: E */
    public final void m11187E(float f, float f2, float f3) {
        Matrix.scaleM(this.f18004B, 0, f, f2, f3);
    }

    /* renamed from: F */
    public final void m11188F() {
        Matrix.setIdentityM(this.f18004B, 0);
    }

    /* renamed from: G */
    public final void m11189G(Matrix4 matrix4) {
        System.arraycopy(matrix4.f18004B, 0, this.f18004B, 0, 16);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloatArray(this.f18005C.array());
    }
}
