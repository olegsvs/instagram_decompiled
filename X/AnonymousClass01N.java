package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.profilo.ipc.TraceContext;

/* renamed from: X.01N */
public final class AnonymousClass01N implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new TraceContext(parcel);
    }

    public final Object[] newArray(int i) {
        return new TraceContext[i];
    }
}
