package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.2yh */
public final class AnonymousClass2yh implements ThreadFactory {
    /* renamed from: B */
    public final /* synthetic */ String f36547B;

    public AnonymousClass2yh(String str) {
        this.f36547B = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f36547B);
    }
}
