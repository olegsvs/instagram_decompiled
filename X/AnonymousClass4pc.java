package X;

import android.graphics.RectF;
import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.4pc */
public final class AnonymousClass4pc implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5XX f57728B;

    public AnonymousClass4pc(AnonymousClass5XX anonymousClass5XX) {
        this.f57728B = anonymousClass5XX;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 822915071);
        RectF rectF = new RectF();
        AnonymousClass0Nm.M(view, rectF);
        AnonymousClass0Sn anonymousClass0Sn = new AnonymousClass0Sn(TransparentModalActivity.class, "nametag", AnonymousClass0J5.f2887B.A().A(rectF, AnonymousClass319.EXPLORE_NAV_ICON, true), this.f57728B.getActivity(), this.f57728B.f65905T.f1759C);
        anonymousClass0Sn.f5013B = ModalActivity.f5023D;
        anonymousClass0Sn.B(this.f57728B.getContext());
        view.setEnabled(false);
        AnonymousClass0cQ.L(this, -1729351837, M);
    }
}
