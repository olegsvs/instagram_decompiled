package X;

import java.util.Collection;

/* renamed from: X.57O */
public final class AnonymousClass57O extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass57c f60325B;

    public AnonymousClass57O(AnonymousClass57c anonymousClass57c) {
        this.f60325B = anonymousClass57c;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -166866065);
        AnonymousClass2Em anonymousClass2Em = (AnonymousClass2Em) obj;
        int I2 = AnonymousClass0cQ.I(this, -629351915);
        AnonymousClass2El anonymousClass2El = anonymousClass2Em.f27927C;
        Collection collection = anonymousClass2Em.f27926B;
        if (anonymousClass2El != null) {
            this.f60325B.f60357T.clear();
            this.f60325B.f60357T.addAll(anonymousClass2El.f27924C);
        } else if (collection != null) {
            AnonymousClass0Fr.NoPrototypeSent.G(this.f60325B.IS(), this.f60325B.DM()).E();
            this.f60325B.f60356S.clear();
            this.f60325B.f60356S.addAll(collection);
        }
        AnonymousClass0cQ.H(this, 820450688, I2);
        AnonymousClass0cQ.H(this, -509534265, I);
    }
}
