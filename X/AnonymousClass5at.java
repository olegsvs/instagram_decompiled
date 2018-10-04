package X;

/* renamed from: X.5at */
public final class AnonymousClass5at implements AnonymousClass5Ov {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Ow f66758B;

    public AnonymousClass5at(AnonymousClass5Ow anonymousClass5Ow) {
        this.f66758B = anonymousClass5Ow;
    }

    public final void Am(int i) {
        AnonymousClass5Ow anonymousClass5Ow = this.f66758B;
        AnonymousClass0Cn anonymousClass0Cn = anonymousClass5Ow.f63039N;
        String str = anonymousClass5Ow.f63027B;
        String str2 = anonymousClass5Ow.f63031F;
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        AnonymousClass0GA H = anonymousClass0Pt.L("live/%s/get_post_live_likes/", new Object[]{str}).D("starting_offset", Integer.toString(i)).D("encoding_tag", str2).M(AnonymousClass5Mh.class).H();
        H.f2849B = new AnonymousClass5Ou(anonymousClass5Ow, i);
        AnonymousClass0Px.B(anonymousClass5Ow.f63029D, anonymousClass5Ow.f63037L, H);
    }
}
