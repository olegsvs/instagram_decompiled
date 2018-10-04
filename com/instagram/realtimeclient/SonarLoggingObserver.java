package com.instagram.realtimeclient;

import X.AnonymousClass0Vi;
import com.facebook.sonar.plugins.mqtt.MqttEvent;
import com.facebook.sonar.plugins.mqtt.MqttSonarPlugin;

public class SonarLoggingObserver implements RealtimeClientManager$Observer {
    private MqttSonarPlugin mPlugin;

    public void onConnectionChanged(AnonymousClass0Vi anonymousClass0Vi) {
    }

    public SonarLoggingObserver(MqttSonarPlugin mqttSonarPlugin) {
        this.mPlugin = mqttSonarPlugin;
    }

    public void onMessage(String str, String str2, String str3) {
        this.mPlugin.reportEvent(MqttEvent.message(str, str3));
    }

    public void onSendMessage(String str, String str2, String str3, boolean z, Long l) {
        this.mPlugin.reportEvent(MqttEvent.subscribe(str2));
    }
}
