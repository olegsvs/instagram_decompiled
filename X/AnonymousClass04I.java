package X;

import com.facebook.forker.Process;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.04I */
public final class AnonymousClass04I {
    /* renamed from: B */
    public static String m254B(int i) {
        switch (i) {
            case 1:
                return "NOTIFICATIONS_NOTIF_GET_FROM_DISK";
            case 2:
                return "NOTIFICATIONS_NOTIF_FULL_FETCH_FROM_SERVER";
            case 3:
                return "NOTIFICATIONS_NOTIF_NEW_FETCH_FROM_SERVER";
            case 4:
                return "NOTIFICATIONS_POLL_NOTIF";
            case 5:
                return "NOTIFICATIONS_PULL_TO_REFRESH_LOAD_TIME";
            case 6:
                return "NOTIFICATIONS_NOTIF_JSON_DESERIALIZE";
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return "NOTIFICATIONS_NOTIF_LOCKSCREEN_PERMALINK_LOAD_TIME";
            case 8:
                return "NOTIFICATIONS_NOTIF_PERMALINK_REFRESH_STORY_TIME";
            case 9:
                return "NOTIFICATIONS_NOTIF_LIST_LOAD_TIME_COLD";
            case 10:
                return "NOTIFICATIONS_NOTIF_LIST_LOAD_TIME_WARM";
            case ParserMinimalBase.INT_CR /*13*/:
                return "NOTIFICATIONS_NOTIF_SCROLL_LOAD";
            case 15:
                return "NOTIFICATIONS_SHOW_NOTIFICATION_IN_SYSTEM_TRAY";
            case Process.SIGCONT /*18*/:
                return "NOTIFICATIONS_OPEN_NOTIFICATION_TAB_TTI";
            case Process.SIGSTOP /*19*/:
                return "NOTIFICATIONS_NOTIFICATION_SYNC_ERROR";
            case Process.SIGTSTP /*20*/:
                return "NOTIFICATIONS_PERMALINK_REDIRECT_FALLBACK_URL";
            case 21:
                return "NOTIFICATIONS_NOTIFICATION_HANDLER";
            case 22:
                return "NOTIFICATIONS_MQTT_WAKE_UP";
            case 23:
                return "NOTIFICATIONS_NOTIFICATIONS_PTR_TTI";
            case 24:
                return "NOTIFICATIONS_NOTIFICATIONS_TAIL_LOAD_TTI";
            case 25:
                return "NOTIFICATIONS_NOTIFICATION_HEAD_LOAD";
            case 26:
                return "NOTIFICATIONS_PERMALINK_NOTIFICATION_HEAD_LOAD";
            case 27:
                return "NOTIFICATIONS_PERMALINK_IN_APP_NOTIFICATION_HEAD_LOAD";
            case 29:
                return "NOTIFICATIONS_SEE_POST_FROM_HEAD_LOAD";
            case 30:
                return "NOTIFICATIONS_PERMALINK_FROM_PRELOAD_CAROUSEL_LOAD";
            case 32:
                return "NOTIFICATIONS_PREINIT_NOTIFICATIONS_TAB";
            case 33:
                return "NOTIFICATIONS_TIME_TILL_BADGE";
            case ParserMinimalBase.INT_QUOTE /*34*/:
                return "NOTIFICATIONS_NOTIFICATIONS_TAB_TTRC";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
