package X;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* renamed from: X.646 */
public final class AnonymousClass646 implements AnonymousClass12b {
    public final void ww(boolean z) {
    }

    public final void yDA(RecyclerView recyclerView, MotionEvent motionEvent) {
    }

    public final boolean To(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2) {
            recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return false;
    }
}
