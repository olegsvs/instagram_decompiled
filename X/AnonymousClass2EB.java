package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.model.fbfriend.FbFriendTag;

/* renamed from: X.2EB */
public final class AnonymousClass2EB implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new FbFriendTag(parcel);
    }

    public final Object[] newArray(int i) {
        return new FbFriendTag[i];
    }
}
