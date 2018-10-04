package X;

import android.content.Context;
import android.view.View;
import com.facebook.C0164R;

/* renamed from: X.6F3 */
public final class AnonymousClass6F3 implements AnonymousClass5xO {
    public final View FT(AnonymousClass14a anonymousClass14a) {
        return ((AnonymousClass14Z) anonymousClass14a).f13948l.f14265C;
    }

    public final AnonymousClass177 GT() {
        return AnonymousClass177.BELOW_ANCHOR;
    }

    public final AnonymousClass176 HT(Context context, AnonymousClass0Pj anonymousClass0Pj) {
        return new AnonymousClass174(context.getString(C0164R.string.question_sticker_viewer_nux_tooltip_text));
    }

    public final boolean kTA(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Pj anonymousClass0Pj, AnonymousClass14t anonymousClass14t, AnonymousClass14a anonymousClass14a) {
        return AnonymousClass5BS.m25943C(anonymousClass0Pj) != null && AnonymousClass5BS.m25943C(anonymousClass0Pj).f16870C && !AnonymousClass0HV.D(anonymousClass0Cm).f2646B.getBoolean("has_ever_responded_to_story_question", false) && AnonymousClass0HV.D(anonymousClass0Cm).f2646B.getInt("story_question_tooltip_impression_count", 0) < 2;
    }

    public final void uDA(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0EE anonymousClass0EE) {
        anonymousClass0EE = AnonymousClass0HV.D(anonymousClass0Cm);
        anonymousClass0Cm = "story_question_tooltip_impression_count";
        anonymousClass0EE.f2646B.edit().putInt(anonymousClass0Cm, anonymousClass0EE.f2646B.getInt(anonymousClass0Cm, 0) + 1).apply();
    }
}
