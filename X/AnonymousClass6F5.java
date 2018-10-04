package X;

import android.content.Context;
import android.view.View;
import com.facebook.C0164R;

/* renamed from: X.6F5 */
public final class AnonymousClass6F5 implements AnonymousClass5xO {
    public final View FT(AnonymousClass14a anonymousClass14a) {
        return anonymousClass14a.UQ();
    }

    public final AnonymousClass177 GT() {
        return AnonymousClass177.ABOVE_ANCHOR;
    }

    public final AnonymousClass176 HT(Context context, AnonymousClass0Pj anonymousClass0Pj) {
        return new AnonymousClass174(context.getString(C0164R.string.reel_viewer_react_tool_tip));
    }

    public final boolean kTA(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Pj anonymousClass0Pj, AnonymousClass14t anonymousClass14t, AnonymousClass14a anonymousClass14a) {
        if (anonymousClass14a.UQ() != null && anonymousClass14a.UQ().getVisibility() == 0) {
            AnonymousClass0HV D = AnonymousClass0HV.D(anonymousClass0Cm);
            anonymousClass14a = D.U();
            Object obj = (D.f2646B.getBoolean("has_ever_sent_feedback_reaction", false) || anonymousClass14a >= 3 || anonymousClass14a >= D.T()) ? null : 1;
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public final void uDA(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0EE anonymousClass0EE) {
        anonymousClass0Cm = AnonymousClass0HV.D(anonymousClass0Cm);
        anonymousClass0Cm.f2646B.edit().putInt("reel_viewer_react_tooltip_count", anonymousClass0Cm.U() + 1).apply();
    }
}
