package X;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.model.sharelater.ShareLaterMedia;
import java.util.Map.Entry;

/* renamed from: X.4WK */
public final class AnonymousClass4WK implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5UX f54822B;

    public AnonymousClass4WK(AnonymousClass5UX anonymousClass5UX) {
        this.f54822B = anonymousClass5UX;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 1720350738);
        this.f54822B.f64960D.f41719B = this.f54822B.f64958B.getText().toString();
        AnonymousClass0IJ anonymousClass0IJ = this.f54822B;
        AnonymousClass0Cm anonymousClass0Cm = anonymousClass0IJ.f64963G;
        ShareLaterMedia shareLaterMedia = this.f54822B.f64960D;
        AnonymousClass0Pt L = new AnonymousClass0Pt(anonymousClass0Cm).L("media/%s/share/", new Object[]{shareLaterMedia.f41720C});
        L.f4226J = AnonymousClass0Pu.f4247G;
        AnonymousClass0Pt D = L.M(AnonymousClass0Pv.class).D("media_id", shareLaterMedia.f41720C).D("caption", shareLaterMedia.f41719B);
        if (shareLaterMedia.sY()) {
            for (Entry entry : AnonymousClass3fY.m20371C(anonymousClass0Cm).m20374A().entrySet()) {
                D.D((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (shareLaterMedia.TX()) {
            String str = AnonymousClass0a2.H(anonymousClass0Cm).f28506B;
            if (TextUtils.isEmpty(str)) {
                str = AnonymousClass0a2.B(anonymousClass0Cm);
            }
            D.D("share_to_facebook", "1");
            D.D("fb_access_token", str);
        }
        if (shareLaterMedia.rY()) {
            AnonymousClass3fS B = AnonymousClass3fS.m20361B(anonymousClass0Cm);
            D.D("share_to_tumblr", "1");
            D.D("tumblr_access_token_key", B.f43161C);
            D.D("tumblr_access_token_secret", B.f43160B);
        }
        if (shareLaterMedia.gW() && AnonymousClass3ed.m20303E(anonymousClass0Cm)) {
            AnonymousClass3ed B2 = AnonymousClass3ed.m20300B(anonymousClass0Cm);
            D.D("share_to_ameba", "1");
            D.D("ameba_access_token", B2.f43040B);
            String D2 = AnonymousClass3ed.m20302D(anonymousClass0Cm);
            if (D2 != null) {
                D.D("ameba_theme_id", D2);
            }
        }
        if (shareLaterMedia.CY()) {
            AnonymousClass3fJ B3 = AnonymousClass3fJ.m20354B(anonymousClass0Cm);
            D.D("share_to_odnoklassniki", "1");
            D.D("odnoklassniki_access_token", B3.f43140B);
        }
        AnonymousClass0GA H = D.H();
        H.f2849B = this.f54822B.f64961E;
        anonymousClass0IJ.schedule(H);
        AnonymousClass5UX.C(this.f54822B, "share_later_fragment_share_tapped").R();
        AnonymousClass0EE anonymousClass0EE = this.f54822B;
        AnonymousClass3f3.m20336C(anonymousClass0EE, anonymousClass0EE.f64960D.f41720C, "share_later_view");
        AnonymousClass0cQ.L(this, 509884446, M);
    }
}
