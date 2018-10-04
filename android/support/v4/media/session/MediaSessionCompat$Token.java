package android.support.v4.media.session;

import X.AnonymousClass1mF;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class MediaSessionCompat$Token implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1mF();
    /* renamed from: B */
    private final Object f22558B;

    public final int describeContents() {
        return 0;
    }

    public MediaSessionCompat$Token(Object obj) {
        this(obj, null);
    }

    public MediaSessionCompat$Token(Object obj, IMediaSession iMediaSession) {
        this.f22558B = obj;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj instanceof MediaSessionCompat$Token) {
                MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
                Object obj2 = this.f22558B;
                if (obj2 != null) {
                    Object obj3 = mediaSessionCompat$Token.f22558B;
                    if (obj3 != null) {
                        return obj2.equals(obj3);
                    }
                } else if (mediaSessionCompat$Token.f22558B != null) {
                    z = false;
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        Object obj = this.f22558B;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (VERSION.SDK_INT >= 21) {
            parcel.writeParcelable((Parcelable) this.f22558B, i);
        } else {
            parcel.writeStrongBinder((IBinder) this.f22558B);
        }
    }
}
