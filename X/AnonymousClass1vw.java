package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.1vw */
public abstract class AnonymousClass1vw extends BroadcastReceiver {
    /* renamed from: A */
    public abstract AnonymousClass0dl mo3190A(Context context);

    public final void onReceive(Context context, Intent intent) {
        int D = AnonymousClass0cQ.D(this, -790395757);
        AnonymousClass0dl A = mo3190A(context);
        if ("com.facebook.GET_PHONE_ID".equals(intent.getAction())) {
            if (A != null) {
                if (AnonymousClass1vx.m13810B(context, getResultExtras(true))) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("timestamp", A.f7514D);
                    bundle.putString("origin", A.f7513C);
                    setResult(-1, A.f7512B, bundle);
                }
                AnonymousClass0cQ.E(this, context, intent, 1968525047, D);
                return;
            }
        }
        AnonymousClass0cQ.E(this, context, intent, 593798351, D);
    }
}
