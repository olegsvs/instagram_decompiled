package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.07D */
public final class AnonymousClass07D extends BroadcastReceiver {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1ia f501B;

    public AnonymousClass07D(AnonymousClass1ia anonymousClass1ia) {
        this.f501B = anonymousClass1ia;
    }

    public final void onReceive(Context context, Intent intent) {
        int D = AnonymousClass0cQ.m5854D(this, -1377825427);
        if (intent == null) {
            AnonymousClass0cQ.m5855E(this, context, intent, 1947763625, D);
            return;
        }
        intent.getAction();
        AnonymousClass1ia.m12678E(this.f501B, intent);
        AnonymousClass0cQ.m5855E(this, context, intent, 1008913196, D);
    }
}
