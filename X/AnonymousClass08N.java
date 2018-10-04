package X;

import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.08N */
public final class AnonymousClass08N {
    /* renamed from: B */
    public static final AnonymousClass08A m505B(AnonymousClass082 anonymousClass082, Object obj, Object obj2) {
        switch (AnonymousClass08M.f893B[anonymousClass082.f793C.ordinal()]) {
            case 1:
                return new AnonymousClass0Au(anonymousClass082, (AnonymousClass081) obj, (AnonymousClass07z) obj2);
            case 2:
                return new AnonymousClass0At(anonymousClass082, (AnonymousClass07y) obj, (AnonymousClass07x) obj2);
            case 3:
                return new AnonymousClass0Ay(anonymousClass082, (AnonymousClass084) obj, (AnonymousClass08E) obj2);
            case 4:
                return new AnonymousClass0Ax(anonymousClass082, (AnonymousClass084) obj, (AnonymousClass08D) obj2);
            case 5:
                return new AnonymousClass0B0(anonymousClass082, (AnonymousClass084) obj, (AnonymousClass08G) obj2);
            case 6:
                return new AnonymousClass0Aw(anonymousClass082, (AnonymousClass08C) obj, (byte[]) obj2);
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
            case 8:
            case 9:
                return new AnonymousClass08A(anonymousClass082, null, null);
            case 10:
                return new AnonymousClass0Av(anonymousClass082, (AnonymousClass084) obj);
            case 11:
                return new AnonymousClass0Az(anonymousClass082, (AnonymousClass084) obj);
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown message type: ");
                stringBuilder.append(anonymousClass082.f793C.toString());
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
