package com.instagram.common.math;

import X.AnonymousClass25c;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.nio.FloatBuffer;

public class Matrix3 implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass25c();
    /* renamed from: D */
    private static final float[] f25775D = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    /* renamed from: B */
    public final float[] f25776B;
    /* renamed from: C */
    public final FloatBuffer f25777C;

    public final int describeContents() {
        return 0;
    }

    public Matrix3() {
        float[] fArr = new float[9];
        this.f25776B = fArr;
        this.f25777C = FloatBuffer.wrap(fArr);
        m14373A();
    }

    public Matrix3(Parcel parcel) {
        float[] fArr = new float[9];
        this.f25776B = fArr;
        this.f25777C = FloatBuffer.wrap(fArr);
        parcel.readFloatArray(this.f25776B);
    }

    /* renamed from: A */
    public final void m14373A() {
        this.f25777C.position(0);
        this.f25777C.put(f25775D);
        this.f25777C.position(0);
    }

    /* renamed from: B */
    public final void m14374B(float f, float f2) {
        float[] fArr = this.f25776B;
        fArr[6] = fArr[6] + ((fArr[0] * f) + (fArr[3] * f2));
        fArr[7] = fArr[7] + ((f * fArr[1]) + (f2 * fArr[4]));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloatArray(this.f25777C.array());
    }
}
