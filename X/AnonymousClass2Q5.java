package X;

import com.facebook.cameracore.util.Reference;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2Q5 */
public final class AnonymousClass2Q5 implements Reference {
    /* renamed from: B */
    public final AtomicInteger f30279B = new AtomicInteger(1);
    /* renamed from: C */
    private Object f30280C;
    /* renamed from: D */
    private AnonymousClass1sv f30281D;

    public AnonymousClass2Q5(Reference reference) {
        this.f30280C = reference.get();
        this.f30281D = new AnonymousClass2Q3(this, reference);
    }

    public AnonymousClass2Q5(Object obj, AnonymousClass1sv anonymousClass1sv) {
        this.f30280C = obj;
        this.f30281D = anonymousClass1sv;
    }

    /* renamed from: A */
    public final Reference m15651A() {
        int i = 0;
        while (i < 10) {
            int i2 = this.f30279B.get();
            if (i2 == 0) {
                throw new IllegalStateException("Trying to lock already released reference.");
            } else if (this.f30279B.compareAndSet(i2, i2 + 1)) {
                return new AnonymousClass2Q4(this);
            } else {
                i++;
            }
        }
        throw new RuntimeException("WTF: Could not lock the reference after multiple tries.");
    }

    public final void finalize() {
        if (this.f30279B.getAndSet(0) > 0) {
            this.f30281D.Tw(this, this.f30280C);
        }
        super.finalize();
    }

    public final Object get() {
        if (this.f30279B.get() > 0) {
            return this.f30280C;
        }
        throw new IllegalStateException("Accessing released reference.");
    }

    public final void release() {
        int i = 0;
        while (i < 10) {
            int i2 = this.f30279B.get();
            if (i2 == 0) {
                throw new IllegalStateException("Too many calls to CountedReference#release");
            } else if (!this.f30279B.compareAndSet(i2, i2 - 1)) {
                i++;
            } else if (i2 == 1) {
                this.f30281D.Tw(this, this.f30280C);
                return;
            } else {
                return;
            }
        }
        throw new RuntimeException("WTF: Could not release the reference after multiple tries.");
    }
}
