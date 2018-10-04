package X;

import java.util.concurrent.Executor;

/* renamed from: X.22l */
public final class AnonymousClass22l implements Executor {
    /* renamed from: B */
    public volatile boolean f25405B = true;
    /* renamed from: C */
    public final /* synthetic */ Executor f25406C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass1Fj f25407D;

    public AnonymousClass22l(Executor executor, AnonymousClass1Fj anonymousClass1Fj) {
        this.f25406C = executor;
        this.f25407D = anonymousClass1Fj;
    }

    public final void execute(Runnable runnable) {
        try {
            AnonymousClass0GG.B(this.f25406C, new AnonymousClass22k(this, runnable), 372391508);
        } catch (Throwable e) {
            if (this.f25405B) {
                this.f25407D.C(e);
            }
        }
    }
}
