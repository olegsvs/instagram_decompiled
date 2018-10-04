package X;

import android.content.Context;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: X.4M6 */
public final class AnonymousClass4M6 {
    /* renamed from: B */
    public final AnonymousClass38H f53155B;
    /* renamed from: C */
    public final Context f53156C;
    /* renamed from: D */
    public ShimmerFrameLayout f53157D;
    /* renamed from: E */
    public final AnonymousClass0IP f53158E = AnonymousClass0Ix.B();
    /* renamed from: F */
    public final AnonymousClass0Cm f53159F;

    public AnonymousClass4M6(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass38H anonymousClass38H) {
        this.f53156C = context;
        this.f53159F = anonymousClass0Cm;
        this.f53155B = anonymousClass38H;
    }

    /* renamed from: A */
    public final void m23979A() {
        ShimmerFrameLayout shimmerFrameLayout = this.f53157D;
        if (shimmerFrameLayout != null) {
            if (shimmerFrameLayout.f24583B) {
                this.f53157D.m13912B();
                AnonymousClass36h J = this.f53155B.m18692J(AnonymousClass36l.FOCUS);
                if (J == null) {
                    this.f53158E.schedule(new AnonymousClass4M5(this, J));
                }
            }
        }
    }

    /* renamed from: B */
    public static boolean m23978B(AnonymousClass4M6 anonymousClass4M6) {
        AnonymousClass36h J = anonymousClass4M6.f53155B.m18692J(AnonymousClass36l.FOCUS);
        if (J == null) {
            return false;
        }
        if (J.f37876F == 2) {
            return false;
        }
        if (AnonymousClass38R.m18725F(anonymousClass4M6.f53159F) > 3) {
            return false;
        }
        Integer num = (Integer) AnonymousClass38R.m18729J(anonymousClass4M6.f53156C, anonymousClass4M6.f53159F).get(J.f37882L);
        if (num == null || AnonymousClass38R.m18721B(num.intValue(), 2) < 0) {
            return true;
        }
        return false;
    }
}
