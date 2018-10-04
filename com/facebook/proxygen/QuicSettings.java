package com.facebook.proxygen;

public class QuicSettings {
    public int mConnFlowControlWindow;
    public boolean mConnectUDP;
    public boolean mEnableSocketErrMsgCallback;
    public int mIdleTimeoutInSeconds;
    public int mMaxCwndInMss;
    public int mMaxNumRTOs;
    public int mMaxRecvPacketSize;
    public boolean mPacingEnabled;
    public boolean mPacingEnabledForRecovery;
    public int mStreamFlowControlWindow;
    public int mTcpQuicRaceDelayMilliseconds;
    public boolean mTurnoffPMTUD;

    public QuicSettings(int i, boolean z, int i2, boolean z2, boolean z3, int i3, int i4, int i5, int i6, int i7, boolean z4, boolean z5) {
        this.mMaxRecvPacketSize = 1280;
        this.mConnectUDP = false;
        this.mMaxNumRTOs = 20;
        this.mTurnoffPMTUD = false;
        this.mEnableSocketErrMsgCallback = true;
        this.mPacingEnabled = false;
        this.mPacingEnabledForRecovery = false;
        this.mMaxRecvPacketSize = i;
        this.mConnectUDP = z;
        this.mMaxNumRTOs = i2;
        this.mTurnoffPMTUD = z2;
        this.mEnableSocketErrMsgCallback = z3;
        this.mConnFlowControlWindow = i3;
        this.mStreamFlowControlWindow = i4;
        this.mTcpQuicRaceDelayMilliseconds = i5;
        this.mMaxCwndInMss = i6;
        this.mIdleTimeoutInSeconds = i7;
        this.mPacingEnabled = z4;
        this.mPacingEnabledForRecovery = z5;
    }
}
