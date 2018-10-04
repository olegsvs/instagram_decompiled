package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: X.0dp */
public final class AnonymousClass0dp {
    /* renamed from: C */
    private static AnonymousClass0dp f7524C;
    /* renamed from: B */
    public Map f7525B = new HashMap();

    private AnonymousClass0dp() {
    }

    /* renamed from: A */
    public final boolean m6117A() {
        if (!m6121E()) {
            if (m6116D() >= 5 || !((Boolean) AnonymousClass0CC.uU.m914G()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: B */
    public static AnonymousClass0dp m6114B() {
        if (f7524C == null) {
            AnonymousClass0dp anonymousClass0dp = new AnonymousClass0dp();
            f7524C = anonymousClass0dp;
            anonymousClass0dp.m6126J();
        }
        return f7524C;
    }

    /* renamed from: B */
    public final void m6118B(String str) {
        if (this.f7525B.containsKey(str)) {
            ((AnonymousClass0dq) this.f7525B.get(str)).f7527C = null;
            m6127K();
        }
    }

    /* renamed from: C */
    public static AnonymousClass0dq m6115C(AnonymousClass0dp anonymousClass0dp, String str) {
        if (anonymousClass0dp.f7525B.containsKey(str)) {
            return (AnonymousClass0dq) anonymousClass0dp.f7525B.get(str);
        }
        AnonymousClass0dq anonymousClass0dq = new AnonymousClass0dq();
        anonymousClass0dq.f7532H = str;
        return anonymousClass0dq;
    }

    /* renamed from: C */
    public final List m6119C() {
        List D = m6116D();
        Set G = AnonymousClass0Cd.f1698B.m963G();
        Iterator it = D.iterator();
        while (it.hasNext()) {
            if (G.contains(((AnonymousClass0dq) it.next()).f7532H)) {
                it.remove();
            }
        }
        return D;
    }

    /* renamed from: D */
    private int m6116D() {
        int i = 0;
        for (Entry value : this.f7525B.entrySet()) {
            if (((AnonymousClass0dq) value.getValue()).f7526B) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: D */
    public final List m6120D() {
        List arrayList = new ArrayList();
        for (Entry entry : this.f7525B.entrySet()) {
            if (((AnonymousClass0dq) entry.getValue()).f7526B) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    /* renamed from: E */
    public final boolean m6121E() {
        return m6116D() == 0;
    }

    /* renamed from: F */
    public final boolean m6122F() {
        for (String G : AnonymousClass0Cd.f1698B.m963G()) {
            if (!m6123G(G)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: G */
    public final boolean m6123G(String str) {
        return this.f7525B.containsKey(str) && ((AnonymousClass0dq) this.f7525B.get(str)).f7526B;
    }

    /* renamed from: H */
    public final boolean m6124H(String str) {
        for (AnonymousClass0dq anonymousClass0dq : m6116D()) {
            if (str.equals(anonymousClass0dq.f7533I)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: I */
    public final boolean m6125I(String str) {
        return this.f7525B.containsKey(str) && ((AnonymousClass0dq) this.f7525B.get(str)).f7531G;
    }

    /* renamed from: J */
    public final void m6126J() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r9 = this;
        r0 = X.AnonymousClass0FH.f2099C;	 Catch:{ IOException -> 0x013a }
        r2 = r0.f2100B;	 Catch:{ IOException -> 0x013a }
        r1 = "one_tap_login_user_map";	 Catch:{ IOException -> 0x013a }
        r0 = 0;	 Catch:{ IOException -> 0x013a }
        r1 = r2.getString(r1, r0);	 Catch:{ IOException -> 0x013a }
        if (r1 != 0) goto L_0x000e;	 Catch:{ IOException -> 0x013a }
    L_0x000d:
        return;	 Catch:{ IOException -> 0x013a }
    L_0x000e:
        r0 = X.AnonymousClass1JC.parseFromJson(r1);	 Catch:{ IOException -> 0x013a }
        if (r1 != 0) goto L_0x0016;	 Catch:{ IOException -> 0x013a }
    L_0x0014:
        r0 = 0;	 Catch:{ IOException -> 0x013a }
        goto L_0x0018;	 Catch:{ IOException -> 0x013a }
    L_0x0016:
        r0 = r0.f16975B;	 Catch:{ IOException -> 0x013a }
    L_0x0018:
        r5 = new java.util.ArrayList;	 Catch:{ IOException -> 0x013a }
        r5.<init>();	 Catch:{ IOException -> 0x013a }
        if (r0 == 0) goto L_0x013a;	 Catch:{ IOException -> 0x013a }
    L_0x001f:
        r2 = new java.util.HashMap;	 Catch:{ IOException -> 0x013a }
        r2.<init>();	 Catch:{ IOException -> 0x013a }
        r4 = r0.iterator();	 Catch:{ IOException -> 0x013a }
    L_0x0028:
        r0 = r4.hasNext();	 Catch:{ IOException -> 0x013a }
        if (r0 == 0) goto L_0x0073;	 Catch:{ IOException -> 0x013a }
    L_0x002e:
        r3 = r4.next();	 Catch:{ IOException -> 0x013a }
        r3 = (X.AnonymousClass0dq) r3;	 Catch:{ IOException -> 0x013a }
        if (r3 == 0) goto L_0x0066;	 Catch:{ IOException -> 0x013a }
    L_0x0036:
        r0 = r3.f7530F;	 Catch:{ IOException -> 0x013a }
        if (r0 != 0) goto L_0x0064;	 Catch:{ IOException -> 0x013a }
    L_0x003a:
        r0 = r3.f7526B;	 Catch:{ IOException -> 0x013a }
        if (r0 == 0) goto L_0x0064;	 Catch:{ IOException -> 0x013a }
    L_0x003e:
        r0 = X.AnonymousClass0Cd.f1698B;	 Catch:{ IOException -> 0x013a }
        r1 = r0.m963G();	 Catch:{ IOException -> 0x013a }
        r0 = r3.f7532H;	 Catch:{ IOException -> 0x013a }
        r0 = r1.contains(r0);	 Catch:{ IOException -> 0x013a }
        if (r0 != 0) goto L_0x0064;	 Catch:{ IOException -> 0x013a }
    L_0x004c:
        r0 = r3.f7527C;	 Catch:{ IOException -> 0x013a }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IOException -> 0x013a }
        if (r0 != 0) goto L_0x0066;	 Catch:{ IOException -> 0x013a }
    L_0x0054:
        r0 = r3.f7533I;	 Catch:{ IOException -> 0x013a }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IOException -> 0x013a }
        if (r0 != 0) goto L_0x0066;	 Catch:{ IOException -> 0x013a }
    L_0x005c:
        r0 = r3.f7532H;	 Catch:{ IOException -> 0x013a }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IOException -> 0x013a }
        if (r0 != 0) goto L_0x0066;	 Catch:{ IOException -> 0x013a }
    L_0x0064:
        r0 = 1;	 Catch:{ IOException -> 0x013a }
        goto L_0x0067;	 Catch:{ IOException -> 0x013a }
    L_0x0066:
        r0 = 0;	 Catch:{ IOException -> 0x013a }
    L_0x0067:
        if (r0 == 0) goto L_0x006f;	 Catch:{ IOException -> 0x013a }
    L_0x0069:
        r0 = r3.f7532H;	 Catch:{ IOException -> 0x013a }
        r2.put(r0, r3);	 Catch:{ IOException -> 0x013a }
        goto L_0x0028;	 Catch:{ IOException -> 0x013a }
    L_0x006f:
        r5.add(r3);	 Catch:{ IOException -> 0x013a }
        goto L_0x0028;	 Catch:{ IOException -> 0x013a }
    L_0x0073:
        r9.f7525B = r2;	 Catch:{ IOException -> 0x013a }
        r4 = new java.util.ArrayList;	 Catch:{ IOException -> 0x013a }
        r0 = r2.values();	 Catch:{ IOException -> 0x013a }
        r4.<init>(r0);	 Catch:{ IOException -> 0x013a }
        r1 = "one_tap_device_stats";	 Catch:{ IOException -> 0x013a }
        r0 = 0;	 Catch:{ IOException -> 0x013a }
        r3 = X.AnonymousClass0NN.m3291B(r1, r0);	 Catch:{ IOException -> 0x013a }
        r1 = "multi_tap_enabled";	 Catch:{ IOException -> 0x013a }
        r0 = X.AnonymousClass0CC.uU;	 Catch:{ IOException -> 0x013a }
        r0 = X.AnonymousClass0E6.m1316B(r0);	 Catch:{ IOException -> 0x013a }
        r0 = (java.lang.Boolean) r0;	 Catch:{ IOException -> 0x013a }
        r0 = r0.booleanValue();	 Catch:{ IOException -> 0x013a }
        r3.m3300H(r1, r0);	 Catch:{ IOException -> 0x013a }
        r0 = r5.isEmpty();	 Catch:{ IOException -> 0x013a }
        r2 = 0;	 Catch:{ IOException -> 0x013a }
        if (r0 != 0) goto L_0x00ec;	 Catch:{ IOException -> 0x013a }
    L_0x009d:
        r9 = r5.iterator();	 Catch:{ IOException -> 0x013a }
        r8 = 0;	 Catch:{ IOException -> 0x013a }
        r7 = 0;	 Catch:{ IOException -> 0x013a }
        r6 = 0;	 Catch:{ IOException -> 0x013a }
        r5 = 0;	 Catch:{ IOException -> 0x013a }
    L_0x00a5:
        r0 = r9.hasNext();	 Catch:{ IOException -> 0x013a }
        if (r0 == 0) goto L_0x00d5;	 Catch:{ IOException -> 0x013a }
    L_0x00ab:
        r1 = r9.next();	 Catch:{ IOException -> 0x013a }
        r1 = (X.AnonymousClass0dq) r1;	 Catch:{ IOException -> 0x013a }
        if (r1 != 0) goto L_0x00b6;	 Catch:{ IOException -> 0x013a }
    L_0x00b3:
        r8 = r8 + 1;	 Catch:{ IOException -> 0x013a }
        goto L_0x00a5;	 Catch:{ IOException -> 0x013a }
    L_0x00b6:
        r0 = r1.f7533I;	 Catch:{ IOException -> 0x013a }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IOException -> 0x013a }
        if (r0 == 0) goto L_0x00c0;	 Catch:{ IOException -> 0x013a }
    L_0x00be:
        r7 = r7 + 1;	 Catch:{ IOException -> 0x013a }
    L_0x00c0:
        r0 = r1.f7532H;	 Catch:{ IOException -> 0x013a }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IOException -> 0x013a }
        if (r0 == 0) goto L_0x00ca;	 Catch:{ IOException -> 0x013a }
    L_0x00c8:
        r6 = r6 + 1;	 Catch:{ IOException -> 0x013a }
    L_0x00ca:
        r0 = r1.f7527C;	 Catch:{ IOException -> 0x013a }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IOException -> 0x013a }
        if (r0 == 0) goto L_0x00a5;	 Catch:{ IOException -> 0x013a }
    L_0x00d2:
        r5 = r5 + 1;	 Catch:{ IOException -> 0x013a }
        goto L_0x00a5;	 Catch:{ IOException -> 0x013a }
    L_0x00d5:
        r0 = "null_count";	 Catch:{ IOException -> 0x013a }
        r1 = r3.m3294B(r0, r8);	 Catch:{ IOException -> 0x013a }
        r0 = "missing_username";	 Catch:{ IOException -> 0x013a }
        r1 = r1.m3294B(r0, r7);	 Catch:{ IOException -> 0x013a }
        r0 = "missing_userid";	 Catch:{ IOException -> 0x013a }
        r1 = r1.m3294B(r0, r6);	 Catch:{ IOException -> 0x013a }
        r0 = "missing_nonce_count";	 Catch:{ IOException -> 0x013a }
        r1.m3294B(r0, r5);	 Catch:{ IOException -> 0x013a }
    L_0x00ec:
        r0 = r4.isEmpty();	 Catch:{ IOException -> 0x013a }
        if (r0 != 0) goto L_0x010e;	 Catch:{ IOException -> 0x013a }
    L_0x00f2:
        r1 = r4.iterator();	 Catch:{ IOException -> 0x013a }
    L_0x00f6:
        r0 = r1.hasNext();	 Catch:{ IOException -> 0x013a }
        if (r0 == 0) goto L_0x0109;	 Catch:{ IOException -> 0x013a }
    L_0x00fc:
        r0 = r1.next();	 Catch:{ IOException -> 0x013a }
        r0 = (X.AnonymousClass0dq) r0;	 Catch:{ IOException -> 0x013a }
        r0 = r0.f7526B;	 Catch:{ IOException -> 0x013a }
        if (r0 == 0) goto L_0x00f6;	 Catch:{ IOException -> 0x013a }
    L_0x0106:
        r2 = r2 + 1;	 Catch:{ IOException -> 0x013a }
        goto L_0x00f6;	 Catch:{ IOException -> 0x013a }
    L_0x0109:
        r0 = "allow_one_tap_count";	 Catch:{ IOException -> 0x013a }
        r3.m3294B(r0, r2);	 Catch:{ IOException -> 0x013a }
    L_0x010e:
        r1 = "logged_in_count";	 Catch:{ IOException -> 0x013a }
        r0 = X.AnonymousClass0Cd.f1698B;	 Catch:{ IOException -> 0x013a }
        r0 = r0.m959C();	 Catch:{ IOException -> 0x013a }
        r2 = r3.m3294B(r1, r0);	 Catch:{ IOException -> 0x013a }
        r1 = "guid";	 Catch:{ IOException -> 0x013a }
        r0 = X.AnonymousClass0Dt.f1941C;	 Catch:{ IOException -> 0x013a }
        r0 = r0.m1313B();	 Catch:{ IOException -> 0x013a }
        r2 = r2.m3298F(r1, r0);	 Catch:{ IOException -> 0x013a }
        r1 = "logged_out_one_tap_count";	 Catch:{ IOException -> 0x013a }
        r0 = X.AnonymousClass0dp.m6114B();	 Catch:{ IOException -> 0x013a }
        r0 = r0.m6119C();	 Catch:{ IOException -> 0x013a }
        r0 = r0.size();	 Catch:{ IOException -> 0x013a }
        r2.m3294B(r1, r0);	 Catch:{ IOException -> 0x013a }
        r3.m3310R();	 Catch:{ IOException -> 0x013a }
    L_0x013a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0dp.J():void");
    }

    /* renamed from: K */
    public final void m6127K() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r5 = this;
        r2 = new java.util.ArrayList;	 Catch:{ IOException -> 0x00ab }
        r0 = r5.f7525B;	 Catch:{ IOException -> 0x00ab }
        r0 = r0.values();	 Catch:{ IOException -> 0x00ab }
        r2.<init>(r0);	 Catch:{ IOException -> 0x00ab }
        r1 = new X.1JD;	 Catch:{ IOException -> 0x00ab }
        r1.<init>(r2);	 Catch:{ IOException -> 0x00ab }
        r3 = new java.io.StringWriter;	 Catch:{ IOException -> 0x00ab }
        r3.<init>();	 Catch:{ IOException -> 0x00ab }
        r0 = X.AnonymousClass0Lm.f3274B;	 Catch:{ IOException -> 0x00ab }
        r2 = r0.createGenerator(r3);	 Catch:{ IOException -> 0x00ab }
        r2.writeStartObject();	 Catch:{ IOException -> 0x00ab }
        r0 = r1.f16975B;	 Catch:{ IOException -> 0x00ab }
        if (r0 == 0) goto L_0x0090;	 Catch:{ IOException -> 0x00ab }
    L_0x0022:
        r0 = "user_info_list";	 Catch:{ IOException -> 0x00ab }
        r2.writeFieldName(r0);	 Catch:{ IOException -> 0x00ab }
        r2.writeStartArray();	 Catch:{ IOException -> 0x00ab }
        r0 = r1.f16975B;	 Catch:{ IOException -> 0x00ab }
        r5 = r0.iterator();	 Catch:{ IOException -> 0x00ab }
    L_0x0030:
        r0 = r5.hasNext();	 Catch:{ IOException -> 0x00ab }
        if (r0 == 0) goto L_0x008d;	 Catch:{ IOException -> 0x00ab }
    L_0x0036:
        r4 = r5.next();	 Catch:{ IOException -> 0x00ab }
        r4 = (X.AnonymousClass0dq) r4;	 Catch:{ IOException -> 0x00ab }
        if (r4 == 0) goto L_0x0030;	 Catch:{ IOException -> 0x00ab }
    L_0x003e:
        r2.writeStartObject();	 Catch:{ IOException -> 0x00ab }
        r1 = "upsell_seen_before";	 Catch:{ IOException -> 0x00ab }
        r0 = r4.f7531G;	 Catch:{ IOException -> 0x00ab }
        r2.writeBooleanField(r1, r0);	 Catch:{ IOException -> 0x00ab }
        r1 = "allow_non_fb_sso";	 Catch:{ IOException -> 0x00ab }
        r0 = r4.f7526B;	 Catch:{ IOException -> 0x00ab }
        r2.writeBooleanField(r1, r0);	 Catch:{ IOException -> 0x00ab }
        r1 = "rejected_sso_upsell";	 Catch:{ IOException -> 0x00ab }
        r0 = r4.f7530F;	 Catch:{ IOException -> 0x00ab }
        r2.writeBooleanField(r1, r0);	 Catch:{ IOException -> 0x00ab }
        r1 = "one_tap_upsell_after_login_count";	 Catch:{ IOException -> 0x00ab }
        r0 = r4.f7528D;	 Catch:{ IOException -> 0x00ab }
        r2.writeNumberField(r1, r0);	 Catch:{ IOException -> 0x00ab }
        r0 = r4.f7532H;	 Catch:{ IOException -> 0x00ab }
        if (r0 == 0) goto L_0x0068;	 Catch:{ IOException -> 0x00ab }
    L_0x0061:
        r1 = "user_id";	 Catch:{ IOException -> 0x00ab }
        r0 = r4.f7532H;	 Catch:{ IOException -> 0x00ab }
        r2.writeStringField(r1, r0);	 Catch:{ IOException -> 0x00ab }
    L_0x0068:
        r0 = r4.f7527C;	 Catch:{ IOException -> 0x00ab }
        if (r0 == 0) goto L_0x0073;	 Catch:{ IOException -> 0x00ab }
    L_0x006c:
        r1 = "login_nonce";	 Catch:{ IOException -> 0x00ab }
        r0 = r4.f7527C;	 Catch:{ IOException -> 0x00ab }
        r2.writeStringField(r1, r0);	 Catch:{ IOException -> 0x00ab }
    L_0x0073:
        r0 = r4.f7533I;	 Catch:{ IOException -> 0x00ab }
        if (r0 == 0) goto L_0x007e;	 Catch:{ IOException -> 0x00ab }
    L_0x0077:
        r1 = "username";	 Catch:{ IOException -> 0x00ab }
        r0 = r4.f7533I;	 Catch:{ IOException -> 0x00ab }
        r2.writeStringField(r1, r0);	 Catch:{ IOException -> 0x00ab }
    L_0x007e:
        r0 = r4.f7529E;	 Catch:{ IOException -> 0x00ab }
        if (r0 == 0) goto L_0x0089;	 Catch:{ IOException -> 0x00ab }
    L_0x0082:
        r1 = "profile_pic_url";	 Catch:{ IOException -> 0x00ab }
        r0 = r4.f7529E;	 Catch:{ IOException -> 0x00ab }
        r2.writeStringField(r1, r0);	 Catch:{ IOException -> 0x00ab }
    L_0x0089:
        r2.writeEndObject();	 Catch:{ IOException -> 0x00ab }
        goto L_0x0030;	 Catch:{ IOException -> 0x00ab }
    L_0x008d:
        r2.writeEndArray();	 Catch:{ IOException -> 0x00ab }
    L_0x0090:
        r2.writeEndObject();	 Catch:{ IOException -> 0x00ab }
        r2.close();	 Catch:{ IOException -> 0x00ab }
        r2 = r3.toString();	 Catch:{ IOException -> 0x00ab }
        r0 = X.AnonymousClass0FH.f2099C;	 Catch:{ IOException -> 0x00ab }
        r0 = r0.f2100B;	 Catch:{ IOException -> 0x00ab }
        r1 = r0.edit();	 Catch:{ IOException -> 0x00ab }
        r0 = "one_tap_login_user_map";	 Catch:{ IOException -> 0x00ab }
        r0 = r1.putString(r0, r2);	 Catch:{ IOException -> 0x00ab }
        r0.apply();	 Catch:{ IOException -> 0x00ab }
    L_0x00ab:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0dp.K():void");
    }

    /* renamed from: L */
    public final void m6128L(Iterable iterable, boolean z) {
        for (String str : iterable) {
            AnonymousClass0dq C = AnonymousClass0dp.m6115C(this, str);
            C.f7526B = z;
            this.f7525B.put(str, C);
        }
        AnonymousClass2Go.B("save_login_info_switched_on");
        m6127K();
    }

    /* renamed from: M */
    public final void m6129M(String str, boolean z) {
        m6128L(Collections.singleton(str), z);
    }

    /* renamed from: N */
    public final void m6130N(String str, boolean z) {
        AnonymousClass0dq C = AnonymousClass0dp.m6115C(this, str);
        C.f7531G = z;
        this.f7525B.put(str, C);
        m6127K();
    }

    /* renamed from: O */
    public final void m6131O(String str, boolean z) {
        AnonymousClass0dq C = AnonymousClass0dp.m6115C(this, str);
        C.f7530F = z;
        this.f7525B.put(str, C);
        m6127K();
    }
}
