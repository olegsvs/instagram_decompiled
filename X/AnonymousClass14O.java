package X;

import android.content.Context;
import java.util.Collection;

/* renamed from: X.14O */
public final class AnonymousClass14O extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0MS f13884B;
    /* renamed from: C */
    private Context f13885C;
    /* renamed from: D */
    private final AnonymousClass14P f13886D = new AnonymousClass14P();
    /* renamed from: E */
    private final boolean f13887E;

    public AnonymousClass14O(AnonymousClass0MS anonymousClass0MS, Context context, boolean z) {
        this.f13884B = anonymousClass0MS;
        this.f13885C = context;
        this.f13887E = z;
    }

    /* renamed from: A */
    public final AnonymousClass14P m9181A() {
        return this.f13886D;
    }

    /* renamed from: B */
    public final void m9182B(AnonymousClass1D3 anonymousClass1D3) {
        int I = AnonymousClass0cQ.m5859I(this, 979982396);
        if (this.f13887E) {
            AnonymousClass0IG.m2162D(this.f13885C, "QE values will take effect at next cold start");
        }
        AnonymousClass0MU anonymousClass0MU = this.f13884B.f3421B;
        Collection<AnonymousClass1D5> collection = anonymousClass1D3.f15620B;
        synchronized (anonymousClass0MU) {
            anonymousClass0MU.f3428C.clear();
            for (AnonymousClass1D5 anonymousClass1D5 : collection) {
                anonymousClass0MU.f3428C.put(anonymousClass1D5.f15625F, new AnonymousClass0MW(anonymousClass1D5));
            }
        }
        this.f13884B.m3187A();
        AnonymousClass0FZ B = AnonymousClass0FZ.m1634B();
        if (B.f2177B.getBoolean("qe_synced_with_cached_strore", false)) {
            B.f2177B.edit().putLong("qe_synced_with_server_time", AnonymousClass0Gd.m1838C()).apply();
            B.m1652R(false);
        }
        this.f13886D.m9183A();
        AnonymousClass0cQ.m5858H(this, 65666083, I);
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.m5859I(this, 429797650);
        if (this.f13887E) {
            AnonymousClass0IG.m2162D(this.f13885C, "Network error");
        }
        if (anonymousClass0Q6.m3973B()) {
            ((AnonymousClass1D3) anonymousClass0Q6.f4288C).mo2585A();
        }
        this.f13886D.m9183A();
        AnonymousClass0cQ.m5858H(this, 1744381279, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.m5859I(this, 965901670);
        m9182B((AnonymousClass1D3) obj);
        AnonymousClass0cQ.m5858H(this, -1329665730, I);
    }
}
