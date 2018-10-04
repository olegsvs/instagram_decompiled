package com.instagram.realtimeclient;

import X.AnonymousClass0AH;
import X.AnonymousClass0As;
import X.AnonymousClass0CB;
import X.AnonymousClass0CC;
import X.AnonymousClass0Cf;
import X.AnonymousClass0Cm;
import X.AnonymousClass0Cq;
import X.AnonymousClass0Dc;
import X.AnonymousClass0Dt;
import X.AnonymousClass0E6;
import X.AnonymousClass0EJ;
import X.AnonymousClass0EV;
import X.AnonymousClass0FZ;
import X.AnonymousClass0Fj;
import X.AnonymousClass0Fx;
import X.AnonymousClass0G2;
import X.AnonymousClass0GG;
import X.AnonymousClass0Gn;
import X.AnonymousClass0OR;
import X.AnonymousClass0Pc;
import X.AnonymousClass0Sy;
import X.AnonymousClass0Vi;
import X.AnonymousClass0gV;
import X.AnonymousClass0gX;
import X.AnonymousClass1DG;
import X.AnonymousClass1iK;
import X.AnonymousClass1iL;
import X.AnonymousClass1iO;
import X.AnonymousClass1iP;
import X.AnonymousClass1iR;
import X.AnonymousClass1iT;
import X.AnonymousClass1iV;
import X.AnonymousClass1iX;
import X.AnonymousClass1iY;
import X.AnonymousClass1ia;
import X.AnonymousClass1ib;
import X.AnonymousClass1ic;
import X.AnonymousClass1id;
import X.AnonymousClass1ie;
import X.AnonymousClass1if;
import X.AnonymousClass1ig;
import X.AnonymousClass1ih;
import X.AnonymousClass1ii;
import X.AnonymousClass1ij;
import X.AnonymousClass1ik;
import X.AnonymousClass1il;
import X.AnonymousClass1im;
import X.AnonymousClass1in;
import X.AnonymousClass1iw;
import X.AnonymousClass1ix;
import X.AnonymousClass1iy;
import X.AnonymousClass1j2;
import X.AnonymousClass2m0;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue.IdleHandler;
import android.text.TextUtils;
import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import com.facebook.sonar.android.AndroidSonarClient;
import com.facebook.sonar.plugins.mqtt.MqttSonarPlugin;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;
import com.instagram.realtimeclient.MainRealtimeEventHandler.Delegate;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class RealtimeClientManager implements AnonymousClass0EJ, AnonymousClass0Pc, AnonymousClass0G2 {
    private static final String APP_FOREGROUND_CONDITION = "APP_FOREGROUND";
    private static final Charset CHARSET_UTF8 = Charset.forName("UTF-8");
    private static final String CLIENT_TYPE = "cookie_auth";
    private static final String DEFAULT_MQTT_HOST_NAME = "edge-mqtt.facebook.com";
    private static final int MQTT_STATE_DESTROYED = 1;
    private static final int MQTT_STATE_STARTED = 2;
    private static final int MQTT_STATE_STOPPED = 3;
    private static final int MQTT_STATE_UNSET = -1;
    private static final String SOFT_ERROR_TAG = "RealtimeClientManager";
    private static final Class TAG = RealtimeClientManager.class;
    private static GraphQLSubscriptionsProvider sGraphQLSubscriptionsProvider;
    private static final List sOtherRealtimeEventHandlerProviders = new ArrayList();
    private static RawSkywalkerSubscriptionsProvider sRawSkywalkerSubscriptionsProvider;
    private static final Set sRealtimeDelegateProviders = new HashSet();
    private final Set mConnectionKeepAliveConditions = new HashSet();
    private final Context mContext;
    private final Handler mDelayHandler = new Handler(Looper.getMainLooper());
    private final Runnable mDelayStopRunnable = new C00451();
    private boolean mIsInitializingMqttClient;
    private final MainRealtimeEventHandler mMasterRealtimeEventHandler;
    public AnonymousClass1iP mMqttClient;
    public int mMqttTargetState = -1;
    public final Set mObservers = new HashSet();
    private final List mRawSkywalkerSubscriptions = new ArrayList();
    private RealtimeClientConfig mRealtimeClientConfig;
    private final CopyOnWriteArraySet mRealtimeEventHandlers = new CopyOnWriteArraySet();
    private RealtimeMqttClientConfig mRealtimeMqttClientConfig;
    private final List mRealtimeSubscriptions = new ArrayList();
    private final AnonymousClass0Cm mUserSession;
    public AnonymousClass0gX mZeroTokenManager;

    public interface GraphQLSubscriptionsProvider {
        List get(AnonymousClass0Cm anonymousClass0Cm);
    }

    public interface RawSkywalkerSubscriptionsProvider {
        List get(AnonymousClass0Cm anonymousClass0Cm);
    }

    public interface RealtimeDelegateProvider {
        Delegate get(AnonymousClass0Cm anonymousClass0Cm);
    }

    public abstract class MessageDeliveryCallback {
        private long mStartSendingTimestampInMs;

        public abstract void onFailure(Integer num, String str);

        public abstract void onSuccess(String str, String str2, long j, Long l);

        public abstract void onTimeout();

        public long getStartSendingTimestampInMs() {
            return this.mStartSendingTimestampInMs;
        }

        public void setStartSendingTimestampInMs(long j) {
            this.mStartSendingTimestampInMs = j;
        }
    }

    /* renamed from: com.instagram.realtimeclient.RealtimeClientManager$1 */
    public class C00451 implements Runnable {
        public void run() {
            if (AnonymousClass0Fj.f2192B.m1668C()) {
                RealtimeClientManager.this.removeKeepAliveCondition(RealtimeClientManager.APP_FOREGROUND_CONDITION);
            }
        }
    }

    /* renamed from: com.instagram.realtimeclient.RealtimeClientManager$2 */
    public class C00462 implements Runnable {
        public void run() {
            if (!AnonymousClass0Fj.f2192B.m1668C()) {
                RealtimeClientManager.this.onAppForegrounded();
            }
        }
    }

    /* renamed from: com.instagram.realtimeclient.RealtimeClientManager$3 */
    public class C00473 implements IdleHandler {

        /* renamed from: com.instagram.realtimeclient.RealtimeClientManager$3$1 */
        public class C00501 implements Runnable {
            public void run() {
                RealtimeClientManager.initMqttClientInBackground(RealtimeClientManager.this);
            }
        }

        public boolean queueIdle() {
            AnonymousClass0GG.m1763B(AnonymousClass0Fx.m1698B(), new C00501(), 962957373);
            return false;
        }
    }

    public RealtimeClientManager(Context context, AnonymousClass0Cm anonymousClass0Cm, RealtimeClientConfig realtimeClientConfig, MainRealtimeEventHandler mainRealtimeEventHandler) {
        this.mUserSession = anonymousClass0Cm;
        this.mContext = context.getApplicationContext();
        this.mRealtimeClientConfig = realtimeClientConfig;
        this.mMasterRealtimeEventHandler = mainRealtimeEventHandler;
        if (!((Boolean) AnonymousClass0CC.aa.m846H(anonymousClass0Cm)).booleanValue()) {
            initRealtimeEventHandlers();
        }
        AnonymousClass0Fj.f2192B.m1666A(this);
        AnonymousClass0Sy.m4437F(new C00462());
    }

    public void addKeepAliveCondition(String str) {
        if (!this.mConnectionKeepAliveConditions.add(str) || this.mConnectionKeepAliveConditions.size() != 1) {
            return;
        }
        if (this.mMqttTargetState == 2) {
            AnonymousClass1iP anonymousClass1iP = this.mMqttClient;
            if (anonymousClass1iP != null) {
                AnonymousClass1iP.m12658B(anonymousClass1iP);
                AnonymousClass0OR.m3624D(anonymousClass1iP.f21638E, new AnonymousClass1j2(anonymousClass1iP), 1773727167);
                return;
            }
            return;
        }
        startMqttClient();
    }

    public static synchronized void addOtherRealtimeEventHandlerProvider(RealtimeEventHandlerProvider realtimeEventHandlerProvider) {
        synchronized (RealtimeClientManager.class) {
            sOtherRealtimeEventHandlerProviders.add(realtimeEventHandlerProvider);
        }
    }

    public static synchronized void addRealtimeDelegateProvider(RealtimeDelegateProvider realtimeDelegateProvider) {
        synchronized (RealtimeClientManager.class) {
            sRealtimeDelegateProviders.add(realtimeDelegateProvider);
        }
    }

    private void addSubscriptions() {
        Collection collection = getRawSkywalkerSubscriptionsProvider().get(this.mUserSession);
        Collection collection2 = getGraphQLSubscriptionsProvider().get(this.mUserSession);
        synchronized (this.mRawSkywalkerSubscriptions) {
            try {
                this.mRawSkywalkerSubscriptions.addAll(collection);
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    break;
                }
            }
        }
        synchronized (this.mRealtimeSubscriptions) {
            try {
                this.mRealtimeSubscriptions.addAll(collection2);
            } catch (Throwable th3) {
                th2 = th3;
                throw th2;
            }
        }
    }

    private void collectObservers() {
        if (this.mRealtimeClientConfig.getMQTTAnalyticsLoggingEnabled()) {
            synchronized (this.mObservers) {
                try {
                    this.mObservers.add(new AnalyticsLoggingObserver(this.mRealtimeClientConfig.getLogReceiveMessageSampleRate()));
                } catch (Throwable th) {
                    Throwable th2 = th;
                    throw th2;
                }
            }
        }
        if (AnonymousClass0CB.m834D()) {
            MqttSonarPlugin mqttSonarPlugin = (MqttSonarPlugin) AndroidSonarClient.getInstance(this.mContext).getPlugin("mqtt");
            synchronized (this.mObservers) {
                try {
                    this.mObservers.add(new SonarLoggingObserver(mqttSonarPlugin));
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
            }
        }
    }

    private AnonymousClass1iK createMqttAuthCredentials() {
        if (this.mUserSession.f1758B) {
            return null;
        }
        String F = AnonymousClass0Cf.m976F(this.mUserSession);
        if (F == null) {
            AnonymousClass0Gn.m1881H(SOFT_ERROR_TAG, "Trying to initialize MQTT when sessionId is null");
            return null;
        }
        AnonymousClass0Cm anonymousClass0Cm = this.mUserSession;
        String B = AnonymousClass0Cf.m972B(AnonymousClass0Cf.m976F(anonymousClass0Cm));
        if (B == null) {
            B = anonymousClass0Cm.f1759C;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("sessionid=");
        stringBuilder.append(F);
        return AnonymousClass1iK.m12656B(B, stringBuilder.toString());
    }

    private AnonymousClass1iP createMqttClient(RealtimeMqttClientConfig realtimeMqttClientConfig, AnonymousClass1iK anonymousClass1iK) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(RealtimeConstants.MQTT_TOPIC_SKYWALKER);
        arrayList.add(RealtimeConstants.MQTT_TOPIC_SEND_MESSAGE_RESPONSE);
        arrayList.add(RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE);
        arrayList.add(RealtimeConstants.MQTT_TOPIC_REGION_HINT);
        if (this.mRealtimeClientConfig.getSubscribeDirectIris()) {
            arrayList.add(RealtimeConstants.MQTT_TOPIC_SUB_IRIS_RESPONSE);
            arrayList.add(RealtimeConstants.MQTT_TOPIC_MESSAGE_SYNC);
        }
        Context context = r4.mContext;
        AnonymousClass1iL anonymousClass1iL = new AnonymousClass1iL(context, anonymousClass1iK, AnonymousClass0Cq.f1767B, AnonymousClass0Dt.f1941C.m1313B(), AnonymousClass0Cq.f1769D, CLIENT_TYPE, r4, r4, null, arrayList, r4.mRealtimeClientConfig.isDisconnectOnNetworkLostEnabled());
        AnonymousClass1iO anonymousClass1iO = new AnonymousClass1iO();
        AnonymousClass1iP anonymousClass1iP = new AnonymousClass1iP(realtimeMqttClientConfig);
        synchronized (anonymousClass1iP) {
            AnonymousClass1DG.m10047C(anonymousClass1iL);
            if (anonymousClass1iP.f21640G) {
                throw new RuntimeException("This client has already been initialized");
            }
            anonymousClass1iP.f21643J = anonymousClass1iL;
            anonymousClass1iP.f21635B = anonymousClass1iL.f21625C;
            String str = anonymousClass1iL.f21624B;
            String str2 = anonymousClass1iL.f21628F;
            String str3 = anonymousClass1iL.f21634L;
            String str4 = anonymousClass1iL.f21627E;
            anonymousClass1iP.f21648O = anonymousClass1iL.f21631I;
            anonymousClass1iP.f21641H = anonymousClass1iL.f21630H;
            anonymousClass1iP.f21649P = anonymousClass1iL.f21632J;
            anonymousClass1iP.f21639F = new HandlerThread("MqttThread");
            anonymousClass1iP.f21636C = new AnonymousClass1iR(anonymousClass1iP.f21642I.getMqttConnectionConfig(), anonymousClass1iP.f21642I.getMqttConnectionPreferredTier(), anonymousClass1iP.f21642I.getMqttConnectionPreferredSandbox(), anonymousClass1iP);
            anonymousClass1iP.f21636C.mo128E();
            AnonymousClass1iV anonymousClass1iV = new AnonymousClass1iV(str, str3, str2);
            anonymousClass1iP.f21645L = new AnonymousClass1iX(anonymousClass1iL.f21626D, str4);
            anonymousClass1iP.f21639F.start();
            anonymousClass1iP.f21638E = new Handler(anonymousClass1iP.f21639F.getLooper());
            int healthStatsSamplingRate = anonymousClass1iP.f21642I.getHealthStatsSamplingRate();
            boolean z = true;
            if (healthStatsSamplingRate < 0 || healthStatsSamplingRate > 10000) {
                AnonymousClass0Dc.m1255R("MqttClientImpl", "Wrong health stats sampling rate found in configuration: %d. Defaulting to 1", Integer.valueOf(healthStatsSamplingRate));
                healthStatsSamplingRate = 1;
            }
            if (new Random().nextInt(10000) >= healthStatsSamplingRate) {
                z = false;
            }
            AnonymousClass1ib anonymousClass1ib = new AnonymousClass1ib(anonymousClass1iP);
            AnonymousClass1ia anonymousClass1ia = new AnonymousClass1ia(anonymousClass1iP.f21643J.f21629G);
            AnonymousClass2m0 anonymousClass2m0 = new AnonymousClass2m0(anonymousClass1iP, anonymousClass1ia);
            AnonymousClass0As anonymousClass0As = new AnonymousClass0As();
            Context context2 = anonymousClass1iP.f21635B;
            AnonymousClass1ic anonymousClass1ic = AnonymousClass1ic.MqttSimpleClient;
            AnonymousClass1iY anonymousClass1iY = anonymousClass1iP.f21645L;
            AnonymousClass1ie anonymousClass1id = new AnonymousClass1id();
            AnonymousClass1iT anonymousClass1iT = anonymousClass1iP.f21636C;
            AnonymousClass1if anonymousClass1if = new AnonymousClass1if(anonymousClass1iP.f21642I.getEndpointCapabilities());
            Handler handler = anonymousClass1iP.f21638E;
            AnonymousClass1ig anonymousClass1ig = new AnonymousClass1ig();
            AnonymousClass1ih analyticsLogger = anonymousClass1iP.f21642I.getAnalyticsLogger();
            String customAnalyticsEventNameSuffix = anonymousClass1iP.f21642I.getCustomAnalyticsEventNameSuffix();
            AnonymousClass1ii anonymousClass1ii = new AnonymousClass1ii(false);
            AnonymousClass1ij keepaliveParams = anonymousClass1iP.f21642I.getKeepaliveParams();
            AnonymousClass1ik anonymousClass1ik = new AnonymousClass1ik();
            AnonymousClass1ii anonymousClass1ii2 = new AnonymousClass1ii(false);
            Map appSpecificInfo = anonymousClass1iP.f21642I.getAppSpecificInfo();
            AnonymousClass1im anonymousClass1im = null;
            Context context3 = context2;
            AnonymousClass1ia anonymousClass1ia2 = anonymousClass1ia;
            AnonymousClass1il anonymousClass1il = new AnonymousClass1il(context3, anonymousClass1ic, anonymousClass1ia2, anonymousClass1iP, anonymousClass1iV, anonymousClass1iY, anonymousClass1id, anonymousClass1iT, anonymousClass2m0, anonymousClass1if, handler, anonymousClass1ig, anonymousClass0As, null, analyticsLogger, customAnalyticsEventNameSuffix, anonymousClass1ii, anonymousClass1ib, false, keepaliveParams, anonymousClass1ik, null, str, anonymousClass1ii2, new AnonymousClass0AH(anonymousClass1iP.f21635B), false, false, z, false, false, false, appSpecificInfo, false, anonymousClass1im, false, anonymousClass1im, false, false, false, 0, false, false, -1, -1, 0, false, -1, anonymousClass1im, false, false, null, null);
            AnonymousClass1in anonymousClass1in = new AnonymousClass1in();
            List<String> list = anonymousClass1iL.f21633K;
            List arrayList2 = new ArrayList();
            for (String subscribeTopic : list) {
                arrayList2.add(new SubscribeTopic(subscribeTopic, 1));
            }
            anonymousClass1in.m12707A(anonymousClass1il, arrayList2);
            anonymousClass1iP.f21637D = anonymousClass1in.f21819H;
            anonymousClass1iP.f21644K = anonymousClass1in.f21828Q;
            anonymousClass1iP.f21646M = anonymousClass1in.f21829R;
            anonymousClass1iP.f21647N = anonymousClass1in.f21831T;
            anonymousClass1iP.f21640G = true;
        }
        return anonymousClass1iP;
    }

    public static void destroyMqttClient(RealtimeClientManager realtimeClientManager) {
        Throwable th;
        realtimeClientManager.mMqttTargetState = 1;
        if (realtimeClientManager.mMqttClient != null) {
            AnonymousClass0gX anonymousClass0gX = realtimeClientManager.mZeroTokenManager;
            if (anonymousClass0gX != null) {
                anonymousClass0gX.sJA(realtimeClientManager);
            }
            synchronized (realtimeClientManager.mRawSkywalkerSubscriptions) {
                try {
                    realtimeClientManager.mRawSkywalkerSubscriptions.clear();
                } catch (Throwable th2) {
                    while (true) {
                        th = th2;
                        break;
                    }
                }
            }
            synchronized (realtimeClientManager.mRealtimeSubscriptions) {
                try {
                    realtimeClientManager.mRealtimeSubscriptions.clear();
                } catch (Throwable th3) {
                    while (true) {
                        th = th3;
                    }
                }
            }
            realtimeClientManager.mRealtimeEventHandlers.clear();
            if (realtimeClientManager.mRealtimeClientConfig.getManageMqttThread()) {
                AnonymousClass1iP anonymousClass1iP = realtimeClientManager.mMqttClient;
                AnonymousClass1iP.m12658B(anonymousClass1iP);
                AnonymousClass0OR.m3624D(anonymousClass1iP.f21638E, new AnonymousClass1iw(anonymousClass1iP), 212518296);
            } else {
                realtimeClientManager.mMqttClient.m12665C();
            }
            realtimeClientManager.mZeroTokenManager = null;
            realtimeClientManager.mRealtimeMqttClientConfig = null;
            return;
        }
        return;
        throw th;
    }

    public static synchronized GraphQLSubscriptionsProvider getGraphQLSubscriptionsProvider() {
        GraphQLSubscriptionsProvider graphQLSubscriptionsProvider;
        synchronized (RealtimeClientManager.class) {
            graphQLSubscriptionsProvider = sGraphQLSubscriptionsProvider;
        }
        return graphQLSubscriptionsProvider;
    }

    public static synchronized RealtimeClientManager getInstance(AnonymousClass0Cm anonymousClass0Cm) {
        RealtimeClientManager realtimeClientManager;
        Class cls = RealtimeClientManager.class;
        synchronized (cls) {
            realtimeClientManager = (RealtimeClientManager) anonymousClass0Cm.m1036A(cls);
            if (realtimeClientManager == null) {
                DLog.m8808d(DLogTag.REAL_TIME, "[Realtime] Init instance", new Object[0]);
                realtimeClientManager = new RealtimeClientManager(AnonymousClass0EV.f1977B, anonymousClass0Cm, new RealtimeClientConfig(anonymousClass0Cm), new MainRealtimeEventHandler(anonymousClass0Cm));
                anonymousClass0Cm.m1039D(cls, realtimeClientManager);
            }
        }
        return realtimeClientManager;
    }

    public static String getLatestMqttHost(AnonymousClass0gX anonymousClass0gX) {
        String string;
        if (useMqttSandbox()) {
            string = AnonymousClass0FZ.m1634B().f2177B.getString("mqtt_server_name", JsonProperty.USE_DEFAULT_NAME);
        } else {
            string = DEFAULT_MQTT_HOST_NAME;
        }
        return anonymousClass0gX.aLA(string);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getMqttTargetState() {
        /*
        r3 = this;
        r0 = r3.mIsInitializingMqttClient;
        r2 = -1;
        if (r0 == 0) goto L_0x0011;
    L_0x0005:
        r0 = r3.mMqttTargetState;
        r1 = 0;
        if (r0 == r2) goto L_0x000c;
    L_0x000a:
        r0 = 1;
        goto L_0x000d;
    L_0x000c:
        r0 = 0;
    L_0x000d:
        X.AnonymousClass0LH.m2930H(r0);
        return r1;
    L_0x0011:
        r0 = r3.mMqttTargetState;
        if (r0 == r2) goto L_0x0053;
    L_0x0015:
        switch(r0) {
            case 1: goto L_0x0053;
            case 2: goto L_0x0019;
            case 3: goto L_0x0053;
            default: goto L_0x0018;
        };
    L_0x0018:
        goto L_0x0038;
    L_0x0019:
        r0 = r3.mMqttClient;
        if (r0 != 0) goto L_0x0020;
    L_0x001d:
        r0 = 99;
        return r0;
    L_0x0020:
        r0 = r3.mMqttClient;
        r0 = r0.m12663A();
        r0 = r0.f21879B;
        r0 = r0.f5766B;
        r0 = r0.ordinal();
        switch(r0) {
            case 0: goto L_0x0036;
            case 1: goto L_0x0034;
            case 2: goto L_0x0032;
            default: goto L_0x0031;
        };
    L_0x0031:
        goto L_0x0038;
    L_0x0032:
        r0 = 2;
        return r0;
    L_0x0034:
        r0 = 5;
        return r0;
    L_0x0036:
        r0 = 4;
        return r0;
    L_0x0038:
        r2 = "RealtimeClientManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Mqtt target state is unknown: ";
        r1.append(r0);
        r0 = r3.mMqttTargetState;
        r1.append(r0);
        r0 = r1.toString();
        X.AnonymousClass0Gn.m1881H(r2, r0);
        r0 = 98;
        return r0;
    L_0x0053:
        r0 = r3.mMqttTargetState;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.realtimeclient.RealtimeClientManager.getMqttTargetState():int");
    }

    public static synchronized RawSkywalkerSubscriptionsProvider getRawSkywalkerSubscriptionsProvider() {
        RawSkywalkerSubscriptionsProvider rawSkywalkerSubscriptionsProvider;
        synchronized (RealtimeClientManager.class) {
            rawSkywalkerSubscriptionsProvider = sRawSkywalkerSubscriptionsProvider;
        }
        return rawSkywalkerSubscriptionsProvider;
    }

    public void graphqlSubscribeCommand(List list) {
        if (this.mMqttClient != null) {
            sendRealtimeSubscription(RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE, list, null, AnonymousClass1ix.FIRE_AND_FORGET);
        }
        synchronized (this.mRealtimeSubscriptions) {
            this.mRealtimeSubscriptions.addAll(list);
        }
    }

    public void graphqlUnsubscribeCommand(List list) {
        if (this.mMqttClient != null) {
            sendRealtimeSubscription(RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE, null, list, AnonymousClass1ix.FIRE_AND_FORGET);
        }
        synchronized (this.mRealtimeSubscriptions) {
            this.mRealtimeSubscriptions.removeAll(list);
        }
    }

    private void initMqttClient() {
        if (!this.mIsInitializingMqttClient) {
            this.mIsInitializingMqttClient = true;
            Looper.myQueue().addIdleHandler(new C00473());
        }
    }

    public static void initMqttClientInBackground(RealtimeClientManager realtimeClientManager) {
        RealtimeClientManager realtimeClientManager2 = realtimeClientManager;
        AnonymousClass1iK createMqttAuthCredentials = realtimeClientManager.createMqttAuthCredentials();
        if (createMqttAuthCredentials != null) {
            realtimeClientManager.mRealtimeClientConfig.loadConfig();
            RealtimeMqttClientConfig realtimeMqttClientConfig = new RealtimeMqttClientConfig(realtimeClientManager.mUserSession, realtimeClientManager.mRealtimeClientConfig);
            AnonymousClass0gX B = AnonymousClass0gV.m6626B(realtimeClientManager.mUserSession);
            realtimeMqttClientConfig.setHost(getLatestMqttHost(B), useMqttSandbox());
            AnonymousClass1iP createMqttClient = realtimeClientManager.createMqttClient(realtimeMqttClientConfig, createMqttAuthCredentials);
            realtimeClientManager = realtimeClientManager.mRealtimeClientConfig.getEarlyStartMqttClient();
            if (realtimeClientManager != null) {
                createMqttClient.m12664B();
            }
            realtimeClientManager2.initRealtimeEventHandlers();
            realtimeClientManager2.collectObservers();
            realtimeClientManager2.addSubscriptions();
            AnonymousClass0Sy.m4437F(new RealtimeClientManager$4(realtimeClientManager2, createMqttClient, realtimeMqttClientConfig, B, realtimeClientManager));
        }
    }

    private synchronized void initRealtimeEventHandlers() {
        if (this.mRealtimeEventHandlers.isEmpty()) {
            for (RealtimeDelegateProvider realtimeDelegateProvider : sRealtimeDelegateProviders) {
                Delegate delegate = realtimeDelegateProvider.get(this.mUserSession);
                if (delegate != null) {
                    this.mMasterRealtimeEventHandler.addProtocolDelegate(delegate.getProtocol(), delegate);
                }
            }
            this.mRealtimeEventHandlers.add(this.mMasterRealtimeEventHandler);
            for (RealtimeEventHandlerProvider realtimeEventHandlerProvider : sOtherRealtimeEventHandlerProviders) {
                RealtimeEventHandler realtimeEventHandler = realtimeEventHandlerProvider.get(this.mUserSession);
                if (realtimeEventHandler != null) {
                    this.mRealtimeEventHandlers.add(realtimeEventHandler);
                }
            }
        }
    }

    public static synchronized boolean isInitialized(AnonymousClass0Cm anonymousClass0Cm) {
        boolean z;
        Class cls = RealtimeClientManager.class;
        synchronized (cls) {
            z = ((RealtimeClientManager) anonymousClass0Cm.m1036A(cls)) != null;
        }
        return z;
    }

    public boolean isReceivingRealtime() {
        AnonymousClass1iP anonymousClass1iP = this.mMqttClient;
        return (anonymousClass1iP == null || !anonymousClass1iP.m12663A().f21879B.m4898A() || AnonymousClass0Fj.f2192B.m1668C()) ? false : true;
    }

    public boolean isSendingAvailable() {
        AnonymousClass1iP anonymousClass1iP = this.mMqttClient;
        return anonymousClass1iP != null && anonymousClass1iP.m12663A().f21879B.m4898A();
    }

    public void onAppBackgrounded() {
        if (this.mMqttClient != null) {
            AnonymousClass0OR.m3627G(this.mDelayHandler, this.mDelayStopRunnable, 692820018);
            AnonymousClass0OR.m3626F(this.mDelayHandler, this.mDelayStopRunnable, (long) this.mRealtimeClientConfig.getDelayDisconnectMQTTMS(), 426414532);
        }
    }

    public void onAppForegrounded() {
        AnonymousClass0OR.m3627G(this.mDelayHandler, this.mDelayStopRunnable, -1868124165);
        addKeepAliveCondition(APP_FOREGROUND_CONDITION);
    }

    public void onChannelStateChanged(AnonymousClass0Vi anonymousClass0Vi) {
        if (((Boolean) AnonymousClass0E6.m1318D(AnonymousClass0CC.ta, this.mUserSession)).booleanValue() && this.mRealtimeEventHandlers.isEmpty()) {
            initRealtimeEventHandlers();
        }
        synchronized (this.mObservers) {
            try {
                for (RealtimeClientManager$Observer onConnectionChanged : this.mObservers) {
                    onConnectionChanged.onConnectionChanged(anonymousClass0Vi);
                }
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    break;
                }
            }
        }
        if (anonymousClass0Vi.m4898A()) {
            synchronized (this.mRawSkywalkerSubscriptions) {
                try {
                    if (!this.mRawSkywalkerSubscriptions.isEmpty()) {
                        sendSkywalkerCommand(RealtimeConstants.MQTT_TOPIC_SKYWALKER, this.mRawSkywalkerSubscriptions, null, AnonymousClass1ix.ACKNOWLEDGED_DELIVERY);
                    }
                } catch (Throwable th3) {
                    while (true) {
                        th2 = th3;
                        break;
                    }
                }
            }
            synchronized (this.mRealtimeSubscriptions) {
                try {
                    if (!this.mRealtimeSubscriptions.isEmpty()) {
                        sendRealtimeSubscription(RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE, this.mRealtimeSubscriptions, null, AnonymousClass1ix.ACKNOWLEDGED_DELIVERY);
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    throw th2;
                }
            }
        }
        Iterator it = this.mRealtimeEventHandlers.iterator();
        while (it.hasNext()) {
            ((RealtimeEventHandler) it.next()).onMqttChannelStateChanged(anonymousClass0Vi);
        }
    }

    public synchronized void onMessageArrived(AnonymousClass1iy anonymousClass1iy) {
        String num;
        Object payloadAsString;
        String str = anonymousClass1iy.f21922C;
        if (RealtimeConstants.MQTT_TOPIC_SKYWALKER.equals(str)) {
            SkywalkerMessage skywalkerMessage = new SkywalkerMessage(anonymousClass1iy.f21921B);
            num = Integer.toString(skywalkerMessage.getMessageType().intValue());
            payloadAsString = skywalkerMessage.getPayloadAsString();
        } else if (RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str)) {
            GraphQLSubscriptionMessage graphQLSubscriptionMessage = new GraphQLSubscriptionMessage(anonymousClass1iy.f21921B);
            num = graphQLSubscriptionMessage.getMessageTopicAsString();
            payloadAsString = graphQLSubscriptionMessage.getMessagePayloadAsString();
        } else {
            num = null;
            payloadAsString = new String(anonymousClass1iy.f21921B, CHARSET_UTF8);
        }
        synchronized (this.mObservers) {
            for (RealtimeClientManager$Observer onMessage : this.mObservers) {
                onMessage.onMessage(str, num, payloadAsString);
            }
        }
        Iterator it = this.mRealtimeEventHandlers.iterator();
        while (it.hasNext()) {
            RealtimeEventHandler realtimeEventHandler = (RealtimeEventHandler) it.next();
            if (realtimeEventHandler.canHandleRealtimeEvent(str, num)) {
                if (!TextUtils.isEmpty(payloadAsString)) {
                    boolean D = AnonymousClass0CB.m834D();
                    realtimeEventHandler.onRealtimeEventPayload(str, num, payloadAsString);
                }
            }
        }
    }

    public synchronized void onTokenChange() {
        if (this.mRealtimeMqttClientConfig != null) {
            this.mRealtimeMqttClientConfig.setHost(getLatestMqttHost(this.mZeroTokenManager), useMqttSandbox());
        }
    }

    public void onUserSessionWillEnd(boolean z) {
        destroyMqttClient(this);
        AnonymousClass0Fj.f2192B.m1669D(this);
    }

    public synchronized void publish(java.lang.String r17, java.lang.String r18, X.AnonymousClass1ix r19, boolean r20) {
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
        r16 = this;
        r11 = r16;
        monitor-enter(r11);
        r15 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0078 }
        r2 = r11.mObservers;	 Catch:{ all -> 0x0078 }
        monitor-enter(r2);	 Catch:{ all -> 0x0078 }
        r0 = r11.mObservers;	 Catch:{ all -> 0x0075 }
        r1 = r0.iterator();	 Catch:{ all -> 0x0075 }
    L_0x0010:
        r0 = r1.hasNext();	 Catch:{ all -> 0x0075 }
        r6 = r17;	 Catch:{ all -> 0x0075 }
        r7 = r18;	 Catch:{ all -> 0x0075 }
        r9 = r20;	 Catch:{ all -> 0x0075 }
        if (r0 == 0) goto L_0x0029;	 Catch:{ all -> 0x0075 }
    L_0x001c:
        r5 = r1.next();	 Catch:{ all -> 0x0075 }
        r5 = (com.instagram.realtimeclient.RealtimeClientManager$Observer) r5;	 Catch:{ all -> 0x0075 }
        r8 = "attempt";	 Catch:{ all -> 0x0075 }
        r10 = 0;	 Catch:{ all -> 0x0075 }
        r5.onSendMessage(r6, r7, r8, r9, r10);	 Catch:{ all -> 0x0075 }
        goto L_0x0010;	 Catch:{ all -> 0x0075 }
    L_0x0029:
        monitor-exit(r2);	 Catch:{ all -> 0x0075 }
        r0 = r11.mMqttClient;	 Catch:{ all -> 0x0078 }
        if (r0 == 0) goto L_0x0073;	 Catch:{ all -> 0x0078 }
    L_0x002e:
        r5 = r11.mMqttClient;	 Catch:{ all -> 0x0078 }
        r0 = CHARSET_UTF8;	 Catch:{ all -> 0x0078 }
        r4 = r7.getBytes(r0);	 Catch:{ all -> 0x0078 }
        r10 = new com.instagram.realtimeclient.RealtimeClientManager$5;	 Catch:{ all -> 0x0078 }
        r12 = r6;	 Catch:{ all -> 0x0078 }
        r13 = r7;	 Catch:{ all -> 0x0078 }
        r14 = r9;	 Catch:{ all -> 0x0078 }
        r10.<init>(r11, r12, r13, r14, r15);	 Catch:{ all -> 0x0078 }
        X.AnonymousClass1iP.m12658B(r5);	 Catch:{ all -> 0x0078 }
        X.AnonymousClass1DG.m10047C(r6);	 Catch:{ all -> 0x0078 }
        X.AnonymousClass1DG.m10047C(r4);	 Catch:{ all -> 0x0078 }
        r0 = r19;	 Catch:{ all -> 0x0078 }
        X.AnonymousClass1DG.m10047C(r0);	 Catch:{ all -> 0x0078 }
        r3 = 1;	 Catch:{ all -> 0x0078 }
        r2 = r5.f21637D;	 Catch:{ 1j3 -> 0x0067 }
        r0 = r0.f21920B;	 Catch:{ 1j3 -> 0x0067 }
        r1 = X.AnonymousClass1iz.m12725B(r0);	 Catch:{ 1j3 -> 0x0067 }
        if (r10 != 0) goto L_0x0059;	 Catch:{ 1j3 -> 0x0067 }
    L_0x0057:
        r0 = 0;	 Catch:{ 1j3 -> 0x0067 }
        goto L_0x005e;	 Catch:{ 1j3 -> 0x0067 }
    L_0x0059:
        r0 = new X.1j1;	 Catch:{ 1j3 -> 0x0067 }
        r0.<init>(r5, r10);	 Catch:{ 1j3 -> 0x0067 }
    L_0x005e:
        r1 = r2.m12695K(r6, r4, r1, r0);	 Catch:{ 1j3 -> 0x0067 }
        r0 = -1;	 Catch:{ 1j3 -> 0x0067 }
        if (r1 != r0) goto L_0x0066;	 Catch:{ 1j3 -> 0x0067 }
    L_0x0065:
        goto L_0x0067;	 Catch:{ 1j3 -> 0x0067 }
    L_0x0066:
        r3 = 0;	 Catch:{ 1j3 -> 0x0067 }
    L_0x0067:
        if (r3 == 0) goto L_0x0073;
    L_0x0069:
        if (r10 == 0) goto L_0x0073;
    L_0x006b:
        r0 = new X.2lz;	 Catch:{ all -> 0x0078 }
        r0.<init>(r5, r10);	 Catch:{ all -> 0x0078 }
        X.AnonymousClass1iP.m12660D(r5, r0);	 Catch:{ all -> 0x0078 }
    L_0x0073:
        monitor-exit(r11);
        return;
    L_0x0075:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0075 }
        throw r0;	 Catch:{ all -> 0x0078 }
    L_0x0078:
        r0 = move-exception;
        monitor-exit(r11);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.realtimeclient.RealtimeClientManager.publish(java.lang.String, java.lang.String, X.1ix, boolean):void");
    }

    public void rawSubscribeCommand(List list) {
        if (this.mMqttClient != null) {
            sendSkywalkerCommand(RealtimeConstants.MQTT_TOPIC_SKYWALKER, list, null, AnonymousClass1ix.FIRE_AND_FORGET);
        }
        synchronized (this.mRawSkywalkerSubscriptions) {
            this.mRawSkywalkerSubscriptions.addAll(list);
        }
    }

    public void rawUnSubscribeCommand(List list) {
        if (this.mMqttClient != null) {
            sendSkywalkerCommand(RealtimeConstants.MQTT_TOPIC_SKYWALKER, null, list, AnonymousClass1ix.FIRE_AND_FORGET);
        }
        synchronized (this.mRawSkywalkerSubscriptions) {
            this.mRawSkywalkerSubscriptions.removeAll(list);
        }
    }

    public void removeKeepAliveCondition(String str) {
        if (this.mConnectionKeepAliveConditions.remove(str) && this.mConnectionKeepAliveConditions.isEmpty()) {
            stopMqttClient();
        }
    }

    public void sendCommand(String str, String str2, MessageDeliveryCallback messageDeliveryCallback) {
        if (this.mMqttClient != null) {
            publish(RealtimeConstants.MQTT_TOPIC_SEND_MESSAGE, str2, AnonymousClass1ix.FIRE_AND_FORGET, false);
            this.mMasterRealtimeEventHandler.onSendRealtimeCommand(str, messageDeliveryCallback);
            return;
        }
        AnonymousClass0Gn.m1881H(SOFT_ERROR_TAG, "Trying to send command without enabling MQTT");
    }

    private void sendRealtimeSubscription(String str, List list, List list2, AnonymousClass1ix anonymousClass1ix) {
        Collection hashSet;
        List arrayList;
        List list3 = null;
        if (list != null) {
            if (!list.isEmpty()) {
                hashSet = new HashSet();
                for (RealtimeSubscription subscriptionString : list) {
                    hashSet.add(subscriptionString.getSubscriptionString(this.mRealtimeClientConfig.getMQTTAnalyticsLoggingEnabled()));
                }
                arrayList = new ArrayList(hashSet);
                if (list2 != null) {
                    if (list2.isEmpty()) {
                        hashSet = new HashSet();
                        for (RealtimeSubscription subscriptionString2 : list2) {
                            hashSet.add(subscriptionString2.getSubscriptionString(this.mRealtimeClientConfig.getMQTTAnalyticsLoggingEnabled()));
                        }
                        list3 = new ArrayList(hashSet);
                    }
                }
                sendSkywalkerCommand(str, arrayList, list3, anonymousClass1ix);
            }
        }
        arrayList = null;
        if (list2 != null) {
            if (list2.isEmpty()) {
                hashSet = new HashSet();
                while (r2.hasNext()) {
                    hashSet.add(subscriptionString2.getSubscriptionString(this.mRealtimeClientConfig.getMQTTAnalyticsLoggingEnabled()));
                }
                list3 = new ArrayList(hashSet);
            }
        }
        sendSkywalkerCommand(str, arrayList, list3, anonymousClass1ix);
    }

    private void sendSkywalkerCommand(String str, List list, List list2, AnonymousClass1ix anonymousClass1ix) {
        if (this.mMqttClient != null) {
            try {
                publish(str, SkywalkerCommand__JsonHelper.serializeToJson(new SkywalkerCommand(list, list2, null)), anonymousClass1ix, true);
                return;
            } catch (Throwable e) {
                throw new IllegalStateException("error serializing skywalker command", e);
            }
        }
        AnonymousClass0Gn.m1881H(SOFT_ERROR_TAG, "Trying to subscribe to skywalker without enabling MQTT");
    }

    public static synchronized void setGraphQLSubscriptionsProvider(GraphQLSubscriptionsProvider graphQLSubscriptionsProvider) {
        synchronized (RealtimeClientManager.class) {
            sGraphQLSubscriptionsProvider = graphQLSubscriptionsProvider;
        }
    }

    public static synchronized void setRawSkywalkerSubscriptionsProvider(RawSkywalkerSubscriptionsProvider rawSkywalkerSubscriptionsProvider) {
        synchronized (RealtimeClientManager.class) {
            sRawSkywalkerSubscriptionsProvider = rawSkywalkerSubscriptionsProvider;
        }
    }

    private void startMqttClient() {
        this.mMqttTargetState = 2;
        AnonymousClass1iP anonymousClass1iP = this.mMqttClient;
        if (anonymousClass1iP == null) {
            initMqttClient();
        } else {
            anonymousClass1iP.m12664B();
        }
    }

    private void stopMqttClient() {
        this.mMqttTargetState = 3;
        AnonymousClass1iP anonymousClass1iP = this.mMqttClient;
        if (anonymousClass1iP != null) {
            anonymousClass1iP.m12665C();
        }
    }

    private static boolean useMqttSandbox() {
        return !AnonymousClass0CB.m840J() && AnonymousClass0FZ.m1634B().f2177B.getBoolean("using_mqtt_sandbox", false);
    }
}
