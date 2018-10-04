package X;

import android.view.View;
import android.widget.TextView;

/* renamed from: X.4Rp */
public final class AnonymousClass4Rp {
    /* renamed from: B */
    public static void m24235B(AnonymousClass4Ro anonymousClass4Ro, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass14J anonymousClass14J) {
        String str = "music_editor_nux_seen_count";
        if (AnonymousClass0HV.D(anonymousClass0Cm).f2646B.getInt(str, 0) >= 3) {
            anonymousClass14J.onFinish();
            return;
        }
        AnonymousClass14H.H(true, new View[]{(TextView) anonymousClass4Ro.f54143C.A()});
        anonymousClass4Ro.f54144D = anonymousClass14J;
        r3.postDelayed(anonymousClass4Ro.f54142B, 4000);
        AnonymousClass0HV D = AnonymousClass0HV.D(anonymousClass0Cm);
        D.f2646B.edit().putInt(str, D.f2646B.getInt(str, 0) + 1).apply();
    }
}
