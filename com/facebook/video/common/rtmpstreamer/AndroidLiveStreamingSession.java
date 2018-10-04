package com.facebook.video.common.rtmpstreamer;

import X.AnonymousClass0CF;
import com.facebook.jni.HybridData;
import com.facebook.xanalytics.XAnalyticsHolder;
import java.nio.ByteBuffer;
import java.util.Map;

public class AndroidLiveStreamingSession {
    private AndroidRTMPSessionCallbacks mCallbacks;
    private final AndroidLiveStreamingConfig mConfig;
    private HybridData mHybridData;
    private final AndroidRtmpSSLFactoryHolder mRtmpSSLFactoryHolder;
    private final XAnalyticsHolder mXAnalyticsNative;

    private native HybridData initHybrid(AndroidLiveStreamingConfig androidLiveStreamingConfig, AndroidRTMPSessionCallbacks androidRTMPSessionCallbacks, XAnalyticsHolder xAnalyticsHolder, AndroidRtmpSSLFactoryHolder androidRtmpSSLFactoryHolder);

    public native void close();

    public native void closeWithoutEOS();

    public native int computeNewBitrate(int i, Map map);

    public native void destroyNative();

    public native void dropAudioAndVideoQueue();

    public native int getABRComputeInterval();

    public native double getAudioQueueDurationInSeconds();

    public native int getCurrentNetworkState(boolean z);

    public native int getCurrentThroughputInKbps();

    public native int getIFrameQP();

    public native String getStats(boolean z);

    public native double getVideoQueueDurationInSeconds();

    public native boolean hasNetworkRecoveredFromWeak();

    public native boolean isNetworkWeak();

    public native void sendAudioData(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5);

    public native void sendStreamInterrupted();

    public native void sendVideoData(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5);

    static {
        AnonymousClass0CF.E("android-live-streaming");
    }

    public AndroidLiveStreamingSession(AndroidLiveStreamingConfig androidLiveStreamingConfig, XAnalyticsHolder xAnalyticsHolder, AndroidRtmpSSLFactoryHolder androidRtmpSSLFactoryHolder) {
        this.mConfig = androidLiveStreamingConfig;
        this.mXAnalyticsNative = xAnalyticsHolder;
        this.mRtmpSSLFactoryHolder = androidRtmpSSLFactoryHolder;
    }

    public final void flushAllLogs() {
        this.mXAnalyticsNative.flush();
    }

    public final void init(AndroidRTMPSessionCallbacks androidRTMPSessionCallbacks) {
        this.mCallbacks = androidRTMPSessionCallbacks;
        this.mHybridData = initHybrid(this.mConfig, this.mCallbacks, this.mXAnalyticsNative, this.mRtmpSSLFactoryHolder);
    }
}
