package android.support.v4.media.session;

import X.AnonymousClass1mE;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;

public final class MediaSessionCompat$ResultReceiverWrapper implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1mE();
    /* renamed from: B */
    private ResultReceiver f22557B;

    public final int describeContents() {
        return 0;
    }

    public MediaSessionCompat$ResultReceiverWrapper(Parcel parcel) {
        this.f22557B = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.f22557B.writeToParcel(parcel, i);
    }
}
