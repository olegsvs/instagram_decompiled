package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* renamed from: X.1ji */
public final class AnonymousClass1ji extends Handler {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1jV f22004B;

    public AnonymousClass1ji(AnonymousClass1jV anonymousClass1jV, Looper looper) {
        this.f22004B = anonymousClass1jV;
        super(looper);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                AnonymousClass1jV.m12762B(this.f22004B, (ArrayList) message.obj);
                return;
            case 2:
                message = this.f22004B.f21967F;
                AnonymousClass0Ug.m4753E(message, false);
                message.f5518F = -1;
                return;
            case 3:
                AnonymousClass0Tt.m4579C(this.f22004B.f21968G).m4593C();
                return;
            default:
                return;
        }
    }
}
