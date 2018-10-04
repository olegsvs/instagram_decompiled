package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: X.1SQ */
public final class AnonymousClass1SQ extends Handler {
    /* renamed from: B */
    private final WeakReference f18767B;

    public AnonymousClass1SQ(AnonymousClass0Uj anonymousClass0Uj) {
        super(Looper.getMainLooper());
        this.f18767B = new WeakReference(anonymousClass0Uj);
    }

    public final void handleMessage(Message message) {
        AnonymousClass0Uj anonymousClass0Uj = (AnonymousClass0Uj) this.f18767B.get();
        if (anonymousClass0Uj != null) {
            Object obj = null;
            switch (message.what) {
                case 1:
                    AnonymousClass0Ul.m4764B(anonymousClass0Uj.f5546I.f1759C).m4767C(new AnonymousClass0VO(message.arg1, "DirectAppThreadStoreServiceClient"));
                    return;
                case 2:
                    if (message.arg1 == 1) {
                        obj = 1;
                    }
                    if (obj != null) {
                        AnonymousClass0Uj.m4758C(anonymousClass0Uj, 4, true);
                    } else {
                        AnonymousClass0Uj.m4758C(anonymousClass0Uj, anonymousClass0Uj.f5541D, false);
                    }
                    return;
                case 3:
                    anonymousClass0Uj.onAppBackgrounded();
                    return;
                case 4:
                    if (message.arg1 == 1) {
                        obj = 1;
                    }
                    int i = anonymousClass0Uj.f5541D;
                    if (i == 1 || i == 2) {
                        if (obj != null) {
                            AnonymousClass0Uj.m4758C(anonymousClass0Uj, 3, anonymousClass0Uj.f5545H);
                        } else {
                            AnonymousClass0Uj.m4758C(anonymousClass0Uj, 1, false);
                        }
                    }
                    return;
                default:
                    super.handleMessage(message);
                    return;
            }
        }
    }
}
