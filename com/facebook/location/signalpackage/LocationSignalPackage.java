package com.facebook.location.signalpackage;

import X.AnonymousClass1kD;
import X.AnonymousClass47d;
import X.AnonymousClass47e;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.cellinfo.GeneralCellInfo;
import com.facebook.location.ImmutableLocation;
import com.facebook.wifiscan.WifiScanResult;
import java.util.List;

public class LocationSignalPackage implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1kD();
    /* renamed from: B */
    public final List f21584B;
    /* renamed from: C */
    public final Float f21585C;
    /* renamed from: D */
    public final Boolean f21586D;
    /* renamed from: E */
    public final List f21587E;
    /* renamed from: F */
    public final List f21588F;
    /* renamed from: G */
    public final Integer f21589G;
    /* renamed from: H */
    public final WifiScanResult f21590H;
    /* renamed from: I */
    public final GeneralCellInfo f21591I;
    /* renamed from: J */
    public final Boolean f21592J;
    /* renamed from: K */
    public final Boolean f21593K;
    /* renamed from: L */
    public final ImmutableLocation f21594L;
    /* renamed from: M */
    public final Integer f21595M;
    /* renamed from: N */
    public final String f21596N;
    /* renamed from: O */
    public final String f21597O;
    /* renamed from: P */
    public final List f21598P;
    /* renamed from: Q */
    public final String f21599Q;
    /* renamed from: R */
    public final String f21600R;
    /* renamed from: S */
    public final String f21601S;
    /* renamed from: T */
    public final Boolean f21602T;
    /* renamed from: U */
    public final List f21603U;

    public final int describeContents() {
        return 0;
    }

    public LocationSignalPackage(AnonymousClass47e anonymousClass47e) {
        this.f21594L = anonymousClass47e.f50527L;
        this.f21599Q = anonymousClass47e.f50532Q;
        this.f21592J = anonymousClass47e.f50525J;
        this.f21590H = anonymousClass47e.f50523H;
        this.f21603U = anonymousClass47e.f50536U;
        this.f21602T = anonymousClass47e.f50535T;
        this.f21591I = anonymousClass47e.f50524I;
        this.f21588F = anonymousClass47e.f50521F;
        this.f21587E = anonymousClass47e.f50520E;
        this.f21586D = anonymousClass47e.f50519D;
        this.f21584B = anonymousClass47e.f50517B;
        this.f21595M = anonymousClass47e.f50528M;
        this.f21598P = anonymousClass47e.f50531P;
        this.f21596N = anonymousClass47e.f50529N;
        this.f21597O = anonymousClass47e.f50530O;
        this.f21601S = anonymousClass47e.f50534S;
        this.f21593K = anonymousClass47e.f50526K;
        this.f21600R = anonymousClass47e.f50533R;
        this.f21589G = anonymousClass47e.f50522G;
        this.f21585C = anonymousClass47e.f50518C;
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
        r5 = (com.facebook.location.signalpackage.LocationSignalPackage) r5;
        r1 = r4.f21594L;
        if (r1 == 0) goto L_0x0021;
    L_0x0018:
        r0 = r5.f21594L;
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x0026;
    L_0x0020:
        goto L_0x0025;
    L_0x0021:
        r0 = r5.f21594L;
        if (r0 == 0) goto L_0x0026;
    L_0x0025:
        return r2;
    L_0x0026:
        r1 = r4.f21599Q;
        if (r1 == 0) goto L_0x0033;
    L_0x002a:
        r0 = r5.f21599Q;
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x0038;
    L_0x0032:
        goto L_0x0025;
    L_0x0033:
        r0 = r5.f21599Q;
        if (r0 == 0) goto L_0x0038;
    L_0x0037:
        goto L_0x0025;
    L_0x0038:
        r1 = r4.f21592J;
        if (r1 == 0) goto L_0x0045;
    L_0x003c:
        r0 = r5.f21592J;
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x004a;
    L_0x0044:
        goto L_0x0025;
    L_0x0045:
        r0 = r5.f21592J;
        if (r0 == 0) goto L_0x004a;
    L_0x0049:
        goto L_0x0025;
    L_0x004a:
        r1 = r4.f21590H;
        if (r1 == 0) goto L_0x0057;
    L_0x004e:
        r0 = r5.f21590H;
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x005c;
    L_0x0056:
        goto L_0x0025;
    L_0x0057:
        r0 = r5.f21590H;
        if (r0 == 0) goto L_0x005c;
    L_0x005b:
        goto L_0x0025;
    L_0x005c:
        r1 = r4.f21603U;
        if (r1 == 0) goto L_0x0069;
    L_0x0060:
        r0 = r5.f21603U;
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x006e;
    L_0x0068:
        goto L_0x0025;
    L_0x0069:
        r0 = r5.f21603U;
        if (r0 == 0) goto L_0x006e;
    L_0x006d:
        goto L_0x0025;
    L_0x006e:
        r1 = r4.f21602T;
        if (r1 == 0) goto L_0x007b;
    L_0x0072:
        r0 = r5.f21602T;
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x0080;
    L_0x007a:
        goto L_0x0025;
    L_0x007b:
        r0 = r5.f21602T;
        if (r0 == 0) goto L_0x0080;
    L_0x007f:
        goto L_0x0025;
    L_0x0080:
        r1 = r4.f21591I;
        if (r1 == 0) goto L_0x008d;
    L_0x0084:
        r0 = r5.f21591I;
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x0092;
    L_0x008c:
        goto L_0x0025;
    L_0x008d:
        r0 = r5.f21591I;
        if (r0 == 0) goto L_0x0092;
    L_0x0091:
        goto L_0x0025;
    L_0x0092:
        r1 = r4.f21588F;
        if (r1 == 0) goto L_0x009f;
    L_0x0096:
        r0 = r5.f21588F;
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x00a4;
    L_0x009e:
        goto L_0x0025;
    L_0x009f:
        r0 = r5.f21588F;
        if (r0 == 0) goto L_0x00a4;
    L_0x00a3:
        goto L_0x0025;
    L_0x00a4:
        r1 = r4.f21587E;
        if (r1 == 0) goto L_0x00b2;
    L_0x00a8:
        r0 = r5.f21587E;
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x00b8;
    L_0x00b0:
        goto L_0x0025;
    L_0x00b2:
        r0 = r5.f21587E;
        if (r0 == 0) goto L_0x00b8;
    L_0x00b6:
        goto L_0x0025;
    L_0x00b8:
        r1 = r4.f21586D;
        if (r1 == 0) goto L_0x00c6;
    L_0x00bc:
        r0 = r5.f21586D;
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x00cc;
    L_0x00c4:
        goto L_0x0025;
    L_0x00c6:
        r0 = r5.f21586D;
        if (r0 == 0) goto L_0x00cc;
    L_0x00ca:
        goto L_0x0025;
    L_0x00cc:
        r1 = r4.f21584B;
        if (r1 == 0) goto L_0x00da;
    L_0x00d0:
        r0 = r5.f21584B;
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x00e0;
    L_0x00d8:
        goto L_0x0025;
    L_0x00da:
        r0 = r5.f21584B;
        if (r0 == 0) goto L_0x00e0;
    L_0x00de:
        goto L_0x0025;
    L_0x00e0:
        r1 = r4.f21595M;
        if (r1 == 0) goto L_0x00ee;
    L_0x00e4:
        r0 = r5.f21595M;
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x00f4;
    L_0x00ec:
        goto L_0x0025;
    L_0x00ee:
        r0 = r5.f21595M;
        if (r0 == 0) goto L_0x00f4;
    L_0x00f2:
        goto L_0x0025;
    L_0x00f4:
        r1 = r4.f21598P;
        if (r1 == 0) goto L_0x0102;
    L_0x00f8:
        r0 = r5.f21598P;
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x0108;
    L_0x0100:
        goto L_0x0025;
    L_0x0102:
        r0 = r5.f21598P;
        if (r0 == 0) goto L_0x0108;
    L_0x0106:
        goto L_0x0025;
    L_0x0108:
        r1 = r4.f21596N;
        if (r1 == 0) goto L_0x0116;
    L_0x010c:
        r0 = r5.f21596N;
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x011c;
    L_0x0114:
        goto L_0x0025;
    L_0x0116:
        r0 = r5.f21596N;
        if (r0 == 0) goto L_0x011c;
    L_0x011a:
        goto L_0x0025;
    L_0x011c:
        r1 = r4.f21597O;
        if (r1 == 0) goto L_0x012a;
    L_0x0120:
        r0 = r5.f21597O;
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x0130;
    L_0x0128:
        goto L_0x0025;
    L_0x012a:
        r0 = r5.f21597O;
        if (r0 == 0) goto L_0x0130;
    L_0x012e:
        goto L_0x0025;
    L_0x0130:
        r1 = r4.f21601S;
        if (r1 == 0) goto L_0x013e;
    L_0x0134:
        r0 = r5.f21601S;
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x0144;
    L_0x013c:
        goto L_0x0025;
    L_0x013e:
        r0 = r5.f21601S;
        if (r0 == 0) goto L_0x0144;
    L_0x0142:
        goto L_0x0025;
    L_0x0144:
        r1 = r4.f21593K;
        if (r1 == 0) goto L_0x0152;
    L_0x0148:
        r0 = r5.f21593K;
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x0158;
    L_0x0150:
        goto L_0x0025;
    L_0x0152:
        r0 = r5.f21593K;
        if (r0 == 0) goto L_0x0158;
    L_0x0156:
        goto L_0x0025;
    L_0x0158:
        r1 = r4.f21600R;
        if (r1 == 0) goto L_0x0166;
    L_0x015c:
        r0 = r5.f21600R;
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x016c;
    L_0x0164:
        goto L_0x0025;
    L_0x0166:
        r0 = r5.f21600R;
        if (r0 == 0) goto L_0x016c;
    L_0x016a:
        goto L_0x0025;
    L_0x016c:
        r1 = r4.f21589G;
        if (r1 == 0) goto L_0x017a;
    L_0x0170:
        r0 = r5.f21589G;
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x0180;
    L_0x0178:
        goto L_0x0025;
    L_0x017a:
        r0 = r5.f21589G;
        if (r0 == 0) goto L_0x0180;
    L_0x017e:
        goto L_0x0025;
    L_0x0180:
        r1 = r4.f21585C;
        if (r1 == 0) goto L_0x018c;
    L_0x0184:
        r0 = r5.f21585C;
        r3 = r1.equals(r0);
        goto L_0x0003;
    L_0x018c:
        r0 = r5.f21585C;
        if (r0 != 0) goto L_0x0192;
    L_0x0190:
        goto L_0x0003;
    L_0x0192:
        r3 = 0;
        goto L_0x0003;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.location.signalpackage.LocationSignalPackage.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ImmutableLocation immutableLocation = this.f21594L;
        int i = 0;
        int hashCode = (immutableLocation != null ? immutableLocation.hashCode() : 0) * 31;
        String str = this.f21599Q;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.f21592J;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        WifiScanResult wifiScanResult = this.f21590H;
        hashCode = (hashCode + (wifiScanResult != null ? wifiScanResult.hashCode() : 0)) * 31;
        List list = this.f21603U;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        bool = this.f21602T;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        GeneralCellInfo generalCellInfo = this.f21591I;
        hashCode = (hashCode + (generalCellInfo != null ? generalCellInfo.hashCode() : 0)) * 31;
        list = this.f21588F;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        list = this.f21587E;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        bool = this.f21586D;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        list = this.f21584B;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Integer num = this.f21595M;
        hashCode = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        list = this.f21598P;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        str = this.f21596N;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f21597O;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f21601S;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        bool = this.f21593K;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.f21600R;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        num = this.f21589G;
        hashCode = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Float f = this.f21585C;
        if (f != null) {
            i = f.hashCode();
        }
        return hashCode + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass47d.H(parcel, this.f21594L);
        parcel.writeString(this.f21599Q);
        AnonymousClass47d.I(parcel, this.f21592J);
        parcel.writeParcelable(this.f21590H, 0);
        parcel.writeTypedList(this.f21603U);
        AnonymousClass47d.I(parcel, this.f21602T);
        parcel.writeParcelable(this.f21591I, 0);
        if (VERSION.SDK_INT >= 17) {
            parcel.writeTypedList(this.f21588F);
        }
        parcel.writeTypedList(this.f21587E);
        AnonymousClass47d.I(parcel, this.f21586D);
        parcel.writeTypedList(this.f21584B);
        AnonymousClass47d.K(parcel, this.f21595M);
        parcel.writeTypedList(this.f21598P);
        parcel.writeString(this.f21596N);
        parcel.writeString(this.f21597O);
        parcel.writeString(this.f21601S);
        AnonymousClass47d.I(parcel, this.f21593K);
        parcel.writeString(this.f21600R);
        AnonymousClass47d.K(parcel, this.f21589G);
        AnonymousClass47d.J(parcel, this.f21585C);
    }
}
