package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.instagram.business.insights.ui.InsightsEducationView;

/* renamed from: X.34l */
public final class AnonymousClass34l implements OnTouchListener {
    public AnonymousClass34l(InsightsEducationView insightsEducationView) {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }
}
