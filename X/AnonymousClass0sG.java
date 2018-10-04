package X;

import android.graphics.Rect;
import android.view.View;
import com.facebook.forker.Process;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.0sG */
public class AnonymousClass0sG {
    /* renamed from: B */
    public boolean f11412B;
    /* renamed from: C */
    private final Rect f11413C = new Rect();

    /* renamed from: A */
    public final int m8101A(float f) {
        if (this.f11412B) {
            return (int) Math.ceil((double) f);
        }
        return (int) Math.floor((double) f);
    }

    /* renamed from: B */
    public final int m8102B(float f) {
        if (this.f11412B) {
            return (int) Math.floor((double) f);
        }
        return (int) Math.ceil((double) f);
    }

    /* renamed from: C */
    public void mo1905C(ReboundViewPager reboundViewPager, View view, float f, int i) {
        view.setTranslationX((((float) reboundViewPager.getPageWidth()) * f) + (f * reboundViewPager.getPageSpacing()));
    }

    /* renamed from: D */
    public boolean mo2566D(ReboundViewPager reboundViewPager, float f, float f2) {
        int childCount = reboundViewPager.getChildCount();
        boolean z = false;
        if (childCount != 0) {
            int i = Integer.MAX_VALUE;
            int i2 = Process.WAIT_RESULT_STOPPED;
            for (int i3 = 0; i3 < childCount; i3++) {
                reboundViewPager.getChildAt(i3).getHitRect(this.f11413C);
                if (this.f11413C.contains(Math.round(f), Math.round(f2))) {
                    return true;
                }
                i = Math.min(i, this.f11413C.left);
                i2 = Math.max(i2, this.f11413C.right);
            }
            if (f >= ((float) i) && f <= ((float) i2)) {
                z = true;
            }
        }
        return z;
    }
}
