package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: X.5A5 */
public final class AnonymousClass5A5 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5AB f60717B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass5A9 f60718C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Cm f60719D;

    public AnonymousClass5A5(AnonymousClass5AB anonymousClass5AB, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass5A9 anonymousClass5A9) {
        this.f60717B = anonymousClass5AB;
        this.f60719D = anonymousClass0Cm;
        this.f60718C = anonymousClass5A9;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case 0:
                AnonymousClass5AB.m25883B(this.f60717B.f60738N.f14103H, this.f60717B.f60734J, this.f60717B.f60727C, this.f60717B.f60730F, this.f60717B.f60736L, this.f60717B.f60737M, this.f60717B.f60735K, this.f60719D, this.f60718C);
                break;
            case 1:
                AnonymousClass5AB.m25889H(this.f60717B.f60734J, this.f60717B.f60727C, this.f60717B.f60730F, this.f60717B.f60736L, this.f60717B.f60735K);
                break;
            default:
                break;
        }
        this.f60717B.f60735K = null;
    }
}
