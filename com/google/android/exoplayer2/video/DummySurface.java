package com.google.android.exoplayer2.video;

import X.AnonymousClass2yO;
import X.AnonymousClass2yi;
import X.AnonymousClass2ym;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

public final class DummySurface extends Surface {
    /* renamed from: D */
    private static int f36568D;
    /* renamed from: E */
    private static boolean f36569E;
    /* renamed from: B */
    private final AnonymousClass2ym f36570B;
    /* renamed from: C */
    private boolean f36571C;

    public DummySurface(AnonymousClass2ym anonymousClass2ym, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f36570B = anonymousClass2ym;
    }

    /* renamed from: B */
    public static synchronized boolean m18117B(Context context) {
        boolean z;
        synchronized (DummySurface.class) {
            z = true;
            if (!f36569E) {
                f36568D = AnonymousClass2yi.f36552F < 24 ? 0 : m18119D(context);
                f36569E = true;
            }
            if (f36568D == 0) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: C */
    public static com.google.android.exoplayer2.video.DummySurface m18118C(android.content.Context r5, boolean r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = X.AnonymousClass2yi.f36552F;
        r0 = 17;
        if (r1 < r0) goto L_0x006f;
    L_0x0006:
        r4 = 0;
        if (r6 == 0) goto L_0x0012;
    L_0x0009:
        r0 = m18117B(r5);
        if (r0 == 0) goto L_0x0010;
    L_0x000f:
        goto L_0x0012;
    L_0x0010:
        r0 = 0;
        goto L_0x0013;
    L_0x0012:
        r0 = 1;
    L_0x0013:
        X.AnonymousClass2yO.m18017F(r0);
        r3 = new X.2ym;
        r3.<init>();
        if (r6 == 0) goto L_0x001f;
    L_0x001d:
        r4 = f36568D;
    L_0x001f:
        r3.start();
        r1 = new android.os.Handler;
        r0 = r3.getLooper();
        r1.<init>(r0, r3);
        r3.f36564C = r1;
        r1 = new X.2yU;
        r0 = r3.f36564C;
        r1.<init>(r0);
        r3.f36563B = r1;
        monitor-enter(r3);
        r2 = r3.f36564C;	 Catch:{ all -> 0x0078 }
        r0 = 1;	 Catch:{ all -> 0x0078 }
        r1 = 0;	 Catch:{ all -> 0x0078 }
        r0 = r2.obtainMessage(r0, r4, r1);	 Catch:{ all -> 0x0078 }
        r0.sendToTarget();	 Catch:{ all -> 0x0078 }
    L_0x0042:
        r0 = r3.f36567F;	 Catch:{ all -> 0x0078 }
        if (r0 != 0) goto L_0x0054;	 Catch:{ all -> 0x0078 }
    L_0x0046:
        r0 = r3.f36566E;	 Catch:{ all -> 0x0078 }
        if (r0 != 0) goto L_0x0054;	 Catch:{ all -> 0x0078 }
    L_0x004a:
        r0 = r3.f36565D;	 Catch:{ all -> 0x0078 }
        if (r0 != 0) goto L_0x0054;	 Catch:{ all -> 0x0078 }
    L_0x004e:
        r3.wait();	 Catch:{ InterruptedException -> 0x0052 }
        goto L_0x0042;	 Catch:{ InterruptedException -> 0x0052 }
    L_0x0052:
        r1 = 1;
        goto L_0x0042;
    L_0x0054:
        monitor-exit(r3);	 Catch:{ all -> 0x0078 }
        if (r1 == 0) goto L_0x005e;	 Catch:{ all -> 0x0078 }
    L_0x0057:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
    L_0x005e:
        r0 = r3.f36566E;
        if (r0 != 0) goto L_0x0077;
    L_0x0062:
        r0 = r3.f36565D;
        if (r0 != 0) goto L_0x0077;
    L_0x0066:
        r0 = r3.f36567F;
        r0 = X.AnonymousClass2yO.m18016E(r0);
        r0 = (com.google.android.exoplayer2.video.DummySurface) r0;
        return r0;
    L_0x006f:
        r1 = new java.lang.UnsupportedOperationException;
        r0 = "Unsupported prior to API level 17";
        r1.<init>(r0);
        throw r1;
    L_0x0077:
        throw r0;
    L_0x0078:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0078 }
        goto L_0x0077;	 Catch:{ all -> 0x0078 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.DummySurface.C(android.content.Context, boolean):com.google.android.exoplayer2.video.DummySurface");
    }

    /* renamed from: D */
    private static int m18119D(Context context) {
        if (AnonymousClass2yi.f36552F >= 26 || !("samsung".equals(AnonymousClass2yi.f36550D) || "XT1650".equals(AnonymousClass2yi.f36551E))) {
            if (AnonymousClass2yi.f36552F >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                if (eglQueryString != null) {
                    if (eglQueryString.contains("EGL_EXT_protected_content")) {
                        return eglQueryString.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
                    }
                }
            }
        }
        return 0;
    }

    public final void release() {
        super.release();
        synchronized (this.f36570B) {
            if (!this.f36571C) {
                AnonymousClass2ym anonymousClass2ym = this.f36570B;
                AnonymousClass2yO.m18016E(anonymousClass2ym.f36564C);
                anonymousClass2ym.f36564C.sendEmptyMessage(2);
                this.f36571C = true;
            }
        }
    }
}
