package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.gms.identity.intents.model.UserAddress;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.5fX */
public final class AnonymousClass5fX implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = AnonymousClass1zA.O(parcel2);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        boolean z = false;
        while (parcel2.dataPosition() < O) {
            int readInt = parcel2.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = AnonymousClass1zA.W(parcel2, readInt);
                    break;
                case 3:
                    str2 = AnonymousClass1zA.W(parcel2, readInt);
                    break;
                case 4:
                    str3 = AnonymousClass1zA.W(parcel2, readInt);
                    break;
                case 5:
                    str4 = AnonymousClass1zA.W(parcel2, readInt);
                    break;
                case 6:
                    str5 = AnonymousClass1zA.W(parcel2, readInt);
                    break;
                case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                    str6 = AnonymousClass1zA.W(parcel2, readInt);
                    break;
                case 8:
                    str7 = AnonymousClass1zA.W(parcel2, readInt);
                    break;
                case 9:
                    str8 = AnonymousClass1zA.W(parcel2, readInt);
                    break;
                case 10:
                    str9 = AnonymousClass1zA.W(parcel2, readInt);
                    break;
                case 11:
                    str10 = AnonymousClass1zA.W(parcel2, readInt);
                    break;
                case 12:
                    str11 = AnonymousClass1zA.W(parcel2, readInt);
                    break;
                case ParserMinimalBase.INT_CR /*13*/:
                    str12 = AnonymousClass1zA.W(parcel2, readInt);
                    break;
                case 14:
                    z = AnonymousClass1zA.N(parcel2, readInt);
                    break;
                case 15:
                    str13 = AnonymousClass1zA.W(parcel2, readInt);
                    break;
                case 16:
                    str14 = AnonymousClass1zA.W(parcel2, readInt);
                    break;
                default:
                    AnonymousClass1zA.K(parcel2, readInt);
                    break;
            }
        }
        AnonymousClass1zA.G(parcel2, O);
        return new UserAddress(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, str13, str14);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new UserAddress[i];
    }
}
