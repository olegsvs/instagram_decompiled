package X;

import android.app.Activity;

/* renamed from: X.3X6 */
public final class AnonymousClass3X6 implements AnonymousClass0Ol {
    /* renamed from: B */
    public final /* synthetic */ Activity f42008B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0EE f42009C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Oh f42010D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0Cm f42011E;
    /* renamed from: F */
    public final /* synthetic */ boolean f42012F;

    public AnonymousClass3X6(AnonymousClass0Oh anonymousClass0Oh, boolean z, AnonymousClass0Cm anonymousClass0Cm, Activity activity, AnonymousClass0EE anonymousClass0EE) {
        this.f42010D = anonymousClass0Oh;
        this.f42012F = z;
        this.f42011E = anonymousClass0Cm;
        this.f42008B = activity;
        this.f42009C = anonymousClass0EE;
    }

    public final void Sm() {
        AnonymousClass0Fr.NuxFinished.B(this.f42010D).H("from_server", this.f42012F).R();
        AnonymousClass1Qv.D(this.f42011E, this.f42008B, this.f42009C);
    }
}
