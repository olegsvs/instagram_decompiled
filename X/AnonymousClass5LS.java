package X;

import android.content.Context;

/* renamed from: X.5LS */
public final class AnonymousClass5LS implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0nK f62413B;

    public AnonymousClass5LS(AnonymousClass0nK anonymousClass0nK) {
        this.f62413B = anonymousClass0nK;
    }

    public final void run() {
        AnonymousClass1BN.C(this.f62413B.f10047C).A();
        AnonymousClass0JH anonymousClass0JH = AnonymousClass0JH.f2904C;
        if (anonymousClass0JH != null) {
            anonymousClass0JH.A(this.f62413B.f10047C).A();
        }
        if (AnonymousClass1BO.C(this.f62413B.f10046B, this.f62413B.f10047C) && ((Boolean) AnonymousClass0CC.FD.H(this.f62413B.f10047C)).booleanValue()) {
            Context context = this.f62413B.f10046B;
            if (AnonymousClass1BP.f15401C == null) {
                AnonymousClass1BP.f15401C = new AnonymousClass1BP(context);
            }
            AnonymousClass1BP anonymousClass1BP = AnonymousClass1BP.f15401C;
            Context context2 = this.f62413B.f10046B;
            AnonymousClass0Cm anonymousClass0Cm = this.f62413B.f10047C;
            AnonymousClass1BQ anonymousClass1BQ = anonymousClass1BP.f15402B;
            if (anonymousClass1BQ != null) {
                anonymousClass1BQ.initScheduler(context2, anonymousClass0Cm);
            }
        }
    }
}
