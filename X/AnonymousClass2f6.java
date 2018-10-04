package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.internal.zzcts;
import com.google.android.gms.internal.zzctt;

/* renamed from: X.2f6 */
public final class AnonymousClass2f6 extends AnonymousClass2dh implements AnonymousClass2du {
    /* renamed from: B */
    private final AnonymousClass1za f32177B;
    /* renamed from: C */
    private Integer f32178C;
    /* renamed from: D */
    private final Bundle f32179D;
    /* renamed from: E */
    private final boolean f32180E;

    public AnonymousClass2f6(Context context, Looper looper, boolean z, AnonymousClass1za anonymousClass1za, AnonymousClass2f5 anonymousClass2f5, AnonymousClass1yr anonymousClass1yr, AnonymousClass1ys anonymousClass1ys) {
        AnonymousClass2f5 anonymousClass2f52 = anonymousClass1za.f25087F;
        Integer num = anonymousClass1za.f25088G;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", anonymousClass1za.f25089H);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        if (anonymousClass2f52 != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", anonymousClass2f52.f32173F);
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", anonymousClass2f52.f32169B);
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", anonymousClass2f52.f32170C);
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", anonymousClass2f52.f32171D);
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", anonymousClass2f52.f32172E);
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", anonymousClass2f52.f32174G);
            if (anonymousClass2f52.f32175H != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", anonymousClass2f52.f32175H.longValue());
            }
            if (anonymousClass2f52.f32176I != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", anonymousClass2f52.f32176I.longValue());
            }
        }
        this(context, looper, true, anonymousClass1za, bundle, anonymousClass1yr, anonymousClass1ys);
    }

    public AnonymousClass2f6(Context context, Looper looper, boolean z, AnonymousClass1za anonymousClass1za, Bundle bundle, AnonymousClass1yr anonymousClass1yr, AnonymousClass1ys anonymousClass1ys) {
        super(context, looper, 44, anonymousClass1za, anonymousClass1yr, anonymousClass1ys);
        this.f32180E = z;
        this.f32177B = anonymousClass1za;
        this.f32179D = bundle;
        this.f32178C = anonymousClass1za.f25088G;
    }

    /* renamed from: E */
    public final /* synthetic */ IInterface mo3622E(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof zzcts ? (zzcts) queryLocalInterface : new zzctt(iBinder);
    }

    /* renamed from: G */
    public final String mo3623G() {
        return "com.google.android.gms.signin.service.START";
    }

    /* renamed from: H */
    public final String mo3624H() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* renamed from: I */
    public final Bundle mo3625I() {
        if (!this.f25053B.getPackageName().equals(this.f32177B.f25090I)) {
            this.f32179D.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f32177B.f25090I);
        }
        return this.f32179D;
    }

    public final void JXA() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r2 = this;
        r1 = r2.m14104L();	 Catch:{ RemoteException -> 0x0010 }
        r1 = (com.google.android.gms.internal.zzcts) r1;	 Catch:{ RemoteException -> 0x0010 }
        r0 = r2.f32178C;	 Catch:{ RemoteException -> 0x0010 }
        r0 = r0.intValue();	 Catch:{ RemoteException -> 0x0010 }
        r1.vXA(r0);	 Catch:{ RemoteException -> 0x0010 }
        return;	 Catch:{ RemoteException -> 0x0010 }
    L_0x0010:
        r1 = "SignInClientImpl";
        r0 = "Remote service probably died when clearAccountFromSessionStore is called";
        android.util.Log.w(r1, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2f6.JXA():void");
    }

    public final boolean SYA() {
        return this.f32180E;
    }

    public final void ZXA(com.google.android.gms.common.internal.zzal r3, boolean r4) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r2 = this;
        r1 = r2.m14104L();	 Catch:{ RemoteException -> 0x0010 }
        r1 = (com.google.android.gms.internal.zzcts) r1;	 Catch:{ RemoteException -> 0x0010 }
        r0 = r2.f32178C;	 Catch:{ RemoteException -> 0x0010 }
        r0 = r0.intValue();	 Catch:{ RemoteException -> 0x0010 }
        r1.XXA(r3, r0, r4);	 Catch:{ RemoteException -> 0x0010 }
        return;	 Catch:{ RemoteException -> 0x0010 }
    L_0x0010:
        r1 = "SignInClientImpl";
        r0 = "Remote service probably died when saveDefaultAccount is called";
        android.util.Log.w(r1, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2f6.ZXA(com.google.android.gms.common.internal.zzal, boolean):void");
    }

    public final void connect() {
        bXA(new AnonymousClass1hp(this));
    }

    public final void iXA(com.google.android.gms.internal.zzctq r6) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r5 = this;
        r0 = "Expecting a valid ISignInCallbacks";
        X.AnonymousClass1Ew.E(r6, r0);
        r0 = r5.f32177B;	 Catch:{ RemoteException -> 0x003a }
        r4 = r0.m14110A();	 Catch:{ RemoteException -> 0x003a }
        r3 = 0;	 Catch:{ RemoteException -> 0x003a }
        r1 = "<<default account>>";	 Catch:{ RemoteException -> 0x003a }
        r0 = r4.name;	 Catch:{ RemoteException -> 0x003a }
        r0 = r1.equals(r0);	 Catch:{ RemoteException -> 0x003a }
        if (r0 == 0) goto L_0x0020;	 Catch:{ RemoteException -> 0x003a }
    L_0x0016:
        r0 = r5.f25053B;	 Catch:{ RemoteException -> 0x003a }
        r0 = X.AnonymousClass1yd.m13977B(r0);	 Catch:{ RemoteException -> 0x003a }
        r3 = r0.m13984A();	 Catch:{ RemoteException -> 0x003a }
    L_0x0020:
        r2 = new com.google.android.gms.common.internal.zzbp;	 Catch:{ RemoteException -> 0x003a }
        r0 = r5.f32178C;	 Catch:{ RemoteException -> 0x003a }
        r0 = r0.intValue();	 Catch:{ RemoteException -> 0x003a }
        r2.<init>(r4, r0, r3);	 Catch:{ RemoteException -> 0x003a }
        r1 = r5.m14104L();	 Catch:{ RemoteException -> 0x003a }
        r1 = (com.google.android.gms.internal.zzcts) r1;	 Catch:{ RemoteException -> 0x003a }
        r0 = new com.google.android.gms.internal.zzctv;	 Catch:{ RemoteException -> 0x003a }
        r0.<init>(r2);	 Catch:{ RemoteException -> 0x003a }
        r1.jXA(r0, r6);	 Catch:{ RemoteException -> 0x003a }
    L_0x0039:
        return;	 Catch:{ RemoteException -> 0x003a }
    L_0x003a:
        r2 = move-exception;
        r1 = "SignInClientImpl";
        r0 = "Remote service probably died when signIn is called";
        android.util.Log.w(r1, r0);
        r1 = new com.google.android.gms.internal.zzctx;	 Catch:{ RemoteException -> 0x004d }
        r0 = 8;	 Catch:{ RemoteException -> 0x004d }
        r1.<init>(r0);	 Catch:{ RemoteException -> 0x004d }
        r6.tXA(r1);	 Catch:{ RemoteException -> 0x004d }
        goto L_0x0039;	 Catch:{ RemoteException -> 0x004d }
    L_0x004d:
        r1 = "SignInClientImpl";
        r0 = "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.";
        android.util.Log.wtf(r1, r0, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2f6.iXA(com.google.android.gms.internal.zzctq):void");
    }
}
