package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: X.62L */
public final class AnonymousClass62L implements OnTouchListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass62M f71148B;

    public AnonymousClass62L(AnonymousClass62M anonymousClass62M) {
        this.f71148B = anonymousClass62M;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() <= 1 || !this.f71148B.f71149B.getCurrentActiveView().dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
