package X;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.0LE */
public final class AnonymousClass0LE {
    /* renamed from: B */
    public static Intent m2919B(Intent intent, Context context, String str) {
        try {
            SecurityException securityException;
            intent.setExtrasClassLoader(context.getClassLoader());
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            extras.setClassLoader(context.getClassLoader());
            String str2 = "_ci_";
            String C = AnonymousClass0LE.m2920C(str, System.currentTimeMillis());
            Set<String> hashSet = new HashSet();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com.facebook.class");
            stringBuilder.append(UUID.randomUUID().toString().replace('-', '_'));
            ComponentName componentName = new ComponentName(context, stringBuilder.toString());
            Intent intent2 = new Intent();
            intent2.setComponent(componentName);
            if (intent2.getComponent() != null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
                intent2.setAction(C);
                intent2.setDataAndType(null, null);
                intent2.setSourceBounds(null);
                int i = VERSION.SDK_INT;
                if ((i >= 15 ? 1 : null) != null) {
                    intent2.setSelector(null);
                }
                if ((i >= 16 ? 1 : null) != null) {
                    intent2.setClipData(null);
                }
                for (String addCategory : hashSet) {
                    intent2.addCategory(addCategory);
                }
                if (context.getPackageManager().queryIntentActivities(intent2, 131072).isEmpty()) {
                    extras.putParcelable(str2, PendingIntent.getActivity(context, 0, intent2, 1140850688));
                    intent.putExtras(extras);
                    return intent;
                }
                securityException = new SecurityException("Cannot use existing ComponentName to generate an invalid PendingIntent");
            } else {
                securityException = new SecurityException("Must generate PendingIntent based on an explicit intent.");
            }
            throw securityException;
        } catch (Exception e) {
            throw new AnonymousClass1ww(e);
        }
    }

    /* renamed from: C */
    public static java.lang.String m2920C(java.lang.String r4, long r5) {
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
        r3 = new org.json.JSONObject;
        r3.<init>();
        r2 = 0;
        r1 = "t";	 Catch:{ JSONException -> 0x0028 }
        r0 = java.lang.Long.toString(r5);	 Catch:{ JSONException -> 0x0028 }
        r3.put(r1, r0);	 Catch:{ JSONException -> 0x0028 }
        if (r4 == 0) goto L_0x0016;	 Catch:{ JSONException -> 0x0028 }
    L_0x0011:
        r0 = "d";	 Catch:{ JSONException -> 0x0028 }
        r3.put(r0, r4);	 Catch:{ JSONException -> 0x0028 }
    L_0x0016:
        r1 = r3.toString();	 Catch:{ UnsupportedEncodingException -> 0x0027 }
        r0 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x0027 }
        r1 = r1.getBytes(r0);	 Catch:{ UnsupportedEncodingException -> 0x0027 }
        r0 = 11;	 Catch:{ UnsupportedEncodingException -> 0x0027 }
        r0 = android.util.Base64.encodeToString(r1, r0);	 Catch:{ UnsupportedEncodingException -> 0x0027 }
        return r0;	 Catch:{ UnsupportedEncodingException -> 0x0027 }
    L_0x0027:
        return r2;
    L_0x0028:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0LE.C(java.lang.String, long):java.lang.String");
    }
}
