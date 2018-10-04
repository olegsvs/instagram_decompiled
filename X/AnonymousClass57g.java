package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.instagram.nux.fragment.OneTapLoginLandingFragment;
import java.util.List;

/* renamed from: X.57g */
public final class AnonymousClass57g implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ OneTapLoginLandingFragment f60367B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0dq f60368C;

    public AnonymousClass57g(OneTapLoginLandingFragment oneTapLoginLandingFragment, AnonymousClass0dq anonymousClass0dq) {
        this.f60367B = oneTapLoginLandingFragment;
        this.f60368C = anonymousClass0dq;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        OneTapLoginLandingFragment.m27616C(this.f60367B, AnonymousClass0Fr.RemoveConfirmed, this.f60368C);
        AnonymousClass57s.m25802B("remove_one_tap_user_confirm");
        AnonymousClass0dp B = AnonymousClass0dp.B();
        B.f7525B.remove(this.f60368C.f7532H);
        AnonymousClass2Go.B("save_login_info_switched_off");
        B.K();
        List B2 = OneTapLoginLandingFragment.m27615B();
        boolean z = true;
        if (B2.isEmpty()) {
            if (this.f60367B.getActivity() == null || this.f60367B.getActivity().D() == null) {
                AnonymousClass0NN H = AnonymousClass0NN.B("ig_android_onetap_remove_crash_scenario", this.f60367B).H("has_activity", this.f60367B.getActivity() != null);
                String str = "has_fragment_manager";
                boolean z2 = (this.f60367B.getActivity() == null || this.f60367B.getActivity().D() == null) ? false : true;
                H = H.H(str, z2);
                str = "is_finishing";
                if (this.f60367B.getActivity() == null || !this.f60367B.getActivity().isFinishing()) {
                    z = false;
                }
                H.H(str, z).R();
                return;
            }
            AnonymousClass3X4.G(this.f60367B.getActivity().D());
            AnonymousClass57s.m25803C();
        } else if (B2.size() == 1) {
            OneTapLoginLandingFragment.m27618E(this.f60367B, B2);
        } else {
            this.f60367B.f66389B.m25705F(B2);
        }
    }
}
