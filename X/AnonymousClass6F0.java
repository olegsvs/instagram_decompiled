package X;

import android.content.Context;
import android.view.View;
import com.facebook.C0164R;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6F0 */
public final class AnonymousClass6F0 implements AnonymousClass5xO {
    /* renamed from: B */
    private static boolean m29606B(long j) {
        if (j == 0) {
            return true;
        }
        if (TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - j > 604800) {
            return true;
        }
        return false;
    }

    public final View FT(AnonymousClass14a anonymousClass14a) {
        return anonymousClass14a.kL();
    }

    public final AnonymousClass177 GT() {
        return AnonymousClass177.ABOVE_ANCHOR;
    }

    public final AnonymousClass176 HT(Context context, AnonymousClass0Pj anonymousClass0Pj) {
        return new AnonymousClass174(context.getString(C0164R.string.share_to_facebook_title));
    }

    public final boolean kTA(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Pj anonymousClass0Pj, AnonymousClass14t anonymousClass14t, AnonymousClass14a anonymousClass14a) {
        anonymousClass14t = AnonymousClass0HV.D(anonymousClass0Cm);
        return anonymousClass14a.kL() != null && !anonymousClass14a.kL().isSelected() && anonymousClass0Pj.f4134F.FB() && AnonymousClass0a2.K(anonymousClass0Cm) && anonymousClass14t.f2646B.getInt("reel_one_tap_fbshare_tooltip_count", 0) < 3 && AnonymousClass6F0.m29606B(anonymousClass14t.f2646B.getLong("reel_one_tap_fbshare_tooltip_last_seen_sec", 0));
    }

    public final void uDA(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0EE anonymousClass0EE) {
        AnonymousClass0NN.B("ig_reel_one_tap_fb_sharing", anonymousClass0EE).H("tooltip_impression", true).R();
        anonymousClass0EE = AnonymousClass0HV.D(anonymousClass0Cm);
        anonymousClass0EE.f2646B.edit().putLong("reel_one_tap_fbshare_tooltip_last_seen_sec", TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())).apply();
        anonymousClass0EE.f2646B.edit().putInt("reel_one_tap_fbshare_tooltip_count", anonymousClass0EE.f2646B.getInt("reel_one_tap_fbshare_tooltip_count", 0) + 1).apply();
    }
}
