package X;

import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;
import com.instagram.video.videocall.analytics.VideoCallWaterfall$LeaveReason;
import com.instagram.video.videocall.client.VideoCallRtcSession$Delegate$DismissReason;

/* renamed from: X.6Gc */
public final class AnonymousClass6Gc implements AnonymousClass4u3 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6A5 f73811B;

    public final void dr(String str, int i) {
    }

    public final void fr(int i) {
    }

    public AnonymousClass6Gc(AnonymousClass6A5 anonymousClass6A5) {
        this.f73811B = anonymousClass6A5;
    }

    /* renamed from: A */
    public final void m29800A(VideoCallRtcSession$Delegate$DismissReason videoCallRtcSession$Delegate$DismissReason) {
        if (this.f73811B.f72464B != null) {
            AnonymousClass6Gg anonymousClass6Gg = this.f73811B.f72464B;
            AnonymousClass6H1 anonymousClass6H1;
            if (AnonymousClass6AL.f72502C[videoCallRtcSession$Delegate$DismissReason.ordinal()] != 1) {
                anonymousClass6H1 = anonymousClass6Gg.f73817B;
                if (anonymousClass6H1 != null) {
                    anonymousClass6H1.m29846C(new AnonymousClass4u9(videoCallRtcSession$Delegate$DismissReason.name()));
                }
                anonymousClass6Gg.f73819D.E(VideoCallWaterfall$LeaveReason.SERVER_TERMINATED);
                return;
            }
            anonymousClass6H1 = anonymousClass6Gg.f73817B;
            if (anonymousClass6H1 != null) {
                AnonymousClass6H1.m29843B(anonymousClass6H1, AnonymousClass6Ah.TOO_FEW_PARTICIPANTS, anonymousClass6H1.f73875G.m29951H());
                anonymousClass6H1.f73879K.m29295A();
            }
            anonymousClass6Gg.f73819D.E(VideoCallWaterfall$LeaveReason.LAST_ONE_LEFT);
        }
    }

    public final void HAA(Exception exception) {
        if (exception != null) {
            DLog.e(DLogTag.VIDEO_CALL, "onSignalingFinished: %s", new Object[]{exception.getMessage()});
        } else {
            DLog.d(DLogTag.VIDEO_CALL, "onSignalingFinished", new Object[0]);
        }
        if (this.f73811B.f72469G > 0) {
            AnonymousClass6A5 anonymousClass6A5 = this.f73811B;
            anonymousClass6A5.f72469G--;
            this.f73811B.f72476N.ma(exception);
        }
    }

    public final void IAA(boolean z) {
        DLog.d(DLogTag.VIDEO_CALL, "onSignalingStarted", new Object[0]);
        if (z) {
            AnonymousClass6A5 anonymousClass6A5 = this.f73811B;
            anonymousClass6A5.f72469G++;
            this.f73811B.f72476N.la();
        }
    }

    public final void er(AnonymousClass4u2 anonymousClass4u2) {
        this.f73811B.f72471I.C(new AnonymousClass6AD(anonymousClass4u2, AnonymousClass6AC.ADDED));
    }

    public final void gr(AnonymousClass4u2 anonymousClass4u2) {
        this.f73811B.f72471I.C(new AnonymousClass6AD(anonymousClass4u2, AnonymousClass6AC.REMOVED));
    }

    public final void hr(AnonymousClass4u2 anonymousClass4u2) {
        this.f73811B.f72471I.C(new AnonymousClass6AD(anonymousClass4u2, AnonymousClass6AC.UPDATED));
    }

    public final void nz() {
        DLog.d(DLogTag.VIDEO_CALL, "onSessionConnected", new Object[0]);
        if (this.f73811B.f72471I.f5584B == AnonymousClass6AG.DISCONNECTED) {
            this.f73811B.f72471I.C(new AnonymousClass6A9());
            this.f73811B.f72476N.jZ();
        }
    }

    public final void oz() {
        DLog.d(DLogTag.VIDEO_CALL, "onSessionDisconnected", new Object[0]);
        if (this.f73811B.f72471I.f5584B != AnonymousClass6AG.DISCONNECTED) {
            this.f73811B.f72471I.C(new AnonymousClass6A6());
            this.f73811B.f72476N.hZ();
        }
    }

    public final void pz() {
        this.f73811B.f72471I.C(new AnonymousClass6A7());
    }

    public final void qz(Exception exception) {
        DLog.e(DLogTag.VIDEO_CALL, "onSessionError: %s", new Object[]{exception.getMessage()});
        this.f73811B.f72471I.C(new AnonymousClass6A8(exception, (AnonymousClass6AG) this.f73811B.f72471I.f5584B));
    }

    public final void rz() {
        DLog.d(DLogTag.VIDEO_CALL, "onSessionStarted", new Object[0]);
        if (this.f73811B.f72471I.f5584B == AnonymousClass6AG.STARTING) {
            this.f73811B.f72471I.C(new AnonymousClass6AA());
            return;
        }
        AnonymousClass0Dc.R("VideoCallClient", "Unexpected session start while in state: %s", new Object[]{this.f73811B.f72471I.f5584B});
    }
}
