package X;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import com.facebook.common.dextricks.StartupQEsConfig;

/* renamed from: X.3IT */
public final class AnonymousClass3IT extends SimpleOnGestureListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3zs f39934B;

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public AnonymousClass3IT(AnonymousClass3zs anonymousClass3zs) {
        this.f39934B = anonymousClass3zs;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        double d = (double) (((float) this.f39934B.f48096R) - f);
        double F = AnonymousClass3zs.m21936F(this.f39934B, 3000);
        double d2 = (double) this.f39934B.f48092N;
        Double.isNaN(d2);
        Double.isNaN(d);
        if (d2 - d < F) {
            d = (double) this.f39934B.f48092N;
            Double.isNaN(d);
            d -= F;
        }
        d2 = Math.max(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, d);
        AnonymousClass3zs anonymousClass3zs = this.f39934B;
        int max = Math.max(anonymousClass3zs.f48081C, (int) d2);
        int i = anonymousClass3zs.f48096R;
        if (i > max && i - anonymousClass3zs.f48081C < anonymousClass3zs.f48093O.getBackground().getIntrinsicWidth() / 2) {
            max = anonymousClass3zs.f48081C;
        }
        AnonymousClass3zs.m21940J(anonymousClass3zs, max);
        this.f39934B.f48080B.f17220Q = (int) AnonymousClass3zs.m21935E(this.f39934B);
        this.f39934B.f48080B.f17213J = true;
        this.f39934B.f48095Q = true;
        return true;
    }
}
