package X;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.ui.widget.balloonsview.BalloonsView;

/* renamed from: X.4lU */
public final class AnonymousClass4lU implements AnonymousClass14J {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4lW f56936B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0W7 f56937C;

    public AnonymousClass4lU(AnonymousClass4lW anonymousClass4lW, AnonymousClass0W7 anonymousClass0W7) {
        this.f56936B = anonymousClass4lW;
        this.f56937C = anonymousClass0W7;
    }

    public final void onFinish() {
        AnonymousClass0Iz.f2854L.H(AnonymousClass4lW.m25004B(this.f56937C));
        if (this.f56936B.f56941D != null) {
            AnonymousClass4lW anonymousClass4lW = this.f56936B;
            boolean z = anonymousClass4lW.f56941D.F() && (((Boolean) AnonymousClass0CC.Bg.H(this.f56936B.f56944G)).booleanValue() || ((Boolean) AnonymousClass0CC.Dg.H(this.f56936B.f56944G)).booleanValue());
            anonymousClass4lW.f56943F = z;
            if (this.f56936B.f56943F) {
                String str;
                BalloonsView balloonsView = (BalloonsView) this.f56936B.f56940C.f56924B.A();
                balloonsView.setVisibility(0);
                AnonymousClass0YJ anonymousClass0YJ = this.f56936B.f56941D.f5906j;
                if (anonymousClass0YJ != null) {
                    str = anonymousClass0YJ.f6263L;
                } else {
                    str = JsonProperty.USE_DEFAULT_NAME;
                }
                balloonsView.m26212B(AnonymousClass2Hj.B(str));
            }
        }
    }
}
