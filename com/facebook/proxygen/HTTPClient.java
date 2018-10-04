package com.facebook.proxygen;

import com.facebook.common.dextricks.StartupQEsConfig;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;

public class HTTPClient implements NativeHandle {
    private String mActiveProbeJson;
    private String mAltsvcPersistentCacheFilename;
    private AnalyticsLogger mAnalyticsLogger;
    private AsyncTCPProbeCallback mAsyncTCPProbeCallback;
    private AsyncTracerouteCallback mAsyncTracerouteCallback;
    private String mAsyncTracerouteJson;
    private double mBackgroundDNSSampleRate;
    private int mBackupConnTimeout;
    private String mBypassProxyDomains;
    private boolean mCircularLogSinkEnabled;
    private boolean mClosed;
    private boolean mDNSCryptEnabled;
    private String[] mDNSServers;
    private boolean mDnsCacheEnabled;
    private int mDnsRequestsOutstanding;
    private int mDnsRetryPreemptIntervalMs;
    private boolean mEnableCachingPushManager = false;
    private boolean mEnableHTTP2;
    private boolean mEnableHTTP2Weights;
    private boolean mEnableLigerPreconnect = false;
    private boolean mEnablePingAfterWrite;
    private boolean mEnableSimplePreconnectForReinit = false;
    private boolean mEnableTransportCallbacks;
    private int mEvbLoggingSamplingFreq;
    private final EventBase mEventBase;
    private boolean mFizzHTTP2StaticOverride;
    private FizzSettings mFizzSettings;
    private boolean mFlowControlSelectedTxnsOnly = false;
    private int mFlowControlWindow = 65535;
    private int mHTTP2WeightHighPri;
    private int mHTTP2WeightLowPri;
    private String mHTTPSessionCacheType;
    private int mHTTPSessionMaxReadBufferSize;
    private long mHappyEyeballsConnectionDelayMillis;
    private boolean mHappyEyeballsDrivenDns;
    private int mHttpPushPolicy;
    private int mIdleHTTPSessionsLowWaterMark;
    private int mIdleTimeoutForUnusedQuicSession;
    private int mIdleTimeoutForUnusedTCPSession;
    private int mIdleTimeoutForUsedQuicSession;
    private int mIdleTimeoutForUsedTCPSession;
    private boolean mInitialized;
    private boolean mIsHTTPSEnforced;
    private boolean mIsHappyEyeballsV4Preferred;
    private boolean mIsPerDomainLimitEnabled;
    private boolean mIsSSLSessionCacheEnabled;
    private boolean mIsSandbox;
    private boolean mIsZlibFilterEnabled;
    private boolean mLargerFlowControlWindow = false;
    private boolean mLookupInterfaceName;
    private int mMaxConcurrentOutgoingStreams;
    private int mMaxDNSCryptTries;
    private int mMaxDNSRetries;
    private int mMaxIdleHTTP2Sessions;
    private int mMaxIdleHTTPSessions;
    private int mMaxPosixTries;
    private int mMaxPriorityLevelForSession;
    private NetworkStatusMonitor mNetworkStatusMonitor;
    private long mNewConnTimeoutMillis = 30000;
    private int mPerDomainMaxConns;
    private PersistentSSLCacheSettings mPersistentDNSCacheSettings;
    private PersistentSSLCacheSettings mPersistentDNSFBCacheSettings;
    private PersistentSSLCacheSettings mPersistentSSLCacheSettings;
    private int mPingDelayInSeconds;
    private int mPingLimit;
    private boolean mPosixDualStackEnabled;
    private int mPosixResolverPoolSize;
    private String mPreConnects;
    private String mPreconnectFilePath;
    private boolean mProxyFallbackEnabled;
    private String mProxyHost;
    private String mProxyPassword;
    private int mProxyPort;
    private String mProxyUsername;
    private PushCallbacks mPushCallbacks;
    private FizzSettings mQuicFizzSettings;
    private QuicSettings mQuicSettings;
    private long mQuicTraceLoggingSampleSalt;
    private int mQuicTraceLoggingSampleWeight;
    private boolean mReInitToRefreshSettings;
    private boolean mRedirectFilter = false;
    private String[] mRewriteExemptions;
    private RewriteRule[] mRewriteRules;
    private long mRewriteRulesHandle;
    private RootCACallbacks mRootCACallbacks;
    private SSLKeyMaterialCallback mSSLKeyMaterialCallback;
    private SSLVerificationSettings mSSLVerificationSettings;
    private String mSecureProxyHost;
    private String mSecureProxyPassword;
    private int mSecureProxyPort;
    private String mSecureProxyUsername;
    private long mSessionWriteTimeoutMillis = 60000;
    private long mSettings;
    private boolean mShouldOverrideFizzHTTP2Static;
    private boolean mShouldOverrideTlsHTTP2;
    private boolean mStaleAnswersEnabled;
    private boolean mTlsHTTP2Override;
    private long mTransactionIdleTimeoutMillis = 60000;
    private boolean mUseInjectedPreconnect = false;
    private boolean mUseLoadBalancing = false;
    private boolean mUseUrlRewriteFilter;
    private String mUserAgent;
    private byte[][] mUserInstalledCertificates;

    public class HttpPushPolicy {
        public static int FACEBOOK = 0;
        public static int FACEBOOK_CDN = 1;
        public static int INSTAGRAM = 2;
    }

