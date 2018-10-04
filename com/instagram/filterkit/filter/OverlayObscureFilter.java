package com.instagram.filterkit.filter;

import X.AnonymousClass28h;
import X.AnonymousClass28j;
import X.AnonymousClass28k;
import X.AnonymousClass2Vh;
import X.AnonymousClass2Vi;
import X.AnonymousClass2eL;
import X.AnonymousClass2eM;
import X.AnonymousClass3Om;
import X.AnonymousClass3On;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.util.video.VideoBridge;

public class OverlayObscureFilter extends BaseSimpleFilter {
    public static final Creator CREATOR = new AnonymousClass3Om();
    /* renamed from: B */
    public final String f50121B;
    /* renamed from: C */
    public AnonymousClass2Vh f50122C;
    /* renamed from: D */
    private AnonymousClass2eM f50123D;
    /* renamed from: E */
    private AnonymousClass2eL f50124E;

    public OverlayObscureFilter(Parcel parcel) {
        super(parcel);
        this.f50121B = parcel.readString();
    }

    public OverlayObscureFilter(String str) {
        this.f50121B = str;
    }

    /* renamed from: B */
    public static int m23078B(AnonymousClass3On anonymousClass3On, int[] iArr, int i, int i2, float f, int i3) {
        int i4 = (Color.alpha(anonymousClass3On.f40791C[(anonymousClass3On.f40792D * i2) + i]) >= 250 ? 1 : null) != null ? i3 + 1 : 0;
        anonymousClass3On = anonymousClass3On.f40792D;
        int i5 = iArr[(i2 * anonymousClass3On) + i] & 65535;
        if (i5 == 0 || i4 < i5) {
            iArr[i + (i2 * anonymousClass3On)] = i4 | ((((int) ((f / 6.2831855f) * 255.0f)) << 16) | -16777216);
        }
        return i4;
    }

    /* renamed from: B */
    public final AnonymousClass28h mo5433B(AnonymousClass28k anonymousClass28k) {
        int compileProgram = VideoBridge.compileProgram("OverlayObscure", true);
        if (compileProgram == 0) {
            return null;
        }
        AnonymousClass28h anonymousClass28h = new AnonymousClass28h(compileProgram);
        this.f50123D = (AnonymousClass2eM) anonymousClass28h.m14572B("distanceConversion");
        this.f50124E = (AnonymousClass2eL) anonymousClass28h.m14572B("twoPi");
        return anonymousClass28h;
    }

    /* renamed from: E */
    public final void mo5436E(AnonymousClass28h anonymousClass28h, AnonymousClass28k anonymousClass28k, AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi) {
        if (this.f50122C == null) {
            int i;
            int i2;
            Options options = new Options();
            options.inPreferredConfig = Config.ARGB_8888;
            Bitmap decodeFile = BitmapFactory.decodeFile(this.f50121B, options);
            int width = decodeFile.getWidth();
            int height = decodeFile.getHeight();
            int[] iArr = new int[(width * height)];
            decodeFile.getPixels(iArr, 0, width, 0, 0, width, height);
            decodeFile.recycle();
            AnonymousClass3On anonymousClass3On = new AnonymousClass3On(iArr, width, height);
            int i3 = anonymousClass3On.f40792D;
            int i4 = anonymousClass3On.f40790B;
            int[] iArr2 = new int[(i3 * i4)];
            for (i = 0; i < i3; i++) {
                height = 0;
                for (i2 = 0; i2 < i4; i2++) {
                    height = m23078B(anonymousClass3On, iArr2, i, i2, 1.5707964f, height);
                }
            }
            for (i = 0; i < i3; i++) {
                height = 0;
                for (i2 = i4 - 1; i2 >= 0; i2--) {
                    height = m23078B(anonymousClass3On, iArr2, i, i2, 4.712389f, height);
                }
            }
            for (i2 = 0; i2 < i4; i2++) {
                height = 0;
                for (i = 0; i < i3; i++) {
                    height = m23078B(anonymousClass3On, iArr2, i, i2, 3.1415927f, height);
                }
            }
            for (i2 = 0; i2 < i4; i2++) {
                height = 0;
                for (i = i3 - 1; i >= 0; i--) {
                    height = m23078B(anonymousClass3On, iArr2, i, i2, 0.0f, height);
                }
            }
            this.f50122C = AnonymousClass28j.m14584G(Bitmap.createBitmap(iArr2, i3, i4, Config.ARGB_8888), true);
        }
        anonymousClass28h.m14576F("image", anonymousClass2Vh.getTextureId());
        anonymousClass28h.m14576F("textureOffsetLUT", this.f50122C.getTextureId());
        this.f50124E.m16738C(6.2831855f);
        this.f50123D.m16740C(255.0f / ((float) this.f50122C.getWidth()), 255.0f / ((float) this.f50122C.getHeight()));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f50121B);
    }
}
