package X;

import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.LinearLayout.LayoutParams;
import com.facebook.C0164R;

/* renamed from: X.59K */
public final class AnonymousClass59K implements OnPreDrawListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass59L f60581B;
    /* renamed from: C */
    public final /* synthetic */ int f60582C;

    public AnonymousClass59K(AnonymousClass59L anonymousClass59L, int i) {
        this.f60581B = anonymousClass59L;
        this.f60582C = i;
    }

    public final boolean onPreDraw() {
        this.f60581B.f60587F.getViewTreeObserver().removeOnPreDrawListener(this);
        LayoutParams layoutParams = (LayoutParams) this.f60581B.f60587F.getLayoutParams();
        layoutParams.setMargins(0, 0, 0, (((AnonymousClass0Nm.I(this.f60581B.f60584C) - this.f60582C) - this.f60581B.f60587F.getHeight()) - this.f60581B.f60584C.getResources().getDimensionPixelSize(C0164R.dimen.button_width)) / 3);
        this.f60581B.f60587F.setLayoutParams(layoutParams);
        return false;
    }
}
