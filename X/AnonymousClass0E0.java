package X;

import com.instagram.realtimeclient.MainFeedRealtimeService;
import com.instagram.realtimeclient.RealtimeEventHandler;
import com.instagram.realtimeclient.RealtimeEventHandlerProvider;

/* renamed from: X.0E0 */
public final class AnonymousClass0E0 implements RealtimeEventHandlerProvider {
    public final RealtimeEventHandler get(AnonymousClass0Cm anonymousClass0Cm) {
        return MainFeedRealtimeService.getInstance(anonymousClass0Cm);
    }
}
