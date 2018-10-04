package com.instagram.creation.photo.edit.luxfilter;

import X.AnonymousClass28e;
import X.AnonymousClass28f;
import X.AnonymousClass28h;
import X.AnonymousClass28k;
import X.AnonymousClass2Vh;
import X.AnonymousClass2Vi;
import X.AnonymousClass2eL;
import X.AnonymousClass3Gc;
import X.AnonymousClass3Gi;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.filterkit.filter.BaseSimpleFilter;
import com.instagram.util.creation.ShaderBridge;

public class LuxFilter extends BaseSimpleFilter {
    public static final Creator CREATOR = new AnonymousClass3Gi();
    /* renamed from: B */
    public AnonymousClass3Gc f50067B;
    /* renamed from: C */
    public int f50068C = -1;
    /* renamed from: D */
    private AnonymousClass2eL f50069D;

    public LuxFilter(Parcel parcel) {
        super(parcel);
        m23023F(parcel.readInt());
    }

    /* renamed from: B */
    public final AnonymousClass28h mo5433B(AnonymousClass28k anonymousClass28k) {
        int compileProgram = ShaderBridge.compileProgram("StarLight");
        if (compileProgram == 0) {
            return null;
        }
        AnonymousClass28h anonymousClass28h = new AnonymousClass28h(compileProgram);
        this.f50069D = (AnonymousClass2eL) anonymousClass28h.m14572B("u_strength");
        return anonymousClass28h;
    }

    /* renamed from: E */
    public final void mo5436E(AnonymousClass28h anonymousClass28h, AnonymousClass28k anonymousClass28k, AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi) {
        this.f50069D.m16738C(((float) this.f50068C) / 100.0f);
        anonymousClass28h.m14576F("cdf", this.f50067B.m19212B(this));
        anonymousClass28h.m14577G("image", anonymousClass2Vh.getTextureId(), AnonymousClass28f.NEAREST, AnonymousClass28e.CLAMP);
    }

    /* renamed from: F */
    public final void m23023F(int i) {
        this.f50068C = i;
        invalidate();
    }

    public final void QE(AnonymousClass28k anonymousClass28k) {
        super.QE(anonymousClass28k);
        this.f50067B.m19211A(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f50068C);
    }
}
