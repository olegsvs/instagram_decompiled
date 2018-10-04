package X;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;

/* renamed from: X.2TE */
public final class AnonymousClass2TE implements AnonymousClass20G {
    /* renamed from: B */
    private final AnonymousClass2dm f30730B;

    public AnonymousClass2TE(AnonymousClass2dm anonymousClass2dm) {
        this.f30730B = anonymousClass2dm;
    }

    public final AnonymousClass2dk BYA(AnonymousClass2dk anonymousClass2dk) {
        this.f30730B.f31898G.f30732C.add(anonymousClass2dk);
        return anonymousClass2dk;
    }

    public final AnonymousClass2dk FYA(AnonymousClass2dk anonymousClass2dk) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void PXA(ConnectionResult connectionResult, AnonymousClass1yl anonymousClass1yl, boolean z) {
    }

    public final void Xh(Bundle bundle) {
    }

    public final void connect() {
        AnonymousClass2dm anonymousClass2dm = this.f30730B;
        anonymousClass2dm.f31899H.lock();
        try {
            anonymousClass2dm.f31904M = new AnonymousClass2T6(anonymousClass2dm, anonymousClass2dm.f31895D, anonymousClass2dm.f31896E, anonymousClass2dm.f31897F, anonymousClass2dm.f31894C, anonymousClass2dm.f31899H, anonymousClass2dm.f31893B);
            anonymousClass2dm.f31904M.lC();
            anonymousClass2dm.f31901J.signalAll();
        } finally {
            anonymousClass2dm.f31899H.unlock();
        }
    }

    public final void fh(int i) {
    }

    public final boolean hG() {
        return true;
    }

    public final void lC() {
        for (AnonymousClass2SU gG : this.f30730B.f31900I.values()) {
            gG.gG();
        }
        this.f30730B.f31898G.f30735F = Collections.emptySet();
    }
}
