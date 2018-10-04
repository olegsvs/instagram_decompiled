package X;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: X.3Mb */
public final class AnonymousClass3Mb extends Handler {
    /* renamed from: B */
    private WeakReference f40469B;

    public AnonymousClass3Mb(Handler handler, WeakReference weakReference) {
        super(handler.getLooper());
        this.f40469B = weakReference;
    }

    public AnonymousClass3Mb(WeakReference weakReference) {
        this.f40469B = weakReference;
    }

    public final void handleMessage(Message message) {
        AnonymousClass3Mc anonymousClass3Mc = (AnonymousClass3Mc) this.f40469B.get();
        if (anonymousClass3Mc != null) {
            switch (message.what) {
                case 1:
                    if (anonymousClass3Mc.f40485L.B(anonymousClass3Mc.f40476C)) {
                        anonymousClass3Mc.f40486M.N(AnonymousClass3Mc.f40472U);
                        return;
                    }
                    return;
                case 2:
                    if (anonymousClass3Mc.f40485L.A(anonymousClass3Mc.f40477D)) {
                        anonymousClass3Mc.f40482I = true;
                        anonymousClass3Mc.f40479F.L(AnonymousClass3Mc.f40473V).N(AnonymousClass3Mc.f40472U);
                        return;
                    }
                    return;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown message ");
                    stringBuilder.append(message);
                    throw new RuntimeException(stringBuilder.toString());
            }
        }
    }
}
