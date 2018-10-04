package X;

import android.content.res.Resources;
import com.facebook.C0164R;

/* renamed from: X.10Z */
public final class AnonymousClass10Z {
    /* renamed from: B */
    public static void m8717B(String str, AnonymousClass0Sb anonymousClass0Sb, int i) {
        if (str != null) {
            anonymousClass0Sb.m4376R(str);
            anonymousClass0Sb.m4377S(C0164R.style.ReelTrayOptionsDialogTitleText);
            if (i == 0) {
                anonymousClass0Sb.m4373O(C0164R.string.ok, null);
            }
        }
    }

    /* renamed from: C */
    public static String m8718C(Resources resources, AnonymousClass0MI anonymousClass0MI) {
        if (anonymousClass0MI.f3385R.gT() == AnonymousClass0Zd.USER || anonymousClass0MI.f3385R.QK() == null) {
            return null;
        }
        return resources.getString(C0164R.string.multi_author_story_cover_photo_attribution, new Object[]{anonymousClass0MI.f3385R.QK()});
    }
}
