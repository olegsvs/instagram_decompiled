package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.ui.widget.pulsingbutton.PulsingButton;

/* renamed from: X.4d5 */
public final class AnonymousClass4d5 {
    /* renamed from: B */
    public static void m24605B(AnonymousClass0eT anonymousClass0eT, AnonymousClass5VW anonymousClass5VW) {
        anonymousClass0eT.n(true);
        AnonymousClass22r B = AnonymousClass0eW.B(AnonymousClass0eV.DEFAULT);
        B.f25413G = new AnonymousClass4d1(anonymousClass5VW);
        anonymousClass0eT.d(B.m14277B());
    }

    /* renamed from: C */
    public static void m24606C(AnonymousClass0eT anonymousClass0eT, AnonymousClass0Vw anonymousClass0Vw, AnonymousClass5VW anonymousClass5VW) {
        Object obj = 1;
        if (anonymousClass0Vw.P() != 1) {
            obj = null;
        }
        anonymousClass0eT.G(obj != null ? C0164R.drawable.nav_flag_filled : C0164R.drawable.nav_flag_outline, obj != null ? C0164R.string.flag : C0164R.string.unflag, new AnonymousClass4d3(anonymousClass5VW));
    }

    /* renamed from: D */
    public static void m24607D(Activity activity, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Vw anonymousClass0Vw, boolean z, AnonymousClass0eT anonymousClass0eT, AnonymousClass5VW anonymousClass5VW, boolean z2, AnonymousClass0ES anonymousClass0ES) {
        View shimmerFrameLayout;
        AnonymousClass0Cm anonymousClass0Cm2;
        boolean B = AnonymousClass1RQ.B(anonymousClass0Vw);
        Activity activity2 = activity;
        View pulsingButton = new PulsingButton(activity);
        if (B) {
            if (z2) {
                pulsingButton.m15173A(0, AnonymousClass0Ca.C(activity, C0164R.color.white_50_transparent));
                pulsingButton.setColorFilter(AnonymousClass0ca.B(-1));
                pulsingButton.setButtonResource(C0164R.drawable.video_call);
            } else {
                pulsingButton.setButtonResource(AnonymousClass0G5.F(activity, C0164R.attr.directVideoCallActiveDrawable));
                pulsingButton.m15173A(0, AnonymousClass0G5.D(activity, C0164R.attr.directVideoCallActivePulseColor));
            }
            pulsingButton.setPulsingEnabled(true);
        } else if (!z) {
            pulsingButton.setButtonResource(C0164R.drawable.video_call);
        } else if (z2) {
            pulsingButton.setColorFilter(AnonymousClass0ca.B(-1));
            pulsingButton.setButtonResource(C0164R.drawable.video_call);
        } else {
            pulsingButton.setButtonResource(AnonymousClass0G5.F(activity, C0164R.attr.directVideoCallActiveDrawable));
            shimmerFrameLayout = new ShimmerFrameLayout(activity);
            shimmerFrameLayout.setDuration(StartupQEsConfig.DEFAULT_NON_CRITICAL_INEED_INIT_IDLE_DELAY);
            shimmerFrameLayout.addView(pulsingButton);
            shimmerFrameLayout.m13911A();
            anonymousClass0Cm2 = anonymousClass0Cm;
            anonymousClass0Cm = AnonymousClass0HV.D(anonymousClass0Cm);
            anonymousClass0eT.O(shimmerFrameLayout, C0164R.string.video_call, new AnonymousClass4d4(anonymousClass0Cm, anonymousClass5VW), false);
            shimmerFrameLayout.postDelayed(new AnonymousClass4m5(shimmerFrameLayout, anonymousClass0Cm2, anonymousClass0Cm, activity2, anonymousClass0ES, activity2.getString(C0164R.string.videocall_start_a_video_chat)), 1000);
        }
        shimmerFrameLayout = pulsingButton;
        anonymousClass0Cm2 = anonymousClass0Cm;
        anonymousClass0Cm = AnonymousClass0HV.D(anonymousClass0Cm);
        anonymousClass0eT.O(shimmerFrameLayout, C0164R.string.video_call, new AnonymousClass4d4(anonymousClass0Cm, anonymousClass5VW), false);
        shimmerFrameLayout.postDelayed(new AnonymousClass4m5(shimmerFrameLayout, anonymousClass0Cm2, anonymousClass0Cm, activity2, anonymousClass0ES, activity2.getString(C0164R.string.videocall_start_a_video_chat)), 1000);
    }

    /* renamed from: E */
    public static String m24608E(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Vw anonymousClass0Vw, boolean z) {
        if (z) {
            return AnonymousClass0VU.E(context, anonymousClass0Vw.J(), anonymousClass0Cm.B());
        }
        return AnonymousClass0Vx.D(context, anonymousClass0Vw, anonymousClass0Cm.B());
    }

    /* renamed from: F */
    public static boolean m24609F(Context context) {
        if (AnonymousClass0EF.I(context)) {
            return false;
        }
        if (((Boolean) AnonymousClass0CC.PH.G()).booleanValue() || ((Boolean) AnonymousClass0E6.C(AnonymousClass0CC.eI)).booleanValue() || ((Boolean) AnonymousClass0E6.C(AnonymousClass0CC.Lj)).booleanValue()) {
            return true;
        }
        return false;
    }
}
