package X;

import android.content.Context;

/* renamed from: X.5e4 */
public final class AnonymousClass5e4 {
    /* renamed from: D */
    public static final String[] f67757D = new String[]{"_id", "contact_id", "deleted", "mimetype", "data1", "data2", "data3"};
    /* renamed from: B */
    private final AnonymousClass5eL f67758B;
    /* renamed from: C */
    private final Context f67759C;

    public AnonymousClass5e4(Context context, AnonymousClass5eL anonymousClass5eL) {
        this.f67759C = context;
        this.f67758B = anonymousClass5eL;
    }

    /* renamed from: A */
    public final X.AnonymousClass6HC m28179A() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r10 = this;
        r1 = r10.f67759C;
        r0 = "android.permission.READ_CONTACTS";
        r0 = r1.checkCallingOrSelfPermission(r0);
        r3 = 0;
        if (r0 == 0) goto L_0x000c;
    L_0x000b:
        return r3;
    L_0x000c:
        r0 = r10.f67759C;	 Catch:{ Exception -> 0x0027 }
        r4 = r0.getContentResolver();	 Catch:{ Exception -> 0x0027 }
        r5 = android.provider.ContactsContract.RawContactsEntity.CONTENT_URI;	 Catch:{ Exception -> 0x0027 }
        r6 = f67757D;	 Catch:{ Exception -> 0x0027 }
        r7 = 0;	 Catch:{ Exception -> 0x0027 }
        r8 = 0;	 Catch:{ Exception -> 0x0027 }
        r9 = "contact_id";	 Catch:{ Exception -> 0x0027 }
        r1 = r4.query(r5, r6, r7, r8, r9);	 Catch:{ Exception -> 0x0027 }
        if (r1 != 0) goto L_0x0021;	 Catch:{ Exception -> 0x0027 }
    L_0x0020:
        goto L_0x000b;	 Catch:{ Exception -> 0x0027 }
    L_0x0021:
        r0 = new X.6HC;	 Catch:{ Exception -> 0x0028 }
        r0.<init>(r1);	 Catch:{ Exception -> 0x0028 }
        return r0;	 Catch:{ Exception -> 0x0028 }
    L_0x0027:
        r1 = r3;
    L_0x0028:
        if (r1 == 0) goto L_0x002d;
    L_0x002a:
        r1.close();
    L_0x002d:
        r2 = new android.os.Bundle;
        r0 = 1;
        r2.<init>(r0);
        r1 = "failure_reason";
        r0 = "contacts_iterator_cursor_null";
        r2.putString(r1, r0);
        r0 = r10.f67758B;
        r0.m28181B(r2);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.5e4.A():X.6HC");
    }
}
