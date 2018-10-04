package X;

import java.util.List;

/* renamed from: X.2SR */
public final class AnonymousClass2SR implements AnonymousClass21p {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2SS f30566B;

    public AnonymousClass2SR(AnonymousClass2SS anonymousClass2SS) {
        this.f30566B = anonymousClass2SS;
    }

    public final /* bridge */ /* synthetic */ void uBA(Object obj) {
        List list = (List) obj;
        for (int i = 0; i < list.size(); i++) {
            AnonymousClass21g anonymousClass21g = (AnonymousClass21g) list.get(i);
            if (anonymousClass21g.f25323D == 3) {
                try {
                    AnonymousClass2SS.m15786C(this.f30566B, anonymousClass21g);
                } catch (Throwable e) {
                    AnonymousClass0Dc.I("GooglePlayDownloader", e, "Exception extracting modules", new Object[0]);
                }
            } else if (anonymousClass21g.f25323D == 5) {
                try {
                    AnonymousClass2SS.m15787D(this.f30566B, anonymousClass21g);
                } catch (Throwable e2) {
                    AnonymousClass0Dc.W("GooglePlayDownloader", e2, "Exception cleaning up module", new Object[0]);
                }
            }
        }
    }
}
