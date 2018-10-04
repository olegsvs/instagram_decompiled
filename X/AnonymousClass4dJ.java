package X;

import android.content.Intent;
import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.4dJ */
public final class AnonymousClass4dJ extends AnonymousClass0Ut {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Vp f55839B;

    public AnonymousClass4dJ(AnonymousClass5Vp anonymousClass5Vp, AnonymousClass0Cm anonymousClass0Cm) {
        this.f55839B = anonymousClass5Vp;
        super(anonymousClass0Cm);
    }

    /* renamed from: A */
    public final void m24615A(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 1433726671);
        AnonymousClass2IF.m14981B(false, this.f55839B.getView());
        Toast.makeText(this.f55839B.getContext(), C0164R.string.direct_expiring_media_create_group_failed, 1).show();
        AnonymousClass5Vp.D(this.f55839B);
        AnonymousClass0cQ.H(this, 546326246, I);
    }

    /* renamed from: E */
    public final /* bridge */ /* synthetic */ void m24616E(AnonymousClass0Cm anonymousClass0Cm, Object obj) {
        int I = AnonymousClass0cQ.I(this, 261817207);
        AnonymousClass0Wt anonymousClass0Wt = (AnonymousClass0Wt) obj;
        int I2 = AnonymousClass0cQ.I(this, -405877985);
        AnonymousClass0IL anonymousClass0IL = this.f55839B;
        String str = anonymousClass0Wt.f6034H;
        String str2 = anonymousClass0Wt.f6054b;
        boolean z = anonymousClass0Wt.f6028B;
        Object obj2 = anonymousClass0IL.f65442D;
        anonymousClass0IL.getActivity().setResult(-1, new Intent().putExtra("bundle_extra_share_target", new DirectShareTarget(obj2, new DirectThreadKey(str, obj2), str2, z)));
        anonymousClass0IL.getActivity().finish();
        AnonymousClass0cQ.H(this, -692765615, I2);
        AnonymousClass0cQ.H(this, -89394688, I);
    }
}
