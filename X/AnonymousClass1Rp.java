package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Rp */
public final class AnonymousClass1Rp {
    /* renamed from: B */
    public final List f18637B = new ArrayList();
    /* renamed from: C */
    public final ViewStub f18638C;
    /* renamed from: D */
    public AnimationSet f18639D;
    /* renamed from: E */
    public AnimationSet f18640E;
    /* renamed from: F */
    public ViewGroup f18641F;
    /* renamed from: G */
    private final AnonymousClass0Cm f18642G;

    public AnonymousClass1Rp(AnonymousClass0Cm anonymousClass0Cm, ViewStub viewStub) {
        this.f18638C = viewStub;
        this.f18642G = anonymousClass0Cm;
    }

    /* renamed from: A */
    public final void m11450A() {
        if (((Boolean) AnonymousClass0CC.Ha.m846H(this.f18642G)).booleanValue()) {
            if (this.f18641F == null) {
                this.f18641F = (ViewGroup) this.f18638C.inflate();
                for (int i = 0; i < this.f18641F.getChildCount(); i++) {
                    View childAt = this.f18641F.getChildAt(i);
                    childAt.setAnimation(new AnonymousClass4Ft(i, 10.0f, -10.0f));
                    this.f18637B.add(childAt);
                }
                this.f18640E = AnonymousClass1Rp.m11449C(0.0f, 1.0f, 500, 0.0f, 16.0f);
                this.f18641F.setAnimation(this.f18640E);
                AnimationSet C = AnonymousClass1Rp.m11449C(1.0f, 0.0f, 500, 16.0f, 0.0f);
                this.f18639D = C;
                C.setStartOffset(2000);
                this.f18639D.setAnimationListener(new AnonymousClass4Fw(this));
                this.f18640E.setAnimationListener(new AnonymousClass4Fv(this));
            }
            if (this.f18641F == null) {
                return;
            }
            if (this.f18639D.hasStarted()) {
                this.f18639D.start();
            } else if (this.f18640E.hasEnded()) {
                this.f18641F.clearAnimation();
                this.f18641F.startAnimation(this.f18640E);
            }
        }
    }

    /* renamed from: B */
    public static void m11448B(AnonymousClass1Rp anonymousClass1Rp) {
        anonymousClass1Rp.f18641F.clearAnimation();
        anonymousClass1Rp.f18641F.setVisibility(8);
        for (int i = 0; i < anonymousClass1Rp.f18637B.size(); i++) {
            ((View) anonymousClass1Rp.f18637B.get(i)).setAnimation(new AnonymousClass4Ft(i, 10.0f, -10.0f));
        }
    }

    /* renamed from: B */
    public final void m11451B(Runnable runnable) {
        if (this.f18641F == null) {
            runnable.run();
            return;
        }
        Animation C = AnonymousClass1Rp.m11449C(1.0f, 0.0f, 200, 16.0f, 0.0f);
        C.setAnimationListener(new AnonymousClass4Fs(this, runnable));
        this.f18641F.startAnimation(C);
    }

    /* renamed from: C */
    public static AnimationSet m11449C(float f, float f2, long j, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(new AlphaAnimation(f, f2));
        animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, f3, f4));
        animationSet.setDuration(j);
        animationSet.setFillAfter(true);
        return animationSet;
    }
}
