package X;

import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

/* renamed from: X.5w2 */
public final class AnonymousClass5w2 implements OnCheckedChangeListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5w7 f70132B;

    public AnonymousClass5w2(AnonymousClass5w7 anonymousClass5w7) {
        this.f70132B = anonymousClass5w7;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        AnonymousClass1UK anonymousClass1UK;
        switch (i) {
            case 0:
                anonymousClass1UK = AnonymousClass1UK.ANYONE;
                break;
            case 1:
                anonymousClass1UK = AnonymousClass1UK.FOLLOWING;
                break;
            default:
                anonymousClass1UK = AnonymousClass1UK.OFF;
                break;
        }
        AnonymousClass0HV D = AnonymousClass0HV.D(this.f70132B.f70149J);
        AnonymousClass1UK B = AnonymousClass1UK.B(D.f2646B.getString("reel_message_prefs", AnonymousClass1UK.ANYONE.toString()));
        AnonymousClass0HV.D(this.f70132B.f70149J).SA(anonymousClass1UK.toString());
        AnonymousClass0Ie anonymousClass0Ie = this.f70132B;
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Ie.f70149J);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "users/set_reel_settings/";
        AnonymousClass0GA H = anonymousClass0Pt.D("message_prefs", anonymousClass1UK.toString()).M(AnonymousClass0Pv.class).N().H();
        H.f2849B = new AnonymousClass5w1(this, anonymousClass1UK, B);
        anonymousClass0Ie.schedule(H);
    }
}
