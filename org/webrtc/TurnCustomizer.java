package org.webrtc;

public class TurnCustomizer {
    public final long nativeTurnCustomizer;

    private static native void nativeFreeTurnCustomizer(long j);

    public TurnCustomizer(long j) {
        this.nativeTurnCustomizer = j;
    }

    public void dispose() {
        nativeFreeTurnCustomizer(this.nativeTurnCustomizer);
    }

    public long getNativeTurnCustomizer() {
        return this.nativeTurnCustomizer;
    }
}
