package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.creation.state.CreationState;

/* renamed from: X.3Ha */
public final class AnonymousClass3Ha implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return CreationState.valueOf(parcel.readString());
    }

    public final Object[] newArray(int i) {
        return new CreationState[i];
    }
}
