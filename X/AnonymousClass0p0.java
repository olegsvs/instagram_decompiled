package X;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.List;

/* renamed from: X.0p0 */
public final class AnonymousClass0p0 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0jI f10456B;
    /* renamed from: C */
    public final /* synthetic */ String f10457C;
    /* renamed from: D */
    public final /* synthetic */ int f10458D;
    /* renamed from: E */
    public final /* synthetic */ RecyclerView f10459E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass0MI f10460F;
    /* renamed from: G */
    public final /* synthetic */ List f10461G;

    public AnonymousClass0p0(AnonymousClass0jI anonymousClass0jI, RecyclerView recyclerView, int i, AnonymousClass0MI anonymousClass0MI, List list, String str) {
        this.f10456B = anonymousClass0jI;
        this.f10459E = recyclerView;
        this.f10458D = i;
        this.f10460F = anonymousClass0MI;
        this.f10461G = list;
        this.f10457C = str;
    }

    public final void run() {
        AnonymousClass10H anonymousClass10H = (AnonymousClass10H) this.f10459E.m6978a(this.f10458D);
        if (anonymousClass10H != null) {
            AnonymousClass0lG bQ = this.f10456B.bQ();
            View VQ = anonymousClass10H.VQ();
            VQ.setVisibility(4);
            bQ.f9479W = true;
            bQ.m7284E(this.f10460F, 0, null, AnonymousClass0Nm.m3433L(VQ), new AnonymousClass1V9(this, bQ, VQ), false, this.f10456B.f9072E);
        }
    }
}
