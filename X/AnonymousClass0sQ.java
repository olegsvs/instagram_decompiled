package X;

import android.os.Handler.Callback;
import android.os.Message;

/* renamed from: X.0sQ */
public final class AnonymousClass0sQ implements Callback {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Gw f11428B;

    public AnonymousClass0sQ(AnonymousClass0Gw anonymousClass0Gw) {
        this.f11428B = anonymousClass0Gw;
    }

    public final boolean handleMessage(Message message) {
        AnonymousClass197 anonymousClass197 = (AnonymousClass197) message.obj;
        if (anonymousClass197.f15078F != null) {
            anonymousClass197.f15074B.Mo(anonymousClass197.f15078F, anonymousClass197.f15077E, anonymousClass197.f15076D);
        }
        AnonymousClass0sS anonymousClass0sS = this.f11428B.f2488C;
        anonymousClass197.f15074B = null;
        anonymousClass197.f15075C = null;
        anonymousClass197.f15076D = null;
        anonymousClass197.f15077E = 0;
        anonymousClass197.f15078F = null;
        anonymousClass0sS.f11432C.release(anonymousClass197);
        return true;
    }
}
