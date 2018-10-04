package X;

import android.view.View;
import android.view.View.OnLongClickListener;

/* renamed from: X.54O */
public final class AnonymousClass54O implements OnLongClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1LU f59799B;
    /* renamed from: C */
    public final /* synthetic */ int f59800C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass1Oq f59801D;

    public AnonymousClass54O(AnonymousClass1LU anonymousClass1LU, AnonymousClass1Oq anonymousClass1Oq, int i) {
        this.f59799B = anonymousClass1LU;
        this.f59801D = anonymousClass1Oq;
        this.f59800C = i;
    }

    public final boolean onLongClick(View view) {
        return this.f59799B.Ay(this.f59801D, this.f59800C);
    }
}
