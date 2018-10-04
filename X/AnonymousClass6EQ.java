package X;

import android.content.Context;
import com.facebook.C0164R;

/* renamed from: X.6EQ */
public final class AnonymousClass6EQ implements AnonymousClass5q1 {
    /* renamed from: B */
    private final Context f73186B;

    public final int cU(Context context, AnonymousClass0Cm anonymousClass0Cm) {
        return 0;
    }

    public final long lLA() {
        return 0;
    }

    public AnonymousClass6EQ(Context context) {
        this.f73186B = context;
    }

    public final int WO(AnonymousClass0Cm anonymousClass0Cm) {
        return C0164R.string.nametag_nux_tooltip;
    }

    public final AnonymousClass1ff fP() {
        return AnonymousClass1ff.NAMETAG;
    }

    public final int fU(Context context, boolean z) {
        return context.getResources().getDimensionPixelSize(C0164R.dimen.default_tool_tip_offset);
    }

    public final boolean lTA(boolean z, AnonymousClass0Cm anonymousClass0Cm) {
        return z && AnonymousClass0RC.H(this.f73186B) && !AnonymousClass0HV.D(anonymousClass0Cm).f2646B.getBoolean("seen_nametag_nux_tooltip", false);
    }

    public final void tDA(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0HV.D(anonymousClass0Cm).z(true);
    }
}
