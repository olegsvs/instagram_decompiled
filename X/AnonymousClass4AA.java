package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: X.4AA */
public final class AnonymousClass4AA implements OnTouchListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4AB f51039B;

    public AnonymousClass4AA(AnonymousClass4AB anonymousClass4AB) {
        this.f51039B = anonymousClass4AB;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Object obj = (this.f51039B.f51040B || !this.f51039B.f51047I || this.f51039B.f51046H) ? null : 1;
        if ((this.f51039B.f51040B && this.f51039B.f51048J != null) || obj != null) {
            this.f51039B.f51052N.onTouch(view, motionEvent);
        }
        Object obj2 = (obj == null || !this.f51039B.f51042D) ? null : 1;
        Object obj3 = (this.f51039B.f51040B && this.f51039B.f51042D && this.f51039B.f51048J != null && this.f51039B.f51048J.zVA(this.f51039B.f51044F, this.f51039B.f51045G, motionEvent.getRawY() - this.f51039B.f51045G)) ? 1 : null;
        if (obj2 != null) {
            return true;
        }
        if (obj3 != null) {
            return true;
        }
        return false;
    }
}
