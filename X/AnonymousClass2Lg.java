package X;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.2Lg */
public final class AnonymousClass2Lg extends SimpleOnGestureListener {
    /* renamed from: B */
    public final /* synthetic */ InteractiveDrawableContainer f29383B;

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public AnonymousClass2Lg(InteractiveDrawableContainer interactiveDrawableContainer) {
        this.f29383B = interactiveDrawableContainer;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        for (AnonymousClass2Lh cAA : this.f29383B.f31647G) {
            cAA.cAA(-1, null);
        }
        return true;
    }
}
