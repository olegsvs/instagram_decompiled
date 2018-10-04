package com.instagram.model.hashtag;

import X.AnonymousClass19o;
import X.AnonymousClass19p;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Hashtag implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass19o();
    /* renamed from: B */
    public boolean f2782B;
    /* renamed from: C */
    public boolean f2783C;
    /* renamed from: D */
    public int f2784D;
    /* renamed from: E */
    public int f2785E;
    /* renamed from: F */
    public String f2786F;
    /* renamed from: G */
    public boolean f2787G;
    /* renamed from: H */
    public boolean f2788H;
    /* renamed from: I */
    public int f2789I;
    /* renamed from: J */
    public String f2790J;
    /* renamed from: K */
    public String f2791K;
    /* renamed from: L */
    public String f2792L;
    /* renamed from: M */
    public String f2793M;
    /* renamed from: N */
    private AnonymousClass19p f2794N = AnonymousClass19p.Unknown;

    public final int describeContents() {
        return 0;
    }

    public Hashtag(Parcel parcel) {
        this.f2793M = parcel.readString();
        this.f2789I = parcel.readInt();
        this.f2786F = parcel.readString();
        this.f2790J = parcel.readString();
        boolean z = true;
        this.f2787G = parcel.readByte() != (byte) 0;
        this.f2794N = (AnonymousClass19p) parcel.readValue(AnonymousClass19p.class.getClassLoader());
        this.f2782B = parcel.readByte() != (byte) 0;
        this.f2783C = parcel.readByte() != (byte) 0;
        if (parcel.readByte() == (byte) 0) {
            z = false;
        }
        this.f2788H = z;
        this.f2791K = parcel.readString();
        this.f2792L = parcel.readString();
    }

    public Hashtag(Hashtag hashtag) {
        this.f2786F = hashtag.f2786F;
        this.f2793M = hashtag.f2793M;
        this.f2789I = hashtag.f2789I;
        this.f2790J = hashtag.f2790J;
        this.f2784D = hashtag.f2784D;
        this.f2785E = hashtag.f2785E;
        this.f2782B = hashtag.f2782B;
        this.f2783C = hashtag.f2783C;
        this.f2787G = hashtag.f2787G;
        this.f2794N = hashtag.f2794N;
        this.f2788H = hashtag.f2788H;
        this.f2791K = hashtag.f2791K;
        this.f2792L = hashtag.f2792L;
    }

    public Hashtag(String str) {
        this.f2793M = str;
    }

    public Hashtag(String str, String str2) {
        this.f2786F = str;
        this.f2793M = str2;
    }

    /* renamed from: A */
    public final AnonymousClass19p m2323A() {
        int i = 1;
        if (this.f2784D != 1) {
            if (this.f2785E != 1) {
                i = 0;
            }
        }
        return AnonymousClass19p.m9701B(i);
    }

    /* renamed from: B */
    public final void m2324B(AnonymousClass19p anonymousClass19p) {
        this.f2794N = anonymousClass19p;
        if (AnonymousClass19p.Following.equals(this.f2794N)) {
            this.f2784D = 1;
            this.f2785E = 1;
            return;
        }
        this.f2784D = 0;
        this.f2785E = 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    Hashtag hashtag = (Hashtag) obj;
                    String str = this.f2793M;
                    if (str != null) {
                        if (!str.equals(hashtag.f2793M)) {
                        }
                    } else if (hashtag.f2793M != null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f2793M;
        return str != null ? str.hashCode() : 0;
    }

    public final String toString() {
        return this.f2786F;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2793M);
        parcel.writeInt(this.f2789I);
        parcel.writeString(this.f2786F);
        parcel.writeString(this.f2790J);
        parcel.writeByte((byte) this.f2787G);
        parcel.writeValue(this.f2794N);
        parcel.writeByte((byte) this.f2782B);
        parcel.writeByte((byte) this.f2783C);
        parcel.writeByte((byte) this.f2788H);
        parcel.writeString(this.f2791K);
        parcel.writeString(this.f2792L);
    }
}
