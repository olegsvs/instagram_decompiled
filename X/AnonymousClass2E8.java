package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.model.direct.DirectVisualMessageReplyViewModel;

/* renamed from: X.2E8 */
public final class AnonymousClass2E8 implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new DirectVisualMessageReplyViewModel(parcel);
    }

    public final Object[] newArray(int i) {
        return new DirectVisualMessageReplyViewModel[i];
    }
}
