package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.facebook.C0164R;

/* renamed from: X.59w */
public final class AnonymousClass59w implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5AB f60699B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass5wg f60700C;

    public AnonymousClass59w(AnonymousClass5AB anonymousClass5AB, AnonymousClass5wg anonymousClass5wg) {
        this.f60699B = anonymousClass5AB;
        this.f60700C = anonymousClass5wg;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Object obj = AnonymousClass5AB.m25887F(this.f60699B)[i];
        if (this.f60699B.f60726B != null && this.f60699B.f60726B.equals(obj)) {
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f60699B.f60729E.getActivity());
            anonymousClass0IZ.f2754D = AnonymousClass0IY.B().B(this.f60699B.f60734J.f4134F);
            anonymousClass0IZ.B();
        } else if (this.f60699B.f60731G != null && this.f60699B.f60731G.equals(obj)) {
            AnonymousClass0bN.d("hide_button", this.f60699B.f60732H, this.f60699B.f60734J.G(), this.f60699B.f60733I, null);
            if (this.f60699B.f60738N.C().f4134F.CA() == null) {
                this.f60700C.m28654A(null);
            } else {
                AnonymousClass5If anonymousClass5If = new AnonymousClass5If(this.f60699B.f60729E.getActivity(), this.f60699B.f60738N.C().f4134F, this.f60700C);
                new AnonymousClass0Sb(anonymousClass5If.f61883B).Q(C0164R.string.report_option_dialog_title_for_hide_ad).S(C0164R.style.DialogTitleText).G(AnonymousClass5If.m26183B(anonymousClass5If), anonymousClass5If.f61885D).E(true).F(true).N(new AnonymousClass5Id(anonymousClass5If)).C().show();
            }
        } else if (this.f60699B.f60739O != null && this.f60699B.f60739O.equals(obj)) {
            AnonymousClass0bN.d("report_button", this.f60699B.f60732H, this.f60699B.f60734J.G(), this.f60699B.f60733I, null);
            AnonymousClass0P7 anonymousClass0P7 = this.f60699B.f60738N.C().f4134F;
            this.f60700C.m28654A(null);
            AnonymousClass0IJ anonymousClass0IJ = (AnonymousClass0IJ) AnonymousClass0IY.B().E(anonymousClass0P7.NO(), -1, anonymousClass0P7.zR(), "report_button", anonymousClass0P7.G());
            anonymousClass0IJ.registerLifecycleListener(new AnonymousClass59t(this));
            AnonymousClass0IZ anonymousClass0IZ2 = new AnonymousClass0IZ(this.f60699B.f60729E.getActivity());
            anonymousClass0IZ2.f2754D = anonymousClass0IJ;
            anonymousClass0IZ2.B();
        }
        this.f60699B.f60735K = null;
    }
}
