package X;

import android.os.Bundle;
import com.facebook.C0164R;

/* renamed from: X.4Az */
public final class AnonymousClass4Az implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4B0 f51171B;

    public AnonymousClass4Az(AnonymousClass4B0 anonymousClass4B0) {
        this.f51171B = anonymousClass4B0;
    }

    public final void run() {
        Bundle bundle = new Bundle();
        bundle.putString("ConfirmationFragment.ARGUMENT_KEY_EXTRA_TITLE", this.f51171B.f51172B.getResources().getString(C0164R.string.appeal_submitted_title));
        bundle.putString("ConfirmationFragment.ARGUMENT_KEY_EXTRA_MESSAGE", this.f51171B.f51172B.getResources().getString(C0164R.string.appeal_submitted_message));
        AnonymousClass0IL anonymousClass4B3 = new AnonymousClass4B3();
        anonymousClass4B3.setArguments(bundle);
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f51171B.f51172B.getActivity());
        anonymousClass0IZ.f2754D = anonymousClass4B3;
        anonymousClass0IZ.B();
    }
}
