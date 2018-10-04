package com.google.android.gms.common.images;

import X.AnonymousClass1z9;
import X.AnonymousClass1zC;
import X.AnonymousClass1zL;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;
import java.util.Locale;

public final class WebImage extends zza {
    public static final Creator CREATOR = new AnonymousClass1z9();
    /* renamed from: B */
    public final Uri f25010B;
    /* renamed from: C */
    public final int f25011C;
    /* renamed from: D */
    public final int f25012D;
    /* renamed from: E */
    private int f25013E;

    public WebImage(int i, Uri uri, int i2, int i3) {
        this.f25013E = i;
        this.f25010B = uri;
        this.f25011C = i2;
        this.f25012D = i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null) {
                if (obj instanceof WebImage) {
                    WebImage webImage = (WebImage) obj;
                    if (AnonymousClass1zL.m14085B(this.f25010B, webImage.f25010B) && this.f25011C == webImage.f25011C && this.f25012D == webImage.f25012D) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f25010B, Integer.valueOf(this.f25011C), Integer.valueOf(this.f25012D)});
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.f25011C), Integer.valueOf(this.f25012D), this.f25010B.toString()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.m14073U(parcel);
        AnonymousClass1zC.m14071S(parcel, 1, this.f25013E);
        AnonymousClass1zC.m14059G(parcel, 2, this.f25010B, i, false);
        AnonymousClass1zC.m14071S(parcel, 3, this.f25011C);
        AnonymousClass1zC.m14071S(parcel, 4, this.f25012D);
        AnonymousClass1zC.m14054B(parcel, U);
    }
}
