package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

/* renamed from: X.4yn */
public final class AnonymousClass4yn implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4yo f59043B;

    public AnonymousClass4yn(AnonymousClass4yo anonymousClass4yo) {
        this.f59043B = anonymousClass4yo;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (i == 0) {
            AnonymousClass0IL anonymousClass4yq = new AnonymousClass4yq();
            Bundle bundle = new Bundle();
            bundle.putBoolean("show_linked_business_report_options", this.f59043B.f59045C.f41419E.f41406B != null);
            anonymousClass4yq.setArguments(bundle);
            anonymousClass4yq.f59054B = new AnonymousClass5Yz(this);
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f59043B.getActivity());
            anonymousClass0IZ.f2754D = anonymousClass4yq;
            anonymousClass0IZ.B();
        }
    }
}
