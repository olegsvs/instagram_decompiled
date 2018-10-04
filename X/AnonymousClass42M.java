package X;

/* renamed from: X.42M */
public final class AnonymousClass42M {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0EE f48749B;
    /* renamed from: C */
    public final /* synthetic */ String f48750C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Iw f48751D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0Ci f48752E;
    /* renamed from: F */
    public final /* synthetic */ String f48753F;
    /* renamed from: G */
    public final /* synthetic */ AnonymousClass0Cm f48754G;

    public AnonymousClass42M(AnonymousClass0EE anonymousClass0EE, AnonymousClass0Ci anonymousClass0Ci, String str, String str2, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Iw anonymousClass0Iw) {
        this.f48749B = anonymousClass0EE;
        this.f48752E = anonymousClass0Ci;
        this.f48750C = str;
        this.f48753F = str2;
        this.f48754G = anonymousClass0Cm;
        this.f48751D = anonymousClass0Iw;
    }

    /* renamed from: A */
    public final void m22245A(boolean z, boolean z2) {
        if (z && z2) {
            AnonymousClass3lq.m20612B(this.f48749B, AnonymousClass3lp.MUTE_POSTS_AND_STORY, this.f48752E, this.f48750C, this.f48753F);
            AnonymousClass3m5.m20619B(this.f48754G, this.f48752E, true, this.f48750C, this.f48751D);
        } else if (z2) {
            AnonymousClass3lq.m20612B(this.f48749B, AnonymousClass3lp.MUTE_STORY, this.f48752E, null, null);
            AnonymousClass3m5.m20621D(this.f48754G, this.f48752E, this.f48751D);
        } else {
            AnonymousClass3lq.m20612B(this.f48749B, AnonymousClass3lp.MUTE_POSTS, this.f48752E, this.f48750C, null);
            AnonymousClass3m5.m20620C(this.f48754G, this.f48752E, true, this.f48750C, this.f48751D);
        }
    }
}
