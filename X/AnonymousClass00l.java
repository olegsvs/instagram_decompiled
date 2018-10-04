package X;

import java.util.concurrent.Executor;

/* renamed from: X.00l */
public final class AnonymousClass00l implements Executor {
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
