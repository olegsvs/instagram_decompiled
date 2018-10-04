package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.AccountChangeEvent;

/* renamed from: X.5fS */
public final class AnonymousClass5fS implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = AnonymousClass1zA.O(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < O) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = AnonymousClass1zA.P(parcel, readInt);
                    break;
                case 2:
                    j = AnonymousClass1zA.Q(parcel, readInt);
                    break;
                case 3:
                    str = AnonymousClass1zA.W(parcel, readInt);
                    break;
                case 4:
                    i2 = AnonymousClass1zA.P(parcel, readInt);
                    break;
                case 5:
                    i3 = AnonymousClass1zA.P(parcel, readInt);
                    break;
                case 6:
                    str2 = AnonymousClass1zA.W(parcel, readInt);
                    break;
                default:
                    AnonymousClass1zA.K(parcel, readInt);
                    break;
            }
        }
        AnonymousClass1zA.G(parcel, O);
        return new AccountChangeEvent(i, j, str, i2, i3, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountChangeEvent[i];
    }
}
