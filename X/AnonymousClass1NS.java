package X;

import android.app.IntentService;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;

/* renamed from: X.1NS */
public abstract class AnonymousClass1NS extends IntentService {
    /* renamed from: B */
    public static WakeLock f17790B;

    /* renamed from: A */
    public abstract AnonymousClass55W mo2498A();

    public AnonymousClass1NS() {
        super("GCMBaseReceiverWorker");
    }

    /* renamed from: B */
    private static void m11049B() {
        if (f17790B.isHeld()) {
            AnonymousClass1DI.m10053E(f17790B, -325211544);
        }
    }

    public void onHandleIntent(Intent intent) {
        if (intent != null) {
            if (f17790B == null) {
                f17790B = AnonymousClass1DI.m10052D((PowerManager) getSystemService("power"), 1, "GCM_LIB", -748296504);
            }
            AnonymousClass1DI.m10050B(f17790B, 2119660607);
            try {
                AnonymousClass3Al.B(intent, getApplicationContext(), mo2498A());
            } finally {
                AnonymousClass1NS.m11049B();
            }
        }
    }
}
