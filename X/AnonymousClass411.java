package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.411 */
public final class AnonymousClass411 extends AnonymousClass3TB {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0EE f48390B;
    /* renamed from: C */
    public final /* synthetic */ AtomicInteger f48391C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Oh f48392D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0IJ f48393E;
    /* renamed from: F */
    public final /* synthetic */ Handler f48394F;
    /* renamed from: G */
    public final /* synthetic */ boolean f48395G;

    public AnonymousClass411(AnonymousClass3TC anonymousClass3TC, Context context, Handler handler, AnonymousClass0IU anonymousClass0IU, AnonymousClass0Oh anonymousClass0Oh, boolean z, AnonymousClass0IJ anonymousClass0IJ, Handler handler2, AnonymousClass0Oh anonymousClass0Oh2, AnonymousClass0EE anonymousClass0EE, AtomicInteger atomicInteger) {
        this.f48395G = z;
        this.f48393E = anonymousClass0IJ;
        this.f48394F = handler2;
        this.f48392D = anonymousClass0Oh2;
        this.f48390B = anonymousClass0EE;
        this.f48391C = atomicInteger;
        super(anonymousClass3TC, context, handler, anonymousClass0IU, anonymousClass0Oh);
    }

    /* renamed from: B */
    public final void mo4975B(AnonymousClass0Ci anonymousClass0Ci) {
        super.mo4975B(anonymousClass0Ci);
        if (this.f48395G) {
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f48393E.getActivity());
            AnonymousClass0Jr.f2946B.A();
            String id = anonymousClass0Ci.getId();
            Bundle bundle = new Bundle();
            bundle.putString("IgSessionManager.USER_ID", id);
            AnonymousClass0IL anonymousClass5bs = new AnonymousClass5bs();
            anonymousClass5bs.setArguments(bundle);
            anonymousClass0IZ.f2754D = anonymousClass5bs;
            anonymousClass0IZ.A().B();
            return;
        }
        AnonymousClass0OR.D(this.f48394F, new AnonymousClass3X7(this, anonymousClass0Ci), 2103704114);
    }

    /* renamed from: C */
    public final void mo4976C(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ci anonymousClass0Ci) {
        super.mo4976C(anonymousClass0Cm, anonymousClass0Ci);
        AnonymousClass1Qv.D(anonymousClass0Cm, this.f48393E.getActivity(), this.f48390B);
        AnonymousClass3Xh.m19902B();
        AnonymousClass3Xg.m19899B(this.f48393E.getContext()).m19900A();
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, 975648654);
        if (this.f48391C.get() == 1) {
            super.onStart();
        }
        AnonymousClass0NN D = AnonymousClass0Fr.RegisterAccountRequestSubmitted.D(AnonymousClass2Na.DONE, this.f48392D);
        String A = AnonymousClass3XA.m19854C().m19802A();
        int i = this.f48391C.get();
        D.F("retry_strategy", A);
        D.B("attempt_count", i);
        D.R();
        AnonymousClass0cQ.H(this, 1737528981, I);
    }
}
