package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.C0164R;

/* renamed from: X.5q7 */
public final class AnonymousClass5q7 implements AnonymousClass3Af {
    /* renamed from: B */
    public final AnonymousClass0TH f69275B;
    /* renamed from: C */
    public final int f69276C;

    public AnonymousClass5q7(int i, AnonymousClass0TH anonymousClass0TH) {
        this.f69276C = i;
        this.f69275B = anonymousClass0TH;
    }

    public final Class Ac() {
        return AnonymousClass5q6.class;
    }

    public final /* bridge */ /* synthetic */ int OU(AnonymousClass3Ag anonymousClass3Ag) {
        AnonymousClass5q6 anonymousClass5q6 = (AnonymousClass5q6) anonymousClass3Ag;
        return this.f69276C;
    }

    public final /* bridge */ /* synthetic */ void oC(AnonymousClass3Ag anonymousClass3Ag, AnonymousClass0oo anonymousClass0oo) {
        AnonymousClass0rW.B((AnonymousClass0rV) anonymousClass0oo, this.f69275B, ((AnonymousClass5q6) anonymousClass3Ag).f69273B);
    }

    public final AnonymousClass0oo zF(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        return new AnonymousClass0rV(layoutInflater.inflate(C0164R.layout.condensed_generic_v3_megaphone, viewGroup, false));
    }
}
