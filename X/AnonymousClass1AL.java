package X;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: X.1AL */
public abstract class AnonymousClass1AL extends SimpleOnGestureListener {
    /* renamed from: B */
    private boolean f15260B;
    /* renamed from: C */
    private int f15261C;

    /* renamed from: A */
    public boolean mo2185A() {
        return false;
    }

    /* renamed from: B */
    public void mo2186B(MotionEvent motionEvent) {
    }

    /* renamed from: C */
    public void mo2187C(MotionEvent motionEvent) {
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onDown(MotionEvent motionEvent) {
        this.f15260B = false;
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.f15260B) {
            return false;
        }
        if (mo2185A()) {
            int i = this.f15261C + 1;
            this.f15261C = i;
            if (i == 3) {
                mo2187C(motionEvent);
                this.f15261C = 0;
                this.f15260B = true;
                return true;
            }
        }
        mo2186B(motionEvent);
        this.f15260B = true;
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (this.f15260B || motionEvent.getEventTime() - motionEvent.getDownTime() <= ((long) ViewConfiguration.getDoubleTapTimeout())) {
            return false;
        }
        mo2186B(motionEvent);
        this.f15260B = true;
        return true;
    }
}
