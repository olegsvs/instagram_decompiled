package com.instagram.realtimeclient;

import X.AnonymousClass0Dc;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public class RealtimeSubscription {
    private static final String GRAPHQL_MQTT_VERSION = "1";
    private static final String GRAPHQL_SUBSCRIPTIONS_SUBTOPIC = "graphqlsubscriptions";
    private static final String GRAPHQL_SUBSCRIPTION_TOPIC_PREFIX = "1/graphqlsubscriptions";
    private static final String REALTIME_USER_TOPIC_PREFIX = "ig/u/v1/";
    private static final String SKYWALKER_USER_LIVE_TOPIC_PREFIX = "ig/live_notification_subscribe/";
    private static final Class TAG = RealtimeSubscription.class;
    private final JSONObject mInputParams;
    private final String mSubscriptionQueryId;

    private RealtimeSubscription(String str, JSONObject jSONObject) {
        this.mSubscriptionQueryId = str;
        this.mInputParams = jSONObject;
    }

    public static RealtimeSubscription getAppPresenceSubscription(String str) {
        String uuid = UUID.randomUUID().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_subscription_id", uuid);
        } catch (JSONException e) {
            AnonymousClass0Dc.m1241D(TAG, "Can't create subscription intput for getAppPresenceSubscription: userId %s", str, e);
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.APP_PRESENCE_QUERY_ID, jSONObject);
    }

    public static com.instagram.realtimeclient.RealtimeSubscription getAsyncAdSubscription(java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r0 = java.util.UUID.randomUUID();
        r1 = r0.toString();
        r2 = new org.json.JSONObject;
        r2.<init>();
        r0 = "client_subscription_id";	 Catch:{ JSONException -> 0x0017 }
        r2.put(r0, r1);	 Catch:{ JSONException -> 0x0017 }
        r0 = "user_id";	 Catch:{ JSONException -> 0x0017 }
        r2.put(r0, r3);	 Catch:{ JSONException -> 0x0017 }
    L_0x0017:
        r1 = new com.instagram.realtimeclient.RealtimeSubscription;
        r0 = "17911191835112000";
        r1.<init>(r0, r2);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.realtimeclient.RealtimeSubscription.getAsyncAdSubscription(java.lang.String):com.instagram.realtimeclient.RealtimeSubscription");
    }

    public static com.instagram.realtimeclient.RealtimeSubscription getCommentTypingSubcription(java.lang.String r3, java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r2 = new org.json.JSONObject;
        r2.<init>();
        r0 = "client_subscription_id";	 Catch:{ JSONException -> 0x000f }
        r2.put(r0, r3);	 Catch:{ JSONException -> 0x000f }
        r0 = "media_id";	 Catch:{ JSONException -> 0x000f }
        r2.put(r0, r4);	 Catch:{ JSONException -> 0x000f }
    L_0x000f:
        r1 = new com.instagram.realtimeclient.RealtimeSubscription;
        r0 = "17902501729012053";
        r1.<init>(r0, r2);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.realtimeclient.RealtimeSubscription.getCommentTypingSubcription(java.lang.String, java.lang.String):com.instagram.realtimeclient.RealtimeSubscription");
    }

    public static com.instagram.realtimeclient.RealtimeSubscription getDirectTypingSubscription(java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r2 = new org.json.JSONObject;
        r2.<init>();
        r0 = "user_id";	 Catch:{ JSONException -> 0x000a }
        r2.put(r0, r3);	 Catch:{ JSONException -> 0x000a }
    L_0x000a:
        r1 = new com.instagram.realtimeclient.RealtimeSubscription;
        r0 = "17867973967082385";
        r1.<init>(r0, r2);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.realtimeclient.RealtimeSubscription.getDirectTypingSubscription(java.lang.String):com.instagram.realtimeclient.RealtimeSubscription");
    }

    public static com.instagram.realtimeclient.RealtimeSubscription getIgLiveWaveSubscription(java.lang.String r3, java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r0 = java.util.UUID.randomUUID();
        r1 = r0.toString();
        r2 = new org.json.JSONObject;
        r2.<init>();
        r0 = "client_subscription_id";	 Catch:{ JSONException -> 0x001c }
        r2.put(r0, r1);	 Catch:{ JSONException -> 0x001c }
        r0 = "broadcast_id";	 Catch:{ JSONException -> 0x001c }
        r2.put(r0, r3);	 Catch:{ JSONException -> 0x001c }
        r0 = "receiver_id";	 Catch:{ JSONException -> 0x001c }
        r2.put(r0, r4);	 Catch:{ JSONException -> 0x001c }
    L_0x001c:
        r1 = new com.instagram.realtimeclient.RealtimeSubscription;
        r0 = "17882305414154951";
        r1.<init>(r0, r2);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.realtimeclient.RealtimeSubscription.getIgLiveWaveSubscription(java.lang.String, java.lang.String):com.instagram.realtimeclient.RealtimeSubscription");
    }

    public static com.instagram.realtimeclient.RealtimeSubscription getInteractivitySubscription(java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r0 = java.util.UUID.randomUUID();
        r1 = r0.toString();
        r2 = new org.json.JSONObject;
        r2.<init>();
        r0 = "client_subscription_id";	 Catch:{ JSONException -> 0x0017 }
        r2.put(r0, r1);	 Catch:{ JSONException -> 0x0017 }
        r0 = "broadcast_id";	 Catch:{ JSONException -> 0x0017 }
        r2.put(r0, r3);	 Catch:{ JSONException -> 0x0017 }
    L_0x0017:
        r1 = new com.instagram.realtimeclient.RealtimeSubscription;
        r0 = "17939540878177263";
        r1.<init>(r0, r2);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.realtimeclient.RealtimeSubscription.getInteractivitySubscription(java.lang.String):com.instagram.realtimeclient.RealtimeSubscription");
    }

    public static com.instagram.realtimeclient.RealtimeSubscription getLiveTypingIndicatorSubscription(java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r0 = java.util.UUID.randomUUID();
        r1 = r0.toString();
        r2 = new org.json.JSONObject;
        r2.<init>();
        r0 = "client_subscription_id";	 Catch:{ JSONException -> 0x0017 }
        r2.put(r0, r1);	 Catch:{ JSONException -> 0x0017 }
        r0 = "broadcast_id";	 Catch:{ JSONException -> 0x0017 }
        r2.put(r0, r3);	 Catch:{ JSONException -> 0x0017 }
    L_0x0017:
        r1 = new com.instagram.realtimeclient.RealtimeSubscription;
        r0 = "17926314067024917";
        r1.<init>(r0, r2);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.realtimeclient.RealtimeSubscription.getLiveTypingIndicatorSubscription(java.lang.String):com.instagram.realtimeclient.RealtimeSubscription");
    }

    public static com.instagram.realtimeclient.RealtimeSubscription getMediaFeedbackSubscription(java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r0 = java.util.UUID.randomUUID();
        r1 = r0.toString();
        r2 = new org.json.JSONObject;
        r2.<init>();
        r0 = "client_subscription_id";	 Catch:{ JSONException -> 0x0017 }
        r2.put(r0, r1);	 Catch:{ JSONException -> 0x0017 }
        r0 = "feedback_id";	 Catch:{ JSONException -> 0x0017 }
        r2.put(r0, r3);	 Catch:{ JSONException -> 0x0017 }
    L_0x0017:
        r1 = new com.instagram.realtimeclient.RealtimeSubscription;
        r0 = "17877917527113814";
        r1.<init>(r0, r2);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.realtimeclient.RealtimeSubscription.getMediaFeedbackSubscription(java.lang.String):com.instagram.realtimeclient.RealtimeSubscription");
    }

    public static com.instagram.realtimeclient.RealtimeSubscription getNewCommentSubscription(java.lang.String r3, java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r2 = new org.json.JSONObject;
        r2.<init>();
        r0 = "client_subscription_id";	 Catch:{ JSONException -> 0x000f }
        r2.put(r0, r3);	 Catch:{ JSONException -> 0x000f }
        r0 = "media_id";	 Catch:{ JSONException -> 0x000f }
        r2.put(r0, r4);	 Catch:{ JSONException -> 0x000f }
    L_0x000f:
        r1 = new com.instagram.realtimeclient.RealtimeSubscription;
        r0 = "17891624287114722";
        r1.<init>(r0, r2);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.realtimeclient.RealtimeSubscription.getNewCommentSubscription(java.lang.String, java.lang.String):com.instagram.realtimeclient.RealtimeSubscription");
    }

    public java.lang.String getSubscriptionString(boolean r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r4 = this;
        r3 = new org.json.JSONObject;
        r3.<init>();
        r1 = "input_data";	 Catch:{ JSONException -> 0x001e }
        r0 = r4.mInputParams;	 Catch:{ JSONException -> 0x001e }
        r3.put(r1, r0);	 Catch:{ JSONException -> 0x001e }
        if (r5 == 0) goto L_0x001e;	 Catch:{ JSONException -> 0x001e }
    L_0x000e:
        r2 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x001e }
        r2.<init>();	 Catch:{ JSONException -> 0x001e }
        r1 = "client_logged";	 Catch:{ JSONException -> 0x001e }
        r0 = 1;	 Catch:{ JSONException -> 0x001e }
        r2.put(r1, r0);	 Catch:{ JSONException -> 0x001e }
        r0 = "%options";	 Catch:{ JSONException -> 0x001e }
        r3.put(r0, r2);	 Catch:{ JSONException -> 0x001e }
    L_0x001e:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "1/graphqlsubscriptions/";
        r1.append(r0);
        r0 = r4.mSubscriptionQueryId;
        r1.append(r0);
        r0 = "/";
        r1.append(r0);
        r0 = r3.toString();
        r1.append(r0);
        r0 = r1.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.realtimeclient.RealtimeSubscription.getSubscriptionString(boolean):java.lang.String");
    }

    public static RealtimeSubscription getZeroProvisionSubscription(String str) {
        String uuid = UUID.randomUUID().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_subscription_id", uuid);
            jSONObject.put("device_id", str);
        } catch (JSONException e) {
            AnonymousClass0Dc.m1241D(TAG, "Can't create subscription intput for getZeroProvisionSubscription: deviceId %s", str, e);
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.ZERO_PROVISION_QUERY_ID, jSONObject);
    }
}
