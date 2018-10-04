package X;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.080 */
public final class AnonymousClass080 {
    /* renamed from: B */
    public final String f762B;
    /* renamed from: C */
    public final Map f763C;
    /* renamed from: D */
    public final Long f764D;
    /* renamed from: E */
    public final Byte f765E;
    /* renamed from: F */
    public final String f766F;
    /* renamed from: G */
    public final String f767G;
    /* renamed from: H */
    public final List f768H;
    /* renamed from: I */
    public final String f769I;
    /* renamed from: J */
    public final String f770J;
    /* renamed from: K */
    public final String f771K;
    /* renamed from: L */
    public final Boolean f772L;
    /* renamed from: M */
    public final Boolean f773M;
    /* renamed from: N */
    public final Long f774N;
    /* renamed from: O */
    public final Long f775O;
    /* renamed from: P */
    public final Long f776P;
    /* renamed from: Q */
    public final Integer f777Q;
    /* renamed from: R */
    public final Integer f778R;
    /* renamed from: S */
    public final Integer f779S;
    /* renamed from: T */
    public final Boolean f780T;
    /* renamed from: U */
    public final int f781U;
    /* renamed from: V */
    public final String f782V;
    /* renamed from: W */
    public final Long f783W;

    public AnonymousClass080(Long l, String str, Long l2, Long l3, Integer num, Integer num2, Boolean bool, Boolean bool2, String str2, String str3, Boolean bool3, Long l4, int i, String str4, String str5, List list, String str6, String str7, Byte b, Map map, Long l5, Integer num3) {
        this.f783W = l;
        this.f782V = str;
        this.f764D = l2;
        this.f776P = l3;
        this.f778R = num;
        this.f777Q = num2;
        this.f772L = bool;
        this.f780T = bool2;
        this.f770J = str2;
        this.f771K = str3;
        this.f773M = bool3;
        this.f775O = l4;
        this.f781U = i;
        this.f766F = str4;
        this.f762B = str5;
        this.f768H = list;
        this.f767G = str6;
        this.f769I = str7;
        this.f765E = b;
        this.f763C = map;
        this.f774N = l5;
        this.f779S = num3;
    }

