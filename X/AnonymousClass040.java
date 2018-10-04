package X;

import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.040 */
public final class AnonymousClass040 {
    /* renamed from: B */
    public static String m236B(int i) {
        switch (i) {
            case 1:
                return "MINUTIAE_OBJECT_SELECTOR_TIME_TO_INIT";
            case 2:
                return "MINUTIAE_OBJECT_SELECTOR_TIME_TO_FETCH_START";
            case 3:
                return "MINUTIAE_OBJECT_SELECTOR_TIME_TO_FETCH_END";
            case 4:
                return "MINUTIAE_OBJECT_SELECTOR_TIME_TO_RESULTS_SHOWN";
            case 5:
                return "MINUTIAE_OBJECT_SELECTOR_FETCH_TIME";
            case 6:
                return "MINUTIAE_OBJECT_SELECTOR_TIME_TO_FETCH_END_CACHED";
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return "MINUTIAE_OBJECT_SELECTOR_TIME_TO_RESULTS_SHOWN_CACHED";
            case 8:
                return "MINUTIAE_OBJECT_SELECTOR_FETCH_TIME_CACHED";
            case 9:
                return "MINUTIAE_OBJECT_SELECTOR_TIME_TO_SCROLL_LOAD";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
