package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;

/* renamed from: X.2wJ */
public final class AnonymousClass2wJ implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new SpliceScheduleCommand(parcel);
    }

    public final Object[] newArray(int i) {
        return new SpliceScheduleCommand[i];
    }
}
