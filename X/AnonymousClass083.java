package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.rti.mqtt.protocol.messages.GqlsTopicExtraInfo;

/* renamed from: X.083 */
public final class AnonymousClass083 implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new GqlsTopicExtraInfo(parcel);
    }

    public final Object[] newArray(int i) {
        return new GqlsTopicExtraInfo[i];
    }
}
