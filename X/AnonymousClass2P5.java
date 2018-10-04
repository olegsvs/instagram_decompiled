package X;

import android.content.Context;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import java.util.HashMap;

/* renamed from: X.2P5 */
public final class AnonymousClass2P5 extends AnonymousClass1qJ {
    /* renamed from: B */
    public final /* synthetic */ Context f30141B;
    /* renamed from: C */
    public final /* synthetic */ String f30142C;
    /* renamed from: D */
    public final /* synthetic */ String f30143D;
    /* renamed from: E */
    public final /* synthetic */ long f30144E;
    /* renamed from: F */
    public final /* synthetic */ HashMap f30145F;
    /* renamed from: G */
    public final /* synthetic */ long f30146G;
    /* renamed from: H */
    public final /* synthetic */ int f30147H;
    /* renamed from: I */
    public final /* synthetic */ boolean f30148I;
    /* renamed from: J */
    public final /* synthetic */ boolean f30149J;
    /* renamed from: K */
    public final /* synthetic */ boolean f30150K;
    /* renamed from: L */
    public final /* synthetic */ boolean f30151L;
    /* renamed from: M */
    public final /* synthetic */ long f30152M;
    /* renamed from: N */
    public final /* synthetic */ long f30153N;
    /* renamed from: O */
    public final /* synthetic */ HashMap f30154O;
    /* renamed from: P */
    public final /* synthetic */ long f30155P;

    public AnonymousClass2P5(AnonymousClass1qK anonymousClass1qK, String str, long j, long j2, long j3, long j4, long j5, int i, boolean z, boolean z2, boolean z3, HashMap hashMap, boolean z4, String str2, HashMap hashMap2, Context context) {
        this.f30142C = str;
        this.f30153N = j;
        this.f30155P = j2;
        this.f30144E = j3;
        this.f30152M = j4;
        this.f30146G = j5;
        this.f30147H = i;
        this.f30149J = z;
        this.f30151L = z2;
        this.f30150K = z3;
        this.f30145F = hashMap;
        this.f30148I = z4;
        this.f30143D = str2;
        this.f30154O = hashMap2;
        this.f30141B = context;
        super(anonymousClass1qK);
    }

    /* renamed from: A */
    public final void mo2867A(java.lang.Exception r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r2 = new java.io.File;
        r0 = r1.f30141B;
        r1 = r0.getFilesDir();
        r0 = "browser_ipc_failed";
        r2.<init>(r1, r0);
        r2.createNewFile();	 Catch:{ IOException -> 0x0010 }
    L_0x0010:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2P5.A(java.lang.Exception):void");
    }

    /* renamed from: B */
    public final void mo2868B(BrowserLiteCallback browserLiteCallback) {
        String str = this.f30142C;
        long j = this.f30153N;
        long j2 = this.f30155P;
        long j3 = this.f30144E;
        long j4 = this.f30152M;
        long j5 = this.f30146G;
        int i = this.f30147H;
        boolean z = this.f30149J;
        boolean z2 = this.f30151L;
        boolean z3 = this.f30150K;
        int i2 = i;
        boolean z4 = z;
        boolean z5 = z2;
        boolean z6 = z3;
        long j6 = j4;
        long j7 = j5;
        long j8 = j2;
        long j9 = j3;
        String str2 = str;
        long j10 = j;
        browserLiteCallback.Za(str2, j10, j8, j9, j6, j7, i2, z4, z5, z6, this.f30145F, this.f30148I, this.f30143D, this.f30154O);
    }
}
