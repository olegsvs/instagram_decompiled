package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;

/* renamed from: X.3RH */
public final class AnonymousClass3RH implements AnonymousClass0QP {
    /* renamed from: K */
    public static final AnonymousClass0e5 f41207K = AnonymousClass0e5.C(12.0d, 5.0d);
    /* renamed from: B */
    public final Context f41208B;
    /* renamed from: C */
    public AnimationSet f41209C;
    /* renamed from: D */
    public AnimationSet f41210D;
    /* renamed from: E */
    public final OnClickListener f41211E;
    /* renamed from: F */
    public View f41212F;
    /* renamed from: G */
    public final String f41213G;
    /* renamed from: H */
    public AnonymousClass0cN f41214H;
    /* renamed from: I */
    public int f41215I;
    /* renamed from: J */
    public final boolean f41216J;

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public AnonymousClass3RH(Context context, int i, OnClickListener onClickListener, boolean z) {
        this(context, context.getString(i), onClickListener, z);
    }

    public AnonymousClass3RH(Context context, String str, OnClickListener onClickListener, boolean z) {
        this.f41208B = context;
        this.f41213G = str;
        this.f41211E = onClickListener;
        this.f41216J = z;
        Resources resources = this.f41208B.getResources();
        int integer = resources.getInteger(17694721);
        int i = integer / 3;
        int integer2 = resources.getInteger(17694720);
        AnimationSet animationSet = new AnimationSet(true);
        this.f41209C = animationSet;
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        this.f41209C.addAnimation(new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, true));
        this.f41209C.setInterpolator(new OvershootInterpolator());
        this.f41209C.setStartOffset((long) i);
        this.f41209C.setDuration((long) integer);
        AnimationSet animationSet2 = new AnimationSet(true);
        this.f41210D = animationSet2;
        animationSet2.addAnimation(new AlphaAnimation(1.0f, 0.0f));
        this.f41210D.addAnimation(new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, 0.5f, 1, true));
        this.f41210D.setDuration((long) integer2);
        if (this.f41216J) {
            AnonymousClass0cN O = AnonymousClass0e6.B().C().O(f41207K);
            r0.f41214H = O;
            O.A(r0);
        }
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        View view = this.f41212F;
        if (view != null) {
            view.setTranslationY((float) anonymousClass0cN.E());
        }
    }
}
