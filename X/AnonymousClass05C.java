package X;

import com.facebook.forker.Process;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.05C */
public final class AnonymousClass05C {
    /* renamed from: B */
    public static String m310B(int i) {
        switch (i) {
            case 1:
                return "STORIES_VIEWER_FIRST_STORY_LOAD_TTI";
            case 2:
                return "STORIES_VIEWER_NEXT_STORY_TTI";
            case 3:
                return "STORIES_VIEWER_NEXT_BUCKET_TTI";
            case 5:
                return "STORIES_ROW_COLD_START_TTI";
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return "STORIES_ROW_REFRESH_TTI";
            case 9:
                return "STORIES_MY_STORY_BUCKET_REFRESH_TTI";
            case 10:
                return "STORIES_FRIEND_STORY_REFRESH_TTI";
            case 11:
                return "STORIES_STORY_WARM_START_TTI";
            case Process.SIGCONT /*18*/:
                return "STORIES_STORY_IMAGE_LOAD_TTI";
            case Process.SIGSTOP /*19*/:
                return "STORIES_STORY_INTERMEDIATE_IMAGE_LOAD_TTI";
            case 21:
                return "STORIES_TRAY_LOAD_TTI";
            case 22:
                return "STORIES_BUCKET_NAVIGATION_TTI";
            case 23:
                return "STORIES_THREAD_NAVIGATION_TTI";
            case 24:
                return "STORIES_STORY_VIEWER_LOAD_TTI";
            case 25:
                return "STORIES_TRAY_LOAD_PAGINATION_TTI";
            case 26:
                return "STORIES_VIEWER_SHEET_LOAD_TTI";
            case 27:
                return "STORIES_TRAY_COMPLETE_TTI";
            case 28:
                return "STORIES_UNIFIED_QUERY_RESPONSE_PROCESSING_TIME";
            case 29:
                return "STORIES_OPTIMISTIC_STORE_INSERT_TIME";
            case 30:
                return "STORIES_OPTIMISTIC_STORE_PURGE_TIME";
            case 31:
                return "STORIES_DISK_CACHE_INITIALIZE";
            case 32:
                return "STORIES_DISK_CACHE_WRITE";
            case ParserMinimalBase.INT_QUOTE /*34*/:
                return "STORIES_VIEWER_SHEET_TTRC";
            case 35:
                return "STORIES_REPLY_BAR_TTI";
            case 37:
                return "STORIES_STORY_BUCKET_INFLATION";
            case 40:
                return "STORIES_STORY_VIEWER_RESPONSIVENESS";
            case ParserMinimalBase.INT_COMMA /*44*/:
                return "STORIES_LWR_TAP_ANIMATION_TTI";
            case 45:
                return "STORIES_STORY_VIEWER_LOAD_TTRC";
            case 48:
                return "STORIES_STORIES_TRAY_TTRC";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
