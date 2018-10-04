package X;

import android.hardware.Camera.Size;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2nl */
public final class AnonymousClass2nl {
    /* renamed from: B */
    public final byte[] f34089B;
    /* renamed from: C */
    public final AtomicInteger f34090C = new AtomicInteger(0);
    /* renamed from: D */
    public final Size f34091D;
    /* renamed from: E */
    private AnonymousClass3so f34092E;

    public AnonymousClass2nl(byte[] bArr, Size size, AnonymousClass3so anonymousClass3so) {
        this.f34089B = bArr;
        this.f34091D = size;
        this.f34092E = anonymousClass3so;
    }

    /* renamed from: A */
    public final void m17212A() {
        int decrementAndGet = this.f34090C.decrementAndGet();
        if (decrementAndGet < 0) {
            throw new IllegalStateException("Too many calls to CountedReference#release");
        } else if (decrementAndGet == 0) {
            AnonymousClass2nI.m17181B(this.f34092E.f45912B, this);
        }
    }

    public final void finalize() {
        if (this.f34090C.getAndSet(0) > 0) {
            AnonymousClass2nI.m17181B(this.f34092E.f45912B, this);
        }
        super.finalize();
    }
}
