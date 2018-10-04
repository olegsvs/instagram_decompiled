package X;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0JJ */
public final class AnonymousClass0JJ extends AnonymousClass0JK {
    /* renamed from: B */
    private AnonymousClass0PC f2906B;

    /* renamed from: A */
    public final void mo551A(AnonymousClass0Cm anonymousClass0Cm) {
        anonymousClass0Cm = AnonymousClass0P6.m3741D(anonymousClass0Cm);
        synchronized (anonymousClass0Cm) {
            anonymousClass0Cm.f3995B = null;
            anonymousClass0Cm.f3996C.clear();
            anonymousClass0Cm.f3997D.clear();
            anonymousClass0Cm.f3998E.clear();
            anonymousClass0Cm.f3999F.clear();
        }
    }

    /* renamed from: B */
    public final void mo552B(AnonymousClass0Cm anonymousClass0Cm, Context context, AnonymousClass0P7 anonymousClass0P7) {
        anonymousClass0Cm = AnonymousClass0P6.m3741D(anonymousClass0Cm);
        synchronized (anonymousClass0Cm) {
            anonymousClass0Cm.f3995B = anonymousClass0P7;
            for (AnonymousClass0PB B : anonymousClass0Cm.f3997D) {
                AnonymousClass0P6.m3739B(anonymousClass0Cm, B);
            }
            anonymousClass0Cm.f3997D.clear();
            for (AnonymousClass0PB C : anonymousClass0Cm.f3996C) {
                AnonymousClass0P6.m3740C(anonymousClass0Cm, context, C, true);
            }
            anonymousClass0Cm.f3996C.clear();
        }
    }

    /* renamed from: C */
    public final AnonymousClass0PC mo553C() {
        if (this.f2906B == null) {
            this.f2906B = new AnonymousClass0PC();
        }
        return this.f2906B;
    }

    /* renamed from: D */
    public final AnonymousClass3ws mo554D() {
        return AnonymousClass3ws.C();
    }

    /* renamed from: E */
    public final List mo555E(AnonymousClass0Cm anonymousClass0Cm) {
        return Collections.unmodifiableList(AnonymousClass0P6.m3741D(anonymousClass0Cm).f3999F);
    }
}
