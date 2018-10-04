package X;

import android.view.View.OnClickListener;
import android.widget.TextView;
import com.facebook.C0164R;
import java.util.Set;

/* renamed from: X.1Zi */
public final class AnonymousClass1Zi {
    /* renamed from: B */
    public static void m11892B(AnonymousClass14r anonymousClass14r, Set set, AnonymousClass0Ci anonymousClass0Ci, boolean z, boolean z2, OnClickListener onClickListener, OnClickListener onClickListener2) {
        AnonymousClass1Zi.m11894D(anonymousClass14r, set, anonymousClass0Ci, z);
        if (z2) {
            anonymousClass14r.f14069E.A().setVisibility(0);
        } else if (anonymousClass14r.f14069E.B()) {
            anonymousClass14r.f14069E.A().setVisibility(8);
        }
        anonymousClass14r.f14073I.setText(anonymousClass0Ci.uT());
        anonymousClass14r.f14066B.setVisibility(0);
        AnonymousClass1Zi.m11893C(anonymousClass14r.f14073I, anonymousClass0Ci, z);
        anonymousClass14r.f14071G = onClickListener;
        anonymousClass14r.f14070F.setOnClickListener(onClickListener);
        anonymousClass14r.f14072H.setOnClickListener(onClickListener2);
    }

    /* renamed from: C */
    public static void m11893C(TextView textView, AnonymousClass0Ci anonymousClass0Ci, boolean z) {
        boolean z2 = anonymousClass0Ci.m1030u() && z;
        AnonymousClass15G.m9297E(textView, z2, 0, textView.getResources().getDimensionPixelSize(C0164R.dimen.reel_username_right_offset), -1);
    }

    /* renamed from: D */
    public static void m11894D(AnonymousClass14r anonymousClass14r, Set set, AnonymousClass0Ci anonymousClass0Ci, boolean z) {
        if (set.isEmpty()) {
            AnonymousClass1ZG anonymousClass1ZG = anonymousClass14r.f14068D;
            if (anonymousClass1ZG != null) {
                anonymousClass1ZG.f20192D.setVisibility(8);
            }
            anonymousClass14r.f14067C.setVisibility(8);
            anonymousClass14r.f14070F.setVisibility(0);
            anonymousClass14r.f14070F.setUrl(anonymousClass0Ci.DQ());
            return;
        }
        AnonymousClass0Ci anonymousClass0Ci2 = (AnonymousClass0Ci) set.iterator().next();
        anonymousClass14r.f14067C.setText(anonymousClass14r.f14066B.getContext().getString(C0164R.string.live_with_cobroadcaster_description, new Object[]{anonymousClass0Ci2.uT()}));
        AnonymousClass1Zi.m11893C(anonymousClass14r.f14067C, anonymousClass0Ci2, z);
        anonymousClass14r.f14067C.setVisibility(0);
        anonymousClass14r.f14070F.setVisibility(8);
        anonymousClass14r.m9228A().f20192D.setVisibility(0);
        AnonymousClass1ZG A = anonymousClass14r.m9228A();
        String DQ = anonymousClass0Ci.DQ();
        String DQ2 = anonymousClass0Ci2.DQ();
        A.f20190B.setUrl(DQ);
        A.f20191C.setUrl(DQ2);
        anonymousClass14r.m9228A().f20192D.setOnClickListener(anonymousClass14r.f14071G);
    }
}
