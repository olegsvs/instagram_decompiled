package X;

import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.ui.widget.refresh.RefreshableListView;

/* renamed from: X.5p0 */
public final class AnonymousClass5p0 implements AnonymousClass0nn {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5p2 f69176B;
    /* renamed from: C */
    public final /* synthetic */ boolean f69177C;

    public final void Hr(AnonymousClass0fq anonymousClass0fq) {
    }

    public final void Jr() {
    }

    public AnonymousClass5p0(AnonymousClass5p2 anonymousClass5p2, boolean z) {
        this.f69176B = anonymousClass5p2;
        this.f69177C = z;
    }

    public final void Gr(AnonymousClass0Q6 anonymousClass0Q6) {
        this.f69176B.f69178B.G();
        Toast.makeText(this.f69176B.getActivity(), C0164R.string.could_not_refresh_feed, 0).show();
    }

    public final void Ir() {
        if (this.f69176B.f69179C) {
            AnonymousClass2IF.B(false, this.f69176B.getView());
            this.f69176B.f69179C = false;
        }
        ((RefreshableListView) this.f69176B.getListViewSafe()).setIsLoading(false);
    }

    public final /* bridge */ /* synthetic */ void Kr(AnonymousClass0Pn anonymousClass0Pn) {
        AnonymousClass0ft anonymousClass0ft = (AnonymousClass0ft) anonymousClass0Pn;
        AnonymousClass5p2.m28485C(this.f69176B);
        if (this.f69177C) {
            AnonymousClass1VB anonymousClass1VB = this.f69176B.f69178B;
            anonymousClass1VB.f19293B.D();
            anonymousClass1VB.G();
        }
        this.f69176B.f69178B.F(anonymousClass0ft.f8015E);
        this.f69176B.f69180D.C(AnonymousClass0nS.GRID, anonymousClass0ft.f8015E, this.f69177C);
    }

    public final void Lr(AnonymousClass0Pn anonymousClass0Pn) {
        AnonymousClass0ft anonymousClass0ft = (AnonymousClass0ft) anonymousClass0Pn;
    }
}
