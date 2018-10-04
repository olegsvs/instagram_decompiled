package X;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2Sd */
public final class AnonymousClass2Sd implements AnonymousClass1yu {
    /* renamed from: B */
    private /* synthetic */ AnonymousClass1yv f30590B;
    /* renamed from: C */
    private /* synthetic */ AnonymousClass21G f30591C;
    /* renamed from: D */
    private /* synthetic */ AnonymousClass1zN f30592D;
    /* renamed from: E */
    private /* synthetic */ AnonymousClass1zO f30593E;

    public AnonymousClass2Sd(AnonymousClass1yv anonymousClass1yv, AnonymousClass21G anonymousClass21G, AnonymousClass1zN anonymousClass1zN, AnonymousClass1zO anonymousClass1zO) {
        this.f30590B = anonymousClass1yv;
        this.f30591C = anonymousClass21G;
        this.f30592D = anonymousClass1zN;
        this.f30593E = anonymousClass1zO;
    }

    public final void TYA(Status status) {
        if (status.m15794B()) {
            this.f30591C.m14185B(this.f30592D.CYA(this.f30590B.mo3067A(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f30591C.m14184A(this.f30593E.dYA(status));
    }
}
