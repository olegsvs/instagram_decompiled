package X;

import android.view.View;
import android.view.View.OnLongClickListener;

/* renamed from: X.543 */
public final class AnonymousClass543 implements OnLongClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1LU f59738B;
    /* renamed from: C */
    public final /* synthetic */ int f59739C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass1Oq f59740D;

    public AnonymousClass543(AnonymousClass1LU anonymousClass1LU, AnonymousClass1Oq anonymousClass1Oq, int i) {
        this.f59738B = anonymousClass1LU;
        this.f59740D = anonymousClass1Oq;
        this.f59739C = i;
    }

    public final boolean onLongClick(View view) {
        return this.f59738B.Ay(this.f59740D, this.f59739C);
    }
}
