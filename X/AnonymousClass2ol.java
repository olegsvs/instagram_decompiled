package X;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: X.2ol */
public final class AnonymousClass2ol {
    /* renamed from: B */
    public final AnonymousClass2on f34355B;
    /* renamed from: C */
    public final AnonymousClass2oo f34356C = new AnonymousClass2oo(this.f34360G);
    /* renamed from: D */
    public final AnonymousClass2os f34357D;
    /* renamed from: E */
    public final AnonymousClass2ot f34358E = new AnonymousClass2ot(this.f34360G);
    /* renamed from: F */
    private final AnonymousClass2om f34359F;
    /* renamed from: G */
    private final PackageManager f34360G;

    public AnonymousClass2ol(Context context, PackageManager packageManager) {
        this.f34360G = packageManager;
        this.f34355B = new AnonymousClass2on(context, this.f34360G);
        this.f34359F = new AnonymousClass2om(this.f34360G);
        this.f34357D = new AnonymousClass2os();
    }

    /* renamed from: A */
    public final boolean m17290A(int i) {
        AnonymousClass2of B = m17291B();
        if (B == null) {
            return false;
        }
        boolean z = B.f34320C && B.f34319B >= i;
        return z;
    }

    /* renamed from: B */
    public final AnonymousClass2of m17291B() {
        return this.f34359F.m17293A();
    }
}
