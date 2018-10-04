package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.548 */
public final class AnonymousClass548 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1LU f59755B;
    /* renamed from: C */
    public final /* synthetic */ int f59756C;
    /* renamed from: D */
    public final /* synthetic */ IgImageView f59757D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass1Oq f59758E;

    public AnonymousClass548(IgImageView igImageView, AnonymousClass1LU anonymousClass1LU, AnonymousClass1Oq anonymousClass1Oq, int i) {
        this.f59757D = igImageView;
        this.f59755B = anonymousClass1LU;
        this.f59758E = anonymousClass1Oq;
        this.f59756C = i;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 1516664543);
        this.f59755B.vv(this.f59758E, this.f59756C, AnonymousClass0Nm.L(this.f59757D));
        AnonymousClass0cQ.L(this, -616889982, M);
    }
}
