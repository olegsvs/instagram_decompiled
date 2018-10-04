package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.3iH */
public final class AnonymousClass3iH extends Handler {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass453 f43545B;

    public AnonymousClass3iH(AnonymousClass453 anonymousClass453, Looper looper) {
        this.f43545B = anonymousClass453;
        super(looper);
    }

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            AnonymousClass453.m22744C(this.f43545B, (String) message.obj);
        }
    }
}
