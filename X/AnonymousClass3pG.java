package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3pG */
public final class AnonymousClass3pG {
    /* renamed from: K */
    public static int f44934K = -1;
    /* renamed from: L */
    public static int f44935L = -2;
    /* renamed from: M */
    public static int f44936M = -3;
    /* renamed from: B */
    public int f44937B;
    /* renamed from: C */
    public int f44938C;
    /* renamed from: D */
    public long f44939D;
    /* renamed from: E */
    public List f44940E = new ArrayList();
    /* renamed from: F */
    public AnonymousClass3pF f44941F;
    /* renamed from: G */
    public long f44942G;
    /* renamed from: H */
    public String f44943H;
    /* renamed from: I */
    public String f44944I;
    /* renamed from: J */
    public int f44945J;

    public AnonymousClass3pG(int i, long j, String str) {
        this.f44938C = i;
        this.f44939D = j;
        this.f44941F = AnonymousClass3pF.RECORDED;
        this.f44944I = str;
    }

    /* renamed from: A */
    public final void m20809A(AnonymousClass3pF anonymousClass3pF) {
        this.f44941F = anonymousClass3pF;
        for (AnonymousClass3pE og : this.f44940E) {
            og.og(this, anonymousClass3pF);
        }
    }

    /* renamed from: B */
    public static X.AnonymousClass3pG m20808B(java.lang.String r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = new android.media.MediaMetadataRetriever;
        r4.<init>();
        r5 = 0;
        r3 = 0;
        r0 = new java.io.File;	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
        r0.<init>(r7);	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
        r0 = r0.getAbsolutePath();	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
        r4.setDataSource(r0);	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
        r0 = 12;	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
        r6 = r4.extractMetadata(r0);	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
        r0 = "video/avc";	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
        r0 = r0.equals(r6);	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
        if (r0 != 0) goto L_0x003c;	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
    L_0x0021:
        r0 = "video/mp4";	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
        r0 = r0.equals(r6);	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
        if (r0 != 0) goto L_0x003c;	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
    L_0x0029:
        r0 = "video/3gpp";	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
        r0 = r0.equals(r6);	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
        if (r0 != 0) goto L_0x003c;	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
    L_0x0031:
        r0 = "video/3gpp2";	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
        r0 = r0.equals(r6);	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
        if (r0 == 0) goto L_0x003a;	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
    L_0x0039:
        goto L_0x003c;	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
    L_0x003a:
        r0 = 0;	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
        goto L_0x003d;	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
    L_0x003c:
        r0 = 1;	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
    L_0x003d:
        if (r0 == 0) goto L_0x0058;	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
    L_0x003f:
        r0 = 9;	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
        r0 = r4.extractMetadata(r0);	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
        if (r0 == 0) goto L_0x004c;	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
    L_0x0047:
        r0 = java.lang.Long.parseLong(r0);	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
        goto L_0x004e;	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
    L_0x004c:
        r0 = 0;	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
    L_0x004e:
        r6 = new X.3pG;	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
        r2 = -1;	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
        r6.<init>(r2, r0, r7);	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
        r4.release();
        return r6;
    L_0x0058:
        r2 = new X.3pG;	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
        r0 = f44936M;	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
        r0 = (long) r0;	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
        r2.<init>(r3, r0, r5);	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
        r2.f44943H = r6;	 Catch:{ IllegalArgumentException -> 0x0074, RuntimeException -> 0x006b }
    L_0x0062:
        r4.release();
        return r2;
    L_0x0066:
        r0 = move-exception;
        r4.release();
        throw r0;
    L_0x006b:
        r2 = new X.3pG;	 Catch:{ all -> 0x0066 }
        r0 = f44935L;	 Catch:{ all -> 0x0066 }
        r0 = (long) r0;	 Catch:{ all -> 0x0066 }
        r2.<init>(r3, r0, r5);	 Catch:{ all -> 0x0066 }
        goto L_0x0062;	 Catch:{ all -> 0x0066 }
    L_0x0074:
        r2 = new X.3pG;	 Catch:{ all -> 0x0066 }
        r0 = f44934K;	 Catch:{ all -> 0x0066 }
        r0 = (long) r0;	 Catch:{ all -> 0x0066 }
        r2.<init>(r3, r0, r5);	 Catch:{ all -> 0x0066 }
        goto L_0x0062;	 Catch:{ all -> 0x0066 }
        */
        throw new UnsupportedOperationException("Method not decompiled: X.3pG.B(java.lang.String):X.3pG");
    }

    /* renamed from: B */
    public final void m20810B() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f44942G;
        this.f44939D = elapsedRealtime;
        for (AnonymousClass3pE lg : this.f44940E) {
            lg.lg(this, elapsedRealtime);
        }
    }
}
