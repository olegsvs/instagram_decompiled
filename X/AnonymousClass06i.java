package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.rti.common.time.RealtimeSinceBootClock;

/* renamed from: X.06i */
public final class AnonymousClass06i extends BroadcastReceiver {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass06j f397B;
    /* renamed from: C */
    public final /* synthetic */ RealtimeSinceBootClock f398C;

    public AnonymousClass06i(AnonymousClass06j anonymousClass06j, RealtimeSinceBootClock realtimeSinceBootClock) {
        this.f397B = anonymousClass06j;
        this.f398C = realtimeSinceBootClock;
    }

    public final void onReceive(Context context, Intent intent) {
        int D = AnonymousClass0cQ.m5854D(this, -1809977588);
        if (intent == null) {
            AnonymousClass0cQ.m5855E(this, context, intent, -1816910882, D);
            return;
        }
        Boolean valueOf = Boolean.valueOf("android.intent.action.SCREEN_ON".equals(intent.getAction()));
        if (!valueOf.equals((Boolean) this.f397B.f401C.getAndSet(valueOf))) {
            this.f397B.f402D.set(this.f398C.now());
            this.f397B.f404F.notify(valueOf.booleanValue());
        }
        AnonymousClass0cQ.m5855E(this, context, intent, 1277524002, D);
    }
}
