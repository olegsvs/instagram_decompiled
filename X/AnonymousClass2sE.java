package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.2sE */
public final class AnonymousClass2sE extends Handler {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3uO f35184B;

    public AnonymousClass2sE(AnonymousClass3uO anonymousClass3uO, Looper looper) {
        this.f35184B = anonymousClass3uO;
        super(looper);
    }

    public final void handleMessage(Message message) {
        Object WH;
        try {
            switch (message.what) {
                case 0:
                    WH = this.f35184B.f46413B.WH(this.f35184B.f46420I, (AnonymousClass2s5) message.obj);
                    break;
                case 1:
                    WH = this.f35184B.f46413B.VH(this.f35184B.f46420I, (AnonymousClass2s3) message.obj);
                    break;
                default:
                    throw new RuntimeException();
            }
        } catch (Exception e) {
            WH = e;
        }
        this.f35184B.f46418G.obtainMessage(message.what, WH).sendToTarget();
    }
}
