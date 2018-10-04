package X;

/* renamed from: X.41G */
public final class AnonymousClass41G implements AnonymousClass3ZD {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3ZZ f48425B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass41C f48426C;

    public AnonymousClass41G(AnonymousClass3ZZ anonymousClass3ZZ, AnonymousClass41C anonymousClass41C) {
        this.f48425B = anonymousClass3ZZ;
        this.f48426C = anonymousClass41C;
    }

    public final void jo(AnonymousClass3ZE anonymousClass3ZE, String str) {
        this.f48426C.jo(anonymousClass3ZE, str);
        AnonymousClass2bI anonymousClass2bI = this.f48425B.f42329B;
        AnonymousClass0O4.M(anonymousClass2bI.f31392B, anonymousClass2bI.f31393C, "upload_audio_failure", str);
    }

    public final void kr(AnonymousClass3ZE anonymousClass3ZE, Exception exception) {
        this.f48426C.kr(anonymousClass3ZE, exception);
    }

    public final void lr(AnonymousClass3ZE anonymousClass3ZE, AnonymousClass2bJ anonymousClass2bJ, AnonymousClass1uP anonymousClass1uP, long j) {
        this.f48426C.lr(anonymousClass3ZE, anonymousClass2bJ, anonymousClass1uP, j);
        AnonymousClass2bI anonymousClass2bI = this.f48425B.f42329B;
        AnonymousClass0O4 anonymousClass0O4 = anonymousClass2bI.f31392B;
        AnonymousClass0OA anonymousClass0OA = anonymousClass2bI.f31393C;
        AnonymousClass0O4.K(anonymousClass0O4, AnonymousClass0O4.G(anonymousClass0O4, "upload_audio_success", null, anonymousClass0OA), anonymousClass0OA);
    }
}
