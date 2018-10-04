package X;

import android.net.Uri;

/* renamed from: X.3pv */
public final class AnonymousClass3pv implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3pz f45071B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass1c0 f45072C;
    /* renamed from: D */
    public final /* synthetic */ String f45073D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass3px f45074E;

    public AnonymousClass3pv(AnonymousClass3pz anonymousClass3pz, AnonymousClass1c0 anonymousClass1c0, String str, AnonymousClass3px anonymousClass3px) {
        this.f45071B = anonymousClass3pz;
        this.f45072C = anonymousClass1c0;
        this.f45073D = str;
        this.f45074E = anonymousClass3px;
    }

    public final void run() {
        this.f45072C.Z(Uri.parse(this.f45073D));
        AnonymousClass0OR.D(this.f45071B.f45104Q, new AnonymousClass3pu(this), 1049061697);
    }
}
