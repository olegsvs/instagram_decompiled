package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.07M */
public final class AnonymousClass07M implements ThreadFactory {
    /* renamed from: B */
    private final String f525B;
    /* renamed from: C */
    private final AtomicInteger f526C = new AtomicInteger(1);

    public AnonymousClass07M(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("-");
        this.f525B = stringBuilder.toString();
    }

    public final Thread newThread(Runnable runnable) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f525B);
        stringBuilder.append(this.f526C.getAndIncrement());
        return new Thread(runnable, stringBuilder.toString());
    }
}
