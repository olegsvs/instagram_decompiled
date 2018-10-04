package com.facebook.browser.lite.views;

import X.AnonymousClass0cQ;
import X.AnonymousClass1rH;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;

public class BrowserLiteGestureDelegateView extends LinearLayout {
    /* renamed from: B */
    public BrowserLiteWrapperView f23422B;
    /* renamed from: C */
    public AnonymousClass1rH f23423C;
    /* renamed from: D */
    public GestureDetector f23424D;
    /* renamed from: E */
    public boolean f23425E;
    /* renamed from: F */
    public boolean f23426F;
    /* renamed from: G */
    public int f23427G;
    /* renamed from: H */
    public boolean f23428H;
    /* renamed from: I */
    public float f23429I;
    /* renamed from: J */
    private boolean f23430J = true;

    public BrowserLiteGestureDelegateView(Context context) {
        super(context);
    }

    public BrowserLiteGestureDelegateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: B */
    private AnonymousClass1rH m13487B(MotionEvent motionEvent) {
        if (motionEvent != null) {
            BrowserLiteWrapperView browserLiteWrapperView = this.f23422B;
            if (browserLiteWrapperView != null) {
                int[] chromeContainerLocationInWindow = browserLiteWrapperView.getChromeContainerLocationInWindow();
                if (chromeContainerLocationInWindow != null) {
                    if (((float) chromeContainerLocationInWindow[1]) > motionEvent.getRawY()) {
                        return AnonymousClass1rH.ABOVE_CHROME;
                    }
                    if (motionEvent.getRawY() > ((float) (chromeContainerLocationInWindow[1] + this.f23422B.getChromeContainerHeight()))) {
                        return AnonymousClass1rH.BELOW_CHROME;
                    }
                    return AnonymousClass1rH.INSIDE_CHROME;
                }
            }
        }
        return AnonymousClass1rH.NOT_APPLICABLE;
    }

    /* renamed from: C */
    private boolean m13488C() {
        BrowserLiteWrapperView browserLiteWrapperView = this.f23422B;
        if (browserLiteWrapperView == null) {
            return false;
        }
        this.f23429I = 0.0f;
        this.f23425E = false;
        if (this.f23426F) {
            this.f23426F = false;
            return false;
        }
        if ((-browserLiteWrapperView.getY()) < ((float) this.f23422B.getUsableScreenHeight()) * 0.9f) {
            this.f23422B.m13491A(6, null);
        } else {
            BrowserLiteWrapperView browserLiteWrapperView2 = this.f23422B;
            browserLiteWrapperView2.m13492B(browserLiteWrapperView2.f23442J, 300, new DecelerateInterpolator(1.5f), null);
        }
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        BrowserLiteWrapperView browserLiteWrapperView = this.f23422B;
        if (browserLiteWrapperView != null) {
            if (this.f23430J) {
                browserLiteWrapperView.f23438F.Wm();
                this.f23430J = false;
            }
            if (this.f23428H) {
                if (!this.f23422B.f23439G) {
                    int action = motionEvent.getAction();
                    if (action != 3) {
                        switch (action) {
                            case 0:
                                if (!this.f23422B.f23439G) {
                                    this.f23423C = m13487B(motionEvent);
                                    this.f23422B.m13493C();
                                    break;
                                }
                                break;
                            case 1:
                                break;
                            default:
                                break;
                        }
                    }
                    m13488C();
                    return this.f23424D.onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.M(this, -1134559594);
        boolean z = false;
        if (this.f23428H) {
            BrowserLiteWrapperView browserLiteWrapperView = this.f23422B;
            if (browserLiteWrapperView != null) {
                if (!browserLiteWrapperView.f23439G) {
                    boolean onTouchEvent = this.f23424D.onTouchEvent(motionEvent);
                    int action = motionEvent.getAction();
                    if (action != 3) {
                        switch (action) {
                            case 0:
                                AnonymousClass0cQ.L(this, -1808168411, M);
                                return true;
                            case 1:
                                break;
                            default:
                                if (onTouchEvent || super.onTouchEvent(motionEvent)) {
                                    z = true;
                                }
                                AnonymousClass0cQ.L(this, 1411668866, M);
                                return z;
                        }
                    }
                    boolean C = m13488C();
                    AnonymousClass0cQ.L(this, 332757770, M);
                    return C;
                }
            }
        }
        AnonymousClass0cQ.L(this, -1461012081, M);
        return false;
    }
}
