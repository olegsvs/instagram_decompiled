package X;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.modal.ModalActivity;

/* renamed from: X.4eG */
public final class AnonymousClass4eG implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Um f55960B;

    public AnonymousClass4eG(AnonymousClass5Um anonymousClass5Um) {
        this.f55960B = anonymousClass5Um;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 829691816);
        AnonymousClass5Um anonymousClass5Um = this.f55960B;
        Bundle bundle = new Bundle();
        bundle.putString("DirectFragment.ENTRY_POINT", "inbox");
        AnonymousClass0Sn anonymousClass0Sn = new AnonymousClass0Sn(ModalActivity.class, "direct_permissions_inbox", bundle, anonymousClass5Um.f65089B.f14920I.getActivity(), anonymousClass5Um.f65089B.f14942e.f1759C);
        anonymousClass0Sn.f5013B = ModalActivity.f5023D;
        anonymousClass0Sn.B(anonymousClass5Um.f65089B.f14920I.getContext());
        AnonymousClass0cQ.L(this, 1067048713, M);
    }
}
