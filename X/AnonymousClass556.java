package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.556 */
public final class AnonymousClass556 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1Td f59946B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0bv f59947C;

    public AnonymousClass556(AnonymousClass1Td anonymousClass1Td, AnonymousClass0bv anonymousClass0bv) {
        this.f59946B = anonymousClass1Td;
        this.f59947C = anonymousClass0bv;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 400489440);
        switch (this.f59946B.f18944C.ordinal()) {
            case 0:
                this.f59947C.JCA();
                break;
            case 1:
                this.f59947C.jm();
                break;
            case 2:
                this.f59947C.lm();
                break;
            default:
                break;
        }
        AnonymousClass0cQ.L(this, -1981148487, M);
    }
}
