package com.facebook.video.heroplayer.ipc;

import X.AnonymousClass17U;
import X.AnonymousClass17V;
import X.AnonymousClass1Dy;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class VideoSource implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass17V();
    /* renamed from: B */
    public boolean f14737B;
    /* renamed from: C */
    public boolean f14738C;
    /* renamed from: D */
    public boolean f14739D;
    /* renamed from: E */
    public boolean f14740E;
    /* renamed from: F */
    public boolean f14741F;
    /* renamed from: G */
    public boolean f14742G;
    /* renamed from: H */
    public Map f14743H;
    /* renamed from: I */
    public String f14744I;
    /* renamed from: J */
    public String f14745J;
    /* renamed from: K */
    public String f14746K;
    /* renamed from: L */
    public Uri f14747L;
    /* renamed from: M */
    public String f14748M;
    /* renamed from: N */
    public Uri f14749N;
    /* renamed from: O */
    public String f14750O;
    /* renamed from: P */
    public AnonymousClass17U f14751P;

    public final int describeContents() {
        return 0;
    }

    public VideoSource(Uri uri, String str, String str2, Uri uri2, String str3, AnonymousClass17U anonymousClass17U, boolean z, boolean z2, String str4, boolean z3, boolean z4, boolean z5, Map map, String str5, boolean z6) {
        this.f14749N = uri;
        this.f14750O = str;
        this.f14744I = str2;
        this.f14747L = uri2;
        this.f14745J = str3;
        this.f14751P = anonymousClass17U;
        this.f14739D = z;
        this.f14740E = z2;
        this.f14748M = str4;
        this.f14743H = map;
        this.f14741F = z3;
        this.f14742G = z4;
        this.f14738C = z5;
        this.f14746K = str5;
        this.f14737B = z6;
    }

    public VideoSource(Uri uri, String str, String str2, Uri uri2, String str3, AnonymousClass17U anonymousClass17U, boolean z, boolean z2, String str4, boolean z3, boolean z4, boolean z5, Map map, boolean z6) {
        boolean z7 = z2;
        boolean z8 = z;
        AnonymousClass17U anonymousClass17U2 = anonymousClass17U;
        String str5 = str3;
        String str6 = str2;
        String str7 = str;
        boolean z9 = z5;
        Uri uri3 = uri;
        boolean z10 = z4;
        boolean z11 = z3;
        Uri uri4 = uri2;
        this(uri3, str7, str6, uri4, str5, anonymousClass17U2, z8, z7, str4, z11, z10, z9, map, AnonymousClass1Dy.AUDIO_VIDEO.toString(), z6);
    }

    public VideoSource(Parcel parcel) {
        ClassLoader classLoader = VideoSource.class.getClassLoader();
        this.f14749N = (Uri) parcel.readParcelable(classLoader);
        this.f14750O = parcel.readString();
        this.f14744I = parcel.readString();
        this.f14747L = (Uri) parcel.readParcelable(classLoader);
        this.f14745J = parcel.readString();
        this.f14751P = AnonymousClass17U.valueOf(parcel.readString());
        boolean z = false;
        this.f14739D = parcel.readByte() == (byte) 1;
        this.f14740E = parcel.readByte() == (byte) 1;
        this.f14748M = parcel.readString();
        int readInt = parcel.readInt();
        this.f14743H = new HashMap();
        for (int i = 0; i < readInt; i++) {
            this.f14743H.put(parcel.readString(), parcel.readString());
        }
        this.f14741F = parcel.readByte() == (byte) 1;
        this.f14742G = parcel.readByte() == (byte) 1;
        this.f14738C = parcel.readByte() == (byte) 1;
        this.f14746K = parcel.readString();
        if (parcel.readByte() == (byte) 1) {
            z = true;
        }
        this.f14737B = z;
    }

    /* renamed from: A */
    public final boolean m9474A() {
        return AnonymousClass17U.m9472B(this.f14751P);
    }

    /* renamed from: B */
    public final boolean m9475B() {
        Uri uri = this.f14749N;
        if (uri != null && uri.toString().contains("live-dash") && this.f14751P != AnonymousClass17U.DASH_LIVE) {
            return false;
        }
        if (this.f14749N == null && TextUtils.isEmpty(this.f14744I)) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    private static boolean m9473B(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || obj.equals(obj2) == null) {
                return null;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof VideoSource)) {
                return false;
            }
            VideoSource videoSource = (VideoSource) obj;
            if (this.f14751P != videoSource.f14751P || !m9473B(this.f14749N, videoSource.f14749N) || !m9473B(this.f14750O, videoSource.f14750O)) {
                z = false;
            }
        }
        return z;
    }

    public final int hashCode() {
        int hashCode = this.f14751P.hashCode() * 31;
        String str = this.f14750O;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Uri uri = this.f14749N;
        if (uri != null) {
            i = uri.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        Object obj;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Type: ");
        stringBuilder.append(this.f14751P);
        if (this.f14750O != null) {
            stringBuilder.append("\n\tId: ");
            stringBuilder.append(this.f14750O);
        }
        if (this.f14749N != null) {
            stringBuilder.append("\n\tUri: ");
            stringBuilder.append(this.f14749N);
        }
        if (this.f14745J != null) {
            stringBuilder.append("\n\tOrigin: ");
            stringBuilder.append(this.f14745J);
        }
        stringBuilder.append("\n\tDashMPD: ");
        String str = this.f14744I;
        if (str == null) {
            obj = "NULL";
        } else {
            obj = Integer.valueOf(str.length());
        }
        stringBuilder.append(obj);
        if (this.f14747L != null) {
            stringBuilder.append("\n\tSubtitle: ");
            stringBuilder.append(this.f14747L);
        }
        stringBuilder.append("\n\tisLowLatency: ");
        stringBuilder.append(this.f14739D);
        stringBuilder.append("\n\tisPredictiveDashPlayback: ");
        stringBuilder.append(this.f14740E);
        stringBuilder.append("\n\tisSpherical: ");
        stringBuilder.append(this.f14741F);
        stringBuilder.append("\n\tisSponsored: ");
        stringBuilder.append(this.f14742G);
        stringBuilder.append("\n\tisLiveTraceEnabled: ");
        stringBuilder.append(this.f14738C);
        stringBuilder.append("\n\trenderMode: ");
        stringBuilder.append(this.f14746K);
        stringBuilder.append("\n\tisBroadcast: ");
        stringBuilder.append(this.f14737B);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f14749N, 0);
        parcel.writeString(this.f14750O);
        parcel.writeString(this.f14744I);
        parcel.writeParcelable(this.f14747L, 0);
        parcel.writeString(this.f14745J);
        parcel.writeString(this.f14751P.name());
        parcel.writeByte(this.f14739D);
        parcel.writeByte(this.f14740E);
        parcel.writeString(this.f14748M);
        parcel.writeInt(this.f14743H.size());
        for (Entry entry : this.f14743H.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeByte(this.f14741F);
        parcel.writeByte(this.f14742G);
        parcel.writeByte(this.f14738C);
        parcel.writeString(this.f14746K);
        parcel.writeByte(this.f14737B);
    }
}
