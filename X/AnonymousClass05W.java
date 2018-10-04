package X;

import com.facebook.forker.Process;
import com.fasterxml.jackson.core.base.ParserMinimalBase;

/* renamed from: X.05W */
public final class AnonymousClass05W {
    /* renamed from: B */
    public static String m330B(int i) {
        switch (i) {
            case 1:
                return "VIDEO_INITIALIZATION";
            case 2:
                return "VIDEO_CHANNEL_VIDEO_PLAYER";
            case 3:
                return "VIDEO_FULLSCREEN_TRANSITION";
            case 4:
                return "VIDEO_PREFETCH_ITEM";
            case 9:
                return "VIDEO_VIDEO_HOME_LOADING";
            case 10:
                return "VIDEO_VIDEO_HOME_FUNNEL";
            case ParserMinimalBase.INT_CR /*13*/:
                return "VIDEO_VIDEO_PLAYBACK_EVENT";
            case 14:
                return "VIDEO_CHANNEL_TRANSITION";
            case 15:
                return "VIDEO_VIDEO_UNUSED";
            case 16:
                return "VIDEO_VIDEO_UNUSED_II";
            case 17:
                return "VIDEO_QUALITY_SUMMARY_EVENT";
            case Process.SIGCONT /*18*/:
                return "VIDEO_VIDEO_PLAYBACK_STALL";
            case Process.SIGSTOP /*19*/:
                return "VIDEO_EXOPLAYER_DO_SOME_WORK";
            case 22:
                return "VIDEO_SOCIAL_PLAYER_TRANSITION";
            case 23:
                return "VIDEO_DISMISS_VIDEO";
            case 24:
                return "VIDEO_PLAYER_BACK_BTN_PRESSED";
            case 26:
                return "VIDEO_RICH_VIDEO_PLAYER_EVENTS";
            case 27:
                return "VIDEO_JEWEL_NOTIFICATION_TO_PLAYBACK";
            case 28:
                return "VIDEO_PREPARE_FEED_VIDEO";
            case 32:
                return "VIDEO_HTTP_TRANSFER_EVENT";
            case 33:
                return "VIDEO_WATCH_TAB_E2E_TTI";
            case ParserMinimalBase.INT_QUOTE /*34*/:
                return "VIDEO_VIDEO_PLAYBACK_STATE";
            case 35:
                return "VIDEO_MOUNT_FEED_VIDEO";
            case 36:
                return "VIDEO_ABR_DECISION";
            case 37:
                return "VIDEO_RICH_VIDEO_PLAYER_EVENTS_WATCH_FEED";
            case 38:
                return "VIDEO_VIDEO_QUALITIES";
            case ParserMinimalBase.INT_APOSTROPHE /*39*/:
                return "VIDEO_WATCH_TAB_SCROLL_PERF";
            case ParserMinimalBase.INT_ASTERISK /*42*/:
                return "VIDEO_PLAYER_INIT";
            case 43:
                return "VIDEO_BIND_PLAYER_SERVICE";
            case ParserMinimalBase.INT_COMMA /*44*/:
                return "VIDEO_PLAYER_ACTION";
            case 45:
                return "VIDEO_VIDEO_PLAYBACK_STALL_DATA";
            case 46:
                return "VIDEO_VIDEO_FETCH_REQUEST_EVENT";
            case ParserMinimalBase.INT_SLASH /*47*/:
                return "VIDEO_THUMBNAIL";
            case 48:
                return "VIDEO_HERO_MODULE_INIT";
            case 49:
                return "VIDEO_HERO_MODULE_DOWNLOAD";
            case 50:
                return "VIDEO_RVP_PLUGIN_LOAD";
            case 52:
                return "VIDEO_VIDEO_PROFILER_START";
            case 53:
                return "VIDEO_SCURBBER";
            case 54:
                return "VIDEO_STORY_VIDEO_PROFILER_START";
            case 55:
                return "VIDEO_PARSE_SEGMENT_TIMELINE_ANDROID";
            case 56:
                return "VIDEO_HERO_LIVE_MODULE_DOWNLOAD";
            case 57:
                return "VIDEO_CHANNEL_FEED_UP_NEXT_TTI_ANDROID_VIDEO";
            case ParserMinimalBase.INT_COLON /*58*/:
                return "VIDEO_BIND_FEED_VIDEO";
            case 59:
                return "VIDEO_START_AD_BREAK_ANDROID";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
