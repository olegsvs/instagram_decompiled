package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.1IH */
public final class AnonymousClass1IH extends BroadcastReceiver {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0gV f16857B;

    public AnonymousClass1IH(AnonymousClass0gV anonymousClass0gV) {
        this.f16857B = anonymousClass0gV;
    }

    public final void onReceive(Context context, Intent intent) {
        int D = AnonymousClass0cQ.m5854D(this, 1221193699);
        AnonymousClass0gW anonymousClass0gW = this.f16857B;
        synchronized (anonymousClass0gW) {
            try {
                anonymousClass0gW.m6650H();
            } catch (Exception e) {
                anonymousClass0gW.mo1571C(e, "Connectivity event handler");
            }
        }
        AnonymousClass0cQ.m5855E(this, context, intent, 1265005603, D);
        return;
    }
}
