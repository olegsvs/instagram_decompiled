package X;

/* renamed from: X.6AX */
public final class AnonymousClass6AX implements AnonymousClass0Qc {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6AZ f72534B;

    public AnonymousClass6AX(AnonymousClass6AZ anonymousClass6AZ) {
        this.f72534B = anonymousClass6AZ;
    }

    public final /* bridge */ /* synthetic */ boolean RB(AnonymousClass0F6 anonymousClass0F6) {
        AnonymousClass0RN anonymousClass0RN = (AnonymousClass0RN) anonymousClass0F6;
        if (this.f72534B.f72538B != null) {
            AnonymousClass0R7 F = AnonymousClass0Qy.F(anonymousClass0RN.f4656D);
            Object obj = ("video_call_incoming".equals(anonymousClass0RN.f4654B) && (AnonymousClass0R7.EVENT_TYPE_MISSED_CALL == F || AnonymousClass0R7.EVENT_TYPE_REVOKE == F)) ? 1 : null;
            if (obj != null) {
                AnonymousClass0OR.D(this.f72534B.f72542F, new AnonymousClass6AW(this, this.f72534B.f72538B), 198331981);
            }
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void onEvent(AnonymousClass0F6 anonymousClass0F6) {
        int I = AnonymousClass0cQ.I(this, -1231867552);
        AnonymousClass0RN anonymousClass0RN = (AnonymousClass0RN) anonymousClass0F6;
        AnonymousClass0cQ.H(this, -1057728720, AnonymousClass0cQ.I(this, 1638585626));
        AnonymousClass0cQ.H(this, -1985458903, I);
    }
}
