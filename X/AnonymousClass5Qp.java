package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.C0164R;

/* renamed from: X.5Qp */
public final class AnonymousClass5Qp implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1QY f63322B;

    public AnonymousClass5Qp(AnonymousClass1QY anonymousClass1QY) {
        this.f63322B = anonymousClass1QY;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -862985072);
        AnonymousClass0IL anonymousClass0IL = this.f63322B;
        new AnonymousClass0P2(anonymousClass0IL.getActivity()).V(C0164R.string.time_spent_info_dialog_title).K(C0164R.string.time_spent_info_dialog_body).S(C0164R.string.time_spent_info_learn_more, new AnonymousClass5Qt(anonymousClass0IL)).N(C0164R.string.cancel, new AnonymousClass5Qs(anonymousClass0IL)).E(true).F(true).A().show();
        AnonymousClass0cQ.L(this, 370526481, M);
    }
}
