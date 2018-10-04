package X;

/* renamed from: X.3lf */
public enum AnonymousClass3lf {
    BUTTON_TAPPED("unfollow_button_tapped"),
    DIALOG_IMPRESSION("unfollow_dialog_impresssion"),
    DIALOG_CONFIRMED("unfollow_dialog_confirmed"),
    DIALOG_CANCELLED("unfollow_dialog_cancelled"),
    SUCCESSFUL("unfollow_successful"),
    FAILED("unfollow_failed");
    
    /* renamed from: B */
    private final String f44214B;

    private AnonymousClass3lf(String str) {
        this.f44214B = str;
    }

    /* renamed from: A */
    public final void m20608A(AnonymousClass0Ci anonymousClass0Ci) {
        String id = anonymousClass0Ci.getId();
        AnonymousClass0NN H = AnonymousClass0NN.C(this.f44214B, AnonymousClass0cR.f7154D.f7156B).F("target_id", id).H("target_is_private", anonymousClass0Ci.qB == AnonymousClass0Lo.PrivacyStatusPrivate);
        AnonymousClass0x5.E(H, id, AnonymousClass0mk.NotFollowing.A());
        H.R();
    }
}
