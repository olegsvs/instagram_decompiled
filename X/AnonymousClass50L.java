package X;

import java.util.Map;

/* renamed from: X.50L */
public final class AnonymousClass50L implements AnonymousClass0TV {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Z8 f59241B;

    public AnonymousClass50L(AnonymousClass5Z8 anonymousClass5Z8) {
        this.f59241B = anonymousClass5Z8;
    }

    public final void Zt(Map map) {
        if (((AnonymousClass1Bb) map.get("android.permission.RECEIVE_SMS")) == AnonymousClass1Bb.GRANTED) {
            this.f59241B.f66326F = new AnonymousClass50S(new AnonymousClass5Z5(this));
            this.f59241B.f66326F.m25578B(this.f59241B.getActivity().getApplicationContext());
        }
    }
}
