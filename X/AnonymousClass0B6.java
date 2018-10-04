package X;

import android.content.Context;

/* renamed from: X.0B6 */
public final class AnonymousClass0B6 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1Bg f1335B;

    public AnonymousClass0B6(AnonymousClass1Bg anonymousClass1Bg) {
        this.f1335B = anonymousClass1Bg;
    }

    /* renamed from: A */
    public final void m764A(int i) {
        AnonymousClass1D8.m9968B(AnonymousClass1Bg.m9854C(this.f1335B).edit().putInt("cached_qe_flag", i));
        AnonymousClass1Bg anonymousClass1Bg = this.f1335B;
        Context context = anonymousClass1Bg.f15432B;
        if (AnonymousClass1Co.m9931D(context).equals(context.getPackageName())) {
            anonymousClass1Bg.f15435E.m9852C(i);
        }
        if (i != 2) {
            anonymousClass1Bg = this.f1335B;
            AnonymousClass1Bg.m9853B(anonymousClass1Bg, anonymousClass1Bg.f15433C, "NOT_IN_EXPERIMENT");
            return;
        }
        this.f1335B.f15436F.m9856A(new AnonymousClass0B7(this.f1335B));
    }
}
