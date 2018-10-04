package X;

import com.facebook.forker.Process;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.051 */
public final class AnonymousClass051 {
    /* renamed from: B */
    public static String m299B(int i) {
        switch (i) {
            case 1:
                return "RTC_PERF_RTC_OUTGOING_CALL_START";
            case 2:
                return "RTC_PERF_RTC_INCOMING_CALL_START";
            case 3:
                return "RTC_PERF_RTC_FULLSCREEN_TO_VCH";
            case 4:
                return "RTC_PERF_RTC_FULLSCREEN_CREATE_TO_VISIBLE";
            case 5:
                return "RTC_PERF_RTC_VCH_TO_FULLSCREEN";
            case 6:
                return "RTC_PERF_LAB_METRIC";
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return "RTC_PERF_RTC_CREATE_CALL_ENT";
            case 9:
                return "RTC_PERF_PLATFORM_P2P_START_CALL";
            case 10:
                return "RTC_PERF_RTC_INCOMING_CALL_ANSWERED";
            case 11:
                return "RTC_PERF_RTC_VOIP_STATUS_BAR_PRESSED";
            case 12:
                return "RTC_PERF_PLATFORM_P2P_SET_REMOTE_DESCRIPTION";
            case ParserMinimalBase.INT_CR /*13*/:
                return "RTC_PERF_PLATFORM_P2P_AUDIO_PERF";
            case 14:
                return "RTC_PERF_PLATFORM_P2P_VIDEO_PERF";
            case 15:
                return "RTC_PERF_PLATFORM_P2P_SET_LOCAL_DESCRIPTION";
            case 16:
                return "RTC_PERF_RTC_VIDEO_FIRST_CALL_START";
            case 17:
                return "RTC_PERF_PLATFORM_P2P_SEND_OFFER";
            case Process.SIGCONT /*18*/:
                return "RTC_PERF_PLATFORM_P2P_HANDLE_OFFER";
            case Process.SIGSTOP /*19*/:
                return "RTC_PERF_PLATFORM_P2P_START_CALL_CALLER_FLOW";
            case Process.SIGTSTP /*20*/:
                return "RTC_PERF_PLATFORM_P2P_START_CALL_CALLEE_FLOW";
            case 22:
                return "RTC_PERF_PLATFORM_P2P_ACCEPT_CALL_CALLER_FLOW";
            case 23:
                return "RTC_PERF_PLATFORM_P2P_ACCEPT_CALL_CALLEE_FLOW";
            case 24:
                return "RTC_PERF_RTC_OPEN_SCRIM";
            case 25:
                return "RTC_PERF_RTC_REGENERATE_GRID_LAYOUT";
            case 26:
                return "RTC_PERF_PLATFORM_MW_JOIN_CALL_FLOW";
            case 27:
                return "RTC_PERF_PLATFORM_MW_CONNECT_TO_PARTICIPANT_FLOW";
            case 28:
                return "RTC_PERF_PLATFORM_MW_INVITE_PARTICIPANT_INVITEE_FLOW";
            case 29:
                return "RTC_PERF_PLATFORM_MW_INVITE_PARTICIPANT_INVITER_FLOW";
            case 30:
                return "RTC_PERF_RTC_SCRIM_CONTACTS_PICKER";
            case 31:
                return "RTC_PERF_PLATFORM_CLIENT_TRANSACTION";
            case 32:
                return "RTC_PERF_BONFIRE_INTEROP_NT";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
