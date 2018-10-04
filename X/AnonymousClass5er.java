package X;

/* renamed from: X.5er */
public final class AnonymousClass5er implements AnonymousClass21C {
    /* renamed from: B */
    public final /* synthetic */ String f67838B;

    public AnonymousClass5er(AnonymousClass6EC anonymousClass6EC, String str) {
        this.f67838B = str;
    }

    public final void hl(Exception exception) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("API_ERROR: ");
        stringBuilder.append(exception.getClass());
        stringBuilder.append(":");
        stringBuilder.append(exception.getMessage());
        AnonymousClass0F4.f2058E.B(new AnonymousClass3Vn(stringBuilder.toString(), this.f67838B));
    }
}