    /* renamed from: A */
    public final java.lang.String m489A() {
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
        r2 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0150 }
        r2.<init>();	 Catch:{ JSONException -> 0x0150 }
        r0 = X.AnonymousClass07w.USER_ID;	 Catch:{ JSONException -> 0x0150 }
        r1 = r0.m481A();	 Catch:{ JSONException -> 0x0150 }
        r0 = r5.f783W;	 Catch:{ JSONException -> 0x0150 }
        r2.putOpt(r1, r0);	 Catch:{ JSONException -> 0x0150 }
        r0 = X.AnonymousClass07w.AGENT;	 Catch:{ JSONException -> 0x0150 }
        r1 = r0.m481A();	 Catch:{ JSONException -> 0x0150 }
        r0 = r5.f782V;	 Catch:{ JSONException -> 0x0150 }
        r2.putOpt(r1, r0);	 Catch:{ JSONException -> 0x0150 }
        r0 = X.AnonymousClass07w.CAPABILITIES;	 Catch:{ JSONException -> 0x0150 }
        r1 = r0.m481A();	 Catch:{ JSONException -> 0x0150 }
        r0 = r5.f764D;	 Catch:{ JSONException -> 0x0150 }
        r2.putOpt(r1, r0);	 Catch:{ JSONException -> 0x0150 }
        r0 = X.AnonymousClass07w.CLIENT_MQTT_SESSION_ID;	 Catch:{ JSONException -> 0x0150 }
        r1 = r0.m481A();	 Catch:{ JSONException -> 0x0150 }
        r0 = r5.f776P;	 Catch:{ JSONException -> 0x0150 }
        r2.putOpt(r1, r0);	 Catch:{ JSONException -> 0x0150 }
        r0 = X.AnonymousClass07w.NETWORK_TYPE;	 Catch:{ JSONException -> 0x0150 }
        r1 = r0.m481A();	 Catch:{ JSONException -> 0x0150 }
        r0 = r5.f778R;	 Catch:{ JSONException -> 0x0150 }
        r2.putOpt(r1, r0);	 Catch:{ JSONException -> 0x0150 }
        r0 = X.AnonymousClass07w.NETWORK_SUBTYPE;	 Catch:{ JSONException -> 0x0150 }
        r1 = r0.m481A();	 Catch:{ JSONException -> 0x0150 }
        r0 = r5.f777Q;	 Catch:{ JSONException -> 0x0150 }
        r2.putOpt(r1, r0);	 Catch:{ JSONException -> 0x0150 }
        r0 = X.AnonymousClass07w.MAKE_USER_AVAILABLE_IN_FOREGROUND;	 Catch:{ JSONException -> 0x0150 }
        r1 = r0.m481A();	 Catch:{ JSONException -> 0x0150 }
        r0 = r5.f772L;	 Catch:{ JSONException -> 0x0150 }
        r2.putOpt(r1, r0);	 Catch:{ JSONException -> 0x0150 }
        r0 = X.AnonymousClass07w.NO_AUTOMATIC_FOREGROUND;	 Catch:{ JSONException -> 0x0150 }
        r1 = r0.m481A();	 Catch:{ JSONException -> 0x0150 }
        r0 = r5.f780T;	 Catch:{ JSONException -> 0x0150 }
        r2.putOpt(r1, r0);	 Catch:{ JSONException -> 0x0150 }
        r0 = X.AnonymousClass07w.DEVICE_ID;	 Catch:{ JSONException -> 0x0150 }
        r1 = r0.m481A();	 Catch:{ JSONException -> 0x0150 }
        r0 = r5.f770J;	 Catch:{ JSONException -> 0x0150 }
        r2.putOpt(r1, r0);	 Catch:{ JSONException -> 0x0150 }
        r0 = X.AnonymousClass07w.DEVICE_SECRET;	 Catch:{ JSONException -> 0x0150 }
        r1 = r0.m481A();	 Catch:{ JSONException -> 0x0150 }
        r0 = r5.f771K;	 Catch:{ JSONException -> 0x0150 }
        r2.putOpt(r1, r0);	 Catch:{ JSONException -> 0x0150 }
        r0 = X.AnonymousClass07w.INITIAL_FOREGROUND_STATE;	 Catch:{ JSONException -> 0x0150 }
        r1 = r0.m481A();	 Catch:{ JSONException -> 0x0150 }
        r0 = r5.f773M;	 Catch:{ JSONException -> 0x0150 }
        r2.putOpt(r1, r0);	 Catch:{ JSONException -> 0x0150 }
        r0 = X.AnonymousClass07w.ENDPOINT_CAPABILITIES;	 Catch:{ JSONException -> 0x0150 }
        r1 = r0.m481A();	 Catch:{ JSONException -> 0x0150 }
        r0 = r5.f775O;	 Catch:{ JSONException -> 0x0150 }
        r2.putOpt(r1, r0);	 Catch:{ JSONException -> 0x0150 }
        r0 = X.AnonymousClass07w.PUBLISH_FORMAT;	 Catch:{ JSONException -> 0x0150 }
        r1 = r0.m481A();	 Catch:{ JSONException -> 0x0150 }
        r0 = r5.f781U;	 Catch:{ JSONException -> 0x0150 }
        r0 = X.AnonymousClass08B.m497B(r0);	 Catch:{ JSONException -> 0x0150 }
        r2.putOpt(r1, r0);	 Catch:{ JSONException -> 0x0150 }
        r0 = X.AnonymousClass07w.CLIENT_TYPE;	 Catch:{ JSONException -> 0x0150 }
        r1 = r0.m481A();	 Catch:{ JSONException -> 0x0150 }
        r0 = r5.f766F;	 Catch:{ JSONException -> 0x0150 }
        r2.putOpt(r1, r0);	 Catch:{ JSONException -> 0x0150 }
        r0 = X.AnonymousClass07w.APP_ID;	 Catch:{ JSONException -> 0x0150 }
        r1 = r0.m481A();	 Catch:{ JSONException -> 0x0150 }
        r0 = r5.f762B;	 Catch:{ JSONException -> 0x0150 }
        r2.putOpt(r1, r0);	 Catch:{ JSONException -> 0x0150 }
        r0 = r5.f768H;	 Catch:{ JSONException -> 0x0150 }
        if (r0 == 0) goto L_0x00d6;	 Catch:{ JSONException -> 0x0150 }
    L_0x00b2:
        r3 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x0150 }
        r3.<init>();	 Catch:{ JSONException -> 0x0150 }
        r0 = r5.f768H;	 Catch:{ JSONException -> 0x0150 }
        r1 = r0.iterator();	 Catch:{ JSONException -> 0x0150 }
    L_0x00bd:
        r0 = r1.hasNext();	 Catch:{ JSONException -> 0x0150 }
        if (r0 == 0) goto L_0x00cd;	 Catch:{ JSONException -> 0x0150 }
    L_0x00c3:
        r0 = r1.next();	 Catch:{ JSONException -> 0x0150 }
        r0 = (java.lang.String) r0;	 Catch:{ JSONException -> 0x0150 }
        r3.put(r0);	 Catch:{ JSONException -> 0x0150 }
        goto L_0x00bd;	 Catch:{ JSONException -> 0x0150 }
    L_0x00cd:
        r0 = X.AnonymousClass07w.SUBSCRIBE_TOPICS;	 Catch:{ JSONException -> 0x0150 }
        r0 = r0.m481A();	 Catch:{ JSONException -> 0x0150 }
        r2.put(r0, r3);	 Catch:{ JSONException -> 0x0150 }
    L_0x00d6:
        r0 = X.AnonymousClass07w.CONNECT_HASH;	 Catch:{ JSONException -> 0x0150 }
        r1 = r0.m481A();	 Catch:{ JSONException -> 0x0150 }
        r0 = r5.f767G;	 Catch:{ JSONException -> 0x0150 }
        r2.put(r1, r0);	 Catch:{ JSONException -> 0x0150 }
        r0 = X.AnonymousClass07w.DATACENTER_PREFERENCE;	 Catch:{ JSONException -> 0x0150 }
        r1 = r0.m481A();	 Catch:{ JSONException -> 0x0150 }
        r0 = r5.f769I;	 Catch:{ JSONException -> 0x0150 }
        r2.putOpt(r1, r0);	 Catch:{ JSONException -> 0x0150 }
        r0 = X.AnonymousClass07w.CLIENT_STACK;	 Catch:{ JSONException -> 0x0150 }
        r1 = r0.m481A();	 Catch:{ JSONException -> 0x0150 }
        r0 = r5.f765E;	 Catch:{ JSONException -> 0x0150 }
        r2.putOpt(r1, r0);	 Catch:{ JSONException -> 0x0150 }
        r0 = r5.f763C;	 Catch:{ JSONException -> 0x0150 }
        if (r0 == 0) goto L_0x012d;	 Catch:{ JSONException -> 0x0150 }
    L_0x00fb:
        r4 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0150 }
        r4.<init>();	 Catch:{ JSONException -> 0x0150 }
        r0 = r5.f763C;	 Catch:{ JSONException -> 0x0150 }
        r0 = r0.entrySet();	 Catch:{ JSONException -> 0x0150 }
        r3 = r0.iterator();	 Catch:{ JSONException -> 0x0150 }
    L_0x010a:
        r0 = r3.hasNext();	 Catch:{ JSONException -> 0x0150 }
        if (r0 == 0) goto L_0x0124;	 Catch:{ JSONException -> 0x0150 }
    L_0x0110:
        r0 = r3.next();	 Catch:{ JSONException -> 0x0150 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ JSONException -> 0x0150 }
        r1 = r0.getKey();	 Catch:{ JSONException -> 0x0150 }
        r1 = (java.lang.String) r1;	 Catch:{ JSONException -> 0x0150 }
        r0 = r0.getValue();	 Catch:{ JSONException -> 0x0150 }
        r4.putOpt(r1, r0);	 Catch:{ JSONException -> 0x0150 }
        goto L_0x010a;	 Catch:{ JSONException -> 0x0150 }
    L_0x0124:
        r0 = X.AnonymousClass07w.APP_SPECIFIC_INFO;	 Catch:{ JSONException -> 0x0150 }
        r0 = r0.m481A();	 Catch:{ JSONException -> 0x0150 }
        r2.putOpt(r0, r4);	 Catch:{ JSONException -> 0x0150 }
    L_0x012d:
        r0 = r5.f774N;	 Catch:{ JSONException -> 0x0150 }
        if (r0 == 0) goto L_0x013c;	 Catch:{ JSONException -> 0x0150 }
    L_0x0131:
        r0 = X.AnonymousClass07w.LOGGER_USER_ID;	 Catch:{ JSONException -> 0x0150 }
        r1 = r0.m481A();	 Catch:{ JSONException -> 0x0150 }
        r0 = r5.f774N;	 Catch:{ JSONException -> 0x0150 }
        r2.putOpt(r1, r0);	 Catch:{ JSONException -> 0x0150 }
    L_0x013c:
        r0 = r5.f779S;	 Catch:{ JSONException -> 0x0150 }
        if (r0 == 0) goto L_0x014b;	 Catch:{ JSONException -> 0x0150 }
    L_0x0140:
        r0 = X.AnonymousClass07w.NETWORK_TYPE_INFO;	 Catch:{ JSONException -> 0x0150 }
        r1 = r0.m481A();	 Catch:{ JSONException -> 0x0150 }
        r0 = r5.f779S;	 Catch:{ JSONException -> 0x0150 }
        r2.putOpt(r1, r0);	 Catch:{ JSONException -> 0x0150 }
    L_0x014b:
        r0 = r2.toString();	 Catch:{ JSONException -> 0x0150 }
        return r0;	 Catch:{ JSONException -> 0x0150 }
    L_0x0150:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.080.A():java.lang.String");
    }

    /* renamed from: B */
    public static X.AnonymousClass080 m483B(java.lang.String r27) {
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
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x00f5 }
        r1 = r27;	 Catch:{ JSONException -> 0x00f5 }
        r0.<init>(r1);	 Catch:{ JSONException -> 0x00f5 }
        r4 = new java.util.ArrayList;	 Catch:{ JSONException -> 0x00f5 }
        r4.<init>();	 Catch:{ JSONException -> 0x00f5 }
        r1 = X.AnonymousClass07w.SUBSCRIBE_TOPICS;	 Catch:{ JSONException -> 0x00f5 }
        r1 = r1.m481A();	 Catch:{ JSONException -> 0x00f5 }
        r3 = r0.optJSONArray(r1);	 Catch:{ JSONException -> 0x00f5 }
        r2 = 0;	 Catch:{ JSONException -> 0x00f5 }
    L_0x0017:
        if (r3 == 0) goto L_0x0029;	 Catch:{ JSONException -> 0x00f5 }
    L_0x0019:
        r1 = r3.length();	 Catch:{ JSONException -> 0x00f5 }
        if (r2 >= r1) goto L_0x0029;	 Catch:{ JSONException -> 0x00f5 }
    L_0x001f:
        r1 = r3.getString(r2);	 Catch:{ JSONException -> 0x00f5 }
        r4.add(r1);	 Catch:{ JSONException -> 0x00f5 }
        r2 = r2 + 1;	 Catch:{ JSONException -> 0x00f5 }
        goto L_0x0017;	 Catch:{ JSONException -> 0x00f5 }
    L_0x0029:
        r3 = new java.util.HashMap;	 Catch:{ JSONException -> 0x00f5 }
        r3.<init>();	 Catch:{ JSONException -> 0x00f5 }
        r1 = X.AnonymousClass07w.APP_SPECIFIC_INFO;	 Catch:{ JSONException -> 0x00f5 }
        r1 = r1.m481A();	 Catch:{ JSONException -> 0x00f5 }
        r6 = r0.optJSONObject(r1);	 Catch:{ JSONException -> 0x00f5 }
        if (r6 == 0) goto L_0x0052;	 Catch:{ JSONException -> 0x00f5 }
    L_0x003a:
        r5 = r6.keys();	 Catch:{ JSONException -> 0x00f5 }
    L_0x003e:
        r1 = r5.hasNext();	 Catch:{ JSONException -> 0x00f5 }
        if (r1 == 0) goto L_0x0052;	 Catch:{ JSONException -> 0x00f5 }
    L_0x0044:
        r2 = r5.next();	 Catch:{ JSONException -> 0x00f5 }
        r2 = (java.lang.String) r2;	 Catch:{ JSONException -> 0x00f5 }
        r1 = r6.getString(r2);	 Catch:{ JSONException -> 0x00f5 }
        r3.put(r2, r1);	 Catch:{ JSONException -> 0x00f5 }
        goto L_0x003e;	 Catch:{ JSONException -> 0x00f5 }
    L_0x0052:
        r5 = new X.080;	 Catch:{ JSONException -> 0x00f5 }
        r1 = X.AnonymousClass07w.USER_ID;	 Catch:{ JSONException -> 0x00f5 }
        r6 = X.AnonymousClass080.m487F(r0, r1);	 Catch:{ JSONException -> 0x00f5 }
        r1 = X.AnonymousClass07w.AGENT;	 Catch:{ JSONException -> 0x00f5 }
        r7 = X.AnonymousClass080.m488G(r0, r1);	 Catch:{ JSONException -> 0x00f5 }
        r1 = X.AnonymousClass07w.CAPABILITIES;	 Catch:{ JSONException -> 0x00f5 }
        r8 = X.AnonymousClass080.m487F(r0, r1);	 Catch:{ JSONException -> 0x00f5 }
        r1 = X.AnonymousClass07w.CLIENT_MQTT_SESSION_ID;	 Catch:{ JSONException -> 0x00f5 }
        r9 = X.AnonymousClass080.m487F(r0, r1);	 Catch:{ JSONException -> 0x00f5 }
        r1 = X.AnonymousClass07w.NETWORK_TYPE;	 Catch:{ JSONException -> 0x00f5 }
        r2 = r1.m481A();	 Catch:{ JSONException -> 0x00f5 }
        r1 = -1;	 Catch:{ JSONException -> 0x00f5 }
        r1 = r0.optInt(r2, r1);	 Catch:{ JSONException -> 0x00f5 }
        r10 = java.lang.Integer.valueOf(r1);	 Catch:{ JSONException -> 0x00f5 }
        r1 = X.AnonymousClass07w.NETWORK_SUBTYPE;	 Catch:{ JSONException -> 0x00f5 }
        r11 = X.AnonymousClass080.m486E(r0, r1);	 Catch:{ JSONException -> 0x00f5 }
        r1 = X.AnonymousClass07w.MAKE_USER_AVAILABLE_IN_FOREGROUND;	 Catch:{ JSONException -> 0x00f5 }
        r12 = X.AnonymousClass080.m484C(r0, r1);	 Catch:{ JSONException -> 0x00f5 }
        r1 = X.AnonymousClass07w.NO_AUTOMATIC_FOREGROUND;	 Catch:{ JSONException -> 0x00f5 }
        r13 = X.AnonymousClass080.m484C(r0, r1);	 Catch:{ JSONException -> 0x00f5 }
        r1 = X.AnonymousClass07w.DEVICE_ID;	 Catch:{ JSONException -> 0x00f5 }
        r14 = X.AnonymousClass080.m488G(r0, r1);	 Catch:{ JSONException -> 0x00f5 }
        r1 = X.AnonymousClass07w.DEVICE_SECRET;	 Catch:{ JSONException -> 0x00f5 }
        r15 = X.AnonymousClass080.m488G(r0, r1);	 Catch:{ JSONException -> 0x00f5 }
        r1 = X.AnonymousClass07w.INITIAL_FOREGROUND_STATE;	 Catch:{ JSONException -> 0x00f5 }
        r16 = X.AnonymousClass080.m484C(r0, r1);	 Catch:{ JSONException -> 0x00f5 }
        r1 = X.AnonymousClass07w.ENDPOINT_CAPABILITIES;	 Catch:{ JSONException -> 0x00f5 }
        r17 = X.AnonymousClass080.m487F(r0, r1);	 Catch:{ JSONException -> 0x00f5 }
        r1 = X.AnonymousClass07w.PUBLISH_FORMAT;	 Catch:{ JSONException -> 0x00f5 }
        r2 = X.AnonymousClass080.m488G(r0, r1);	 Catch:{ JSONException -> 0x00f5 }
        r1 = "jz";	 Catch:{ JSONException -> 0x00f5 }
        r1 = r1.equals(r2);	 Catch:{ JSONException -> 0x00f5 }
        if (r1 == 0) goto L_0x00b6;	 Catch:{ JSONException -> 0x00f5 }
    L_0x00b3:
        r18 = 1;	 Catch:{ JSONException -> 0x00f5 }
        goto L_0x00c3;	 Catch:{ JSONException -> 0x00f5 }
    L_0x00b6:
        r1 = "jzo";	 Catch:{ JSONException -> 0x00f5 }
        r1 = r1.equals(r2);	 Catch:{ JSONException -> 0x00f5 }
        if (r1 == 0) goto L_0x00c1;	 Catch:{ JSONException -> 0x00f5 }
    L_0x00be:
        r18 = 2;	 Catch:{ JSONException -> 0x00f5 }
        goto L_0x00c3;	 Catch:{ JSONException -> 0x00f5 }
    L_0x00c1:
        r18 = 0;	 Catch:{ JSONException -> 0x00f5 }
    L_0x00c3:
        r1 = X.AnonymousClass07w.CLIENT_TYPE;	 Catch:{ JSONException -> 0x00f5 }
        r19 = X.AnonymousClass080.m488G(r0, r1);	 Catch:{ JSONException -> 0x00f5 }
        r1 = X.AnonymousClass07w.APP_ID;	 Catch:{ JSONException -> 0x00f5 }
        r20 = X.AnonymousClass080.m488G(r0, r1);	 Catch:{ JSONException -> 0x00f5 }
        r1 = X.AnonymousClass07w.CONNECT_HASH;	 Catch:{ JSONException -> 0x00f5 }
        r22 = X.AnonymousClass080.m488G(r0, r1);	 Catch:{ JSONException -> 0x00f5 }
        r1 = X.AnonymousClass07w.DATACENTER_PREFERENCE;	 Catch:{ JSONException -> 0x00f5 }
        r23 = X.AnonymousClass080.m488G(r0, r1);	 Catch:{ JSONException -> 0x00f5 }
        r1 = X.AnonymousClass07w.CLIENT_STACK;	 Catch:{ JSONException -> 0x00f5 }
        r24 = X.AnonymousClass080.m485D(r0, r1);	 Catch:{ JSONException -> 0x00f5 }
        r1 = X.AnonymousClass07w.LOGGER_USER_ID;	 Catch:{ JSONException -> 0x00f5 }
        r26 = X.AnonymousClass080.m487F(r0, r1);	 Catch:{ JSONException -> 0x00f5 }
        r1 = X.AnonymousClass07w.NETWORK_TYPE_INFO;	 Catch:{ JSONException -> 0x00f5 }
        r27 = X.AnonymousClass080.m486E(r0, r1);	 Catch:{ JSONException -> 0x00f5 }
        r21 = r4;	 Catch:{ JSONException -> 0x00f5 }
        r25 = r3;	 Catch:{ JSONException -> 0x00f5 }
        r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27);	 Catch:{ JSONException -> 0x00f5 }
        return r5;	 Catch:{ JSONException -> 0x00f5 }
    L_0x00f5:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.080.B(java.lang.String):X.080");
    }

    /* renamed from: C */
    private static Boolean m484C(JSONObject jSONObject, AnonymousClass07w anonymousClass07w) {
        if (jSONObject.has(anonymousClass07w.m481A())) {
            return Boolean.valueOf(jSONObject.optBoolean(anonymousClass07w.m481A()));
        }
        return null;
    }

    /* renamed from: D */
    private static java.lang.Byte m485D(org.json.JSONObject r1, X.AnonymousClass07w r2) {
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
        r0 = r2.m481A();	 Catch:{ Exception -> 0x0011 }
        r0 = r1.optString(r0);	 Catch:{ Exception -> 0x0011 }
        r0 = java.lang.Byte.parseByte(r0);	 Catch:{ Exception -> 0x0011 }
        r0 = java.lang.Byte.valueOf(r0);	 Catch:{ Exception -> 0x0011 }
        return r0;	 Catch:{ Exception -> 0x0011 }
    L_0x0011:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.080.D(org.json.JSONObject, X.07w):java.lang.Byte");
    }

    /* renamed from: E */
    private static Integer m486E(JSONObject jSONObject, AnonymousClass07w anonymousClass07w) {
        if (jSONObject.has(anonymousClass07w.m481A())) {
            return Integer.valueOf(jSONObject.optInt(anonymousClass07w.m481A()));
        }
        return null;
    }

    /* renamed from: F */
    private static Long m487F(JSONObject jSONObject, AnonymousClass07w anonymousClass07w) {
        if (jSONObject.has(anonymousClass07w.m481A())) {
            return Long.valueOf(jSONObject.optLong(anonymousClass07w.m481A()));
        }
        return null;
    }

    /* renamed from: G */
    private static String m488G(JSONObject jSONObject, AnonymousClass07w anonymousClass07w) {
        if (jSONObject.has(anonymousClass07w.m481A())) {
            return jSONObject.optString(anonymousClass07w.m481A());
        }
        return null;
    }

    public final String toString() {
        String A = m489A();
        return A != null ? A : JsonProperty.USE_DEFAULT_NAME;
    }
}
