package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: X.38b */
public final class AnonymousClass38b implements OnTouchListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass38e f38245B;

    public AnonymousClass38b(AnonymousClass38e anonymousClass38e) {
        this.f38245B = anonymousClass38e;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f38245B.f38251F.onTouchEvent(AnonymousClass38e.m18734B(motionEvent));
    }
}
