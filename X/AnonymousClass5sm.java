package X;

import com.facebook.react.bridge.Promise;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.react.modules.product.IgReactCommentModerationModule;

/* renamed from: X.5sm */
public final class AnonymousClass5sm extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ IgReactCommentModerationModule f69585B;
    /* renamed from: C */
    public final /* synthetic */ Promise f69586C;

    public AnonymousClass5sm(IgReactCommentModerationModule igReactCommentModerationModule, Promise promise) {
        this.f69585B = igReactCommentModerationModule;
        this.f69586C = promise;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -1323562386);
        if (this.f69585B.getCurrentActivity() != null) {
            this.f69586C.reject("E_SERVER_ERR", anonymousClass0Q6.f4288C != null ? ((AnonymousClass0Pn) anonymousClass0Q6.f4288C).A() : JsonProperty.USE_DEFAULT_NAME);
        }
        AnonymousClass0cQ.H(this, 509702212, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 548341493);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.I(this, 1841051602);
        if (this.f69585B.getCurrentActivity() != null) {
            this.f69586C.resolve(null);
        }
        AnonymousClass0cQ.H(this, 556936764, I2);
        AnonymousClass0cQ.H(this, 2140547499, I);
    }
}
