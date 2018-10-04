package X;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.200 */
public final class AnonymousClass200 {
    /* renamed from: B */
    public final AnonymousClass0O7 f25148B = new AnonymousClass0O7();
    /* renamed from: C */
    public final AnonymousClass21G f25149C = new AnonymousClass21G();
    /* renamed from: D */
    private int f25150D;
    /* renamed from: E */
    private boolean f25151E = false;

    public AnonymousClass200(Iterable iterable) {
        for (AnonymousClass1yp anonymousClass1yp : iterable) {
            this.f25148B.put(anonymousClass1yp.f24963D, null);
        }
        this.f25150D = this.f25148B.keySet().size();
    }

    /* renamed from: A */
    public final void m14135A(AnonymousClass1zz anonymousClass1zz, ConnectionResult connectionResult) {
        this.f25148B.put(anonymousClass1zz, connectionResult);
        this.f25150D--;
        if (!connectionResult.B()) {
            this.f25151E = true;
        }
        if (this.f25150D == 0) {
            if (this.f25151E) {
                this.f25149C.m14184A(new AnonymousClass1z1(this.f25148B));
                return;
            }
            this.f25149C.m14185B(null);
        }
    }
}
