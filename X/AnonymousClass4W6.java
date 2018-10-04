package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.4W6 */
public final class AnonymousClass4W6 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4WG f54801B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass3ht f54802C;

    public AnonymousClass4W6(AnonymousClass4WG anonymousClass4WG, AnonymousClass3ht anonymousClass3ht) {
        this.f54801B = anonymousClass4WG;
        this.f54802C = anonymousClass3ht;
    }

    public final void onClick(View view) {
        String str;
        int M = AnonymousClass0cQ.M(this, -1751812037);
        AnonymousClass2NY.m15348B().f29706C = true;
        if (this.f54801B.f54811D == null) {
            str = null;
        } else {
            str = this.f54801B.f54811D.f27935C;
        }
        AnonymousClass3HZ.m19251B(new AnonymousClass3zS(this.f54802C, str));
        AnonymousClass0cQ.L(this, 1491727917, M);
    }
}
