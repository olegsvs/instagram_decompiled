package X;

import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;

/* renamed from: X.1Ya */
public final class AnonymousClass1Ya extends AnonymousClass14I {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass10J f20060B;

    public AnonymousClass1Ya(AnonymousClass10J anonymousClass10J) {
        this.f20060B = anonymousClass10J;
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
        this.f20060B.f13224C.setTag(C0164R.id.view_bouncer, null);
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        float max = (float) Math.max(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, anonymousClass0cN.m5760E());
        this.f20060B.f13224C.setPivotX(((float) this.f20060B.f13224C.getWidth()) / 2.0f);
        this.f20060B.f13224C.setPivotY(((float) this.f20060B.f13224C.getHeight()) / 2.0f);
        this.f20060B.f13224C.setScaleX(max);
        this.f20060B.f13224C.setScaleY(max);
    }
}
