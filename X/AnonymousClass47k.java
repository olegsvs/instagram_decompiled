package X;

import android.content.Context;

/* renamed from: X.47k */
public final class AnonymousClass47k {
    /* renamed from: B */
    public boolean f50555B = false;
    /* renamed from: C */
    private Object f50556C = null;
    /* renamed from: D */
    private Object f50557D = null;

    public AnonymousClass47k(Context context) {
        this.f50555B = m23315D(context);
    }

    /* renamed from: B */
    public static java.lang.String m23313B(X.AnonymousClass47k r5, java.lang.String r6, int r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = 0;
        r3 = r5.m23314C(r7);	 Catch:{ Exception -> 0x001e }
        if (r3 != 0) goto L_0x0008;	 Catch:{ Exception -> 0x001e }
    L_0x0007:
        return r4;	 Catch:{ Exception -> 0x001e }
    L_0x0008:
        r1 = r3.getClass();	 Catch:{ Exception -> 0x001e }
        r2 = 0;	 Catch:{ Exception -> 0x001e }
        r0 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x001e }
        r1 = r1.getDeclaredMethod(r6, r0);	 Catch:{ Exception -> 0x001e }
        r0 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x001e }
        r0 = r1.invoke(r3, r0);	 Catch:{ Exception -> 0x001e }
        r0 = r0.toString();	 Catch:{ Exception -> 0x001e }
        return r0;	 Catch:{ Exception -> 0x001e }
    L_0x001e:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.47k.B(X.47k, java.lang.String, int):java.lang.String");
    }

    /* renamed from: C */
    private Object m23314C(int i) {
        if (i != 0 && i != 1) {
            return null;
        }
        return i == 0 ? this.f50556C : this.f50557D;
    }

    /* renamed from: D */
    private boolean m23315D(android.content.Context r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r8 = this;
        r5 = 0;
        r0 = "android.telephony.MultiSimTelephonyManager";	 Catch:{ ClassNotFoundException -> 0x0057 }
        r6 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0057 }
        r4 = r6.getConstructors();
        r3 = r4.length;
        r1 = 0;
    L_0x000d:
        if (r1 >= r3) goto L_0x0056;
    L_0x000f:
        r7 = r4[r1];
        r0 = r7.getParameterTypes();
        r0 = r0.length;
        r2 = 2;
        if (r0 != r2) goto L_0x0053;
    L_0x0019:
        r1 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0052 }
        r1[r5] = r9;	 Catch:{ Exception -> 0x0052 }
        r0 = java.lang.Integer.valueOf(r5);	 Catch:{ Exception -> 0x0052 }
        r4 = 1;	 Catch:{ Exception -> 0x0052 }
        r1[r4] = r0;	 Catch:{ Exception -> 0x0052 }
        r3 = r7.newInstance(r1);	 Catch:{ Exception -> 0x0052 }
        r1 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0052 }
        r1[r5] = r9;	 Catch:{ Exception -> 0x0052 }
        r0 = java.lang.Integer.valueOf(r4);	 Catch:{ Exception -> 0x0052 }
        r1[r4] = r0;	 Catch:{ Exception -> 0x0052 }
        r2 = r7.newInstance(r1);	 Catch:{ Exception -> 0x0052 }
        r1 = "getSubscriberInfo";	 Catch:{ Exception -> 0x0052 }
        r0 = new java.lang.Class[r5];	 Catch:{ Exception -> 0x0052 }
        r1 = r6.getDeclaredMethod(r1, r0);	 Catch:{ Exception -> 0x0052 }
        r1.setAccessible(r4);	 Catch:{ Exception -> 0x0052 }
        r0 = new java.lang.Object[r5];	 Catch:{ Exception -> 0x0052 }
        r0 = r1.invoke(r3, r0);	 Catch:{ Exception -> 0x0052 }
        r8.f50556C = r0;	 Catch:{ Exception -> 0x0052 }
        r0 = new java.lang.Object[r5];	 Catch:{ Exception -> 0x0052 }
        r0 = r1.invoke(r2, r0);	 Catch:{ Exception -> 0x0052 }
        r8.f50557D = r0;	 Catch:{ Exception -> 0x0052 }
        return r4;	 Catch:{ Exception -> 0x0052 }
    L_0x0052:
        return r5;
    L_0x0053:
        r1 = r1 + 1;
        goto L_0x000d;
    L_0x0056:
        return r5;
    L_0x0057:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.47k.D(android.content.Context):boolean");
    }
}
