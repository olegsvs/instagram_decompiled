package com.instagram.ui.viewpager;

import X.AnonymousClass1LZ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

public class BakeOffViewPager extends AnonymousClass1LZ {
    /* renamed from: B */
    private boolean f61924B;
    /* renamed from: C */
    private boolean f61925C;
    /* renamed from: D */
    private float f61926D;
    /* renamed from: E */
    private float f61927E;
    /* renamed from: F */
    private boolean f61928F;
    /* renamed from: G */
    private float f61929G;

    public BakeOffViewPager(Context context) {
        super(context);
    }

    public BakeOffViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f61929G = (float) ViewConfiguration.get(context).getScaledPagingTouchSlop();
    }

    /* renamed from: B */
    private void m26190B(MotionEvent motionEvent) {
        if (!this.f61925C) {
            if (!this.f61924B) {
                float rawX = this.f61926D - motionEvent.getRawX();
                float rawY = this.f61927E - motionEvent.getRawY();
                Object obj = Math.sqrt((double) ((rawX * rawX) + (rawY * rawY))) > ((double) this.f61929G) ? 1 : null;
                double toDegrees = Math.toDegrees(Math.atan((double) Math.abs(rawY / rawX)));
                if (obj == null) {
                    return;
                }
                if (toDegrees < 90.0d) {
                    this.f61924B = true;
                } else {
                    this.f61925C = true;
                }
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                m26190B(motionEvent);
                if (!this.f61924B) {
                    return false;
                }
                if (!this.f61928F) {
                    this.f61928F = true;
                    return false;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        this.f61924B = false;
        this.f61925C = false;
        this.f61926D = motionEvent.getRawX();
        this.f61927E = motionEvent.getRawY();
        this.f61928F = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
