package X;

import com.instagram.model.videocall.VideoCallInfo;
import com.instagram.video.videocall.analytics.VideoCallWaterfall$CallStartResult;
import com.instagram.video.videocall.analytics.VideoCallWaterfall$LeaveReason;
import com.instagram.video.videocall.intf.VideoCallSource;

/* renamed from: X.6Gg */
public final class AnonymousClass6Gg {
    /* renamed from: B */
    public AnonymousClass6H1 f73817B;
    /* renamed from: C */
    public AnonymousClass6Gi f73818C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Qz f73819D;

    public AnonymousClass6Gg(AnonymousClass0Qz anonymousClass0Qz) {
        this.f73819D = anonymousClass0Qz;
    }

    /* renamed from: A */
    public final void m29802A(VideoCallInfo videoCallInfo, VideoCallSource videoCallSource) {
        this.f73819D.F(VideoCallWaterfall$CallStartResult.VIDEO_CALL_CONFLICT);
        AnonymousClass6Gi anonymousClass6Gi = this.f73818C;
        if (anonymousClass6Gi != null) {
            AnonymousClass6HX.m29948E(anonymousClass6Gi.f73821B, videoCallInfo, videoCallSource, VideoCallWaterfall$LeaveReason.CALL_CONFLICT);
        }
    }

    /* renamed from: B */
    public final void m29803B(Exception exception, VideoCallInfo videoCallInfo) {
        AnonymousClass6H1 anonymousClass6H1 = this.f73817B;
        if (anonymousClass6H1 != null) {
            anonymousClass6H1.m29846C(exception);
        }
        this.f73819D.E(VideoCallWaterfall$LeaveReason.CALL_FAILURE);
        AnonymousClass0Qx H = this.f73819D.f4537P.H();
        if ((exception instanceof AnonymousClass5YD) && videoCallInfo != null && H != null) {
            AnonymousClass0Dc.R("VideoCallManager", "Detaching video call: %s", new Object[]{videoCallInfo.f4468C});
            String str = videoCallInfo.f4468C;
            AnonymousClass0Tw C = AnonymousClass0Tw.C(H.f4519C);
            String e = C.e(H.f4518B);
            if (e != null && e.equals(str)) {
                C.t(H.f4518B, null, null);
            }
        }
    }
}
