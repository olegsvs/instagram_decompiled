package X;

import android.content.Context;
import com.instagram.filterkit.filter.IgFilter;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.40V */
public final class AnonymousClass40V implements AnonymousClass3P4, AnonymousClass3qG {
    /* renamed from: B */
    public AnonymousClass2Vh f48275B;
    /* renamed from: C */
    public final AnonymousClass3qJ f48276C;
    /* renamed from: D */
    public volatile IgFilter f48277D;
    /* renamed from: E */
    public final AnonymousClass28b f48278E;
    /* renamed from: F */
    public volatile AnonymousClass2Vh f48279F;
    /* renamed from: G */
    public AnonymousClass1uu f48280G;
    /* renamed from: H */
    public volatile boolean f48281H = false;
    /* renamed from: I */
    public volatile AnonymousClass2Vi f48282I;
    /* renamed from: J */
    public final Queue f48283J = new ConcurrentLinkedQueue();
    /* renamed from: K */
    public final int f48284K;
    /* renamed from: L */
    private final AnonymousClass3P1 f48285L;
    /* renamed from: M */
    private boolean f48286M;
    /* renamed from: N */
    private final Object f48287N = new Object();
    /* renamed from: O */
    private final AnonymousClass28d f48288O;

    public AnonymousClass40V(AnonymousClass28b anonymousClass28b, AnonymousClass3P1 anonymousClass3P1, AnonymousClass28d anonymousClass28d) {
        this.f48278E = anonymousClass28b;
        this.f48285L = anonymousClass3P1;
        this.f48288O = anonymousClass28d;
        this.f48284K = 0;
        this.f48276C = null;
    }

    public AnonymousClass40V(Context context, AnonymousClass28b anonymousClass28b, AnonymousClass3P1 anonymousClass3P1, AnonymousClass28d anonymousClass28d, int i) {
        this.f48278E = anonymousClass28b;
        this.f48285L = anonymousClass3P1;
        this.f48288O = anonymousClass28d;
        this.f48284K = i;
        this.f48276C = new AnonymousClass3qJ(context, false);
    }

    /* renamed from: A */
    public final void m22024A() {
        synchronized (this.f48287N) {
            this.f48286M = true;
        }
    }

    public final void FQA(AnonymousClass36h anonymousClass36h) {
        AnonymousClass3qJ anonymousClass3qJ = this.f48276C;
        if (anonymousClass3qJ != null) {
            anonymousClass3qJ.m20889D(anonymousClass36h);
        }
    }

    public final void KLA() {
        AnonymousClass3qJ anonymousClass3qJ = this.f48276C;
        if (anonymousClass3qJ != null) {
            anonymousClass3qJ.m20888C();
        }
    }

    public final AnonymousClass28d cS() {
        return this.f48288O;
    }

    public final void vJA() {
        while (!this.f48283J.isEmpty()) {
            ((Runnable) this.f48283J.remove()).run();
        }
        if (this.f48279F != null) {
            if (this.f48276C != null && this.f48281H) {
                this.f48276C.m20887B(this.f48280G);
            }
            this.f48285L.Zu();
            IgFilter igFilter = this.f48277D;
            AnonymousClass28k anonymousClass28k = this.f48278E.f26570D;
            AnonymousClass2Vh anonymousClass2Vh = this.f48275B;
            if (anonymousClass2Vh == null) {
                anonymousClass2Vh = this.f48279F;
            }
            igFilter.yJA(anonymousClass28k, anonymousClass2Vh, this.f48282I);
            this.f48285L.Pu();
            synchronized (this.f48287N) {
                if (this.f48286M) {
                    AnonymousClass3qJ anonymousClass3qJ = this.f48276C;
                    if (anonymousClass3qJ != null) {
                        anonymousClass3qJ.m20886A();
                    }
                } else {
                    this.f48278E.m14569F();
                }
            }
            this.f48285L.Ru(this.f48278E);
            return;
        }
        throw new RuntimeException("Input surface was null.");
    }
}
