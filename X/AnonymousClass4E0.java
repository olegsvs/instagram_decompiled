package X;

import java.util.List;

/* renamed from: X.4E0 */
public final class AnonymousClass4E0 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4E1 f51721B;

    public AnonymousClass4E0(AnonymousClass4E1 anonymousClass4E1) {
        this.f51721B = anonymousClass4E1;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 974352523);
        AnonymousClass33f.IX_SELF_SERVE_FETCH_DATA_ERROR.m18382A().F("entry_point", "edit_profile").F("step", "ix_partners").R();
        super.onFail(anonymousClass0Q6);
        AnonymousClass2IF.m14981B(this.f51721B.f51723C.isEmpty(), this.f51721B.getView());
        AnonymousClass0cQ.H(this, -1186240653, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, -1708795124);
        super.onStart();
        AnonymousClass2IF.m14981B(this.f51721B.f51723C.isEmpty(), this.f51721B.getView());
        AnonymousClass0cQ.H(this, 369328140, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -2067023329);
        AnonymousClass354 anonymousClass354 = (AnonymousClass354) obj;
        int I2 = AnonymousClass0cQ.I(this, 948795442);
        AnonymousClass33f.IX_SELF_SERVE_FETCH_DATA.m18382A().F("entry_point", "edit_profile").F("step", "ix_partners").R();
        super.onSuccess(anonymousClass354);
        this.f51721B.f51722B = anonymousClass354.f37653B;
        AnonymousClass3x4 anonymousClass3x4 = this.f51721B.f51723C;
        List list = this.f51721B.f51722B;
        anonymousClass3x4.f47308B = list;
        if (anonymousClass3x4.f47308B.isEmpty()) {
            anonymousClass3x4.f47309C = null;
        } else if (anonymousClass3x4.f47309C == null) {
            anonymousClass3x4.f47309C = (AnonymousClass353) anonymousClass3x4.f47308B.get(0);
        }
        if (!(list == null || list.isEmpty())) {
            AnonymousClass3x4.m21674B(anonymousClass3x4);
        }
        if (!this.f51721B.f51722B.isEmpty()) {
            AnonymousClass4E1 anonymousClass4E1 = this.f51721B;
            anonymousClass4E1.f51724D = (AnonymousClass353) anonymousClass4E1.f51722B.get(0);
        }
        AnonymousClass2IF.m14981B(this.f51721B.f51723C.isEmpty(), this.f51721B.getView());
        AnonymousClass0cQ.H(this, -864058419, I2);
        AnonymousClass0cQ.H(this, -1270941857, I);
    }
}
