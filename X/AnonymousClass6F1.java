package X;

import android.content.Context;
import android.view.View;
import com.facebook.C0164R;

/* renamed from: X.6F1 */
public final class AnonymousClass6F1 implements AnonymousClass5xO {
    public final View FT(AnonymousClass14a anonymousClass14a) {
        return ((AnonymousClass5Cl) anonymousClass14a).ZQ();
    }

    public final AnonymousClass177 GT() {
        return AnonymousClass177.BELOW_ANCHOR;
    }

    public final AnonymousClass176 HT(Context context, AnonymousClass0Pj anonymousClass0Pj) {
        return new AnonymousClass2Zk(context.getString(C0164R.string.polling_nux_tooltip_title), context.getString(C0164R.string.polling_nux_tooltip_text, new Object[]{anonymousClass0Pj.f4138J.uT()}));
    }

    public final boolean kTA(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Pj anonymousClass0Pj, AnonymousClass14t anonymousClass14t, AnonymousClass14a anonymousClass14a) {
        return AnonymousClass161.E(anonymousClass0Pj) != null && AnonymousClass161.E(anonymousClass0Pj).f14400G && AnonymousClass161.E(anonymousClass0Pj).f14401H == null && !AnonymousClass0HV.D(anonymousClass0Cm).f2646B.getBoolean("has_ever_voted_on_story_poll", false) && AnonymousClass0HV.D(anonymousClass0Cm).f2646B.getInt("story_poll_tooltip_impression_count", 0) < 2;
    }

    public final void uDA(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0EE anonymousClass0EE) {
        anonymousClass0EE = AnonymousClass0HV.D(anonymousClass0Cm);
        anonymousClass0Cm = "story_poll_tooltip_impression_count";
        anonymousClass0EE.f2646B.edit().putInt(anonymousClass0Cm, anonymousClass0EE.f2646B.getInt(anonymousClass0Cm, 0) + 1).apply();
    }
}
