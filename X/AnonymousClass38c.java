package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: X.38c */
public final class AnonymousClass38c implements OnTouchListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass38e f38246B;

    public AnonymousClass38c(AnonymousClass38e anonymousClass38e) {
        this.f38246B = anonymousClass38e;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view = this.f38246B;
        view.f38248C = true;
        view.f38251F.onTouchEvent(AnonymousClass38e.m18734B(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            if (view.f38252G) {
                if (!view.f38249D) {
                    for (AnonymousClass38d Zj : view.f38247B) {
                        Zj.Zj(view, view.f38250E, view.f38254I);
                    }
                    view.f38247B.clear();
                }
                view.f38252G = false;
            }
        }
        return true;
    }
}
