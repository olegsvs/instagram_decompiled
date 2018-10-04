package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.2TY */
public final class AnonymousClass2TY extends AnonymousClass21X {
    /* renamed from: B */
    private final AnonymousClass21j f30800B;

    public AnonymousClass2TY(Context context) {
        this(context, (AnonymousClass21j) AnonymousClass21h.f25329B.get());
    }

    private AnonymousClass2TY(Context context, AnonymousClass21j anonymousClass21j) {
        super(new AnonymousClass21Z("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        Handler handler = new Handler(Looper.getMainLooper());
        this.f30800B = anonymousClass21j;
    }

    /* renamed from: A */
    public final void mo3145A(Intent intent) {
        AnonymousClass21g B = AnonymousClass21g.m14203B(intent.getBundleExtra("session_state"));
        this.f25310B.m14200C("ListenerRegistryBroadcastReceiver.onReceive: %s", B);
        if (B.f25323D == 3) {
            AnonymousClass21j anonymousClass21j = this.f30800B;
            if (anonymousClass21j != null) {
                anonymousClass21j.m14205a(B.f25321B, new AnonymousClass21i(this, B));
                return;
            }
        }
        m14195B(B);
    }
}
