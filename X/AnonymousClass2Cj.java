package X;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

/* renamed from: X.2Cj */
public final class AnonymousClass2Cj extends SimpleOnGestureListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0iq f27455B;

    public AnonymousClass2Cj(AnonymousClass0iq anonymousClass0iq) {
        this.f27455B = anonymousClass0iq;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        AnonymousClass0iq.G(this.f27455B);
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AnonymousClass0iq.E(this.f27455B);
        return true;
    }
}
