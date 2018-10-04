package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.154 */
public final class AnonymousClass154 extends Handler {
    public AnonymousClass154() {
        super(Looper.getMainLooper());
    }

    public final void handleMessage(Message message) {
        AnonymousClass155 anonymousClass155 = (AnonymousClass155) message.obj;
        switch (message.what) {
            case 1:
                message = anonymousClass155.f14205C;
                Object obj = anonymousClass155.f14204B[0];
                if (message.f13408B.get()) {
                    message.mo2096C(obj);
                } else {
                    message.mo2097D(obj);
                }
                message.f13410D = AnonymousClass13m.FINISHED;
                return;
            case 2:
                return;
            default:
                return;
        }
    }
}
