package X;

/* renamed from: X.5hQ */
public final class AnonymousClass5hQ {
    /* renamed from: B */
    public static java.lang.String m28282B(java.util.List r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = new java.io.StringWriter;	 Catch:{ IOException -> 0x00b6 }
        r3.<init>();	 Catch:{ IOException -> 0x00b6 }
        r0 = X.AnonymousClass0Lm.f3274B;	 Catch:{ IOException -> 0x00b6 }
        r2 = r0.createGenerator(r3);	 Catch:{ IOException -> 0x00b6 }
        r2.writeStartArray();	 Catch:{ IOException -> 0x00b6 }
        r5 = r5.iterator();	 Catch:{ IOException -> 0x00b6 }
    L_0x0012:
        r0 = r5.hasNext();	 Catch:{ IOException -> 0x00b6 }
        if (r0 == 0) goto L_0x00ab;	 Catch:{ IOException -> 0x00b6 }
    L_0x0018:
        r4 = r5.next();	 Catch:{ IOException -> 0x00b6 }
        r4 = (X.AnonymousClass5hO) r4;	 Catch:{ IOException -> 0x00b6 }
        r2.writeStartObject();	 Catch:{ IOException -> 0x00b6 }
        r0 = r4.f68228H;	 Catch:{ IOException -> 0x00b6 }
        if (r0 == 0) goto L_0x002c;	 Catch:{ IOException -> 0x00b6 }
    L_0x0025:
        r1 = "record_id";	 Catch:{ IOException -> 0x00b6 }
        r0 = r4.f68228H;	 Catch:{ IOException -> 0x00b6 }
        r2.writeStringField(r1, r0);	 Catch:{ IOException -> 0x00b6 }
    L_0x002c:
        r0 = r4.f68223C;	 Catch:{ IOException -> 0x00b6 }
        if (r0 == 0) goto L_0x0037;	 Catch:{ IOException -> 0x00b6 }
    L_0x0030:
        r1 = "first_name";	 Catch:{ IOException -> 0x00b6 }
        r0 = r4.f68223C;	 Catch:{ IOException -> 0x00b6 }
        r2.writeStringField(r1, r0);	 Catch:{ IOException -> 0x00b6 }
    L_0x0037:
        r0 = r4.f68225E;	 Catch:{ IOException -> 0x00b6 }
        if (r0 == 0) goto L_0x0042;	 Catch:{ IOException -> 0x00b6 }
    L_0x003b:
        r1 = "last_name";	 Catch:{ IOException -> 0x00b6 }
        r0 = r4.f68225E;	 Catch:{ IOException -> 0x00b6 }
        r2.writeStringField(r1, r0);	 Catch:{ IOException -> 0x00b6 }
    L_0x0042:
        r0 = r4.f68222B;	 Catch:{ IOException -> 0x00b6 }
        if (r0 == 0) goto L_0x0069;	 Catch:{ IOException -> 0x00b6 }
    L_0x0046:
        r0 = "email_addresses";	 Catch:{ IOException -> 0x00b6 }
        r2.writeFieldName(r0);	 Catch:{ IOException -> 0x00b6 }
        r2.writeStartArray();	 Catch:{ IOException -> 0x00b6 }
        r0 = r4.f68222B;	 Catch:{ IOException -> 0x00b6 }
        r1 = r0.iterator();	 Catch:{ IOException -> 0x00b6 }
    L_0x0054:
        r0 = r1.hasNext();	 Catch:{ IOException -> 0x00b6 }
        if (r0 == 0) goto L_0x0066;	 Catch:{ IOException -> 0x00b6 }
    L_0x005a:
        r0 = r1.next();	 Catch:{ IOException -> 0x00b6 }
        r0 = (java.lang.String) r0;	 Catch:{ IOException -> 0x00b6 }
        if (r0 == 0) goto L_0x0054;	 Catch:{ IOException -> 0x00b6 }
    L_0x0062:
        r2.writeString(r0);	 Catch:{ IOException -> 0x00b6 }
        goto L_0x0054;	 Catch:{ IOException -> 0x00b6 }
    L_0x0066:
        r2.writeEndArray();	 Catch:{ IOException -> 0x00b6 }
    L_0x0069:
        r0 = r4.f68227G;	 Catch:{ IOException -> 0x00b6 }
        if (r0 == 0) goto L_0x0090;	 Catch:{ IOException -> 0x00b6 }
    L_0x006d:
        r0 = "phone_numbers";	 Catch:{ IOException -> 0x00b6 }
        r2.writeFieldName(r0);	 Catch:{ IOException -> 0x00b6 }
        r2.writeStartArray();	 Catch:{ IOException -> 0x00b6 }
        r0 = r4.f68227G;	 Catch:{ IOException -> 0x00b6 }
        r1 = r0.iterator();	 Catch:{ IOException -> 0x00b6 }
    L_0x007b:
        r0 = r1.hasNext();	 Catch:{ IOException -> 0x00b6 }
        if (r0 == 0) goto L_0x008d;	 Catch:{ IOException -> 0x00b6 }
    L_0x0081:
        r0 = r1.next();	 Catch:{ IOException -> 0x00b6 }
        r0 = (java.lang.String) r0;	 Catch:{ IOException -> 0x00b6 }
        if (r0 == 0) goto L_0x007b;	 Catch:{ IOException -> 0x00b6 }
    L_0x0089:
        r2.writeString(r0);	 Catch:{ IOException -> 0x00b6 }
        goto L_0x007b;	 Catch:{ IOException -> 0x00b6 }
    L_0x008d:
        r2.writeEndArray();	 Catch:{ IOException -> 0x00b6 }
    L_0x0090:
        r0 = r4.f68224D;	 Catch:{ IOException -> 0x00b6 }
        if (r0 == 0) goto L_0x009b;	 Catch:{ IOException -> 0x00b6 }
    L_0x0094:
        r1 = "hash";	 Catch:{ IOException -> 0x00b6 }
        r0 = r4.f68224D;	 Catch:{ IOException -> 0x00b6 }
        r2.writeStringField(r1, r0);	 Catch:{ IOException -> 0x00b6 }
    L_0x009b:
        r0 = r4.f68226F;	 Catch:{ IOException -> 0x00b6 }
        if (r0 == 0) goto L_0x00a6;	 Catch:{ IOException -> 0x00b6 }
    L_0x009f:
        r1 = "modifier";	 Catch:{ IOException -> 0x00b6 }
        r0 = r4.f68226F;	 Catch:{ IOException -> 0x00b6 }
        r2.writeStringField(r1, r0);	 Catch:{ IOException -> 0x00b6 }
    L_0x00a6:
        r2.writeEndObject();	 Catch:{ IOException -> 0x00b6 }
        goto L_0x0012;	 Catch:{ IOException -> 0x00b6 }
    L_0x00ab:
        r2.writeEndArray();	 Catch:{ IOException -> 0x00b6 }
        r2.close();	 Catch:{ IOException -> 0x00b6 }
        r0 = r3.toString();	 Catch:{ IOException -> 0x00b6 }
        return r0;	 Catch:{ IOException -> 0x00b6 }
    L_0x00b6:
        r0 = "";
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.5hQ.B(java.util.List):java.lang.String");
    }
}
