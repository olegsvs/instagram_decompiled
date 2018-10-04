package X;

import android.os.Handler;

/* renamed from: X.26S */
public final class AnonymousClass26S {
    /* renamed from: B */
    public final Handler f26022B;
    /* renamed from: C */
    public Object f26023C;
    /* renamed from: D */
    public final AnonymousClass26R f26024D;
    /* renamed from: E */
    public final Runnable f26025E;
    /* renamed from: F */
    private final long f26026F;

    public AnonymousClass26S(Handler handler, AnonymousClass26R anonymousClass26R) {
        this(handler, anonymousClass26R, 300);
    }

    public AnonymousClass26S(Handler handler, AnonymousClass26R anonymousClass26R, long j) {
        this.f26025E = new AnonymousClass26Q(this);
        this.f26022B = handler;
        this.f26024D = anonymousClass26R;
        this.f26026F = j;
    }

    /* renamed from: A */
    public final boolean m14436A(Object obj) {
        if (AnonymousClass0LQ.B(obj, this.f26023C)) {
            return false;
        }
        AnonymousClass0OR.G(this.f26022B, this.f26025E, 1421184451);
        this.f26023C = obj;
        AnonymousClass0OR.F(this.f26022B, this.f26025E, this.f26026F, 1822208446);
        return true;
    }
}
