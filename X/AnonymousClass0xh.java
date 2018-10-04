package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.0xh */
public final class AnonymousClass0xh implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ Activity f12641B;
    /* renamed from: C */
    public final /* synthetic */ View f12642C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0m3 f12643D;
    /* renamed from: E */
    public final /* synthetic */ String f12644E;

    public AnonymousClass0xh(View view, Activity activity, String str, AnonymousClass0m3 anonymousClass0m3) {
        this.f12642C = view;
        this.f12641B = activity;
        this.f12644E = str;
        this.f12643D = anonymousClass0m3;
    }

    public final void run() {
        if (AnonymousClass0mE.m7518H(this.f12642C)) {
            AnonymousClass173 C = new AnonymousClass173(this.f12641B, new AnonymousClass174(this.f12644E)).m9461C(this.f12642C);
            C.f14642H = AnonymousClass177.ABOVE_ANCHOR;
            C.f14648N = AnonymousClass178.f14655F;
            C.f14639E = false;
            C.f14640F = new AnonymousClass3OY(this);
            C.m9459A().m7044C();
        }
    }
}
