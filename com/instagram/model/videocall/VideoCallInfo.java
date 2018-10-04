package com.instagram.model.videocall;

import X.AnonymousClass3VB;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class VideoCallInfo implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass3VB();
    /* renamed from: B */
    public final String f4467B;
    /* renamed from: C */
    public final String f4468C;

    public final int describeContents() {
        return 0;
    }

    public VideoCallInfo(Parcel parcel) {
        this.f4468C = parcel.readString();
        this.f4467B = parcel.readString();
    }

    public VideoCallInfo(String str, String str2) {
        this.f4468C = str;
        this.f4467B = str2;
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
        r5 = (com.instagram.model.videocall.VideoCallInfo) r5;
        r1 = r4.f4468C;
        if (r1 == 0) goto L_0x0021;
    L_0x0018:
        r0 = r5.f4468C;
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x0026;
    L_0x0020:
        goto L_0x0025;
    L_0x0021:
        r0 = r5.f4468C;
        if (r0 == 0) goto L_0x0026;
    L_0x0025:
        return r2;
    L_0x0026:
        r1 = r4.f4467B;
        if (r1 == 0) goto L_0x0031;
    L_0x002a:
        r0 = r5.f4467B;
        r3 = r1.equals(r0);
        goto L_0x0003;
    L_0x0031:
        r0 = r5.f4467B;
        if (r0 != 0) goto L_0x0036;
    L_0x0035:
        goto L_0x0003;
    L_0x0036:
        r3 = 0;
        goto L_0x0003;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.videocall.VideoCallInfo.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f4468C;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        str = this.f4467B;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VideoCallInfo{videoCallId='");
        stringBuilder.append(this.f4468C);
        stringBuilder.append('\'');
        stringBuilder.append(", serverInfo='");
        stringBuilder.append(this.f4467B);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f4468C);
        parcel.writeString(this.f4467B);
    }
}
