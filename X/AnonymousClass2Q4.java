package X;

import com.facebook.cameracore.util.Reference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2Q4 */
public final class AnonymousClass2Q4 implements Reference {
    /* renamed from: B */
    private final AtomicBoolean f30277B = new AtomicBoolean(false);
    /* renamed from: C */
    private final AnonymousClass2Q5 f30278C;

    public AnonymousClass2Q4(AnonymousClass2Q5 anonymousClass2Q5) {
        this.f30278C = anonymousClass2Q5;
    }

    public final void finalize() {
        if (!this.f30277B.getAndSet(true)) {
            this.f30278C.release();
        }
        super.finalize();
    }

    public final Object get() {
        if (!this.f30277B.get()) {
            return this.f30278C.get();
        }
        throw new IllegalStateException("Accessing released reference.");
    }

    public final void release() {
        if (this.f30277B.getAndSet(true)) {
            throw new IllegalStateException("Reference was already released.");
        }
        this.f30278C.release();
    }
}
