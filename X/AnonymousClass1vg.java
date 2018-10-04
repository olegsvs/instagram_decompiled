package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.login.LoginClient$Result;

/* renamed from: X.1vg */
public final class AnonymousClass1vg implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new LoginClient$Result(parcel);
    }

    public final Object[] newArray(int i) {
        return new LoginClient$Result[i];
    }
}
