package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.076 */
public final class AnonymousClass076 extends BroadcastReceiver {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass077 f479B;

    public AnonymousClass076(AnonymousClass077 anonymousClass077) {
        this.f479B = anonymousClass077;
    }

    public final void onReceive(Context context, Intent intent) {
        int D = AnonymousClass0cQ.m5854D(this, 1202724665);
        if (AnonymousClass05x.m351B(intent.getAction(), this.f479B.f481B)) {
            intent.getAction();
            this.f479B.f490K.run();
            AnonymousClass0cQ.m5855E(this, context, intent, 1290445616, D);
            return;
        }
        AnonymousClass0cQ.m5855E(this, context, intent, 1895660206, D);
    }
}
