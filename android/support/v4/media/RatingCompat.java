package android.support.v4.media;

import X.AnonymousClass1mC;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class RatingCompat implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1mC();
    /* renamed from: B */
    private final int f22553B;
    /* renamed from: C */
    private final float f22554C;

    public RatingCompat(int i, float f) {
        this.f22553B = i;
        this.f22554C = f;
    }

    public final int describeContents() {
        return this.f22553B;
    }

    public final String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Rating:style=");
        stringBuilder.append(this.f22553B);
        stringBuilder.append(" rating=");
        float f = this.f22554C;
        if (f < 0.0f) {
            str = "unrated";
        } else {
            str = String.valueOf(f);
        }
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f22553B);
        parcel.writeFloat(this.f22554C);
    }
}
