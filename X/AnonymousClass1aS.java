package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1aS */
public final class AnonymousClass1aS implements ThreadFactory {
    /* renamed from: B */
    private final AtomicInteger f20348B = new AtomicInteger(1);

    public AnonymousClass1aS(AnonymousClass1FD anonymousClass1FD) {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f20348B.getAndIncrement();
        StringBuilder stringBuilder = new StringBuilder(20);
        stringBuilder.append("gcm-task#");
        stringBuilder.append(andIncrement);
        Thread thread = new Thread(runnable, stringBuilder.toString());
        thread.setPriority(4);
        return thread;
    }
}
