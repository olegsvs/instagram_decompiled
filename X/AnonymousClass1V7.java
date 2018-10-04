package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.facebook.C0164R;

/* renamed from: X.1V7 */
public final class AnonymousClass1V7 implements OnTouchListener {
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view.getId() == C0164R.id.edit_text) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            if ((motionEvent.getAction() & 255) == 1) {
                view.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return false;
    }
}