    private native void close(EventBase eventBase);

    private native void connect(EventBase eventBase, String[] strArr);

    private native void init(EventBase eventBase, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, boolean z5, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z6, boolean z7, String str3, int i9, String str4, String str5, String str6, int i10, String str7, String str8, String str9, boolean z8, PersistentSSLCacheSettings persistentSSLCacheSettings, SSLVerificationSettings sSLVerificationSettings, byte[][] bArr, boolean z9, long j, long j2, long j3, long j4, String[] strArr, PersistentSSLCacheSettings persistentSSLCacheSettings2, PersistentSSLCacheSettings persistentSSLCacheSettings3, boolean z10, boolean z11, int i11, NetworkStatusMonitor networkStatusMonitor, RewriteRule[] rewriteRuleArr, String[] strArr2, AnalyticsLogger analyticsLogger, String str10, boolean z12, int i12, boolean z13, int i13, boolean z14, int i14, PushCallbacks pushCallbacks, boolean z15, boolean z16, boolean z17, boolean z18, String str11, boolean z19, boolean z20, String str12, AsyncTCPProbeCallback asyncTCPProbeCallback, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, FizzSettings fizzSettings, boolean z27, boolean z28, int i15, int i16, int i17, int i18, double d, int i19, boolean z29, boolean z30, int i20, int i21, int i22, int i23, String str13, AsyncTracerouteCallback asyncTracerouteCallback, int i24, RootCACallbacks rootCACallbacks, SSLKeyMaterialCallback sSLKeyMaterialCallback, int i25, boolean z31, int i26, int i27, FizzSettings fizzSettings2, QuicSettings quicSettings, long j5, int i28, String str14);

    private native void updateRewriteRules(RewriteRule[] rewriteRuleArr);

    public native synchronized void make(JniHandler jniHandler, NativeReadBuffer nativeReadBuffer, boolean z, TraceEventContext traceEventContext, boolean z2, NetworkStatusMonitor networkStatusMonitor, int i);

    public HTTPClient(EventBase eventBase) {
        String str = JsonProperty.USE_DEFAULT_NAME;
        this.mPreconnectFilePath = str;
        this.mActiveProbeJson = str;
        this.mEnableHTTP2 = true;
        this.mEnableHTTP2Weights = false;
        this.mLookupInterfaceName = false;
        this.mHTTP2WeightLowPri = 0;
        this.mHTTP2WeightHighPri = 0;
        this.mEvbLoggingSamplingFreq = 0;
        this.mHTTPSessionMaxReadBufferSize = 0;
        this.mQuicTraceLoggingSampleSalt = 0;
        this.mQuicTraceLoggingSampleWeight = 0;
        this.mMaxPriorityLevelForSession = 0;
        this.mMaxConcurrentOutgoingStreams = 0;
        this.mIdleHTTPSessionsLowWaterMark = 0;
        this.mBackgroundDNSSampleRate = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
        this.mPosixResolverPoolSize = 4;
        this.mPosixDualStackEnabled = false;
        this.mMaxDNSRetries = 4;
        this.mMaxDNSCryptTries = 2;
        this.mMaxPosixTries = 2;
        this.mDnsRetryPreemptIntervalMs = 0;
        this.mHappyEyeballsDrivenDns = false;
        this.mEnablePingAfterWrite = false;
        this.mPingLimit = 2;
        this.mPingDelayInSeconds = 5;
        this.mEventBase = eventBase;
        this.mIsZlibFilterEnabled = true;
        this.mIsSSLSessionCacheEnabled = true;
        this.mHTTPSessionCacheType = "adv";
        this.mIsPerDomainLimitEnabled = false;
        this.mPerDomainMaxConns = 0;
        this.mMaxIdleHTTPSessions = 6;
        this.mMaxIdleHTTP2Sessions = 2;
        this.mIdleTimeoutForUsedTCPSession = 55000;
        this.mIdleTimeoutForUsedQuicSession = 30000;
        this.mIdleTimeoutForUnusedTCPSession = 55000;
        this.mIdleTimeoutForUnusedQuicSession = 30000;
        this.mBackupConnTimeout = 0;
        this.mIsHTTPSEnforced = false;
        this.mIsSandbox = false;
        this.mIsHappyEyeballsV4Preferred = false;
        this.mHappyEyeballsConnectionDelayMillis = 150;
        this.mDnsCacheEnabled = false;
        this.mDNSCryptEnabled = false;
        this.mStaleAnswersEnabled = true;
        this.mDnsRequestsOutstanding = 1;
        this.mCircularLogSinkEnabled = true;
        this.mRewriteRulesHandle = 0;
        this.mEnableTransportCallbacks = false;
        this.mUseUrlRewriteFilter = true;
        this.mRedirectFilter = false;
        this.mHttpPushPolicy = HttpPushPolicy.FACEBOOK;
        this.mShouldOverrideTlsHTTP2 = false;
        this.mTlsHTTP2Override = true;
        this.mShouldOverrideFizzHTTP2Static = false;
        this.mFizzHTTP2StaticOverride = true;
    }

