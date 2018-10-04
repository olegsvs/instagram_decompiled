package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.model.shopping.Product;

/* renamed from: X.61o */
public final class AnonymousClass61o implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass61q f71022B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass61p f71023C;
    /* renamed from: D */
    public final /* synthetic */ Product f71024D;

    public AnonymousClass61o(AnonymousClass61q anonymousClass61q, AnonymousClass61p anonymousClass61p, Product product) {
        this.f71022B = anonymousClass61q;
        this.f71023C = anonymousClass61p;
        this.f71024D = product;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -766460920);
        if (this.f71023C.E() != -1) {
            AnonymousClass6Ha anonymousClass6Ha = this.f71022B.f71030C;
            Product product = this.f71024D;
            if (anonymousClass6Ha.f74117C.f73354G != null) {
                AnonymousClass62l anonymousClass62l = anonymousClass6Ha.f74117C.f73353F;
                AnonymousClass0PZ anonymousClass0PZ = anonymousClass6Ha.f74117C;
                anonymousClass62l.m28822B(anonymousClass0PZ, anonymousClass0PZ.f73354G, product, anonymousClass6Ha.f74117C.f73354G.eB ? "more_from_story" : "more_from_post", "pdp_unit");
            }
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass6Ha.f74117C.getActivity());
            AnonymousClass0Sm A = AnonymousClass0Jn.f2942B.A();
            AnonymousClass3fm B = new AnonymousClass3fm().B(anonymousClass6Ha.f74117C.f73351D, anonymousClass6Ha.f74117C.f73352E);
            B.f43203D = anonymousClass6Ha.f74117C.f73355H;
            B = B.D(anonymousClass6Ha.f74117C);
            B.f43205F = (Product) AnonymousClass1mY.C(product);
            anonymousClass0IZ.f2754D = A.A(B.A());
            anonymousClass0IZ.B();
        }
        AnonymousClass0cQ.L(this, 168757099, M);
    }
}
