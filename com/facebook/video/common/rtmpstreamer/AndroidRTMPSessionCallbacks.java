package com.facebook.video.common.rtmpstreamer;

import com.facebook.video.common.livestreaming.LiveStreamingError;
import com.facebook.video.common.livestreaming.NetworkSpeedTest;
import java.nio.ByteBuffer;

public interface AndroidRTMPSessionCallbacks {
    void audioFrameReceived(long j, ByteBuffer byteBuffer);

    void completedSpeedTestWithStatus(NetworkSpeedTest networkSpeedTest);

    void didDropPackets(String str);

    void didFailWithError(LiveStreamingError liveStreamingError);

    void didFinish();

    void didSendPackets(long j);

    void didStartWithSpeedTestStatus(NetworkSpeedTest networkSpeedTest);

    void didUpdateStreamingInfo(String str, String str2);

    void rtmpConnectCompleted();

    void rtmpConnectionReady();

    void rtmpCreateStreamCompleted();

    void rtmpHandshakeCompleted();

    void rtmpPublishCompleted();

    void rtmpSessionSslConnectCompleted();

    void videoFrameReceived(long j, long j2, ByteBuffer byteBuffer);

    void willReconnectDueToError(LiveStreamingError liveStreamingError);

    void writeDidTimeout();
}
