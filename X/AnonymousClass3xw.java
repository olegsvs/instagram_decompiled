package X;

import java.io.File;
import java.util.HashMap;

/* renamed from: X.3xw */
public final class AnonymousClass3xw implements AnonymousClass3C3 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass44a f47479B;
    /* renamed from: C */
    public final /* synthetic */ File f47480C;
    /* renamed from: D */
    public final /* synthetic */ HashMap f47481D;
    /* renamed from: E */
    public final /* synthetic */ int f47482E;

    public AnonymousClass3xw(AnonymousClass44a anonymousClass44a, int i, HashMap hashMap, File file) {
        this.f47479B = anonymousClass44a;
        this.f47482E = i;
        this.f47481D = hashMap;
        this.f47480C = file;
    }

    public final void onBatchComplete() {
        this.f47479B.m21741S(this.f47482E, this.f47481D, this.f47480C);
        AnonymousClass0F4.f2058E.B(new AnonymousClass37x());
    }
}
