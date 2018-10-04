package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: X.56H */
public final class AnonymousClass56H implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass56J f60107B;

    public AnonymousClass56H(AnonymousClass56J anonymousClass56J) {
        this.f60107B = anonymousClass56J;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        i = this.f60107B;
        AnonymousClass0IL E = AnonymousClass0GO.C().A().E(i.f60111E.getToken(), i.f60108B, false);
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(i.f60109C.getActivity());
        anonymousClass0IZ.f2754D = E;
        anonymousClass0IZ.B();
    }
}
