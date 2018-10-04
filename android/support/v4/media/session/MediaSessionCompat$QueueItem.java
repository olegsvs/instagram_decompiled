package android.support.v4.media.session;

import X.AnonymousClass1mD;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.media.MediaDescriptionCompat;

public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1mD();
    /* renamed from: B */
    private final MediaDescriptionCompat f22555B;
    /* renamed from: C */
    private final long f22556C;

    public final int describeContents() {
        return 0;
    }

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.f22555B = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.f22556C = parcel.readLong();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MediaSession.QueueItem {Description=");
        stringBuilder.append(this.f22555B);
        stringBuilder.append(", Id=");
        stringBuilder.append(this.f22556C);
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.f22555B.writeToParcel(parcel, i);
        parcel.writeLong(this.f22556C);
    }
}
