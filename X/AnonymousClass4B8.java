package X;

import com.instagram.model.fbfriend.FbFriend;
import com.instagram.model.shopping.Product;

/* renamed from: X.4B8 */
public final class AnonymousClass4B8 implements AnonymousClass3ht {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Rw f51185B;

    public final void AC(Product product) {
    }

    public final void gWA() {
    }

    public final void pJA() {
    }

    public final void zB(FbFriend fbFriend) {
    }

    public AnonymousClass4B8(AnonymousClass5Rw anonymousClass5Rw) {
        this.f51185B = anonymousClass5Rw;
    }

    public final void BC(AnonymousClass0Ci anonymousClass0Ci) {
        jH();
        AnonymousClass114.E(this.f51185B.getFragmentManager());
        AnonymousClass0IJ anonymousClass0IJ = this.f51185B;
        AnonymousClass0GA B = AnonymousClass1Q7.B(anonymousClass0IJ.f63622F, this.f51185B.f63624H.f51222F, this.f51185B.f63624H.f51219C, anonymousClass0Ci);
        B.f2849B = new AnonymousClass4BB(this.f51185B);
        anonymousClass0IJ.schedule(B);
    }

    public final void jH() {
        this.f51185B.getFragmentManager().L();
    }
}
