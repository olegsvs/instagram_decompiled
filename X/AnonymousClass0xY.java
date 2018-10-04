package X;

import com.facebook.C0164R;

/* renamed from: X.0xY */
public final class AnonymousClass0xY implements AnonymousClass0xZ {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0ws f12615B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0P7 f12616C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0m3 f12617D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0ms f12618E;

    public AnonymousClass0xY(AnonymousClass0ws anonymousClass0ws, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, AnonymousClass0ms anonymousClass0ms) {
        this.f12615B = anonymousClass0ws;
        this.f12616C = anonymousClass0P7;
        this.f12617D = anonymousClass0m3;
        this.f12618E = anonymousClass0ms;
    }

    public final void pn(AnonymousClass0x3 anonymousClass0x3) {
        if (this.f12616C.eY()) {
            AnonymousClass0dy.m6152B().f7558B.m6164C(AnonymousClass0uY.f11844B, AnonymousClass0uV.m8245F(this.f12616C), "hide");
        }
        if (this.f12616C.wY()) {
            this.f12615B.f12341E.m7148G("hide");
        }
        AnonymousClass0ws anonymousClass0ws;
        if (anonymousClass0x3 == AnonymousClass0x3.MAIN_FEED_UNFOLLOW_USER && ((String) AnonymousClass0CC.Ai.m846H(this.f12615B.f12348L)).equals("v2")) {
            anonymousClass0ws = this.f12615B;
            AnonymousClass1TN.m11541C(anonymousClass0ws.f12342F.getContext(), anonymousClass0ws.f12342F.getResources().getString(C0164R.string.main_feed_unfollow_from_post_title, new Object[]{this.f12616C.MA().uT()}), 0).show();
            AnonymousClass0F4.f2058E.m1505B(new AnonymousClass0ko(r7, true, true));
        } else if (anonymousClass0x3 == AnonymousClass0x3.MAIN_FEED_UNFOLLOW_HASHTAG) {
            anonymousClass0ws = this.f12615B;
            AnonymousClass1TN.m11541C(anonymousClass0ws.f12342F.getContext(), anonymousClass0ws.f12342F.getResources().getString(C0164R.string.unfollowed_hashtag, new Object[]{this.f12616C.MB.f2793M}), 0).show();
            AnonymousClass0F4.f2058E.m1505B(new AnonymousClass0kq(anonymousClass0x3, true));
        } else {
            this.f12617D.f9684S = anonymousClass0x3;
            this.f12618E.m7570B(this.f12615B.f12342F.getListView(), AnonymousClass0iW.m6908D(this.f12615B.f12342F) ? ((AnonymousClass0Pb) this.f12615B.f12342F).iM() : null, this.f12615B);
        }
        AnonymousClass0F4.f2058E.m1505B(new AnonymousClass1YX());
    }

    public final void vw() {
        if (!AnonymousClass0ws.m8437C(this.f12615B)) {
            this.f12617D.f9684S = AnonymousClass0x3.ADS;
            this.f12615B.f12347K.f9180B = true;
            this.f12615B.f12347K.m7120A(this.f12616C, new AnonymousClass1Y8(this));
            this.f12615B.f12347K.m7121B();
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f12615B.f12342F.getActivity());
            anonymousClass0IZ.f2754D = AnonymousClass0IY.m2265B().m2270E(this.f12616C.getId(), this.f12617D.f9673H, this.f12616C.zR(), "report_button", this.f12616C.m3751G());
            anonymousClass0IZ.m2308B();
        }
    }
}
