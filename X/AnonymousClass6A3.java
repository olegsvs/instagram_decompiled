package X;

import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;

/* renamed from: X.6A3 */
public final class AnonymousClass6A3 extends AnonymousClass3AL {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6A5 f72461B;

    public AnonymousClass6A3(AnonymousClass6A5 anonymousClass6A5) {
        this.f72461B = anonymousClass6A5;
    }

    /* renamed from: A */
    public final void m29253A(Exception exception) {
        AnonymousClass0Dc.G("VideoCallClient", "onLeaveCall - failed", exception);
        DLog.e(DLogTag.VIDEO_CALL, "onLeaveCall - failed: %s", new Object[]{exception.getMessage()});
        this.f72461B.f72476N.Ja(AnonymousClass69b.LEAVE, exception);
    }

    /* renamed from: B */
    public final void m29254B(Object obj) {
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        DLog.d(DLogTag.VIDEO_CALL, "onLeaveCall - success", new Object[0]);
    }
}
