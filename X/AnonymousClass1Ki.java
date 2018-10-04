package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.1Ki */
public final class AnonymousClass1Ki extends AnimatorListenerAdapter {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass10n f17199B;
    /* renamed from: C */
    public final /* synthetic */ ViewPropertyAnimator f17200C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0oo f17201D;
    /* renamed from: E */
    public final /* synthetic */ View f17202E;

    public AnonymousClass1Ki(AnonymousClass10n anonymousClass10n, AnonymousClass0oo anonymousClass0oo, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f17199B = anonymousClass10n;
        this.f17201D = anonymousClass0oo;
        this.f17200C = viewPropertyAnimator;
        this.f17202E = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f17200C.setListener(null);
        this.f17202E.setAlpha(1.0f);
        this.f17199B.m8753T(this.f17201D);
        this.f17199B.f13317H.remove(this.f17201D);
        this.f17199B.m8741W();
    }

    public final void onAnimationStart(Animator animator) {
        this.f17199B.m8755V(this.f17201D);
    }
}
