package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: X.4HT */
public final class AnonymousClass4HT implements OnTouchListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1SD f52345B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass3B8 f52346C;

    public AnonymousClass4HT(AnonymousClass1SD anonymousClass1SD, AnonymousClass3B8 anonymousClass3B8) {
        this.f52345B = anonymousClass1SD;
        this.f52346C = anonymousClass3B8;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f52345B.f18734B.bm(this.f52346C, motionEvent.getActionMasked())) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 3) {
            if (actionMasked != 1) {
                if (actionMasked == 0) {
                    view.setPressed(true);
                }
                return true;
            }
        }
        view.setPressed(false);
        return true;
    }
}
