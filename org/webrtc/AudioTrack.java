package org.webrtc;

public class AudioTrack extends MediaStreamTrack {
    private static native void nativeSetVolume(long j, double d);

    public AudioTrack(long j) {
        super(j);
    }

    public void setVolume(double d) {
        nativeSetVolume(this.nativeTrack, d);
    }
}
