package X;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzcdn;
import com.google.android.gms.internal.zzcdp;

/* renamed from: X.5fn */
public final class AnonymousClass5fn implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = AnonymousClass1zA.O(parcel);
        zzcdn zzcdn = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        int i = 1;
        while (parcel.dataPosition() < O) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = AnonymousClass1zA.P(parcel, readInt);
                    break;
                case 2:
                    zzcdn = (zzcdn) AnonymousClass1zA.I(parcel, readInt, zzcdn.CREATOR);
                    break;
                case 3:
                    iBinder = AnonymousClass1zA.X(parcel, readInt);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) AnonymousClass1zA.I(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = AnonymousClass1zA.X(parcel, readInt);
                    break;
                case 6:
                    iBinder3 = AnonymousClass1zA.X(parcel, readInt);
                    break;
                default:
                    AnonymousClass1zA.K(parcel, readInt);
                    break;
            }
        }
        AnonymousClass1zA.G(parcel, O);
        return new zzcdp(i, zzcdn, iBinder, pendingIntent, iBinder2, iBinder3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcdp[i];
    }
}
