package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.facebook.forker.Process;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2D6 */
public final class AnonymousClass2D6 implements AnonymousClass0G2 {
    /* renamed from: L */
    private static boolean f27533L;
    /* renamed from: B */
    public final Map f27534B = new HashMap();
    /* renamed from: C */
    private final AnonymousClass1yR f27535C;
    /* renamed from: D */
    private final AnonymousClass09M f27536D;
    /* renamed from: E */
    private final AnonymousClass2dd f27537E;
    /* renamed from: F */
    private final Context f27538F;
    /* renamed from: G */
    private final AnonymousClass2Zp f27539G;
    /* renamed from: H */
    private final AnonymousClass1M0 f27540H;
    /* renamed from: I */
    private final AnonymousClass1yU f27541I;
    /* renamed from: J */
    private final AnonymousClass09Y f27542J;
    /* renamed from: K */
    private final AnonymousClass09Z f27543K;

    private AnonymousClass2D6(Context context, AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass09Y anonymousClass09Y;
        this.f27538F = context;
        this.f27540H = AnonymousClass25g.f25787B;
        Context context2 = this.f27538F;
        synchronized (AnonymousClass0Ba.class) {
            if (AnonymousClass0Ba.f1387C == null) {
                if (context2.getApplicationContext() != null) {
                    context2 = context2.getApplicationContext();
                }
                AnonymousClass0Ba.f1387C = new AnonymousClass0Ba(context2);
            }
            anonymousClass09Y = AnonymousClass0Ba.f1387C;
        }
        this.f27542J = anonymousClass09Y;
        this.f27536D = new AnonymousClass09M(this.f27538F.getApplicationInfo().dataDir);
        this.f27543K = new AnonymousClass09Z(this.f27538F, this.f27542J, this.f27536D);
        AnonymousClass1yU F = m14713F(anonymousClass0Cm);
        this.f27541I = F;
        F.mo3036A();
        this.f27539G = new AnonymousClass2Zp(this.f27538F, this.f27540H, this.f27541I, anonymousClass0Cm);
        this.f27535C = new AnonymousClass1yR(new AnonymousClass1EZ(this.f27538F).A(), this.f27538F, this.f27540H);
        this.f27537E = new AnonymousClass2dd(this.f27539G, this.f27543K, this.f27541I, this.f27535C, AnonymousClass0Fx.B(), AnonymousClass0Fx.B(), this.f27538F.getApplicationInfo().dataDir, this.f27540H, this.f27538F);
        AnonymousClass091.B(this.f27538F, 0);
    }

