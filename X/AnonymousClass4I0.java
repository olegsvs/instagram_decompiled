package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.creation.capture.GalleryPreviewInfo;

/* renamed from: X.4I0 */
public final class AnonymousClass4I0 implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new GalleryPreviewInfo(parcel);
    }

    public final Object[] newArray(int i) {
        return new GalleryPreviewInfo[i];
    }
}
