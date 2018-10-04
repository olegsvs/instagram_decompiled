package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.4bl */
public final class AnonymousClass4bl implements AnonymousClass0GA {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4bm f55645B;
    /* renamed from: C */
    private final List f55646C = new ArrayList();

    public final String getName() {
        return "LoadReactionsTask";
    }

    public final void onStart() {
    }

    public AnonymousClass4bl(AnonymousClass4bm anonymousClass4bm) {
        this.f55645B = anonymousClass4bm;
    }

    public final void onFinish() {
        this.f55645B.f55649D.setLoadingStatus(AnonymousClass2M2.SUCCESS);
        AnonymousClass0nJ anonymousClass0nJ = this.f55645B.f55647B;
        Collection collection = this.f55646C;
        anonymousClass0nJ.f55283B.clear();
        anonymousClass0nJ.f55283B.addAll(collection);
        anonymousClass0nJ.notifyDataSetChanged();
    }

    public final void run() {
        AnonymousClass0Tw C = AnonymousClass0Tw.C(this.f55645B.f55651F);
        AnonymousClass0Vw c = C.c(this.f55645B.f55650E);
        AnonymousClass0LH.E(c);
        AnonymousClass0W7 V = C.V(c.F(), this.f55645B.f55648C);
        if (V != null) {
            for (AnonymousClass0Ci anonymousClass0Ci : V.f5889S) {
                this.f55646C.add(new AnonymousClass4gx(anonymousClass0Ci.f1757z, anonymousClass0Ci.uT(), anonymousClass0Ci.DQ()));
            }
        }
    }
}
