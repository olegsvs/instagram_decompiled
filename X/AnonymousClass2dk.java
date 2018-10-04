package X;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: X.2dk */
public abstract class AnonymousClass2dk extends AnonymousClass2Sq implements AnonymousClass203 {
    /* renamed from: B */
    public final AnonymousClass1yj f31891B;
    /* renamed from: C */
    public final AnonymousClass1yl f31892C;

    public AnonymousClass2dk(AnonymousClass1yl anonymousClass1yl, AnonymousClass1yt anonymousClass1yt) {
        super((AnonymousClass1yt) AnonymousClass1Ew.E(anonymousClass1yt, "GoogleApiClient must not be null"));
        this.f31891B = anonymousClass1yl.m13989B();
        this.f31892C = anonymousClass1yl;
    }

    /* renamed from: C */
    private final void m16639C(RemoteException remoteException) {
        m16642O(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    public /* bridge */ /* synthetic */ void IRA(Object obj) {
        super.m15838H((AnonymousClass1yy) obj);
    }

    /* renamed from: M */
    public abstract void mo3642M(AnonymousClass1yi anonymousClass1yi);

    /* renamed from: N */
    public final void m16641N(AnonymousClass1yi anonymousClass1yi) {
        try {
            mo3642M(anonymousClass1yi);
        } catch (RemoteException e) {
            m16639C(e);
            throw e;
        } catch (RemoteException e2) {
            m16639C(e2);
        }
    }

    /* renamed from: O */
    public final void m16642O(Status status) {
        AnonymousClass1Ew.F(status.m15794B() ^ 1, "Failed result must not be success");
        m15838H(mo3540J(status));
    }
}
