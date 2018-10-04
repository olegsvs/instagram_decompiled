package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: X.677 */
public final class AnonymousClass677 implements OnTouchListener {
    /* renamed from: B */
    public final /* synthetic */ GestureDetector f71909B;

    public AnonymousClass677(AnonymousClass67B anonymousClass67B, GestureDetector gestureDetector) {
        this.f71909B = gestureDetector;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f71909B.onTouchEvent(motionEvent);
        return false;
    }
}
