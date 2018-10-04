package com.instagram.realtimeclient;

public class GraphQLSubscriptionID {
    public static final String APP_PRESENCE_QUERY_ID = "17846944882223835";
    public static final String APP_PRESENCE_QUERY_MODEL_NAME = "presence_subscribe";
    public static final String ASYNC_ADS_QUERY_MODEL_NAME = "async_ads_subscribe";
    public static final String ASYNC_AD_QUERY_ID = "17911191835112000";
    public static final String COMMENT_TYPING_INDICATOR_QUERY_ID = "17902501729012053";
    public static final String DIRECT_TYPING_INDICATOR_QUERY_ID = "17867973967082385";
    public static final String FEEDBACK_LIKE_SUBSCRIBE_QUERY_ID = "17877917527113814";
    public static final String IGLIVE_WAVE_QUERY_ID = "17882305414154951";
    public static final String IG_INAPP_NOTIFICATION_QUERY_ID = "17899377895239777";
    public static final String IG_INTERACTIVITY_QUERY_ID = "17939540878177263";
    public static final String INAPP_NOTIFICATION_QUERY_MODEL_NAME = "inapp_notification_subscribe";
    public static final String INAPP_NOTIFICATION_TYPE_DEFAULT = "default";
    public static final String LIVE_TYPING_INDICATOR_QUERY_ID = "17926314067024917";
    public static final String NEW_COMMENT_QUERY_ID = "17891624287114722";
    public static final String ZERO_PROVISION_QUERY_ID = "17913953740109069";

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String idToString(java.lang.String r2) {
        /*
        r0 = r2.hashCode();
        switch(r0) {
            case -1742886206: goto L_0x0064;
            case -1462523664: goto L_0x005a;
            case -1245320171: goto L_0x0050;
            case 314812266: goto L_0x0046;
            case 684945396: goto L_0x003c;
            case 903673990: goto L_0x0031;
            case 1350916351: goto L_0x0026;
            case 1564323194: goto L_0x001c;
            case 1699441567: goto L_0x0012;
            case 1868710814: goto L_0x0008;
            default: goto L_0x0007;
        };
    L_0x0007:
        goto L_0x006e;
    L_0x0008:
        r0 = "17867973967082385";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x006e;
    L_0x0010:
        r0 = 0;
        goto L_0x006f;
    L_0x0012:
        r0 = "17926314067024917";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x006e;
    L_0x001a:
        r0 = 7;
        goto L_0x006f;
    L_0x001c:
        r0 = "17902501729012053";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x006e;
    L_0x0024:
        r0 = 3;
        goto L_0x006f;
    L_0x0026:
        r0 = "17939540878177263";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x006e;
    L_0x002e:
        r0 = 9;
        goto L_0x006f;
    L_0x0031:
        r0 = "17891624287114722";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x006e;
    L_0x0039:
        r0 = 8;
        goto L_0x006f;
    L_0x003c:
        r0 = "17846944882223835";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x006e;
    L_0x0044:
        r0 = 5;
        goto L_0x006f;
    L_0x0046:
        r0 = "17913953740109069";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x006e;
    L_0x004e:
        r0 = 6;
        goto L_0x006f;
    L_0x0050:
        r0 = "17877917527113814";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x006e;
    L_0x0058:
        r0 = 2;
        goto L_0x006f;
    L_0x005a:
        r0 = "17882305414154951";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x006e;
    L_0x0062:
        r0 = 4;
        goto L_0x006f;
    L_0x0064:
        r0 = "17911191835112000";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x006e;
    L_0x006c:
        r0 = 1;
        goto L_0x006f;
    L_0x006e:
        r0 = -1;
    L_0x006f:
        switch(r0) {
            case 0: goto L_0x009f;
            case 1: goto L_0x009c;
            case 2: goto L_0x0099;
            case 3: goto L_0x0096;
            case 4: goto L_0x0093;
            case 5: goto L_0x0090;
            case 6: goto L_0x008d;
            case 7: goto L_0x008a;
            case 8: goto L_0x0087;
            case 9: goto L_0x0084;
            default: goto L_0x0072;
        };
    L_0x0072:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "unknown: ";
        r1.append(r0);
        r1.append(r2);
        r0 = r1.toString();
        return r0;
    L_0x0084:
        r0 = "IG_INTERACTIVITY_QUERY_ID";
        return r0;
    L_0x0087:
        r0 = "NEW_COMMENT_QUERY_ID";
        return r0;
    L_0x008a:
        r0 = "LIVE_TYPING_INDICATOR_QUERY_ID";
        return r0;
    L_0x008d:
        r0 = "ZERO_PROVISION_QUERY_ID";
        return r0;
    L_0x0090:
        r0 = "APP_PRESENCE_QUERY_ID";
        return r0;
    L_0x0093:
        r0 = "IGLIVE_WAVE_QUERY_ID";
        return r0;
    L_0x0096:
        r0 = "COMMENT_TYPING_INDICATOR_QUERY_ID";
        return r0;
    L_0x0099:
        r0 = "FEEDBACK_LIKE_SUBSCRIBE_QUERY_ID";
        return r0;
    L_0x009c:
        r0 = "ASYNC_AD_QUERY_ID";
        return r0;
    L_0x009f:
        r0 = "DIRECT_TYPING_INDICATOR_QUERY_ID";
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.realtimeclient.GraphQLSubscriptionID.idToString(java.lang.String):java.lang.String");
    }
}
