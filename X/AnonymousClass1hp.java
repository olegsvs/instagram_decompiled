package X;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.1hp */
public final class AnonymousClass1hp implements AnonymousClass1zX {
    /* renamed from: B */
    private /* synthetic */ AnonymousClass1zS f21556B;

    public AnonymousClass1hp(AnonymousClass1zS anonymousClass1zS) {
        this.f21556B = anonymousClass1zS;
    }

    public final void IYA(ConnectionResult connectionResult) {
        if (connectionResult.m10285B()) {
            AnonymousClass1zS anonymousClass1zS = this.f21556B;
            anonymousClass1zS.YXA(null, anonymousClass1zS.M());
            return;
        }
        if (this.f21556B.f25065N != null) {
            this.f21556B.f25065N.bh(connectionResult);
        }
    }
}
