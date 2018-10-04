package X;

import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.03o */
public final class AnonymousClass03o {
    /* renamed from: B */
    public static String m224B(int i) {
        switch (i) {
            case 1:
                return "MAPS_MAPVIEW_ONCREATE";
            case 2:
                return "MAPS_MAPVIEW_ONSTART";
            case 3:
                return "MAPS_MAPVIEW_ONRESUME";
            case 4:
                return "MAPS_PINMANAGER_INIT";
            case 5:
                return "MAPS_PINMANAGER_SET_GEOSJON";
            case 6:
                return "MAPS_PINMANAGER_ADD_FEATURES";
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return "MAPS_PINMANAGER_SELECT_PIN";
            case 8:
                return "MAPS_RECOMMENDATIONS_INIT_ICONS";
            case 9:
                return "MAPS_MAPVIEW_GET_MAP_SYNC";
            case 10:
                return "MAPS_MAPVIEW_GET_MAP_ASYNC";
            case 11:
                return "MAPS_MAPVIEW_FULLY_LOADED";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
