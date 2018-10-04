package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.67q */
public final class AnonymousClass67q implements AnonymousClass0F8 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6GI f72022B;

    public AnonymousClass67q(AnonymousClass6GI anonymousClass6GI) {
        this.f72022B = anonymousClass6GI;
    }

    public final /* bridge */ /* synthetic */ void onEvent(AnonymousClass0F6 anonymousClass0F6) {
        int I = AnonymousClass0cQ.I(this, -2126588952);
        AnonymousClass1EG anonymousClass1EG = (AnonymousClass1EG) anonymousClass0F6;
        int I2 = AnonymousClass0cQ.I(this, 303213815);
        AnonymousClass6GI anonymousClass6GI = this.f72022B;
        AnonymousClass0Ci anonymousClass0Ci = anonymousClass1EG.f15877B.f16780B;
        AnonymousClass0Nm.N(anonymousClass6GI.f73685R);
        View C = AnonymousClass6GI.m29760C(anonymousClass6GI);
        CircularImageView circularImageView = (CircularImageView) C.findViewById(C0164R.id.guest_avatar);
        CircularImageView circularImageView2 = (CircularImageView) C.findViewById(C0164R.id.host_avatar);
        View findViewById = C.findViewById(C0164R.id.wave_reaction);
        TextView textView = (TextView) C.findViewById(C0164R.id.wave_text);
        textView.setText(textView.getResources().getString(C0164R.string.live_wave_viewer_success_text, new Object[]{anonymousClass0Ci.uT()}));
        circularImageView.setBackgroundDrawable(AnonymousClass0Ca.E(circularImageView.getContext(), C0164R.drawable.white_circle_bg));
        circularImageView.setUrl(AnonymousClass2Hj.B("👋"));
        circularImageView2.setUrl(anonymousClass0Ci.DQ());
        C.setVisibility(0);
        AnonymousClass14H B = AnonymousClass5PI.m26430B(findViewById);
        AnonymousClass14J anonymousClass67r = new AnonymousClass67r(anonymousClass6GI, circularImageView, findViewById, B);
        AnonymousClass6GI.m29759B(anonymousClass6GI, B);
        B.f13848N = anonymousClass67r;
        B.N();
        AnonymousClass0cQ.H(this, 456113924, I2);
        AnonymousClass0cQ.H(this, -982533804, I);
    }
}
