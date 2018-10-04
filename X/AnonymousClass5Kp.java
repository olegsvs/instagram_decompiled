package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: X.5Kp */
public final class AnonymousClass5Kp implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Ks f62337B;

    public AnonymousClass5Kp(AnonymousClass5Ks anonymousClass5Ks) {
        this.f62337B = anonymousClass5Ks;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass0Fr.RequestFailedDialogSkipTapped.C(this.f62337B.f62340B.f2807N).R();
        dialogInterface.dismiss();
        AnonymousClass0Id.G(this.f62337B.f62340B, this.f62337B.f62340B.f2808O, AnonymousClass0Id.I(this.f62337B.f62340B));
    }
}
