package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.gcm.PendingCallback;

/* renamed from: X.1zt */
public final class AnonymousClass1zt implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PendingCallback(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PendingCallback[i];
    }
}
