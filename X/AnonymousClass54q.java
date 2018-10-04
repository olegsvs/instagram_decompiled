package X;

import android.view.View;
import android.view.View.OnLongClickListener;

/* renamed from: X.54q */
public final class AnonymousClass54q implements OnLongClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1LU f59894B;
    /* renamed from: C */
    public final /* synthetic */ int f59895C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass1Oq f59896D;

    public AnonymousClass54q(AnonymousClass1LU anonymousClass1LU, AnonymousClass1Oq anonymousClass1Oq, int i) {
        this.f59894B = anonymousClass1LU;
        this.f59896D = anonymousClass1Oq;
        this.f59895C = i;
    }

    public final boolean onLongClick(View view) {
        return this.f59894B.Ay(this.f59896D, this.f59895C);
    }
}
