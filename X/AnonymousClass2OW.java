package X;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;

/* renamed from: X.2OW */
public final class AnonymousClass2OW implements AnonymousClass1mb {
    /* renamed from: B */
    private final GestureDetector f29950B;

    public AnonymousClass2OW(Context context, OnGestureListener onGestureListener, Handler handler) {
        this.f29950B = new GestureDetector(context, onGestureListener, handler);
    }

    public final void qOA(boolean z) {
        this.f29950B.setIsLongpressEnabled(z);
    }

    public final boolean zDA(MotionEvent motionEvent) {
        return this.f29950B.onTouchEvent(motionEvent);
    }
}
