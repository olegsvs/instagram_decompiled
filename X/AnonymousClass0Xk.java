package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.0Xk */
public final class AnonymousClass0Xk extends BroadcastReceiver {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0U4 f6192B;

    public AnonymousClass0Xk(AnonymousClass0U4 anonymousClass0U4) {
        this.f6192B = anonymousClass0U4;
    }

    public final void onReceive(Context context, Intent intent) {
        int D = AnonymousClass0cQ.m5854D(this, 1558867873);
        if (!AnonymousClass0MM.m3154J(context)) {
            if (!this.f6192B.f5350Q) {
                this.f6192B.m4685A();
                AnonymousClass0cQ.m5855E(this, context, intent, -1581222114, D);
            }
        }
        this.f6192B.f5338E.m5265B();
        AnonymousClass0U4.m4683I(this.f6192B, 0);
        AnonymousClass0cQ.m5855E(this, context, intent, -1581222114, D);
    }
}
