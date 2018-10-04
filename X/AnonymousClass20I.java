package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: X.20I */
public final class AnonymousClass20I extends Handler {
    /* renamed from: B */
    private /* synthetic */ AnonymousClass2dm f25172B;

    public AnonymousClass20I(AnonymousClass2dm anonymousClass2dm, Looper looper) {
        this.f25172B = anonymousClass2dm;
        super(looper);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                AnonymousClass20H anonymousClass20H = (AnonymousClass20H) message.obj;
                AnonymousClass2dm anonymousClass2dm = this.f25172B;
                anonymousClass2dm.f31899H.lock();
                try {
                    if (anonymousClass2dm.f31904M == anonymousClass20H.f25171B) {
                        anonymousClass20H.mo3106A();
                    }
                    anonymousClass2dm.f31899H.unlock();
                    return;
                } catch (Throwable th) {
                    anonymousClass2dm.f31899H.unlock();
                }
            case 2:
                throw ((RuntimeException) message.obj);
            default:
                int i = message.what;
                StringBuilder stringBuilder = new StringBuilder(31);
                stringBuilder.append("Unknown message id: ");
                stringBuilder.append(i);
                Log.w("GACStateManager", stringBuilder.toString());
                return;
        }
    }
}
