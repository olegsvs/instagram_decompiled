package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: X.4XZ */
public final class AnonymousClass4XZ implements OnTouchListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4Xb f54983B;

    public AnonymousClass4XZ(AnonymousClass4Xb anonymousClass4Xb) {
        this.f54983B = anonymousClass4Xb;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AnonymousClass2NY.m15348B().f29712I = true;
        this.f54983B.f54986C.setOnTouchListener(null);
        return false;
    }
}
