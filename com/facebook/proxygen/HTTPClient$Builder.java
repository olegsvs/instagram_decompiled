package com.facebook.proxygen;

import com.facebook.common.dextricks.StartupQEsConfig;
import com.facebook.proxygen.HTTPClient.HttpPushPolicy;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;

public class HTTPClient$Builder {
    public String mActiveProbeJson;
    public String mAltsvcPersistentCacheFilename;
    public AnalyticsLogger mAnalyticsLogger;
    public AsyncTCPProbeCallback mAsyncTCPProbeCallback;
    public AsyncTracerouteCallback mAsyncTracerouteCallback;
    public String mAsyncTracerouteJson;
    public double mBackgroundDNSSampleRate;
    public int mBackupConnTimeout;
    public String mBypassProxyDomains;
    public boolean mCircularLogSinkEnabled;
    public boolean mClosed;
    public boolean mDNSCryptEnabled;
    public String[] mDNSServers;
    public boolean mDnsCacheEnabled;
    public int mDnsRequestsOutstanding;
    public int mDnsRetryPreemptIntervalMs;
    public boolean mEnableCachingPushManager = false;
    public boolean mEnableHTTP2;
    public boolean mEnableHTTP2Weights;
    public boolean mEnableLigerPreconnect = false;
    public boolean mEnablePingAfterWrite;
    public boolean mEnableSimplePreconnectForReinit = false;
    public boolean mEnableTransportCallbacks;
    public int mEvbLoggingSamplingFreq;
    public EventBase mEventBase;
    public boolean mFizzHTTP2StaticOverride;
    public FizzSettings mFizzSettings;
    public boolean mFlowControlSelectedTxnsOnly = false;
    public int mFlowControlWindow = 65535;
    public int mHTTP2WeightHighPri;
    public int mHTTP2WeightLowPri;
    public String mHTTPSessionCacheType = "adv";
    public int mHTTPSessionMaxReadBufferSize;
    public long mHappyEyeballsConnectionDelayMillis;
    public boolean mHappyEyeballsDrivenDns;
    public int mHttpPushPolicy;
    public int mIdleHTTPSessionsLowWaterMark;
    public int mIdleTimeoutForUnusedQuicSession = 30000;
    public int mIdleTimeoutForUnusedTCPSession = 55000;
    public int mIdleTimeoutForUsedQuicSession = 30000;
    public int mIdleTimeoutForUsedTCPSession = 55000;
    public boolean mInitialized;
    public boolean mIsHTTPSEnforced;
    public boolean mIsHappyEyeballsV4Preferred;
    public boolean mIsPerDomainLimitEnabled = false;
    public boolean mIsSSLSessionCacheEnabled = true;
    public boolean mIsSandbox;
    public boolean mIsZlibFilterEnabled = true;
    public boolean mLargerFlowControlWindow = false;
    public boolean mLookupInterfaceName;
    public int mMaxConcurrentOutgoingStreams;
    public int mMaxDNSCryptTries;
    public int mMaxDNSRetries;
    public int mMaxIdleHTTP2Sessions = 2;
    public int mMaxIdleHTTPSessions = 6;
    public int mMaxPosixTries;
    public int mMaxPriorityLevelForSession;
    public NetworkStatusMonitor mNetworkStatusMonitor;
    public long mNewConnTimeoutMillis = 30000;
    public int mPerDomainMaxConns = 0;
    public PersistentSSLCacheSettings mPersistentDNSCacheSettings;
    public PersistentSSLCacheSettings mPersistentDNSFBCacheSettings;
    public PersistentSSLCacheSettings mPersistentSSLCacheSettings;
    public int mPingDelayInSeconds;
    public int mPingLimit;
    public boolean mPosixDualStackEnabled;
    public int mPosixResolverPoolSize;
    public String mPreConnects;
    public String mPreconnectFilePath;
    public boolean mProxyFallbackEnabled;
    public String mProxyHost;
    public String mProxyPassword;
    public int mProxyPort;
    public String mProxyUsername;
    public PushCallbacks mPushCallbacks;
    public FizzSettings mQuicFizzSettings;
    public QuicSettings mQuicSettings;
    public long mQuicTraceLoggingSampleSalt;
    public int mQuicTraceLoggingSampleWeight;
    public boolean mReInitToRefreshSettings;
    public boolean mRedirectFilter = false;
    public String[] mRewriteExemptions;
    public RewriteRule[] mRewriteRules;
    public long mRewriteRulesHandle;
    public RootCACallbacks mRootCACallbacks;
    public SSLKeyMaterialCallback mSSLKeyMaterialCallback;
    public SSLVerificationSettings mSSLVerificationSettings;
    public String mSecureProxyHost;
    public String mSecureProxyPassword;
    public int mSecureProxyPort;
    public String mSecureProxyUsername;
    public long mSessionWriteTimeoutMillis = 60000;
    public long mSettings;
    public boolean mShouldOverrideFizzHTTP2Static;
    public boolean mShouldOverrideTlsHTTP2;
    public boolean mStaleAnswersEnabled;
    public boolean mTlsHTTP2Override;
    public long mTransactionIdleTimeoutMillis = 60000;
    public boolean mUseInjectedPreconnect = false;
    public boolean mUseLoadBalancing = false;
    public boolean mUseUrlRewriteFilter;
    public String mUserAgent;
    public byte[][] mUserInstalledCertificates;

