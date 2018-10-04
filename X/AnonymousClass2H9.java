package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: X.2H9 */
public final class AnonymousClass2H9 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0iO f28438B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0EE f28439C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0mR f28440D;

    public AnonymousClass2H9(AnonymousClass0iO anonymousClass0iO, AnonymousClass0EE anonymousClass0EE, AnonymousClass0mR anonymousClass0mR) {
        this.f28438B = anonymousClass0iO;
        this.f28439C = anonymousClass0EE;
        this.f28440D = anonymousClass0mR;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass0NN.B("fbc_upsell_dialog_connect_facebook_tapped", this.f28439C).R();
        this.f28438B.A(this.f28440D);
    }
}
