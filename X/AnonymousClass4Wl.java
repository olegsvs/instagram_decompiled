package X;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.4Wl */
public final class AnonymousClass4Wl implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0h4 f54887B;

    public AnonymousClass4Wl(AnonymousClass0h4 anonymousClass0h4) {
        this.f54887B = anonymousClass0h4;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1661044668);
        ((Activity) this.f54887B.getContext()).onBackPressed();
        AnonymousClass0cQ.L(this, 1602273021, M);
    }
}
