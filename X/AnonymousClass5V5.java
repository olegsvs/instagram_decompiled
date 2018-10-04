package X;

import com.instagram.creation.capture.quickcapture.analytics.ShareMediaLoggingInfo;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;

/* renamed from: X.5V5 */
public final class AnonymousClass5V5 implements AnonymousClass4ik {
    /* renamed from: B */
    public final /* synthetic */ DirectPrivateStoryRecipientController f65138B;

    public AnonymousClass5V5(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        this.f65138B = directPrivateStoryRecipientController;
    }

    public final void kz(AnonymousClass4il anonymousClass4il) {
        if (this.f65138B.f65166U != null) {
            for (ShareMediaLoggingInfo shareMediaLoggingInfo : this.f65138B.f65166U) {
                AnonymousClass281.B(this.f65138B.f65172a).wa(shareMediaLoggingInfo.f26466F, shareMediaLoggingInfo.f26467G, shareMediaLoggingInfo.f26462B, shareMediaLoggingInfo.f26463C, anonymousClass4il.nR(), shareMediaLoggingInfo.f26464D, shareMediaLoggingInfo.f26465E, shareMediaLoggingInfo.f26469I, shareMediaLoggingInfo.f26468H);
            }
        }
        DirectPrivateStoryRecipientController.m27120G(this.f65138B, null, null, null, null);
        DirectPrivateStoryRecipientController.m27119F(this.f65138B);
    }
}
