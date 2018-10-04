package org.webrtc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.webrtc.MediaStreamTrack.MediaType;

public class RtpTransceiver {
    private RtpReceiver cachedReceiver;
    private RtpSender cachedSender;
    private final long nativeRtpTransceiver;

    public enum RtpTransceiverDirection {
        SEND_RECV(0),
        SEND_ONLY(1),
        RECV_ONLY(2),
        INACTIVE(3);
        
        private final int nativeIndex;

        private RtpTransceiverDirection(int i) {
            this.nativeIndex = i;
        }

        public static RtpTransceiverDirection fromNativeIndex(int i) {
            for (RtpTransceiverDirection rtpTransceiverDirection : values()) {
                if (rtpTransceiverDirection.getNativeIndex() == i) {
                    return rtpTransceiverDirection;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Uknown native RtpTransceiverDirection type");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public int getNativeIndex() {
            return this.nativeIndex;
        }
    }

    public final class RtpTransceiverInit {
        private final RtpTransceiverDirection direction;
        private final List streamIds;

        public RtpTransceiverInit() {
            this(RtpTransceiverDirection.SEND_RECV);
        }

        public RtpTransceiverInit(RtpTransceiverDirection rtpTransceiverDirection) {
            this(rtpTransceiverDirection, Collections.emptyList());
        }

        public RtpTransceiverInit(RtpTransceiverDirection rtpTransceiverDirection, List list) {
            this.direction = rtpTransceiverDirection;
            this.streamIds = new ArrayList(list);
        }

        public int getDirectionNativeIndex() {
            return this.direction.getNativeIndex();
        }

        public List getStreamIds() {
            return new ArrayList(this.streamIds);
        }
    }

    private static native RtpTransceiverDirection nativeCurrentDirection(long j);

    private static native RtpTransceiverDirection nativeDirection(long j);

    private static native MediaType nativeGetMediaType(long j);

    private static native String nativeGetMid(long j);

    private static native RtpReceiver nativeGetReceiver(long j);

    private static native RtpSender nativeGetSender(long j);

    private static native void nativeSetDirection(long j, RtpTransceiverDirection rtpTransceiverDirection);

    private static native void nativeStop(long j);

    private static native boolean nativeStopped(long j);

    public RtpTransceiver(long j) {
        this.nativeRtpTransceiver = j;
        this.cachedSender = nativeGetSender(j);
        this.cachedReceiver = nativeGetReceiver(j);
    }

    public void dispose() {
        this.cachedSender.dispose();
        this.cachedReceiver.dispose();
        JniCommon.nativeReleaseRef(this.nativeRtpTransceiver);
    }

    public RtpTransceiverDirection getCurrentDirection() {
        return nativeCurrentDirection(this.nativeRtpTransceiver);
    }

    public RtpTransceiverDirection getDirection() {
        return nativeDirection(this.nativeRtpTransceiver);
    }

    public MediaType getMediaType() {
        return nativeGetMediaType(this.nativeRtpTransceiver);
    }

    public String getMid() {
        return nativeGetMid(this.nativeRtpTransceiver);
    }

    public RtpReceiver getReceiver() {
        return this.cachedReceiver;
    }

    public RtpSender getSender() {
        return this.cachedSender;
    }

    public boolean isStopped() {
        return nativeStopped(this.nativeRtpTransceiver);
    }

    public void setDirection(RtpTransceiverDirection rtpTransceiverDirection) {
        nativeSetDirection(this.nativeRtpTransceiver, rtpTransceiverDirection);
    }

    public void stop() {
        nativeStop(this.nativeRtpTransceiver);
    }
}
