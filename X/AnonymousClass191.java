package X;

import java.io.IOException;

/* renamed from: X.191 */
public final class AnonymousClass191 implements AnonymousClass0aL {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0bD f15056B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass190 f15057C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0a8 f15058D;

    public AnonymousClass191(AnonymousClass0bD anonymousClass0bD, AnonymousClass190 anonymousClass190, AnonymousClass0a8 anonymousClass0a8) {
        this.f15056B = anonymousClass0bD;
        this.f15057C = anonymousClass190;
        this.f15058D = anonymousClass0a8;
    }

    public final void DWA(AnonymousClass0Qw anonymousClass0Qw) {
        synchronized (this.f15056B.f6680B) {
            AnonymousClass0aA anonymousClass0aA = this.f15057C.f15052C;
            synchronized (anonymousClass0aA) {
                anonymousClass0aA.f6454B = anonymousClass0Qw;
            }
            if (this.f15056B.f6681C.remove(this.f15057C)) {
                this.f15056B.f6681C.addFirst(this.f15057C);
            }
        }
    }

    public final void cancel() {
        synchronized (this.f15056B.f6680B) {
            boolean remove = this.f15056B.f6681C.remove(this.f15057C);
        }
        if (remove) {
            this.f15057C.f15051B.m6622B(this.f15058D, new IOException("request cancelled"));
        }
    }
}
