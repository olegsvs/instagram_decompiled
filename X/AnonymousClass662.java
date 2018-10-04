package X;

import android.widget.Toast;
import com.facebook.C0164R;
import java.lang.ref.WeakReference;

/* renamed from: X.662 */
public final class AnonymousClass662 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final AnonymousClass5ag f71695B;
    /* renamed from: C */
    public final WeakReference f71696C;

    public AnonymousClass662(AnonymousClass5ag anonymousClass5ag, AnonymousClass6Fz anonymousClass6Fz) {
        this.f71695B = anonymousClass5ag;
        this.f71696C = new WeakReference(anonymousClass6Fz);
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 1869229479);
        AnonymousClass6Fz anonymousClass6Fz = (AnonymousClass6Fz) this.f71696C.get();
        if (anonymousClass6Fz != null) {
            AnonymousClass5ag anonymousClass5ag = this.f71695B;
            if (anonymousClass6Fz.f73535B.f71698C != null) {
                AnonymousClass6GG anonymousClass6GG = anonymousClass6Fz.f73535B.f71698C;
                Toast.makeText(anonymousClass6GG.f73655I.f66804I.f63165I.getContext(), C0164R.string.live_comment_failed_to_post, 0).show();
                AnonymousClass67B anonymousClass67B = anonymousClass6GG.f73651E;
                if (anonymousClass67B != null) {
                    anonymousClass67B.m29077I(anonymousClass5ag);
                }
            }
        }
        AnonymousClass0cQ.H(this, 1445652414, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 961194247);
        AnonymousClass5Mi anonymousClass5Mi = (AnonymousClass5Mi) obj;
        int I2 = AnonymousClass0cQ.I(this, -1827103237);
        AnonymousClass0SK anonymousClass0SK = anonymousClass5Mi.f62655B;
        this.f71695B.f4889I = anonymousClass0SK.UK();
        this.f71695B.f4906Z = anonymousClass0SK.XP();
        AnonymousClass6Fz anonymousClass6Fz = (AnonymousClass6Fz) this.f71696C.get();
        if (anonymousClass6Fz != null) {
            AnonymousClass0SK anonymousClass0SK2 = this.f71695B;
            if (anonymousClass6Fz.f73535B.f71698C != null) {
                AnonymousClass67B anonymousClass67B = anonymousClass6Fz.f73535B.f71698C.f73651E;
                if (anonymousClass67B != null) {
                    anonymousClass0SK2.f4907a = AnonymousClass0zV.Success;
                    anonymousClass67B.f71917F.m26309X();
                }
            }
        }
        AnonymousClass0cQ.H(this, 690988678, I2);
        AnonymousClass0cQ.H(this, 1498100803, I);
    }
}
