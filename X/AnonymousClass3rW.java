package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3rW */
public final class AnonymousClass3rW {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3rR f45422B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass2hH f45423C;
    /* renamed from: D */
    public final /* synthetic */ AtomicInteger f45424D;

    public AnonymousClass3rW(AnonymousClass3rX anonymousClass3rX, AnonymousClass2hH anonymousClass2hH, String str, AtomicInteger atomicInteger, AnonymousClass3rR anonymousClass3rR) {
        this.f45423C = anonymousClass2hH;
        this.f45424D = atomicInteger;
        this.f45422B = anonymousClass3rR;
    }

    /* renamed from: A */
    public final void m20943A(Exception exception) {
        exception.getMessage();
        boolean z = false;
        int decrementAndGet = this.f45424D.decrementAndGet();
        AnonymousClass3rR anonymousClass3rR = this.f45422B;
        AnonymousClass2hH anonymousClass2hH = this.f45423C;
        if (decrementAndGet == 0) {
            z = true;
        }
        anonymousClass3rR.m20937A(anonymousClass2hH, null, exception, z);
    }

    /* renamed from: B */
    public final void m20944B(List list) {
        boolean z = true;
        int decrementAndGet = this.f45424D.decrementAndGet();
        AnonymousClass3rR anonymousClass3rR = this.f45422B;
        AnonymousClass2hH anonymousClass2hH = this.f45423C;
        if (decrementAndGet != 0) {
            z = false;
        }
        anonymousClass3rR.m20937A(anonymousClass2hH, list, null, z);
    }
}
