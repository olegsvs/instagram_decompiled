package X;

import android.content.Context;
import android.view.View;
import com.facebook.C0164R;

/* renamed from: X.6F6 */
public final class AnonymousClass6F6 implements AnonymousClass5xO {
    public final View FT(AnonymousClass14a anonymousClass14a) {
        return ((AnonymousClass14Z) anonymousClass14a).f13956t.f14270F;
    }

    public final AnonymousClass177 GT() {
        return AnonymousClass177.BELOW_ANCHOR;
    }

    public final AnonymousClass176 HT(Context context, AnonymousClass0Pj anonymousClass0Pj) {
        return new AnonymousClass2Zk(context.getString(C0164R.string.slider_sticker_nux_tooltip_title), context.getString(C0164R.string.slider_sticker_nux_tooltip_text, new Object[]{anonymousClass0Pj.f4138J.uT()}));
    }

    public final boolean kTA(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Pj anonymousClass0Pj, AnonymousClass14t anonymousClass14t, AnonymousClass14a anonymousClass14a) {
        return (anonymousClass0Pj.f4134F == null || AnonymousClass0LQ.B(anonymousClass0Pj.f4134F.MA(), anonymousClass0Cm.B()) || AnonymousClass5BT.m25946D(anonymousClass0Pj) == null || !AnonymousClass5BT.m25946D(anonymousClass0Pj).f15066C || AnonymousClass5BT.m25946D(anonymousClass0Pj).C() || AnonymousClass0HV.D(anonymousClass0Cm).f2646B.getBoolean("has_ever_voted_on_story_slider", false) || AnonymousClass0HV.D(anonymousClass0Cm).f2646B.getInt("story_slider_tooltip_impression_count", 0) >= 2) ? false : true;
    }

    public final void uDA(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0EE anonymousClass0EE) {
        anonymousClass0EE = AnonymousClass0HV.D(anonymousClass0Cm);
        anonymousClass0Cm = "story_slider_tooltip_impression_count";
        anonymousClass0EE.f2646B.edit().putInt(anonymousClass0Cm, anonymousClass0EE.f2646B.getInt(anonymousClass0Cm, 0) + 1).apply();
    }
}
