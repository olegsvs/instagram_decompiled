package com.instagram.creation.photo.edit.effectfilter;

import X.AnonymousClass28h;
import X.AnonymousClass28k;
import X.AnonymousClass2Vh;
import X.AnonymousClass2Vi;
import X.AnonymousClass2eM;
import X.AnonymousClass3GK;
import android.opengl.GLES20;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.filterkit.filter.BaseSimpleFilter;
import com.instagram.util.creation.ShaderBridge;

public class BorderFilter extends BaseSimpleFilter {
    public static final Creator CREATOR = new AnonymousClass3GK();
    /* renamed from: B */
    private final float f50021B;
    /* renamed from: C */
    private final String f50022C;
    /* renamed from: D */
    private AnonymousClass2eM f50023D;

    /* renamed from: A */
    public final void mo5432A(AnonymousClass2Vi anonymousClass2Vi) {
    }

    /* renamed from: C */
    public final boolean mo5434C() {
        return true;
    }

    public final boolean EY() {
        return true;
    }

    public BorderFilter(Parcel parcel) {
        super(parcel);
        this.f50022C = parcel.readString();
        this.f50021B = parcel.readFloat();
    }

    public BorderFilter(String str) {
        this(str, 1.0f);
    }

    public BorderFilter(String str, float f) {
        this.f50022C = str;
        this.f50021B = f;
    }

    /* renamed from: B */
    public final AnonymousClass28h mo5433B(AnonymousClass28k anonymousClass28k) {
        int compileProgram = ShaderBridge.compileProgram("Border");
        if (compileProgram == 0) {
            return null;
        }
        AnonymousClass28h anonymousClass28h = new AnonymousClass28h(compileProgram);
        this.f50023D = (AnonymousClass2eM) anonymousClass28h.m14572B("stretchFactor");
        anonymousClass28h.m14576F("image", anonymousClass28k.m14592D(this, this.f50022C).getTextureId());
        return anonymousClass28h;
    }

    /* renamed from: D */
    public final void mo5435D(AnonymousClass28k anonymousClass28k, AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi) {
        GLES20.glDisable(3042);
    }

    /* renamed from: E */
    public final void mo5436E(AnonymousClass28h anonymousClass28h, AnonymousClass28k anonymousClass28k, AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi) {
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(1, 771);
        float jQ = ((float) anonymousClass2Vi.jQ()) / ((float) anonymousClass2Vi.hQ());
        float f = this.f50021B;
        if (jQ == f) {
            this.f50023D.m16740C(1.0f, 1.0f);
        } else if (jQ > f) {
            this.f50023D.m16740C(jQ / f, 1.0f);
        } else {
            this.f50023D.m16740C(1.0f, f / jQ);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f50022C);
        parcel.writeFloat(this.f50021B);
    }
}
