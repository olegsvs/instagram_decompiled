package X;

import com.instagram.reels.fragment.ReelViewerFragment;

/* renamed from: X.59Q */
public final class AnonymousClass59Q implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass59T f60597B;

    public AnonymousClass59Q(AnonymousClass59T anonymousClass59T) {
        this.f60597B = anonymousClass59T;
    }

    public final void run() {
        if (AnonymousClass59T.m25859B(this.f60597B)) {
            if (this.f60597B.f60604B == AnonymousClass59R.FORWARD) {
                ReelViewerFragment.S(this.f60597B.f60606D.f70172B, null, null);
            } else {
                ReelViewerFragment.R(this.f60597B.f60606D.f70172B, null, null);
            }
            AnonymousClass59T.m25861D(this.f60597B);
            return;
        }
        this.f60597B.m25864B();
    }
}
