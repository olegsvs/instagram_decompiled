package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0g7 */
public final class AnonymousClass0g7 {
    /* renamed from: E */
    public static AnonymousClass0g7 f8108E;
    /* renamed from: B */
    public final Context f8109B;
    /* renamed from: C */
    public final SharedPreferences f8110C;
    /* renamed from: D */
    public Map f8111D;

    public AnonymousClass0g7(Context context) {
        this.f8109B = context;
        this.f8110C = context.getSharedPreferences("CookiePrefsFile2", 0);
        SharedPreferences sharedPreferences = this.f8110C;
        String str = "cookie_";
        Map concurrentHashMap = new ConcurrentHashMap();
        String string = sharedPreferences.getString("names", null);
        if (string != null) {
            for (String string2 : TextUtils.split(string2, ",")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(string2);
                String string3 = sharedPreferences.getString(stringBuilder.toString(), null);
                if (string3 != null) {
                    AnonymousClass0gD B = AnonymousClass0g7.m6586B(string3);
                    if (B != null) {
                        concurrentHashMap.put(string2, B);
                    }
                }
            }
        }
        this.f8111D = concurrentHashMap;
        Date date = new Date();
        Editor edit = this.f8110C.edit();
        Object obj = null;
        for (Entry entry : this.f8111D.entrySet()) {
            String str2 = (String) entry.getKey();
            if (((AnonymousClass0gD) entry.getValue()).m6590A(date)) {
                this.f8111D.remove(str2);
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str);
                stringBuilder2.append(str2);
                edit.remove(stringBuilder2.toString());
                obj = 1;
            }
        }
        if (obj != null) {
            edit.putString("names", TextUtils.join(",", this.f8111D.keySet()));
        }
        edit.apply();
    }

    /* renamed from: B */
    public static X.AnonymousClass0gD m6586B(java.lang.String r7) {
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
        r6 = r7.length();
        r0 = r6 / 2;
        r5 = new byte[r0];
        r4 = 0;
    L_0x0009:
        if (r4 >= r6) goto L_0x002a;
    L_0x000b:
        r3 = r4 / 2;
        r0 = r7.charAt(r4);
        r2 = 16;
        r0 = java.lang.Character.digit(r0, r2);
        r1 = r0 << 4;
        r0 = r4 + 1;
        r0 = r7.charAt(r0);
        r0 = java.lang.Character.digit(r0, r2);
        r1 = r1 + r0;
        r0 = (byte) r1;
        r5[r3] = r0;
        r4 = r4 + 2;
        goto L_0x0009;
    L_0x002a:
        r1 = new java.io.ByteArrayInputStream;
        r1.<init>(r5);
        r0 = new X.0g9;	 Catch:{ Exception -> 0x003f }
        r0.<init>(r1);	 Catch:{ Exception -> 0x003f }
        r0 = r0.readObject();	 Catch:{ Exception -> 0x003f }
        r0 = (com.instagram.service.persistentcookiestore.PersistentCookieStore$SerializableCookie) r0;	 Catch:{ Exception -> 0x003f }
        r0 = r0.getCookie();	 Catch:{ Exception -> 0x003f }
        goto L_0x0046;	 Catch:{ Exception -> 0x003f }
    L_0x003f:
        r0 = 1;
        r1 = new java.lang.Object[r0];
        r0 = 0;
        r1[r0] = r7;
        r0 = 0;
    L_0x0046:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0g7.B(java.lang.String):X.0gD");
    }

    /* renamed from: C */
    public static java.lang.String m6587C(X.AnonymousClass0gD r5) {
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
        r2 = new java.io.ByteArrayOutputStream;
        r2.<init>();
        r1 = new java.io.ObjectOutputStream;	 Catch:{ Exception -> 0x0013 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0013 }
        r0 = new com.instagram.service.persistentcookiestore.PersistentCookieStore$SerializableCookie;	 Catch:{ Exception -> 0x0013 }
        r0.<init>(r5);	 Catch:{ Exception -> 0x0013 }
        r1.writeObject(r0);	 Catch:{ Exception -> 0x0013 }
        goto L_0x0019;	 Catch:{ Exception -> 0x0013 }
    L_0x0013:
        r0 = 1;
        r1 = new java.lang.Object[r0];
        r0 = 0;
        r1[r0] = r5;
    L_0x0019:
        r5 = r2.toByteArray();
        r4 = new java.lang.StringBuilder;
        r0 = r5.length;
        r0 = r0 * 2;
        r4.<init>(r0);
        r3 = r5.length;
        r2 = 0;
    L_0x0027:
        if (r2 >= r3) goto L_0x0040;
    L_0x0029:
        r0 = r5[r2];
        r1 = r0 & 255;
        r0 = 16;
        if (r1 >= r0) goto L_0x0036;
    L_0x0031:
        r0 = 48;
        r4.append(r0);
    L_0x0036:
        r0 = java.lang.Integer.toHexString(r1);
        r4.append(r0);
        r2 = r2 + 1;
        goto L_0x0027;
    L_0x0040:
        r0 = r4.toString();
        r0 = r0.toUpperCase();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0g7.C(X.0gD):java.lang.String");
    }
}
