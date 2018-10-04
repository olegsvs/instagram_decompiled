package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.53D */
public final class AnonymousClass53D implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass53F f59576B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass53E f59577C;

    public AnonymousClass53D(AnonymousClass53F anonymousClass53F, AnonymousClass53E anonymousClass53E) {
        this.f59576B = anonymousClass53F;
        this.f59577C = anonymousClass53E;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1619170259);
        this.f59577C.f59583G.performItemClick(view, this.f59577C.f59584H, this.f59576B.getItemId(this.f59577C.f59584H));
        AnonymousClass0cQ.L(this, 710144562, M);
    }
}
