package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.5N4 */
public final class AnonymousClass5N4 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5ac f62694B;

    public AnonymousClass5N4(AnonymousClass5ac anonymousClass5ac) {
        this.f62694B = anonymousClass5ac;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 1800997955);
        if (this.f62694B.f66714F.isShowing()) {
            this.f62694B.f66718J.animate().rotationBy(-180.0f).start();
            this.f62694B.f66711C.callOnClick();
        }
        AnonymousClass0cQ.L(this, -1637957163, M);
    }
}
