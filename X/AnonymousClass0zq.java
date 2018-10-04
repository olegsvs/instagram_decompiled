package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.instagram.common.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.0zq */
public final class AnonymousClass0zq implements OnTouchListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0pI f13149B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0ph f13150C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0P7 f13151D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0m3 f13152E;
    /* renamed from: F */
    public final /* synthetic */ int f13153F;
    /* renamed from: G */
    public final /* synthetic */ int f13154G;
    /* renamed from: H */
    public final /* synthetic */ MediaFrameLayout f13155H;
    /* renamed from: I */
    private final AnonymousClass1YT f13156I = new AnonymousClass1YT(this.f13149B.f10537B, this.f13149B.f10538C, this.f13150C, this.f13155H, this.f13154G, this.f13153F, this.f13151D, this.f13152E);

    public AnonymousClass0zq(AnonymousClass0pI anonymousClass0pI, AnonymousClass0ph anonymousClass0ph, MediaFrameLayout mediaFrameLayout, int i, int i2, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3) {
        this.f13149B = anonymousClass0pI;
        this.f13150C = anonymousClass0ph;
        this.f13155H = mediaFrameLayout;
        this.f13154G = i;
        this.f13153F = i2;
        this.f13151D = anonymousClass0P7;
        this.f13152E = anonymousClass0m3;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view = this.f13156I;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 3) {
            switch (actionMasked) {
                case 0:
                    if (view.f20017G) {
                        view.f20015E.f10695N.setBackground(view.f20016F);
                        break;
                    }
                    break;
                case 1:
                    break;
                default:
                    break;
            }
        }
        if (view.f20018H.getParent() != null) {
            view.f20018H.getParent().requestDisallowInterceptTouchEvent(false);
        }
        if (view.f20017G) {
            view.f20015E.f10695N.setBackground(view.f20012B);
        }
        view.f20014D.onTouchEvent(motionEvent);
        return true;
    }
}
