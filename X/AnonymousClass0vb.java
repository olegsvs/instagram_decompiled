package X;

import android.content.Context;
import com.facebook.C0164R;

/* renamed from: X.0vb */
public final class AnonymousClass0vb {
    /* renamed from: B */
    public static String m8345B(AnonymousClass0gb anonymousClass0gb, Context context, String str) {
        if (anonymousClass0gb.m6668B("ig_select_video_nux")) {
            return context.getResources().getString(C0164R.string.zero_rating_turn_on_video_text);
        }
        return anonymousClass0gb.m6668B("ig_video_nux") ? context.getResources().getString(C0164R.string.zero_rating_video_text) : str;
    }
}
