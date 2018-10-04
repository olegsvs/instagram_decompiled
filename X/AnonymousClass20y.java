package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.20y */
public final class AnonymousClass20y implements ThreadFactory {
    /* renamed from: B */
    private final String f25257B;
    /* renamed from: C */
    private final AtomicInteger f25258C;
    /* renamed from: D */
    private final ThreadFactory f25259D;

    public AnonymousClass20y(String str) {
        this(str, 0);
    }

    private AnonymousClass20y(String str, int i) {
        this.f25258C = new AtomicInteger();
        this.f25259D = Executors.defaultThreadFactory();
        this.f25257B = (String) AnonymousClass1Ew.E(str, "Name must not be null");
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f25259D.newThread(new AnonymousClass1hq(runnable, 0));
        String str = this.f25257B;
        int andIncrement = this.f25258C.getAndIncrement();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 13);
        stringBuilder.append(str);
        stringBuilder.append("[");
        stringBuilder.append(andIncrement);
        stringBuilder.append("]");
        newThread.setName(stringBuilder.toString());
        return newThread;
    }
}
