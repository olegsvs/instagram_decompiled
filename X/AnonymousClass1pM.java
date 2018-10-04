package X;

import android.os.SystemClock;
import android.util.SparseArray;

/* renamed from: X.1pM */
public final class AnonymousClass1pM extends AnonymousClass1DL {
    /* renamed from: B */
    public final AnonymousClass1pL f23148B = new AnonymousClass1pL();
    /* renamed from: C */
    public final AnonymousClass1pL f23149C = new AnonymousClass1pL();
    /* renamed from: D */
    private final SparseArray f23150D = new SparseArray();

    /* renamed from: A */
    public final AnonymousClass1Nl m13376A() {
        return new AnonymousClass1pK();
    }

    /* renamed from: B */
    public static synchronized void m13374B(AnonymousClass1pM anonymousClass1pM, int i, boolean z) {
        synchronized (anonymousClass1pM) {
            if (anonymousClass1pM.f23150D.get(i) == null) {
                anonymousClass1pM.f23150D.put(i, Boolean.valueOf(z));
                AnonymousClass1pL anonymousClass1pL = z ? anonymousClass1pM.f23149C : anonymousClass1pM.f23148B;
                if (anonymousClass1pL.f23146D == 0) {
                    anonymousClass1pL.f23147E = SystemClock.uptimeMillis();
                }
                anonymousClass1pL.f23144B++;
                anonymousClass1pL.f23146D++;
            }
        }
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ boolean m13377B(AnonymousClass1Nl anonymousClass1Nl) {
        AnonymousClass1pK anonymousClass1pK = (AnonymousClass1pK) anonymousClass1Nl;
        synchronized (this) {
            AnonymousClass1OK.B(anonymousClass1pK, "Null value passed to getSnapshot!");
            anonymousClass1pK.f23142D = this.f23148B.f23144B;
            anonymousClass1pK.f23140B = this.f23149C.f23144B;
            anonymousClass1pK.f23143E = this.f23148B.m13373A();
            anonymousClass1pK.f23141C = this.f23149C.m13373A();
        }
        return true;
    }

    /* renamed from: C */
    public static synchronized void m13375C(AnonymousClass1pM anonymousClass1pM, int i) {
        synchronized (anonymousClass1pM) {
            Boolean bool = (Boolean) anonymousClass1pM.f23150D.get(i);
            if (bool != null) {
                anonymousClass1pM.f23150D.remove(i);
                AnonymousClass1pL anonymousClass1pL = bool.booleanValue() ? anonymousClass1pM.f23149C : anonymousClass1pM.f23148B;
                anonymousClass1pL.f23146D--;
                if (anonymousClass1pL.f23146D == 0) {
                    anonymousClass1pL.f23145C += SystemClock.uptimeMillis() - anonymousClass1pL.f23147E;
                }
            }
        }
    }
}
