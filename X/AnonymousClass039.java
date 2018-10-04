package X;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.039 */
public final class AnonymousClass039 {
    /* renamed from: B */
    public static String m183B(int i) {
        if (i == 1) {
            return "IG_CLIENT_PERF_COLD_START";
        }
        switch (i) {
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return "IG_CLIENT_PERF_WARM_START";
            case 8:
                return "IG_CLIENT_PERF_LUKEWARM_START";
            case 9:
                return "IG_CLIENT_PERF_IMAGE_DOWNLOAD";
            case 10:
                return "IG_CLIENT_PERF_NOTIFICATION_PREFETCH";
            case 11:
                return "IG_CLIENT_PERF_APP_START";
            default:
                switch (i) {
                    case ParserMinimalBase.INT_CR /*13*/:
                        return "IG_CLIENT_PERF_STARTUP_PREFETCH_REEL";
                    case 14:
                        return "IG_CLIENT_PERF_DOWNLOAD_MODULES";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
        }
    }
}
