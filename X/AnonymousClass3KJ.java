package X;

import android.content.Context;

/* renamed from: X.3KJ */
public final class AnonymousClass3KJ implements AnonymousClass0GA {
    /* renamed from: B */
    public final /* synthetic */ Context f40163B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass3KA f40164C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Cm f40165D;

    public final String getName() {
        return "runSelfUpdateJob";
    }

    public final void onFinish() {
    }

    public final void onStart() {
    }

    public AnonymousClass3KJ(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass3KA anonymousClass3KA) {
        this.f40163B = context;
        this.f40165D = anonymousClass0Cm;
        this.f40164C = anonymousClass3KA;
    }

    public final void run() {
        new AnonymousClass3K9(this.f40163B, this.f40165D, this.f40164C).m19398A(true);
    }
}
