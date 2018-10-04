package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.2kO */
public final class AnonymousClass2kO implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new CallerContext(parcel);
    }

    public final Object[] newArray(int i) {
        return new CallerContext[i];
    }
}
