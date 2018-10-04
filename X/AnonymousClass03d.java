package X;

import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.03d */
public final class AnonymousClass03d {
    /* renamed from: B */
    public static String m213B(int i) {
        switch (i) {
            case 1:
                return "ISNEWCONNECTION";
            case 2:
                return "LIGER_NETWORK_STATS_REQUEST_HEADER_BYTES";
            case 3:
                return "LIGER_NETWORK_STATS_REQUEST_BODY_BYTES";
            case 4:
                return "LIGER_NETWORK_STATS_RESPONSE_HEADER_BYTES";
            case 5:
                return "LIGER_NETWORK_STATS_RESPONSE_BODY_BYTES";
            case 6:
                return "LIGER_NETWORK_STATS_DNS_LATENCY";
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return "LIGER_NETWORK_STATS_TCP_LATENCY";
            case 8:
                return "LIGER_NETWORK_STATS_TLS_LATENCY";
            case 9:
                return "LIGER_NETWORK_STATS_RESPOSNE_BODY_BYTES_TIME";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
