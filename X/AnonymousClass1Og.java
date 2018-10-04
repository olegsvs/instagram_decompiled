package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.model.fbfriend.FbFriend;

/* renamed from: X.1Og */
public final class AnonymousClass1Og implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new FbFriend(parcel);
    }

    public final Object[] newArray(int i) {
        return new FbFriend[i];
    }
}
