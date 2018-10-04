package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.List;

/* renamed from: X.21n */
public final class AnonymousClass21n {
    /* renamed from: F */
    public static final AnonymousClass21Z f25333F = new AnonymousClass21Z("SplitInstallService");
    /* renamed from: G */
    private static final Intent f25334G = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");
    /* renamed from: B */
    public final AnonymousClass21Q f25335B;
    /* renamed from: C */
    public final Context f25336C;
    /* renamed from: D */
    public final String f25337D;
    /* renamed from: E */
    private final AnonymousClass21S f25338E;

    public AnonymousClass21n(Context context) {
        this(context, context.getPackageName());
    }

    private AnonymousClass21n(Context context, String str) {
        this.f25338E = new AnonymousClass2Ta(this);
        this.f25336C = context;
        this.f25337D = str;
        this.f25335B = new AnonymousClass21Q(context.getApplicationContext(), f25333F, "SplitInstallService", f25334G, AnonymousClass2Tb.f30808B, this.f25338E);
    }

    /* renamed from: A */
    public final AnonymousClass21r m14207A(List list, Bundle bundle) {
        f25333F.m14198A("completeInstall", new Object[0]);
        List list2 = list;
        if (list.isEmpty()) {
            Exception illegalArgumentException = new IllegalArgumentException("sessionIds must be non-empty");
            AnonymousClass2Th anonymousClass2Th = new AnonymousClass2Th();
            String str = "Exception must not be null";
            if (illegalArgumentException != null) {
                synchronized (anonymousClass2Th.f30824B) {
                    AnonymousClass2Th.m15941B(anonymousClass2Th);
                    anonymousClass2Th.f30826D = true;
                    anonymousClass2Th.f30828F = illegalArgumentException;
                }
                anonymousClass2Th.f30825C.m14213A(anonymousClass2Th);
                return anonymousClass2Th;
            }
            throw new NullPointerException(String.valueOf(str));
        }
        AnonymousClass21y anonymousClass21y = new AnonymousClass21y();
        AnonymousClass21Q anonymousClass21Q = this.f25335B;
        AnonymousClass21Q.m14190B(anonymousClass21Q, new AnonymousClass2TT(anonymousClass21Q, new AnonymousClass2Td(this, anonymousClass21y, list2, bundle, anonymousClass21y)));
        return anonymousClass21y.f25348B;
    }
}
