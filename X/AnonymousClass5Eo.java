package X;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: X.5Eo */
public final class AnonymousClass5Eo extends Handler {
    /* renamed from: B */
    private final WeakReference f61502B;

    public AnonymousClass5Eo(AnonymousClass0IJ anonymousClass0IJ) {
        this.f61502B = new WeakReference(anonymousClass0IJ);
    }

    public final void handleMessage(Message message) {
        AnonymousClass0IJ anonymousClass0IJ = (AnonymousClass0IJ) this.f61502B.get();
        if (anonymousClass0IJ != null && (anonymousClass0IJ instanceof AnonymousClass5a0)) {
            if (message.what == 0) {
                AnonymousClass5a0.m27655D((AnonymousClass5a0) anonymousClass0IJ);
            }
        }
    }
}
