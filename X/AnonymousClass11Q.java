package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.11Q */
public final class AnonymousClass11Q implements ThreadFactory {
    /* renamed from: B */
    private final AtomicInteger f13413B = new AtomicInteger(1);

    public final Thread newThread(Runnable runnable) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ModernAsyncTask #");
        stringBuilder.append(this.f13413B.getAndIncrement());
        return new Thread(runnable, stringBuilder.toString());
    }
}
