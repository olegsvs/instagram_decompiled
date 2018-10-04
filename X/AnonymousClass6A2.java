package X;

import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;
import com.instagram.model.videocall.VideoCallInfo;

/* renamed from: X.6A2 */
public final class AnonymousClass6A2 extends AnonymousClass3AL {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6A5 f72460B;

    public AnonymousClass6A2(AnonymousClass6A5 anonymousClass6A5) {
        this.f72460B = anonymousClass6A5;
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void m29252B(Object obj) {
        VideoCallInfo videoCallInfo = (VideoCallInfo) obj;
        if (this.f72460B.f72471I.f5584B == AnonymousClass6AG.STARTING) {
            AnonymousClass6A5.m29259D(this.f72460B, videoCallInfo);
            this.f72460B.f72470H.mo6304N(this.f72460B.f72473K.f4468C);
            DLog.d(DLogTag.VIDEO_CALL, "joinCall success %s", new Object[]{this.f72460B.f72473K.f4468C});
        }
    }
}
