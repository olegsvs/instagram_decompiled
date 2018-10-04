package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.location.zzaa;
import java.util.List;

/* renamed from: X.5fy */
public final class AnonymousClass5fy implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = AnonymousClass1zA.O(parcel);
        String str = JsonProperty.USE_DEFAULT_NAME;
        List list = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < O) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    list = AnonymousClass1zA.D(parcel, readInt);
                    break;
                case 2:
                    pendingIntent = (PendingIntent) AnonymousClass1zA.I(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 3:
                    str = AnonymousClass1zA.W(parcel, readInt);
                    break;
                default:
                    AnonymousClass1zA.K(parcel, readInt);
                    break;
            }
        }
        AnonymousClass1zA.G(parcel, O);
        return new zzaa(list, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaa[i];
    }
}
