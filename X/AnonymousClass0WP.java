package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.0WP */
public final class AnonymousClass0WP extends AnonymousClass0WM {
    /* renamed from: B */
    public static final String f5972B;
    /* renamed from: C */
    public static final String f5973C;

    /* renamed from: F */
    public final String mo1351F() {
        return "message";
    }

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DROP TABLE IF EXISTS ");
        String str = "messages";
        stringBuilder.append(str);
        stringBuilder.append(";");
        f5973C = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append("CREATE INDEX threadId ON ");
        stringBuilder.append(str);
        stringBuilder.append(" (");
        stringBuilder.append("thread_id");
        stringBuilder.append(");");
        f5972B = stringBuilder.toString();
    }

    private AnonymousClass0WP(AnonymousClass0Cm anonymousClass0Cm) {
        super(anonymousClass0Cm);
    }

    /* renamed from: B */
    public static synchronized AnonymousClass0WP m5123B(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0WP anonymousClass0WP;
        Class cls = AnonymousClass0WP.class;
        synchronized (cls) {
            anonymousClass0WP = (AnonymousClass0WP) anonymousClass0Cm.m1036A(cls);
            if (anonymousClass0WP == null) {
                anonymousClass0WP = new AnonymousClass0WP(anonymousClass0Cm);
                anonymousClass0Cm.m1039D(cls, anonymousClass0WP);
            }
        }
        return anonymousClass0WP;
    }

    /* renamed from: D */
    public static String m5124D(String str, String str2) {
        String str3;
        String str4 = null;
        if (str2 == null) {
            str3 = null;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("client_item_id=='");
            stringBuilder.append(str2);
            stringBuilder.append("'");
            str3 = stringBuilder.toString();
        }
        if (str != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("server_item_id=='");
            stringBuilder.append(str);
            stringBuilder.append("'");
            str4 = stringBuilder.toString();
        }
        if (str3 != null && str4 != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("(");
            stringBuilder.append(str3);
            stringBuilder.append(" AND ");
            stringBuilder.append("server_item_id");
            stringBuilder.append(" IS NULL)");
            stringBuilder.append(" OR (");
            stringBuilder.append(str4);
            stringBuilder.append(")");
            return stringBuilder.toString();
        } else if (str3 != null) {
            return str3;
        } else {
            if (str4 != null) {
                return str4;
            }
            throw new IllegalArgumentException("Both message ID and client context is null.");
        }
    }

    /* renamed from: E */
    public static String m5125E(DirectThreadKey directThreadKey) {
        String stringBuilder;
        String str = null;
        if (directThreadKey.f5871C != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("thread_id=='");
            stringBuilder2.append(directThreadKey.f5871C);
            stringBuilder2.append("'");
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = null;
        }
        if (directThreadKey.f5870B != null) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("(thread_id IS NULL AND recipient_ids=='");
            stringBuilder3.append(AnonymousClass0IE.m2145M(",", directThreadKey.f5870B));
            stringBuilder3.append("')");
            str = stringBuilder3.toString();
        }
        if (stringBuilder == null || str == null) {
            return stringBuilder != null ? stringBuilder : str;
        } else {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("(");
            stringBuilder2.append(stringBuilder);
            stringBuilder2.append(" OR ");
            stringBuilder2.append(str);
            stringBuilder2.append(")");
            return stringBuilder2.toString();
        }
    }

    /* renamed from: G */
    public final String mo1352G() {
        return "messages";
    }

    /* renamed from: I */
    public final /* bridge */ /* synthetic */ Object mo1353I(String str) {
        return m5130L(str);
    }

    /* renamed from: L */
    public final X.AnonymousClass0W7 m5130L(java.lang.String r6) {
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
        r3 = X.AnonymousClass1Fb.parseFromJson(r6);	 Catch:{ IOException -> 0x003e }
        r4 = r3.f5912p;
        r0 = r4.f5870B;
        if (r0 == 0) goto L_0x002e;
    L_0x000a:
        r1 = r4.f5870B;
        r0 = r5.f5969C;
        r0 = r0.f1759C;
        r0 = r1.contains(r0);
        if (r0 == 0) goto L_0x002e;
    L_0x0016:
        r2 = new java.util.ArrayList;
        r0 = r4.f5870B;
        r2.<init>(r0);
        r0 = r5.f5969C;
        r0 = r0.f1759C;
        r2.remove(r0);
        r1 = new com.instagram.model.direct.DirectThreadKey;
        r0 = r4.f5871C;
        r1.<init>(r0, r2);
        r3.m5031g(r1);
    L_0x002e:
        r1 = X.AnonymousClass0VM.UNSET;
        r0 = r3.f5887Q;
        if (r1 != r0) goto L_0x003d;
    L_0x0034:
        r0 = r3.f5885O;
        if (r0 == 0) goto L_0x003d;
    L_0x0038:
        r0 = X.AnonymousClass0VM.UPLOADED;
        r3.m5029e(r0);
    L_0x003d:
        return r3;
    L_0x003e:
        r1 = "DirectMessageSQLiteTable";
        r0 = "Error parsing json string into DirectMessage.";
        X.AnonymousClass0Gn.m1881H(r1, r0);
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0WP.L(java.lang.String):X.0W7");
    }
}
