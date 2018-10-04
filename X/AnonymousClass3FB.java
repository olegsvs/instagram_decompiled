package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: X.3FB */
public final class AnonymousClass3FB implements OnTouchListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3yw f39411B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass3FC f39412C;

    public AnonymousClass3FB(AnonymousClass3yw anonymousClass3yw, AnonymousClass3FC anonymousClass3FC) {
        this.f39411B = anonymousClass3yw;
        this.f39412C = anonymousClass3FC;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int E = this.f39412C.E();
        if (actionMasked == 1 || actionMasked == 3) {
            if (!this.f39411B.f39346D.WY()) {
                this.f39411B.f47796C = true;
                int i = this.f39411B.f39350H;
                this.f39411B.mo4803R(E);
                this.f39411B.f39346D.nLA(this.f39411B.f39350H, i);
            }
        }
        return true;
    }
}
