package X;

import android.content.Context;
import com.facebook.C0164R;
import java.util.List;

/* renamed from: X.0X2 */
public final class AnonymousClass0X2 {
    /* renamed from: B */
    public List f6093B;

    /* renamed from: A */
    public final float m5211A() {
        AnonymousClass0Ls anonymousClass0Ls = (AnonymousClass0Ls) this.f6093B.get(0);
        if (anonymousClass0Ls != null) {
            if (anonymousClass0Ls.f3292C != 0) {
                return ((float) anonymousClass0Ls.f3296G) / ((float) anonymousClass0Ls.f3292C);
            }
        }
        return 1.0f;
    }

    /* renamed from: B */
    public static AnonymousClass0Ls m5210B(AnonymousClass0X2 anonymousClass0X2, AnonymousClass17A anonymousClass17A) {
        Context context = AnonymousClass0EV.f1977B;
        return AnonymousClass0Vy.m4982B(anonymousClass0X2.f6093B, Math.min((AnonymousClass0Nm.m3431J(context) - (context.getResources().getDimensionPixelSize(C0164R.dimen.photo_grid_spacing) * 2)) / 3, 240), anonymousClass17A);
    }

    /* renamed from: B */
    public final AnonymousClass0Ls m5212B(Context context, AnonymousClass17A anonymousClass17A) {
        return m5214D(anonymousClass17A, Math.min(AnonymousClass0Nm.m3431J(context), 1080), "full_size_");
    }

    /* renamed from: C */
    public final String m5213C(Context context) {
        return m5212B(context, AnonymousClass17A.ANY).f3295F;
    }

    /* renamed from: D */
    public final AnonymousClass0Ls m5214D(AnonymousClass17A anonymousClass17A, int i, String str) {
        i = AnonymousClass0Vy.m4982B(this.f6093B, i, anonymousClass17A);
        if (i.f3295F.contains("ig_cache_key=")) {
            i.f3295F = AnonymousClass0Gz.m1939B(i.f3295F, str);
        }
        return i;
    }

    /* renamed from: E */
    public final String m5215E() {
        return AnonymousClass0X2.m5210B(this, AnonymousClass17A.RECTANGULAR).f3295F;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                return this.f6093B.equals(((AnonymousClass0X2) obj).f6093B);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6093B.hashCode();
    }
}
