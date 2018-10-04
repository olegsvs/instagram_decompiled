package X;

/* renamed from: X.6Ac */
public final class AnonymousClass6Ac extends AnonymousClass3AL {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6HX f72551B;

    public AnonymousClass6Ac(AnonymousClass6HX anonymousClass6HX) {
        this.f72551B = anonymousClass6HX;
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void m29278B(Object obj) {
        Boolean bool = (Boolean) obj;
        if (this.f72551B.f74097F != null) {
            AnonymousClass6Gq anonymousClass6Gq = this.f72551B.f74097F;
            boolean booleanValue = bool.booleanValue();
            anonymousClass6Gq.f73835D.f73893J.animate().rotationBy(-180.0f).start();
            AnonymousClass6Af B = AnonymousClass6Ag.m29283B(anonymousClass6Gq.f73834C);
            B.f72561E = booleanValue;
            anonymousClass6Gq.f73834C = B.m29282A();
            anonymousClass6Gq.f73835D.m29853A(anonymousClass6Gq.f73834C);
            this.f72551B.f74104M.f4527F = bool.booleanValue();
        }
        this.f72551B.m29955D().yMA(bool.booleanValue());
        this.f72551B.m29955D().va(bool.booleanValue() ? AnonymousClass69b.CAMERA_FACING_FRONT : AnonymousClass69b.CAMERA_FACING_BACK);
    }
}
