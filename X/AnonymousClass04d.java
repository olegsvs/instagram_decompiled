package X;

import com.facebook.forker.Process;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.04d */
public final class AnonymousClass04d {
    /* renamed from: B */
    public static String m275B(int i) {
        switch (i) {
            case 1:
                return "PR_CAMERA_CACHE_LOAD_TIME";
            case 2:
                return "PR_CAMERA_COLD_START_TTI";
            case 3:
                return "PR_CAMERA_WARM_START_TTI";
            case 4:
                return "PR_CAMERA_NETWORK_LOAD_TIME";
            case 6:
                return "PR_CAMERA_APPLY_EFFECT_TTI";
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return "PR_CAMERA_VIDEO_PROCESSING_TIME";
            case 8:
                return "PR_CAMERA_PHOTO_PROCESSING_TIME";
            case 9:
                return "PR_CAMERA_STYLE_TRANSFER_PROCESSSING_TIME";
            case 10:
                return "PR_CAMERA_PAGE_TRANSITION_TIME";
            case 15:
                return "PR_CAMERA_EFFECT_STARTUP_TIME";
            case 16:
                return "PR_CAMERA_INSPIRATION_UPDATE";
            case 17:
                return "PR_CAMERA_CAMERA_FIRST_FRAME_TTI";
            case Process.SIGCONT /*18*/:
                return "PR_CAMERA_PR_CAMERA_EFFECT_TRAY_TTI";
            case Process.SIGSTOP /*19*/:
                return "PR_CAMERA_PHOTO_CAPTURE";
            case Process.SIGTSTP /*20*/:
                return "PR_CAMERA_TIME_TO_START_CAPTURE_VIDEO";
            case 21:
                return "PR_CAMERA_TIME_TO_END_CAPTURE_VIDEO";
            case 22:
                return "PR_CAMERA_CAMERA_INITIAL_PHOTO_TTI";
            case 23:
                return "PR_CAMERA_CAMERA_INITIAL_VIDEO_TTI";
            case 24:
                return "PR_CAMERA_SIMPLE_METRIC";
            case 25:
                return "PR_CAMERA_CAMERA_INITIAL_MEDIAS_TTI";
            case 26:
                return "PR_CAMERA_CAMERA_ROLL_PHOTO_PICKING_TTI";
            case 27:
                return "PR_CAMERA_CAMERA_ROLL_VIDEO_PICKING_TTI";
            case 28:
                return "PR_CAMERA_CAMERA_BOOMERANG_PROCESSING_TIME";
            case 29:
                return "PR_CAMERA_CAMERA_FIRST_FRAME_TTRC";
            case 30:
                return "PR_CAMERA_CAMERA_INITIAL_PHOTO_TTRC";
            case 31:
                return "PR_CAMERA_CAMERA_INITIAL_VIDEO_TTRC";
            case 32:
                return "PR_CAMERA_CAMERA_INITIAL_MEDIAS_TTRC";
            case 33:
                return "PR_CAMERA_MUSIC_PICKER_LAUNCH_TTI";
            case ParserMinimalBase.INT_QUOTE /*34*/:
                return "PR_CAMERA_MUSIC_PICKER_PREVIEW_TTI";
            case 35:
                return "PR_CAMERA_MUSIC_PICKER_SELECT_SONG_TTI";
            case 36:
                return "PR_CAMERA_DOODLE_TOOL_LAUNCH_TTI";
            case ParserMinimalBase.INT_APOSTROPHE /*39*/:
                return "PR_CAMERA_CAPTURE_MODE_TTI";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
