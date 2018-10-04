package X;

import android.animation.LayoutTransition;
import android.animation.LayoutTransition.TransitionListener;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.67X */
public final class AnonymousClass67X implements TransitionListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass67Y f71980B;
    /* renamed from: C */
    public final /* synthetic */ boolean f71981C;

    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
    }

    public AnonymousClass67X(AnonymousClass67Y anonymousClass67Y, boolean z) {
        this.f71980B = anonymousClass67Y;
        this.f71981C = z;
    }

    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        if (!this.f71981C) {
            this.f71980B.f71982B.f71987B.setVisibility(0);
        }
    }
}
