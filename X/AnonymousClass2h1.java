package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.cameracore.assets.model.ARRequestAsset;

/* renamed from: X.2h1 */
public final class AnonymousClass2h1 implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new ARRequestAsset(parcel);
    }

    public final Object[] newArray(int i) {
        return new ARRequestAsset[i];
    }
}
