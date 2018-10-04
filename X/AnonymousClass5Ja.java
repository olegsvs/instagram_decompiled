package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.5Ja */
public final class AnonymousClass5Ja extends Handler {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Jc f62164B;

    public AnonymousClass5Ja(AnonymousClass5Jc anonymousClass5Jc, Looper looper) {
        this.f62164B = anonymousClass5Jc;
        super(looper);
    }

    public final void handleMessage(Message message) {
        if (this.f62164B.f62168E == 0) {
            this.f62164B.f62165B.onFinish();
        } else {
            this.f62164B.f62165B.UDA(this.f62164B.f62168E);
        }
        AnonymousClass5Jc anonymousClass5Jc = this.f62164B;
        int i = anonymousClass5Jc.f62168E - 1;
        anonymousClass5Jc.f62168E = i;
        if (i >= 0) {
            this.f62164B.f62166C.sendMessageDelayed(Message.obtain(), (long) this.f62164B.f62167D);
        }
    }
}
