package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.3Jq */
public final class AnonymousClass3Jq {
    /* renamed from: B */
    public static void m19379B(View view, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass3Jp anonymousClass3Jp, Object obj, int i, int i2) {
        View view2 = view;
        Context context = view.getContext();
        AnonymousClass3Jp anonymousClass3Jp2 = anonymousClass3Jp;
        AnonymousClass3Jp anonymousClass3Jp3 = obj;
        int i3 = i;
        int i4 = i2;
        if (AnonymousClass1hw.B(anonymousClass0Cm)) {
            AnonymousClass1hw.C(anonymousClass0Cm, context, new AnonymousClass3Jn(anonymousClass3Jp2, view2, anonymousClass3Jp3, i3, i4), AnonymousClass19u.EXPLORE);
        } else if (AnonymousClass19v.B(anonymousClass0Cm, AnonymousClass19u.EXPLORE)) {
            AnonymousClass0HV D = AnonymousClass0HV.D(anonymousClass0Cm);
            int i5 = D.f2646B.getInt("zero_rating_explore_video_nux_count", 0);
            i2 = AnonymousClass0gV.B(anonymousClass0Cm).ET();
            Context context2 = context;
            AnonymousClass19x.B(context2, null, null, new AnonymousClass3Jo(D, i5, anonymousClass3Jp2, view2, anonymousClass3Jp3, i3, i4), AnonymousClass19u.EXPLORE, i2);
        } else {
            anonymousClass3Jp2.XFA(view, anonymousClass3Jp3, i3, i4);
        }
    }
}
