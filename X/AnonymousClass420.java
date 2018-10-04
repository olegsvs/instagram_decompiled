package X;

import android.graphics.PointF;
import com.instagram.model.fbfriend.FbFriend;
import com.instagram.model.people.PeopleTag;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductTag;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.420 */
public final class AnonymousClass420 implements AnonymousClass3ht, AnonymousClass0Ij, AnonymousClass3iD {
    /* renamed from: B */
    public final Map f48609B = new HashMap();
    /* renamed from: C */
    public final Map f48610C = new HashMap();
    /* renamed from: D */
    private final AnonymousClass3hs f48611D;

    public final void Dy(AnonymousClass0Ci anonymousClass0Ci, int i) {
    }

    public final void OFA(AnonymousClass0Ci anonymousClass0Ci, int i) {
    }

    public final void Tg(AnonymousClass0MI anonymousClass0MI, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
    }

    public final void dm(AnonymousClass0Ci anonymousClass0Ci, int i) {
    }

    public final void gWA() {
    }

    public final void pJA() {
    }

    public final void ru(Product product) {
    }

    public final void zB(FbFriend fbFriend) {
    }

    public AnonymousClass420(AnonymousClass3hs anonymousClass3hs) {
        this.f48611D = anonymousClass3hs;
    }

    public final void AC(Product product) {
        String jK = this.f48611D.jK();
        List list = (List) this.f48610C.get(jK);
        if (list == null) {
            list = new ArrayList();
            this.f48610C.put(jK, list);
        }
        list.add(new ProductTag(product, new PointF()));
        jH();
    }

    public final void BC(AnonymousClass0Ci anonymousClass0Ci) {
        String jK = this.f48611D.jK();
        List list = (List) this.f48609B.get(jK);
        if (list == null) {
            list = new ArrayList();
            this.f48609B.put(jK, list);
        }
        list.add(new PeopleTag(anonymousClass0Ci, new PointF()));
        jH();
    }

    public final void Wi(Product product) {
        ((List) this.f48610C.get(this.f48611D.jK())).remove(new ProductTag(product));
        this.f48611D.uCA();
    }

    public final void bw(AnonymousClass0Ci anonymousClass0Ci) {
        ((List) this.f48609B.get(this.f48611D.jK())).remove(new PeopleTag(anonymousClass0Ci));
        this.f48611D.uCA();
    }

    public final void jH() {
        this.f48611D.Kh();
    }
}
