package X;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.03x */
public final class AnonymousClass03x {
    /* renamed from: B */
    public static String m233B(int i) {
        switch (i) {
            case 2:
                return "MESSENGER_LITE_COMPONENT_TTI";
            case 5:
                return "MESSENGER_LITE_SQLITE_TIME_TO_UPGRADE_DB";
            case 6:
                return "MESSENGER_LITE_NETWORK_REQUEST";
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return "MESSENGER_LITE_MEDIA_DOWNLOAD";
            case 9:
                return "MESSENGER_LITE_MEDIA_UPLOAD_ANDROID";
            case 12:
                return "MESSENGER_LITE_MLITE_TIME_TO_LOAD_THREAD_LIST";
            case ParserMinimalBase.INT_CR /*13*/:
                return "MESSENGER_LITE_SQLITE_TIME_TO_MIGRATE_DATA";
            case 14:
                return "MESSENGER_LITE_MLITE_RESOURCES_WAIT_TIME";
            case 15:
                return "MESSENGER_LITE_MESSENGER_LITE_VIDEO_TRANSCODE_TIME";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
