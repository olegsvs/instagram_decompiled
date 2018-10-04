package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzcco;

/* renamed from: X.5fk */
public final class AnonymousClass5fk implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = AnonymousClass1zA.O(parcel);
        Status status = null;
        while (parcel.dataPosition() < O) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                AnonymousClass1zA.K(parcel, readInt);
            } else {
                status = (Status) AnonymousClass1zA.I(parcel, readInt, Status.CREATOR);
            }
        }
        AnonymousClass1zA.G(parcel, O);
        return new zzcco(status);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcco[i];
    }
}
