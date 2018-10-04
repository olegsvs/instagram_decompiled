package X;

/* renamed from: X.0V2 */
public final class AnonymousClass0V2 implements AnonymousClass0Ui, AnonymousClass0G2 {
    /* renamed from: B */
    public AnonymousClass0W7 f5631B;
    /* renamed from: C */
    public AnonymousClass0Vw f5632C;

    public final String sL() {
        return "direct_visual_message_log";
    }

    public final String tL() {
        return ".json";
    }

    private AnonymousClass0V2() {
    }

    /* renamed from: B */
    public static AnonymousClass0V2 m4852B(AnonymousClass0Cm anonymousClass0Cm) {
        Class cls = AnonymousClass0V2.class;
        AnonymousClass0V2 anonymousClass0V2 = (AnonymousClass0V2) anonymousClass0Cm.m1036A(cls);
        if (anonymousClass0V2 != null) {
            return anonymousClass0V2;
        }
        Object anonymousClass0V22 = new AnonymousClass0V2();
        anonymousClass0Cm.m1039D(cls, anonymousClass0V22);
        return anonymousClass0V22;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String HK() {
        /*
        r6 = this;
        r0 = r6.f5631B;
        r3 = 0;
        if (r0 != 0) goto L_0x0006;
    L_0x0005:
        return r3;
    L_0x0006:
        r2 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x00d0 }
        r2.<init>();	 Catch:{ JSONException -> 0x00d0 }
        r1 = "message_id";
        r0 = r6.f5631B;	 Catch:{ JSONException -> 0x00d0 }
        r0 = r0.f5885O;	 Catch:{ JSONException -> 0x00d0 }
        r2.put(r1, r0);	 Catch:{ JSONException -> 0x00d0 }
        r1 = "thread_id";
        r0 = r6.f5632C;	 Catch:{ JSONException -> 0x00d0 }
        r0 = r0.m4943O();	 Catch:{ JSONException -> 0x00d0 }
        r2.put(r1, r0);	 Catch:{ JSONException -> 0x00d0 }
        r1 = "thread_oldest_unseen_visual_message_cursor";
        r0 = r6.f5632C;	 Catch:{ JSONException -> 0x00d0 }
        r0 = r0.m4940L();	 Catch:{ JSONException -> 0x00d0 }
        r2.put(r1, r0);	 Catch:{ JSONException -> 0x00d0 }
        r1 = "thread_unseen_visual_message_server_count";
        r0 = r6.f5632C;	 Catch:{ JSONException -> 0x00d0 }
        r0 = r0.m4948T();	 Catch:{ JSONException -> 0x00d0 }
        r2.put(r1, r0);	 Catch:{ JSONException -> 0x00d0 }
        r0 = r6.f5631B;	 Catch:{ JSONException -> 0x00d0 }
        r4 = r0.m5007I();	 Catch:{ JSONException -> 0x00d0 }
        r5 = 1;
        if (r4 == 0) goto L_0x008f;
    L_0x003e:
        r1 = "media_id";
        r0 = r4.getId();	 Catch:{ JSONException -> 0x00d0 }
        r2.put(r1, r0);	 Catch:{ JSONException -> 0x00d0 }
        r1 = "media_type";
        r0 = r4.TO();	 Catch:{ JSONException -> 0x00d0 }
        r2.put(r1, r0);	 Catch:{ JSONException -> 0x00d0 }
        r0 = r4.wY();	 Catch:{ JSONException -> 0x00d0 }
        if (r0 == 0) goto L_0x0068;
    L_0x0056:
        r0 = r4.OA();	 Catch:{ JSONException -> 0x00d0 }
        if (r0 == 0) goto L_0x0066;
    L_0x005c:
        r0 = r4.OA();	 Catch:{ JSONException -> 0x00d0 }
        r0 = r0.f8564N;	 Catch:{ JSONException -> 0x00d0 }
        if (r0 == 0) goto L_0x0066;
    L_0x0064:
        r1 = 1;
        goto L_0x007b;
    L_0x0066:
        r1 = 0;
        goto L_0x007b;
    L_0x0068:
        r0 = r4.m3776f();	 Catch:{ JSONException -> 0x00d0 }
        if (r0 == 0) goto L_0x0066;
    L_0x006e:
        r0 = r4.m3776f();	 Catch:{ JSONException -> 0x00d0 }
        r0 = r0.f6093B;	 Catch:{ JSONException -> 0x00d0 }
        r0 = r0.isEmpty();	 Catch:{ JSONException -> 0x00d0 }
        if (r0 != 0) goto L_0x0066;
    L_0x007a:
        goto L_0x0064;
    L_0x007b:
        r0 = "has_url_info";
        r2.put(r0, r1);	 Catch:{ JSONException -> 0x00d0 }
        r0 = r6.f5631B;	 Catch:{ JSONException -> 0x00d0 }
        r0 = r0.f5921y;	 Catch:{ JSONException -> 0x00d0 }
        if (r0 == 0) goto L_0x008f;
    L_0x0086:
        r1 = "is_visual_media_url_stale";
        r0 = r0.m5209B();	 Catch:{ JSONException -> 0x00d0 }
        r2.put(r1, r0);	 Catch:{ JSONException -> 0x00d0 }
    L_0x008f:
        r1 = "seen_count";
        r0 = r6.f5631B;	 Catch:{ JSONException -> 0x00d0 }
        r0 = r0.m5013O();	 Catch:{ JSONException -> 0x00d0 }
        r2.put(r1, r0);	 Catch:{ JSONException -> 0x00d0 }
        r4 = "message_timestamp";
        r0 = r6.f5631B;	 Catch:{ JSONException -> 0x00d0 }
        r0 = r0.m5009K();	 Catch:{ JSONException -> 0x00d0 }
        r2.put(r4, r0);	 Catch:{ JSONException -> 0x00d0 }
        r1 = "has_uploaded_media";
        r0 = r6.f5631B;	 Catch:{ JSONException -> 0x00d0 }
        r0 = r0.f5921y;	 Catch:{ JSONException -> 0x00d0 }
        if (r0 == 0) goto L_0x00af;
    L_0x00ad:
        r0 = 1;
        goto L_0x00b0;
    L_0x00af:
        r0 = 0;
    L_0x00b0:
        r2.put(r1, r0);	 Catch:{ JSONException -> 0x00d0 }
        r1 = "has_pending_media";
        r0 = r6.f5631B;	 Catch:{ JSONException -> 0x00d0 }
        r0 = r0.f5877G;	 Catch:{ JSONException -> 0x00d0 }
        if (r0 == 0) goto L_0x00bc;
    L_0x00bb:
        goto L_0x00bd;
    L_0x00bc:
        r5 = 0;
    L_0x00bd:
        r2.put(r1, r5);	 Catch:{ JSONException -> 0x00d0 }
        r1 = "view_mode";
        r0 = r6.f5631B;	 Catch:{ JSONException -> 0x00d0 }
        r0 = r0.m5012N();	 Catch:{ JSONException -> 0x00d0 }
        r2.put(r1, r0);	 Catch:{ JSONException -> 0x00d0 }
        r0 = r2.toString();	 Catch:{ JSONException -> 0x00d0 }
        goto L_0x00d9;
    L_0x00d0:
        r2 = move-exception;
        r1 = "DirectVisualMessageBugReportLogger";
        r0 = "Unable to log";
        X.AnonymousClass0Dc.m1244G(r1, r0, r2);
        r0 = r3;
    L_0x00d9:
        r6.f5632C = r3;
        r6.f5631B = r3;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0V2.HK():java.lang.String");
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.f5631B = null;
    }
}
