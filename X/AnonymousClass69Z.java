package X;

import org.webrtc.MediaStreamTrack;

/* renamed from: X.69Z */
public enum AnonymousClass69Z {
    CALL_QUALITY("call_quality"),
    AUDIO(MediaStreamTrack.AUDIO_TRACK_KIND),
    VIDEO(MediaStreamTrack.VIDEO_TRACK_KIND);
    
    /* renamed from: B */
    private final String f72375B;

    private AnonymousClass69Z(String str) {
        this.f72375B = str;
    }

    /* renamed from: A */
    public final String m29233A() {
        return this.f72375B;
    }
}
