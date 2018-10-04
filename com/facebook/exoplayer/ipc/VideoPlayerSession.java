package com.facebook.exoplayer.ipc;

import X.AnonymousClass1ty;
import X.AnonymousClass1tz;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class VideoPlayerSession implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1tz();
    /* renamed from: B */
    public String f23877B;
    /* renamed from: C */
    public Map f23878C;
    /* renamed from: D */
    public Uri f23879D;
    /* renamed from: E */
    public int f23880E;
    /* renamed from: F */
    public Uri f23881F;
    /* renamed from: G */
    public String f23882G;
    /* renamed from: H */
    public AnonymousClass1ty f23883H;

    public final int describeContents() {
        return 0;
    }

    public VideoPlayerSession(Parcel parcel) {
        this.f23877B = parcel.readString();
        this.f23881F = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f23879D = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f23882G = parcel.readString();
        this.f23880E = parcel.readInt();
        this.f23883H = AnonymousClass1ty.valueOf(parcel.readString());
        int readInt = parcel.readInt();
        this.f23878C = new HashMap();
        for (int i = 0; i < readInt; i++) {
            this.f23878C.put(parcel.readString(), parcel.readString());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
        r3 = this;
        r2 = 0;
        if (r4 == 0) goto L_0x0038;
    L_0x0003:
        r0 = r4 instanceof com.facebook.exoplayer.ipc.VideoPlayerSession;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        goto L_0x0038;
    L_0x0008:
        r4 = (com.facebook.exoplayer.ipc.VideoPlayerSession) r4;
        r1 = r3.f23879D;
        if (r1 != 0) goto L_0x0013;
    L_0x000e:
        r1 = r3.f23881F;
        r0 = r4.f23881F;
        goto L_0x0015;
    L_0x0013:
        r0 = r4.f23879D;
    L_0x0015:
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x002e;
    L_0x001b:
        r1 = r3.f23877B;
        if (r1 != 0) goto L_0x0024;
    L_0x001f:
        r0 = r4.f23877B;
        if (r0 != 0) goto L_0x002e;
    L_0x0023:
        goto L_0x002c;
    L_0x0024:
        r0 = r4.f23877B;
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x002e;
    L_0x002c:
        r0 = 1;
        goto L_0x002f;
    L_0x002e:
        r0 = 0;
    L_0x002f:
        if (r0 == 0) goto L_0x0038;
    L_0x0031:
        r1 = r3.f23880E;
        r0 = r4.f23880E;
        if (r1 != r0) goto L_0x0038;
    L_0x0037:
        r2 = 1;
    L_0x0038:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.ipc.VideoPlayerSession.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Uri uri = this.f23879D;
        if (uri == null) {
            uri = this.f23881F;
        }
        int hashCode = uri.hashCode() * 31;
        String str = this.f23877B;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f23880E;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23877B);
        parcel.writeParcelable(this.f23881F, 0);
        parcel.writeParcelable(this.f23879D, 0);
        parcel.writeString(this.f23882G);
        parcel.writeInt(this.f23880E);
        parcel.writeString(this.f23883H.name());
        parcel.writeInt(this.f23878C.size());
        for (Entry entry : this.f23878C.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
