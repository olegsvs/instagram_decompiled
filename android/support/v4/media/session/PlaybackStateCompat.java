package android.support.v4.media.session;

import X.AnonymousClass1mH;
import X.AnonymousClass1mI;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1mH();
    /* renamed from: B */
    public final long f22568B;
    /* renamed from: C */
    public final long f22569C;
    /* renamed from: D */
    public final long f22570D;
    /* renamed from: E */
    public List f22571E;
    /* renamed from: F */
    public final int f22572F;
    /* renamed from: G */
    public final CharSequence f22573G;
    /* renamed from: H */
    public final Bundle f22574H;
    /* renamed from: I */
    public final long f22575I;
    /* renamed from: J */
    public final float f22576J;
    /* renamed from: K */
    public final int f22577K;
    /* renamed from: L */
    public final long f22578L;

    public final class CustomAction implements Parcelable {
        public static final Creator CREATOR = new AnonymousClass1mI();
        /* renamed from: B */
        private final String f22564B;
        /* renamed from: C */
        private final Bundle f22565C;
        /* renamed from: D */
        private final int f22566D;
        /* renamed from: E */
        private final CharSequence f22567E;

        public final int describeContents() {
            return 0;
        }

        public CustomAction(Parcel parcel) {
            this.f22564B = parcel.readString();
            this.f22567E = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f22566D = parcel.readInt();
            this.f22565C = parcel.readBundle();
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Action:mName='");
            stringBuilder.append(this.f22567E);
            stringBuilder.append(", mIcon=");
            stringBuilder.append(this.f22566D);
            stringBuilder.append(", mExtras=");
            stringBuilder.append(this.f22565C);
            return stringBuilder.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f22564B);
            TextUtils.writeToParcel(this.f22567E, parcel, i);
            parcel.writeInt(this.f22566D);
            parcel.writeBundle(this.f22565C);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f22577K = parcel.readInt();
        this.f22575I = parcel.readLong();
        this.f22576J = parcel.readFloat();
        this.f22578L = parcel.readLong();
        this.f22570D = parcel.readLong();
        this.f22568B = parcel.readLong();
        this.f22573G = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f22571E = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f22569C = parcel.readLong();
        this.f22574H = parcel.readBundle();
        this.f22572F = parcel.readInt();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlaybackState {");
        stringBuilder.append("state=");
        stringBuilder.append(this.f22577K);
        stringBuilder.append(", position=");
        stringBuilder.append(this.f22575I);
        stringBuilder.append(", buffered position=");
        stringBuilder.append(this.f22570D);
        stringBuilder.append(", speed=");
        stringBuilder.append(this.f22576J);
        stringBuilder.append(", updated=");
        stringBuilder.append(this.f22578L);
        stringBuilder.append(", actions=");
        stringBuilder.append(this.f22568B);
        stringBuilder.append(", error code=");
        stringBuilder.append(this.f22572F);
        stringBuilder.append(", error message=");
        stringBuilder.append(this.f22573G);
        stringBuilder.append(", custom actions=");
        stringBuilder.append(this.f22571E);
        stringBuilder.append(", active item id=");
        stringBuilder.append(this.f22569C);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f22577K);
        parcel.writeLong(this.f22575I);
        parcel.writeFloat(this.f22576J);
        parcel.writeLong(this.f22578L);
        parcel.writeLong(this.f22570D);
        parcel.writeLong(this.f22568B);
        TextUtils.writeToParcel(this.f22573G, parcel, i);
        parcel.writeTypedList(this.f22571E);
        parcel.writeLong(this.f22569C);
        parcel.writeBundle(this.f22574H);
        parcel.writeInt(this.f22572F);
    }
}
