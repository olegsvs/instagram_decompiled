package X;

import java.util.concurrent.Callable;

/* renamed from: X.1PI */
public final class AnonymousClass1PI implements Callable {
    public final Object call() {
        AnonymousClass0GM instance = AnonymousClass0GM.getInstance();
        if (instance != null) {
            return instance;
        }
        throw new IllegalStateException("Unable to initialize SmartLockPlugin!");
    }
}
