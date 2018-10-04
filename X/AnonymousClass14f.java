package X;

import android.support.v7.widget.RecyclerView;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: X.14f */
public final class AnonymousClass14f implements OnGlobalLayoutListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0lG f13965B;
    /* renamed from: C */
    public final /* synthetic */ int f13966C;
    /* renamed from: D */
    public final /* synthetic */ RecyclerView f13967D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0Qf f13968E;

    public AnonymousClass14f(AnonymousClass0lG anonymousClass0lG, RecyclerView recyclerView, int i, AnonymousClass0Qf anonymousClass0Qf) {
        this.f13965B = anonymousClass0lG;
        this.f13967D = recyclerView;
        this.f13966C = i;
        this.f13968E = anonymousClass0Qf;
    }

    public final void onGlobalLayout() {
        this.f13967D.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        AnonymousClass0lG anonymousClass0lG = this.f13965B;
        AnonymousClass0lG.m7244D(anonymousClass0lG, this.f13967D, this.f13966C, anonymousClass0lG.f9468L, this.f13968E);
    }
}
