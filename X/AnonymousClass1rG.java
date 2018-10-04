package X;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import com.facebook.browser.lite.views.BrowserLiteGestureDelegateView;

/* renamed from: X.1rG */
public final class AnonymousClass1rG extends SimpleOnGestureListener {
    /* renamed from: B */
    public final /* synthetic */ BrowserLiteGestureDelegateView f23416B;

    public AnonymousClass1rG(BrowserLiteGestureDelegateView browserLiteGestureDelegateView) {
        this.f23416B = browserLiteGestureDelegateView;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f23416B.f23422B != null) {
            if (this.f23416B.f23423C != AnonymousClass1rH.BELOW_CHROME || this.f23416B.f23422B.getWebViewScrollY() <= 0) {
                if (Math.abs(f2) >= 3500.0f) {
                    if (f2 > 0.0f) {
                        this.f23416B.f23422B.m13491A(5, null);
                    } else {
                        this.f23416B.f23422B.m13492B(this.f23416B.f23422B.getWrapperViewTopY(), (long) ((this.f23416B.f23422B.getWrapperViewTopY() - this.f23416B.f23422B.getY()) / (-f2)), null, new AnonymousClass1rF(this, f, f2));
                    }
                    this.f23416B.f23426F = true;
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z = false;
        if (this.f23416B.f23422B != null) {
            int webViewScrollY = this.f23416B.f23422B.getWebViewScrollY();
            if (this.f23416B.f23423C == AnonymousClass1rH.BELOW_CHROME && this.f23416B.f23422B.getY() == this.f23416B.f23422B.getWrapperViewTopY()) {
                if (webViewScrollY <= 0 || this.f23416B.f23425E) {
                    if ((this.f23416B.f23422B.f23438F.PX() ^ 1) != 0 && this.f23416B.f23425E) {
                        float f3 = 0.0f;
                        if (f2 > 0.0f || webViewScrollY > 0) {
                            BrowserLiteGestureDelegateView browserLiteGestureDelegateView = this.f23416B;
                            browserLiteGestureDelegateView.f23429I += f2;
                            browserLiteGestureDelegateView = this.f23416B;
                            if (browserLiteGestureDelegateView.f23429I >= 0.0f) {
                                f3 = this.f23416B.f23429I;
                            }
                            browserLiteGestureDelegateView.f23429I = f3;
                            this.f23416B.f23422B.setWebViewScrollY((int) this.f23416B.f23429I);
                            this.f23416B.f23425E = true;
                            return false;
                        }
                    }
                }
            }
            float y = this.f23416B.f23422B.getY() - f2;
            this.f23416B.f23422B.m13492B(y, 0, null, null);
            this.f23416B.f23425E = true;
            if (y > this.f23416B.f23422B.getWrapperViewTopY() + ((float) this.f23416B.f23427G)) {
                z = true;
            }
        }
        return z;
    }
}
