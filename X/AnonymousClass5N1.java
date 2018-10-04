package X;

import android.widget.PopupWindow.OnDismissListener;

/* renamed from: X.5N1 */
public final class AnonymousClass5N1 implements OnDismissListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5N2 f62689B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass69Q f62690C;

    public AnonymousClass5N1(AnonymousClass5N2 anonymousClass5N2, AnonymousClass69Q anonymousClass69Q) {
        this.f62689B = anonymousClass5N2;
        this.f62690C = anonymousClass69Q;
    }

    public final void onDismiss() {
        if (this.f62689B.f62691B.f66720B) {
            AnonymousClass69Q anonymousClass69Q = this.f62690C;
            AnonymousClass0Qg anonymousClass0Qg = anonymousClass69Q.f72313B;
            AnonymousClass5cE anonymousClass5cE = anonymousClass69Q.f72314C;
            String str = anonymousClass0Qg.f4410E.f4148B;
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Qg.f4431Z);
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
            AnonymousClass0GA H = anonymousClass0Pt.L("live/%s/request_to_join/", new Object[]{str}).M(AnonymousClass0Pv.class).N().H();
            anonymousClass0Qg.f4418M = true;
            H.f2849B = new AnonymousClass69R(anonymousClass0Qg, anonymousClass5cE);
            anonymousClass0Qg.f4413H.schedule(H);
            AnonymousClass5MM.m26323B(anonymousClass69Q.f72315D, AnonymousClass5ML.REQUEST_SENT).R();
            AnonymousClass6GI anonymousClass6GI = anonymousClass69Q.f72313B.f4425T;
            AnonymousClass5cE anonymousClass5cE2 = anonymousClass69Q.f72314C;
            if (anonymousClass6GI.f73686S) {
                AnonymousClass67B anonymousClass67B = anonymousClass6GI.f73676I;
                anonymousClass5cE2.f67348B = true;
                anonymousClass67B.f71917F.m26309X();
            }
            return;
        }
        AnonymousClass5MM.m26323B(this.f62690C.f72315D, AnonymousClass5ML.REQUEST_CANCELLED).R();
    }
}
