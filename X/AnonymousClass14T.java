package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.14T */
public final class AnonymousClass14T implements ThreadFactory {
    /* renamed from: B */
    private final String f13896B;
    /* renamed from: C */
    private final AtomicInteger f13897C = new AtomicInteger(1);

    public AnonymousClass14T(String str) {
        this.f13896B = str;
    }

    public final Thread newThread(Runnable runnable) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f13896B);
        stringBuilder.append(this.f13897C.getAndIncrement());
        return new Thread(runnable, stringBuilder.toString());
    }
}
