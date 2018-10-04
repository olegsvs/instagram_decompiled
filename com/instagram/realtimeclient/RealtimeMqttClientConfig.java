package com.instagram.realtimeclient;

import X.AnonymousClass05f;
import X.AnonymousClass0CB;
import X.AnonymousClass0CC;
import X.AnonymousClass0Cm;
import X.AnonymousClass0EE;
import X.AnonymousClass0EF;
import X.AnonymousClass0EV;
import X.AnonymousClass0FF;
import X.AnonymousClass0FZ;
import X.AnonymousClass0HV;
import X.AnonymousClass0LQ;
import X.AnonymousClass0NN;
import X.AnonymousClass0Nl;
import X.AnonymousClass0XQ;
import X.AnonymousClass0bY;
import X.AnonymousClass0gh;
import X.AnonymousClass1iN;
import X.AnonymousClass1ih;
import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RealtimeMqttClientConfig extends AnonymousClass1iN {
    public static final Class TAG = RealtimeMqttClientConfig.class;
    private final AnonymousClass1ih mAnalyticsLogger = new C01231();
    private String mCurrentlyConnectedHost;
    public final RealtimeClientConfig mRealtimeClientConfig;
    private final AnonymousClass0Cm mUserSession;

    /* renamed from: com.instagram.realtimeclient.RealtimeMqttClientConfig$1 */
    public class C01231 implements AnonymousClass1ih {
        public synchronized void reportEvent(final AnonymousClass05f anonymousClass05f) {
            if (RealtimeMqttClientConfig.this.mRealtimeClientConfig.getMQTTAnalyticsLoggingEnabled()) {
                AnonymousClass0NN B = AnonymousClass0NN.B(anonymousClass05f.f170D, new AnonymousClass0EE() {
                    public String getModuleName() {
                        return anonymousClass05f.f169C;
                    }
                });
                for (Entry entry : anonymousClass05f.f168B.entrySet()) {
                    B.F((String) entry.getKey(), (String) entry.getValue());
                }
                B.C("client_nano_time", System.nanoTime());
                B.R();
            }
        }
    }

    public int getHealthStatsSamplingRate() {
        return 30;
    }

    public RealtimeMqttClientConfig(AnonymousClass0Cm anonymousClass0Cm, RealtimeClientConfig realtimeClientConfig) {
        this.mUserSession = anonymousClass0Cm;
        this.mRealtimeClientConfig = realtimeClientConfig;
    }

    public AnonymousClass1ih getAnalyticsLogger() {
        return this.mAnalyticsLogger;
    }

    public Map getAppSpecificInfo() {
        Context context = AnonymousClass0EV.f1977B;
        Map hashMap = new HashMap();
        hashMap.put("platform", "android");
        hashMap.put("app_version", AnonymousClass0FF.C(context));
        hashMap.put("capabilities", AnonymousClass0gh.f8268B);
        hashMap.put("Accept-Language", AnonymousClass0bY.C());
        hashMap.put("User-Agent", AnonymousClass0Nl.B());
        hashMap.put("ig_mqtt_route", "django");
        if (!AnonymousClass0CB.J() && AnonymousClass0FZ.B().N()) {
            hashMap.put("dev_host", AnonymousClass0FZ.B().A());
        }
        if (this.mRealtimeClientConfig.getMQTTAnalyticsLoggingEnabled()) {
            hashMap.put("client_session_id", String.valueOf(System.currentTimeMillis()));
        }
        CharSequence pubSubMsgTypeBlacklist = getPubSubMsgTypeBlacklist();
        if (!TextUtils.isEmpty(pubSubMsgTypeBlacklist)) {
            hashMap.put("pubsub_msg_type_blacklist", pubSubMsgTypeBlacklist);
        }
        pubSubMsgTypeBlacklist = getEverclearSubscriptions();
        if (!TextUtils.isEmpty(pubSubMsgTypeBlacklist)) {
            hashMap.put("everclear_subscriptions", pubSubMsgTypeBlacklist);
        }
        if (((Boolean) AnonymousClass0CC.eI.H(this.mUserSession)).booleanValue()) {
            hashMap.put("visual_message_return_type", "24h_replayable");
            String str = "1";
            hashMap.put("visual_message_forward_limit", str);
            hashMap.put("visual_message_backward_limit", str);
            hashMap.put("visual_message_total_limit", str);
        } else if (((Boolean) AnonymousClass0CC.lI.H(this.mUserSession)).booleanValue()) {
            hashMap.put("visual_message_return_type", "24h_replayable_in_thread_view");
        }
        hashMap.put("is_directapp_installed", AnonymousClass0EF.J(context) ? "1" : "0");
        hashMap.put("auth_cache_enabled", ((Boolean) AnonymousClass0CC.GU.H(this.mUserSession)).booleanValue() ? "1" : "0");
        if (AnonymousClass0CB.D()) {
            AnonymousClass0XQ F = AnonymousClass0LQ.F(hashMap);
            for (Entry entry : hashMap.entrySet()) {
                F.B((String) entry.getKey(), entry.getValue());
            }
            F.toString();
        }
        return hashMap;
    }

    private java.lang.String getEverclearSubscriptions() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r2 = new org.json.JSONObject;
        r2.<init>();
        r1 = X.AnonymousClass0CC.RB;	 Catch:{ JSONException -> 0x0043 }
        r0 = r3.mUserSession;	 Catch:{ JSONException -> 0x0043 }
        r0 = X.AnonymousClass0E6.D(r1, r0);	 Catch:{ JSONException -> 0x0043 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ JSONException -> 0x0043 }
        r0 = r0.booleanValue();	 Catch:{ JSONException -> 0x0043 }
        if (r0 == 0) goto L_0x002c;	 Catch:{ JSONException -> 0x0043 }
    L_0x0015:
        r1 = X.AnonymousClass0CC.LB;	 Catch:{ JSONException -> 0x0043 }
        r0 = r3.mUserSession;	 Catch:{ JSONException -> 0x0043 }
        r0 = X.AnonymousClass0E6.D(r1, r0);	 Catch:{ JSONException -> 0x0043 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ JSONException -> 0x0043 }
        r0 = r0.booleanValue();	 Catch:{ JSONException -> 0x0043 }
        if (r0 == 0) goto L_0x002c;	 Catch:{ JSONException -> 0x0043 }
    L_0x0025:
        r1 = "async_ads_subscribe";	 Catch:{ JSONException -> 0x0043 }
        r0 = "17911191835112000";	 Catch:{ JSONException -> 0x0043 }
        r2.put(r1, r0);	 Catch:{ JSONException -> 0x0043 }
    L_0x002c:
        r1 = X.AnonymousClass0CC.Dc;	 Catch:{ JSONException -> 0x0043 }
        r0 = r3.mUserSession;	 Catch:{ JSONException -> 0x0043 }
        r0 = r1.H(r0);	 Catch:{ JSONException -> 0x0043 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ JSONException -> 0x0043 }
        r0 = r0.booleanValue();	 Catch:{ JSONException -> 0x0043 }
        if (r0 == 0) goto L_0x0043;	 Catch:{ JSONException -> 0x0043 }
    L_0x003c:
        r1 = "inapp_notification_subscribe_default";	 Catch:{ JSONException -> 0x0043 }
        r0 = "17899377895239777";	 Catch:{ JSONException -> 0x0043 }
        r2.put(r1, r0);	 Catch:{ JSONException -> 0x0043 }
    L_0x0043:
        r0 = r2.length();
        if (r0 <= 0) goto L_0x004e;
    L_0x0049:
        r0 = r2.toString();
        goto L_0x004f;
    L_0x004e:
        r0 = 0;
    L_0x004f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.realtimeclient.RealtimeMqttClientConfig.getEverclearSubscriptions():java.lang.String");
    }

    private String getPubSubMsgTypeBlacklist() {
        String str = (String) AnonymousClass0CC.za.H(this.mUserSession);
        if (!((Boolean) AnonymousClass0CC.La.H(this.mUserSession)).booleanValue()) {
            return str;
        }
        if (TextUtils.isEmpty(str)) {
            return RealtimeConstants.DIRECT_TYPING_INDICATOR_BLACKLIST_TYPE;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(", ");
        stringBuilder.append(RealtimeConstants.DIRECT_TYPING_INDICATOR_BLACKLIST_TYPE);
        return stringBuilder.toString();
    }

    public String getRequestRoutingRegion() {
        return AnonymousClass0HV.D(this.mUserSession).f2646B.getString("realtime_mqtt_request_routing_region", null);
    }

    public synchronized void setHost(String str, boolean z) {
        if (str != null) {
            if (!str.equals(this.mCurrentlyConnectedHost)) {
                this.mCurrentlyConnectedHost = str;
                if (z) {
                    setPreferredTier("sandbox");
                    setPreferredSandbox(this.mCurrentlyConnectedHost);
                } else {
                    setPreferredTier(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("{\"host_name_v6\":\"");
                    stringBuilder.append(this.mCurrentlyConnectedHost);
                    stringBuilder.append("\"}");
                    setMqttConnectionConfig(stringBuilder.toString());
                }
            }
        }
    }
}
