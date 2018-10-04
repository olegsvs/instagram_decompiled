package X;

import android.content.Context;
import com.facebook.C0164R;

/* renamed from: X.5aI */
public final class AnonymousClass5aI implements AnonymousClass5Jv {
    /* renamed from: B */
    public final AnonymousClass5K3 f66562B;

    public final String lP() {
        return "facebook";
    }

    public final boolean vW(AnonymousClass0Cm anonymousClass0Cm) {
        return false;
    }

    public AnonymousClass5aI(AnonymousClass5K3 anonymousClass5K3) {
        this.f66562B = anonymousClass5K3;
    }

    public final int DT() {
        return C0164R.string.activation_card_find_people_fb_title;
    }

    public final int RJ() {
        return C0164R.string.connect;
    }

    public final int US() {
        return C0164R.string.activation_card_find_people_fb_subtitle;
    }

    public final boolean fTA(Context context, AnonymousClass0Cm anonymousClass0Cm) {
        return (AnonymousClass0a2.K(anonymousClass0Cm) || AnonymousClass1fm.B(context, anonymousClass0Cm) || AnonymousClass0HV.D(anonymousClass0Cm).c(lP())) ? false : true;
    }

    public final int nM() {
        return C0164R.drawable.find_people_connect_fb;
    }

    public final void ne() {
        this.f66562B.Ol();
    }

    public final int wJ() {
        return RJ();
    }
}
