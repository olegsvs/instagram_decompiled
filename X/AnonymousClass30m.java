package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;
import com.facebook.C0164R;
import com.instagram.modal.ModalActivity;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.30m */
public final class AnonymousClass30m {
    /* renamed from: B */
    public static Bundle m18188B(AnonymousClass30z anonymousClass30z, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("archive_multi_select_mode", true);
        bundle.putBoolean("is_standalone_reel_archive", true);
        bundle.putBoolean("hide_footer", true);
        bundle.putSerializable("highlight_management_source", anonymousClass30z);
        bundle.putBoolean("suggested_highlights_enabled", z);
        return bundle;
    }

    /* renamed from: C */
    public static String m18189C(String str, boolean z, AnonymousClass0Cm anonymousClass0Cm) {
        if (!z) {
            return Uri.fromFile(new File(str)).toString();
        }
        File G = AnonymousClass3nk.m20689G(new File(str));
        if (G != null) {
            return Uri.fromFile(G).toString();
        }
        return anonymousClass0Cm.B().DQ();
    }

    /* renamed from: D */
    public static AnonymousClass30z m18190D(AnonymousClass0Qf anonymousClass0Qf) {
        switch (anonymousClass0Qf.ordinal()) {
            case null:
                return AnonymousClass30z.STORY_VIEWER_FEED;
            case 3:
                return AnonymousClass30z.STORY_VIEWER_PROFILE;
            case 8:
                return AnonymousClass30z.STORY_VIEWER_ARCHIVE;
            default:
                return AnonymousClass30z.STORY_VIEWER_DEFAULT;
        }
    }

    /* renamed from: E */
    public static List m18191E(AnonymousClass30n anonymousClass30n) {
        RectF F = AnonymousClass2Mh.m15234F(anonymousClass30n.f36861B, anonymousClass30n.f36863D.f3296G, anonymousClass30n.f36863D.f3292C, 1, 1);
        return Arrays.asList(new Float[]{Float.valueOf(F.left), Float.valueOf(F.top), Float.valueOf(F.right), Float.valueOf(F.bottom)});
    }

    /* renamed from: F */
    public static AnonymousClass30n m18192F(Context context, AnonymousClass0MI anonymousClass0MI, String str) {
        AnonymousClass1ND anonymousClass1ND = anonymousClass0MI.f3390W;
        if (anonymousClass1ND.f17776F != null && anonymousClass1ND.f17776F.equals(str) && anonymousClass0MI.F().size() > 1) {
            for (AnonymousClass0Pj anonymousClass0Pj : anonymousClass0MI.F()) {
                if (anonymousClass0Pj.f4137I == AnonymousClass17B.MEDIA && !anonymousClass0Pj.getId().equals(str)) {
                    AnonymousClass0P7 anonymousClass0P7 = anonymousClass0Pj.f4134F;
                    String id = anonymousClass0P7.getId();
                    return AnonymousClass30n.m18197B(anonymousClass0P7.y(context), AnonymousClass2Mh.m15230B(new Rect(0, 0, anonymousClass0P7.y(context).f3296G, anonymousClass0P7.y(context).f3292C)), id);
                }
            }
        }
        return null;
    }

    /* renamed from: G */
    public static boolean m18193G(AnonymousClass0Cm anonymousClass0Cm) {
        if (!((Boolean) AnonymousClass0CC.YJ.H(anonymousClass0Cm)).booleanValue()) {
            if (!((Boolean) AnonymousClass0CC.Sh.H(anonymousClass0Cm)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    public static boolean m18194H(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ci anonymousClass0Ci) {
        Object obj = anonymousClass0Ci.qB == AnonymousClass0Lo.PrivacyStatusPublic ? 1 : null;
        boolean B = AnonymousClass0LQ.B(anonymousClass0Cm.B(), anonymousClass0Ci);
        boolean p = anonymousClass0Ci.p();
        if ((B || (obj != null && !p)) && ((Boolean) AnonymousClass0CC.mN.H(anonymousClass0Cm)).booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public static void m18195I(Activity activity, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass30z anonymousClass30z, boolean z) {
        new AnonymousClass0Sn(ModalActivity.class, "archive_reels", AnonymousClass30m.m18188B(anonymousClass30z, z), activity, anonymousClass0Cm.f1759C).B(activity);
    }

    /* renamed from: J */
    public static void m18196J(EditText editText, AnonymousClass0Cm anonymousClass0Cm) {
        editText.setHint(((Boolean) AnonymousClass0CC.oN.H(anonymousClass0Cm)).booleanValue() ? C0164R.string.highlights_name_expanded_hint : C0164R.string.highlights_name_hint);
    }
}
