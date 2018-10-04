package com.facebook;

import X.AnonymousClass0FG;
import X.AnonymousClass19W;
import X.AnonymousClass19X;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public final class AccessToken implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass19X();
    /* renamed from: J */
    private static final AnonymousClass19W f2836J = AnonymousClass19W.FACEBOOK_APPLICATION_WEB;
    /* renamed from: K */
    private static final Date f2837K = new Date(Long.MAX_VALUE);
    /* renamed from: L */
    private static final Date f2838L = new Date();
    /* renamed from: B */
    public final String f2839B;
    /* renamed from: C */
    public final Set f2840C;
    /* renamed from: D */
    public final Date f2841D;
    /* renamed from: E */
    public final Date f2842E;
    /* renamed from: F */
    public final Set f2843F;
    /* renamed from: G */
    public final AnonymousClass19W f2844G;
    /* renamed from: H */
    public final String f2845H;
    /* renamed from: I */
    public final String f2846I;

    public final int describeContents() {
        return 0;
    }

    public AccessToken(Parcel parcel) {
        this.f2841D = new Date(parcel.readLong());
        Collection arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f2843F = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f2840C = Collections.unmodifiableSet(new HashSet(arrayList));
        this.f2845H = parcel.readString();
        this.f2844G = AnonymousClass19W.valueOf(parcel.readString());
        this.f2842E = new Date(parcel.readLong());
        this.f2839B = parcel.readString();
        this.f2846I = parcel.readString();
    }

    public AccessToken(String str, String str2) {
        this(str, AnonymousClass0FG.f2096C, str2, null, null, AnonymousClass19W.CLIENT_TOKEN, null, null);
    }

    public AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, AnonymousClass19W anonymousClass19W, Date date, Date date2) {
        if (date == null) {
            date = f2837K;
        }
        this.f2841D = date;
        this.f2843F = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        this.f2840C = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        this.f2845H = str;
        if (anonymousClass19W == null) {
            anonymousClass19W = f2836J;
        }
        this.f2844G = anonymousClass19W;
        if (date2 == null) {
            date2 = f2838L;
        }
        this.f2842E = date2;
        this.f2839B = str2;
        this.f2846I = str3;
    }

    /* renamed from: B */
    public static AccessToken m2348B(AccessToken accessToken, Bundle bundle) {
        if (accessToken.f2844G == AnonymousClass19W.FACEBOOK_APPLICATION_WEB || accessToken.f2844G == AnonymousClass19W.FACEBOOK_APPLICATION_NATIVE || accessToken.f2844G == AnonymousClass19W.FACEBOOK_APPLICATION_SERVICE) {
            Date C = m2349C(bundle, new Date(0));
            Object string = bundle.getString("access_token");
            if (!TextUtils.isEmpty(string)) {
                return new AccessToken(string, accessToken.f2839B, accessToken.f2846I, accessToken.f2843F, accessToken.f2840C, accessToken.f2844G, C, new Date());
            }
        }
        return null;
    }

    /* renamed from: C */
    public static java.util.Date m2349C(android.os.Bundle r6, java.util.Date r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r2 = 0;
        if (r6 != 0) goto L_0x0004;
    L_0x0003:
        return r2;
    L_0x0004:
        r0 = "expires_in";
        r1 = r6.get(r0);
        r0 = r1 instanceof java.lang.Long;
        if (r0 == 0) goto L_0x0015;
    L_0x000e:
        r1 = (java.lang.Long) r1;
        r5 = r1.longValue();
        goto L_0x001f;
    L_0x0015:
        r0 = r1 instanceof java.lang.String;
        if (r0 == 0) goto L_0x0003;
    L_0x0019:
        r1 = (java.lang.String) r1;	 Catch:{ NumberFormatException -> 0x003e }
        r5 = java.lang.Long.parseLong(r1);	 Catch:{ NumberFormatException -> 0x003e }
    L_0x001f:
        r0 = 0;	 Catch:{ NumberFormatException -> 0x003e }
        r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));	 Catch:{ NumberFormatException -> 0x003e }
        if (r0 != 0) goto L_0x0030;	 Catch:{ NumberFormatException -> 0x003e }
    L_0x0025:
        r2 = new java.util.Date;
        r0 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r2.<init>(r0);
        return r2;
    L_0x0030:
        r4 = new java.util.Date;
        r2 = r7.getTime();
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r5 = r5 * r0;
        r2 = r2 + r5;
        r4.<init>(r2);
        return r4;
    L_0x003e:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.AccessToken.C(android.os.Bundle, java.util.Date):java.util.Date");
    }

    /* renamed from: D */
    private String m2350D() {
        return this.f2845H == null ? "null" : "ACCESS_TOKEN_REMOVED";
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
        r1 = r4 instanceof com.facebook.AccessToken;
        r0 = 0;
        if (r1 != 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r4 = (com.facebook.AccessToken) r4;
        r1 = r3.f2841D;
        r0 = r4.f2841D;
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0060;
    L_0x0016:
        r1 = r3.f2843F;
        r0 = r4.f2843F;
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0060;
    L_0x0020:
        r1 = r3.f2840C;
        r0 = r4.f2840C;
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0060;
    L_0x002a:
        r1 = r3.f2845H;
        r0 = r4.f2845H;
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0060;
    L_0x0034:
        r1 = r3.f2844G;
        r0 = r4.f2844G;
        if (r1 != r0) goto L_0x0060;
    L_0x003a:
        r1 = r3.f2842E;
        r0 = r4.f2842E;
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0060;
    L_0x0044:
        r1 = r3.f2839B;
        if (r1 != 0) goto L_0x004d;
    L_0x0048:
        r0 = r4.f2839B;
        if (r0 != 0) goto L_0x0060;
    L_0x004c:
        goto L_0x0055;
    L_0x004d:
        r0 = r4.f2839B;
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0060;
    L_0x0055:
        r1 = r3.f2846I;
        r0 = r4.f2846I;
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0060;
    L_0x005f:
        goto L_0x0003;
    L_0x0060:
        r2 = 0;
        goto L_0x0003;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.AccessToken.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (((((((((((527 + this.f2841D.hashCode()) * 31) + this.f2843F.hashCode()) * 31) + this.f2840C.hashCode()) * 31) + this.f2845H.hashCode()) * 31) + this.f2844G.hashCode()) * 31) + this.f2842E.hashCode()) * 31;
        String str = this.f2839B;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f2846I.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{AccessToken");
        stringBuilder.append(" token:");
        stringBuilder.append(m2350D());
        stringBuilder.append(" permissions:");
        if (this.f2843F == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append("[");
            stringBuilder.append(TextUtils.join(", ", this.f2843F));
            stringBuilder.append("]");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f2841D.getTime());
        parcel.writeStringList(new ArrayList(this.f2843F));
        parcel.writeStringList(new ArrayList(this.f2840C));
        parcel.writeString(this.f2845H);
        parcel.writeString(this.f2844G.name());
        parcel.writeLong(this.f2842E.getTime());
        parcel.writeString(this.f2839B);
        parcel.writeString(this.f2846I);
    }
}
