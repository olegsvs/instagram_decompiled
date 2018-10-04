package com.instagram.realtimeclient;

import X.AnonymousClass0CC;
import X.AnonymousClass0Cm;
import X.AnonymousClass0E6;
import java.util.Random;

public class RealtimeClientConfig {
    private final int mDelayDisconnectMQTTMS = 300000;
    private boolean mEarlyStartMqttClient;
    private boolean mIsDisconnectOnNetworkLostEnabled;
    private int mLogReceiveMessageSampleRate;
    private boolean mMQTTAnalyticsLoggingEnabled;
    private boolean mManageMqttThread;
    private boolean mSubscribeDirectIris;
    private final AnonymousClass0Cm mUserSession;

    public RealtimeClientConfig(AnonymousClass0Cm anonymousClass0Cm) {
        this.mUserSession = anonymousClass0Cm;
    }

    public int getDelayDisconnectMQTTMS() {
        return this.mDelayDisconnectMQTTMS;
    }

    public synchronized boolean getEarlyStartMqttClient() {
        return this.mEarlyStartMqttClient;
    }

    public synchronized int getLogReceiveMessageSampleRate() {
        return this.mLogReceiveMessageSampleRate;
    }

    public synchronized boolean getMQTTAnalyticsLoggingEnabled() {
        return this.mMQTTAnalyticsLoggingEnabled;
    }

    public synchronized boolean getManageMqttThread() {
        return this.mManageMqttThread;
    }

    public synchronized boolean getSubscribeDirectIris() {
        return this.mSubscribeDirectIris;
    }

    public synchronized boolean isDisconnectOnNetworkLostEnabled() {
        return this.mIsDisconnectOnNetworkLostEnabled;
    }

    public synchronized void loadConfig() {
        boolean z;
        int intValue = ((Integer) AnonymousClass0E6.m1318D(AnonymousClass0CC.ya, this.mUserSession)).intValue();
        int i = 0;
        if (!((Boolean) AnonymousClass0E6.m1318D(AnonymousClass0CC.wa, this.mUserSession)).booleanValue()) {
            if (intValue == 0 || new Random().nextInt(intValue) != 0) {
                z = false;
                this.mMQTTAnalyticsLoggingEnabled = z;
                if (this.mMQTTAnalyticsLoggingEnabled) {
                    i = ((Integer) AnonymousClass0E6.m1318D(AnonymousClass0CC.xa, this.mUserSession)).intValue();
                }
                this.mLogReceiveMessageSampleRate = i;
                this.mSubscribeDirectIris = ((Boolean) AnonymousClass0CC.va.m846H(this.mUserSession)).booleanValue();
                this.mEarlyStartMqttClient = ((Boolean) AnonymousClass0CC.ta.m846H(this.mUserSession)).booleanValue();
                this.mManageMqttThread = ((Boolean) AnonymousClass0CC.ua.m846H(this.mUserSession)).booleanValue();
                this.mIsDisconnectOnNetworkLostEnabled = ((Boolean) AnonymousClass0CC.Ka.m846H(this.mUserSession)).booleanValue();
            }
        }
        z = true;
        this.mMQTTAnalyticsLoggingEnabled = z;
        if (this.mMQTTAnalyticsLoggingEnabled) {
            i = ((Integer) AnonymousClass0E6.m1318D(AnonymousClass0CC.xa, this.mUserSession)).intValue();
        }
        this.mLogReceiveMessageSampleRate = i;
        this.mSubscribeDirectIris = ((Boolean) AnonymousClass0CC.va.m846H(this.mUserSession)).booleanValue();
        this.mEarlyStartMqttClient = ((Boolean) AnonymousClass0CC.ta.m846H(this.mUserSession)).booleanValue();
        this.mManageMqttThread = ((Boolean) AnonymousClass0CC.ua.m846H(this.mUserSession)).booleanValue();
        this.mIsDisconnectOnNetworkLostEnabled = ((Boolean) AnonymousClass0CC.Ka.m846H(this.mUserSession)).booleanValue();
    }
}
