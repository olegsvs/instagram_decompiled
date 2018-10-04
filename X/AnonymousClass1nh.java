package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.1nh */
public final class AnonymousClass1nh extends Animation {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1nk f22786B;

    public AnonymousClass1nh(AnonymousClass1nk anonymousClass1nk) {
        this.f22786B = anonymousClass1nk;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        this.f22786B.setAnimationProgress(this.f22786B.f22807T + ((-this.f22786B.f22807T) * f));
        this.f22786B.m13171B(f);
    }
}
