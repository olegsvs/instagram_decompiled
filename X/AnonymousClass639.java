package X;

import com.instagram.model.shopping.Product;

/* renamed from: X.639 */
public final class AnonymousClass639 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6FK f71287B;

    public AnonymousClass639(AnonymousClass6FK anonymousClass6FK) {
        this.f71287B = anonymousClass6FK;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -1928345075);
        super.onFail(anonymousClass0Q6);
        AnonymousClass62l anonymousClass62l = this.f71287B.f73353F;
        AnonymousClass0PZ anonymousClass0PZ = this.f71287B;
        Product product = anonymousClass0PZ.f73357J;
        String str = this.f71287B.f73358K;
        long currentTimeMillis = System.currentTimeMillis() - this.f71287B.f73356I;
        if (product == null) {
            product = new Product();
            product.XOA(str);
        }
        AnonymousClass0bP B = AnonymousClass62l.m28818B(anonymousClass62l, "pdp_load_failure", anonymousClass0PZ, product);
        B.JC = currentTimeMillis;
        AnonymousClass62l.m28820D(anonymousClass62l, B, anonymousClass0PZ);
        AnonymousClass0cQ.H(this, -644827098, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 1479187082);
        AnonymousClass62m anonymousClass62m = (AnonymousClass62m) obj;
        int I2 = AnonymousClass0cQ.I(this, -275092290);
        if (this.f71287B.f73357J == null) {
            this.f71287B.f73353F.m28821A(this.f71287B, anonymousClass62m.f71240E, -1, 0, null);
        }
        this.f71287B.f73357J = anonymousClass62m.f71240E;
        this.f71287B.f73350C = anonymousClass62m.f71237B;
        AnonymousClass6FK.m29631D(this.f71287B, anonymousClass62m);
        AnonymousClass0db C = AnonymousClass0db.C();
        if (this.f71287B.f73357J.A()) {
            Product product;
            if (this.f71287B.f73365R == null) {
                product = this.f71287B.f73357J;
            } else {
                product = this.f71287B.f73365R.f71259C;
            }
            C.C("is_variant_selection_in_stock", product.G());
        }
        AnonymousClass62l anonymousClass62l = this.f71287B.f73353F;
        AnonymousClass0PZ anonymousClass0PZ = this.f71287B;
        Product product2 = anonymousClass0PZ.f73357J;
        long currentTimeMillis = System.currentTimeMillis() - this.f71287B.f73356I;
        long j = this.f71287B.f73356I;
        AnonymousClass0bP B = AnonymousClass62l.m28818B(anonymousClass62l, "pdp_load_success", anonymousClass0PZ, product2);
        B.JC = currentTimeMillis;
        B.A(C);
        if (currentTimeMillis > 10000000) {
            B.bC = j;
        }
        AnonymousClass62l.m28820D(anonymousClass62l, B, anonymousClass0PZ);
        AnonymousClass0cQ.H(this, -1215277367, I2);
        AnonymousClass0cQ.H(this, -1071242215, I);
    }
}
