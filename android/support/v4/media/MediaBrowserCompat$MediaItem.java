package android.support.v4.media;

import X.AnonymousClass1m9;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1m9();
    /* renamed from: B */
    private final MediaDescriptionCompat f22540B;
    /* renamed from: C */
    private final int f22541C;

    public final int describeContents() {
        return 0;
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f22541C = parcel.readInt();
        this.f22540B = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MediaItem{");
        stringBuilder.append("mFlags=");
        stringBuilder.append(this.f22541C);
        stringBuilder.append(", mDescription=");
        stringBuilder.append(this.f22540B);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f22541C);
        this.f22540B.writeToParcel(parcel, i);
    }
}
