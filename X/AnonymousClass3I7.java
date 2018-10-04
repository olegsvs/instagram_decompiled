package X;

import android.content.Intent;

/* renamed from: X.3I7 */
public final class AnonymousClass3I7 implements AnonymousClass0F8 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3zn f39901B;

    public AnonymousClass3I7(AnonymousClass3zn anonymousClass3zn) {
        this.f39901B = anonymousClass3zn;
    }

    public final /* bridge */ /* synthetic */ void onEvent(AnonymousClass0F6 anonymousClass0F6) {
        int I = AnonymousClass0cQ.I(this, 101985007);
        AnonymousClass3I0 anonymousClass3I0 = (AnonymousClass3I0) anonymousClass0F6;
        int I2 = AnonymousClass0cQ.I(this, -733659255);
        this.f39901B.f48041C.m19015A(AnonymousClass3Cc.PROCESSING);
        if (this.f39901B.f48042D) {
            this.f39901B.f48042D = false;
            ((AnonymousClass0PP) this.f39901B.getActivity()).Dc();
        } else if (this.f39901B.f48049K) {
            AnonymousClass3HZ.m19251B(new AnonymousClass3zR());
        } else {
            AnonymousClass0dB.E(new Intent("VideoEditFragment.INTENT_ACTION_START_SHARE_SCREEN"));
        }
        AnonymousClass0cQ.H(this, 355937078, I2);
        AnonymousClass0cQ.H(this, -594876629, I);
    }
}
