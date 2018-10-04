package X;

import com.facebook.forker.Process;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.024 */
public final class AnonymousClass024 {
    /* renamed from: B */
    public static String m116B(int i) {
        switch (i) {
            case 1:
                return "CAMERA_PERF_CANCEL_RECORDING_VIDEO";
            case 2:
                return "CAMERA_PERF_CAPTURE_IMAGE";
            case 3:
                return "CAMERA_PERF_START_AUDIO_SESSION";
            case 4:
                return "CAMERA_PERF_START_CAMERA_SESSION";
            case 5:
                return "CAMERA_PERF_START_RECORDING_VIDEO";
            case 6:
                return "CAMERA_PERF_STOP_RECORDING_VIDEO";
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return "CAMERA_PERF_UPDATE_CAPTURE_DEVICE_POSITION";
            case 8:
                return "CAMERA_PERF_UPDATE_EXPOSURE_POINT";
            case 10:
                return "CAMERA_PERF_UPDATE_TORCH_MODE";
            case 11:
                return "CAMERA_PERF_STOP_AUDIO_SESSION";
            case 12:
                return "CAMERA_PERF_STOP_CAMERA_SESSION";
            case ParserMinimalBase.INT_CR /*13*/:
                return "CAMERA_PERF_START_AUDIO_AND_CAMERA_SESSION";
            case 14:
                return "CAMERA_PERF_STOP_AUDIO_AND_CAMERA_SESSION";
            case 15:
                return "CAMERA_PERF_TIME_TO_FIRST_FRAME";
            case 16:
                return "CAMERA_PERF_CAPTURE_PHOTO";
            case Process.SIGCONT /*18*/:
                return "CAMERA_PERF_START_MEDIA_PIPELINE_SESSION";
            case Process.SIGSTOP /*19*/:
                return "CAMERA_PERF_STOP_MEDIA_PIPELINE_SESSION";
            case Process.SIGTSTP /*20*/:
                return "CAMERA_PERF_SAVE_PHOTO";
            case 21:
                return "CAMERA_PERF_TIME_TO_FIRST_FRAME_AFTER_CAMERA_OPEN";
            case 22:
                return "CAMERA_PERF_CAPTURE_PHOTO_OS";
            case 23:
                return "CAMERA_PERF_CAMERA_EFFECT_FETCH_CACHE";
            case 24:
                return "CAMERA_PERF_CAMERA_EFFECT_FETCH_NETWORK";
            case 25:
                return "CAMERA_PERF_HW_START_CAMERA_SESSION";
            case 27:
                return "CAMERA_PERF_HW_TIME_TO_FIRST_FRAME_AFTER_CAMERA_OPEN";
            case 29:
                return "CAMERA_PERF_PREPARE_CAMERA_SESSION";
            case 30:
                return "CAMERA_PERF_START_CAMERA_SESSION_TO_FIRST_HARDWARE_FRAME";
            case 31:
                return "CAMERA_PERF_FIRST_HARDWARE_FRAME_TO_FIRST_USER_FRAME";
            case 32:
                return "CAMERA_PERF_CAPTURE_POST_PHOTO";
            case 33:
                return "CAMERA_PERF_PROCESSING_INPUT_FRAME_TIME_AVG";
            case ParserMinimalBase.INT_QUOTE /*34*/:
                return "CAMERA_PERF_EFFECT_TIME_TO_INTERACT";
            case 35:
                return "CAMERA_PERF_CAPTURE_PHOTO_PREVIEW";
            case 36:
                return "CAMERA_PERF_CAPTURE_PHOTO_NATIVE";
            case 38:
                return "CAMERA_PERF_AUTO_FACE_FOCUS_TRACKER_WARMUP";
            case ParserMinimalBase.INT_APOSTROPHE /*39*/:
                return "CAMERA_PERF_AUTO_FACE_FOCUS_TRACKER_FACE_DETECTION";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
