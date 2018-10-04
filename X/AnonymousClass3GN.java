package X;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

/* renamed from: X.3GN */
public final class AnonymousClass3GN implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3z6 f39647B;
    /* renamed from: C */
    public final /* synthetic */ ImageView f39648C;

    public AnonymousClass3GN(AnonymousClass3z6 anonymousClass3z6, ImageView imageView) {
        this.f39647B = anonymousClass3z6;
        this.f39648C = imageView;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1829913662);
        AnonymousClass3z6 anonymousClass3z6 = this.f39647B;
        anonymousClass3z6.f47827B ^= 1;
        this.f39647B.f47829D.m22018G(20, this.f39647B.f47827B);
        if (!this.f39647B.f47832G) {
            this.f39648C.setSelected(this.f39647B.f47827B);
            this.f39647B.f47830E.vJA();
        }
        AnonymousClass0cQ.L(this, 826026840, M);
    }
}
