package X;

import java.util.Map.Entry;

/* renamed from: X.22T */
public final class AnonymousClass22T extends AnonymousClass1Gc {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2U1 f25381B;

    public AnonymousClass22T(AnonymousClass2U1 anonymousClass2U1) {
        this.f25381B = anonymousClass2U1;
    }

    /* renamed from: J */
    public final AnonymousClass0Ox m14258J() {
        return this.f25381B;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        Entry entry = this.f25381B.f30855B.f31937B.f20148B[i];
        return new AnonymousClass2To(entry.getValue(), entry.getKey());
    }
}
