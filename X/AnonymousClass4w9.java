package X;

import com.instagram.igtv.viewer.IGTVViewerFragment;

/* renamed from: X.4w9 */
public final class AnonymousClass4w9 {
    /* renamed from: B */
    public final /* synthetic */ IGTVViewerFragment f58625B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0P7 f58626C;
    /* renamed from: D */
    public final /* synthetic */ String f58627D;

    public AnonymousClass4w9(IGTVViewerFragment iGTVViewerFragment, AnonymousClass0P7 anonymousClass0P7, String str) {
        this.f58625B = iGTVViewerFragment;
        this.f58626C = anonymousClass0P7;
        this.f58627D = str;
    }

    /* renamed from: A */
    public final void m25433A(String str) {
        this.f58625B.mWebLinkShimProgressDialog.dismiss();
        AnonymousClass0IL anonymousClass0IL = this.f58625B;
        AnonymousClass0P7 anonymousClass0P7 = this.f58626C;
        String str2 = this.f58627D;
        AnonymousClass0bP F = AnonymousClass1W1.B(anonymousClass0IL.f66103R, "instagram_organic_browser_launch").F(anonymousClass0P7);
        F.IE = AnonymousClass0IE.B(str2);
        AnonymousClass0bN.f(F.B(), AnonymousClass0dd.REGULAR);
        new AnonymousClass0he(anonymousClass0IL.getActivity(), anonymousClass0IL.f66102Q, str, AnonymousClass0hf.IGTV_MEDIA_LINK).B(anonymousClass0IL.f66102Q.f1759C).C(anonymousClass0IL.f66100O).E(anonymousClass0IL.getModuleName()).D();
    }
}
