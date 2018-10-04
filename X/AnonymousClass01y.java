package X;

import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.01y */
public final class AnonymousClass01y {
    /* renamed from: B */
    public static String m110B(int i) {
        switch (i) {
            case 1:
                return "BROWSER_WEB_VIEW_LOAD";
            case 2:
                return "BROWSER_BROWSER_CONTEXT_NETWORK_FETCH";
            case 3:
                return "BROWSER_BROWSER_PIVOTS_HIDE";
            case 4:
                return "BROWSER_BROWSER_PIVOTS_SHOW";
            case 5:
                return "BROWSER_PERF_MARK_BROWSERFRAGMENT_INITIALIZE";
            case 6:
                return "BROWSER_PERF_MARK_FIRST_WEBVIEW_INVALIDATE";
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return "BROWSER_PERF_MARK_PAGE_FINISHED";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
