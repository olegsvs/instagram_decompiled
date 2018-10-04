package com.facebook.cameracore.assets.model;

import X.AnonymousClass2gu;
import X.AnonymousClass2h1;
import X.AnonymousClass2h2;
import X.AnonymousClass2h3;
import X.AnonymousClass2h9;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.nio.ByteBuffer;
import java.util.List;

public class ARRequestAsset implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2h1();
    /* renamed from: B */
    public final List f32483B;
    /* renamed from: C */
    public final String f32484C;
    /* renamed from: D */
    public final long f32485D;
    /* renamed from: E */
    public final AnonymousClass2gu f32486E;
    /* renamed from: F */
    public final long f32487F;
    /* renamed from: G */
    public final String f32488G;
    /* renamed from: H */
    private final String f32489H;
    /* renamed from: I */
    private final String f32490I;
    /* renamed from: J */
    private final boolean f32491J;

    public final int describeContents() {
        return 0;
    }

    public ARRequestAsset(Parcel parcel) {
        try {
            this.f32486E = new AnonymousClass2gu(ByteBuffer.wrap(parcel.createByteArray()));
            this.f32484C = parcel.readString();
            this.f32488G = parcel.readString();
            this.f32490I = parcel.readString();
            this.f32491J = parcel.readByte() != (byte) 0;
            this.f32489H = parcel.readString();
            this.f32485D = parcel.readLong();
            this.f32487F = parcel.readLong();
            this.f32483B = parcel.createTypedArrayList(ARCapabilityMinVersionModeling.CREATOR);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public ARRequestAsset(String str, String str2, String str3, String str4, String str5, AnonymousClass2h2 anonymousClass2h2, AnonymousClass2h9 anonymousClass2h9, boolean z, String str6, String str7, long j, long j2, AnonymousClass2h3 anonymousClass2h3, List list, int i) {
        AnonymousClass2h3 anonymousClass2h32 = anonymousClass2h3;
        String str8 = str;
        if (anonymousClass2h3 != null) {
            String str9 = str2;
            this.f32486E = new AnonymousClass2gu(str8, str9, str3, anonymousClass2h2, anonymousClass2h9, str7, anonymousClass2h32, i);
            this.f32488G = str5;
            this.f32484C = str4;
            this.f32489H = str6;
            this.f32491J = z;
            this.f32490I = str;
            this.f32485D = j;
            this.f32487F = j2;
            this.f32483B = list;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Compression method must not be null: id=");
        stringBuilder.append(str);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: A */
    public final String m16914A() {
        return this.f32486E.f32457C;
    }

    /* renamed from: B */
    public final String m16915B() {
        return this.f32486E.f32458D;
    }

    /* renamed from: C */
    public final AnonymousClass2h2 m16916C() {
        return this.f32486E.f32461G;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ARRequestAsset)) {
            return false;
        }
        return this.f32486E.f32457C.equals(((ARRequestAsset) obj).f32486E.f32457C);
    }

    public final int hashCode() {
        return this.f32486E.f32457C.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f32486E.m16910C());
        parcel.writeString(this.f32484C);
        parcel.writeString(this.f32488G);
        parcel.writeString(this.f32490I);
        parcel.writeByte(this.f32491J);
        parcel.writeString(this.f32489H);
        parcel.writeLong(this.f32485D);
        parcel.writeLong(this.f32487F);
        parcel.writeTypedList(this.f32483B);
    }
}
