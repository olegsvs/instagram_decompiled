package X;

import android.os.SystemClock;
import com.instagram.reels.fragment.ReelViewerFragment;

/* renamed from: X.5D6 */
public final class AnonymousClass5D6 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1ZE f61231B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass3Um f61232C;

    public AnonymousClass5D6(AnonymousClass1ZE anonymousClass1ZE, AnonymousClass3Um anonymousClass3Um) {
        this.f61231B = anonymousClass1ZE;
        this.f61232C = anonymousClass3Um;
    }

    public final void run() {
        AnonymousClass1ZE anonymousClass1ZE = this.f61231B;
        AnonymousClass3Um anonymousClass3Um = this.f61232C;
        anonymousClass1ZE.f20177R.setVisibility(8);
        anonymousClass1ZE.f20180U = AnonymousClass5DB.HIDDEN;
        if (anonymousClass1ZE.f20174O != null) {
            double elapsedRealtime = (double) (SystemClock.elapsedRealtime() - anonymousClass1ZE.f20179T);
            Double.isNaN(elapsedRealtime);
            elapsedRealtime /= 1000.0d;
            ReelViewerFragment reelViewerFragment = anonymousClass1ZE.f20174O;
            reelViewerFragment.mViewPager.setDraggingEnabled(true);
            reelViewerFragment.oDA();
            reelViewerFragment.f4344o.B(reelViewerFragment.f4312I, anonymousClass3Um.A(), elapsedRealtime);
        }
    }
}
