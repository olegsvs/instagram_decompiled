package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.55J */
public final class AnonymousClass55J implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass55I f59974B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0R2 f59975C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Cm f59976D;
    /* renamed from: E */
    public final /* synthetic */ String f59977E;

    public AnonymousClass55J(AnonymousClass55Q anonymousClass55Q, AnonymousClass55I anonymousClass55I, AnonymousClass0Cm anonymousClass0Cm, String str, AnonymousClass0R2 anonymousClass0R2) {
        this.f59974B = anonymousClass55I;
        this.f59976D = anonymousClass0Cm;
        this.f59977E = str;
        this.f59975C = anonymousClass0R2;
    }

    public final void run() {
        AnonymousClass55I A = this.f59974B.m25687A();
        AnonymousClass0Cm anonymousClass0Cm = this.f59976D;
        String str = this.f59977E;
        AnonymousClass0R2 anonymousClass0R2 = this.f59975C;
        AnonymousClass55I.m25685B(A);
        AnonymousClass0NN B = AnonymousClass0RO.B(anonymousClass0R2, "notification_displayed");
        List list = (List) A.f59968C.get(str);
        if (list == null) {
            list = new ArrayList();
            A.f59968C.put(str, list);
        }
        list.add(anonymousClass0R2);
        A.f59972G.edit().putString(AnonymousClass55S.m25697B(str, list.size() - 1), A.f59969D.m27594H(anonymousClass0R2)).apply();
        if (A.m25691E(anonymousClass0Cm, str, list, true)) {
            B.H("was_aggregated", true);
        }
        B.R();
    }
}
