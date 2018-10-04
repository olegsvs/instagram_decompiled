package X;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.1k8 */
public abstract class AnonymousClass1k8 {
    /* renamed from: B */
    public static final AnonymousClass1kA f22069B;
    /* renamed from: C */
    private static final Logger f22070C = Logger.getLogger(AnonymousClass1k8.class.getName());
    public volatile int remaining;
    public volatile Set seenExceptions = null;

    /* renamed from: A */
    public abstract void mo2720A(Set set);

    static {
        AnonymousClass1kA anonymousClass1k9;
        try {
            anonymousClass1k9 = new AnonymousClass1k9(AtomicReferenceFieldUpdater.newUpdater(AnonymousClass1k8.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(AnonymousClass1k8.class, "remaining"));
        } catch (Throwable th) {
            f22070C.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
            anonymousClass1k9 = new AnonymousClass2UK();
        }
        f22069B = anonymousClass1k9;
    }

    public AnonymousClass1k8(int i) {
        this.remaining = i;
    }
}
