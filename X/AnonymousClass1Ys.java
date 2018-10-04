package X;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.C0164R;
import com.instagram.arlink.ui.NametagResultCardView;
import com.instagram.modal.ModalActivity;

/* renamed from: X.1Ys */
public final class AnonymousClass1Ys implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ NametagResultCardView f20112B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Ci f20113C;

    public AnonymousClass1Ys(NametagResultCardView nametagResultCardView, AnonymousClass0Ci anonymousClass0Ci) {
        this.f20112B = nametagResultCardView;
        this.f20113C = anonymousClass0Ci;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.m5863M(this, -920891806);
        AnonymousClass4AI anonymousClass4AI = this.f20112B.f37043E;
        String id = this.f20113C.getId();
        AnonymousClass311.f36933k.B();
        Bundle bundle = new Bundle();
        bundle.putString("UserDetailFragment.EXTRA_USER_ID", id);
        AnonymousClass0Sn anonymousClass0Sn = new AnonymousClass0Sn(ModalActivity.class, "profile", bundle, anonymousClass4AI.f51068B, anonymousClass4AI.f51080N.f1759C);
        anonymousClass0Sn.f5013B = new int[]{C0164R.anim.right_in, C0164R.anim.left_out, C0164R.anim.left_in, C0164R.anim.right_out};
        anonymousClass0Sn.m4403B(anonymousClass4AI.f51068B);
        AnonymousClass0cQ.m5862L(this, 1661515745, M);
    }
}
