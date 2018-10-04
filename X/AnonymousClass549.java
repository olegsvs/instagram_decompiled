package X;

import android.view.View;
import android.view.View.OnLongClickListener;

/* renamed from: X.549 */
public final class AnonymousClass549 implements OnLongClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1LU f59759B;
    /* renamed from: C */
    public final /* synthetic */ int f59760C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass1Oq f59761D;

    public AnonymousClass549(AnonymousClass1LU anonymousClass1LU, AnonymousClass1Oq anonymousClass1Oq, int i) {
        this.f59759B = anonymousClass1LU;
        this.f59761D = anonymousClass1Oq;
        this.f59760C = i;
    }

    public final boolean onLongClick(View view) {
        return this.f59759B.Ay(this.f59761D, this.f59760C);
    }
}
