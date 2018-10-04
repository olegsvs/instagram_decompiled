package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.4Lw */
public final class AnonymousClass4Lw {
    /* renamed from: B */
    public final AnonymousClass0IP f53134B;
    /* renamed from: C */
    public SharedPreferences f53135C;
    /* renamed from: D */
    private final AnonymousClass4Tc f53136D;
    /* renamed from: E */
    private final AnonymousClass4Tc f53137E;

    public AnonymousClass4Lw(Context context, AnonymousClass4Tc anonymousClass4Tc, AnonymousClass4Tc anonymousClass4Tc2, AnonymousClass0IP anonymousClass0IP) {
        this.f53136D = anonymousClass4Tc;
        this.f53137E = anonymousClass4Tc2;
        this.f53134B = anonymousClass0IP;
        this.f53134B.schedule(new AnonymousClass4Ls(this, context));
    }

    /* renamed from: B */
    public static void m23973B(AnonymousClass4Lw anonymousClass4Lw) {
        if (anonymousClass4Lw.f53137E.zY()) {
            anonymousClass4Lw.f53137E.hSA(false);
        }
    }

    /* renamed from: C */
    public static void m23974C(AnonymousClass4Lw anonymousClass4Lw) {
        if (!anonymousClass4Lw.f53137E.zY()) {
            anonymousClass4Lw.f53137E.iSA(true, anonymousClass4Lw.f53136D.zY());
        }
    }
}
