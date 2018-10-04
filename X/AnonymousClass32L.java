package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.avatar.AddAvatarHelper$LoadedImage$LoadedImageMetadata;

/* renamed from: X.32L */
public final class AnonymousClass32L implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new AddAvatarHelper$LoadedImage$LoadedImageMetadata(parcel);
    }

    public final Object[] newArray(int i) {
        return new AddAvatarHelper$LoadedImage$LoadedImageMetadata[i];
    }
}
