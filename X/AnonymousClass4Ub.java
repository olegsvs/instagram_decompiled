package X;

import android.view.View;

/* renamed from: X.4Ub */
public final class AnonymousClass4Ub implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4Ud f54618B;
    /* renamed from: C */
    public final /* synthetic */ View f54619C;
    /* renamed from: D */
    public final /* synthetic */ View f54620D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass4Uc f54621E;

    public AnonymousClass4Ub(AnonymousClass4Ud anonymousClass4Ud, View view, AnonymousClass4Uc anonymousClass4Uc, View view2) {
        this.f54618B = anonymousClass4Ud;
        this.f54620D = view;
        this.f54621E = anonymousClass4Uc;
        this.f54619C = view2;
    }

    public final void run() {
        AnonymousClass173 anonymousClass173 = new AnonymousClass173(this.f54618B.f54628B, new AnonymousClass174(this.f54620D.getContext().getString(this.f54621E.f54627B)));
        AnonymousClass173 C = anonymousClass173.C(this.f54619C);
        C.f14642H = AnonymousClass177.ABOVE_ANCHOR;
        C.f14648N = AnonymousClass178.f14655F;
        C.f14640F = new AnonymousClass4Ua(this);
        this.f54618B.f54629C = anonymousClass173.A();
        this.f54618B.f54629C.C();
    }
}
