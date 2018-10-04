package com.facebook.browser.lite;

import X.AnonymousClass09p;
import X.AnonymousClass0cQ;
import android.content.Intent;

public class BrowserLiteIntentService extends AnonymousClass09p {
    /* renamed from: B */
    public static String f23202B = "BrowserLiteIntentService";
    /* renamed from: C */
    public static String f23203C = "BrowserLiteIntentService";

    /* renamed from: C */
    public final void m13387C(android.content.Intent r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r8 = this;
        if (r9 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r0 = X.AnonymousClass1r7.m13459D();
        r7 = 0;
        r6 = 1;
        if (r0 == 0) goto L_0x0023;
    L_0x000b:
        r0 = 0;
        r2 = r8.getPackageManager();	 Catch:{ Exception -> 0x001a }
        r1 = r9.getComponent();	 Catch:{ Exception -> 0x001a }
        r1 = r2.getServiceInfo(r1, r7);	 Catch:{ Exception -> 0x001a }
        r0 = r1.processName;	 Catch:{ Exception -> 0x001a }
    L_0x001a:
        r0 = X.AnonymousClass1rA.m13471G(r0);
        if (r0 == 0) goto L_0x0023;
    L_0x0020:
        r0 = 1;
        X.AnonymousClass1qc.f23312B = r0;
    L_0x0023:
        X.AnonymousClass1r4.f23395B = r6;
        r0 = "EXTRA_ACTION";
        r3 = r9.getStringExtra(r0);
        r0 = android.text.TextUtils.isEmpty(r3);
        if (r0 == 0) goto L_0x0032;
    L_0x0031:
        goto L_0x0002;
    L_0x0032:
        r0 = "BrowserLiteIntent.EXTRA_LOGCAT";
        r0 = r9.getBooleanExtra(r0, r7);
        X.AnonymousClass1rD.f23412B = r0;
        r2 = f23203C;
        r1 = "Service got action request: %s";
        r0 = new java.lang.Object[r6];
        r0[r7] = r3;
        X.AnonymousClass1rD.m13482B(r2, r1, r0);
        r2 = r3.hashCode();
        r0 = -1896793051; // 0xffffffff8ef13c25 float:-5.9469004E-30 double:NaN;
        r1 = 2;
        if (r2 == r0) goto L_0x007d;
    L_0x004f:
        r0 = 270752123; // 0x1023597b float:3.2215015E-29 double:1.337693225E-315;
        if (r2 == r0) goto L_0x0073;
    L_0x0054:
        r0 = 1206811370; // 0x47ee7aea float:122101.83 double:5.96244039E-315;
        if (r2 == r0) goto L_0x0069;
    L_0x0059:
        r0 = 1258331532; // 0x4b009d8c float:8428940.0 double:6.21698381E-315;
        if (r2 == r0) goto L_0x005f;
    L_0x005e:
        goto L_0x0087;
    L_0x005f:
        r0 = "ACTION_WARM_UP";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0087;
    L_0x0067:
        r0 = 2;
        goto L_0x0088;
    L_0x0069:
        r0 = "ACTION_INJECT_COOKIES";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0087;
    L_0x0071:
        r0 = 1;
        goto L_0x0088;
    L_0x0073:
        r0 = "ACTION_EXTRACT_HTML_RESOURCE";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0087;
    L_0x007b:
        r0 = 3;
        goto L_0x0088;
    L_0x007d:
        r0 = "ACTION_CLEAR_DATA";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0087;
    L_0x0085:
        r0 = 0;
        goto L_0x0088;
    L_0x0087:
        r0 = -1;
    L_0x0088:
        switch(r0) {
            case 0: goto L_0x0111;
            case 1: goto L_0x00e1;
            case 2: goto L_0x0002;
            case 3: goto L_0x00c1;
            default: goto L_0x008b;
        };
    L_0x008b:
        r4 = X.AnonymousClass1pl.m13388B();
        monitor-enter(r4);
        r1 = "EXTRA_TO_TOP_FRAGMENT_ONLY";	 Catch:{ all -> 0x0156 }
        r0 = 1;	 Catch:{ all -> 0x0156 }
        r3 = r9.getBooleanExtra(r1, r0);	 Catch:{ all -> 0x0156 }
        r0 = r4.f23205B;	 Catch:{ all -> 0x0156 }
        r2 = r0.descendingIterator();	 Catch:{ all -> 0x0156 }
    L_0x009d:
        r0 = r2.hasNext();	 Catch:{ all -> 0x0156 }
        if (r0 == 0) goto L_0x00be;	 Catch:{ all -> 0x0156 }
    L_0x00a3:
        r1 = r2.next();	 Catch:{ all -> 0x0156 }
        r1 = (java.lang.ref.WeakReference) r1;	 Catch:{ all -> 0x0156 }
        r0 = r1.get();	 Catch:{ all -> 0x0156 }
        if (r0 != 0) goto L_0x00b3;	 Catch:{ all -> 0x0156 }
    L_0x00af:
        r2.remove();	 Catch:{ all -> 0x0156 }
        goto L_0x009d;	 Catch:{ all -> 0x0156 }
    L_0x00b3:
        r0 = r1.get();	 Catch:{ all -> 0x0156 }
        r0 = (com.facebook.browser.lite.BrowserLiteFragment) r0;	 Catch:{ all -> 0x0156 }
        r0.m15526M(r9);	 Catch:{ all -> 0x0156 }
        if (r3 == 0) goto L_0x009d;	 Catch:{ all -> 0x0156 }
    L_0x00be:
        monitor-exit(r4);
        goto L_0x0002;
    L_0x00c1:
        r0 = "BrowserLiteIntent.EXTRA_PREFETCH_INFO";
        r2 = r9.getParcelableExtra(r0);
        r2 = (com.facebook.browser.lite.ipc.PrefetchCacheEntry) r2;
        if (r2 == 0) goto L_0x0002;
    L_0x00cb:
        r1 = X.AnonymousClass1r0.class;
        monitor-enter(r1);
        r0 = X.AnonymousClass1r0.f23375L;	 Catch:{ all -> 0x0159 }
        if (r0 != 0) goto L_0x00d9;	 Catch:{ all -> 0x0159 }
    L_0x00d2:
        r0 = new X.1r0;	 Catch:{ all -> 0x0159 }
        r0.<init>(r8);	 Catch:{ all -> 0x0159 }
        X.AnonymousClass1r0.f23375L = r0;	 Catch:{ all -> 0x0159 }
    L_0x00d9:
        r0 = X.AnonymousClass1r0.f23375L;	 Catch:{ all -> 0x0159 }
        monitor-exit(r1);
        r0.m13439A(r2);
        goto L_0x0002;
    L_0x00e1:
        r0 = "BrowserLiteIntent.EXTRA_COOKIES";
        r5 = r9.getSerializableExtra(r0);
        r5 = (java.util.HashMap) r5;
        if (r5 != 0) goto L_0x00ed;
    L_0x00eb:
        goto L_0x0002;
    L_0x00ed:
        r0 = "EXTRA_FLUSH_COOKIES";
        r4 = r9.getBooleanExtra(r0, r6);
        r3 = f23203C;
        r2 = "Inject cookies for %d urls, flush %s";
        r1 = new java.lang.Object[r1];
        r0 = r5.size();
        r0 = java.lang.Integer.valueOf(r0);
        r1[r7] = r0;
        r0 = java.lang.Boolean.valueOf(r4);
        r1[r6] = r0;
        X.AnonymousClass1rD.m13482B(r3, r2, r1);
        X.AnonymousClass1r7.m13463H(r8, r5, r4);
        goto L_0x0002;
    L_0x0111:
        android.webkit.CookieSyncManager.createInstance(r8);	 Catch:{ Exception -> 0x0154 }
        r2 = android.webkit.CookieManager.getInstance();	 Catch:{ Exception -> 0x0154 }
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x0154 }
        r0 = 21;	 Catch:{ Exception -> 0x0154 }
        if (r1 >= r0) goto L_0x0122;	 Catch:{ Exception -> 0x0154 }
    L_0x011e:
        r2.removeAllCookie();	 Catch:{ Exception -> 0x0154 }
        goto L_0x0126;	 Catch:{ Exception -> 0x0154 }
    L_0x0122:
        r0 = 0;	 Catch:{ Exception -> 0x0154 }
        r2.removeAllCookies(r0);	 Catch:{ Exception -> 0x0126 }
    L_0x0126:
        X.AnonymousClass1r7.m13460E(r2);	 Catch:{ Exception -> 0x0154 }
        r1 = android.os.Looper.myLooper();	 Catch:{ Exception -> 0x0154 }
        r0 = android.os.Looper.getMainLooper();	 Catch:{ Exception -> 0x0154 }
        if (r1 != r0) goto L_0x0140;	 Catch:{ Exception -> 0x0154 }
    L_0x0133:
        r1 = new android.webkit.WebView;	 Catch:{ Exception -> 0x013f }
        r1.<init>(r8);	 Catch:{ Exception -> 0x013f }
        r0 = 1;	 Catch:{ Exception -> 0x013f }
        r1.clearCache(r0);	 Catch:{ Exception -> 0x013f }
        r1.destroy();	 Catch:{ Exception -> 0x013f }
    L_0x013f:
        goto L_0x0154;
    L_0x0140:
        r2 = new android.os.Handler;	 Catch:{ Exception -> 0x0154 }
        r0 = android.os.Looper.getMainLooper();	 Catch:{ Exception -> 0x0154 }
        r2.<init>(r0);	 Catch:{ Exception -> 0x0154 }
        r1 = new X.1r6;	 Catch:{ Exception -> 0x0154 }
        r1.<init>(r8);	 Catch:{ Exception -> 0x0154 }
        r0 = -1158888969; // 0xffffffffbaecc1f7 float:-0.0018063177 double:NaN;	 Catch:{ Exception -> 0x0154 }
        X.AnonymousClass0OR.D(r2, r1, r0);	 Catch:{ Exception -> 0x0154 }
    L_0x0154:
        goto L_0x0002;
    L_0x0156:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
    L_0x0159:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteIntentService.C(android.content.Intent):void");
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int J = AnonymousClass0cQ.J(this, 271823284);
        super.onStartCommand(intent, i, i2);
        AnonymousClass0cQ.K(this, 1991039513, J);
        return 3;
    }
}
