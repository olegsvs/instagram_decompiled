package X;

import android.content.SharedPreferences.Editor;
import com.instagram.share.twitter.TwitterOAuthActivity;
import oauth.signpost.OAuth;

/* renamed from: X.3ff */
public final class AnonymousClass3ff extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ TwitterOAuthActivity f43186B;

    public AnonymousClass3ff(TwitterOAuthActivity twitterOAuthActivity) {
        this.f43186B = twitterOAuthActivity;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 1112156941);
        AnonymousClass0Dc.B(TwitterOAuthActivity.f43187C, "Unable to retrieve token");
        TwitterOAuthActivity.m20376B(this.f43186B);
        AnonymousClass0cQ.H(this, 637222618, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -585750087);
        AnonymousClass3fg anonymousClass3fg = (AnonymousClass3fg) obj;
        int I2 = AnonymousClass0cQ.I(this, -536986892);
        AnonymousClass0Cm anonymousClass0Cm = this.f43186B.f43188B;
        String str = anonymousClass3fg.f43189B;
        String str2 = anonymousClass3fg.f43190C;
        String str3 = anonymousClass3fg.f43191D;
        Editor edit = AnonymousClass0Mu.E(anonymousClass0Cm, "twitterPreferences").edit();
        edit.putString(OAuth.OAUTH_TOKEN, str);
        edit.putString("oauth_secret", str2);
        edit.putString("username", str3);
        edit.apply();
        AnonymousClass3fY.m20373E(anonymousClass0Cm, "twitter/store_token/", AnonymousClass3fY.m20371C(anonymousClass0Cm));
        AnonymousClass3fY.m20371C(anonymousClass0Cm);
        this.f43186B.setResult(-1);
        this.f43186B.finish();
        AnonymousClass0cQ.H(this, -394994720, I2);
        AnonymousClass0cQ.H(this, -243808205, I);
    }
}
