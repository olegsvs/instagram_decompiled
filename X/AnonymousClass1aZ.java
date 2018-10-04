package X;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Message;

/* renamed from: X.1aZ */
public final class AnonymousClass1aZ implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Uj f20359B;

    public AnonymousClass1aZ(AnonymousClass0Uj anonymousClass0Uj) {
        this.f20359B = anonymousClass0Uj;
    }

    public final void run() {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.instagram.direct", "com.instagram.direct.store.DirectAppThreadStoreService"));
            int i = 1;
            boolean B = AnonymousClass17r.m9504B(this.f20359B.f5540C, intent, this.f20359B.f5544G, 1, 450442049);
            Message obtainMessage = this.f20359B.f5542E.obtainMessage(4);
            if (!B) {
                i = 0;
            }
            obtainMessage.arg1 = i;
            obtainMessage.sendToTarget();
        } catch (Throwable e) {
            AnonymousClass0Gn.m1880G("DirectAppThreadStoreServiceClient", e);
        }
    }
}
