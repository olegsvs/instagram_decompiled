package com.facebook.rti.mqtt.protocol.messages;

import X.AnonymousClass083;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Map;

public class GqlsTopicExtraInfo implements TopicExtraInfo {
    public static final Creator CREATOR = new AnonymousClass083();
    /* renamed from: B */
    private final Boolean f1320B;
    /* renamed from: C */
    private final Map f1321C;
    /* renamed from: D */
    private final String f1322D;

    public final int describeContents() {
        return 0;
    }

    public GqlsTopicExtraInfo(Parcel parcel) {
        this.f1322D = parcel.readString();
        this.f1321C = parcel.readHashMap(HashMap.class.getClassLoader());
        this.f1320B = (Boolean) parcel.readValue(null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r3 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r3;
    L_0x0004:
        r2 = 0;
        if (r5 == 0) goto L_0x0025;
    L_0x0007:
        r1 = r4.getClass();
        r0 = r5.getClass();
        if (r1 == r0) goto L_0x0012;
    L_0x0011:
        goto L_0x0025;
    L_0x0012:
        r5 = (com.facebook.rti.mqtt.protocol.messages.GqlsTopicExtraInfo) r5;
        r1 = r4.f1322D;
        if (r1 == 0) goto L_0x0021;
    L_0x0018:
        r0 = r5.f1322D;
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x0026;
    L_0x0020:
        goto L_0x0025;
    L_0x0021:
        r0 = r5.f1322D;
        if (r0 == 0) goto L_0x0026;
    L_0x0025:
        return r2;
    L_0x0026:
        r1 = r4.f1321C;
        if (r1 == 0) goto L_0x0033;
    L_0x002a:
        r0 = r5.f1321C;
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x0038;
    L_0x0032:
        goto L_0x0025;
    L_0x0033:
        r0 = r5.f1321C;
        if (r0 == 0) goto L_0x0038;
    L_0x0037:
        goto L_0x0025;
    L_0x0038:
        r1 = r4.f1320B;
        if (r1 == 0) goto L_0x0043;
    L_0x003c:
        r0 = r5.f1320B;
        r3 = r1.equals(r0);
        goto L_0x0003;
    L_0x0043:
        r0 = r5.f1320B;
        if (r0 != 0) goto L_0x0048;
    L_0x0047:
        goto L_0x0003;
    L_0x0048:
        r3 = 0;
        goto L_0x0003;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rti.mqtt.protocol.messages.GqlsTopicExtraInfo.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f1322D;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f1321C;
        hashCode = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Boolean bool = this.f1320B;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GqlsTopicExtraInfo{DESCRIPTION='GraphQL Subscription Infomation', subscription='");
        stringBuilder.append(this.f1322D);
        stringBuilder.append('\'');
        stringBuilder.append(", queryParams=");
        stringBuilder.append(this.f1321C);
        stringBuilder.append(", forceLogEnabled=");
        stringBuilder.append(this.f1320B);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1322D);
        parcel.writeMap(this.f1321C);
        parcel.writeValue(this.f1320B);
    }
}
