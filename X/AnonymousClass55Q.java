package X;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.55Q */
public final class AnonymousClass55Q {
    /* renamed from: D */
    private static AnonymousClass55Q f59991D;
    /* renamed from: B */
    public final Map f59992B = new HashMap();
    /* renamed from: C */
    public final Executor f59993C;

    private AnonymousClass55Q(Executor executor) {
        this.f59993C = executor;
    }

    /* renamed from: A */
    public final void m25694A(String str, AnonymousClass5ZM anonymousClass5ZM) {
        AnonymousClass0RZ anonymousClass0RZ;
        synchronized (AnonymousClass0RZ.class) {
            if (AnonymousClass0RZ.f4724E == null) {
                Context context = AnonymousClass0EV.f1977B;
                AnonymousClass0RZ.f4724E = new AnonymousClass0RZ(context, AnonymousClass0Ra.B(context));
            }
            anonymousClass0RZ = AnonymousClass0RZ.f4724E;
        }
        this.f59992B.put(str, new AnonymousClass55I(anonymousClass0RZ, anonymousClass5ZM));
    }

    /* renamed from: B */
    public static AnonymousClass55I m25692B(AnonymousClass55Q anonymousClass55Q, String str) {
        AnonymousClass55I anonymousClass55I = (AnonymousClass55I) anonymousClass55Q.f59992B.get(str);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("category ");
        stringBuilder.append(str);
        stringBuilder.append(" does not exist");
        AnonymousClass0LH.F(anonymousClass55I, stringBuilder.toString());
        return anonymousClass55I;
    }

    /* renamed from: B */
    public final void m25695B(String str, String str2) {
        AnonymousClass0GG.B(this.f59993C, new AnonymousClass55L(this, AnonymousClass55Q.m25692B(this, str), str2), -30844086);
    }

    /* renamed from: C */
    public static AnonymousClass55Q m25693C() {
        if (f59991D == null) {
            Executor executor;
            synchronized (AnonymousClass55R.class) {
                if (AnonymousClass55R.f59994B == null) {
                    AnonymousClass0Kq B = AnonymousClass0Kq.B();
                    B.f3132F = "notifications";
                    B.f3130D = 60000;
                    AnonymousClass55R.f59994B = B.A();
                }
                executor = AnonymousClass55R.f59994B;
            }
            f59991D = new AnonymousClass55Q(executor);
        }
        return f59991D;
    }

    /* renamed from: C */
    public final void m25696C(AnonymousClass0Cm anonymousClass0Cm, String str, String str2) {
        AnonymousClass0GG.B(this.f59993C, new AnonymousClass55M(this, AnonymousClass55Q.m25692B(this, str), anonymousClass0Cm, str2), 93100121);
    }
}
