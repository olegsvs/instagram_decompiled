package X;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.3s9 */
public final class AnonymousClass3s9 extends AnonymousClass2kR implements ExecutorService {
    public AnonymousClass3s9(Executor executor) {
        super("SerialExecutor", 1, executor, new LinkedBlockingQueue());
    }

    public final synchronized void execute(Runnable runnable) {
        super.execute(runnable);
    }
}
