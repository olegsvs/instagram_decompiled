package org.webrtc;

public class MediaStreamTrack {
    public static final String AUDIO_TRACK_KIND = "audio";
    public static final String VIDEO_TRACK_KIND = "video";
    public final long nativeTrack;

    public enum MediaType {
        MEDIA_TYPE_AUDIO(0),
        MEDIA_TYPE_VIDEO(1);
        
        private final int nativeIndex;

        private MediaType(int i) {
            this.nativeIndex = i;
        }

        public static MediaType fromNativeIndex(int i) {
            for (MediaType mediaType : values()) {
                if (mediaType.getNative() == i) {
                    return mediaType;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown native media type: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public int getNative() {
            return this.nativeIndex;
        }
    }

    public enum State {
        LIVE,
        ENDED;

        public static State fromNativeIndex(int i) {
            return values()[i];
        }
    }

    private static native boolean nativeGetEnabled(long j);

    private static native String nativeGetId(long j);

    private static native String nativeGetKind(long j);

    private static native State nativeGetState(long j);

    private static native boolean nativeSetEnabled(long j, boolean z);

    public MediaStreamTrack(long j) {
        this.nativeTrack = j;
    }

    public static MediaStreamTrack createMediaStreamTrack(long j) {
        if (j != 0) {
            String nativeGetKind = nativeGetKind(j);
            if (nativeGetKind.equals(AUDIO_TRACK_KIND)) {
                return new AudioTrack(j);
            }
            if (nativeGetKind.equals(VIDEO_TRACK_KIND)) {
                return new VideoTrack(j);
            }
        }
        return null;
    }

    public void dispose() {
        JniCommon.nativeReleaseRef(this.nativeTrack);
    }

    public boolean enabled() {
        return nativeGetEnabled(this.nativeTrack);
    }

    public String id() {
        return nativeGetId(this.nativeTrack);
    }

    public String kind() {
        return nativeGetKind(this.nativeTrack);
    }

    public boolean setEnabled(boolean z) {
        return nativeSetEnabled(this.nativeTrack, z);
    }

    public State state() {
        return nativeGetState(this.nativeTrack);
    }
}
