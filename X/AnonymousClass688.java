package X;

import android.view.View;
import java.io.File;

/* renamed from: X.688 */
public final class AnonymousClass688 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass68O f72058B;
    /* renamed from: C */
    public final /* synthetic */ boolean f72059C;
    /* renamed from: D */
    public final /* synthetic */ File f72060D;

    public AnonymousClass688(AnonymousClass68O anonymousClass68O, File file, boolean z) {
        this.f72058B = anonymousClass68O;
        this.f72060D = file;
        this.f72059C = z;
    }

    public final void run() {
        if (this.f72058B.f72096L != null) {
            AnonymousClass6Fy anonymousClass6Fy = this.f72058B.f72096L;
            File file = this.f72060D;
            boolean z = this.f72059C;
            if (AnonymousClass6Fy.m29658C(anonymousClass6Fy)) {
                anonymousClass6Fy.f73514R.m26325A(null);
            }
            AnonymousClass6G8 anonymousClass6G8 = anonymousClass6Fy.f73530h;
            if (anonymousClass6G8 != null) {
                if (!(anonymousClass6G8.f73583D.f73512P || file == null || ((Boolean) AnonymousClass0CC.ZR.H(anonymousClass6G8.f73592M)).booleanValue())) {
                    anonymousClass6G8.f73583D.f73526d = file.getPath();
                    AnonymousClass67b anonymousClass67b = anonymousClass6G8.f73588I;
                    if (file != null) {
                        View view = anonymousClass67b.f71998M;
                        if (view != null && view.isAttachedToWindow()) {
                            AnonymousClass14H.H(false, new View[]{anonymousClass67b.f71998M});
                            anonymousClass67b.f71999N = file;
                        }
                    }
                    anonymousClass67b.f72001P = z;
                    AnonymousClass5aa.m27728B(anonymousClass6G8.f73583D.f73501E, AnonymousClass5MJ.BROADCAST_SAVE_IMPRESSION).H("fully_recorded", z).R();
                }
                anonymousClass6G8.f73593N.m28940C();
                anonymousClass6G8.f73593N.m28941D();
            }
        }
    }
}
