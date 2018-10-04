package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.common.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.64M */
public final class AnonymousClass64M {
    /* renamed from: B */
    public static void m28860B(AnonymousClass64J anonymousClass64J, AnonymousClass0MI anonymousClass0MI, AnonymousClass6FM anonymousClass6FM, int i) {
        anonymousClass64J.m28859A();
        if (anonymousClass0MI.Q() && anonymousClass0MI.f3388U.f4149C.B()) {
            AnonymousClass64M.m28862D(anonymousClass64J, C0164R.string.live_video_ended);
            return;
        }
        AnonymousClass64M.m28864F(anonymousClass64J, anonymousClass0MI);
        anonymousClass64J.f71437H = new AnonymousClass6FO(anonymousClass6FM, anonymousClass0MI, i);
    }

    /* renamed from: C */
    public static void m28861C(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass64J anonymousClass64J, AnonymousClass0MI anonymousClass0MI, List list, AnonymousClass0SW anonymousClass0SW, AnonymousClass64D anonymousClass64D, int i, int i2) {
        AnonymousClass64J anonymousClass64J2 = anonymousClass64J;
        anonymousClass64J.m28859A();
        AnonymousClass0MI anonymousClass0MI2 = anonymousClass0MI;
        if (anonymousClass0MI.Q() && anonymousClass0MI.f3388U.f4149C.B()) {
            AnonymousClass64M.m28862D(anonymousClass64J, C0164R.string.live_video_ended);
        } else if (anonymousClass64D.f71422B) {
            AnonymousClass64M.m28862D(anonymousClass64J, C0164R.string.live_video_reduced_visibility);
        } else {
            String T;
            View view = anonymousClass64J.f71432C;
            int i3 = i;
            int i4 = i2;
            Resources resources = view.getResources();
            if (anonymousClass0MI.Q()) {
                T = anonymousClass0MI.f3388U.f4174b.T();
            } else {
                T = anonymousClass0MI.f3389V.f15179I.T();
            }
            view.setContentDescription(resources.getString(C0164R.string.grid_live_video, new Object[]{T, Integer.valueOf(i + 1), Integer.valueOf(i2 + 1)}));
            AnonymousClass64M.m28864F(anonymousClass64J, anonymousClass0MI);
            anonymousClass64J.f71437H = new AnonymousClass6FN(anonymousClass0Cm, anonymousClass0SW, anonymousClass0MI2, list, anonymousClass64J2, i3, i4, context);
        }
    }

    /* renamed from: D */
    public static void m28862D(AnonymousClass64J anonymousClass64J, int i) {
        anonymousClass64J.f71431B.setVisibility(8);
        anonymousClass64J.f71439J.setVisibility(8);
        anonymousClass64J.f71438I.setVisibility(8);
        anonymousClass64J.f71434E.A().setVisibility(0);
        anonymousClass64J.f71437H = null;
        if (anonymousClass64J.f71436G == null) {
            anonymousClass64J.f71436G = (TextView) anonymousClass64J.f71434E.A().findViewById(C0164R.id.message_title);
        }
        anonymousClass64J.f71436G.setText(i);
        anonymousClass64J.f71432C.setContentDescription(anonymousClass64J.f71432C.getResources().getString(i));
    }

    /* renamed from: E */
    public static AnonymousClass64J m28863E(Context context, ViewGroup viewGroup, float f, AnonymousClass0p8 anonymousClass0p8) {
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) LayoutInflater.from(context).inflate(C0164R.layout.top_live_home_reel, viewGroup, false);
        mediaFrameLayout.setAspectRatio(f);
        mediaFrameLayout.setFocusable(true);
        mediaFrameLayout.findViewById(C0164R.id.shadow).setBackgroundDrawable(new AnonymousClass64F());
        IgImageView igImageView = (IgImageView) mediaFrameLayout.findViewById(C0164R.id.top_live_cover);
        igImageView.setImageRenderer(anonymousClass0p8);
        AnonymousClass64J anonymousClass64J = new AnonymousClass64J(mediaFrameLayout, igImageView, (TextView) mediaFrameLayout.findViewById(C0164R.id.viewer_count), (TextView) mediaFrameLayout.findViewById(C0164R.id.username));
        mediaFrameLayout.setTag(anonymousClass64J);
        return anonymousClass64J;
    }

    /* renamed from: F */
    private static void m28864F(AnonymousClass64J anonymousClass64J, AnonymousClass0MI anonymousClass0MI) {
        AnonymousClass0Ci anonymousClass0Ci;
        Object G = AnonymousClass64M.m28865G(anonymousClass0MI);
        int H = AnonymousClass64M.m28866H(anonymousClass0MI);
        if (anonymousClass0MI.Q()) {
            anonymousClass0Ci = anonymousClass0MI.f3388U.f4174b;
        } else {
            anonymousClass0Ci = anonymousClass0MI.f3389V.f15179I;
        }
        if (anonymousClass0MI.R() && !anonymousClass0MI.f3389V.f15172B.isEmpty()) {
            TextView textView = (TextView) anonymousClass64J.f71435F.A();
            textView.setText(AnonymousClass0dw.G(textView.getContext(), ((AnonymousClass0Pm) anonymousClass0MI.f3389V.f15172B.get(0)).f4166T));
            textView.setVisibility(0);
        }
        if (!TextUtils.isEmpty(G)) {
            anonymousClass64J.f71431B.setUrl(G);
        }
        anonymousClass64J.f71431B.setVisibility(0);
        anonymousClass64J.f71439J.setVisibility(0);
        anonymousClass64J.f71438I.setVisibility(0);
        anonymousClass64J.f71439J.setText(AnonymousClass3nt.C(Integer.valueOf(H)));
        anonymousClass64J.f71438I.setText(anonymousClass0Ci.uT());
        AnonymousClass15G.E(anonymousClass64J.f71438I, anonymousClass0Ci.u(), 0, (int) AnonymousClass0Nm.E(anonymousClass64J.f71438I.getResources().getDisplayMetrics(), 4), -1);
    }

    /* renamed from: G */
    private static String m28865G(AnonymousClass0MI anonymousClass0MI) {
        if (anonymousClass0MI.Q()) {
            return anonymousClass0MI.f3388U.G();
        }
        return !anonymousClass0MI.f3389V.f15172B.isEmpty() ? ((AnonymousClass0Pm) anonymousClass0MI.f3389V.f15172B.get(0)).G() : JsonProperty.USE_DEFAULT_NAME;
    }

    /* renamed from: H */
    private static int m28866H(AnonymousClass0MI anonymousClass0MI) {
        if (anonymousClass0MI.Q()) {
            return anonymousClass0MI.f3388U.f4175c;
        }
        int i = 0;
        if (!anonymousClass0MI.f3389V.f15172B.isEmpty()) {
            i = ((AnonymousClass0Pm) anonymousClass0MI.f3389V.f15172B.get(0)).f4172Z;
        }
        return i;
    }
}
