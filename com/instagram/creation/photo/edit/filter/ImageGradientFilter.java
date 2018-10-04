package com.instagram.creation.photo.edit.filter;

import X.AnonymousClass28h;
import X.AnonymousClass28j;
import X.AnonymousClass28k;
import X.AnonymousClass2Vh;
import X.AnonymousClass2Vi;
import X.AnonymousClass2eM;
import X.AnonymousClass2eO;
import X.AnonymousClass3GZ;
import android.graphics.Color;
import android.opengl.GLES20;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.filterkit.filter.BaseSimpleFilter;
import com.instagram.util.creation.ShaderBridge;

public class ImageGradientFilter extends BaseSimpleFilter {
    public static final Creator CREATOR = new AnonymousClass3GZ();
    /* renamed from: B */
    private final float[] f50056B;
    /* renamed from: C */
    private AnonymousClass2eO f50057C;
    /* renamed from: D */
    private final int f50058D;
    /* renamed from: E */
    private AnonymousClass2eM f50059E;
    /* renamed from: F */
    private boolean f50060F;
    /* renamed from: G */
    private final float[] f50061G;
    /* renamed from: H */
    private AnonymousClass2eO f50062H;

    public ImageGradientFilter(int i, int i2, int i3) {
        this.f50061G = m23015B(i);
        this.f50056B = m23015B(i2);
        this.f50058D = i3;
    }

    public ImageGradientFilter(Parcel parcel) {
        super(parcel);
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.f50060F = z;
        float[] fArr = new float[3];
        this.f50061G = fArr;
        parcel.readFloatArray(fArr);
        fArr = new float[3];
        this.f50056B = fArr;
        parcel.readFloatArray(fArr);
        this.f50058D = parcel.readInt();
    }

    /* renamed from: A */
    public final void mo5432A(AnonymousClass2Vi anonymousClass2Vi) {
        if (this.f50060F) {
            GLES20.glBindFramebuffer(36160, anonymousClass2Vi.QM());
            AnonymousClass28j.m14579B("ImageGradientFilter.clearFrameBuffer:glBindFramebuffer");
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16384);
        }
    }

    /* renamed from: B */
    public final AnonymousClass28h mo5433B(AnonymousClass28k anonymousClass28k) {
        int compileProgram = ShaderBridge.compileProgram(this.f50058D % 180 != 0 ? "ImageHorizontalGradientBackground" : "ImageVerticalGradientBackground");
        if (compileProgram == 0) {
            return null;
        }
        AnonymousClass28h anonymousClass28h = new AnonymousClass28h(compileProgram);
        this.f50062H = (AnonymousClass2eO) anonymousClass28h.m14572B("topColor");
        this.f50057C = (AnonymousClass2eO) anonymousClass28h.m14572B("bottomColor");
        this.f50059E = (AnonymousClass2eM) anonymousClass28h.m14572B("resolution");
        return anonymousClass28h;
    }

    /* renamed from: B */
    public static float[] m23015B(int i) {
        return new float[]{((float) Color.red(i)) / 255.0f, ((float) Color.green(i)) / 255.0f, ((float) Color.blue(i)) / 255.0f};
    }

    /* renamed from: E */
    public final void mo5436E(AnonymousClass28h anonymousClass28h, AnonymousClass28k anonymousClass28k, AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi) {
        anonymousClass28h.m14576F("image", anonymousClass2Vh.getTextureId());
        AnonymousClass2eO anonymousClass2eO = this.f50062H;
        float[] fArr = this.f50056B;
        anonymousClass2eO.m16747D(fArr[0], fArr[1], fArr[2], 1.0f);
        anonymousClass2eO = this.f50057C;
        fArr = this.f50061G;
        anonymousClass2eO.m16747D(fArr[0], fArr[1], fArr[2], 1.0f);
        this.f50059E.m16740C((float) anonymousClass2Vi.getWidth(), (float) anonymousClass2Vi.getHeight());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f50060F);
        parcel.writeFloatArray(this.f50061G);
        parcel.writeFloatArray(this.f50056B);
        parcel.writeInt(this.f50058D);
    }
}
