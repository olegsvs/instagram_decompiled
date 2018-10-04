package org.webrtc;

import org.webrtc.MediaStreamTrack.MediaType;

public class RtpReceiver {
    private MediaStreamTrack cachedTrack;
    private long nativeObserver;
    public final long nativeRtpReceiver;

    public interface Observer {
        void onFirstPacketReceived(MediaType mediaType);
    }

    private static native String nativeGetId(long j);

    private static native RtpParameters nativeGetParameters(long j);

    private static native long nativeGetTrack(long j);

    private static native long nativeSetObserver(long j, Observer observer);

    private static native boolean nativeSetParameters(long j, RtpParameters rtpParameters);

    private static native void nativeUnsetObserver(long j, long j2);

    public RtpReceiver(long j) {
        this.nativeRtpReceiver = j;
        this.cachedTrack = MediaStreamTrack.createMediaStreamTrack(nativeGetTrack(j));
    }

    public void SetObserver(Observer observer) {
        long j = this.nativeObserver;
        if (j != 0) {
            nativeUnsetObserver(this.nativeRtpReceiver, j);
        }
        this.nativeObserver = nativeSetObserver(this.nativeRtpReceiver, observer);
    }

    public void dispose() {
        this.cachedTrack.dispose();
        long j = this.nativeObserver;
        if (j != 0) {
            nativeUnsetObserver(this.nativeRtpReceiver, j);
            this.nativeObserver = 0;
        }
        JniCommon.nativeReleaseRef(this.nativeRtpReceiver);
    }

    public RtpParameters getParameters() {
        return nativeGetParameters(this.nativeRtpReceiver);
    }

    public String id() {
        return nativeGetId(this.nativeRtpReceiver);
    }

    public boolean setParameters(RtpParameters rtpParameters) {
        return rtpParameters == null ? false : nativeSetParameters(this.nativeRtpReceiver, rtpParameters);
    }

    public MediaStreamTrack track() {
        return this.cachedTrack;
    }
}
