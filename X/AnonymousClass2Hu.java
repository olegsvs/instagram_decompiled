package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.facebook.C0164R;

/* renamed from: X.2Hu */
public final class AnonymousClass2Hu implements OnPreDrawListener {
    /* renamed from: B */
    public final /* synthetic */ View f28593B;

    public AnonymousClass2Hu(View view) {
        this.f28593B = view;
    }

    public final boolean onPreDraw() {
        this.f28593B.getViewTreeObserver().removeOnPreDrawListener(this);
        if (this.f28593B.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) this.f28593B.getParent();
            int dimensionPixelOffset = this.f28593B.getResources().getDimensionPixelOffset(C0164R.dimen.empty_state_padding);
            int bottom = ((viewGroup.getBottom() - this.f28593B.getBottom()) - viewGroup.getPaddingBottom()) / 2;
            int max = Math.max(dimensionPixelOffset, this.f28593B.getPaddingBottom() + bottom);
            bottom = Math.max(dimensionPixelOffset, this.f28593B.getPaddingTop() + bottom);
            if (!(this.f28593B.getPaddingBottom() == max && this.f28593B.getPaddingTop() == bottom)) {
                AnonymousClass0Nm.f(this.f28593B, bottom);
                AnonymousClass0Nm.a(this.f28593B, max);
                return false;
            }
        }
        return true;
    }
}
