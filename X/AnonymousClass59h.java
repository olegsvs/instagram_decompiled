package X;

import android.content.Context;
import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.59h */
public final class AnonymousClass59h {
    /* renamed from: B */
    public static void m25874B(boolean z, AnonymousClass0MI anonymousClass0MI, Context context, AnonymousClass0Fz anonymousClass0Fz, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass10Y anonymousClass10Y) {
        if (anonymousClass0MI.f3385R.gT() == AnonymousClass0Zd.HASHTAG) {
            AnonymousClass0GA H;
            Hashtag hashtag = new Hashtag(anonymousClass0MI.f3385R.getId());
            boolean z2 = z;
            AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
            AnonymousClass59h.m25875C(hashtag, anonymousClass0Cm, z);
            String H2;
            AnonymousClass0Pt anonymousClass0Pt;
            if (z) {
                H2 = anonymousClass0MI.H();
                anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cm);
                anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
                anonymousClass0Pt.f4229M = "friendships/mute_friend_reel/";
                H = anonymousClass0Pt.D("reel_id", anonymousClass0MI.getId()).D("source", "main_feed").D("reel_type", H2).M(AnonymousClass3lW.class).N().H();
            } else {
                H2 = anonymousClass0MI.H();
                anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cm);
                anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
                anonymousClass0Pt.f4229M = "friendships/unmute_friend_reel/";
                H = anonymousClass0Pt.D("reel_id", anonymousClass0MI.getId()).D("reel_type", H2).M(AnonymousClass3lW.class).N().H();
            }
            H.f2849B = new AnonymousClass1Ye(hashtag, anonymousClass0Cm2, z2, context, anonymousClass10Y, anonymousClass0MI);
            AnonymousClass0Px.B(context, anonymousClass0Fz, H);
        }
    }

    /* renamed from: C */
    public static void m25875C(Hashtag hashtag, AnonymousClass0Cm anonymousClass0Cm, boolean z) {
        for (AnonymousClass0MI anonymousClass0MI : AnonymousClass0MB.C(anonymousClass0Cm).E(false)) {
            if (new Hashtag(anonymousClass0MI.f3385R.getId()).equals(hashtag)) {
                anonymousClass0MI.f3383P = z;
            }
        }
    }

    /* renamed from: D */
    public static void m25876D(boolean z, AnonymousClass0MI anonymousClass0MI, Context context, AnonymousClass0Fz anonymousClass0Fz, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass10Y anonymousClass10Y) {
        AnonymousClass0Ci pT = anonymousClass0MI.f3385R.pT();
        if (pT != null) {
            AnonymousClass0GA D;
            boolean z2 = z;
            pT.JB = z;
            AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
            AnonymousClass0MB.C(anonymousClass0Cm).K(pT, z);
            if (z) {
                D = AnonymousClass0Nz.D(anonymousClass0Cm, pT, "main_feed", anonymousClass0MI.H());
            } else {
                String H = anonymousClass0MI.H();
                AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cm);
                anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
                D = anonymousClass0Pt.L("friendships/unmute_friend_reel/%s/", new Object[]{pT.getId()}).D("reel_type", H).M(AnonymousClass3lW.class).N().H();
            }
            D.f2849B = new AnonymousClass59g(pT, anonymousClass0Cm2, z2, context, anonymousClass10Y, anonymousClass0MI);
            AnonymousClass0Px.B(context, anonymousClass0Fz, D);
        }
    }

    /* renamed from: E */
    public static void m25877E(Context context, boolean z) {
        Toast.makeText(context, context.getString(z ? C0164R.string.mute_story_failure : C0164R.string.unmute_story_failure), 0).show();
    }
}