    public HTTPClient(HTTPClient$Builder hTTPClient$Builder) {
        String str = JsonProperty.USE_DEFAULT_NAME;
        this.mPreconnectFilePath = str;
        this.mActiveProbeJson = str;
        this.mEnableHTTP2 = true;
        this.mEnableHTTP2Weights = false;
        this.mLookupInterfaceName = false;
        this.mHTTP2WeightLowPri = 0;
        this.mHTTP2WeightHighPri = 0;
        this.mEvbLoggingSamplingFreq = 0;
        this.mHTTPSessionMaxReadBufferSize = 0;
        this.mQuicTraceLoggingSampleSalt = 0;
        this.mQuicTraceLoggingSampleWeight = 0;
        this.mMaxPriorityLevelForSession = 0;
        this.mMaxConcurrentOutgoingStreams = 0;
        this.mIdleHTTPSessionsLowWaterMark = 0;
        this.mBackgroundDNSSampleRate = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
        this.mPosixResolverPoolSize = 4;
        this.mPosixDualStackEnabled = false;
        this.mMaxDNSRetries = 4;
        this.mMaxDNSCryptTries = 2;
        this.mMaxPosixTries = 2;
        this.mDnsRetryPreemptIntervalMs = 0;
        this.mHappyEyeballsDrivenDns = false;
        this.mEnablePingAfterWrite = false;
        this.mPingLimit = 2;
        this.mPingDelayInSeconds = 5;
        this.mEventBase = hTTPClient$Builder.mEventBase;
        this.mIsZlibFilterEnabled = hTTPClient$Builder.mIsZlibFilterEnabled;
        this.mIsSSLSessionCacheEnabled = hTTPClient$Builder.mIsSSLSessionCacheEnabled;
        this.mHTTPSessionCacheType = hTTPClient$Builder.mHTTPSessionCacheType;
        this.mPreConnects = hTTPClient$Builder.mPreConnects;
        this.mIsPerDomainLimitEnabled = hTTPClient$Builder.mIsPerDomainLimitEnabled;
        this.mPerDomainMaxConns = hTTPClient$Builder.mPerDomainMaxConns;
        this.mMaxIdleHTTPSessions = hTTPClient$Builder.mMaxIdleHTTPSessions;
        this.mMaxIdleHTTP2Sessions = hTTPClient$Builder.mMaxIdleHTTP2Sessions;
        this.mIdleTimeoutForUsedTCPSession = hTTPClient$Builder.mIdleTimeoutForUsedTCPSession;
        this.mIdleTimeoutForUsedQuicSession = hTTPClient$Builder.mIdleTimeoutForUsedQuicSession;
        this.mIdleTimeoutForUnusedTCPSession = hTTPClient$Builder.mIdleTimeoutForUnusedTCPSession;
        this.mIdleTimeoutForUnusedQuicSession = hTTPClient$Builder.mIdleTimeoutForUnusedQuicSession;
        this.mBackupConnTimeout = hTTPClient$Builder.mBackupConnTimeout;
        this.mIsHTTPSEnforced = hTTPClient$Builder.mIsHTTPSEnforced;
        this.mIsSandbox = hTTPClient$Builder.mIsSandbox;
        this.mProxyHost = hTTPClient$Builder.mProxyHost;
        this.mProxyPort = hTTPClient$Builder.mProxyPort;
        this.mProxyUsername = hTTPClient$Builder.mProxyUsername;
        this.mProxyPassword = hTTPClient$Builder.mProxyPassword;
        this.mSecureProxyHost = hTTPClient$Builder.mSecureProxyHost;
        this.mSecureProxyPort = hTTPClient$Builder.mSecureProxyPort;
        this.mSecureProxyUsername = hTTPClient$Builder.mSecureProxyUsername;
        this.mSecureProxyPassword = hTTPClient$Builder.mSecureProxyPassword;
        this.mUserAgent = hTTPClient$Builder.mUserAgent;
        this.mBypassProxyDomains = hTTPClient$Builder.mBypassProxyDomains;
        this.mProxyFallbackEnabled = hTTPClient$Builder.mProxyFallbackEnabled;
        this.mPersistentSSLCacheSettings = hTTPClient$Builder.mPersistentSSLCacheSettings;
        this.mSSLVerificationSettings = hTTPClient$Builder.mSSLVerificationSettings;
        this.mDnsCacheEnabled = hTTPClient$Builder.mDnsCacheEnabled;
        this.mDNSCryptEnabled = hTTPClient$Builder.mDNSCryptEnabled;
        this.mStaleAnswersEnabled = hTTPClient$Builder.mStaleAnswersEnabled;
        this.mDnsRequestsOutstanding = hTTPClient$Builder.mDnsRequestsOutstanding;
        this.mUserInstalledCertificates = hTTPClient$Builder.mUserInstalledCertificates;
        this.mIsHappyEyeballsV4Preferred = hTTPClient$Builder.mIsHappyEyeballsV4Preferred;
        this.mHappyEyeballsConnectionDelayMillis = hTTPClient$Builder.mHappyEyeballsConnectionDelayMillis;
        this.mNewConnTimeoutMillis = hTTPClient$Builder.mNewConnTimeoutMillis;
        this.mSessionWriteTimeoutMillis = hTTPClient$Builder.mSessionWriteTimeoutMillis;
        this.mTransactionIdleTimeoutMillis = hTTPClient$Builder.mTransactionIdleTimeoutMillis;
        this.mDNSServers = hTTPClient$Builder.mDNSServers;
        this.mPersistentDNSCacheSettings = hTTPClient$Builder.mPersistentDNSCacheSettings;
        this.mPersistentDNSFBCacheSettings = hTTPClient$Builder.mPersistentDNSFBCacheSettings;
        this.mCircularLogSinkEnabled = hTTPClient$Builder.mCircularLogSinkEnabled;
        this.mNetworkStatusMonitor = hTTPClient$Builder.mNetworkStatusMonitor;
        this.mUseUrlRewriteFilter = hTTPClient$Builder.mUseUrlRewriteFilter;
        this.mRewriteRulesHandle = hTTPClient$Builder.mRewriteRulesHandle;
        this.mRewriteRules = hTTPClient$Builder.mRewriteRules;
        this.mRewriteExemptions = hTTPClient$Builder.mRewriteExemptions;
        this.mAnalyticsLogger = hTTPClient$Builder.mAnalyticsLogger;
        this.mEnableTransportCallbacks = hTTPClient$Builder.mEnableTransportCallbacks;
        this.mRedirectFilter = hTTPClient$Builder.mRedirectFilter;
        this.mLargerFlowControlWindow = hTTPClient$Builder.mLargerFlowControlWindow;
        this.mFlowControlWindow = hTTPClient$Builder.mFlowControlWindow;
        this.mFlowControlSelectedTxnsOnly = hTTPClient$Builder.mFlowControlSelectedTxnsOnly;
        this.mEnableCachingPushManager = hTTPClient$Builder.mEnableCachingPushManager;
        this.mHttpPushPolicy = hTTPClient$Builder.mHttpPushPolicy;
        this.mPushCallbacks = hTTPClient$Builder.mPushCallbacks;
        this.mUseLoadBalancing = hTTPClient$Builder.mUseLoadBalancing;
        this.mEnableLigerPreconnect = hTTPClient$Builder.mEnableLigerPreconnect;
        this.mEnableSimplePreconnectForReinit = hTTPClient$Builder.mEnableSimplePreconnectForReinit;
        this.mUseInjectedPreconnect = hTTPClient$Builder.mUseInjectedPreconnect;
        this.mPreconnectFilePath = hTTPClient$Builder.mPreconnectFilePath;
        this.mActiveProbeJson = hTTPClient$Builder.mActiveProbeJson;
        this.mAsyncTCPProbeCallback = hTTPClient$Builder.mAsyncTCPProbeCallback;
        this.mEnableHTTP2 = hTTPClient$Builder.mEnableHTTP2;
        this.mEnableHTTP2Weights = hTTPClient$Builder.mEnableHTTP2Weights;
        this.mLookupInterfaceName = hTTPClient$Builder.mLookupInterfaceName;
        this.mHTTP2WeightLowPri = hTTPClient$Builder.mHTTP2WeightLowPri;
        this.mHTTP2WeightHighPri = hTTPClient$Builder.mHTTP2WeightHighPri;
        this.mEvbLoggingSamplingFreq = hTTPClient$Builder.mEvbLoggingSamplingFreq;
        this.mFizzSettings = hTTPClient$Builder.mFizzSettings;
        this.mHTTPSessionMaxReadBufferSize = hTTPClient$Builder.mHTTPSessionMaxReadBufferSize;
        this.mQuicFizzSettings = hTTPClient$Builder.mQuicFizzSettings;
        this.mQuicSettings = hTTPClient$Builder.mQuicSettings;
        this.mQuicTraceLoggingSampleSalt = hTTPClient$Builder.mQuicTraceLoggingSampleSalt;
        this.mQuicTraceLoggingSampleWeight = hTTPClient$Builder.mQuicTraceLoggingSampleWeight;
        this.mAltsvcPersistentCacheFilename = hTTPClient$Builder.mAltsvcPersistentCacheFilename;
        this.mAsyncTracerouteJson = hTTPClient$Builder.mAsyncTracerouteJson;
        this.mAsyncTracerouteCallback = hTTPClient$Builder.mAsyncTracerouteCallback;
        this.mReInitToRefreshSettings = hTTPClient$Builder.mReInitToRefreshSettings;
        this.mInitialized = hTTPClient$Builder.mInitialized;
        this.mClosed = hTTPClient$Builder.mClosed;
        this.mSettings = hTTPClient$Builder.mSettings;
        this.mMaxPriorityLevelForSession = hTTPClient$Builder.mMaxPriorityLevelForSession;
        this.mMaxConcurrentOutgoingStreams = hTTPClient$Builder.mMaxConcurrentOutgoingStreams;
        this.mIdleHTTPSessionsLowWaterMark = hTTPClient$Builder.mIdleHTTPSessionsLowWaterMark;
        this.mShouldOverrideTlsHTTP2 = hTTPClient$Builder.mShouldOverrideTlsHTTP2;
        this.mTlsHTTP2Override = hTTPClient$Builder.mTlsHTTP2Override;
        this.mShouldOverrideFizzHTTP2Static = hTTPClient$Builder.mShouldOverrideFizzHTTP2Static;
        this.mFizzHTTP2StaticOverride = hTTPClient$Builder.mFizzHTTP2StaticOverride;
        this.mBackgroundDNSSampleRate = hTTPClient$Builder.mBackgroundDNSSampleRate;
        this.mPosixResolverPoolSize = hTTPClient$Builder.mPosixResolverPoolSize;
        this.mPosixDualStackEnabled = hTTPClient$Builder.mPosixDualStackEnabled;
        this.mMaxDNSRetries = hTTPClient$Builder.mMaxDNSRetries;
        this.mMaxDNSCryptTries = hTTPClient$Builder.mMaxDNSCryptTries;
        this.mMaxPosixTries = hTTPClient$Builder.mMaxPosixTries;
        this.mDnsRetryPreemptIntervalMs = hTTPClient$Builder.mDnsRetryPreemptIntervalMs;
        this.mHappyEyeballsDrivenDns = hTTPClient$Builder.mHappyEyeballsDrivenDns;
        this.mRootCACallbacks = hTTPClient$Builder.mRootCACallbacks;
        this.mSSLKeyMaterialCallback = hTTPClient$Builder.mSSLKeyMaterialCallback;
        this.mEnablePingAfterWrite = hTTPClient$Builder.mEnablePingAfterWrite;
        this.mPingLimit = hTTPClient$Builder.mPingLimit;
        this.mPingDelayInSeconds = hTTPClient$Builder.mPingDelayInSeconds;
    }

