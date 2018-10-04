package com.instagram.ui.widget.singlescrolllistview;

import X.AnonymousClass0cN;
import X.AnonymousClass3jz;
import X.AnonymousClass3k0;
import X.AnonymousClass3k2;
import X.AnonymousClass3k3;
import X.AnonymousClass3k4;
import X.AnonymousClass3k7;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ListView;
import com.facebook.common.dextricks.StartupQEsConfig;
import java.util.List;

public class SingleScrollListView extends ListView implements AnonymousClass3k4, OnGlobalLayoutListener {
    /* renamed from: B */
    public int f48729B;
    /* renamed from: C */
    public View f48730C;
    /* renamed from: D */
    public int f48731D;
    /* renamed from: E */
    public AnonymousClass3k7 f48732E;
    /* renamed from: F */
    public int f48733F;
    /* renamed from: G */
    public boolean f48734G;
    /* renamed from: H */
    private int f48735H;
    /* renamed from: I */
    private final GestureDetector f48736I;
    /* renamed from: J */
    private double f48737J;
    /* renamed from: K */
    private boolean f48738K;

    public SingleScrollListView(Context context) {
        this(context, null);
    }

    public SingleScrollListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SingleScrollListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setChildrenDrawingOrderEnabled(true);
        this.f48736I = new GestureDetector(context, new AnonymousClass3k2(this));
    }

    /* renamed from: B */
    public static boolean m22230B(SingleScrollListView singleScrollListView) {
        if (!singleScrollListView.f48732E.m20538A()) {
            if (!singleScrollListView.f48734G) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: C */
    public static boolean m22231C(SingleScrollListView singleScrollListView, float f) {
        View view = singleScrollListView.f48730C;
        if (view == null) {
            return false;
        }
        int top = view.getTop() - (singleScrollListView.f48731D - (singleScrollListView.f48730C.getHeight() / 2));
        if (Math.abs(top) > 5) {
            AnonymousClass3k7 anonymousClass3k7 = singleScrollListView.f48732E;
            anonymousClass3k7.m20540C(top, f, anonymousClass3k7.f43898C);
            singleScrollListView.f48734G = true;
        }
        return singleScrollListView.f48732E.m20538A();
    }

    public final void CBA(AnonymousClass0cN anonymousClass0cN, AnonymousClass3jz anonymousClass3jz) {
        this.f48737J = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
    }

    /* renamed from: D */
    public static void m22232D(SingleScrollListView singleScrollListView, float f) {
        if (singleScrollListView.f48730C != null && singleScrollListView.f48732E.f43898C < singleScrollListView.getCount() - 1) {
            int bottom = singleScrollListView.f48730C.getBottom() - (singleScrollListView.f48731D - (singleScrollListView.f48729B / 2));
            AnonymousClass3k7 anonymousClass3k7 = singleScrollListView.f48732E;
            anonymousClass3k7.m20540C(bottom, f, anonymousClass3k7.f43898C + 1);
            singleScrollListView.f48734G = true;
        }
    }

    /* renamed from: E */
    public static void m22233E(SingleScrollListView singleScrollListView, float f) {
        if (singleScrollListView.f48730C != null && singleScrollListView.f48732E.f43898C > 0) {
            int top = singleScrollListView.f48730C.getTop() - (singleScrollListView.f48731D + (singleScrollListView.f48733F / 2));
            AnonymousClass3k7 anonymousClass3k7 = singleScrollListView.f48732E;
            anonymousClass3k7.m20540C(top, f, anonymousClass3k7.f43898C - 1);
            singleScrollListView.f48734G = true;
        }
    }

    /* renamed from: F */
    private void m22234F() {
        int firstVisiblePosition = this.f48732E.f43898C - getFirstVisiblePosition();
        if (firstVisiblePosition >= 0 && getChildCount() > 0) {
            this.f48730C = getChildAt(firstVisiblePosition);
            firstVisiblePosition = this.f48732E.f43898C - 1;
            if (firstVisiblePosition >= 0) {
                this.f48733F = (int) (((float) getWidth()) / ((AnonymousClass3k0) getAdapter()).getRowAspectRatio(firstVisiblePosition));
            }
            firstVisiblePosition = this.f48732E.f43898C + 1;
            if (firstVisiblePosition < getAdapter().getCount()) {
                this.f48729B = (int) (((float) getWidth()) / ((AnonymousClass3k0) getAdapter()).getRowAspectRatio(firstVisiblePosition));
            }
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        if (!this.f48736I.onTouchEvent(motionEvent)) {
            if (!m22230B(this)) {
                obj = null;
                if (obj != null && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
                    this.f48738K = m22231C(this, 0.0f);
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f48734G = false;
                }
                if (obj == null || super.dispatchTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            }
        }
        obj = 1;
        if (obj != null) {
        }
        this.f48734G = false;
        if (obj == null) {
        }
        return true;
    }

    public final int getChildDrawingOrder(int i, int i2) {
        int bottom;
        int i3 = i / 2;
        int top = getTop() + (getHeight() / 2);
        for (int i4 = 0; i4 < i; i4++) {
            View childAt = getChildAt(i4);
            int top2 = childAt.getTop();
            bottom = childAt.getBottom();
            if (top2 < top && bottom > top) {
                i3 = i4;
                break;
            }
        }
        bottom = i - 1;
        if (i2 > i3) {
            return (bottom - i2) + i3;
        }
        return i2 == i3 ? bottom : i2;
    }

    public final void onGlobalLayout() {
        getViewTreeObserver().removeGlobalOnLayoutListener(this);
        m22234F();
        this.f48731D = (getHeight() / 2) + this.f48735H;
        this.f48732E.m20539B(AnonymousClass3jz.IDLE);
        this.f48734G = false;
    }

    public void setCenterOffset(int i) {
        this.f48735H = i;
    }

    public void setScroller(AnonymousClass3k7 anonymousClass3k7) {
        List list = anonymousClass3k7.f43897B;
        if (!list.contains(this)) {
            list.add(this);
        }
        list = anonymousClass3k7.f43900E;
        if (!list.contains(this)) {
            list.add(this);
        }
        this.f48732E = anonymousClass3k7;
    }

    public void setSwipeListener(AnonymousClass3k3 anonymousClass3k3) {
    }
}
