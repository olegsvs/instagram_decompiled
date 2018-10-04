package X;

import android.os.Bundle;

/* renamed from: X.4BA */
public final class AnonymousClass4BA implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4BB f51187B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass4BL f51188C;

    public AnonymousClass4BA(AnonymousClass4BB anonymousClass4BB, AnonymousClass4BL anonymousClass4BL) {
        this.f51187B = anonymousClass4BB;
        this.f51188C = anonymousClass4BL;
    }

    public final void run() {
        AnonymousClass107.f13182C.B(this.f51188C.f51215B).yC();
        Bundle bundle = new Bundle();
        bundle.putString("ConfirmationFragment.ARGUMENT_KEY_EXTRA_MESSAGE", this.f51188C.f51216C);
        bundle.putString("ConfirmationFragment.ARGUMENT_KEY_EXTRA_TITLE", this.f51188C.f51217D);
        AnonymousClass0IL anonymousClass4B3 = new AnonymousClass4B3();
        anonymousClass4B3.setArguments(bundle);
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f51187B.f51189B.getActivity());
        anonymousClass0IZ.f2754D = anonymousClass4B3;
        anonymousClass0IZ.B();
    }
}
