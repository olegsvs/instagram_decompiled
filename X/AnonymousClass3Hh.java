package X;

import android.content.Context;
import com.facebook.C0164R;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.3Hh */
public final class AnonymousClass3Hh {
    /* renamed from: B */
    public static AnonymousClass3Hg m19266B(int i) {
        return AnonymousClass3Hg.values()[i];
    }

    /* renamed from: C */
    public static int m19267C(Context context, AnonymousClass3Hg anonymousClass3Hg, boolean z) {
        int i;
        switch (anonymousClass3Hg.ordinal()) {
            case 0:
                return AnonymousClass0G5.D(context, C0164R.attr.tintPickerNoneColor);
            case 1:
                if (!z) {
                    i = -1645705;
                    break;
                }
                i = -3685842;
                break;
            case 2:
                if (!z) {
                    i = -1655945;
                    break;
                }
                i = -3699922;
                break;
            case 3:
                if (!z) {
                    i = -1673353;
                    break;
                }
                i = -3723730;
                break;
            case 4:
                if (!z) {
                    i = -1405768;
                    break;
                }
                i = -3915394;
                break;
            case 5:
                if (!z) {
                    i = -4818970;
                    break;
                }
                i = -8048953;
                break;
            case 6:
                if (!z) {
                    i = -8944922;
                    break;
                }
                i = -13747001;
                break;
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                if (!z) {
                    i = -8924442;
                    break;
                }
                i = -13718585;
                break;
            case 8:
                if (!z) {
                    i = -8919423;
                    break;
                }
                i = -13711556;
                break;
            default:
                return -1;
        }
        return i;
    }
}
