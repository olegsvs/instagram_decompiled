package X;

import java.io.Closeable;

/* renamed from: X.3pa */
public final class AnonymousClass3pa implements AnonymousClass0RB {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3pc f44985B;

    public AnonymousClass3pa(AnonymousClass3pc anonymousClass3pc) {
        this.f44985B = anonymousClass3pc;
    }

    public final /* bridge */ /* synthetic */ Object VVA(Object obj) {
        Throwable th;
        Closeable closeable;
        try {
            closeable = ((AnonymousClass0aE) obj).f6476D;
            try {
                AnonymousClass0HA.f2534D.A(this.f44985B.f44987B, closeable.UJ());
                AnonymousClass0Po anonymousClass0Po = new AnonymousClass0Po();
                anonymousClass0Po.setStatusCode(200);
                AnonymousClass0Du.C(closeable);
                return anonymousClass0Po;
            } catch (Throwable th2) {
                th = th2;
                AnonymousClass0Du.C(closeable);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
            AnonymousClass0Du.C(closeable);
            throw th;
        }
    }
}
