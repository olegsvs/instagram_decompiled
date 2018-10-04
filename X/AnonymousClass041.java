package X;

import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.041 */
public final class AnonymousClass041 {
    /* renamed from: B */
    public static String m237B(int i) {
        switch (i) {
            case 1:
                return "MINUTIAE_VERB_PICKER_TIME_TO_INIT";
            case 2:
                return "MINUTIAE_VERB_PICKER_TIME_TO_FETCH_START";
            case 3:
                return "MINUTIAE_VERB_PICKER_TIME_TO_FETCH_END";
            case 4:
                return "MINUTIAE_VERB_PICKER_FETCH_TIME";
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return "MINUTIAE_VERB_PICKER_TIME_TO_FETCH_END_CACHED";
            case 8:
                return "MINUTIAE_VERB_PICKER_TIME_TO_RESULTS_SHOWN_CACHED";
            case 9:
                return "MINUTIAE_VERB_PICKER_FETCH_TIME_CACHED";
            case 11:
                return "MINUTIAE_VERB_PICKER_TIME_TO_RESULTS_SHOWN";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
