package X;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager.WakeLock;

/* renamed from: X.55V */
public final class AnonymousClass55V implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ Context f59998B;
    /* renamed from: C */
    public final /* synthetic */ Intent f59999C;
    /* renamed from: D */
    public final /* synthetic */ WakeLock f60000D;

    public AnonymousClass55V(Intent intent, Context context, WakeLock wakeLock) {
        this.f59999C = intent;
        this.f59998B = context;
        this.f60000D = wakeLock;
    }

    public final void run() {
        try {
            AnonymousClass3Al.B(this.f59999C, this.f59998B, new AnonymousClass55W());
        } finally {
            AnonymousClass1DI.E(this.f60000D, -1462709407);
        }
    }
}
