package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: X.2Ce */
public final class AnonymousClass2Ce implements OnTouchListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0iq f27450B;

    public AnonymousClass2Ce(AnonymousClass0iq anonymousClass0iq) {
        this.f27450B = anonymousClass0iq;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            if (this.f27450B.f8923C) {
                this.f27450B.A(true);
            }
        }
        return false;
    }
}
