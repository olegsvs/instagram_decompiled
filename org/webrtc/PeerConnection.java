package org.webrtc;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.webrtc.DataChannel.Init;
import org.webrtc.MediaStreamTrack.MediaType;
import org.webrtc.RtpTransceiver.RtpTransceiverInit;

public class PeerConnection {
    private final List localStreams;
    private final long nativePeerConnection;
    private List receivers;
    private List senders;
    private List transceivers;

    public enum AdapterType {
        UNKNOWN,
        ETHERNET,
        WIFI,
        CELLULAR,
        VPN,
        LOOPBACK
    }

    public enum BundlePolicy {
        BALANCED,
        MAXBUNDLE,
        MAXCOMPAT
    }

    public enum CandidateNetworkPolicy {
        ALL,
        LOW_COST
    }

    public enum ContinualGatheringPolicy {
        GATHER_ONCE,
        GATHER_CONTINUALLY
    }

    public enum IceConnectionState {
        NEW,
        CHECKING,
        CONNECTED,
        COMPLETED,
        FAILED,
        DISCONNECTED,
        CLOSED;

        public static IceConnectionState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public enum IceGatheringState {
        NEW,
        GATHERING,
        COMPLETE;

        public static IceGatheringState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public class IceServer {
        public final String hostname;
        public final String password;
        public final List tlsAlpnProtocols;
        public final TlsCertPolicy tlsCertPolicy;
        public final List tlsEllipticCurves;
        public final String uri;
        public final List urls;
        public final String username;

        public class Builder {
            private String hostname;
            private String password;
            private List tlsAlpnProtocols;
            private TlsCertPolicy tlsCertPolicy;
            private List tlsEllipticCurves;
            private final List urls;
            private String username;

            public Builder(List list) {
                String str = JsonProperty.USE_DEFAULT_NAME;
                this.username = str;
                this.password = str;
                this.tlsCertPolicy = TlsCertPolicy.TLS_CERT_POLICY_SECURE;
                this.hostname = JsonProperty.USE_DEFAULT_NAME;
                if (list == null || list.isEmpty()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("urls == null || urls.isEmpty(): ");
                    stringBuilder.append(list);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                this.urls = list;
            }

            public IceServer createIceServer() {
                return new IceServer((String) this.urls.get(0), this.urls, this.username, this.password, this.tlsCertPolicy, this.hostname, this.tlsAlpnProtocols, this.tlsEllipticCurves);
            }

            public Builder setHostname(String str) {
                this.hostname = str;
                return this;
            }

            public Builder setPassword(String str) {
                this.password = str;
                return this;
            }

            public Builder setTlsAlpnProtocols(List list) {
                this.tlsAlpnProtocols = list;
                return this;
            }

            public Builder setTlsCertPolicy(TlsCertPolicy tlsCertPolicy) {
                this.tlsCertPolicy = tlsCertPolicy;
                return this;
            }

            public Builder setTlsEllipticCurves(List list) {
                this.tlsEllipticCurves = list;
                return this;
            }

            public Builder setUsername(String str) {
                this.username = str;
                return this;
            }
        }

        public IceServer(String str) {
            String str2 = JsonProperty.USE_DEFAULT_NAME;
            this(str, str2, str2);
        }

        public IceServer(String str, String str2, String str3) {
            this(str, str2, str3, TlsCertPolicy.TLS_CERT_POLICY_SECURE);
        }

        public IceServer(String str, String str2, String str3, TlsCertPolicy tlsCertPolicy) {
            this(str, str2, str3, tlsCertPolicy, JsonProperty.USE_DEFAULT_NAME);
        }

        public IceServer(String str, String str2, String str3, TlsCertPolicy tlsCertPolicy, String str4) {
            this(str, Collections.singletonList(str), str2, str3, tlsCertPolicy, str4, null, null);
        }

        public IceServer(String str, List list, String str2, String str3, TlsCertPolicy tlsCertPolicy, String str4, List list2, List list3) {
            if (str == null || list == null || list.isEmpty()) {
                throw new IllegalArgumentException("uri == null || urls == null || urls.isEmpty()");
            }
            for (String str5 : list) {
                if (str5 == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("urls element is null: ");
                    stringBuilder.append(list);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("username == null");
            } else if (str3 == null) {
                throw new IllegalArgumentException("password == null");
            } else if (str4 != null) {
                this.uri = str;
                this.urls = list;
                this.username = str2;
                this.password = str3;
                this.tlsCertPolicy = tlsCertPolicy;
                this.hostname = str4;
                this.tlsAlpnProtocols = list2;
                this.tlsEllipticCurves = list3;
            } else {
                throw new IllegalArgumentException("hostname == null");
            }
        }

        public static Builder builder(String str) {
            return new Builder(Collections.singletonList(str));
        }

        public static Builder builder(List list) {
            return new Builder(list);
        }

        public String getHostname() {
            return this.hostname;
        }

        public String getPassword() {
            return this.password;
        }

        public List getTlsAlpnProtocols() {
            return this.tlsAlpnProtocols;
        }

        public TlsCertPolicy getTlsCertPolicy() {
            return this.tlsCertPolicy;
        }

        public List getTlsEllipticCurves() {
            return this.tlsEllipticCurves;
        }

        public List getUrls() {
            return this.urls;
        }

        public String getUsername() {
            return this.username;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.urls);
            stringBuilder.append(" [");
            stringBuilder.append(this.username);
            stringBuilder.append(":");
            stringBuilder.append(this.password);
            stringBuilder.append("] [");
            stringBuilder.append(this.tlsCertPolicy);
            stringBuilder.append("] [");
            stringBuilder.append(this.hostname);
            stringBuilder.append("] [");
            stringBuilder.append(this.tlsAlpnProtocols);
            stringBuilder.append("] [");
            stringBuilder.append(this.tlsEllipticCurves);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    public enum IceTransportsType {
        NONE,
        RELAY,
        NOHOST,
        ALL
    }

    public class IntervalRange {
        private final int max;
        private final int min;

        public IntervalRange(int i, int i2) {
            this.min = i;
            this.max = i2;
        }

        public int getMax() {
            return this.max;
        }

        public int getMin() {
            return this.min;
        }
    }

    public enum KeyType {
        RSA,
        ECDSA
    }

    public interface Observer {

        public final /* synthetic */ class -CC {
            public static void $default$onTrack(Observer observer, RtpTransceiver rtpTransceiver) {
            }
        }

        void onAddStream(MediaStream mediaStream);

        void onAddTrack(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr);

        void onDataChannel(DataChannel dataChannel);

        void onIceCandidate(IceCandidate iceCandidate);

        void onIceCandidatesRemoved(IceCandidate[] iceCandidateArr);

        void onIceConnectionChange(IceConnectionState iceConnectionState);

        void onIceConnectionReceivingChange(boolean z);

        void onIceGatheringChange(IceGatheringState iceGatheringState);

        void onRemoveStream(MediaStream mediaStream);

        void onRenegotiationNeeded();

        void onSignalingChange(SignalingState signalingState);

        void onTrack(RtpTransceiver rtpTransceiver);
    }

    public class RTCConfiguration {
        public boolean audioJitterBufferFastAccelerate;
        public int audioJitterBufferMaxPackets;
        public BundlePolicy bundlePolicy = BundlePolicy.BALANCED;
        public CandidateNetworkPolicy candidateNetworkPolicy = CandidateNetworkPolicy.ALL;
        public Boolean combinedAudioVideoBwe;
        public ContinualGatheringPolicy continualGatheringPolicy;
        public boolean disableIPv6OnWifi;
        public boolean disableIpv6;
        public boolean enableCpuOveruseDetection;
        public boolean enableDscp;
        public Boolean enableDtlsSrtp;
        public boolean enableRtpDataChannel;
        public int iceBackupCandidatePairPingInterval;
        public int iceCandidatePoolSize;
        public Integer iceCheckIntervalStrongConnectivityMs;
        public Integer iceCheckIntervalWeakConnectivityMs;
        public Integer iceCheckMinInterval;
        public int iceConnectionReceivingTimeout;
        public IntervalRange iceRegatherIntervalRange;
        public List iceServers;
        public IceTransportsType iceTransportsType = IceTransportsType.ALL;
        public Integer iceUnwritableMinChecks;
        public Integer iceUnwritableTimeMs;
        public KeyType keyType;
        public int maxIPv6Networks;
        public AdapterType networkPreference;
        public boolean presumeWritableWhenFullyRelayed;
        public boolean pruneTurnPorts;
        public RtcpMuxPolicy rtcpMuxPolicy = RtcpMuxPolicy.REQUIRE;
        public Integer screencastMinBitrate;
        public SdpSemantics sdpSemantics;
        public Integer stunCandidateKeepaliveIntervalMs;
        public boolean suspendBelowMinBitrate;
        public TcpCandidatePolicy tcpCandidatePolicy = TcpCandidatePolicy.ENABLED;
        public TurnCustomizer turnCustomizer;

        public RTCConfiguration(List list) {
            this.iceServers = list;
            this.audioJitterBufferMaxPackets = 50;
            this.audioJitterBufferFastAccelerate = false;
            this.iceConnectionReceivingTimeout = -1;
            this.iceBackupCandidatePairPingInterval = -1;
            this.keyType = KeyType.ECDSA;
            this.continualGatheringPolicy = ContinualGatheringPolicy.GATHER_ONCE;
            this.iceCandidatePoolSize = 0;
            this.pruneTurnPorts = false;
            this.presumeWritableWhenFullyRelayed = false;
            this.iceCheckIntervalStrongConnectivityMs = null;
            this.iceCheckIntervalWeakConnectivityMs = null;
            this.iceCheckMinInterval = null;
            this.iceUnwritableTimeMs = null;
            this.iceUnwritableMinChecks = null;
            this.stunCandidateKeepaliveIntervalMs = null;
            this.disableIPv6OnWifi = false;
            this.maxIPv6Networks = 5;
            this.iceRegatherIntervalRange = null;
            this.disableIpv6 = false;
            this.enableDscp = false;
            this.enableCpuOveruseDetection = true;
            this.enableRtpDataChannel = false;
            this.suspendBelowMinBitrate = false;
            this.screencastMinBitrate = null;
            this.combinedAudioVideoBwe = null;
            this.enableDtlsSrtp = null;
            this.networkPreference = AdapterType.UNKNOWN;
            this.sdpSemantics = SdpSemantics.PLAN_B;
        }

        public boolean getAudioJitterBufferFastAccelerate() {
            return this.audioJitterBufferFastAccelerate;
        }

        public int getAudioJitterBufferMaxPackets() {
            return this.audioJitterBufferMaxPackets;
        }

        public BundlePolicy getBundlePolicy() {
            return this.bundlePolicy;
        }

        public CandidateNetworkPolicy getCandidateNetworkPolicy() {
            return this.candidateNetworkPolicy;
        }

        public Boolean getCombinedAudioVideoBwe() {
            return this.combinedAudioVideoBwe;
        }

        public ContinualGatheringPolicy getContinualGatheringPolicy() {
            return this.continualGatheringPolicy;
        }

        public boolean getDisableIPv6OnWifi() {
            return this.disableIPv6OnWifi;
        }

        public boolean getDisableIpv6() {
            return this.disableIpv6;
        }

        public boolean getEnableCpuOveruseDetection() {
            return this.enableCpuOveruseDetection;
        }

        public boolean getEnableDscp() {
            return this.enableDscp;
        }

        public Boolean getEnableDtlsSrtp() {
            return this.enableDtlsSrtp;
        }

        public boolean getEnableRtpDataChannel() {
            return this.enableRtpDataChannel;
        }

        public int getIceBackupCandidatePairPingInterval() {
            return this.iceBackupCandidatePairPingInterval;
        }

        public int getIceCandidatePoolSize() {
            return this.iceCandidatePoolSize;
        }

        public Integer getIceCheckIntervalStrongConnectivity() {
            return this.iceCheckIntervalStrongConnectivityMs;
        }

        public Integer getIceCheckIntervalWeakConnectivity() {
            return this.iceCheckIntervalWeakConnectivityMs;
        }

        public Integer getIceCheckMinInterval() {
            return this.iceCheckMinInterval;
        }

        public int getIceConnectionReceivingTimeout() {
            return this.iceConnectionReceivingTimeout;
        }

        public IntervalRange getIceRegatherIntervalRange() {
            return this.iceRegatherIntervalRange;
        }

        public List getIceServers() {
            return this.iceServers;
        }

        public IceTransportsType getIceTransportsType() {
            return this.iceTransportsType;
        }

        public Integer getIceUnwritableMinChecks() {
            return this.iceUnwritableMinChecks;
        }

        public Integer getIceUnwritableTimeout() {
            return this.iceUnwritableTimeMs;
        }

        public KeyType getKeyType() {
            return this.keyType;
        }

        public int getMaxIPv6Networks() {
            return this.maxIPv6Networks;
        }

        public AdapterType getNetworkPreference() {
            return this.networkPreference;
        }

        public boolean getPresumeWritableWhenFullyRelayed() {
            return this.presumeWritableWhenFullyRelayed;
        }

        public boolean getPruneTurnPorts() {
            return this.pruneTurnPorts;
        }

        public RtcpMuxPolicy getRtcpMuxPolicy() {
            return this.rtcpMuxPolicy;
        }

        public Integer getScreencastMinBitrate() {
            return this.screencastMinBitrate;
        }

        public SdpSemantics getSdpSemantics() {
            return this.sdpSemantics;
        }

        public Integer getStunCandidateKeepaliveInterval() {
            return this.stunCandidateKeepaliveIntervalMs;
        }

        public boolean getSuspendBelowMinBitrate() {
            return this.suspendBelowMinBitrate;
        }

        public TcpCandidatePolicy getTcpCandidatePolicy() {
            return this.tcpCandidatePolicy;
        }

        public TurnCustomizer getTurnCustomizer() {
            return this.turnCustomizer;
        }
    }

    public enum RtcpMuxPolicy {
        NEGOTIATE,
        REQUIRE
    }

    public enum SdpSemantics {
        PLAN_B,
        UNIFIED_PLAN
    }

    public enum SignalingState {
        STABLE,
        HAVE_LOCAL_OFFER,
        HAVE_LOCAL_PRANSWER,
        HAVE_REMOTE_OFFER,
        HAVE_REMOTE_PRANSWER,
        CLOSED;

        public static SignalingState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public enum TcpCandidatePolicy {
        ENABLED,
        DISABLED
    }

    public enum TlsCertPolicy {
        TLS_CERT_POLICY_SECURE,
        TLS_CERT_POLICY_INSECURE_NO_CHECK
    }

    private native boolean nativeAddIceCandidate(String str, int i, String str2);

    private native boolean nativeAddLocalStream(long j);

    private native RtpSender nativeAddTrack(long j, List list);

    private native RtpTransceiver nativeAddTransceiverOfType(MediaType mediaType, RtpTransceiverInit rtpTransceiverInit);

    private native RtpTransceiver nativeAddTransceiverWithTrack(long j, RtpTransceiverInit rtpTransceiverInit);

    private native void nativeClose();

    private native void nativeCreateAnswer(SdpObserver sdpObserver, MediaConstraints mediaConstraints);

    private native DataChannel nativeCreateDataChannel(String str, Init init);

    private native void nativeCreateOffer(SdpObserver sdpObserver, MediaConstraints mediaConstraints);

    private static native long nativeCreatePeerConnectionObserver(Observer observer);

    private native RtpSender nativeCreateSender(String str, String str2);

    private static native void nativeFreeOwnedPeerConnection(long j);

    private native SessionDescription nativeGetLocalDescription();

    private native long nativeGetNativePeerConnection();

    private native List nativeGetReceivers();

    private native SessionDescription nativeGetRemoteDescription();

    private native List nativeGetSenders();

    private native List nativeGetTransceivers();

    private native IceConnectionState nativeIceConnectionState();

    private native IceGatheringState nativeIceGatheringState();

    private native void nativeNewGetStats(RTCStatsCollectorCallback rTCStatsCollectorCallback);

    private native boolean nativeOldGetStats(StatsObserver statsObserver, long j);

    private native boolean nativeRemoveIceCandidates(IceCandidate[] iceCandidateArr);

    private native void nativeRemoveLocalStream(long j);

    private native boolean nativeRemoveTrack(long j);

    private native void nativeSetAudioPlayout(boolean z);

    private native void nativeSetAudioRecording(boolean z);

    private native boolean nativeSetBitrate(Integer num, Integer num2, Integer num3);

    private native boolean nativeSetConfiguration(RTCConfiguration rTCConfiguration);

    private native void nativeSetLocalDescription(SdpObserver sdpObserver, SessionDescription sessionDescription);

    private native void nativeSetRemoteDescription(SdpObserver sdpObserver, SessionDescription sessionDescription);

    private native SignalingState nativeSignalingState();

    private native boolean nativeStartRtcEventLog(int i, int i2);

    private native void nativeStopRtcEventLog();

    public PeerConnection(long j) {
        this.localStreams = new ArrayList();
        this.senders = new ArrayList();
        this.receivers = new ArrayList();
        this.transceivers = new ArrayList();
        this.nativePeerConnection = j;
    }

    public PeerConnection(NativePeerConnectionFactory nativePeerConnectionFactory) {
        this(nativePeerConnectionFactory.createNativePeerConnection());
    }

    public boolean addIceCandidate(IceCandidate iceCandidate) {
        return nativeAddIceCandidate(iceCandidate.sdpMid, iceCandidate.sdpMLineIndex, iceCandidate.sdp);
    }

    public boolean addStream(MediaStream mediaStream) {
        if (!nativeAddLocalStream(mediaStream.nativeStream)) {
            return false;
        }
        this.localStreams.add(mediaStream);
        return true;
    }

    public RtpSender addTrack(MediaStreamTrack mediaStreamTrack) {
        return addTrack(mediaStreamTrack, Collections.emptyList());
    }

    public RtpSender addTrack(MediaStreamTrack mediaStreamTrack, List list) {
        if (mediaStreamTrack == null || list == null) {
            throw new NullPointerException("No MediaStreamTrack specified in addTrack.");
        }
        RtpSender nativeAddTrack = nativeAddTrack(mediaStreamTrack.nativeTrack, list);
        if (nativeAddTrack != null) {
            this.senders.add(nativeAddTrack);
            return nativeAddTrack;
        }
        throw new IllegalStateException("C++ addTrack failed.");
    }

    public RtpTransceiver addTransceiver(MediaType mediaType) {
        return addTransceiver(mediaType, new RtpTransceiverInit());
    }

    public RtpTransceiver addTransceiver(MediaType mediaType, RtpTransceiverInit rtpTransceiverInit) {
        if (mediaType != null) {
            if (rtpTransceiverInit == null) {
                rtpTransceiverInit = new RtpTransceiverInit();
            }
            mediaType = nativeAddTransceiverOfType(mediaType, rtpTransceiverInit);
            if (mediaType != null) {
                this.transceivers.add(mediaType);
                return mediaType;
            }
            throw new IllegalStateException("C++ addTransceiver failed.");
        }
        throw new NullPointerException("No MediaType specified for addTransceiver.");
    }

    public RtpTransceiver addTransceiver(MediaStreamTrack mediaStreamTrack) {
        return addTransceiver(mediaStreamTrack, new RtpTransceiverInit());
    }

    public RtpTransceiver addTransceiver(MediaStreamTrack mediaStreamTrack, RtpTransceiverInit rtpTransceiverInit) {
        if (mediaStreamTrack != null) {
            if (rtpTransceiverInit == null) {
                rtpTransceiverInit = new RtpTransceiverInit();
            }
            RtpTransceiver nativeAddTransceiverWithTrack = nativeAddTransceiverWithTrack(mediaStreamTrack.nativeTrack, rtpTransceiverInit);
            if (nativeAddTransceiverWithTrack != null) {
                this.transceivers.add(nativeAddTransceiverWithTrack);
                return nativeAddTransceiverWithTrack;
            }
            throw new IllegalStateException("C++ addTransceiver failed.");
        }
        throw new NullPointerException("No MediaStreamTrack specified for addTransceiver.");
    }

    public void close() {
        nativeClose();
    }

    public void createAnswer(SdpObserver sdpObserver, MediaConstraints mediaConstraints) {
        nativeCreateAnswer(sdpObserver, mediaConstraints);
    }

    public DataChannel createDataChannel(String str, Init init) {
        return nativeCreateDataChannel(str, init);
    }

    public static long createNativePeerConnectionObserver(Observer observer) {
        return nativeCreatePeerConnectionObserver(observer);
    }

    public void createOffer(SdpObserver sdpObserver, MediaConstraints mediaConstraints) {
        nativeCreateOffer(sdpObserver, mediaConstraints);
    }

    public RtpSender createSender(String str, String str2) {
        str = nativeCreateSender(str, str2);
        if (str != null) {
            this.senders.add(str);
        }
        return str;
    }

    public void dispose() {
        close();
        for (MediaStream mediaStream : this.localStreams) {
            nativeRemoveLocalStream(mediaStream.nativeStream);
            mediaStream.dispose();
        }
        this.localStreams.clear();
        for (RtpSender dispose : this.senders) {
            dispose.dispose();
        }
        this.senders.clear();
        for (RtpReceiver dispose2 : this.receivers) {
            dispose2.dispose();
        }
        for (RtpTransceiver dispose3 : this.transceivers) {
            dispose3.dispose();
        }
        this.transceivers.clear();
        this.receivers.clear();
        nativeFreeOwnedPeerConnection(this.nativePeerConnection);
    }

    public SessionDescription getLocalDescription() {
        return nativeGetLocalDescription();
    }

    public long getNativeOwnedPeerConnection() {
        return this.nativePeerConnection;
    }

    public long getNativePeerConnection() {
        return nativeGetNativePeerConnection();
    }

    public List getReceivers() {
        for (RtpReceiver dispose : this.receivers) {
            dispose.dispose();
        }
        List nativeGetReceivers = nativeGetReceivers();
        this.receivers = nativeGetReceivers;
        return Collections.unmodifiableList(nativeGetReceivers);
    }

    public SessionDescription getRemoteDescription() {
        return nativeGetRemoteDescription();
    }

    public List getSenders() {
        for (RtpSender dispose : this.senders) {
            dispose.dispose();
        }
        List nativeGetSenders = nativeGetSenders();
        this.senders = nativeGetSenders;
        return Collections.unmodifiableList(nativeGetSenders);
    }

    public void getStats(RTCStatsCollectorCallback rTCStatsCollectorCallback) {
        nativeNewGetStats(rTCStatsCollectorCallback);
    }

    public boolean getStats(StatsObserver statsObserver, MediaStreamTrack mediaStreamTrack) {
        return nativeOldGetStats(statsObserver, mediaStreamTrack == null ? 0 : mediaStreamTrack.nativeTrack);
    }

    public List getTransceivers() {
        for (RtpTransceiver dispose : this.transceivers) {
            dispose.dispose();
        }
        List nativeGetTransceivers = nativeGetTransceivers();
        this.transceivers = nativeGetTransceivers;
        return Collections.unmodifiableList(nativeGetTransceivers);
    }

    public IceConnectionState iceConnectionState() {
        return nativeIceConnectionState();
    }

    public IceGatheringState iceGatheringState() {
        return nativeIceGatheringState();
    }

    public boolean removeIceCandidates(IceCandidate[] iceCandidateArr) {
        return nativeRemoveIceCandidates(iceCandidateArr);
    }

    public void removeStream(MediaStream mediaStream) {
        nativeRemoveLocalStream(mediaStream.nativeStream);
        this.localStreams.remove(mediaStream);
    }

    public boolean removeTrack(RtpSender rtpSender) {
        if (rtpSender != null) {
            return nativeRemoveTrack(rtpSender.nativeRtpSender);
        }
        throw new NullPointerException("No RtpSender specified for removeTrack.");
    }

    public void setAudioPlayout(boolean z) {
        nativeSetAudioPlayout(z);
    }

    public void setAudioRecording(boolean z) {
        nativeSetAudioRecording(z);
    }

    public boolean setBitrate(Integer num, Integer num2, Integer num3) {
        return nativeSetBitrate(num, num2, num3);
    }

    public boolean setConfiguration(RTCConfiguration rTCConfiguration) {
        return nativeSetConfiguration(rTCConfiguration);
    }

    public void setLocalDescription(SdpObserver sdpObserver, SessionDescription sessionDescription) {
        nativeSetLocalDescription(sdpObserver, sessionDescription);
    }

    public void setRemoteDescription(SdpObserver sdpObserver, SessionDescription sessionDescription) {
        nativeSetRemoteDescription(sdpObserver, sessionDescription);
    }

    public SignalingState signalingState() {
        return nativeSignalingState();
    }

    public boolean startRtcEventLog(int i, int i2) {
        return nativeStartRtcEventLog(i, i2);
    }

    public void stopRtcEventLog() {
        nativeStopRtcEventLog();
    }
}
