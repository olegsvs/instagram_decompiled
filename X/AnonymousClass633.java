package X;

import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.633 */
public final class AnonymousClass633 implements AnonymousClass0IT {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6FK f71281B;

    public AnonymousClass633(AnonymousClass6FK anonymousClass6FK) {
        this.f71281B = anonymousClass6FK;
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        ((TextView) anonymousClass0eT.X(C0164R.layout.shopping_viewer_action_bar, 0, AnonymousClass0ip.B(this.f71281B.getContext())).findViewById(C0164R.id.username)).setText(this.f71281B.f73352E);
        if (!this.f71281B.f73351D.equals(this.f71281B.f73364Q.f1759C)) {
            anonymousClass0eT.F(AnonymousClass0eb.OVERFLOW, new AnonymousClass632(this));
        }
        anonymousClass0eT.n(true);
    }
}
