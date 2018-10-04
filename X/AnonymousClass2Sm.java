package X;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: X.2Sm */
public final class AnonymousClass2Sm extends AnonymousClass1zy {
    /* renamed from: B */
    private final AnonymousClass20f f30616B;
    /* renamed from: C */
    private final AnonymousClass20c f30617C;
    /* renamed from: D */
    private final AnonymousClass21G f30618D;

    public AnonymousClass2Sm(int i, AnonymousClass20f anonymousClass20f, AnonymousClass21G anonymousClass21G, AnonymousClass20c anonymousClass20c) {
        super(i);
        this.f30618D = anonymousClass21G;
        this.f30616B = anonymousClass20f;
        this.f30617C = anonymousClass20c;
    }

    /* renamed from: A */
    public final void mo3062A(AnonymousClass20B anonymousClass20B, boolean z) {
        AnonymousClass21G anonymousClass21G = this.f30618D;
        anonymousClass20B.f25166C.put(anonymousClass21G, Boolean.valueOf(z));
        anonymousClass21G.f25283B.mo3133A(new AnonymousClass2T1(anonymousClass20B, anonymousClass21G));
    }

    /* renamed from: B */
    public final void mo3063B(AnonymousClass2dn anonymousClass2dn) {
        try {
            this.f30616B.m14155A(anonymousClass2dn.f31908B, this.f30618D);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo3064C(AnonymousClass1zy.m14131B(e2));
        }
    }

    /* renamed from: C */
    public final void mo3064C(Status status) {
        this.f30618D.m14186C(this.f30617C.ZYA(status));
    }
}
