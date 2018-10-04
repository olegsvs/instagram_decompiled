package com.instagram.realtimeclient;

import X.AnonymousClass0Cm;
import X.AnonymousClass0G2;
import X.AnonymousClass0HV;
import X.AnonymousClass0gV;
import X.AnonymousClass0gX;
import X.AnonymousClass1XN;
import X.AnonymousClass3Qe;
import X.AnonymousClass3Qf;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ZeroProvisionRealtimeService extends RealtimeEventHandler implements AnonymousClass0G2 {
    private final AnonymousClass0Cm mUserSession;

    public void onUserSessionWillEnd(boolean z) {
    }

    private ZeroProvisionRealtimeService(AnonymousClass0Cm anonymousClass0Cm) {
        this.mUserSession = anonymousClass0Cm;
    }

    public boolean canHandleRealtimeEvent(String str, String str2) {
        return RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str) && GraphQLSubscriptionID.ZERO_PROVISION_QUERY_ID.equals(str2);
    }

    public static synchronized ZeroProvisionRealtimeService getInstance(AnonymousClass0Cm anonymousClass0Cm) {
        ZeroProvisionRealtimeService zeroProvisionRealtimeService;
        Class cls = ZeroProvisionRealtimeService.class;
        synchronized (cls) {
            zeroProvisionRealtimeService = (ZeroProvisionRealtimeService) anonymousClass0Cm.m1036A(cls);
            if (zeroProvisionRealtimeService == null) {
                zeroProvisionRealtimeService = new ZeroProvisionRealtimeService(anonymousClass0Cm);
                anonymousClass0Cm.m1039D(cls, zeroProvisionRealtimeService);
            }
        }
        return zeroProvisionRealtimeService;
    }

    public void onRealtimeEventPayload(String str, String str2, String str3) {
        try {
            AnonymousClass3Qf parseFromJson = AnonymousClass1XN.parseFromJson(str3);
            if (parseFromJson != null && parseFromJson.A() != null) {
                AnonymousClass0HV D = AnonymousClass0HV.m2008D(this.mUserSession);
                if (parseFromJson.A().longValue() > D.f2646B.getLong("zero_rating_provisioned_time", 0)) {
                    AnonymousClass0gX B = AnonymousClass0gV.m6626B(this.mUserSession);
                    StringBuilder stringBuilder = new StringBuilder();
                    AnonymousClass3Qe anonymousClass3Qe = parseFromJson.f41162B;
                    stringBuilder.append(anonymousClass3Qe != null ? anonymousClass3Qe.f41160B : JsonProperty.USE_DEFAULT_NAME);
                    stringBuilder.append("_");
                    stringBuilder.append("mqtt_token_push");
                    B.oH(stringBuilder.toString());
                    D.OA(parseFromJson.A().longValue());
                }
            }
        } catch (Throwable e) {
            throw new IllegalStateException("error parsing zero provision event from skywalker", e);
        }
    }
}
