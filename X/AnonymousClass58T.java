package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: X.58T */
public final class AnonymousClass58T implements OnTouchListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass58c f60465B;

    public AnonymousClass58T(AnonymousClass58c anonymousClass58c) {
        this.f60465B = anonymousClass58c;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && !this.f60465B.f60484I.C()) {
            AnonymousClass0CC.aJ.E();
        }
        return false;
    }
}
