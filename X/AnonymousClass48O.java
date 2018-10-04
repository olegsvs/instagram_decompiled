package X;

/* renamed from: X.48O */
public final class AnonymousClass48O {
    private AnonymousClass48O() {
    }

    /* renamed from: B */
    public static java.lang.reflect.Method m23402B() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = android.os.Build.VERSION.SDK_INT;
        r4 = 0;
        r0 = 28;
        if (r1 >= r0) goto L_0x0008;
    L_0x0007:
        return r4;
    L_0x0008:
        r0 = "android.app.usage.UsageStatsManager";	 Catch:{ ClassNotFoundException -> 0x001f, ClassNotFoundException -> 0x001f }
        r3 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x001f, ClassNotFoundException -> 0x001f }
        r0 = 2;	 Catch:{ ClassNotFoundException -> 0x001f, ClassNotFoundException -> 0x001f }
        r2 = new java.lang.Class[r0];	 Catch:{ ClassNotFoundException -> 0x001f, ClassNotFoundException -> 0x001f }
        r0 = 0;	 Catch:{ ClassNotFoundException -> 0x001f, ClassNotFoundException -> 0x001f }
        r1 = java.lang.Long.TYPE;	 Catch:{ ClassNotFoundException -> 0x001f, ClassNotFoundException -> 0x001f }
        r2[r0] = r1;	 Catch:{ ClassNotFoundException -> 0x001f, ClassNotFoundException -> 0x001f }
        r0 = 1;	 Catch:{ ClassNotFoundException -> 0x001f, ClassNotFoundException -> 0x001f }
        r2[r0] = r1;	 Catch:{ ClassNotFoundException -> 0x001f, ClassNotFoundException -> 0x001f }
        r0 = "queryEventsForSelf";	 Catch:{ ClassNotFoundException -> 0x001f, ClassNotFoundException -> 0x001f }
        r4 = r3.getMethod(r0, r2);	 Catch:{ ClassNotFoundException -> 0x001f, ClassNotFoundException -> 0x001f }
    L_0x001f:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.48O.B():java.lang.reflect.Method");
    }

    /* renamed from: C */
    public static X.AnonymousClass48N m23403C(java.lang.reflect.Method r22, android.app.usage.UsageStatsManager r23) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = android.os.Build.VERSION.SDK_INT;
        r9 = 0;
        r0 = 28;
        if (r1 < r0) goto L_0x00c4;
    L_0x0007:
        r11 = r22;
        if (r22 == 0) goto L_0x00c4;
    L_0x000b:
        r10 = r23;
        if (r23 != 0) goto L_0x0011;
    L_0x000f:
        goto L_0x00c4;
    L_0x0011:
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r0 = java.lang.System.currentTimeMillis();
        r4 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r2 = r0 - r4;
        r7 = 2;
        r8 = new java.lang.Object[r7];
        r5 = 0;
        r4 = java.lang.Long.valueOf(r2);
        r8[r5] = r4;
        r4 = java.lang.Long.valueOf(r0);
        r5 = 1;
        r8[r5] = r4;
        r4 = r11.invoke(r10, r8);	 Catch:{ IllegalAccessException -> 0x00c3, IllegalAccessException -> 0x00c3 }
        r4 = (android.app.usage.UsageEvents) r4;	 Catch:{ IllegalAccessException -> 0x00c3, IllegalAccessException -> 0x00c3 }
        r10 = new android.app.usage.UsageEvents$Event;
        r10.<init>();
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r8 = "[";
        r9.append(r8);
        r9.append(r2);
        r8 = ",";
        r9.append(r8);
        r9.append(r0);
        r0 = r9.toString();
        r6.append(r0);
        r15 = 0;
        r21 = 0;
        r17 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r19 = -9223372036854775808;
        r13 = 0;
    L_0x0064:
        r0 = r4.getNextEvent(r10);
        if (r0 == 0) goto L_0x00b4;
    L_0x006a:
        r9 = r10.getEventType();
        r11 = r10.getTimeStamp();
        r0 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1));
        if (r0 >= 0) goto L_0x0078;
    L_0x0076:
        r17 = r11;
    L_0x0078:
        r0 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1));
        if (r0 <= 0) goto L_0x007e;
    L_0x007c:
        r19 = r11;
    L_0x007e:
        if (r9 != r5) goto L_0x0082;
    L_0x0080:
        r13 = r11;
        goto L_0x008d;
    L_0x0082:
        if (r9 != r7) goto L_0x008d;
    L_0x0084:
        r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1));
        if (r0 <= 0) goto L_0x008d;
    L_0x0088:
        r11 = r11 - r13;
        r21 = r21 + r11;
        r13 = 0;
    L_0x008d:
        r0 = ",[";
        r6.append(r0);
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r0 = r10.getTimeStamp();
        r0 = r0 - r2;
        r8.append(r0);
        r0 = ",";
        r8.append(r0);
        r8.append(r9);
        r0 = r8.toString();
        r6.append(r0);
        r0 = "]";
        r6.append(r0);
        goto L_0x0064;
    L_0x00b4:
        r0 = "]";
        r6.append(r0);
        r16 = new X.48N;
        r23 = r6.toString();
        r16.<init>(r17, r19, r21, r23);
        return r16;
    L_0x00c3:
        return r9;
    L_0x00c4:
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.48O.C(java.lang.reflect.Method, android.app.usage.UsageStatsManager):X.48N");
    }
}
