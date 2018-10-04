package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: X.50Q */
public final class AnonymousClass50Q implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Z8 f59245B;

    public AnonymousClass50Q(AnonymousClass5Z8 anonymousClass5Z8) {
        this.f59245B = anonymousClass5Z8;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass0IL D = AnonymousClass0GO.C().A().D(this.f59245B.getArguments().getString("ARGUMENT_OMNISTRING"), this.f59245B.getArguments().getString("ARGUMENT_TWOFAC_IDENTIFIER"), AnonymousClass1P7.ARGUMENT_TWO_FAC_LOGIN_SUPPORT_FLOW);
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f59245B.getActivity());
        anonymousClass0IZ.f2754D = D;
        anonymousClass0IZ.B();
    }
}
