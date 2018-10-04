package X;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.520 */
public final class AnonymousClass520 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass525 f59394B;

    public AnonymousClass520(AnonymousClass525 anonymousClass525) {
        this.f59394B = anonymousClass525;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1347897285);
        AnonymousClass0F4.f2058E.B(new AnonymousClass524(AnonymousClass523.LEARN_MORE));
        ((Activity) this.f59394B.getContext()).onBackPressed();
        AnonymousClass0cQ.L(this, -1619628458, M);
    }
}
