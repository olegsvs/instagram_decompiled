package X;

/* renamed from: X.4BU */
public final class AnonymousClass4BU implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4BV f51228B;

    public AnonymousClass4BU(AnonymousClass4BV anonymousClass4BV) {
        this.f51228B = anonymousClass4BV;
    }

    public final void run() {
        String str = this.f51228B.f51229B.f51232D;
        String str2 = this.f51228B.f51229B.f51233E;
        AnonymousClass2NW.ADS_MANAGER_ACTION.m15343A().F("step", "promotion_settings").F("action", "appeal").F("m_pk", str2).F("ad_status", this.f51228B.f51229B.f51230B).F("entry_point", str).R();
        this.f51228B.f51229B.getActivity().onBackPressed();
    }
}
