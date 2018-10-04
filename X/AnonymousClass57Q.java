package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.57Q */
public final class AnonymousClass57Q extends Handler {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass57c f60327B;

    public AnonymousClass57Q(AnonymousClass57c anonymousClass57c, Looper looper) {
        this.f60327B = anonymousClass57c;
        super(looper);
    }

    public final void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.what == 1) {
            AnonymousClass57c.m25792C(this.f60327B);
        }
    }
}
