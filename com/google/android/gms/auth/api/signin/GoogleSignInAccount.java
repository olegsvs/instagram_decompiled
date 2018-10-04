package com.google.android.gms.auth.api.signin;

import X.AnonymousClass1Ew;
import X.AnonymousClass1ye;
import X.AnonymousClass1yf;
import X.AnonymousClass1zC;
import X.AnonymousClass1zh;
import X.AnonymousClass2Sg;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class GoogleSignInAccount extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new AnonymousClass1yf();
    /* renamed from: N */
    private static AnonymousClass1zh f24924N = AnonymousClass2Sg.f30613B;
    /* renamed from: O */
    private static Comparator f24925O = new AnonymousClass1ye();
    /* renamed from: B */
    public String f24926B;
    /* renamed from: C */
    public String f24927C;
    /* renamed from: D */
    public String f24928D;
    /* renamed from: E */
    public String f24929E;
    /* renamed from: F */
    public String f24930F;
    /* renamed from: G */
    public Uri f24931G;
    /* renamed from: H */
    public String f24932H;
    /* renamed from: I */
    public String f24933I;
    /* renamed from: J */
    public String f24934J;
    /* renamed from: K */
    private int f24935K;
    /* renamed from: L */
    private List f24936L;
    /* renamed from: M */
    private long f24937M;

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.f24935K = i;
        this.f24926B = str;
        this.f24934J = str2;
        this.f24929E = str3;
        this.f24930F = str4;
        this.f24931G = uri;
        this.f24932H = str5;
        this.f24937M = j;
        this.f24933I = str6;
        this.f24936L = list;
        this.f24927C = str7;
        this.f24928D = str8;
    }

    /* renamed from: B */
    public static GoogleSignInAccount m13972B(String str) {
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str2);
        Object optString = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        Set hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.optString("tokenId", null);
        String optString4 = jSONObject.optString("email", null);
        String optString5 = jSONObject.optString("displayName", null);
        String optString6 = jSONObject.optString("givenName", null);
        str = jSONObject.optString("familyName", null);
        Long valueOf = Long.valueOf(parseLong);
        String string = jSONObject.getString("obfuscatedIdentifier");
        if (valueOf == null) {
            valueOf = Long.valueOf(f24924N.EG() / 1000);
        }
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, valueOf.longValue(), AnonymousClass1Ew.G(string), new ArrayList((Collection) AnonymousClass1Ew.I(hashSet)), optString6, str);
        googleSignInAccount.f24932H = jSONObject.optString("serverAuthCode", null);
        return googleSignInAccount;
    }

    /* renamed from: C */
    public static final JSONObject m13973C(GoogleSignInAccount googleSignInAccount) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (googleSignInAccount.f24926B != null) {
                jSONObject.put("id", googleSignInAccount.f24926B);
            }
            if (googleSignInAccount.f24934J != null) {
                jSONObject.put("tokenId", googleSignInAccount.f24934J);
            }
            if (googleSignInAccount.f24929E != null) {
                jSONObject.put("email", googleSignInAccount.f24929E);
            }
            if (googleSignInAccount.f24930F != null) {
                jSONObject.put("displayName", googleSignInAccount.f24930F);
            }
            if (googleSignInAccount.f24927C != null) {
                jSONObject.put("givenName", googleSignInAccount.f24927C);
            }
            if (googleSignInAccount.f24928D != null) {
                jSONObject.put("familyName", googleSignInAccount.f24928D);
            }
            if (googleSignInAccount.f24931G != null) {
                jSONObject.put("photoUrl", googleSignInAccount.f24931G.toString());
            }
            if (googleSignInAccount.f24932H != null) {
                jSONObject.put("serverAuthCode", googleSignInAccount.f24932H);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f24937M);
            jSONObject.put("obfuscatedIdentifier", googleSignInAccount.f24933I);
            JSONArray jSONArray = new JSONArray();
            Collections.sort(googleSignInAccount.f24936L, f24925O);
            for (Scope scope : googleSignInAccount.f24936L) {
                jSONArray.put(scope.f24991B);
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        return !(obj instanceof GoogleSignInAccount) ? false : m13973C((GoogleSignInAccount) obj).toString().equals(m13973C(this).toString());
    }

    public final int hashCode() {
        return m13973C(this).toString().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.m14073U(parcel);
        AnonymousClass1zC.m14071S(parcel, 1, this.f24935K);
        AnonymousClass1zC.m14061I(parcel, 2, this.f24926B, false);
        AnonymousClass1zC.m14061I(parcel, 3, this.f24934J, false);
        AnonymousClass1zC.m14061I(parcel, 4, this.f24929E, false);
        AnonymousClass1zC.m14061I(parcel, 5, this.f24930F, false);
        AnonymousClass1zC.m14059G(parcel, 6, this.f24931G, i, false);
        AnonymousClass1zC.m14061I(parcel, 7, this.f24932H, false);
        AnonymousClass1zC.m14055C(parcel, 8, this.f24937M);
        AnonymousClass1zC.m14061I(parcel, 9, this.f24933I, false);
        AnonymousClass1zC.m14072T(parcel, 10, this.f24936L, false);
        AnonymousClass1zC.m14061I(parcel, 11, this.f24927C, false);
        AnonymousClass1zC.m14061I(parcel, 12, this.f24928D, false);
        AnonymousClass1zC.m14054B(parcel, U);
    }
}
