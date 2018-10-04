package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.41O */
public final class AnonymousClass41O implements AnonymousClass3bA {
    /* renamed from: B */
    public AnonymousClass41Q f48443B;
    /* renamed from: C */
    private GradientSpinnerAvatarView f48444C;
    /* renamed from: D */
    private final Handler f48445D = new Handler(Looper.getMainLooper());

    public AnonymousClass41O(GradientSpinnerAvatarView gradientSpinnerAvatarView, AnonymousClass41Q anonymousClass41Q) {
        this.f48444C = gradientSpinnerAvatarView;
        this.f48443B = anonymousClass41Q;
    }

    /* renamed from: A */
    public final void m22076A(long j, boolean z) {
        this.f48445D.removeCallbacksAndMessages(null);
        AnonymousClass0OR.D(this.f48445D, new AnonymousClass3bO(this, j, z), -1204406751);
    }

    public final void fl(long j) {
        this.f48444C.D();
        m22076A(j, false);
    }

    public final void onCancel() {
        this.f48444C.D();
        this.f48445D.removeCallbacksAndMessages(null);
    }

    public final void onStart() {
        GradientSpinnerAvatarView gradientSpinnerAvatarView = this.f48444C;
        boolean A = gradientSpinnerAvatarView.f12680C.A();
        Object obj = 1;
        Object obj2 = (gradientSpinnerAvatarView.f12687J && gradientSpinnerAvatarView.f12683F.A()) ? 1 : null;
        if (!A) {
            if (obj2 == null) {
                obj = null;
            }
        }
        if (obj == null) {
            this.f48444C.C();
        }
    }

    public final void yBA(boolean z, long j) {
        this.f48444C.D();
        m22076A(j, true);
    }
}
