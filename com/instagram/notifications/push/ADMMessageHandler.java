package com.instagram.notifications.push;

import X.AnonymousClass0EA;
import X.AnonymousClass0Gn;
import android.content.Intent;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.amazon.device.messaging.ADMMessageReceiver;
import com.instagram.common.notifications.push.PushChannelType;

public class ADMMessageHandler extends ADMMessageHandlerBase {

    public class Receiver extends ADMMessageReceiver {
        public Receiver() {
            super(ADMMessageHandler.class);
        }
    }

    public ADMMessageHandler() {
        super(ADMMessageHandler.class.getName());
    }

    public final void onMessage(Intent intent) {
        AnonymousClass0EA.B().B(intent, PushChannelType.AMAZON, null);
    }

    public final void onRegistered(String str) {
        AnonymousClass0EA.B().C(getApplicationContext(), str, PushChannelType.AMAZON, true);
    }

    public final void onRegistrationError(String str) {
        AnonymousClass0Gn.C("ADMMessagehandler onRegistrationError", str);
    }

    public final void onUnregistered(String str) {
        AnonymousClass0EA.B();
    }
}
