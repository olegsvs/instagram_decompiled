package X;

import android.view.View;

/* renamed from: X.2HT */
public final class AnonymousClass2HT implements AnonymousClass14J {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass14J f28531B;
    /* renamed from: C */
    public final /* synthetic */ View f28532C;
    /* renamed from: D */
    public final /* synthetic */ int f28533D;

    public AnonymousClass2HT(View view, int i, AnonymousClass14J anonymousClass14J) {
        this.f28532C = view;
        this.f28533D = i;
        this.f28531B = anonymousClass14J;
    }

    public final void onFinish() {
        this.f28532C.setVisibility(this.f28533D);
        AnonymousClass14J anonymousClass14J = this.f28531B;
        if (anonymousClass14J != null) {
            anonymousClass14J.onFinish();
        }
    }
}
