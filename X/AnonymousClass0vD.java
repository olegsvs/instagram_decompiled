package X;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;

/* renamed from: X.0vD */
public final class AnonymousClass0vD {
    /* renamed from: B */
    public OnClickListener f11977B;
    /* renamed from: C */
    public AnonymousClass0ct f11978C;

    public AnonymousClass0vD(ViewStub viewStub) {
        this.f11978C = new AnonymousClass0ct(viewStub);
    }

    /* renamed from: A */
    public final View m8302A() {
        return this.f11978C.m5928A();
    }

    /* renamed from: B */
    public final void m8303B(AnonymousClass0pk anonymousClass0pk) {
        switch (anonymousClass0pk.ordinal()) {
            case 0:
                this.f11978C.m5931D(0);
                AnonymousClass0NN.m3291B("zero_rating_video_play_button_impression", null).m3298F("tag", null).m3310R();
                m8302A().setOnClickListener(this.f11977B);
                return;
            case 1:
                this.f11978C.m5931D(8);
                return;
            default:
                return;
        }
    }
}
