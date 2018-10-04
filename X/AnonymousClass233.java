package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.facebook.common.dextricks.StartupQEsConfig;

/* renamed from: X.233 */
public final class AnonymousClass233 implements OnPreDrawListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass234 f25442B;
    /* renamed from: C */
    public final /* synthetic */ View f25443C;

    public AnonymousClass233(AnonymousClass234 anonymousClass234, View view) {
        this.f25442B = anonymousClass234;
        this.f25443C = view;
    }

    public final boolean onPreDraw() {
        this.f25443C.getViewTreeObserver().removeOnPreDrawListener(this);
        for (int size = this.f25442B.f25444B.size() - 1; size >= 0; size--) {
            AnonymousClass3im anonymousClass3im = (AnonymousClass3im) this.f25442B.f25444B.get(size);
            anonymousClass3im.f43635B.f6947K.L(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED).N(1.0d);
            if (anonymousClass3im.f43635B.f6941E != null) {
                AnonymousClass3ik anonymousClass3ik = anonymousClass3im.f43635B.f6941E;
                if (AnonymousClass3ik.m20488D(anonymousClass3ik)) {
                    anonymousClass3ik.f43621F.A(anonymousClass3ik).L((double) AnonymousClass3ik.m20486B(anonymousClass3ik)).N((double) AnonymousClass3ik.m20487C(anonymousClass3ik));
                    anonymousClass3ik.f43622G = 3;
                }
                anonymousClass3ik.f43620E.A(anonymousClass3ik);
                anonymousClass3ik.f43619D.B((Activity) anonymousClass3ik.f43617B.getContext());
            }
        }
        return false;
    }
}
