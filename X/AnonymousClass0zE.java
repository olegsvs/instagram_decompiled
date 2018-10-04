package X;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.0zE */
public final class AnonymousClass0zE {
    /* renamed from: B */
    public static void m8677B(AnonymousClass0zD anonymousClass0zD, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0Ci anonymousClass0Ci, AnonymousClass0QJ anonymousClass0QJ) {
        Object obj = (anonymousClass0P7.gB && anonymousClass0Ci.equals(anonymousClass0P7.MA())) ? 1 : null;
        if (obj != null) {
            if (anonymousClass0zD.f12974D == null) {
                View inflate = anonymousClass0zD.f12975E.inflate();
                anonymousClass0zD.f12974D = inflate;
                anonymousClass0zD.f12973C = (TextView) inflate.findViewById(C0164R.id.violation_banner_text);
                anonymousClass0zD.f12972B = anonymousClass0zD.f12974D.getResources().getString(C0164R.string.learn_more);
                anonymousClass0zD.f12973C.setHighlightColor(AnonymousClass0Ca.m937C(anonymousClass0zD.f12974D.getContext(), C0164R.color.transparent));
            }
            CharSequence C = AnonymousClass1g3.m12473C(anonymousClass0zD.f12972B, new SpannableStringBuilder(anonymousClass0zD.f12974D.getResources().getString(anonymousClass0P7.eB ? C0164R.string.branded_content_violation_story_banner_learn_more : C0164R.string.branded_content_violation_post_banner_learn_more, new Object[]{anonymousClass0zD.f12972B})), new AnonymousClass1R7(AnonymousClass0Ca.m937C(anonymousClass0zD.f12974D.getContext(), C0164R.color.white), anonymousClass0QJ));
            anonymousClass0zD.f12973C.setMovementMethod(LinkMovementMethod.getInstance());
            anonymousClass0zD.f12973C.setText(C);
            anonymousClass0zD.f12974D.setVisibility(0);
            return;
        }
        AnonymousClass0Nm.m3436O(anonymousClass0zD.f12974D);
    }
}
