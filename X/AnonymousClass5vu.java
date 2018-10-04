package X;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: X.5vu */
public final class AnonymousClass5vu implements OnCheckedChangeListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5w7 f70121B;

    public AnonymousClass5vu(AnonymousClass5w7 anonymousClass5w7) {
        this.f70121B = anonymousClass5w7;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        boolean G = AnonymousClass0HV.D(this.f70121B.f70149J).G();
        AnonymousClass0HV.D(this.f70121B.f70149J).p(z);
        AnonymousClass0Ie anonymousClass0Ie = this.f70121B;
        AnonymousClass0Cn anonymousClass0Cn = anonymousClass0Ie.f70149J;
        String str = z ? "1" : "0";
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "users/set_reel_settings/";
        AnonymousClass0GA H = anonymousClass0Pt.D("save_to_camera_roll", str).M(AnonymousClass0Pv.class).N().H();
        H.f2849B = new AnonymousClass5vt(this, z, G);
        anonymousClass0Ie.schedule(H);
    }
}
