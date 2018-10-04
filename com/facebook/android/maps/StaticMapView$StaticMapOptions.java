package com.facebook.android.maps;

import X.AnonymousClass0bW;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collections;
import java.util.List;

public class StaticMapView$StaticMapOptions implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass0bW();
    /* renamed from: B */
    public String f6689B;
    /* renamed from: C */
    public String f6690C;
    /* renamed from: D */
    public String f6691D;
    /* renamed from: E */
    public List f6692E = Collections.EMPTY_LIST;
    /* renamed from: F */
    public String f6693F;
    /* renamed from: G */
    public String f6694G;
    /* renamed from: H */
    public float f6695H = 1.0f;
    /* renamed from: I */
    public float f6696I = 1.0f;
    /* renamed from: J */
    public String f6697J;
    /* renamed from: K */
    public String f6698K;
    /* renamed from: L */
    public String f6699L;

    public final int describeContents() {
        return 0;
    }

    public StaticMapView$StaticMapOptions(String str) {
        this.f6697J = str;
    }

    /* renamed from: A */
    public final StaticMapView$StaticMapOptions m5532A() {
        this.f6699L = null;
        this.f6689B = null;
        this.f6698K = null;
        this.f6690C = null;
        this.f6691D = null;
        this.f6693F = null;
        this.f6694G = null;
        this.f6695H = 1.0f;
        this.f6696I = 1.0f;
        this.f6692E.clear();
        return this;
    }

    /* renamed from: B */
    public final StaticMapView$StaticMapOptions m5533B(double d, double d2, String str) {
        String str2;
        StringBuilder stringBuilder = new StringBuilder();
        if (str == null) {
            str2 = JsonProperty.USE_DEFAULT_NAME;
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("color:");
            stringBuilder2.append(str);
            stringBuilder2.append("|");
            str2 = stringBuilder2.toString();
        }
        stringBuilder.append(str2);
        stringBuilder.append(d);
        stringBuilder.append(", ");
        stringBuilder.append(d2);
        this.f6693F = stringBuilder.toString();
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
        r3 = this;
        r2 = 1;
        if (r3 != r4) goto L_0x0004;
    L_0x0003:
        return r2;
    L_0x0004:
        r1 = r4 instanceof com.facebook.android.maps.StaticMapView$StaticMapOptions;
        r0 = 0;
        if (r1 != 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r4 = (com.facebook.android.maps.StaticMapView$StaticMapOptions) r4;
        r1 = r3.f6697J;
        if (r1 != 0) goto L_0x0015;
    L_0x0010:
        r0 = r4.f6697J;
        if (r0 != 0) goto L_0x00b0;
    L_0x0014:
        goto L_0x001d;
    L_0x0015:
        r0 = r4.f6697J;
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x00b0;
    L_0x001d:
        r1 = r3.f6699L;
        if (r1 != 0) goto L_0x0026;
    L_0x0021:
        r0 = r4.f6699L;
        if (r0 != 0) goto L_0x00b0;
    L_0x0025:
        goto L_0x002e;
    L_0x0026:
        r0 = r4.f6699L;
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x00b0;
    L_0x002e:
        r1 = r3.f6689B;
        if (r1 != 0) goto L_0x0037;
    L_0x0032:
        r0 = r4.f6689B;
        if (r0 != 0) goto L_0x00b0;
    L_0x0036:
        goto L_0x003f;
    L_0x0037:
        r0 = r4.f6689B;
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x00b0;
    L_0x003f:
        r1 = r3.f6698K;
        if (r1 != 0) goto L_0x0048;
    L_0x0043:
        r0 = r4.f6698K;
        if (r0 != 0) goto L_0x00b0;
    L_0x0047:
        goto L_0x0050;
    L_0x0048:
        r0 = r4.f6698K;
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x00b0;
    L_0x0050:
        r1 = r3.f6690C;
        if (r1 != 0) goto L_0x0059;
    L_0x0054:
        r0 = r4.f6690C;
        if (r0 != 0) goto L_0x00b0;
    L_0x0058:
        goto L_0x0061;
    L_0x0059:
        r0 = r4.f6690C;
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x00b0;
    L_0x0061:
        r1 = r3.f6691D;
        if (r1 != 0) goto L_0x006a;
    L_0x0065:
        r0 = r4.f6691D;
        if (r0 != 0) goto L_0x00b0;
    L_0x0069:
        goto L_0x0072;
    L_0x006a:
        r0 = r4.f6691D;
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x00b0;
    L_0x0072:
        r1 = r3.f6693F;
        if (r1 != 0) goto L_0x007b;
    L_0x0076:
        r0 = r4.f6693F;
        if (r0 != 0) goto L_0x00b0;
    L_0x007a:
        goto L_0x0083;
    L_0x007b:
        r0 = r4.f6693F;
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x00b0;
    L_0x0083:
        r1 = r3.f6694G;
        if (r1 != 0) goto L_0x008c;
    L_0x0087:
        r0 = r4.f6694G;
        if (r0 != 0) goto L_0x00b0;
    L_0x008b:
        goto L_0x0094;
    L_0x008c:
        r0 = r4.f6694G;
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x00b0;
    L_0x0094:
        r1 = r3.f6695H;
        r0 = r4.f6695H;
        r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1));
        if (r0 != 0) goto L_0x00b0;
    L_0x009c:
        r1 = r3.f6696I;
        r0 = r4.f6696I;
        r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1));
        if (r0 != 0) goto L_0x00b0;
    L_0x00a4:
        r1 = r3.f6692E;
        r0 = r4.f6692E;
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x00b0;
    L_0x00ae:
        goto L_0x0003;
    L_0x00b0:
        r2 = 0;
        goto L_0x0003;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.maps.StaticMapView$StaticMapOptions.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f6697J;
        int i = 0;
        int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
        str = this.f6699L;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.f6689B;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.f6698K;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.f6690C;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.f6691D;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.f6693F;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.f6694G;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((((hashCode + i) * 31) + Float.floatToIntBits(this.f6695H)) * 31) + Float.floatToIntBits(this.f6696I)) * 31) + this.f6692E.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6697J);
        parcel.writeString(this.f6699L);
        parcel.writeString(this.f6689B);
        parcel.writeString(this.f6698K);
        parcel.writeString(this.f6690C);
        parcel.writeString(this.f6691D);
        parcel.writeString(this.f6693F);
        parcel.writeString(this.f6694G);
        parcel.writeFloat(this.f6695H);
        parcel.writeFloat(this.f6696I);
        parcel.writeStringList(this.f6692E);
    }
}
