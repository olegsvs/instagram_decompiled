package com.instagram.creation.photo.edit.tiltshift;

import X.AnonymousClass28h;
import X.AnonymousClass28k;
import X.AnonymousClass2Vh;
import X.AnonymousClass2Vi;
import X.AnonymousClass2eL;
import X.AnonymousClass2eM;
import X.AnonymousClass3HL;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.util.creation.ShaderBridge;

public class TiltShiftBlurFilter extends BaseTiltShiftFilter {
    public static final Creator CREATOR = new AnonymousClass3HL();
    /* renamed from: B */
    private AnonymousClass2eL f50249B;
    /* renamed from: C */
    private PointF f50250C = new PointF();
    /* renamed from: D */
    private AnonymousClass2eM f50251D;

    public TiltShiftBlurFilter(float f, float f2) {
        m23200C(f, f2);
    }

    public TiltShiftBlurFilter(Parcel parcel) {
        super(parcel);
        m23200C(parcel.readFloat(), parcel.readFloat());
    }

    /* renamed from: B */
    public final AnonymousClass28h mo5433B(AnonymousClass28k anonymousClass28k) {
        int compileProgram = ShaderBridge.compileProgram("BlurDynamic");
        if (compileProgram == 0) {
            compileProgram = ShaderBridge.compileProgram("BlurDynamicFixedLoop");
            if (compileProgram == 0) {
                return null;
            }
        }
        AnonymousClass28h anonymousClass28h = new AnonymousClass28h(compileProgram);
        mo5475F(anonymousClass28h);
        return anonymousClass28h;
    }

    /* renamed from: C */
    private void m23200C(float f, float f2) {
        this.f50250C.x = BaseTiltShiftFilter.m23056B(f, 0.0f, 1.0f);
        this.f50250C.y = BaseTiltShiftFilter.m23056B(f2, 0.0f, 1.0f);
    }

    /* renamed from: F */
    public final void mo5475F(AnonymousClass28h anonymousClass28h) {
        super.mo5475F(anonymousClass28h);
        this.f50251D = (AnonymousClass2eM) anonymousClass28h.m14572B("blurVector");
        this.f50249B = (AnonymousClass2eL) anonymousClass28h.m14572B("dimension");
    }

    /* renamed from: N */
    public final void mo5476N(AnonymousClass28h anonymousClass28h, AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi) {
        this.f50251D.m16740C(this.f50250C.x, this.f50250C.y);
        this.f50249B.m16738C((float) anonymousClass2Vi.getWidth());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f50250C.x);
        parcel.writeFloat(this.f50250C.y);
    }
}
