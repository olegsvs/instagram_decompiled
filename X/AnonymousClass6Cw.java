package X;

import android.view.View;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6Cw */
public final class AnonymousClass6Cw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5h0 f72968B;
    /* renamed from: C */
    public final /* synthetic */ AtomicBoolean f72969C;
    /* renamed from: D */
    public final /* synthetic */ List f72970D;

    public AnonymousClass6Cw(AnonymousClass5h0 anonymousClass5h0, List list, AtomicBoolean atomicBoolean) {
        this.f72968B = anonymousClass5h0;
        this.f72970D = list;
        this.f72969C = atomicBoolean;
    }

    /* renamed from: A */
    public final void m29474A() {
        AnonymousClass5h4 anonymousClass5h4 = null;
        for (AnonymousClass5h4 anonymousClass5h42 : this.f72970D) {
            AnonymousClass5h3 FS = anonymousClass5h42.FS();
            View C = FS.mo6387C();
            if (C != null) {
                AnonymousClass5h0 anonymousClass5h0;
                if (FS.m28264A(this.f72969C.get())) {
                    if (anonymousClass5h4 == null) {
                        anonymousClass5h0 = this.f72968B;
                        AnonymousClass0GG.B(anonymousClass5h0.f68165B, new AnonymousClass5gy(anonymousClass5h0, C), -814331487);
                        anonymousClass5h4 = anonymousClass5h42;
                    } else if (FS.m28267D(anonymousClass5h4)) {
                        anonymousClass5h0 = this.f72968B;
                        AnonymousClass0GG.B(anonymousClass5h0.f68165B, new AnonymousClass5gy(anonymousClass5h0, C), -814331487);
                    }
                }
                anonymousClass5h0 = this.f72968B;
                AnonymousClass0GG.B(anonymousClass5h0.f68165B, new AnonymousClass5gz(anonymousClass5h0, C), 785112655);
            }
        }
    }
}