    public synchronized void callNativeInit(boolean z, boolean z2) {
        Throwable th;
        try {
            EventBase eventBase = r12.mEventBase;
            boolean z3 = r12.mIsZlibFilterEnabled;
            boolean z4 = r12.mIsSSLSessionCacheEnabled;
            String str = r12.mHTTPSessionCacheType;
            String str2 = r12.mPreConnects;
            boolean z5 = r12.mIsPerDomainLimitEnabled;
            int i = r12.mPerDomainMaxConns;
            int i2 = r12.mMaxIdleHTTPSessions;
            int i3 = r12.mMaxIdleHTTP2Sessions;
            int i4 = r12.mIdleTimeoutForUsedTCPSession;
            int i5 = r12.mIdleTimeoutForUsedQuicSession;
            int i6 = r12.mIdleTimeoutForUnusedTCPSession;
            try {
                init(eventBase, z, z2, z3, z4, str, str2, z5, i, i2, i3, i4, i5, i6, r12.mIdleTimeoutForUnusedQuicSession, r12.mBackupConnTimeout, r12.mIsHTTPSEnforced, r12.mIsSandbox, r12.mProxyHost, r12.mProxyPort, r12.mProxyUsername, r12.mProxyPassword, r12.mSecureProxyHost, r12.mSecureProxyPort, r12.mSecureProxyUsername, r12.mSecureProxyPassword, r12.mBypassProxyDomains, r12.mProxyFallbackEnabled, r12.mPersistentSSLCacheSettings, r12.mSSLVerificationSettings, r12.mUserInstalledCertificates, r12.mIsHappyEyeballsV4Preferred, r12.mHappyEyeballsConnectionDelayMillis, r12.mNewConnTimeoutMillis, r12.mSessionWriteTimeoutMillis, r12.mTransactionIdleTimeoutMillis, r12.mDNSServers, r12.mPersistentDNSCacheSettings, r12.mPersistentDNSFBCacheSettings, r12.mDnsCacheEnabled, r12.mStaleAnswersEnabled, r12.mDnsRequestsOutstanding, r12.mNetworkStatusMonitor, r12.mRewriteRules, r12.mRewriteExemptions, r12.mAnalyticsLogger, r12.mUserAgent, r12.mLargerFlowControlWindow, r12.mFlowControlWindow, r12.mFlowControlSelectedTxnsOnly, r12.mMaxPriorityLevelForSession, r12.mEnableCachingPushManager, r12.mHttpPushPolicy, r12.mPushCallbacks, r12.mUseLoadBalancing, r12.mEnableLigerPreconnect, r12.mEnableSimplePreconnectForReinit, r12.mUseInjectedPreconnect, r12.mPreconnectFilePath, r12.mUseUrlRewriteFilter, r12.mRedirectFilter, r12.mActiveProbeJson, r12.mAsyncTCPProbeCallback, r12.mEnableHTTP2, r12.mDNSCryptEnabled, r12.mShouldOverrideTlsHTTP2, r12.mTlsHTTP2Override, r12.mShouldOverrideFizzHTTP2Static, r12.mFizzHTTP2StaticOverride, r12.mFizzSettings, r12.mEnableHTTP2Weights, r12.mLookupInterfaceName, r12.mHTTP2WeightLowPri, r12.mHTTP2WeightHighPri, r12.mEvbLoggingSamplingFreq, r12.mHTTPSessionMaxReadBufferSize, r12.mBackgroundDNSSampleRate, r12.mPosixResolverPoolSize, r12.mPosixDualStackEnabled, r12.mHappyEyeballsDrivenDns, r12.mMaxDNSRetries, r12.mMaxDNSCryptTries, r12.mMaxPosixTries, r12.mDnsRetryPreemptIntervalMs, r12.mAsyncTracerouteJson, r12.mAsyncTracerouteCallback, r12.mMaxConcurrentOutgoingStreams, r12.mRootCACallbacks, r12.mSSLKeyMaterialCallback, r12.mIdleHTTPSessionsLowWaterMark, r12.mEnablePingAfterWrite, r12.mPingLimit, r12.mPingDelayInSeconds, r12.mQuicFizzSettings, r12.mQuicSettings, r12.mQuicTraceLoggingSampleSalt, r12.mQuicTraceLoggingSampleWeight, r12.mAltsvcPersistentCacheFilename);
                try {
                    r12.mInitialized = true;
                    r12.mReInitToRefreshSettings = false;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            throw th;
        }
    }

    public void close() {
        if (this.mInitialized && !this.mClosed) {
            close(this.mEventBase);
            this.mClosed = true;
        }
    }

    public void connect(String[] strArr) {
        if (this.mInitialized && !this.mClosed) {
            connect(this.mEventBase, strArr);
        }
    }

    public void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public EventBase getEventBase() {
        return this.mEventBase;
    }

    public long getNativeHandle() {
        return this.mSettings;
    }

    public void init() {
        callNativeInit(false, true);
    }

    public boolean isSandbox() {
        return this.mIsSandbox;
    }

    public void make(JniHandler jniHandler, NativeReadBuffer nativeReadBuffer, TraceEventContext traceEventContext) {
        make(jniHandler, nativeReadBuffer, traceEventContext.needPublishEvent(), traceEventContext, this.mCircularLogSinkEnabled, this.mNetworkStatusMonitor, this.mEnableTransportCallbacks ? jniHandler.getEnabledCallbackFlag() : null);
    }

    public void nonBlockingInit() {
        callNativeInit(false, false);
    }

    public boolean reInitializeIfNeeded() {
        if (this.mReInitToRefreshSettings && this.mInitialized) {
            reinit();
            this.mClosed = false;
            this.mReInitToRefreshSettings = false;
            return true;
        }
        this.mReInitToRefreshSettings = false;
        return false;
    }

    public void reinit() {
        callNativeInit(true, true);
    }

    public HTTPClient setActiveProbeJson(String str) {
        this.mActiveProbeJson = str;
        return this;
    }

    public HTTPClient setAltsvcPersistentCacheFilename(String str) {
        this.mAltsvcPersistentCacheFilename = str;
        return this;
    }

    public HTTPClient setAnalyticsLogger(AnalyticsLogger analyticsLogger) {
        this.mAnalyticsLogger = analyticsLogger;
        return this;
    }

    public HTTPClient setAsyncTCPProbeCallback(AsyncTCPProbeCallback asyncTCPProbeCallback) {
        this.mAsyncTCPProbeCallback = asyncTCPProbeCallback;
        return this;
    }

    public HTTPClient setAsyncTracerouteCallback(AsyncTracerouteCallback asyncTracerouteCallback) {
        this.mAsyncTracerouteCallback = asyncTracerouteCallback;
        return this;
    }

    public HTTPClient setAsyncTracerouteJson(String str) {
        this.mAsyncTracerouteJson = str;
        return this;
    }

    public HTTPClient setBackgroundDNSSampleRate(double d) {
        this.mBackgroundDNSSampleRate = d;
        return this;
    }

    public HTTPClient setBackupConnTimeout(int i) {
        this.mBackupConnTimeout = i;
        return this;
    }

    public HTTPClient setBypassProxyDomains(String str) {
        if (stringEquals(str, this.mBypassProxyDomains)) {
            return this;
        }
        this.mBypassProxyDomains = str;
        this.mReInitToRefreshSettings = true;
        return this;
    }

    public HTTPClient setCircularLogSinkEnabled(boolean z) {
        this.mCircularLogSinkEnabled = z;
        return this;
    }

    public HTTPClient setDNSCacheEnabled(boolean z) {
        this.mDnsCacheEnabled = z;
        return this;
    }

    public HTTPClient setDNSCryptEnabled(boolean z) {
        this.mDNSCryptEnabled = z;
        return this;
    }

    public HTTPClient setDNSServers(String[] strArr) {
        if (!Arrays.equals(this.mDNSServers, strArr)) {
            this.mDNSServers = strArr;
            this.mReInitToRefreshSettings = true;
        }
        return this;
    }

    public HTTPClient setDnsRequestsOutstanding(int i) {
        this.mDnsRequestsOutstanding = i;
        return this;
    }

    public HTTPClient setDnsRetryPreemptIntervalMs(int i) {
        this.mDnsRetryPreemptIntervalMs = i;
        return this;
    }

    public HTTPClient setEnableCachingPushManager(boolean z) {
        this.mEnableCachingPushManager = z;
        return this;
    }

    public HTTPClient setEnableHTTP2(boolean z) {
        this.mEnableHTTP2 = z;
        return this;
    }

    public HTTPClient setEnableHTTP2Weights(boolean z) {
        this.mEnableHTTP2Weights = z;
        return this;
    }

    public HTTPClient setEnableLigerPreconnect(boolean z) {
        this.mEnableLigerPreconnect = z;
        return this;
    }

    public HTTPClient setEnablePingAfterWrite(boolean z, int i, int i2) {
        this.mEnablePingAfterWrite = z;
        this.mPingLimit = i;
        this.mPingDelayInSeconds = i2;
        return this;
    }

    public HTTPClient setEnableSimplePreconnectForReinit(boolean z) {
        this.mEnableSimplePreconnectForReinit = z;
        return this;
    }

    public HTTPClient setEvbLoggingSamplingFreq(int i) {
        this.mEvbLoggingSamplingFreq = i;
        return this;
    }

    public HTTPClient setFizzHTTP2StaticOverride(boolean z, boolean z2) {
        this.mShouldOverrideFizzHTTP2Static = z;
        this.mFizzHTTP2StaticOverride = z2;
        return this;
    }

    public HTTPClient setFizzSettings(FizzSettings fizzSettings) {
        this.mFizzSettings = fizzSettings;
        return this;
    }

    public HTTPClient setFlowControl(boolean z, int i, boolean z2) {
        this.mLargerFlowControlWindow = z;
        this.mFlowControlWindow = i;
        this.mFlowControlSelectedTxnsOnly = z2;
        return this;
    }

    public HTTPClient setHTTP2WeightHighPri(int i) {
        this.mHTTP2WeightHighPri = i;
        return this;
    }

    public HTTPClient setHTTP2WeightLowPri(int i) {
        this.mHTTP2WeightLowPri = i;
        return this;
    }

    public HTTPClient setHTTPSEnforced(boolean z) {
        this.mIsHTTPSEnforced = z;
        return this;
    }

    public HTTPClient setHTTPSessionCacheType(String str) {
        this.mHTTPSessionCacheType = str;
        return this;
    }

    public HTTPClient setHTTPSessionMaxReadBufferSize(int i) {
        this.mHTTPSessionMaxReadBufferSize = i;
        return this;
    }

    public HTTPClient setHappyEyeballsConnectionDelayMillis(long j) {
        this.mHappyEyeballsConnectionDelayMillis = j;
        return this;
    }

    public HTTPClient setHappyEyeballsDrivenDns(boolean z) {
        this.mHappyEyeballsDrivenDns = z;
        return this;
    }

    public HTTPClient setHappyEyeballsV4Preferred(boolean z) {
        this.mIsHappyEyeballsV4Preferred = z;
        return this;
    }

    public HTTPClient setHttpPushPolicy(int i) {
        this.mHttpPushPolicy = i;
        return this;
    }

    public HTTPClient setIdleHTTPSessionsLowWaterMark(int i) {
        this.mIdleHTTPSessionsLowWaterMark = i;
        return this;
    }

    public HTTPClient setIdleTimeoutForUnusedQuicSession(int i) {
        this.mIdleTimeoutForUnusedQuicSession = i;
        return this;
    }

    public HTTPClient setIdleTimeoutForUnusedTCPSession(int i) {
        this.mIdleTimeoutForUnusedTCPSession = i;
        return this;
    }

    public HTTPClient setIdleTimeoutForUsedQuicSession(int i) {
        this.mIdleTimeoutForUsedQuicSession = i;
        return this;
    }

    public HTTPClient setIdleTimeoutForUsedTCPSession(int i) {
        this.mIdleTimeoutForUsedTCPSession = i;
        return this;
    }

    public HTTPClient setIsSandbox(boolean z) {
        if (this.mIsSandbox != z) {
            this.mReInitToRefreshSettings = true;
            this.mIsSandbox = z;
        }
        return this;
    }

    public HTTPClient setLoadBalancing(boolean z) {
        this.mUseLoadBalancing = z;
        return this;
    }

    public HTTPClient setLookupInterfaceName(boolean z) {
        this.mLookupInterfaceName = z;
        return this;
    }

    public HTTPClient setMaxConcurrentOutgoingStreams(int i) {
        this.mMaxConcurrentOutgoingStreams = i;
        return this;
    }

    public HTTPClient setMaxDnsRetries(int i) {
        this.mMaxDNSRetries = i;
        return this;
    }

    public HTTPClient setMaxDnscryptTries(int i) {
        this.mMaxDNSCryptTries = i;
        return this;
    }

    public HTTPClient setMaxIdleHTTP2Sessions(int i) {
        this.mMaxIdleHTTP2Sessions = i;
        return this;
    }

    public HTTPClient setMaxIdleHTTPSessions(int i) {
        this.mMaxIdleHTTPSessions = i;
        return this;
    }

    public HTTPClient setMaxPosixTries(int i) {
        this.mMaxPosixTries = i;
        return this;
    }

    public HTTPClient setMaxPriorityLevelForSession(int i) {
        this.mMaxPriorityLevelForSession = i;
        return this;
    }

    public void setNativeHandle(long j) {
        this.mSettings = j;
    }

    public HTTPClient setNetworkStatusMonitor(NetworkStatusMonitor networkStatusMonitor) {
        this.mNetworkStatusMonitor = networkStatusMonitor;
        return this;
    }

    public HTTPClient setNewConnectionTimeoutMillis(long j) {
        this.mNewConnTimeoutMillis = j;
        return this;
    }

    public HTTPClient setPerDomainLimitEnabled(boolean z) {
        this.mIsPerDomainLimitEnabled = z;
        return this;
    }

    public HTTPClient setPerDomainMaxConns(int i) {
        this.mPerDomainMaxConns = i;
        return this;
    }

    public HTTPClient setPersistentDNSCacheSettings(PersistentSSLCacheSettings persistentSSLCacheSettings) {
        this.mPersistentDNSCacheSettings = persistentSSLCacheSettings;
        return this;
    }

    public HTTPClient setPersistentFBDNSCacheSettings(PersistentSSLCacheSettings persistentSSLCacheSettings) {
        this.mPersistentDNSFBCacheSettings = persistentSSLCacheSettings;
        return this;
    }

    public HTTPClient setPersistentSSLCacheSettings(PersistentSSLCacheSettings persistentSSLCacheSettings) {
        this.mPersistentSSLCacheSettings = persistentSSLCacheSettings;
        return this;
    }

    public HTTPClient setPosixDnsResolverPoolSize(int i) {
        this.mPosixResolverPoolSize = i;
        return this;
    }

    public HTTPClient setPosixDualStackEnabled(boolean z) {
        this.mPosixDualStackEnabled = z;
        return this;
    }

    public HTTPClient setPreConnects(String str) {
        this.mPreConnects = str;
        return this;
    }

    public HTTPClient setPreconnectFilePath(String str) {
        this.mPreconnectFilePath = str;
        return this;
    }

    public HTTPClient setProxy(String str, int i, String str2, String str3) {
        if (stringEquals(str, this.mProxyHost) && i == this.mProxyPort && stringEquals(str2, this.mProxyUsername) && stringEquals(str3, this.mProxyPassword)) {
            return this;
        }
        this.mProxyHost = str;
        this.mProxyPort = i;
        this.mProxyUsername = str2;
        this.mProxyPassword = str3;
        this.mReInitToRefreshSettings = true;
        return this;
    }

    public HTTPClient setProxyFallbackEnabled(boolean z) {
        this.mProxyFallbackEnabled = z;
        return this;
    }

    public HTTPClient setPushCallbacks(PushCallbacks pushCallbacks) {
        this.mPushCallbacks = pushCallbacks;
        return this;
    }

    public HTTPClient setQuicFizzSettings(FizzSettings fizzSettings) {
        this.mQuicFizzSettings = fizzSettings;
        return this;
    }

    public HTTPClient setQuicSettings(QuicSettings quicSettings) {
        this.mQuicSettings = quicSettings;
        return this;
    }

    public HTTPClient setQuicTraceLoggingSampleParam(long j, int i) {
        this.mQuicTraceLoggingSampleSalt = j;
        this.mQuicTraceLoggingSampleWeight = i;
        return this;
    }

    public HTTPClient setRedirectFilter(boolean z) {
        this.mRedirectFilter = z;
        return this;
    }

    public HTTPClient setRewriteExemptions(String[] strArr) {
        this.mRewriteExemptions = strArr;
        return this;
    }

    public HTTPClient setRewriteRules(RewriteRule[] rewriteRuleArr) {
        this.mRewriteRules = rewriteRuleArr;
        return this;
    }

    public HTTPClient setRootCACallbacks(RootCACallbacks rootCACallbacks) {
        this.mRootCACallbacks = rootCACallbacks;
        return this;
    }

    public HTTPClient setSSLKeyMaterialCallback(SSLKeyMaterialCallback sSLKeyMaterialCallback) {
        this.mSSLKeyMaterialCallback = sSLKeyMaterialCallback;
        return this;
    }

    public HTTPClient setSSLSessionCache(boolean z) {
        this.mIsSSLSessionCacheEnabled = z;
        return this;
    }

    public HTTPClient setSSLVerificationSettings(SSLVerificationSettings sSLVerificationSettings) {
        this.mSSLVerificationSettings = sSLVerificationSettings;
        return this;
    }

    public HTTPClient setSecureProxy(String str, int i, String str2, String str3) {
        if (stringEquals(str, this.mSecureProxyHost) && i == this.mSecureProxyPort && stringEquals(str2, this.mSecureProxyUsername) && stringEquals(str3, this.mSecureProxyPassword)) {
            return this;
        }
        this.mSecureProxyHost = str;
        this.mSecureProxyPort = i;
        this.mSecureProxyUsername = str2;
        this.mSecureProxyPassword = str3;
        this.mReInitToRefreshSettings = true;
        return this;
    }

    public HTTPClient setSessionWriteTimeoutMillis(long j) {
        this.mSessionWriteTimeoutMillis = j;
        return this;
    }

    public HTTPClient setStaleAnswersEnabled(boolean z) {
        this.mStaleAnswersEnabled = z;
        return this;
    }

    public HTTPClient setTlsHTTP2Override(boolean z, boolean z2) {
        this.mShouldOverrideTlsHTTP2 = z;
        this.mTlsHTTP2Override = z2;
        return this;
    }

    public HTTPClient setTransactionIdleTimeoutMillis(long j) {
        this.mTransactionIdleTimeoutMillis = j;
        return this;
    }

    public HTTPClient setTransportCallbackEnabled(boolean z) {
        this.mEnableTransportCallbacks = z;
        return this;
    }

    public HTTPClient setUseInjectedPreconnect(boolean z) {
        this.mUseInjectedPreconnect = z;
        return this;
    }

    public HTTPClient setUseUrlRewriteFilter(boolean z) {
        this.mUseUrlRewriteFilter = z;
        return this;
    }

    public HTTPClient setUserAgent(String str) {
        this.mUserAgent = str;
        return this;
    }

    public HTTPClient setUserInstalledCertificates(byte[][] bArr) {
        this.mUserInstalledCertificates = bArr;
        return this;
    }

    public HTTPClient setZlibFilter(boolean z) {
        this.mIsZlibFilterEnabled = z;
        return this;
    }

    public static boolean stringEquals(String str, String str2) {
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null ? true : null;
    }

    public void updateUrlRewriteRules(RewriteRule[] rewriteRuleArr) {
        if (!Arrays.equals(this.mRewriteRules, rewriteRuleArr)) {
            this.mRewriteRules = rewriteRuleArr;
            updateRewriteRules(rewriteRuleArr);
        }
    }
}
