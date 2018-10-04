package X;

import android.os.Handler;
import com.facebook.video.heroplayer.ipc.ParcelableFormat;
import com.facebook.video.heroplayer.ipc.ServicePlayerState;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.1c6 */
public final class AnonymousClass1c6 implements AnonymousClass1H6 {
    /* renamed from: B */
    public final CopyOnWriteArraySet f20589B = new CopyOnWriteArraySet();
    /* renamed from: C */
    private final Handler f20590C;

    public AnonymousClass1c6(Handler handler, AnonymousClass1H6 anonymousClass1H6) {
        this.f20590C = handler;
        if (anonymousClass1H6 != null) {
            this.f20589B.add(anonymousClass1H6);
        }
    }

    public final void BXA(String str, String str2) {
        AnonymousClass0OR.m3624D(this.f20590C, new AnonymousClass1xK(this, str, str2), 1041334551);
    }

    public final void Ci(List list) {
        AnonymousClass0OR.m3624D(this.f20590C, new AnonymousClass1xH(this, list), -1156068850);
    }

    public final void EGA() {
        AnonymousClass0OR.m3624D(this.f20590C, new AnonymousClass1eG(this), 603013311);
    }

    public final void FGA(long j) {
        AnonymousClass0OR.m3624D(this.f20590C, new AnonymousClass1xN(this, j), -307608444);
    }

    public final void GGA(int i, int i2) {
        AnonymousClass0OR.m3624D(this.f20590C, new AnonymousClass1eE(this, i, i2), 1009308083);
    }

    public final void JBA(ServicePlayerState servicePlayerState, long j, long j2, boolean z) {
        AnonymousClass0OR.m3624D(this.f20590C, new AnonymousClass1e3(this, servicePlayerState, j, j2, z), -930997491);
    }

    public final void LGA(long j, AnonymousClass1eC anonymousClass1eC, int i, boolean z) {
        AnonymousClass0OR.m3624D(this.f20590C, new AnonymousClass1eJ(this, j, anonymousClass1eC, i, z), 1268970708);
    }

    public final void Pj(ParcelableFormat parcelableFormat, long j, String str, List list) {
        AnonymousClass0OR.m3624D(this.f20590C, new AnonymousClass1f4(this, parcelableFormat, j, str, list), -78459585);
    }

    public final void Qz(long j) {
        AnonymousClass0OR.m3624D(this.f20590C, new AnonymousClass1xJ(this, j), 851831369);
    }

    public final void Si(String str, boolean z, long j) {
        AnonymousClass0OR.m3624D(this.f20590C, new AnonymousClass1xL(this, str, z, j), -1709334768);
    }

    public final void ZFA(long j) {
        AnonymousClass0OR.m3624D(this.f20590C, new AnonymousClass1xQ(this, j), -1722958826);
    }

    public final void aDA(List list) {
        AnonymousClass0OR.m3624D(this.f20590C, new AnonymousClass1xM(this, list), -459464561);
    }

    public final void aFA(long j, long j2, int i, long j3, AnonymousClass1eC anonymousClass1eC) {
        AnonymousClass0OR.m3624D(this.f20590C, new AnonymousClass1xO(this, j, j2, i, j3, anonymousClass1eC), 936736070);
    }

    public final void cu(long j) {
        AnonymousClass0OR.m3624D(this.f20590C, new AnonymousClass1eD(this, j), 1922040978);
    }

    public final void eBA(long j, boolean z) {
        AnonymousClass0OR.m3624D(this.f20590C, new AnonymousClass1eH(this, j, z), -242917321);
    }

    public final void gGA(boolean z) {
        AnonymousClass0OR.m3624D(this.f20590C, new AnonymousClass1eI(this, z), 335308192);
    }

    public final void oFA(long j, long j2, int i, long j3, AnonymousClass1eC anonymousClass1eC) {
        AnonymousClass0OR.m3624D(this.f20590C, new AnonymousClass1xP(this, j, j2, i, j3, anonymousClass1eC), -2119655750);
    }

    public final void ot(String str, String str2) {
        AnonymousClass0OR.m3624D(this.f20590C, new AnonymousClass1xG(this, str, str2), -2102939618);
    }

    public final void vAA(int i) {
        AnonymousClass0OR.m3624D(this.f20590C, new AnonymousClass1xI(this, i), -501715181);
    }

    public final void zj() {
        AnonymousClass0OR.m3624D(this.f20590C, new AnonymousClass1eF(this), -818097379);
    }
}
