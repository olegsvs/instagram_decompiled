package com.facebook.proxygen;

public class QuicSettings$Builder {
    private int mConnFlowControlWindow = 163840;
    private boolean mConnectUDP = false;
    private boolean mEnableSocketErrMsgCallback = true;
    private int mIdleTimeoutInSeconds = 60;
    private int mMaxCwndInMss = 2000;
    private int mMaxNumRTOs = 20;
    private int mMaxRecvPacketSize = 1280;
    private boolean mPacingEnabled = false;
    private boolean mPacingEnabledForRecovery = false;
    private int mStreamFlowControlWindow = 163840;
    private int mTcpQuicRaceDelayMilliseconds = 0;
    private boolean mTurnoffPMTUD = false;

    public QuicSettings build() {
        return new QuicSettings(this.mMaxRecvPacketSize, this.mConnectUDP, this.mMaxNumRTOs, this.mTurnoffPMTUD, this.mEnableSocketErrMsgCallback, this.mConnFlowControlWindow, this.mStreamFlowControlWindow, this.mTcpQuicRaceDelayMilliseconds, this.mMaxCwndInMss, this.mIdleTimeoutInSeconds, this.mPacingEnabled, this.mPacingEnabledForRecovery);
    }

    public QuicSettings$Builder setConnFlowControlWindow(int i) {
        this.mConnFlowControlWindow = i;
        return this;
    }

    public QuicSettings$Builder setConnectUDP(boolean z) {
        this.mConnectUDP = z;
        return this;
    }

    public QuicSettings$Builder setEnableSocketErrMsgCallback(boolean z) {
        this.mEnableSocketErrMsgCallback = z;
        return this;
    }

    public QuicSettings$Builder setIdleTimeoutInSeconds(int i) {
        this.mIdleTimeoutInSeconds = i;
        return this;
    }

    public QuicSettings$Builder setMaxCwndInMss(int i) {
        this.mMaxCwndInMss = i;
        return this;
    }

    public QuicSettings$Builder setMaxRTOs(int i) {
        this.mMaxNumRTOs = i;
        return this;
    }

    public QuicSettings$Builder setMaxRecvPacketSize(int i) {
        this.mMaxRecvPacketSize = i;
        return this;
    }

    public QuicSettings$Builder setPacingEnabled(boolean z) {
        this.mPacingEnabled = z;
        return this;
    }

    public QuicSettings$Builder setPacingEnabledForRecovery(boolean z) {
        this.mPacingEnabledForRecovery = z;
        return this;
    }

    public QuicSettings$Builder setStreamFlowControlWindow(int i) {
        this.mStreamFlowControlWindow = i;
        return this;
    }

    public QuicSettings$Builder setTcpQuicRaceDelayMilliseconds(int i) {
        this.mTcpQuicRaceDelayMilliseconds = i;
        return this;
    }

    public QuicSettings$Builder setTurnoffPMTUD(boolean z) {
        this.mTurnoffPMTUD = z;
        return this;
    }
}
