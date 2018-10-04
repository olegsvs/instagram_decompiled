package com.facebook.exoplayer.ipc;

import X.AnonymousClass1tx;
import X.AnonymousClass1ty;
import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class VideoPlayRequest implements Closeable, Parcelable {
    public static final Creator CREATOR = new AnonymousClass1tx();
    /* renamed from: U */
    private static final String f23857U = "VideoPlayRequest";
    /* renamed from: B */
    public String f23858B;
    /* renamed from: C */
    public boolean f23859C;
    /* renamed from: D */
    public String f23860D;
    /* renamed from: E */
    public boolean f23861E;
    /* renamed from: F */
    public boolean f23862F;
    /* renamed from: G */
    public boolean f23863G;
    /* renamed from: H */
    public boolean f23864H;
    /* renamed from: I */
    public boolean f23865I;
    /* renamed from: J */
    public Map f23866J;
    /* renamed from: K */
    public ParcelFileDescriptor f23867K;
    /* renamed from: L */
    public String f23868L;
    /* renamed from: M */
    public int f23869M;
    /* renamed from: N */
    public String f23870N;
    /* renamed from: O */
    public Uri f23871O;
    /* renamed from: P */
    public int f23872P;
    /* renamed from: Q */
    public String f23873Q;
    /* renamed from: R */
    public Uri f23874R;
    /* renamed from: S */
    public String f23875S;
    /* renamed from: T */
    public AnonymousClass1ty f23876T;

    public final int describeContents() {
        return 0;
    }

    public VideoPlayRequest(Parcel parcel) {
        ClassLoader classLoader = VideoPlayRequest.class.getClassLoader();
        this.f23874R = (Uri) parcel.readParcelable(classLoader);
        this.f23871O = (Uri) parcel.readParcelable(classLoader);
        this.f23875S = parcel.readString();
        this.f23860D = parcel.readString();
        this.f23868L = parcel.readString();
        this.f23858B = parcel.readString();
        this.f23867K = (ParcelFileDescriptor) parcel.readParcelable(classLoader);
        this.f23876T = AnonymousClass1ty.valueOf(parcel.readString());
        boolean z = false;
        this.f23862F = parcel.readInt() == 1;
        this.f23864H = parcel.readInt() == 1;
        this.f23872P = parcel.readInt();
        this.f23873Q = parcel.readString();
        int readInt = parcel.readInt();
        this.f23866J = new HashMap();
        for (int i = 0; i < readInt; i++) {
            this.f23866J.put(parcel.readString(), parcel.readString());
        }
        this.f23869M = parcel.readInt();
        this.f23870N = parcel.readString();
        this.f23863G = parcel.readInt() == 1;
        this.f23861E = parcel.readInt() == 1;
        this.f23865I = parcel.readInt() == 1;
        if (parcel.readInt() == 1) {
            z = true;
        }
        this.f23859C = z;
    }

    public final void close() {
        try {
            if (this.f23867K != null) {
                this.f23867K.close();
                this.f23867K = null;
            }
        } catch (Throwable e) {
            Log.e(f23857U, "Failed to close manifestFd", e);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f23874R, 0);
        parcel.writeParcelable(this.f23871O, 0);
        parcel.writeString(this.f23875S);
        parcel.writeString(this.f23860D);
        parcel.writeString(this.f23868L);
        parcel.writeString(this.f23858B);
        parcel.writeParcelable(this.f23867K, 0);
        parcel.writeString(this.f23876T.name());
        parcel.writeInt(this.f23862F);
        parcel.writeInt(this.f23864H);
        parcel.writeInt(this.f23872P);
        parcel.writeString(this.f23873Q);
        parcel.writeInt(this.f23866J.size());
        for (Entry entry : this.f23866J.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeInt(this.f23869M);
        parcel.writeString(this.f23870N);
        parcel.writeInt(this.f23863G);
        parcel.writeInt(this.f23861E);
        parcel.writeInt(this.f23865I);
        parcel.writeInt(this.f23859C);
    }
}
