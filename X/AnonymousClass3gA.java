package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.sponsored.analytics.SourceModelInfoParams;

/* renamed from: X.3gA */
public final class AnonymousClass3gA implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new SourceModelInfoParams(parcel);
    }

    public final Object[] newArray(int i) {
        return new SourceModelInfoParams[i];
    }
}
