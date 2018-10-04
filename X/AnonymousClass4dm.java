package X;

import com.instagram.realtimeclient.RealtimeClientManager.MessageDeliveryCallback;

/* renamed from: X.4dm */
public final class AnonymousClass4dm extends MessageDeliveryCallback {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4dn f55877B;

    public final void onTimeout() {
    }

    public AnonymousClass4dm(AnonymousClass4dn anonymousClass4dn) {
        this.f55877B = anonymousClass4dn;
    }

    public final void onFailure(Integer num, String str) {
    }

    public final void onSuccess(String str, String str2, long j, Long l) {
        if (l != null) {
            this.f55877B.f55882F = l.longValue();
        }
    }
}
