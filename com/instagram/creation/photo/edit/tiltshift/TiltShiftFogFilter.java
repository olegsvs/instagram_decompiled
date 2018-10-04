package com.instagram.creation.photo.edit.tiltshift;

import X.AnonymousClass28h;
import X.AnonymousClass28k;
import X.AnonymousClass2Vh;
import X.AnonymousClass2Vi;
import X.AnonymousClass2eL;
import X.AnonymousClass3HQ;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.util.creation.ShaderBridge;

public class TiltShiftFogFilter extends BaseTiltShiftFilter {
    public static final Creator CREATOR = new AnonymousClass3HQ();
    /* renamed from: B */
    public float f50252B;
    /* renamed from: C */
    private AnonymousClass2eL f50253C;

    public TiltShiftFogFilter() {
        m23207Q(0.0f);
    }

    public TiltShiftFogFilter(Parcel parcel) {
        super(parcel);
        m23207Q(parcel.readFloat());
    }

    /* renamed from: B */
    public final AnonymousClass28h mo5433B(AnonymousClass28k anonymousClass28k) {
        int compileProgram = ShaderBridge.compileProgram("BlurComposite");
        if (compileProgram == 0) {
            return null;
        }
        AnonymousClass28h anonymousClass28h = new AnonymousClass28h(compileProgram);
        mo5475F(anonymousClass28h);
        return anonymousClass28h;
    }

    /* renamed from: F */
    public final void mo5475F(AnonymousClass28h anonymousClass28h) {
        super.mo5475F(anonymousClass28h);
        this.f50253C = (AnonymousClass2eL) anonymousClass28h.m14572B("dimFactor");
    }

    /* renamed from: N */
    public final void mo5476N(AnonymousClass28h anonymousClass28h, AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi) {
        this.f50253C.m16738C(this.f50252B);
    }

    /* renamed from: Q */
    public final void m23207Q(float f) {
        this.f50252B = f;
        invalidate();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f50252B);
    }
}
