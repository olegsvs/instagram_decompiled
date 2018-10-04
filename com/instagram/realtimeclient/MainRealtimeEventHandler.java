package com.instagram.realtimeclient;

import X.AnonymousClass0Cm;
import X.AnonymousClass0EE;
import X.AnonymousClass0Gn;
import X.AnonymousClass0HV;
import X.AnonymousClass0NN;
import X.AnonymousClass0OR;
import X.AnonymousClass0Sy;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.instagram.realtimeclient.RealtimeClientManager.MessageDeliveryCallback;
import com.instagram.realtimeclient.RealtimeEvent.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

public class MainRealtimeEventHandler extends DirectRealtimeEventHandler implements AnonymousClass0EE {
    private static final Charset CHARSET_UTF8 = Charset.forName("UTF-8");
    private static final Handler MAIN_THREAD_HANDLER = new Handler(Looper.getMainLooper());
    public static final Class TAG = MainRealtimeEventHandler.class;
    private static final long TIMEOUT_TTL = TimeUnit.MINUTES.toMillis(1);
    private final Map mMessageDeliveryCallbacks = new HashMap();
    private final Map mProtocolDelegates = new HashMap();
    public final RealtimeStore mStore = new RealtimeStore();
    private final List mSupportedSkywalkerMessageTypes = new ArrayList();
    private final Runnable mTimeoutCallback = new C00441();
    private final AnonymousClass0Cm mUserSession;

    public interface Delegate {
        String getProtocol();

        int getSkywalkerMessageType();

        void handleRealtimeOperation(RealtimeOperation realtimeOperation);
    }

    /* renamed from: com.instagram.realtimeclient.MainRealtimeEventHandler$1 */
    public class C00441 implements Runnable {
        public void run() {
            MainRealtimeEventHandler.onTimeout(MainRealtimeEventHandler.this);
        }
    }

    public String getModuleName() {
        return "realtime";
    }

    public MainRealtimeEventHandler(AnonymousClass0Cm anonymousClass0Cm) {
        this.mUserSession = anonymousClass0Cm;
    }

    public void addProtocolDelegate(String str, Delegate delegate) {
        this.mProtocolDelegates.put(str, delegate);
        this.mSupportedSkywalkerMessageTypes.add(Integer.valueOf(delegate.getSkywalkerMessageType()));
    }

    public boolean canHandleRealtimeEvent(String str, String str2) {
        Object obj;
        int hashCode = str.hashCode();
        boolean z = false;
        if (hashCode != -931817442) {
            if (hashCode != 145554904) {
                if (hashCode != 588050650) {
                    if (hashCode == 1943914206) {
                        if (str.equals(RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE)) {
                            obj = 2;
                            switch (obj) {
                                case null:
                                case 1:
                                    return true;
                                case 2:
                                case 3:
                                    return RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING.equals(str2);
                                default:
                                    if (str2 != null && this.mSupportedSkywalkerMessageTypes.contains(Integer.valueOf(str2))) {
                                        z = true;
                                    }
                                    return z;
                            }
                        }
                    }
                } else if (str.equals(RealtimeConstants.MQTT_TOPIC_GRAPHQL_SUBSCRIPTION_PREFIX)) {
                    obj = 3;
                    switch (obj) {
                        case null:
                        case 1:
                            return true;
                        case 2:
                        case 3:
                            return RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING.equals(str2);
                        default:
                            z = true;
                            return z;
                    }
                }
            } else if (str.equals(RealtimeConstants.MQTT_TOPIC_REGION_HINT)) {
                obj = null;
                switch (obj) {
                    case null:
                    case 1:
                        return true;
                    case 2:
                    case 3:
                        return RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING.equals(str2);
                    default:
                        z = true;
                        return z;
                }
            }
        } else if (str.equals(RealtimeConstants.MQTT_TOPIC_SEND_MESSAGE_RESPONSE)) {
            obj = 1;
            switch (obj) {
                case null:
                case 1:
                    return true;
                case 2:
                case 3:
                    return RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING.equals(str2);
                default:
                    z = true;
                    return z;
            }
        }
        obj = -1;
        switch (obj) {
            case null:
            case 1:
                return true;
            case 2:
            case 3:
                return RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING.equals(str2);
            default:
                z = true;
                return z;
        }
    }

    private Delegate getDelegateForOperation(String str) {
        for (Entry entry : this.mProtocolDelegates.entrySet()) {
            if (str.startsWith((String) entry.getKey())) {
                return (Delegate) entry.getValue();
            }
        }
        return null;
    }

    private void handleMqttRegionHintMessage(byte[] bArr) {
        RegionHintMessage regionHintMessage = new RegionHintMessage(bArr);
        regionHintMessage.getRegion();
        AnonymousClass0HV D = AnonymousClass0HV.m2008D(this.mUserSession);
        D.f2646B.edit().putString("realtime_mqtt_request_routing_region", regionHintMessage.getRegion()).apply();
    }

