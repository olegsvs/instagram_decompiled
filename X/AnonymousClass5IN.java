package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: X.5IN */
public final class AnonymousClass5IN implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5IP f61851B;

    public AnonymousClass5IN(AnonymousClass5IP anonymousClass5IP) {
        this.f61851B = anonymousClass5IP;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f61851B.f61853B.f61859C.A();
        dialogInterface.dismiss();
        this.f61851B.f61853B.getActivity().onBackPressed();
    }
}
