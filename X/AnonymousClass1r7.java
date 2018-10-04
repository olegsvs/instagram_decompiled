package X;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Vector;
import java.util.regex.Pattern;

/* renamed from: X.1r7 */
public final class AnonymousClass1r7 {
    /* renamed from: B */
    public static final Vector f23401B = new Vector();

    static {
        Pattern.compile("(?:\\sChrome/)(\\d{2,3})(?:\\.)");
    }

    /* renamed from: B */
    public static boolean m13457B(Context context, String str) {
        context = CookieSyncManager.createInstance(context);
        CookieManager instance = CookieManager.getInstance();
        String cookie = instance.getCookie(str);
        if (cookie == null) {
            return false;
        }
        String[] split = cookie.split(";");
        for (String cookie2 : split) {
            String trim = cookie2.split("=")[0].trim();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(trim);
            stringBuilder.append("=; Expires=Wed, 31 Dec 2095 23:59:59 GMT");
            instance.setCookie(str, stringBuilder.toString());
        }
        context.sync();
        return true;
    }

    /* renamed from: C */
    public static int m13458C(float f, Context context) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: D */
    public static boolean m13459D() {
        return VERSION.SDK_INT >= 21;
    }

    /* renamed from: E */
    public static void m13460E(android.webkit.CookieManager r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{  }
        r0 = 21;	 Catch:{  }
        if (r1 >= r0) goto L_0x0024;	 Catch:{  }
    L_0x0006:
        r3 = r4.getClass();	 Catch:{  }
        r1 = "flushCookieStore";	 Catch:{  }
        r2 = 0;	 Catch:{  }
        r0 = new java.lang.Class[r2];	 Catch:{  }
        r1 = r3.getDeclaredMethod(r1, r0);	 Catch:{  }
        r0 = 1;	 Catch:{  }
        r1.setAccessible(r0);	 Catch:{  }
        r0 = new java.lang.Object[r2];	 Catch:{  }
        r1.invoke(r4, r0);	 Catch:{  }
        r0 = android.webkit.CookieSyncManager.getInstance();	 Catch:{  }
        r0.sync();	 Catch:{  }
        goto L_0x0027;	 Catch:{  }
    L_0x0024:
        r4.flush();	 Catch:{ Exception -> 0x0027 }
    L_0x0027:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1r7.E(android.webkit.CookieManager):void");
    }

    /* renamed from: F */
    public static String m13461F(String str) {
        if (!TextUtils.isEmpty(str)) {
            int indexOf = str.indexOf(61);
            if (indexOf >= 0) {
                return str.substring(0, indexOf);
            }
        }
        return null;
    }

    /* renamed from: G */
    public static java.lang.String m13462G(java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x0018 }
        r1 = r3.getBytes(r0);	 Catch:{ UnsupportedEncodingException -> 0x0018 }
        r0 = 2;	 Catch:{ UnsupportedEncodingException -> 0x0018 }
        r3 = android.util.Base64.encodeToString(r1, r0);	 Catch:{ UnsupportedEncodingException -> 0x0018 }
        r2 = "<!DOCTYPE HTML>\n<html lang=\"en-US\">\n    <head>\n        <meta charset=\"UTF-8\">\n        <script type=\"text/javascript\">\n            window.location.href = decodeURIComponent(escape(atob(\"%s\")));\n        </script>\n    </head>\n    <body/>\n</html>";	 Catch:{ UnsupportedEncodingException -> 0x0018 }
        r0 = 1;	 Catch:{ UnsupportedEncodingException -> 0x0018 }
        r1 = new java.lang.Object[r0];	 Catch:{ UnsupportedEncodingException -> 0x0018 }
        r0 = 0;	 Catch:{ UnsupportedEncodingException -> 0x0018 }
        r1[r0] = r3;	 Catch:{ UnsupportedEncodingException -> 0x0018 }
        r0 = java.lang.String.format(r2, r1);	 Catch:{ UnsupportedEncodingException -> 0x0018 }
        return r0;	 Catch:{ UnsupportedEncodingException -> 0x0018 }
    L_0x0018:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1r7.G(java.lang.String):java.lang.String");
    }

    /* renamed from: H */
    public static void m13463H(android.content.Context r6, java.util.Map r7, boolean r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = android.os.Build.VERSION.SDK_INT;
        r0 = 19;
        if (r1 >= r0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        android.webkit.CookieSyncManager.createInstance(r6);
        r6 = android.webkit.CookieManager.getInstance();	 Catch:{ Exception -> 0x004b }
        r0 = r7.entrySet();
        r5 = r0.iterator();
    L_0x0016:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x0045;
    L_0x001c:
        r0 = r5.next();
        r0 = (java.util.Map.Entry) r0;
        r4 = r0.getKey();
        r4 = (java.lang.String) r4;
        r3 = r0.getValue();
        r3 = (java.util.ArrayList) r3;
        if (r4 == 0) goto L_0x0016;
    L_0x0030:
        if (r3 == 0) goto L_0x0016;
    L_0x0032:
        r2 = r3.size();
        r1 = 0;
    L_0x0037:
        if (r1 >= r2) goto L_0x0016;
    L_0x0039:
        r0 = r3.get(r1);
        r0 = (java.lang.String) r0;
        r6.setCookie(r4, r0);
        r1 = r1 + 1;
        goto L_0x0037;
    L_0x0045:
        if (r8 == 0) goto L_0x0006;
    L_0x0047:
        X.AnonymousClass1r7.m13460E(r6);
        goto L_0x0006;
    L_0x004b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1r7.H(android.content.Context, java.util.Map, boolean):void");
    }

    /* renamed from: I */
    public static boolean m13464I() {
        synchronized (AnonymousClass1r7.class) {
            Iterator it = f23401B.iterator();
            while (it.hasNext()) {
                if (((WeakReference) it.next()).get() == null) {
                    it.remove();
                } else {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: J */
    public static void m13465J(Context context) {
        if (VERSION.SDK_INT >= 19) {
            CookieSyncManager.createInstance(context);
            AnonymousClass1r7.m13460E(CookieManager.getInstance());
        }
    }
}
