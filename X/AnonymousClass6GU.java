package X;

import com.instagram.video.videocall.analytics.VideoCallWaterfall$CallStartResult;
import com.instagram.video.videocall.analytics.VideoCallWaterfall$EndScreenType;
import com.instagram.video.videocall.analytics.VideoCallWaterfall$LeaveReason;

/* renamed from: X.6GU */
public final class AnonymousClass6GU implements AnonymousClass69e {
    public final void ra(AnonymousClass5jJ anonymousClass5jJ) {
    }

    /* renamed from: B */
    private static void m29782B(String str, String... strArr) {
        if (!AnonymousClass0CB.J()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Hitting no-op at method: ");
            stringBuilder.append(str);
            if (strArr.length > 0) {
                stringBuilder.append("; with input parameters: ");
            }
            for (String str2 : strArr) {
                if (str2 != null) {
                    stringBuilder.append(str2);
                    stringBuilder.append(" ");
                }
            }
            stringBuilder.toString();
        }
    }

    public final void BNA(boolean z) {
        AnonymousClass6GU.m29782B("setCameraOff", new String[0]);
    }

    public final void Ba() {
        AnonymousClass6GU.m29782B("logEndCallAttempt", new String[0]);
    }

    public final void HC(String str, long j) {
        AnonymousClass6GU.m29782B("addVideoStreamStalled", new String[0]);
    }

    public final void Ha(VideoCallWaterfall$EndScreenType videoCallWaterfall$EndScreenType) {
        AnonymousClass6GU.m29782B("logEndScreenImpression", videoCallWaterfall$EndScreenType.name());
    }

    public final void Ja(AnonymousClass69b anonymousClass69b, Exception exception) {
        AnonymousClass6GU.m29782B("logError", anonymousClass69b.m29235A(), exception.getMessage());
    }

    public final void NWA(AnonymousClass6Ae anonymousClass6Ae) {
        AnonymousClass6GU.m29782B("updateParticipant", new String[0]);
    }

    public final void PRA(AnonymousClass69d anonymousClass69d) {
        AnonymousClass6GU.m29782B("setScreenMode", new String[0]);
    }

    public final void Pa() {
        AnonymousClass6GU.m29782B("logFirstFrameReceived", new String[0]);
    }

    public final void Qa() {
        AnonymousClass6GU.m29782B("logFirstParticipantJoined", new String[0]);
    }

    public final void Sb(String str) {
        AnonymousClass6GU.m29782B("logTsLogs", new String[0]);
    }

    public final void Tb(String str, String str2) {
        AnonymousClass6GU.m29782B("logUserFeedback", new String[0]);
    }

    public final void Ub() {
        AnonymousClass6GU.m29782B("logVCBackgrounded", new String[0]);
    }

    public final void Vb() {
        AnonymousClass6GU.m29782B("logVCForegrounded", new String[0]);
    }

    public final void WSA(String str) {
        AnonymousClass6GU.m29782B("setVideoCallId", new String[0]);
    }

    public final void Wb(String str) {
        AnonymousClass6GU.m29782B("logVideoStartedPlaying", new String[0]);
    }

    public final void ZZ() {
        AnonymousClass6GU.m29782B("logAudioFocusGain", new String[0]);
    }

    public final void aZ(int i) {
        AnonymousClass6GU.m29782B("logAudioFocusLoss", new String[0]);
    }

    public final void aa() {
        AnonymousClass6GU.m29782B("logJoinCallAttempt", new String[0]);
    }

    public final void bZ() {
        AnonymousClass6GU.m29782B("logAudioFocusRejected", new String[0]);
    }

    public final void ba(VideoCallWaterfall$CallStartResult videoCallWaterfall$CallStartResult, Integer num, String str) {
        AnonymousClass6GU.m29782B("logJoinCallResult", new String[0]);
    }

    public final void cZ(boolean z) {
        AnonymousClass6GU.m29782B("logAudioRouteUpdated", new String[0]);
    }

    public final void ca() {
        AnonymousClass6GU.m29782B("logMaximized", new String[0]);
    }

    public final void da() {
        AnonymousClass6GU.m29782B("logMediaUpdateReceived", new String[0]);
    }

    public final void ea() {
        AnonymousClass6GU.m29782B("logMinimized", new String[0]);
    }

    public final void hZ() {
        AnonymousClass6GU.m29782B("logCallDisconnected", new String[0]);
    }

    public final void iZ(VideoCallWaterfall$LeaveReason videoCallWaterfall$LeaveReason) {
        AnonymousClass6GU.m29782B("logCallEnded", new String[0]);
    }

    public final void ia() {
        AnonymousClass6GU.m29782B("logParticipantStatusUpdated", new String[0]);
    }

    public final void jZ() {
        AnonymousClass6GU.m29782B("logCallReconnected", new String[0]);
    }

    public final void kZ() {
        AnonymousClass6GU.m29782B("logCallSummary", new String[0]);
    }

    public final void lMA(boolean z) {
        AnonymousClass6GU.m29782B("setAudioMute", new String[0]);
    }

    public final void la() {
        AnonymousClass6GU.m29782B("logRejoinAttempt", new String[0]);
    }

    public final void ma(Exception exception) {
        AnonymousClass6GU.m29782B("logRejoinAttempt", new String[0]);
    }

    public final void oJA(AnonymousClass6Ae anonymousClass6Ae) {
        AnonymousClass6GU.m29782B("removeParticipant", new String[0]);
    }

    public final void tB(AnonymousClass6Ae anonymousClass6Ae) {
        AnonymousClass6GU.m29782B("addParticipant", new String[0]);
    }

    public final void tJA(String str) {
        AnonymousClass6GU.m29782B("removeVideoStreamStalled", new String[0]);
    }

    public final void uZ() {
        AnonymousClass6GU.m29782B("logConnectingScreenImpression", new String[0]);
    }

    public final void vZ() {
        AnonymousClass6GU.m29782B("logCreateCallAttempt", new String[0]);
    }

    public final void va(AnonymousClass69b anonymousClass69b) {
        AnonymousClass6GU.m29782B("logSettingChanged", anonymousClass69b.m29235A());
    }

    public final void wZ(VideoCallWaterfall$CallStartResult videoCallWaterfall$CallStartResult, Integer num, String str) {
        AnonymousClass6GU.m29782B("logCreateCallResult", new String[0]);
    }

    public final void yMA(boolean z) {
        AnonymousClass6GU.m29782B("setCameraFacing", new String[0]);
    }
}
