package com.instagram.camera.mpfacade.touch;

import X.AnonymousClass4KQ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class TouchEventForwardingView extends View {
    /* renamed from: B */
    public AnonymousClass4KQ f38216B;
    /* renamed from: C */
    public View f38217C;

    public TouchEventForwardingView(Context context) {
        super(context);
    }

    public TouchEventForwardingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchEventForwardingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f38217C != null) {
            AnonymousClass4KQ anonymousClass4KQ = this.f38216B;
            if (anonymousClass4KQ == null || anonymousClass4KQ.m23891A(motionEvent)) {
                if (motionEvent.getActionMasked() == 0) {
                    motionEvent = MotionEvent.obtain(motionEvent.getEventTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getX(), motionEvent.getY(), motionEvent.getPressure(), motionEvent.getSize(), motionEvent.getMetaState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags());
                }
                this.f38217C.dispatchTouchEvent(motionEvent);
                return true;
            }
        }
        return false;
    }
}
