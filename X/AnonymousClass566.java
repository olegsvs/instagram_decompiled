package X;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: X.566 */
public final class AnonymousClass566 implements OnItemClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass56A f60087B;

    public AnonymousClass566(AnonymousClass56A anonymousClass56A) {
        this.f60087B = anonymousClass56A;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        AnonymousClass5ZN anonymousClass5ZN = (AnonymousClass5ZN) this.f60087B.f60098D.getAdapter().getItem(i);
        AnonymousClass0Nm.N(view);
        if (this.f60087B.f60099E != null) {
            this.f60087B.f60099E.rc(anonymousClass5ZN);
        }
    }
}
