package X;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.AccountChangeEventsRequest;

/* renamed from: X.5fT */
public final class AnonymousClass5fT implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = AnonymousClass1zA.O(parcel);
        String str = null;
        int i = 0;
        Account account = null;
        int i2 = 0;
        while (parcel.dataPosition() < O) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = AnonymousClass1zA.P(parcel, readInt);
                    break;
                case 2:
                    i2 = AnonymousClass1zA.P(parcel, readInt);
                    break;
                case 3:
                    str = AnonymousClass1zA.W(parcel, readInt);
                    break;
                case 4:
                    account = (Account) AnonymousClass1zA.I(parcel, readInt, Account.CREATOR);
                    break;
                default:
                    AnonymousClass1zA.K(parcel, readInt);
                    break;
            }
        }
        AnonymousClass1zA.G(parcel, O);
        return new AccountChangeEventsRequest(i, i2, str, account);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountChangeEventsRequest[i];
    }
}
