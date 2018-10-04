package X;

import android.view.ViewTreeObserver.OnPreDrawListener;
import com.facebook.common.dextricks.StartupQEsConfig;

/* renamed from: X.39i */
public final class AnonymousClass39i implements OnPreDrawListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3yT f38450B;

    public AnonymousClass39i(AnonymousClass3yT anonymousClass3yT) {
        this.f38450B = anonymousClass3yT;
    }

    public final boolean onPreDraw() {
        this.f38450B.f47648E.getViewTreeObserver().removeOnPreDrawListener(this);
        int[] iArr = new int[2];
        this.f38450B.f47648E.getLocationOnScreen(iArr);
        int i = this.f38450B.f47650G[0] - iArr[0];
        int i2 = this.f38450B.f47650G[1] - iArr[1];
        if (this.f38450B.f47651H != null) {
            float width = ((float) this.f38450B.f47651H[0]) / ((float) this.f38450B.f47648E.getWidth());
            float height = ((float) this.f38450B.f47651H[1]) / ((float) this.f38450B.f47648E.getHeight());
            this.f38450B.f47648E.setPivotX(0.0f);
            this.f38450B.f47648E.setPivotY(0.0f);
            this.f38450B.f47648E.setScaleX(width);
            this.f38450B.f47648E.setScaleY(height);
        }
        this.f38450B.f47648E.setTranslationX((float) i);
        this.f38450B.f47648E.setTranslationY((float) i2);
        this.f38450B.f47657N.L(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED).A(this.f38450B).N(1.0d);
        return true;
    }
}