    public static void handleOperation(MainRealtimeEventHandler mainRealtimeEventHandler, RealtimeOperation realtimeOperation) {
        Delegate delegateForOperation = mainRealtimeEventHandler.getDelegateForOperation(realtimeOperation.path);
        if (delegateForOperation != null) {
            delegateForOperation.handleRealtimeOperation(realtimeOperation);
            return;
        }
        mainRealtimeEventHandler = TAG.getName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Operation not handled, op: ");
        stringBuilder.append(realtimeOperation.op);
        stringBuilder.append(" path: ");
        stringBuilder.append(realtimeOperation.path);
        stringBuilder.append(" val: ");
        stringBuilder.append(realtimeOperation.value);
        AnonymousClass0Gn.m1876C(mainRealtimeEventHandler, stringBuilder.toString());
    }

    public static void logOperation(MainRealtimeEventHandler mainRealtimeEventHandler, RealtimeOperation realtimeOperation, String str) {
        AnonymousClass0NN.m3291B("realtime_operation_received", (AnonymousClass0EE) mainRealtimeEventHandler).m3298F("realtime_topic", str).m3298F("realtime_path", realtimeOperation.path).m3310R();
    }

    public static void onAckEvent(MainRealtimeEventHandler mainRealtimeEventHandler, String str, Integer num, String str2, String str3, String str4, long j, Long l) {
        MessageDeliveryCallback messageDeliveryCallback = (MessageDeliveryCallback) mainRealtimeEventHandler.mMessageDeliveryCallbacks.remove(str);
        if (messageDeliveryCallback != null) {
            if (num == null || num.intValue() != 200) {
                messageDeliveryCallback.onFailure(num, str2);
            } else {
                messageDeliveryCallback.onSuccess(str3, str4, j, l);
            }
        }
    }

    private void onDirectEvent(RealtimeEvent realtimeEvent) {
        AnonymousClass0Sy.m4437F(new MainRealtimeEventHandler$2(this, realtimeEvent));
    }

    private void onPatchEvent(RealtimeEvent realtimeEvent, String str) {
        AnonymousClass0Sy.m4437F(new MainRealtimeEventHandler$3(this, realtimeEvent, str));
    }

    public void onRealtimeEvent(String str, RealtimeEvent realtimeEvent) {
        if (realtimeEvent.action != null) {
            onDirectEvent(realtimeEvent);
        } else if (realtimeEvent.type == Type.PATCH) {
            onPatchEvent(realtimeEvent, str);
        }
    }

    public void onRealtimeEventPayload(String str, String str2, String str3) {
        Object obj = -1;
        try {
            int hashCode = str.hashCode();
            if (hashCode != -931817442) {
                if (hashCode == 145554904) {
                    if (str.equals(RealtimeConstants.MQTT_TOPIC_REGION_HINT)) {
                        obj = null;
                    }
                }
            } else if (str.equals(RealtimeConstants.MQTT_TOPIC_SEND_MESSAGE_RESPONSE)) {
                obj = 1;
            }
            if (obj != null) {
                onRealtimeEvent(str, RealtimeEvent__JsonHelper.parseFromJson(str3));
            } else {
                handleMqttRegionHintMessage(str3.getBytes(CHARSET_UTF8));
            }
        } catch (Throwable e) {
            throw new IllegalStateException("error parsing realtime event from skywalker", e);
        }
    }

    public void onSendRealtimeCommand(String str, MessageDeliveryCallback messageDeliveryCallback) {
        if (!(str == null || messageDeliveryCallback == null)) {
            messageDeliveryCallback.setStartSendingTimestampInMs(SystemClock.elapsedRealtime());
            this.mMessageDeliveryCallbacks.put(str, messageDeliveryCallback);
        }
        messageDeliveryCallback = MAIN_THREAD_HANDLER;
        AnonymousClass0OR.m3627G(messageDeliveryCallback, this.mTimeoutCallback, 759647054);
        AnonymousClass0OR.m3626F(messageDeliveryCallback, this.mTimeoutCallback, TIMEOUT_TTL, -1137970641);
    }

    public static void onTimeout(MainRealtimeEventHandler mainRealtimeEventHandler) {
        mainRealtimeEventHandler = mainRealtimeEventHandler.mMessageDeliveryCallbacks.values().iterator();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (mainRealtimeEventHandler.hasNext()) {
            MessageDeliveryCallback messageDeliveryCallback = (MessageDeliveryCallback) mainRealtimeEventHandler.next();
            if (elapsedRealtime - messageDeliveryCallback.getStartSendingTimestampInMs() > TIMEOUT_TTL) {
                mainRealtimeEventHandler.remove();
                messageDeliveryCallback.onTimeout();
            }
        }
    }
}
