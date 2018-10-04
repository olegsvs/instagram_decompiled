package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.3CT */
public final class AnonymousClass3CT extends Handler {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3Cd f39046B;

    public AnonymousClass3CT(AnonymousClass3Cd anonymousClass3Cd, Looper looper) {
        this.f39046B = anonymousClass3Cd;
        super(looper);
    }

    public final void handleMessage(Message message) {
        this.f39046B.m19017C(AnonymousClass3Cc.m19009B(message.what), null);
    }
}