    /* renamed from: A */
    public final void m14715A(AnonymousClass2DE anonymousClass2DE) {
        AnonymousClass2D6 anonymousClass2D6 = this;
        AnonymousClass2DE anonymousClass2DE2 = anonymousClass2DE;
        if (AnonymousClass2D6.m14714G(this.f27538F)) {
            String[] strArr = (String[]) anonymousClass2DE.f27564E.toArray(new String[0]);
            if (!this.f27534B.containsKey(Integer.valueOf(anonymousClass2DE.f27561B)) || ((AnonymousClass2DE) this.f27534B.get(Integer.valueOf(anonymousClass2DE.f27561B))).m14719A()) {
                this.f27534B.put(Integer.valueOf(anonymousClass2DE.f27561B), anonymousClass2DE);
                Handler handler = new Handler(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
                AtomicReference atomicReference = new AtomicReference(Boolean.valueOf(false));
                anonymousClass2DE = new AnonymousClass2D4(anonymousClass2D6, atomicReference, anonymousClass2DE2);
                if (!(anonymousClass2DE2.m14719A() || anonymousClass2DE2.f27563D == null)) {
                    AnonymousClass0OR.F(handler, anonymousClass2DE, 500, -984183965);
                }
                AnonymousClass2dd anonymousClass2dd = anonymousClass2D6.f27537E;
                new AnonymousClass2SN((AnonymousClass1Fo) null, anonymousClass2dd, anonymousClass2DE2.f27566G, anonymousClass2dd.f31873D, anonymousClass2dd.f31874E).mo3026A(strArr).mo3027B().mo3028A(new AnonymousClass2Zq(anonymousClass2D6, anonymousClass2DE2, atomicReference, handler, anonymousClass2DE));
                return;
            }
            return;
        }
        anonymousClass2DE.f27562C.onFailure();
    }

    /* renamed from: B */
    public static String m14709B(int i) {
        if (i == -200) {
            return "unpack_error";
        }
        if (i == -100) {
            return "internal_error";
        }
        switch (i) {
            case -8:
                return "incompatible_with_existing_session";
            case -7:
                return "access_denied";
            case -6:
                return "network_error";
            case Process.SD_STDOUT /*-5*/:
                return "api_not_available";
            case Process.SD_PIPE /*-4*/:
                return "session_not_found";
            case Process.SD_BLACK_HOLE /*-3*/:
                return "invalid_request";
            case -2:
                return "module_unavailable";
            case -1:
                return "active_sessions_limit_exceeded";
            case 0:
                return "none";
            default:
                return String.valueOf(i);
        }
    }

    /* renamed from: C */
    public static AnonymousClass2D6 m14710C(Context context, AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass2D6 anonymousClass2D6 = (AnonymousClass2D6) anonymousClass0Cm.A(AnonymousClass2D6.class);
        if (anonymousClass2D6 != null) {
            return anonymousClass2D6;
        }
        Object anonymousClass2D62 = new AnonymousClass2D6(context.getApplicationContext(), anonymousClass0Cm);
        anonymousClass0Cm.D(AnonymousClass2D6.class, anonymousClass2D62);
        return anonymousClass2D62;
    }

    /* renamed from: D */
    public static boolean m14711D(String str) {
        if (AnonymousClass2D6.m14714G(AnonymousClass0EV.f1977B)) {
            return AnonymousClass09Q.B().F(str) ^ 1;
        }
        return false;
    }

    /* renamed from: E */
    public static boolean m14712E(AnonymousClass2D6 anonymousClass2D6) {
        String installerPackageName = anonymousClass2D6.f27538F.getPackageManager().getInstallerPackageName(anonymousClass2D6.f27538F.getPackageName());
        return installerPackageName != null && "com.android.vending".equals(installerPackageName);
    }

    /* renamed from: F */
    private AnonymousClass1yU m14713F(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0Ea anonymousClass0Ea = AnonymousClass0Ea.f1980C;
        if (AnonymousClass2D6.m14712E(this)) {
            return new AnonymousClass2SS(this.f27538F, this.f27542J, this.f27536D, new AnonymousClass2Zr(this, anonymousClass0Ea));
        }
        return new AnonymousClass2Zt(this.f27538F, new AnonymousClass2DB(anonymousClass0Cm), this.f27536D, AnonymousClass0Fx.B(), new AnonymousClass2Zs(this, anonymousClass0Ea));
    }

    /* renamed from: G */
    private static boolean m14714G(android.content.Context r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = r5.getApplicationContext();
        r0 = f27533L;
        r4 = 1;
        if (r0 != 0) goto L_0x0038;
    L_0x0009:
        f27533L = r4;
        r0 = 0;
        X.AnonymousClass091.B(r5, r0);	 Catch:{ RuntimeException -> 0x0035 }
        r3 = new X.09U;
        r2 = X.AnonymousClass25g.f25787B;
        r1 = new X.09M;
        r0 = r5.getApplicationInfo();
        r0 = r0.dataDir;
        r1.<init>(r0);
        r3.<init>(r5, r2, r1);
        monitor-enter(r3);	 Catch:{ IOException -> 0x0034 }
        r0 = r3.f1077C;	 Catch:{ all -> 0x0039 }
        java.lang.Boolean.valueOf(r0);	 Catch:{ all -> 0x0039 }
        r0 = r3.f1077C;	 Catch:{ all -> 0x0039 }
        if (r0 != 0) goto L_0x002f;	 Catch:{ all -> 0x0039 }
    L_0x002b:
        r0 = 0;	 Catch:{ all -> 0x0039 }
        X.AnonymousClass09U.B(r3, r0);	 Catch:{ all -> 0x0039 }
    L_0x002f:
        r0 = 1;	 Catch:{ all -> 0x0039 }
        r3.f1077C = r0;	 Catch:{ all -> 0x0039 }
        monitor-exit(r3);	 Catch:{ IOException -> 0x0034 }
        goto L_0x0038;	 Catch:{ IOException -> 0x0034 }
    L_0x0034:
        goto L_0x0038;
    L_0x0035:
        f27533L = r0;
        return r0;
    L_0x0038:
        return r4;
    L_0x0039:
        r0 = move-exception;	 Catch:{ IOException -> 0x0034 }
        monitor-exit(r3);	 Catch:{ IOException -> 0x0034 }
        throw r0;	 Catch:{ IOException -> 0x0034 }
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2D6.G(android.content.Context):boolean");
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.f27534B.clear();
    }
}
