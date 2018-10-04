package X;

import android.view.View;
import android.widget.ListView;
import com.facebook.C0164R;
import com.instagram.model.shopping.Product;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.629 */
public final class AnonymousClass629 extends AnonymousClass0wR {
    /* renamed from: B */
    public final Set f71114B = new HashSet();
    /* renamed from: C */
    public final AnonymousClass0PZ f71115C;
    /* renamed from: D */
    public final AnonymousClass62l f71116D;
    /* renamed from: E */
    public final Product f71117E;
    /* renamed from: F */
    public final AnonymousClass0Cm f71118F;
    /* renamed from: G */
    private final AnonymousClass624 f71119G;
    /* renamed from: H */
    private final AnonymousClass0Ie f71120H;

    public AnonymousClass629(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0Ie anonymousClass0Ie, AnonymousClass624 anonymousClass624, Product product, AnonymousClass62l anonymousClass62l) {
        this.f71118F = anonymousClass0Cm;
        this.f71115C = anonymousClass0PZ;
        this.f71120H = anonymousClass0Ie;
        this.f71119G = anonymousClass624;
        this.f71117E = product;
        this.f71116D = anonymousClass62l;
    }

    public final Class WT() {
        return AnonymousClass62B.class;
    }

    public final /* bridge */ /* synthetic */ void Xc(Object obj) {
        this.f71114B.remove(((AnonymousClass62B) obj).f71131C);
    }

    public final /* bridge */ /* synthetic */ void Yc(Object obj, int i) {
        AnonymousClass62B anonymousClass62B = (AnonymousClass62B) obj;
        if (!this.f71114B.contains(anonymousClass62B.f71131C)) {
            AnonymousClass62l anonymousClass62l;
            AnonymousClass0PZ anonymousClass0PZ;
            Product product;
            this.f71114B.add(anonymousClass62B.f71131C);
            if (anonymousClass62B.f71131C != AnonymousClass62A.PRODUCT_DESCRIPTION) {
                if (anonymousClass62B.f71131C != AnonymousClass62A.SHIPPING_AND_RETURNS) {
                    if (anonymousClass62B.f71131C == AnonymousClass62A.SOLD_BY) {
                        AnonymousClass0Ci anonymousClass0Ci = (AnonymousClass0Ci) AnonymousClass1Cy.G(anonymousClass62B.f71130B);
                        anonymousClass62l = this.f71116D;
                        anonymousClass0PZ = this.f71115C;
                        Product product2 = this.f71117E;
                        boolean R = AnonymousClass0er.B(this.f71118F).R(anonymousClass0Ci);
                        AnonymousClass0bP B = AnonymousClass62l.m28818B(anonymousClass62l, "sold_by_unit_impression", anonymousClass0PZ, product2);
                        B.uB = Boolean.valueOf(R);
                        AnonymousClass62l.m28820D(anonymousClass62l, B, anonymousClass0PZ);
                        return;
                    }
                    anonymousClass62l = this.f71116D;
                    anonymousClass0PZ = this.f71115C;
                    String anonymousClass62A = anonymousClass62B.f71131C.toString();
                    product = this.f71117E;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(anonymousClass62A);
                    stringBuilder.append("_impression");
                    AnonymousClass62l.m28819C(anonymousClass62l, stringBuilder.toString(), anonymousClass0PZ, product);
                    return;
                }
            }
            anonymousClass62l = this.f71116D;
            anonymousClass0PZ = this.f71115C;
            product = this.f71117E;
            String anonymousClass62A2 = anonymousClass62B.f71131C.toString();
            AnonymousClass0bP B2 = AnonymousClass62l.m28818B(anonymousClass62l, "information_row_impression", anonymousClass0PZ, product);
            B2.HE = anonymousClass62A2;
            AnonymousClass62l.m28820D(anonymousClass62l, B2, anonymousClass0PZ);
        }
    }

    public final void rWA(AnonymousClass0wM anonymousClass0wM, int i) {
        Object item = this.f71119G.getItem(i);
        if (item instanceof AnonymousClass62B) {
            AnonymousClass62B anonymousClass62B = (AnonymousClass62B) item;
            ListView listViewSafe = this.f71120H.getListViewSafe();
            anonymousClass0wM.tWA(anonymousClass62B.f71131C.toString(), anonymousClass62B, i);
            if (listViewSafe != null) {
                View findViewById = listViewSafe.getChildAt(i - listViewSafe.getFirstVisiblePosition()).findViewById(C0164R.id.tracked_content);
                if (findViewById != null) {
                    if (findViewById instanceof ListView) {
                        findViewById = ((ListView) findViewById).getChildAt(listViewSafe.getFirstVisiblePosition());
                    }
                    if (AnonymousClass0wg.B(findViewById, 0.699999988079071d)) {
                        anonymousClass0wM.sWA(anonymousClass62B.f71131C.toString(), anonymousClass62B, i);
                    }
                }
            }
        }
    }
}
