package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: X.3Ft */
public final class AnonymousClass3Ft implements OnTouchListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3z1 f39605B;

    public AnonymousClass3Ft(AnonymousClass3z1 anonymousClass3z1) {
        this.f39605B = anonymousClass3z1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f39605B.f47810G.requestDisallowInterceptTouchEvent(true);
        }
        return false;
    }
}
