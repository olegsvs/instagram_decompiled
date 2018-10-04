package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.List;

/* renamed from: X.3NV */
public final class AnonymousClass3NV extends AnonymousClass0vP {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1VI f40637B;
    /* renamed from: C */
    public final /* synthetic */ int f40638C;
    /* renamed from: D */
    public final /* synthetic */ boolean f40639D;
    /* renamed from: E */
    public final /* synthetic */ int f40640E;
    /* renamed from: F */
    public final /* synthetic */ List f40641F;

    public AnonymousClass3NV(AnonymousClass1VI anonymousClass1VI, List list, boolean z, int i, int i2) {
        this.f40637B = anonymousClass1VI;
        this.f40641F = list;
        this.f40639D = z;
        this.f40638C = i;
        this.f40640E = i2;
    }

    public final void onAnimationEnd(Animator animator) {
        for (View alpha : this.f40641F) {
            alpha.setAlpha(1.0f);
        }
        this.f40641F.clear();
        if (this.f40639D) {
            AnonymousClass1VI anonymousClass1VI = this.f40637B;
            int i = this.f40638C;
            ViewTreeObserver viewTreeObserver = anonymousClass1VI.f19322D.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new AnonymousClass3NY(anonymousClass1VI, viewTreeObserver, i));
            anonymousClass1VI.f19323E.f8775C = false;
            anonymousClass1VI.f19320B.f9919B.iDA();
            return;
        }
        anonymousClass1VI = this.f40637B;
        i = this.f40640E;
        viewTreeObserver = anonymousClass1VI.f19322D.getViewTreeObserver();
        viewTreeObserver.addOnPreDrawListener(new AnonymousClass3NZ(anonymousClass1VI, viewTreeObserver, i));
        anonymousClass1VI.f19320B.f9919B.iDA();
    }
}
