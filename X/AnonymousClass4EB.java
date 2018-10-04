package X;

import android.os.Bundle;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.4EB */
public final class AnonymousClass4EB extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1Pt f51744B;

    public AnonymousClass4EB(AnonymousClass1Pt anonymousClass1Pt) {
        this.f51744B = anonymousClass1Pt;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 178972361);
        AnonymousClass1Pt anonymousClass1Pt = this.f51744B;
        AnonymousClass1Pt.C(anonymousClass1Pt, anonymousClass1Pt.f18246K, null);
        String C = AnonymousClass35u.m18505C(anonymousClass0Q6, this.f51744B.getString(C0164R.string.request_error));
        AnonymousClass34I anonymousClass34I = this.f51744B.f18239D;
        Bundle I2 = AnonymousClass33Y.m18334I("error_message", C);
        String str = "social_context";
        I2.putString("extra_conversion_funnel_action_tag", str);
        AnonymousClass34H.m18403L(anonymousClass34I, I2);
        AnonymousClass33Z.m18344I(str, this.f51744B.f18242G, C, null);
        AnonymousClass0cQ.H(this, 431264647, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, -1745784234);
        this.f51744B.f18254S.setVisibility(0);
        this.f51744B.f18245J.setVisibility(4);
        this.f51744B.f18240E.setVisibility(4);
        AnonymousClass0cQ.H(this, -42389775, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, -1522261847);
        this.f51744B.f18245J.setVisibility(0);
        this.f51744B.f18240E.setVisibility(0);
        AnonymousClass0cQ.H(this, -82797003, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -730209791);
        AnonymousClass35B anonymousClass35B = (AnonymousClass35B) obj;
        int I2 = AnonymousClass0cQ.I(this, -270632349);
        if (this.f51744B.f18252Q.equals("new_stack")) {
            TextView textView = (TextView) this.f51744B.f18246K.findViewById(C0164R.id.social_context);
            textView.setVisibility(0);
            textView.setText(anonymousClass35B.f37658B);
        } else {
            AnonymousClass1Pt anonymousClass1Pt = this.f51744B;
            AnonymousClass1Pt.C(anonymousClass1Pt, anonymousClass1Pt.f18246K, anonymousClass35B.f37658B);
        }
        AnonymousClass34I anonymousClass34I = this.f51744B.f18239D;
        Bundle I3 = AnonymousClass33Y.m18334I("error_message", null);
        String str = "social_context";
        I3.putString("extra_conversion_funnel_action_tag", str);
        AnonymousClass34H.m18404M(anonymousClass34I, I3);
        String str2 = this.f51744B.f18242G;
        AnonymousClass0wt.BUSINESS_CONVERSION_FETCH_DATA.A().F("step", str).F("entry_point", str2).F("fb_user_id", AnonymousClass0a2.I(this.f51744B.f18251P)).R();
        AnonymousClass0cQ.H(this, -1735536728, I2);
        AnonymousClass0cQ.H(this, -535493521, I);
    }
}
