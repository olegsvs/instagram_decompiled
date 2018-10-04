package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.instagram.nux.fragment.OneTapLoginLandingFragment;

/* renamed from: X.57f */
public final class AnonymousClass57f implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ OneTapLoginLandingFragment f60365B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0dq f60366C;

    public AnonymousClass57f(OneTapLoginLandingFragment oneTapLoginLandingFragment, AnonymousClass0dq anonymousClass0dq) {
        this.f60365B = oneTapLoginLandingFragment;
        this.f60366C = anonymousClass0dq;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        OneTapLoginLandingFragment.m27616C(this.f60365B, AnonymousClass0Fr.RemoveCancel, this.f60366C);
        AnonymousClass57s.m25802B("remove_one_tap_user_cancel");
    }
}
