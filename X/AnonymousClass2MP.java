package X;

import android.support.v7.widget.RecyclerView;

/* renamed from: X.2MP */
public final class AnonymousClass2MP {
    /* renamed from: B */
    public static boolean m15210B(AnonymousClass0rr anonymousClass0rr) {
        if (anonymousClass0rr.T() == 0) {
            return true;
        }
        if (anonymousClass0rr.bA() == anonymousClass0rr.a() - 1) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public static boolean m15211C(AnonymousClass0rr anonymousClass0rr) {
        if (anonymousClass0rr.T() == 0) {
            return true;
        }
        if (anonymousClass0rr.ZA() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public static void m15212D(RecyclerView recyclerView) {
        if (recyclerView.getChildCount() != 0) {
            if (recyclerView.getHeight() != 0) {
                recyclerView.LA(0);
                recyclerView.postDelayed(new AnonymousClass2MO(recyclerView), 100);
            }
        }
    }
}
