package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.16h */
public final class AnonymousClass16h {
    /* renamed from: B */
    public static void m9433B(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass16V anonymousClass16V, AnonymousClass0ov anonymousClass0ov, boolean z, boolean z2, boolean z3) {
        int i;
        AnonymousClass16W anonymousClass16W = anonymousClass16V.f14546C;
        if (anonymousClass0ov.f10440D.f3391X != null) {
            anonymousClass16W.f14555G.setText(anonymousClass0ov.f10440D.f3391X);
        } else if (anonymousClass0ov.m7762L()) {
            anonymousClass16W.f14555G.setText(anonymousClass16W.f14550B);
        } else {
            CharSequence B = AnonymousClass16i.m9434B(anonymousClass0Cm, anonymousClass0ov);
            if (anonymousClass0ov.f10441E.equals(AnonymousClass0Qf.EXPLORE) && anonymousClass0ov.m7755E().gT() == AnonymousClass0Zd.USER && anonymousClass0ov.m7755E().pT().m1030u()) {
                anonymousClass16W.f14555G.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass3bv(anonymousClass16W, B));
            } else {
                anonymousClass16W.f14555G.setText(B);
            }
        }
        if (anonymousClass16W.f14552D != null) {
            anonymousClass16W.f14555G.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass1N9(anonymousClass16W));
            TextView textView = anonymousClass16W.f14552D;
            if (anonymousClass0ov.m7751A()) {
                i = anonymousClass16W.f14553E;
            } else {
                i = AnonymousClass0Ca.m937C(anonymousClass16W.f14552D.getContext(), C0164R.color.grey_7);
            }
            textView.setTextColor(i);
        }
        anonymousClass16W.f14555G.setTextColor(AnonymousClass16i.m9435C(anonymousClass0ov, anonymousClass16W, z3));
        AnonymousClass0ct anonymousClass0ct = anonymousClass16W.f14551C;
        i = (anonymousClass0ov.f10440D.m3134Z() && !z3 && anonymousClass0ov.f10440D.m3115G() == 0) ? 0 : 8;
        anonymousClass0ct.m5931D(i);
        Object obj = (anonymousClass0ov.f10440D.f3396c == null || TextUtils.isEmpty(anonymousClass0ov.f10440D.f3396c.f41688B)) ? null : 1;
        if (obj != null) {
            anonymousClass16W.f14554F.setText(anonymousClass0ov.f10440D.f3396c.f41688B);
            anonymousClass16W.f14554F.setVisibility(0);
            textView = anonymousClass16W.f14554F;
            if (anonymousClass0ov.m7751A()) {
                i = anonymousClass16W.f14553E;
            } else {
                i = AnonymousClass0Ca.m937C(anonymousClass16W.f14554F.getContext(), C0164R.color.grey_7);
            }
            textView.setTextColor(i);
        } else {
            anonymousClass16W.f14554F.setText(JsonProperty.USE_DEFAULT_NAME);
            anonymousClass16W.f14554F.setVisibility(z ? 4 : 8);
        }
        anonymousClass16V.f14548E = anonymousClass0ov.f10440D.getId();
        if (anonymousClass0ov.m7761K()) {
            anonymousClass16V.f14547D.setAlpha(0.3f);
        } else {
            anonymousClass16V.f14547D.setAlpha(1.0f);
        }
        AnonymousClass0Nm.m3453f(anonymousClass16V.f14547D, anonymousClass0ov.f10441E.equals(AnonymousClass0Qf.EXPLORE) ? context.getResources().getDimensionPixelSize(C0164R.dimen.tray_padding_above_avatars) : 0);
        if (anonymousClass16V.f14549F != null) {
            anonymousClass16V.f14549F.xD(AnonymousClass3b9.f42584G);
            anonymousClass16V.f14549F = null;
        }
    }
}
