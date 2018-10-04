package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.4x3 */
public final class AnonymousClass4x3 implements AnonymousClass15J {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4x4 f58764B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass4x8 f58765C;

    public final void Xq(View view) {
    }

    public AnonymousClass4x3(AnonymousClass4x4 anonymousClass4x4, AnonymousClass4x8 anonymousClass4x8) {
        this.f58764B = anonymousClass4x4;
        this.f58765C = anonymousClass4x8;
    }

    public final boolean yCA(View view) {
        AnonymousClass5YY anonymousClass5YY = this.f58764B.f58766B;
        if (this.f58765C.f58780E) {
            AnonymousClass0HV.D(anonymousClass5YY.f66180D).s(true);
            anonymousClass5YY.m27524A();
            AnonymousClass5Yb anonymousClass5Yb = anonymousClass5YY.f66179C;
            AnonymousClass5Yb.m27539E(anonymousClass5Yb);
            AnonymousClass0IJ anonymousClass0IJ = anonymousClass5Yb.f66229O;
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0IJ.f66102Q);
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
            anonymousClass0Pt.f4229M = "nux/write_nux_type/";
            anonymousClass0IJ.schedule(anonymousClass0Pt.D("nux_type", "igtv_onboarding").M(AnonymousClass0Pv.class).N().H());
        } else {
            ReboundViewPager reboundViewPager = anonymousClass5YY.f66181E;
            reboundViewPager.F(reboundViewPager.getCurrentRawDataIndex() + 1, 0.0f);
        }
        return true;
    }
}
