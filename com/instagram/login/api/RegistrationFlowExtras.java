package com.instagram.login.api;

import X.AnonymousClass0Dt;
import X.AnonymousClass0IE;
import X.AnonymousClass0LH;
import X.AnonymousClass0Oh;
import X.AnonymousClass0Pt;
import X.AnonymousClass2Dj;
import X.AnonymousClass2En;
import X.AnonymousClass2FY;
import X.AnonymousClass2FZ;
import X.AnonymousClass2Na;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.phonenumber.model.CountryCodeData;
import java.util.ArrayList;
import java.util.List;

public class RegistrationFlowExtras implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2Dj();
    /* renamed from: B */
    public boolean f27649B;
    /* renamed from: C */
    public long f27650C;
    /* renamed from: D */
    public String f27651D;
    /* renamed from: E */
    public CountryCodeData f27652E;
    /* renamed from: F */
    public String f27653F;
    /* renamed from: G */
    public String f27654G;
    /* renamed from: H */
    public String f27655H;
    /* renamed from: I */
    public boolean f27656I;
    /* renamed from: J */
    public String f27657J;
    /* renamed from: K */
    public boolean f27658K;
    /* renamed from: L */
    public String f27659L;
    /* renamed from: M */
    public String f27660M;
    /* renamed from: N */
    public boolean f27661N;
    /* renamed from: O */
    public boolean f27662O;
    /* renamed from: P */
    public String f27663P;
    /* renamed from: Q */
    public String f27664Q;
    /* renamed from: R */
    public String f27665R;
    /* renamed from: S */
    public String f27666S;
    /* renamed from: T */
    public String f27667T;
    /* renamed from: U */
    public String f27668U;
    /* renamed from: V */
    public boolean f27669V;
    /* renamed from: W */
    public AnonymousClass2FZ f27670W;
    /* renamed from: X */
    public String f27671X;
    /* renamed from: Y */
    public String f27672Y;
    /* renamed from: Z */
    public List f27673Z;
    /* renamed from: a */
    public List f27674a;

    public final int describeContents() {
        return 0;
    }

    public RegistrationFlowExtras(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.f27652E = (CountryCodeData) parcel.readParcelable(classLoader);
        this.f27667T = parcel.readString();
        this.f27666S = parcel.readString();
        this.f27655H = parcel.readString();
        this.f27664Q = parcel.readString();
        this.f27672Y = parcel.readString();
        this.f27665R = parcel.readString();
        this.f27651D = parcel.readString();
        this.f27657J = parcel.readString();
        this.f27660M = parcel.readString();
        this.f27659L = parcel.readString();
        this.f27671X = parcel.readString();
        boolean z = true;
        this.f27658K = parcel.readByte() != (byte) 0;
        this.f27669V = parcel.readByte() != (byte) 0;
        this.f27649B = parcel.readByte() != (byte) 0;
        this.f27661N = parcel.readByte() != (byte) 0;
        List arrayList = new ArrayList();
        this.f27673Z = arrayList;
        parcel.readStringList(arrayList);
        List<String> arrayList2 = new ArrayList();
        parcel.readStringList(arrayList2);
        this.f27674a = new ArrayList(arrayList2.size());
        for (String B : arrayList2) {
            this.f27674a.add(AnonymousClass2En.m14795B(B));
        }
        int readInt = parcel.readInt();
        if (readInt >= 0) {
            this.f27670W = new AnonymousClass2FZ();
            for (int i = 0; i < readInt; i++) {
                List arrayList3 = new ArrayList();
                parcel.readList(arrayList3, classLoader);
                this.f27670W.f28060B.add(new AnonymousClass2FY(arrayList3));
            }
        }
        this.f27654G = parcel.readString();
        this.f27653F = parcel.readString();
        if (parcel.readByte() == (byte) 0) {
            z = false;
        }
        this.f27656I = z;
    }

    /* renamed from: A */
    public final AnonymousClass0Pt m14744A(Context context, AnonymousClass0Pt anonymousClass0Pt) {
        AnonymousClass0LH.E(context);
        if (!TextUtils.isEmpty(this.f27655H)) {
            anonymousClass0Pt.D("email", AnonymousClass0IE.F(this.f27655H, JsonProperty.USE_DEFAULT_NAME));
        }
        String str = this.f27672Y;
        String str2 = JsonProperty.USE_DEFAULT_NAME;
        anonymousClass0Pt.D("username", AnonymousClass0IE.F(str, str2));
        anonymousClass0Pt.D("password", AnonymousClass0IE.F(this.f27665R, str2));
        if (!TextUtils.isEmpty(this.f27666S)) {
            anonymousClass0Pt.D("phone_number", AnonymousClass0IE.F(this.f27666S, str2));
        }
        anonymousClass0Pt.D("device_id", AnonymousClass0IE.F(AnonymousClass0Dt.B(context), str2));
        anonymousClass0Pt.D("guid", AnonymousClass0IE.F(AnonymousClass0Dt.f1941C.A(context), str2));
        anonymousClass0Pt.D("first_name", AnonymousClass0IE.F(this.f27664Q, str2));
        anonymousClass0Pt.D("force_sign_up_code", AnonymousClass0IE.F(this.f27657J, str2));
        if (!TextUtils.isEmpty(this.f27651D)) {
            anonymousClass0Pt.D("verification_code", AnonymousClass0IE.F(this.f27651D, str2));
        }
        if (this.f27669V) {
            anonymousClass0Pt.D("skip_email", "true");
        }
        if (this.f27649B) {
            anonymousClass0Pt.D("allow_contacts_sync", "true");
        }
        if (this.f27661N) {
            anonymousClass0Pt.D("has_sms_consent", "true");
        }
        if (this.f27662O) {
            anonymousClass0Pt.D("is_appverify_flow", "true");
        }
        if (this.f27656I) {
            anonymousClass0Pt.D("force_create_account", "true");
        }
        if (!TextUtils.isEmpty(this.f27659L)) {
            anonymousClass0Pt.D("gdpr_s", this.f27659L);
        }
        if (!TextUtils.isEmpty(this.f27660M)) {
            anonymousClass0Pt.D("id_token", this.f27660M);
        }
        if (!TextUtils.isEmpty(this.f27671X)) {
            anonymousClass0Pt.D("tos_version", this.f27671X);
        }
        if (this.f27670W != null) {
            StringBuilder stringBuilder = new StringBuilder();
            for (List<Integer> it : this.f27670W.m14842A()) {
                for (Integer num : it) {
                    stringBuilder.append(num.toString());
                    stringBuilder.append(",");
                }
                if (stringBuilder.length() > 0) {
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                }
                stringBuilder.append("|");
            }
            if (stringBuilder.length() > 0) {
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }
            anonymousClass0Pt.D("qs_stamp", stringBuilder.toString());
        }
        String str3 = this.f27654G;
        if (str3 != null) {
            anonymousClass0Pt.D("sn_result", str3);
        }
        str3 = this.f27653F;
        if (str3 != null) {
            anonymousClass0Pt.D("sn_nonce", str3);
        }
        anonymousClass0Pt.O(new String[]{"profile_pic"});
        return anonymousClass0Pt;
    }

    /* renamed from: B */
    public final X.AnonymousClass2Na m14745B() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = 0;
        r1 = r2.f27663P;	 Catch:{ IllegalArgumentException -> 0x000c }
        if (r1 == 0) goto L_0x000b;	 Catch:{ IllegalArgumentException -> 0x000c }
    L_0x0005:
        r1 = r2.f27663P;	 Catch:{ IllegalArgumentException -> 0x000c }
        r0 = X.AnonymousClass2Na.valueOf(r1);	 Catch:{ IllegalArgumentException -> 0x000c }
    L_0x000b:
        return r0;	 Catch:{ IllegalArgumentException -> 0x000c }
    L_0x000c:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.login.api.RegistrationFlowExtras.B():X.2Na");
    }

    /* renamed from: B */
    private String[] m14743B() {
        List list = this.f27674a;
        if (list == null) {
            return null;
        }
        String[] strArr = new String[list.size()];
        for (int i = 0; i < this.f27674a.size(); i++) {
            strArr[i] = ((AnonymousClass2En) this.f27674a.get(i)).m14796A();
        }
        return strArr;
    }

    /* renamed from: C */
    public final X.AnonymousClass0Oh m14746C() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = 0;
        r1 = r2.f27668U;	 Catch:{ IllegalArgumentException -> 0x000c }
        if (r1 == 0) goto L_0x000b;	 Catch:{ IllegalArgumentException -> 0x000c }
    L_0x0005:
        r1 = r2.f27668U;	 Catch:{ IllegalArgumentException -> 0x000c }
        r0 = X.AnonymousClass0Oh.valueOf(r1);	 Catch:{ IllegalArgumentException -> 0x000c }
    L_0x000b:
        return r0;	 Catch:{ IllegalArgumentException -> 0x000c }
    L_0x000c:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.login.api.RegistrationFlowExtras.C():X.0Oh");
    }

    /* renamed from: D */
    public final List m14747D() {
        if (this.f27674a == null) {
            this.f27674a = new ArrayList();
        }
        return this.f27674a;
    }

    /* renamed from: E */
    public final RegistrationFlowExtras m14748E(AnonymousClass2Na anonymousClass2Na) {
        this.f27663P = anonymousClass2Na.name();
        return this;
    }

    /* renamed from: F */
    public final RegistrationFlowExtras m14749F(AnonymousClass0Oh anonymousClass0Oh) {
        this.f27668U = anonymousClass0Oh.name();
        return this;
    }

    /* renamed from: G */
    public final Bundle m14750G() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("RegistrationFlowExtras.EXTRA_KEY", this);
        return bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        parcel.writeParcelable(this.f27652E, 0);
        parcel.writeString(this.f27667T);
        parcel.writeString(this.f27666S);
        parcel.writeString(this.f27655H);
        parcel.writeString(this.f27664Q);
        parcel.writeString(this.f27672Y);
        parcel.writeString(this.f27665R);
        parcel.writeString(this.f27651D);
        parcel.writeString(this.f27657J);
        parcel.writeString(this.f27660M);
        parcel.writeString(this.f27659L);
        parcel.writeString(this.f27671X);
        parcel.writeByte((byte) this.f27658K);
        parcel.writeByte((byte) this.f27669V);
        parcel.writeByte((byte) this.f27649B);
        parcel.writeByte((byte) this.f27661N);
        parcel.writeStringList(this.f27673Z);
        parcel.writeStringArray(m14743B());
        AnonymousClass2FZ anonymousClass2FZ = this.f27670W;
        List A = anonymousClass2FZ != null ? anonymousClass2FZ.m14842A() : null;
        int size = A != null ? A.size() : -1;
        parcel.writeInt(size);
        while (i2 < size) {
            parcel.writeList((List) AnonymousClass0LH.E(A.get(i2)));
            i2++;
        }
        parcel.writeString(this.f27654G);
        parcel.writeString(this.f27653F);
        parcel.writeByte((byte) this.f27656I);
    }
}
