package X;

import com.instagram.realtimeclient.RealtimeEventHandler;
import com.instagram.realtimeclient.RealtimeEventHandlerProvider;
import com.instagram.realtimeclient.ZeroProvisionRealtimeService;

/* renamed from: X.0E1 */
public final class AnonymousClass0E1 implements RealtimeEventHandlerProvider {
    public final RealtimeEventHandler get(AnonymousClass0Cm anonymousClass0Cm) {
        return ZeroProvisionRealtimeService.getInstance(anonymousClass0Cm);
    }
}
