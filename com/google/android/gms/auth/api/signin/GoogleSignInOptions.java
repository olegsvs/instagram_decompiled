package com.google.android.gms.auth.api.signin;

import X.AnonymousClass1hl;
import X.AnonymousClass1ya;
import X.AnonymousClass1yc;
import X.AnonymousClass1yg;
import X.AnonymousClass1yh;
import X.AnonymousClass1zC;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.zzn;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class GoogleSignInOptions extends zza implements AnonymousClass1yh, ReflectedParcelable {
    public static final Creator CREATOR = new AnonymousClass1hl();
    /* renamed from: K */
    public static final GoogleSignInOptions f32143K;
    /* renamed from: L */
    private static Scope f32144L = new Scope("https://www.googleapis.com/auth/games");
    /* renamed from: M */
    public static Comparator f32145M = new AnonymousClass1yg();
    /* renamed from: N */
    public static final Scope f32146N = new Scope("profile");
    /* renamed from: O */
    public static final Scope f32147O = new Scope("openid");
    /* renamed from: B */
    public Account f32148B;
    /* renamed from: C */
    public final ArrayList f32149C;
    /* renamed from: D */
    public final boolean f32150D;
    /* renamed from: E */
    public boolean f32151E;
    /* renamed from: F */
    public String f32152F;
    /* renamed from: G */
    public final boolean f32153G;
    /* renamed from: H */
    public String f32154H;
    /* renamed from: I */
    public ArrayList f32155I;
    /* renamed from: J */
    private int f32156J;

    static {
        Scope scope = new Scope("email");
        AnonymousClass1ya anonymousClass1ya = new AnonymousClass1ya();
        anonymousClass1ya.f24944H.add(f32147O);
        anonymousClass1ya.f24944H.add(f32146N);
        f32143K = anonymousClass1ya.m13974A();
        AnonymousClass1ya anonymousClass1ya2 = new AnonymousClass1ya();
        Scope[] scopeArr = new Scope[0];
        anonymousClass1ya2.f24944H.add(f32144L);
        anonymousClass1ya2.f24944H.addAll(Arrays.asList(scopeArr));
        anonymousClass1ya2.m13974A();
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList arrayList2) {
        this(i, arrayList, account, z, z2, z3, str, str2, m16781C(arrayList2));
    }

    private GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map) {
        this.f32156J = i;
        this.f32149C = arrayList;
        this.f32148B = account;
        this.f32151E = z;
        this.f32150D = z2;
        this.f32153G = z3;
        this.f32152F = str;
        this.f32154H = str2;
        this.f32155I = new ArrayList(map.values());
    }

    /* renamed from: B */
    public static GoogleSignInOptions m16780B(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        Collection hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        Object optString = jSONObject.optString("accountName", null);
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null), new HashMap());
    }

    /* renamed from: C */
    public static Map m16781C(List list) {
        Map hashMap = new HashMap();
        if (list != null) {
            for (zzn zzn : list) {
                hashMap.put(Integer.valueOf(zzn.f24946B), zzn);
            }
        }
        return hashMap;
    }

    /* renamed from: A */
    public final ArrayList m16782A() {
        return new ArrayList(this.f32149C);
    }

    public final boolean equals(java.lang.Object r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r2 = 0;
        if (r4 != 0) goto L_0x0004;
    L_0x0003:
        return r2;
    L_0x0004:
        r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4;	 Catch:{ ClassCastException -> 0x0076 }
        r0 = r3.f32155I;	 Catch:{ ClassCastException -> 0x0076 }
        r0 = r0.size();	 Catch:{ ClassCastException -> 0x0076 }
        if (r0 > 0) goto L_0x0076;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x000e:
        r0 = r4.f32155I;	 Catch:{ ClassCastException -> 0x0076 }
        r0 = r0.size();	 Catch:{ ClassCastException -> 0x0076 }
        if (r0 <= 0) goto L_0x0017;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0016:
        goto L_0x0076;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0017:
        r0 = r3.f32149C;	 Catch:{ ClassCastException -> 0x0076 }
        r1 = r0.size();	 Catch:{ ClassCastException -> 0x0076 }
        r0 = r4.m16782A();	 Catch:{ ClassCastException -> 0x0076 }
        r0 = r0.size();	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 != r0) goto L_0x0076;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0027:
        r1 = r3.f32149C;	 Catch:{ ClassCastException -> 0x0076 }
        r0 = r4.m16782A();	 Catch:{ ClassCastException -> 0x0076 }
        r0 = r1.containsAll(r0);	 Catch:{ ClassCastException -> 0x0076 }
        if (r0 != 0) goto L_0x0034;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0033:
        goto L_0x0076;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0034:
        r0 = r3.f32148B;	 Catch:{ ClassCastException -> 0x0076 }
        if (r0 != 0) goto L_0x003d;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0038:
        r0 = r4.f32148B;	 Catch:{ ClassCastException -> 0x0076 }
        if (r0 != 0) goto L_0x0076;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x003c:
        goto L_0x0047;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x003d:
        r1 = r3.f32148B;	 Catch:{ ClassCastException -> 0x0076 }
        r0 = r4.f32148B;	 Catch:{ ClassCastException -> 0x0076 }
        r0 = r1.equals(r0);	 Catch:{ ClassCastException -> 0x0076 }
        if (r0 == 0) goto L_0x0076;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0047:
        r0 = r3.f32152F;	 Catch:{ ClassCastException -> 0x0076 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ ClassCastException -> 0x0076 }
        if (r0 == 0) goto L_0x0058;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x004f:
        r0 = r4.f32152F;	 Catch:{ ClassCastException -> 0x0076 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ ClassCastException -> 0x0076 }
        if (r0 == 0) goto L_0x0076;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0057:
        goto L_0x0062;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0058:
        r1 = r3.f32152F;	 Catch:{ ClassCastException -> 0x0076 }
        r0 = r4.f32152F;	 Catch:{ ClassCastException -> 0x0076 }
        r0 = r1.equals(r0);	 Catch:{ ClassCastException -> 0x0076 }
        if (r0 == 0) goto L_0x0076;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0062:
        r1 = r3.f32153G;	 Catch:{ ClassCastException -> 0x0076 }
        r0 = r4.f32153G;	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 != r0) goto L_0x0076;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0068:
        r1 = r3.f32151E;	 Catch:{ ClassCastException -> 0x0076 }
        r0 = r4.f32151E;	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 != r0) goto L_0x0076;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x006e:
        r1 = r3.f32150D;	 Catch:{ ClassCastException -> 0x0076 }
        r0 = r4.f32150D;	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 != r0) goto L_0x0076;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0074:
        r0 = 1;	 Catch:{ ClassCastException -> 0x0076 }
        return r0;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0076:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        List arrayList = new ArrayList();
        ArrayList arrayList2 = this.f32149C;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(((Scope) obj).f24991B);
        }
        Collections.sort(arrayList);
        return new AnonymousClass1yc().m13976B(arrayList).m13976B(this.f32148B).m13976B(this.f32152F).m13975A(this.f32153G).m13975A(this.f32151E).m13975A(this.f32150D).f24950B;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.m14073U(parcel);
        AnonymousClass1zC.m14071S(parcel, 1, this.f32156J);
        AnonymousClass1zC.m14072T(parcel, 2, m16782A(), false);
        AnonymousClass1zC.m14059G(parcel, 3, this.f32148B, i, false);
        AnonymousClass1zC.m14063K(parcel, 4, this.f32151E);
        AnonymousClass1zC.m14063K(parcel, 5, this.f32150D);
        AnonymousClass1zC.m14063K(parcel, 6, this.f32153G);
        AnonymousClass1zC.m14061I(parcel, 7, this.f32152F, false);
        AnonymousClass1zC.m14061I(parcel, 8, this.f32154H, false);
        AnonymousClass1zC.m14072T(parcel, 9, this.f32155I, false);
        AnonymousClass1zC.m14054B(parcel, U);
    }
}
