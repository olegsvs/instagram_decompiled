package com.facebook.video.common.rtmpstreamer;

import X.AnonymousClass0CF;
import com.facebook.jni.HybridClassBase;

public final class AndroidLiveStreamingConfig extends HybridClassBase {

    public class Builder extends HybridClassBase {
        private native void initHybrid();

        public native AndroidLiveStreamingConfig build();

        public native Builder setAbrStatisticsWindowSize(int i);

        public native Builder setAudioFrameCancellationMode(int i);

        public native Builder setAudioFrameCancellationSenderDelayMs(int i);

        public native Builder setBroadcastId(String str);

        public native Builder setBroadcasterUpdateLogIntervalInSeconds(int i);

        public native Builder setCacheDir(String str);

        public native Builder setConnectTimeoutMs(int i);

        public native Builder setDisableSpeedTest(boolean z);

        public native Builder setEnableAacHe(boolean z);

        public native Builder setEnableClientCounter(boolean z);

        public native Builder setExcludeNotSentBytesFromThroughput(boolean z);

        public native Builder setFblivePublishUrl(String str);

        public native Builder setFbliveQuicPublishUrl(String str);

        public native Builder setFbliveTransportHeaderBase64(String str);

        public native Builder setKbpsAdaptiveDropWeakEnterThreshold(double d);

        public native Builder setKbpsAdaptiveDropWeakRecoverThreshold(double d);

        public native Builder setLiveTraceConfig(boolean z, int i, int i2);

        public native Builder setLowLatencyMode(boolean z);

        public native Builder setMaxBitrateOnWifi(int i);

        public native Builder setMaxBitrateOverride(int i);

        public native Builder setMinBitrateOverride(int i);

        public native Builder setNetworkLagResumeFromWeakThreshold(double d);

        public native Builder setNetworkLagResumeThreshold(double d);

        public native Builder setNetworkLagStopThreshold(double d);

        public native Builder setNetworkLagWeakThreshold(double d);

        public native Builder setQuicCongestionControlType(String str);

        public native Builder setQuicEnabled(boolean z);

        public native Builder setQuicMultiStreamEnabled(boolean z);

        public native Builder setResetQuicStreamOnError(boolean z);

        public native Builder setRtmpPublishHeaderBase64(String str);

        public native Builder setRtmpPublishUrl(String str);

        public native Builder setRunSpeedTestAfterConnect(boolean z);

        public native Builder setSampleInterval(long j);

        public native Builder setSendTimeoutMs(int i);

        public native Builder setShouldLogABRMetrics(boolean z);

        public native Builder setSpeedTestMinimumBandwidthThreshold(double d);

        public native Builder setSpeedTestRetryMaxCount(int i);

        public native Builder setSpeedTestRetryTimeDelay(double d);

        public native Builder setStartingBitrateOverride(int i);

        public native Builder setStreamAudioBitRate(int i);

        public native Builder setStreamAudioChannels(int i);

        public native Builder setStreamAudioSampleRate(int i);

        public native Builder setStreamNetworkConnectionRetryCount(int i);

        public native Builder setStreamNetworkConnectionRetryDelayInSeconds(int i);

        public native Builder setStreamNetworkMeasurementsIntervalInMs(int i);

        public native Builder setStreamNetworkQueueCapacityInBytes(int i);

        public native Builder setStreamNetworkQueuePercentageOfCapacityToDrop(int i);

        public native Builder setStreamNetworkQueueVideoCapacityInSeconds(int i);

        public native Builder setStreamNetworkSendCheckTimeoutMs(int i);

        public native Builder setStreamNetworkShouldProbeRttWithPings(boolean z);

        public native Builder setStreamNetworkSpeedTestPayloadChunkSizeInBytes(int i);

        public native Builder setStreamNetworkSpeedTestPayloadSizeInBytes(int i);

        public native Builder setStreamNetworkSpeedTestPayloadTimeoutInSeconds(int i);

        public native Builder setStreamNetworkUseSslFactory(boolean z);

        public native Builder setStreamThroughputDecayConstant(double d);

        public native Builder setStreamVideoAdaptiveBitrateConfig(String str);

        public native Builder setStreamVideoBitRate(int i);

        public native Builder setStreamVideoFps(int i);

        public native Builder setStreamVideoHeight(int i);

        public native Builder setStreamVideoWidth(int i);

        public native Builder setUse1RTTConnectionSetup(boolean z);

        public native Builder setUseEdgeTeeForTcp(boolean z);

        public native Builder setUseExperimentalAbrAlgorithm(boolean z);

        public native Builder setUseTransportHeader(boolean z);

        public native Builder setVideoFrameCancellationMode(int i);

        public native Builder setVideoFrameCancellationSenderDelayMs(int i);

        public native Builder setVideoProtocolEnabled(boolean z);

        public native Builder setVideoProtocolLatencyMs(int i);

        public native Builder setVideoProtocolQuicClientTracing(boolean z);

        public native Builder setWaitForSpeedTest(boolean z);

        static {
            AnonymousClass0CF.E("android-live-streaming");
        }

        public Builder() {
            initHybrid();
        }
    }

    static {
        AnonymousClass0CF.E("android-live-streaming");
    }

    private AndroidLiveStreamingConfig() {
    }
}
