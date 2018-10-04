package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: X.62F */
public final class AnonymousClass62F implements OnTouchListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0vl f71137B;

    public AnonymousClass62F(AnonymousClass62I anonymousClass62I, AnonymousClass0vl anonymousClass0vl) {
        this.f71137B = anonymousClass0vl;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1 && ((Boolean) AnonymousClass0CC.Od.G()).booleanValue() && this.f71137B.C(motionEvent)) {
            return true;
        }
        return false;
    }
}
