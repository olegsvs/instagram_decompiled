package X;

import java.util.Map;

/* renamed from: X.57N */
public final class AnonymousClass57N implements AnonymousClass0TV {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass57c f60324B;

    public AnonymousClass57N(AnonymousClass57c anonymousClass57c) {
        this.f60324B = anonymousClass57c;
    }

    public final void Zt(Map map) {
        AnonymousClass1Bb anonymousClass1Bb = (AnonymousClass1Bb) map.get("android.permission.READ_CONTACTS");
        if (anonymousClass1Bb == null) {
            anonymousClass1Bb = AnonymousClass1Bb.DENIED;
        }
        switch (anonymousClass1Bb.ordinal()) {
            case 0:
                AnonymousClass0Fr.ContactsUpsellAccepted.C(this.f60324B.IS()).R();
                break;
            case 1:
                AnonymousClass0Fr.ContactsUpsellDeclined.C(this.f60324B.IS()).R();
                break;
            case 2:
                AnonymousClass0Fr.ContactsUpsellAutoDeclined.C(this.f60324B.IS()).R();
                break;
            default:
                break;
        }
        AnonymousClass57c.m25791B(this.f60324B);
    }
}
