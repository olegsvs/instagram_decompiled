package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.facebook.C0164R;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5pt */
public final class AnonymousClass5pt extends AnonymousClass1Rv {
    /* renamed from: C */
    public final String m28508C() {
        return "tap_facebook";
    }

    public AnonymousClass5pt(AnonymousClass1fo anonymousClass1fo) {
        super(anonymousClass1fo);
    }

    /* renamed from: A */
    public final int m28506A() {
        return this.f18666B.B();
    }

    /* renamed from: B */
    public final int m28507B() {
        return C0164R.drawable.instagram_facebook_outline_24;
    }

    /* renamed from: D */
    public final int m28509D() {
        return C0164R.string.slideout_menu_facebook;
    }

    /* renamed from: E */
    public final void m28510E(View view, View view2) {
        AnonymousClass1gJ anonymousClass1gJ = this.f18666B.f21257G;
        if (anonymousClass1gJ != null) {
            if (anonymousClass1gJ.f21337B > 0) {
                AnonymousClass0HV D = AnonymousClass0HV.D(anonymousClass1gJ.f21346K);
                D.f2646B.edit().putLong("facebook_entrypoint_badge_last_clear_timestamp", TimeUnit.SECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS)).apply();
            }
            Object obj = anonymousClass1gJ.f21339D;
            int i = anonymousClass1gJ.f21337B;
            Context context = obj.getContext();
            AnonymousClass0NN B = AnonymousClass0NN.B("ig_profile_fb_entrypoint_clicked", obj).B("badge_count", i);
            if (AnonymousClass0EF.K(context)) {
                B.F("dest_surface", "native_app");
            } else {
                B.F("dest_surface", "msite");
            }
            B.R();
            anonymousClass1gJ.f21337B = 0;
            AnonymousClass1gJ.D(anonymousClass1gJ);
            if (!anonymousClass1gJ.f21344I || AnonymousClass0EF.K(anonymousClass1gJ.f21339D.getContext())) {
                Long l;
                String str;
                String uri;
                StringBuilder stringBuilder;
                Uri B2 = AnonymousClass1gJ.B(AnonymousClass3Kb.f40194B);
                if (anonymousClass1gJ.f21342G) {
                    l = anonymousClass1gJ.f21343H;
                    if (l == null || l.longValue() == 0) {
                        str = "family_entrypoint/?show_unconnected_interstitial=true";
                        uri = B2.toString();
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("fb://");
                        stringBuilder.append(str);
                        AnonymousClass3Kb.E(anonymousClass1gJ.f21339D.getContext(), anonymousClass1gJ.f21346K, anonymousClass1gJ.f21339D, "profile_fb_entrypoint", uri, false, stringBuilder.toString(), null, null);
                        return;
                    }
                }
                if (anonymousClass1gJ.f21341F) {
                    l = anonymousClass1gJ.f21343H;
                    if (!(l == null || l.longValue() == 0)) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("family_entrypoint/?ig_profile_fb_entrypoint_target_id=");
                        stringBuilder.append(anonymousClass1gJ.f21343H);
                        str = stringBuilder.toString();
                        if (anonymousClass1gJ.f21345J) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(str);
                            stringBuilder.append("&use_ig_sso=true");
                            str = stringBuilder.toString();
                        }
                        uri = B2.toString();
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("fb://");
                        stringBuilder.append(str);
                        AnonymousClass3Kb.E(anonymousClass1gJ.f21339D.getContext(), anonymousClass1gJ.f21346K, anonymousClass1gJ.f21339D, "profile_fb_entrypoint", uri, false, stringBuilder.toString(), null, null);
                        return;
                    }
                }
                str = "feed";
                uri = B2.toString();
                stringBuilder = new StringBuilder();
                stringBuilder.append("fb://");
                stringBuilder.append(str);
                AnonymousClass3Kb.E(anonymousClass1gJ.f21339D.getContext(), anonymousClass1gJ.f21346K, anonymousClass1gJ.f21339D, "profile_fb_entrypoint", uri, false, stringBuilder.toString(), null, null);
                return;
            }
            AnonymousClass0Ie anonymousClass0Ie = anonymousClass1gJ.f21339D;
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass1gJ.f21346K);
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
            anonymousClass0Pt.f4229M = "family_navigation/msite_forward_url/";
            AnonymousClass0GA H = anonymousClass0Pt.M(AnonymousClass5ol.class).N().H();
            H.f2849B = new AnonymousClass5og(anonymousClass1gJ);
            anonymousClass0Ie.schedule(H);
        }
    }
}
