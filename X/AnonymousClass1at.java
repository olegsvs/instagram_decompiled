package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.1at */
public final class AnonymousClass1at extends AnimatorListenerAdapter {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass10n f20379B;
    /* renamed from: C */
    public final /* synthetic */ ViewPropertyAnimator f20380C;
    /* renamed from: D */
    public final /* synthetic */ int f20381D;
    /* renamed from: E */
    public final /* synthetic */ int f20382E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass0oo f20383F;
    /* renamed from: G */
    public final /* synthetic */ View f20384G;

    public AnonymousClass1at(AnonymousClass10n anonymousClass10n, AnonymousClass0oo anonymousClass0oo, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f20379B = anonymousClass10n;
        this.f20383F = anonymousClass0oo;
        this.f20381D = i;
        this.f20384G = view;
        this.f20382E = i2;
        this.f20380C = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        if (this.f20381D != 0) {
            this.f20384G.setTranslationX(0.0f);
        }
        if (this.f20382E != 0) {
            this.f20384G.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.f20380C.setListener(null);
        this.f20379B.m8752S(this.f20383F);
        this.f20379B.f13315F.remove(this.f20383F);
        this.f20379B.m8741W();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
