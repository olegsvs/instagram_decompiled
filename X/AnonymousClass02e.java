package X;

import com.facebook.forker.Process;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.02e */
public final class AnonymousClass02e {
    /* renamed from: B */
    public static String m152B(int i) {
        switch (i) {
            case 1:
                return "FBLITE_COLD_STARTUP_CONNECTION_STATE_DISCONNECTED";
            case 2:
                return "FBLITE_COLD_STARTUP_CONNECTION_STATE_CONNECTING";
            case 3:
                return "FBLITE_COLD_STARTUP_CONNECTION_STATE_CONNECTED";
            case 4:
                return "FBLITE_COLD_STARTUP_CONNECTION_STATE_STANDBY";
            case 5:
                return "FBLITE_COLD_STARTUP_CONNECTION_STATE_DROPPED";
            case 6:
                return "FBLITE_COLD_STARTUP_CONNECTION_STATE_SHUTTING_DOWN";
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return "FBLITE_COLD_STARTUP_CONNECTION_STATE_TERMINATED";
            case 8:
                return "FBLITE_COLD_STARTUP_ESTABLISH_SOCKET";
            case 9:
                return "FBLITE_COLD_STARTUP_CREATE_SOCKET";
            case 10:
                return "FBLITE_COLD_STARTUP_ENABLE_TLS";
            case 11:
                return "FBLITE_COLD_STARTUP_DNS_LOOKUP";
            case 12:
                return "FBLITE_COLD_STARTUP_TRY_CONNECTING";
            case ParserMinimalBase.INT_CR /*13*/:
                return "FBLITE_COLD_STARTUP_WAIT_FOR_HANDSHAKE";
            case 14:
                return "FBLITE_COLD_STARTUP_VERIFY_SSL";
            case 15:
                return "FBLITE_COLD_STARTUP_TRIGGER_EARLY_CONNECTION";
            case 16:
                return "FBLITE_COLD_STARTUP_TRY_GET_EARLY_CONNECTION";
            case 17:
                return "FBLITE_COLD_STARTUP_TRIGGER_START_CLIENT_SESSION";
            case Process.SIGCONT /*18*/:
                return "FBLITE_COLD_STARTUP_START_CLIENT_SESSION";
            case Process.SIGSTOP /*19*/:
                return "FBLITE_COLD_STARTUP_TRIGGER_CONNECTING_RUNNABLE";
            case Process.SIGTSTP /*20*/:
                return "FBLITE_COLD_STARTUP_CONNECTING_RUNNABLE";
            case 21:
                return "FBLITE_COLD_STARTUP_START_SEND_AND_RECEIVE_THREADS";
            case 22:
                return "FBLITE_COLD_STARTUP_SEND_LOGIN_MESSAGE";
            case 23:
                return "FBLITE_COLD_STARTUP_CREATE_LOGIN_MESSAGE";
            case 24:
                return "FBLITE_COLD_STARTUP_ASYNC_PREPARE_LOGIN_PROPERTIES";
            case 25:
                return "FBLITE_COLD_STARTUP_WAIT_ASYNC_LOGIN_PROPERTIES";
            case 26:
                return "FBLITE_COLD_STARTUP_APPCONTROLLER_ONCREATE";
            case 27:
                return "FBLITE_COLD_STARTUP_ACTIVITY_DELEGATE_ONCREATE";
            case 28:
                return "FBLITE_COLD_STARTUP_CREATE_CLIENTSESSION";
            case 29:
                return "FBLITE_COLD_STARTUP_INITIALIZE_SESSION_OBJECTS";
            case 30:
                return "FBLITE_COLD_STARTUP_INIT_LAYOUT";
            case 31:
                return "FBLITE_COLD_STARTUP_SESSION_TO_FIRST_SCREEN";
            case 32:
                return "FBLITE_COLD_STARTUP_PERFORM_LAYOUT_FIRST_SCREEN";
            case 33:
                return "FBLITE_COLD_STARTUP_RECEIVE_SCREEN_PARTS";
            case ParserMinimalBase.INT_QUOTE /*34*/:
                return "FBLITE_COLD_STARTUP_WAIT_ASYNC_FONTS";
            case 37:
                return "FBLITE_COLD_STARTUP_QPL_LOAD_BACKGROOUND_TABLE_CACHE";
            case 38:
                return "FBLITE_COLD_STARTUP_QPL_STORE_BACKGROOUND_TABLE_CACHE";
            case ParserMinimalBase.INT_APOSTROPHE /*39*/:
                return "FBLITE_COLD_STARTUP_QPL_STORE_RECTANGULAR_BACKGROUND";
            case 40:
                return "FBLITE_COLD_STARTUP_QPL_LOAD_RECTANGULAR_BACKGROUND";
            case 41:
                return "FBLITE_COLD_STARTUP_FONT_SCHEDULING_DELAY2";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
