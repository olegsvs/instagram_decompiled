package X;

import android.text.TextUtils;
import com.facebook.C0164R;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.4Dv */
public final class AnonymousClass4Dv extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4Dy f51703B;
    /* renamed from: C */
    public final /* synthetic */ String f51704C;

    public AnonymousClass4Dv(AnonymousClass4Dy anonymousClass4Dy, String str) {
        this.f51703B = anonymousClass4Dy;
        this.f51704C = str;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -863737033);
        super.onFail(anonymousClass0Q6);
        AnonymousClass33f.IX_SELF_SERVE_FETCH_DATA_ERROR.m18382A().F("entry_point", "edit_profile").F("step", "set_url").D("selected_values", AnonymousClass0db.C().G(IgReactNavigatorModule.URL, this.f51704C)).R();
        if (anonymousClass0Q6.f4287B != null) {
            AnonymousClass4Dy.m23606B(this.f51703B, anonymousClass0Q6.f4287B.getLocalizedMessage().toString(), Boolean.TRUE);
        }
        AnonymousClass4Dy.m23607C(this.f51703B, false);
        AnonymousClass0cQ.H(this, 1699704598, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -42469589);
        AnonymousClass357 anonymousClass357 = (AnonymousClass357) obj;
        int I2 = AnonymousClass0cQ.I(this, 2036030563);
        super.onSuccess(anonymousClass357);
        Boolean bool = anonymousClass357.f37655C;
        String str = this.f51704C;
        boolean booleanValue = bool.booleanValue();
        AnonymousClass0db G = AnonymousClass0db.C().G(IgReactNavigatorModule.URL, str);
        G.I("valid", booleanValue);
        AnonymousClass33f.IX_SELF_SERVE_FETCH_DATA.m18382A().F("entry_point", "edit_profile").F("step", "set_url").D("selected_values", G).R();
        AnonymousClass4Dy.m23606B(this.f51703B, this.f51703B.getResources().getString(bool.booleanValue() ? C0164R.string.url : C0164R.string.invalid_url), Boolean.valueOf(bool.booleanValue() ^ 1));
        if (bool.booleanValue()) {
            AnonymousClass0IJ anonymousClass0IJ = this.f51703B;
            str = anonymousClass0IJ.f51712B;
            String str2 = this.f51704C;
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0IJ.f51715E);
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
            anonymousClass0Pt.f4229M = "accounts/update_business_info/";
            AnonymousClass0GA H = anonymousClass0Pt.M(AnonymousClass1IX.class).N().D("is_call_to_action_enabled", "1").D("ix_url", str2).D("ix_app_id", str).H();
            H.f2849B = new AnonymousClass4Dx(anonymousClass0IJ, str2, str);
            anonymousClass0IJ.schedule(H);
        } else {
            String A = anonymousClass357.A();
            if (TextUtils.isEmpty(A)) {
                A = this.f51703B.getResources().getString(C0164R.string.invalid_url);
                AnonymousClass0Gn.C(this.f51703B.getModuleName(), "URL validation failed but no error message from backend.");
            }
            AnonymousClass4Dy.m23606B(this.f51703B, A, Boolean.TRUE);
            AnonymousClass4Dy.m23607C(this.f51703B, false);
        }
        AnonymousClass0cQ.H(this, -1272244210, I2);
        AnonymousClass0cQ.H(this, -998447273, I);
    }
}
