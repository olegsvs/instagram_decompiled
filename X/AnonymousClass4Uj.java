package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.common.dextricks.StartupQEsConfig;

/* renamed from: X.4Uj */
public final class AnonymousClass4Uj extends Handler {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5UU f54650B;

    public AnonymousClass4Uj(AnonymousClass5UU anonymousClass5UU, Looper looper) {
        this.f54650B = anonymousClass5UU;
        super(looper);
    }

    public final void handleMessage(Message message) {
        int intValue = ((Integer) message.obj).intValue();
        float f = (float) intValue;
        AnonymousClass5UU.E(this.f54650B, f);
        long currentTimeMillis = System.currentTimeMillis();
        int height = (((int) (currentTimeMillis - this.f54650B.f64894E)) * this.f54650B.getListView().getHeight()) / StartupQEsConfig.DEFAULT_IDLE_MAX_INTERVAL_MS;
        if (message.what == 1) {
            this.f54650B.getListView().smoothScrollBy(-height, 0);
        } else if (message.what == 2) {
            this.f54650B.getListView().smoothScrollBy(height, 0);
        }
        this.f54650B.f64894E = currentTimeMillis;
        AnonymousClass5UU anonymousClass5UU = this.f54650B;
        if (!AnonymousClass5UU.C(anonymousClass5UU, anonymousClass5UU.f64893D, f)) {
            anonymousClass5UU = this.f54650B;
            if (!AnonymousClass5UU.D(anonymousClass5UU, anonymousClass5UU.f64893D, f)) {
                return;
            }
        }
        this.f54650B.f64892C.sendMessageDelayed(this.f54650B.f64892C.obtainMessage(message.what, Integer.valueOf(intValue)), 10);
    }
}
