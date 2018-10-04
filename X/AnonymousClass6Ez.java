package X;

import android.content.Context;
import android.view.View;
import com.facebook.C0164R;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: X.6Ez */
public final class AnonymousClass6Ez implements AnonymousClass5xO {
    /* renamed from: B */
    private static String m29605B(Context context, AnonymousClass0Pj anonymousClass0Pj) {
        boolean q = anonymousClass0Pj.q();
        switch (anonymousClass0Pj.B().size()) {
            case 0:
                throw new UnsupportedOperationException("Not expecting to generate string for reel item with no aggregated views");
            case 1:
                return context.getString(q ? C0164R.string.multi_author_story_view_count_nux_video_title_one : C0164R.string.multi_author_story_view_count_nux_photo_title_one, new Object[]{anonymousClass0Pj.B().get(0)});
            default:
                int i;
                if (q) {
                    i = C0164R.plurals.multi_author_story_view_count_nux_video_title_plural;
                } else {
                    i = C0164R.plurals.multi_author_story_view_count_nux_photo_title_plural;
                }
                return context.getResources().getQuantityString(i, anonymousClass0Pj.B().size() - 1, new Object[]{anonymousClass0Pj.B().get(0), NumberFormat.getInstance(Locale.getDefault()).format((long) (anonymousClass0Pj.B().size() - 1))});
        }
    }

    public final View FT(AnonymousClass14a anonymousClass14a) {
        return anonymousClass14a.QU();
    }

    public final AnonymousClass177 GT() {
        return AnonymousClass177.ABOVE_ANCHOR;
    }

    public final AnonymousClass176 HT(Context context, AnonymousClass0Pj anonymousClass0Pj) {
        return new AnonymousClass174(AnonymousClass6Ez.m29605B(context, anonymousClass0Pj));
    }

    public final boolean kTA(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Pj anonymousClass0Pj, AnonymousClass14t anonymousClass14t, AnonymousClass14a anonymousClass14a) {
        if (anonymousClass0Pj.f4138J.equals(anonymousClass0Cm.B())) {
            if (!anonymousClass0Pj.B().isEmpty()) {
                if (!AnonymousClass0HV.D(anonymousClass0Cm).f2646B.getBoolean("seen_multi_author_story_view_count_nux", false)) {
                    if (anonymousClass14a instanceof AnonymousClass14Z) {
                        AnonymousClass14Z anonymousClass14Z = (AnonymousClass14Z) anonymousClass14a;
                        if (anonymousClass14Z.f13936Z != AnonymousClass0Qf.DIRECT_STORY_RESHARE) {
                            if (anonymousClass14Z.QU() != null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void uDA(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0EE anonymousClass0EE) {
        AnonymousClass0HV.D(anonymousClass0Cm).f2646B.edit().putBoolean("seen_multi_author_story_view_count_nux", true).apply();
    }
}
