package X;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.instagram.nux.ui.NotificationBar;

/* renamed from: X.3Y9 */
public final class AnonymousClass3Y9 implements AnimationListener {
    /* renamed from: B */
    public final /* synthetic */ NotificationBar f42168B;

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public AnonymousClass3Y9(NotificationBar notificationBar) {
        this.f42168B = notificationBar;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f42168B.setVisibility(8);
    }
}
