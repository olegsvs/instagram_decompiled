package X;

import android.content.Context;
import android.view.View;
import com.facebook.C0164R;

/* renamed from: X.6F4 */
public final class AnonymousClass6F4 implements AnonymousClass5xO {
    public final View FT(AnonymousClass14a anonymousClass14a) {
        return anonymousClass14a.QU();
    }

    public final AnonymousClass177 GT() {
        return AnonymousClass177.ABOVE_ANCHOR;
    }

    public final AnonymousClass176 HT(Context context, AnonymousClass0Pj anonymousClass0Pj) {
        return new AnonymousClass174(context.getString(C0164R.string.question_sticker_has_responses_tooltip_text));
    }

    public final boolean kTA(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Pj anonymousClass0Pj, AnonymousClass14t anonymousClass14t, AnonymousClass14a anonymousClass14a) {
        return (anonymousClass14a.QU() == null || anonymousClass14a.QU().getVisibility() != 0 || AnonymousClass5BR.m25941B(anonymousClass0Pj) == null || AnonymousClass5BR.m25941B(anonymousClass0Pj).f16877C == 0 || AnonymousClass0HV.D(anonymousClass0Cm).f2646B.getBoolean("story_question_responders_nux_tooltip", false)) ? false : true;
    }

    public final void uDA(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0EE anonymousClass0EE) {
        AnonymousClass0HV.D(anonymousClass0Cm).f2646B.edit().putBoolean("story_question_responders_nux_tooltip", true).apply();
    }
}
