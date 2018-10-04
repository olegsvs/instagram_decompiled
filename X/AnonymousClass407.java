package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.net.URLEncoder;

/* renamed from: X.407 */
public final class AnonymousClass407 extends AnonymousClass3Kx {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1Y9 f48177B;

    public AnonymousClass407(AnonymousClass1Y9 anonymousClass1Y9) {
        this.f48177B = anonymousClass1Y9;
        super(anonymousClass1Y9.f19973B);
    }

    /* renamed from: A */
    public final void mo4911A(Exception exception) {
        super.mo4911A(exception);
        AnonymousClass1Y9.D(this.f48177B, AnonymousClass3cL.TWITTER, exception);
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void mo4912B(Object obj) {
        mo4913C((AnonymousClass3LD) obj);
    }

    /* renamed from: C */
    public final void mo4913C(AnonymousClass3LD anonymousClass3LD) {
        super.mo4913C(anonymousClass3LD);
        Bundle bundle = new Bundle();
        String B = AnonymousClass1Y9.B(this.f48177B, anonymousClass3LD);
        bundle.putString("android.intent.extra.TEXT", B);
        AnonymousClass3LD anonymousClass3LD2 = new AnonymousClass3LD(anonymousClass3LD.f40272C, null, true);
        String str = "com.twitter.android";
        if (AnonymousClass0EF.G(this.f48177B.f19973B.f12596B, str)) {
            AnonymousClass0xX.M(this.f48177B.f19973B, str, "share_to_twitter", anonymousClass3LD2, bundle, false, false);
        } else {
            String encode;
            try {
                encode = URLEncoder.encode(B, "UTF-8");
            } catch (Throwable e) {
                AnonymousClass0Dc.W("TwitterHelper", e, "Unsupported UTF-8 encoding, should never happen.", new Object[0]);
                encode = URLEncoder.encode(B);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("https://twitter.com/intent/tweet?text=");
            stringBuilder.append(encode);
            str = stringBuilder.toString();
            String str2 = "share_to_twitter";
            if (AnonymousClass0IW.Q(new Intent("android.intent.action.VIEW", Uri.parse(str)), this.f48177B.f19973B.f12596B)) {
                AnonymousClass0NN.B(str2, null).F("type", "link").R();
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to share via the web URL intent: ");
                stringBuilder.append(str);
                AnonymousClass0Gn.C(str2, stringBuilder.toString());
            }
        }
        AnonymousClass1Y9.E(this.f48177B, AnonymousClass3cL.TWITTER, anonymousClass3LD2.f40272C);
    }
}
