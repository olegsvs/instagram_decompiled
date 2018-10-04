package X;

import android.widget.TextView;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;

/* renamed from: X.5V8 */
public final class AnonymousClass5V8 implements AnonymousClass4lC {
    /* renamed from: B */
    public final /* synthetic */ DirectPrivateStoryRecipientController f65141B;

    public AnonymousClass5V8(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        this.f65141B = directPrivateStoryRecipientController;
    }

    public final void eEA(AnonymousClass0Um anonymousClass0Um) {
        this.f65141B.f65197z = this.f65141B.f65197z + 1;
        this.f65141B.f65173b = AnonymousClass0Um.NONE;
        DirectPrivateStoryRecipientController.m27122I(this.f65141B);
    }

    public final int wN(TextView textView) {
        return this.f65141B.f65163R.m27354H(textView);
    }

    public final void wz(AnonymousClass0Um anonymousClass0Um) {
        AnonymousClass0JK.f2907B.A(this.f65141B.f65172a);
        this.f65141B.f65196y = this.f65141B.f65196y + 1;
        this.f65141B.f65173b = AnonymousClass0Um.FAVORITES;
        DirectPrivateStoryRecipientController.m27122I(this.f65141B);
    }
}
