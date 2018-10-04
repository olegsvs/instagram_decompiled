package X;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.zzc;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.1zb */
public final class AnonymousClass1zb implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = AnonymousClass1zA.m14036O(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        zzc[] zzcArr = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < O) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = AnonymousClass1zA.m14037P(parcel, readInt);
                    break;
                case 2:
                    i2 = AnonymousClass1zA.m14037P(parcel, readInt);
                    break;
                case 3:
                    i3 = AnonymousClass1zA.m14037P(parcel, readInt);
                    break;
                case 4:
                    str = AnonymousClass1zA.m14044W(parcel, readInt);
                    break;
                case 5:
                    iBinder = AnonymousClass1zA.m14045X(parcel, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) AnonymousClass1zA.m14033L(parcel, readInt, Scope.CREATOR);
                    break;
                case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                    bundle = AnonymousClass1zA.m14046Y(parcel, readInt);
                    break;
                case 8:
                    account = (Account) AnonymousClass1zA.m14030I(parcel, readInt, Account.CREATOR);
                    break;
                case 10:
                    zzcArr = (zzc[]) AnonymousClass1zA.m14033L(parcel, readInt, zzc.CREATOR);
                    break;
                default:
                    AnonymousClass1zA.m14032K(parcel, readInt);
                    break;
            }
        }
        AnonymousClass1zA.m14028G(parcel, O);
        return new zzx(i, i2, i3, str, iBinder, scopeArr, bundle, account, zzcArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzx[i];
    }
}
