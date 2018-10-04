package X;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

/* renamed from: X.5D7 */
public final class AnonymousClass5D7 extends SimpleOnGestureListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1ZE f61233B;

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public AnonymousClass5D7(AnonymousClass1ZE anonymousClass1ZE) {
        this.f61233B = anonymousClass1ZE;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f61233B.f20184Y = f;
        return false;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AnonymousClass1ZE anonymousClass1ZE;
        if (this.f61233B.f20170K) {
            anonymousClass1ZE = this.f61233B;
            anonymousClass1ZE.f20167H += f / ((float) this.f61233B.f20177R.getWidth());
            this.f61233B.f20169J.L((double) this.f61233B.f20167H);
        } else if (this.f61233B.f20171L) {
            anonymousClass1ZE = this.f61233B;
            anonymousClass1ZE.f20168I += f2 / ((float) this.f61233B.f20177R.getHeight());
        }
        return false;
    }
}
