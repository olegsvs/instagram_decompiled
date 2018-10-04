package X;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.20N */
public final class AnonymousClass20N implements Runnable {
    /* renamed from: B */
    private /* synthetic */ AnonymousClass2dn f25193B;
    /* renamed from: C */
    private /* synthetic */ ConnectionResult f25194C;

    public AnonymousClass20N(AnonymousClass2dn anonymousClass2dn, ConnectionResult connectionResult) {
        this.f25193B = anonymousClass2dn;
        this.f25194C = connectionResult;
    }

    public final void run() {
        this.f25193B.bh(this.f25194C);
    }
}
