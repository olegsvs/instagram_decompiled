package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewStub;
import android.widget.ImageView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.15M */
public final class AnonymousClass15M implements OnTouchListener {
    /* renamed from: B */
    public final Context f14266B;
    /* renamed from: C */
    public View f14267C;
    /* renamed from: D */
    public AnonymousClass2Ga f14268D;
    /* renamed from: E */
    public View f14269E;
    /* renamed from: F */
    public TouchInterceptorFrameLayout f14270F;
    /* renamed from: G */
    public AnonymousClass2Gd f14271G;
    /* renamed from: H */
    public ImageView f14272H;
    /* renamed from: I */
    public final ViewStub f14273I;

    public AnonymousClass15M(ViewStub viewStub) {
        this.f14266B = viewStub.getContext();
        this.f14273I = viewStub;
    }

    /* renamed from: A */
    public final void m9304A() {
        View view = this.f14267C;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f14270F.isEnabled() && motionEvent.getActionMasked() == 0) {
            this.f14270F.requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }
}
