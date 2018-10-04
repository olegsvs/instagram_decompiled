package com.instagram.realtimeclient;

import X.AnonymousClass0Gn;
import X.AnonymousClass0gX;
import X.AnonymousClass1iP;

public class RealtimeClientManager$4 implements Runnable {
    public final /* synthetic */ RealtimeClientManager this$0;
    public final /* synthetic */ boolean val$earlyStartMqttClient;
    public final /* synthetic */ AnonymousClass1iP val$mqttClient;
    public final /* synthetic */ RealtimeMqttClientConfig val$realtimeMqttClientConfig;
    public final /* synthetic */ AnonymousClass0gX val$zeroTokenManager;

    public RealtimeClientManager$4(RealtimeClientManager realtimeClientManager, AnonymousClass1iP anonymousClass1iP, RealtimeMqttClientConfig realtimeMqttClientConfig, AnonymousClass0gX anonymousClass0gX, boolean z) {
        this.this$0 = realtimeClientManager;
        this.val$mqttClient = anonymousClass1iP;
        this.val$realtimeMqttClientConfig = realtimeMqttClientConfig;
        this.val$zeroTokenManager = anonymousClass0gX;
        this.val$earlyStartMqttClient = z;
    }

    public void run() {
        RealtimeClientManager.access$102(this.this$0, this.val$mqttClient);
        RealtimeClientManager.access$202(this.this$0, this.val$realtimeMqttClientConfig);
        RealtimeClientManager.access$302(this.this$0, this.val$zeroTokenManager);
        this.this$0.onTokenChange();
        this.this$0.mZeroTokenManager.GC(this.this$0);
        int i = this.this$0.mMqttTargetState;
        if (i != -1) {
            switch (i) {
                case 1:
                    RealtimeClientManager.destroyMqttClient(this.this$0);
                    break;
                case 2:
                    if (!this.val$earlyStartMqttClient) {
                        this.this$0.mMqttClient.B();
                        break;
                    }
                    break;
                case 3:
                    this.this$0.mMqttClient.C();
                    break;
                default:
                    break;
            }
        }
        AnonymousClass0Gn.H("RealtimeClientManager", "MQTT status is UNSET after finishing Initialization");
        RealtimeClientManager.access$602(this.this$0, false);
    }
}
