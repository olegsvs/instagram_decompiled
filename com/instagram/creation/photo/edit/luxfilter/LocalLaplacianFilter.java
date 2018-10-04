package com.instagram.creation.photo.edit.luxfilter;

import X.AnonymousClass28e;
import X.AnonymousClass28f;
import X.AnonymousClass28h;
import X.AnonymousClass28k;
import X.AnonymousClass2Vh;
import X.AnonymousClass2Vi;
import X.AnonymousClass2eL;
import X.AnonymousClass3Gd;
import X.AnonymousClass3Gh;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.filterkit.filter.BaseSimpleFilter;
import com.instagram.util.creation.ShaderBridge;

public class LocalLaplacianFilter extends BaseSimpleFilter {
    public static final Creator CREATOR = new AnonymousClass3Gd();
    /* renamed from: B */
    public int f50063B;
    /* renamed from: C */
    public AnonymousClass3Gh f50064C;
    /* renamed from: D */
    public int f50065D;
    /* renamed from: E */
    private AnonymousClass2eL f50066E;

    public LocalLaplacianFilter(Parcel parcel) {
        super(parcel);
        this.f50063B = parcel.readInt();
        invalidate();
        this.f50065D = parcel.readInt();
        invalidate();
    }

    /* renamed from: B */
    public final AnonymousClass28h mo5433B(AnonymousClass28k anonymousClass28k) {
        int compileProgram = ShaderBridge.compileProgram("Laplacian");
        if (compileProgram == 0) {
            return null;
        }
        AnonymousClass28h anonymousClass28h = new AnonymousClass28h(compileProgram);
        this.f50066E = (AnonymousClass2eL) anonymousClass28h.m14572B("u_strength");
        return anonymousClass28h;
    }

    /* renamed from: E */
    public final void mo5436E(AnonymousClass28h anonymousClass28h, AnonymousClass28k anonymousClass28k, AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi) {
        this.f50066E.m16738C(((float) (this.f50063B + this.f50065D)) / 100.0f);
        anonymousClass28h.m14576F("localLaplacian", this.f50064C.m19216B(this));
        anonymousClass28h.m14577G("image", anonymousClass2Vh.getTextureId(), AnonymousClass28f.NEAREST, AnonymousClass28e.CLAMP);
    }

    public final void QE(AnonymousClass28k anonymousClass28k) {
        super.QE(anonymousClass28k);
        this.f50064C.m19215A(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f50063B);
        parcel.writeInt(this.f50065D);
    }
}
