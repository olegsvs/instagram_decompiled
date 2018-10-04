package org.webrtc;

public class MediaSource {
    public final long nativeSource;

    public enum State {
        INITIALIZING,
        LIVE,
        ENDED,
        MUTED;

        public static State fromNativeIndex(int i) {
            return values()[i];
        }
    }

    private static native State nativeGetState(long j);

    public MediaSource(long j) {
        this.nativeSource = j;
    }

    public void dispose() {
        JniCommon.nativeReleaseRef(this.nativeSource);
    }

    public State state() {
        return nativeGetState(this.nativeSource);
    }
}
