package X;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager.WakeLock;

/* renamed from: X.55T */
public final class AnonymousClass55T implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ Context f59995B;
    /* renamed from: C */
    public final /* synthetic */ Intent f59996C;
    /* renamed from: D */
    public final /* synthetic */ WakeLock f59997D;

    public AnonymousClass55T(Context context, Intent intent, WakeLock wakeLock) {
        this.f59995B = context;
        this.f59996C = intent;
        this.f59997D = wakeLock;
    }

    public final void run() {
        try {
            new AnonymousClass55U(this.f59995B).F(this.f59996C);
        } finally {
            AnonymousClass1DI.E(this.f59997D, 830183092);
        }
    }
}
