package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* renamed from: X.5uB */
public final class AnonymousClass5uB implements OnTouchListener {
    /* renamed from: B */
    private final ViewConfiguration f69853B;
    /* renamed from: C */
    private boolean f69854C;
    /* renamed from: D */
    private float f69855D;
    /* renamed from: E */
    private float f69856E;
    /* renamed from: F */
    private final ViewParent f69857F;

    public AnonymousClass5uB(Context context, ViewParent viewParent) {
        this.f69853B = ViewConfiguration.get(context);
        this.f69857F = viewParent;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f69854C = false;
            this.f69855D = motionEvent.getX();
            this.f69856E = motionEvent.getY();
            this.f69857F.requestDisallowInterceptTouchEvent(true);
        } else if (actionMasked == 2) {
            if (!this.f69854C) {
                float x = motionEvent.getX() - this.f69855D;
                float y = motionEvent.getY() - this.f69856E;
                if (((float) Math.hypot((double) x, (double) y)) > ((float) this.f69853B.getScaledTouchSlop())) {
                    this.f69854C = true;
                    if (Math.abs(x) < Math.abs(y)) {
                        this.f69857F.requestDisallowInterceptTouchEvent(false);
                    }
                }
            }
        }
        return false;
    }
}
