package X;

import android.support.v7.widget.RecyclerView;

/* renamed from: X.10g */
public final class AnonymousClass10g implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0hO f13296B;
    /* renamed from: C */
    public final /* synthetic */ String f13297C;
    /* renamed from: D */
    public final /* synthetic */ int f13298D;
    /* renamed from: E */
    public final /* synthetic */ RecyclerView f13299E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass0MI f13300F;
    /* renamed from: G */
    public final /* synthetic */ AnonymousClass0Qf f13301G;

    public AnonymousClass10g(AnonymousClass0hO anonymousClass0hO, RecyclerView recyclerView, int i, AnonymousClass0MI anonymousClass0MI, AnonymousClass0Qf anonymousClass0Qf, String str) {
        this.f13296B = anonymousClass0hO;
        this.f13299E = recyclerView;
        this.f13298D = i;
        this.f13300F = anonymousClass0MI;
        this.f13301G = anonymousClass0Qf;
        this.f13297C = str;
    }

    public final void run() {
        AnonymousClass10H anonymousClass10H = (AnonymousClass10H) this.f13299E.m6978a(this.f13298D);
        if (anonymousClass10H != null) {
            this.f13296B.f8397M = AnonymousClass0Jd.f2931B.mo630D(anonymousClass10H.VQ().getContext(), AnonymousClass0Jd.f2931B.mo637K(), this.f13300F, this.f13296B.f8404T, new AnonymousClass41L(anonymousClass10H.aQ(), new AnonymousClass1Yi(this, anonymousClass10H)), this.f13296B.getModuleName()).fHA();
            anonymousClass10H.wQA(this.f13296B.f8397M);
            this.f13296B.f8396L.GJA(this.f13296B.f8397M);
            this.f13296B.f8398N.f42613B = this.f13296B.f8397M;
        }
    }
}
