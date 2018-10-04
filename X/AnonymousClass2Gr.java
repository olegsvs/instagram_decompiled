package X;

/* renamed from: X.2Gr */
public final class AnonymousClass2Gr implements AnonymousClass0ES {
    /* renamed from: B */
    public final /* synthetic */ String f28417B;

    public AnonymousClass2Gr(String str) {
        this.f28417B = str;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object get() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r9 = this;
        r4 = new X.0Qu;
        r4.<init>();
        r9 = r9.f28417B;
        r5 = new java.util.HashMap;
        r5.<init>();
        r1 = "event";
        r0 = "CUSTOM_APP_EVENTS";
        r5.put(r1, r0);
        r1 = "format";
        r0 = "json";
        r5.put(r1, r0);
        r8 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x004f }
        r8.<init>();	 Catch:{ JSONException -> 0x004f }
        r7 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x004f }
        r7.<init>();	 Catch:{ JSONException -> 0x004f }
        r1 = "_appVersion";	 Catch:{ JSONException -> 0x004f }
        r0 = X.AnonymousClass0FG.f2097D;	 Catch:{ JSONException -> 0x004f }
        r7.put(r1, r0);	 Catch:{ JSONException -> 0x004f }
        r6 = "_logTime";	 Catch:{ JSONException -> 0x004f }
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ JSONException -> 0x004f }
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ JSONException -> 0x004f }
        r2 = r2 / r0;	 Catch:{ JSONException -> 0x004f }
        r7.put(r6, r2);	 Catch:{ JSONException -> 0x004f }
        r1 = "_eventName";	 Catch:{ JSONException -> 0x004f }
        r0 = "fb_mobile_complete_registration";	 Catch:{ JSONException -> 0x004f }
        r7.put(r1, r0);	 Catch:{ JSONException -> 0x004f }
        r0 = "fb_registration_method";	 Catch:{ JSONException -> 0x004f }
        r7.put(r0, r9);	 Catch:{ JSONException -> 0x004f }
        r8.put(r7);	 Catch:{ JSONException -> 0x004f }
        r1 = "custom_events_file";	 Catch:{ JSONException -> 0x004f }
        r0 = r8.toString();	 Catch:{ JSONException -> 0x004f }
        r5.put(r1, r0);	 Catch:{ JSONException -> 0x004f }
    L_0x004f:
        X.AnonymousClass1Bx.B(r5);
        r0 = r5.keySet();
        r3 = r0.iterator();
    L_0x005a:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0088;
    L_0x0060:
        r2 = r3.next();
        r2 = (java.lang.String) r2;
        r0 = "custom_events_file";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x007e;
    L_0x006e:
        r0 = r5.get(r2);
        r0 = (java.lang.String) r0;
        r1 = X.AnonymousClass17u.B(r0);
        r0 = "application/json";
        r4.J(r2, r1, r0);
        goto L_0x005a;
    L_0x007e:
        r0 = r5.get(r2);
        r0 = (java.lang.String) r0;
        r4.H(r2, r0);
        goto L_0x005a;
    L_0x0088:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2Gr.get():java.lang.Object");
    }
}