    public HTTPClient$Builder() {
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

    public HTTPClient build() {
        return new HTTPClient(this);
    }

    public HTTPClient$Builder setActiveProbeJson(String str) {
        this.mActiveProbeJson = str;
        return this;
    }

    public HTTPClient$Builder setAltsvcPersistentCacheFilename(String str) {
        this.mAltsvcPersistentCacheFilename = str;
        return this;
    }

    public HTTPClient$Builder setAnalyticsLogger(AnalyticsLogger analyticsLogger) {
        this.mAnalyticsLogger = analyticsLogger;
        return this;
    }

    public HTTPClient$Builder setAsyncTCPProbeCallback(AsyncTCPProbeCallback asyncTCPProbeCallback) {
        this.mAsyncTCPProbeCallback = asyncTCPProbeCallback;
        return this;
    }

    public HTTPClient$Builder setAsyncTracerouteCallback(AsyncTracerouteCallback asyncTracerouteCallback) {
        this.mAsyncTracerouteCallback = asyncTracerouteCallback;
        return this;
    }

    public HTTPClient$Builder setAsyncTracerouteJson(String str) {
        this.mAsyncTracerouteJson = str;
        return this;
    }

    public HTTPClient$Builder setBackgroundDNSSampleRate(double d) {
        this.mBackgroundDNSSampleRate = d;
        return this;
    }

    public HTTPClient$Builder setBackupConnTimeout(int i) {
        this.mBackupConnTimeout = i;
        return this;
    }

    public HTTPClient$Builder setBypassProxyDomains(String str) {
        if (HTTPClient.stringEquals(str, this.mBypassProxyDomains)) {
            return this;
        }
        this.mBypassProxyDomains = str;
        this.mReInitToRefreshSettings = true;
        return this;
    }

    public HTTPClient$Builder setCircularLogSinkEnabled(boolean z) {
        this.mCircularLogSinkEnabled = z;
        return this;
    }

    public HTTPClient$Builder setDNSCacheEnabled(boolean z) {
        this.mDnsCacheEnabled = z;
        return this;
    }

    public HTTPClient$Builder setDNSCryptEnabled(boolean z) {
        this.mDNSCryptEnabled = z;
        return this;
    }

    public HTTPClient$Builder setDNSServers(String[] strArr) {
        if (!Arrays.equals(this.mDNSServers, strArr)) {
            this.mDNSServers = strArr;
            this.mReInitToRefreshSettings = true;
        }
        return this;
    }

    public HTTPClient$Builder setDnsRequestsOutstanding(int i) {
        this.mDnsRequestsOutstanding = i;
        return this;
    }

    public HTTPClient$Builder setDnsRetryPreemptIntervalMs(int i) {
        this.mDnsRetryPreemptIntervalMs = i;
        return this;
    }

    public HTTPClient$Builder setEnableCachingPushManager(boolean z) {
        this.mEnableCachingPushManager = z;
        return this;
    }

    public HTTPClient$Builder setEnableHTTP2(boolean z) {
        this.mEnableHTTP2 = z;
        return this;
    }

    public HTTPClient$Builder setEnableHTTP2Weights(boolean z) {
        this.mEnableHTTP2Weights = z;
        return this;
    }

    public HTTPClient$Builder setEnableLigerPreconnect(boolean z) {
        this.mEnableLigerPreconnect = z;
        return this;
    }

    public HTTPClient$Builder setEnablePingAfterWrite(boolean z, int i, int i2) {
        this.mEnablePingAfterWrite = z;
        this.mPingLimit = i;
        this.mPingDelayInSeconds = i2;
        return this;
    }

    public HTTPClient$Builder setEnableSimplePreconnectForReinit(boolean z) {
        this.mEnableSimplePreconnectForReinit = z;
        return this;
    }

    public HTTPClient$Builder setEvbLoggingSamplingFreq(int i) {
        this.mEvbLoggingSamplingFreq = i;
        return this;
    }

    public HTTPClient$Builder setEventBase(EventBase eventBase) {
        this.mEventBase = eventBase;
        return this;
    }

    public HTTPClient$Builder setFizzHTTP2StaticOverride(boolean z, boolean z2) {
        this.mShouldOverrideFizzHTTP2Static = z;
        this.mFizzHTTP2StaticOverride = z2;
        return this;
    }

    public HTTPClient$Builder setFizzSettings(FizzSettings fizzSettings) {
        this.mFizzSettings = fizzSettings;
        return this;
    }

    public HTTPClient$Builder setFlowControl(boolean z, int i, boolean z2) {
        this.mLargerFlowControlWindow = z;
        this.mFlowControlWindow = i;
        this.mFlowControlSelectedTxnsOnly = z2;
        return this;
    }

    public HTTPClient$Builder setHTTP2WeightHighPri(int i) {
        this.mHTTP2WeightHighPri = i;
        return this;
    }

    public HTTPClient$Builder setHTTP2WeightLowPri(int i) {
        this.mHTTP2WeightLowPri = i;
        return this;
    }

    public HTTPClient$Builder setHTTPSEnforced(boolean z) {
        this.mIsHTTPSEnforced = z;
        return this;
    }

    public HTTPClient$Builder setHTTPSessionCacheType(String str) {
        this.mHTTPSessionCacheType = str;
        return this;
    }

    public HTTPClient$Builder setHTTPSessionMaxReadBufferSize(int i) {
        this.mHTTPSessionMaxReadBufferSize = i;
        return this;
    }

    public HTTPClient$Builder setHappyEyeballsConnectionDelayMillis(long j) {
        this.mHappyEyeballsConnectionDelayMillis = j;
        return this;
    }

    public HTTPClient$Builder setHappyEyeballsDrivenDns(boolean z) {
        this.mHappyEyeballsDrivenDns = z;
        return this;
    }

    public HTTPClient$Builder setHappyEyeballsV4Preferred(boolean z) {
        this.mIsHappyEyeballsV4Preferred = z;
        return this;
    }

    public HTTPClient$Builder setHttpPushPolicy(int i) {
        this.mHttpPushPolicy = i;
        return this;
    }

    public HTTPClient$Builder setIdleHTTPSessionsLowWaterMark(int i) {
        this.mIdleHTTPSessionsLowWaterMark = i;
        return this;
    }

    public HTTPClient$Builder setIdleTimeoutForUnusedQuicSession(int i) {
        this.mIdleTimeoutForUnusedQuicSession = i;
        return this;
    }

    public HTTPClient$Builder setIdleTimeoutForUnusedTCPSession(int i) {
        this.mIdleTimeoutForUnusedTCPSession = i;
        return this;
    }

    public HTTPClient$Builder setIdleTimeoutForUsedQuicSession(int i) {
        this.mIdleTimeoutForUsedQuicSession = i;
        return this;
    }

    public HTTPClient$Builder setIdleTimeoutForUsedTCPSession(int i) {
        this.mIdleTimeoutForUsedTCPSession = i;
        return this;
    }

    public HTTPClient$Builder setIsSandbox(boolean z) {
        if (this.mIsSandbox != z) {
            this.mReInitToRefreshSettings = true;
            this.mIsSandbox = z;
        }
        return this;
    }

    public HTTPClient$Builder setLoadBalancing(boolean z) {
        this.mUseLoadBalancing = z;
        return this;
    }

    public HTTPClient$Builder setLookupInterfaceName(boolean z) {
        this.mLookupInterfaceName = z;
        return this;
    }

    public HTTPClient$Builder setMaxConcurrentOutgoingStreams(int i) {
        this.mMaxConcurrentOutgoingStreams = i;
        return this;
    }

    public HTTPClient$Builder setMaxDnsRetries(int i) {
        this.mMaxDNSRetries = i;
        return this;
    }

    public HTTPClient$Builder setMaxDnscryptTries(int i) {
        this.mMaxDNSCryptTries = i;
        return this;
    }

    public HTTPClient$Builder setMaxIdleHTTP2Sessions(int i) {
        this.mMaxIdleHTTP2Sessions = i;
        return this;
    }

    public HTTPClient$Builder setMaxIdleHTTPSessions(int i) {
        this.mMaxIdleHTTPSessions = i;
        return this;
    }

    public HTTPClient$Builder setMaxPosixTries(int i) {
        this.mMaxPosixTries = i;
        return this;
    }

    public HTTPClient$Builder setMaxPriorityLevelForSession(int i) {
        this.mMaxPriorityLevelForSession = i;
        return this;
    }

    public HTTPClient$Builder setNetworkStatusMonitor(NetworkStatusMonitor networkStatusMonitor) {
        this.mNetworkStatusMonitor = networkStatusMonitor;
        return this;
    }

    public HTTPClient$Builder setNewConnectionTimeoutMillis(long j) {
        this.mNewConnTimeoutMillis = j;
        return this;
    }

    public HTTPClient$Builder setPerDomainLimitEnabled(boolean z) {
        this.mIsPerDomainLimitEnabled = z;
        return this;
    }

    public HTTPClient$Builder setPerDomainMaxConns(int i) {
        this.mPerDomainMaxConns = i;
        return this;
    }

    public HTTPClient$Builder setPersistentDNSCacheSettings(PersistentSSLCacheSettings persistentSSLCacheSettings) {
        this.mPersistentDNSCacheSettings = persistentSSLCacheSettings;
        return this;
    }

    public HTTPClient$Builder setPersistentFBDNSCacheSettings(PersistentSSLCacheSettings persistentSSLCacheSettings) {
        this.mPersistentDNSFBCacheSettings = persistentSSLCacheSettings;
        return this;
    }

    public HTTPClient$Builder setPersistentSSLCacheSettings(PersistentSSLCacheSettings persistentSSLCacheSettings) {
        this.mPersistentSSLCacheSettings = persistentSSLCacheSettings;
        return this;
    }

    public HTTPClient$Builder setPosixDnsResolverPoolSize(int i) {
        this.mPosixResolverPoolSize = i;
        return this;
    }

    public HTTPClient$Builder setPosixDualStackEnabled(boolean z) {
        this.mPosixDualStackEnabled = z;
        return this;
    }

    public HTTPClient$Builder setPreConnects(String str) {
        this.mPreConnects = str;
        return this;
    }

    public HTTPClient$Builder setPreconnectFilePath(String str) {
        this.mPreconnectFilePath = str;
        return this;
    }

    public HTTPClient$Builder setProxy(String str, int i, String str2, String str3) {
        if (HTTPClient.stringEquals(str, this.mProxyHost) && i == this.mProxyPort && HTTPClient.stringEquals(str2, this.mProxyUsername) && HTTPClient.stringEquals(str3, this.mProxyPassword)) {
            return this;
        }
        this.mProxyHost = str;
        this.mProxyPort = i;
        this.mProxyUsername = str2;
        this.mProxyPassword = str3;
        this.mReInitToRefreshSettings = true;
        return this;
    }

    public HTTPClient$Builder setProxyFallbackEnabled(boolean z) {
        this.mProxyFallbackEnabled = z;
        return this;
    }

    public HTTPClient$Builder setPushCallbacks(PushCallbacks pushCallbacks) {
        this.mPushCallbacks = pushCallbacks;
        return this;
    }

    public HTTPClient$Builder setQuicFizzSettings(FizzSettings fizzSettings) {
        this.mQuicFizzSettings = fizzSettings;
        return this;
    }

    public HTTPClient$Builder setQuicSettings(QuicSettings quicSettings) {
        this.mQuicSettings = quicSettings;
        return this;
    }

    public HTTPClient$Builder setQuicTraceLoggingSampleParam(long j, int i) {
        this.mQuicTraceLoggingSampleSalt = j;
        this.mQuicTraceLoggingSampleWeight = i;
        return this;
    }

    public HTTPClient$Builder setRedirectFilter(boolean z) {
        this.mRedirectFilter = z;
        return this;
    }

    public HTTPClient$Builder setRewriteExemptions(String[] strArr) {
        this.mRewriteExemptions = strArr;
        return this;
    }

    public HTTPClient$Builder setRewriteRules(RewriteRule[] rewriteRuleArr) {
        this.mRewriteRules = rewriteRuleArr;
        return this;
    }

    public HTTPClient$Builder setRootCACallbacks(RootCACallbacks rootCACallbacks) {
        this.mRootCACallbacks = rootCACallbacks;
        return this;
    }

    public HTTPClient$Builder setSSLKeyMaterialCallback(SSLKeyMaterialCallback sSLKeyMaterialCallback) {
        this.mSSLKeyMaterialCallback = sSLKeyMaterialCallback;
        return this;
    }

    public HTTPClient$Builder setSSLSessionCache(boolean z) {
        this.mIsSSLSessionCacheEnabled = z;
        return this;
    }

    public HTTPClient$Builder setSSLVerificationSettings(SSLVerificationSettings sSLVerificationSettings) {
        this.mSSLVerificationSettings = sSLVerificationSettings;
        return this;
    }

    public HTTPClient$Builder setSecureProxy(String str, int i, String str2, String str3) {
        if (HTTPClient.stringEquals(str, this.mSecureProxyHost) && i == this.mSecureProxyPort && HTTPClient.stringEquals(str2, this.mSecureProxyUsername) && HTTPClient.stringEquals(str3, this.mSecureProxyPassword)) {
            return this;
        }
        this.mSecureProxyHost = str;
        this.mSecureProxyPort = i;
        this.mSecureProxyUsername = str2;
        this.mSecureProxyPassword = str3;
        this.mReInitToRefreshSettings = true;
        return this;
    }

    public HTTPClient$Builder setSessionWriteTimeoutMillis(long j) {
        this.mSessionWriteTimeoutMillis = j;
        return this;
    }

    public HTTPClient$Builder setStaleAnswersEnabled(boolean z) {
        this.mStaleAnswersEnabled = z;
        return this;
    }

    public HTTPClient$Builder setTlsHTTP2Override(boolean z, boolean z2) {
        this.mShouldOverrideTlsHTTP2 = z;
        this.mTlsHTTP2Override = z2;
        return this;
    }

    public HTTPClient$Builder setTransactionIdleTimeoutMillis(long j) {
        this.mTransactionIdleTimeoutMillis = j;
        return this;
    }

    public HTTPClient$Builder setTransportCallbackEnabled(boolean z) {
        this.mEnableTransportCallbacks = z;
        return this;
    }

    public HTTPClient$Builder setUseInjectedPreconnect(boolean z) {
        this.mUseInjectedPreconnect = z;
        return this;
    }

    public HTTPClient$Builder setUseUrlRewriteFilter(boolean z) {
        this.mUseUrlRewriteFilter = z;
        return this;
    }

    public HTTPClient$Builder setUserAgent(String str) {
        this.mUserAgent = str;
        return this;
    }

    public HTTPClient$Builder setUserInstalledCertificates(byte[][] bArr) {
        this.mUserInstalledCertificates = bArr;
        return this;
    }

    public HTTPClient$Builder setZlibFilter(boolean z) {
        this.mIsZlibFilterEnabled = z;
        return this;
    }
}
