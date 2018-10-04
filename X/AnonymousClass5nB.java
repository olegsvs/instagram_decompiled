package X;

import android.view.View;
import android.view.View.OnLongClickListener;

/* renamed from: X.5nB */
public final class AnonymousClass5nB implements OnLongClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1fo f69009B;

    public AnonymousClass5nB(AnonymousClass1fo anonymousClass1fo) {
        this.f69009B = anonymousClass1fo;
    }

    public final boolean onLongClick(View view) {
        AnonymousClass1fo anonymousClass1fo = this.f69009B;
        view = anonymousClass1fo.f21269S;
        if (view != null) {
            view.C(anonymousClass1fo.f21252B);
        }
        return true;
    }
}
