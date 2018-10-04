package X;

import android.view.animation.LinearInterpolator;

/* renamed from: X.4gI */
public final class AnonymousClass4gI extends AnonymousClass10n {
    /* renamed from: B */
    private static final LinearInterpolator f56233B = new LinearInterpolator();

    /* renamed from: N */
    public final boolean m24737N(AnonymousClass0oo anonymousClass0oo) {
        anonymousClass0oo.f10370B.setTranslationY((float) anonymousClass0oo.f10370B.getHeight());
        anonymousClass0oo.f10370B.animate().translationY(0.0f).setInterpolator(f56233B).setDuration(250).setListener(new AnonymousClass4gG(this, anonymousClass0oo)).start();
        return false;
    }

    /* renamed from: Q */
    public final boolean m24738Q(AnonymousClass0oo anonymousClass0oo) {
        anonymousClass0oo.f10370B.setTranslationY(0.0f);
        anonymousClass0oo.f10370B.animate().translationY((float) anonymousClass0oo.f10370B.getHeight()).setInterpolator(f56233B).setDuration(250).setListener(new AnonymousClass4gH(this, anonymousClass0oo)).start();
        return false;
    }
}
