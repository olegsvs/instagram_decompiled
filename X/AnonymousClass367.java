package X;

import com.facebook.C0164R;

/* renamed from: X.367 */
public final class AnonymousClass367 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass36A f37791B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0IJ f37792C;
    /* renamed from: D */
    public final /* synthetic */ String f37793D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0Cm f37794E;

    public AnonymousClass367(AnonymousClass36A anonymousClass36A, String str, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0IJ anonymousClass0IJ) {
        this.f37791B = anonymousClass36A;
        this.f37793D = str;
        this.f37794E = anonymousClass0Cm;
        this.f37792C = anonymousClass0IJ;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        AnonymousClass367 anonymousClass367 = this;
        int I = AnonymousClass0cQ.I(this, -389704144);
        String B = AnonymousClass35u.m18504B(anonymousClass0Q6, this.f37792C.getString(C0164R.string.request_error));
        AnonymousClass36A anonymousClass36A = this.f37791B;
        String str = this.f37793D;
        AnonymousClass0Cn anonymousClass0Cn = this.f37794E;
        String str2 = B;
        AnonymousClass33Z.m18342G(anonymousClass36A.f37800D, anonymousClass36A.f37803G, "suggested_category", str2, null, null, AnonymousClass0db.C().G("page_name", str), AnonymousClass0a2.I(anonymousClass0Cn));
        AnonymousClass33X anonymousClass33X = anonymousClass36A.f37801E;
        if (anonymousClass33X != null) {
            AnonymousClass33X.m18323B(anonymousClass33X, anonymousClass36A.f37802F, "fetch_data_error", AnonymousClass33Y.m18331F(str, B));
        }
        anonymousClass367.f37791B.f37799C.Cm(anonymousClass367.f37793D, B);
        AnonymousClass0cQ.H(anonymousClass367, 1126467654, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r16) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r15 = this;
        r5 = r16;
        r0 = 1114546704; // 0x426ea210 float:59.658264 double:5.50659237E-315;
        r3 = r15;
        r2 = X.AnonymousClass0cQ.I(r15, r0);
        r5 = (X.AnonymousClass2Xk) r5;
        r0 = 367948494; // 0x15ee72ce float:9.6308564E-26 double:1.817907103E-315;
        r4 = X.AnonymousClass0cQ.I(r15, r0);
        r6 = r15.f37791B;
        r8 = r15.f37793D;
        r9 = r15.f37794E;
        r1 = 0;
        r12 = new java.io.StringWriter;	 Catch:{ IOException -> 0x0089 }
        r12.<init>();	 Catch:{ IOException -> 0x0089 }
        r0 = X.AnonymousClass0Lm.f3274B;	 Catch:{ IOException -> 0x0089 }
        r10 = r0.createGenerator(r12);	 Catch:{ IOException -> 0x0089 }
        r10.writeStartObject();	 Catch:{ IOException -> 0x0089 }
        r0 = r5.f31197B;	 Catch:{ IOException -> 0x0089 }
        if (r0 == 0) goto L_0x007e;	 Catch:{ IOException -> 0x0089 }
    L_0x002c:
        r0 = "categories";	 Catch:{ IOException -> 0x0089 }
        r10.writeFieldName(r0);	 Catch:{ IOException -> 0x0089 }
        r10.writeStartArray();	 Catch:{ IOException -> 0x0089 }
        r0 = r5.f31197B;	 Catch:{ IOException -> 0x0089 }
        r13 = r0.iterator();	 Catch:{ IOException -> 0x0089 }
    L_0x003a:
        r0 = r13.hasNext();	 Catch:{ IOException -> 0x0089 }
        if (r0 == 0) goto L_0x007b;	 Catch:{ IOException -> 0x0089 }
    L_0x0040:
        r11 = r13.next();	 Catch:{ IOException -> 0x0089 }
        r11 = (X.AnonymousClass2Xj) r11;	 Catch:{ IOException -> 0x0089 }
        if (r11 == 0) goto L_0x003a;	 Catch:{ IOException -> 0x0089 }
    L_0x0048:
        r10.writeStartObject();	 Catch:{ IOException -> 0x0089 }
        r0 = r11.f31193B;	 Catch:{ IOException -> 0x0089 }
        if (r0 == 0) goto L_0x0056;	 Catch:{ IOException -> 0x0089 }
    L_0x004f:
        r7 = "category_id";	 Catch:{ IOException -> 0x0089 }
        r0 = r11.f31193B;	 Catch:{ IOException -> 0x0089 }
        r10.writeStringField(r7, r0);	 Catch:{ IOException -> 0x0089 }
    L_0x0056:
        r0 = r11.f31194C;	 Catch:{ IOException -> 0x0089 }
        if (r0 == 0) goto L_0x0061;	 Catch:{ IOException -> 0x0089 }
    L_0x005a:
        r7 = "category_name";	 Catch:{ IOException -> 0x0089 }
        r0 = r11.f31194C;	 Catch:{ IOException -> 0x0089 }
        r10.writeStringField(r7, r0);	 Catch:{ IOException -> 0x0089 }
    L_0x0061:
        r0 = r11.f31195D;	 Catch:{ IOException -> 0x0089 }
        if (r0 == 0) goto L_0x006c;	 Catch:{ IOException -> 0x0089 }
    L_0x0065:
        r7 = "super_cat_id";	 Catch:{ IOException -> 0x0089 }
        r0 = r11.f31195D;	 Catch:{ IOException -> 0x0089 }
        r10.writeStringField(r7, r0);	 Catch:{ IOException -> 0x0089 }
    L_0x006c:
        r0 = r11.f31196E;	 Catch:{ IOException -> 0x0089 }
        if (r0 == 0) goto L_0x0077;	 Catch:{ IOException -> 0x0089 }
    L_0x0070:
        r7 = "super_cat_name";	 Catch:{ IOException -> 0x0089 }
        r0 = r11.f31196E;	 Catch:{ IOException -> 0x0089 }
        r10.writeStringField(r7, r0);	 Catch:{ IOException -> 0x0089 }
    L_0x0077:
        r10.writeEndObject();	 Catch:{ IOException -> 0x0089 }
        goto L_0x003a;	 Catch:{ IOException -> 0x0089 }
    L_0x007b:
        r10.writeEndArray();	 Catch:{ IOException -> 0x0089 }
    L_0x007e:
        r10.writeEndObject();	 Catch:{ IOException -> 0x0089 }
        r10.close();	 Catch:{ IOException -> 0x0089 }
        r10 = r12.toString();	 Catch:{ IOException -> 0x0089 }
        goto L_0x008a;	 Catch:{ IOException -> 0x0089 }
    L_0x0089:
        r10 = r1;
    L_0x008a:
        r7 = X.AnonymousClass0db.C();
        r0 = "suggested_category_name";
        r14 = r7.G(r0, r10);
        r7 = X.AnonymousClass0db.C();
        r0 = "page_name";
        r15 = r7.G(r0, r8);
        r10 = r6.f37800D;
        r11 = r6.f37803G;
        r12 = "suggested_category";
        r13 = 0;
        r16 = X.AnonymousClass0a2.I(r9);
        X.AnonymousClass33Z.m18341F(r10, r11, r12, r13, r14, r15, r16);
        r7 = r6.f37801E;
        if (r7 == 0) goto L_0x00bb;
    L_0x00b0:
        r6 = r6.f37802F;
        r1 = X.AnonymousClass33Y.m18331F(r8, r1);
        r0 = "fetch_data";
        X.AnonymousClass33X.m18323B(r7, r6, r0, r1);
    L_0x00bb:
        r0 = r3.f37791B;
        r1 = r0.f37799C;
        r0 = r3.f37793D;
        r1.Dm(r5, r0);
        r0 = 2019340684; // 0x785cb18c float:1.7904787E34 double:9.97686859E-315;
        X.AnonymousClass0cQ.H(r3, r0, r4);
        r0 = 1655274655; // 0x62a97c9f float:1.5632398E21 double:8.178143415E-315;
        X.AnonymousClass0cQ.H(r3, r0, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.367.onSuccess(java.lang.Object):void");
    }
}
