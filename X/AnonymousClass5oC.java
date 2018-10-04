package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.modal.ModalActivity;
import com.instagram.profile.fragment.AccountPrivacyOptionSheetFragment;

/* renamed from: X.5oC */
public final class AnonymousClass5oC extends AnonymousClass2JV {
    /* renamed from: B */
    public final /* synthetic */ AccountPrivacyOptionSheetFragment f69078B;

    public AnonymousClass5oC(AccountPrivacyOptionSheetFragment accountPrivacyOptionSheetFragment, int i) {
        this.f69078B = accountPrivacyOptionSheetFragment;
        super(i);
    }

    public final void onClick(View view) {
        AnonymousClass0IL anonymousClass0IL = this.f69078B;
        AnonymousClass0Sn anonymousClass0Sn = new AnonymousClass0Sn(ModalActivity.class, "user_options", new Bundle(), anonymousClass0IL.Z(), anonymousClass0IL.f69084D.f1759C);
        anonymousClass0Sn.f5013B = ModalActivity.f5023D;
        anonymousClass0Sn.B(anonymousClass0IL.getContext());
    }
}
