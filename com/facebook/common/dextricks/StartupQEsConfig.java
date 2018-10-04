package com.facebook.common.dextricks;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;

public final class StartupQEsConfig {
    public static final boolean DEFAULT_COMBINED_THREAD_POOL_DEFAULT_CONSTRAINED = false;
    public static final boolean DEFAULT_COMBINED_THREAD_POOL_ENABLED = false;
    public static final boolean DEFAULT_COMBINED_THREAD_POOL_FBTHREADPOOLEXECUTOR = false;
    public static final int DEFAULT_COMBINED_THREAD_POOL_MAX_THREADS = 0;
    public static final boolean DEFAULT_COMBINED_THREAD_POOL_OLD_EXECUTOR_STATS_ENABLED = false;
    public static final boolean DEFAULT_COMBINED_THREAD_POOL_PRIORITIZED = false;
    public static final boolean DEFAULT_COMBINED_THREAD_POOL_SET_THREAD_PRIORITY = false;
    public static final boolean DEFAULT_COMBINED_THREAD_POOL_SINGLE_THREADED_EXECUTOR = false;
    public static final boolean DEFAULT_COMBINED_THREAD_POOL_STATS_ENABLED = false;
    public static final int DEFAULT_COMBINED_THREAD_POOL_THREAD_KEEP_ALIVE_S = 15;
    public static final int DEFAULT_COMBINED_THREAD_POOL_THREAD_RESERVE = 0;
    public static final int DEFAULT_CONCURRENT_COLD_START_GC_THRESHOLD = -1;
    public static final int DEFAULT_DELAY_BETWEEN_IDLE_CALLS = 0;
    public static final boolean DEFAULT_DISABLE_COLD_START_CONCURRENT_GC = false;
    public static final boolean DEFAULT_DISABLE_COLD_START_NATIVE_GC = false;
    public static final boolean DEFAULT_DISABLE_MIN_CONCURRENT_GC = false;
    public static final boolean DEFAULT_DRAWABLES_IN_XML_LRU_CACHE = false;
    public static final boolean DEFAULT_ENABLE_COLD_START_AWARE_GC = false;
    public static final boolean DEFAULT_ENABLE_DELAY_NON_CRITICAL_INEEDINITS = false;
    public static final boolean DEFAULT_ENABLE_LIGHTWEIGHT_APP_CHOREOGRAPHER = false;
    public static final boolean DEFAULT_ENABLE_LOCK_DEX_EXP = false;
    public static final boolean DEFAULT_ENABLE_OVERSCROLL_MODIFICATION = false;
    public static final int DEFAULT_ERROR_CHECK_VAC_PERIOD_MS = 0;
    public static final int DEFAULT_FPS_CHECK_FPS_INTERVAL = 0;
    public static final boolean DEFAULT_FPS_ENABLE_DYNAMICALLY = false;
    public static final boolean DEFAULT_FPS_ENABLE_FEED_ONLY = false;
    public static final boolean DEFAULT_FPS_ENABLE_ONLY_IF_EXPECTED_FPS = false;
    public static final int DEFAULT_FPS_EXPECTED_FPS = 60;
    public static final boolean DEFAULT_FPS_FIX_FEED_SPLINES = false;
    public static final double DEFAULT_FPS_MODIFIY_FEED_SPEED = 0.0d;
    public static final boolean DEFAULT_FRAME_RATE_LIMITED_ENABLED = false;
    public static final int DEFAULT_FRAME_RATE_LIMITED_REDUCED_BY = 1;
    public static final boolean DEFAULT_FRAME_RATE_TRY_TO_FAST_HOOK = false;
    public static final boolean DEFAULT_GRAPHICS_CACHE_OVERRIDE_ENABLED = false;
    public static final boolean DEFAULT_GROW_HEAP_AGGRESIVELY_GC = false;
    public static final boolean DEFAULT_IDLE_DETECTOR_THROUGHPUT_ENABLED = false;
    public static final boolean DEFAULT_IDLE_LOW_PRI_INEEDINITS = false;
    public static final int DEFAULT_IDLE_MAX_INTERVAL_MS = 500;
    public static final boolean DEFAULT_IDLE_STARTUP_ITEMS_DELAY_ENABLED = false;
    public static final int DEFAULT_LITHO_DIFF_NODE_SIZE = 256;
    public static final int DEFAULT_LITHO_DISPLAY_LIST_CONTAINER_SIZE = 64;
    public static final int DEFAULT_LITHO_INTERNAL_NODE_SIZE = 256;
    public static final int DEFAULT_LITHO_LAYOUT_OUTPUT_SIZE = 256;
    public static final int DEFAULT_LITHO_LAYOUT_STATE_SIZE = 64;
    public static final int DEFAULT_LITHO_NODE_INFO_SIZE = 256;
    public static final boolean DEFAULT_LITHO_POOL_SIZE_ENABLED = false;
    public static final int DEFAULT_LITHO_YOGA_NODE_SIZE = 256;
    public static final int DEFAULT_LITHO_YOGA_UNSAFE_STORAGE_BACKEND_TYPE = 0;
    public static final boolean DEFAULT_LOCK_ART = false;
    public static final int DEFAULT_LOCK_DEX_NUM = -1;
    public static final int DEFAULT_LRU_DRAWABLE_XML_RESOURCE_CACHE_SIZE = 0;
    public static final int DEFAULT_LRU_XML_RESOURCE_CACHE_SIZE = 0;
    public static final boolean DEFAULT_MADVISE = false;
    public static final boolean DEFAULT_MADVISE_ART = false;
    public static final int DEFAULT_MDCL_SELECTOR = 0;
    public static final boolean DEFAULT_MOBILECONFIG_MADV_RANDOM = false;
    public static final boolean DEFAULT_MOBILECONFIG_MADV_WILL_NEED = false;
    public static final boolean DEFAULT_MOBILECONFIG_MLOCK = false;
    public static final boolean DEFAULT_MOBILECONFIG_PROT_EXEC = false;
    public static final boolean DEFAULT_MPROTECT_EXEC_OAT = false;
    public static final int DEFAULT_NON_CRITICAL_INEED_INIT_IDLE_DELAY = 1500;
    public static final int DEFAULT_NUM_MAX_IDLE_TASKS = 1;
    public static final int DEFAULT_OAT_DATA_MADVISE = 0;
    public static final boolean DEFAULT_OAT_MADVISE = false;
    public static final int DEFAULT_OAT_METADATA_MADVISE = 0;
    public static final boolean DEFAULT_OAT_WILLNEED = false;
    public static final int DEFAULT_OAT_WILLNEED_PERCENTILE = -1;
    public static final double DEFAULT_OVERSCROLL_MODIFICATION_FACTOR = 1.2000000476837158d;
    public static final boolean DEFAULT_PARSE_GENERIC_SYSTEM_PROPERTIES_CONFIG = false;
    public static final boolean DEFAULT_PRIORITIZE_MAIN_THREAD_FIRST = false;
    public static final int DEFAULT_REDUCE_FPS_FRAME_DROP_PERCENT_THRESHOLD = 0;
    public static final int DEFAULT_RESTORE_FPS_FRAME_DROP_PERCENT_THRESHOLD = 0;
    public static final boolean DEFAULT_SUPPRESS_GRAPHQL_ON_STARTUP = false;
    public static final double DEFAULT_TEXTURE_CACHE_FLUSH_RATE = -1.0d;
    public static final double DEFAULT_TEXTURE_CACHE_FLUSH_RATE_CHANGE = -1.0d;
    public static final double DEFAULT_TEXTURE_CACHE_FLUSH_RATE_RATIO_CHANGE = 1.0d;
    public static final int DEFAULT_TEXTURE_CACHE_MB_INCREASE_CHANGE = 0;
    public static final double DEFAULT_TEXTURE_CACHE_RATIO_CHANGE = 1.0d;
    public static final int DEFAULT_TEXTURE_CACHE_VALUE = -1;
    public static final int DEFAULT_THREAD_POOL_HP_I_NEED_INIT_SIZE = -1;
    public static final int DEFAULT_THREAD_POOL_URGENT_SIZE = -1;
    public static final boolean DEFAULT_THREAD_POOL_USE_POOL_DEFAULTS_FOR_SCHEDULED = false;
    public static final boolean DEFAULT_USE_DEPENDENCY_INIT = false;
    public static final boolean DEFAULT_USE_PRIORITY_SCHEDULER = false;
    public static final boolean DEFAULT_USE_SET_VSYNC_RATE = false;
    public static final boolean DEFAULT_WAIT_FOR_REQUIRED_INITS_ONLY = false;
    public static final int DEFAULT_XML_CACHE_SIZE = 0;
    public static final String OLD_FILENAME = "fb4a_mlock_for_dex_files_enabled";
    private static final int READ_BYTES_SIZE = 512;
    public static final String STARTUP_QE_CONFIG_FILENAME = "startup_qes_config";
    private static StartupQEsConfig sCurrentStartupQEsConfig;
    public final boolean combinedThreadPoolDefaultConstrained;
    public final boolean combinedThreadPoolEnabled;
    public final boolean combinedThreadPoolFbThreadPoolExecutor;
    public final int combinedThreadPoolMaxThreads;
    public final boolean combinedThreadPoolOldExecutorStatsEnabled;
    public final boolean combinedThreadPoolPrioritized;
    public final boolean combinedThreadPoolSetThreadPriority;
    public final boolean combinedThreadPoolSingleThreadedExecutor;
    public final boolean combinedThreadPoolStatsEnabled;
    public final int combinedThreadPoolThreadKeepAliveS;
    public final int combinedThreadPoolThreadReserve;
    public final int concurrentGcThreshold;
    public final int defaultTextureCacheValue;
    public final double defaultTextureFlushRateValue;
    public final int delayBetweenIdleCalls;
    public final boolean disableConcurrentGc;
    public final boolean disableMinConcurrent;
    public final boolean disableNativeGC;
    public final int drawableLruResourceCacheSize;
    public final boolean drawablesInXmlLruCache;
    public final boolean enableColdStartAwareGc;
    public final boolean enableLightweightAppChoreographer;
    public final boolean enableLockDexExp;
    public final boolean enableOatMadvise;
    public final boolean enableOverscrollModification;
    public final int fpsCheckFpsIntervalSec;
    public final boolean fpsEnableDynamically;
    public final boolean fpsEnableFeedOnly;
    public final int fpsErrorCheckVsyncIntervalMs;
    public final int fpsExpectedFps;
    public final boolean fpsFixFeedSplines;
    public final double fpsModifiyFeedSpeed;
    public final boolean fpsOnlyEnableIfExpectedFps;
    public final int fpsReduceFpsDropFramesPercentThreshold;
    public final int fpsRestoreFpsDropFramesPercentThreshold;
    public final boolean fpsUseSetVsyncRate;
    public final boolean frameRateLimitedEnabled;
    public final int frameRateLimitedReduceBy;
    public final boolean frameRateTryToFastHook;
    public final boolean graphicsCacheOverrideEnabled;
    public final boolean growHeapAggresively;
    public final boolean idleIncreaseThroughputEnabled;
    public final boolean idleLowPriINeedInits;
    public final int idleMaxIntervalMs;
    public final boolean idleNonCriticalINeedInits;
    public final int idleNonCriticalINeedInitsDelayMs;
    public final boolean idleStartupItemsDelayEnabled;
    public final int lithoDiffNodeSize;
    public final int lithoDisplayListContainerSize;
    public final int lithoInternalNodeSize;
    public final int lithoLayoutOutputSize;
    public final int lithoLayoutStateSize;
    public final int lithoNodeInfoSize;
    public final boolean lithoPoolSizeEnabled;
    public final int lithoYogaNodeSize;
    public final int lithoYogaUnsafeStorageBackendType;
    public final boolean lockArt;
    public final int lockDexNum;
    public final int lruResourceCacheSize;
    public final boolean madviseApk;
    public final boolean madviseArt;
    public final boolean madviseLibColdstart;
    public final boolean madviseSystemBoot;
    public final boolean madviseSystemLib;
    public final int maxIdleTaskRequest;
    public final int mdclSelector;
    public final boolean mobileConfigMAdvRandom;
    public final boolean mobileConfigMAdvWillNeed;
    public final boolean mobileConfigMLock;
    public final boolean mobileConfigProtExec;
    public final boolean mprotectExecOat;
    public final int oatMadviseDataOption;
    public final int oatMadviseMetadataOption;
    public final boolean oatWillNeed;
    public final double overscrollModificationFactor;
    public final boolean parseGenericSystemPropertiesConfig;
    public final boolean prioritizeTheMainThreadFirst;
    public final boolean suppressGraphQLOnStartup;
    public final double textureCacheFlushRateChange;
    public final double textureCacheFlushRateRatioChange;
    public final int textureCacheMbIncreaseChange;
    public final double textureCacheRatioChange;
    public final int threadPoolHPINeedInitSize;
    public final int threadPoolUrgentSize;
    public final boolean threadPoolUsePoolDefaultsForScheduled;
    public final boolean useDependencyInit;
    public final boolean usePriorityScheduler;
    public final boolean waitForRequiredInitsOnly;
    public final int xmlCacheSize;

    public StartupQEsConfig() {
        this(-1, false, false, false, false, -1, false, false, false, false, 1, 0, false, false, DEFAULT_IDLE_MAX_INTERVAL_MS, false, DEFAULT_NON_CRITICAL_INEED_INIT_IDLE_DELAY, false, false, false, false, 0, -1, false, -1, 0, false, 0, false, 1, false, false, 0, 1.0d, -1.0d, 1.0d, false, false, false, 1.2000000476837158d, false, -1, -1.0d, false, 64, 256, 256, 256, 256, 256, 64, 0, false, false, DEFAULT_FPS_MODIFIY_FEED_SPEED, false, false, 0, false, 0, 0, 15, false, false, false, false, false, false, false, false, false, false, 60, 0, false, 0, 0, false, false, 0, false, false, false, false, false, false, false, 0, 0);
    }

    public StartupQEsConfig(int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, boolean z6, boolean z7, boolean z8, int i3, int i4, boolean z9, boolean z10, int i5, boolean z11, int i6, boolean z12, boolean z13, boolean z14, boolean z15, int i7, int i8, boolean z16, int i9, int i10, boolean z17, int i11, boolean z18, int i12, boolean z19, boolean z20, int i13, double d, double d2, double d3, boolean z21, boolean z22, boolean z23, double d4, boolean z24, int i14, double d5, boolean z25, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, boolean z26, boolean z27, double d6, boolean z28, boolean z29, int i23, boolean z30, int i24, int i25, int i26, boolean z31, boolean z32, boolean z33, boolean z34, boolean z35, boolean z36, boolean z37, boolean z38, boolean z39, boolean z40, int i27, int i28, boolean z41, int i29, int i30, boolean z42, boolean z43, int i31, boolean z44, boolean z45, boolean z46, boolean z47, boolean z48, boolean z49, boolean z50, int i32, int i33) {
        this.lockDexNum = i;
        this.lockArt = z;
        this.enableLockDexExp = z2;
        this.enableColdStartAwareGc = z3;
        this.disableConcurrentGc = z4;
        this.concurrentGcThreshold = i2;
        this.disableNativeGC = z5;
        this.growHeapAggresively = z6;
        this.disableMinConcurrent = z7;
        this.idleIncreaseThroughputEnabled = z8;
        if (i3 <= 0) {
            i3 = 1;
        }
        this.maxIdleTaskRequest = i3;
        this.delayBetweenIdleCalls = i4;
        this.prioritizeTheMainThreadFirst = z9;
        this.idleStartupItemsDelayEnabled = z10;
        this.idleMaxIntervalMs = i5;
        this.idleNonCriticalINeedInits = z11;
        this.idleNonCriticalINeedInitsDelayMs = i6;
        this.idleLowPriINeedInits = z12;
        this.mobileConfigProtExec = z13;
        this.mobileConfigMAdvRandom = z14;
        this.mobileConfigMAdvWillNeed = z15;
        this.xmlCacheSize = i7;
        this.threadPoolHPINeedInitSize = i8;
        this.mobileConfigMLock = z16;
        this.threadPoolUrgentSize = i9;
        this.lruResourceCacheSize = i10;
        this.drawablesInXmlLruCache = z17;
        this.drawableLruResourceCacheSize = i11;
        this.frameRateLimitedEnabled = z18;
        this.frameRateLimitedReduceBy = i12;
        this.threadPoolUsePoolDefaultsForScheduled = z19;
        this.graphicsCacheOverrideEnabled = z20;
        this.textureCacheMbIncreaseChange = i13;
        this.textureCacheRatioChange = d;
        this.textureCacheFlushRateChange = d2;
        this.textureCacheFlushRateRatioChange = d3;
        this.parseGenericSystemPropertiesConfig = z21;
        this.madviseArt = z22;
        this.enableOverscrollModification = z23;
        this.overscrollModificationFactor = d4;
        this.madviseApk = z24;
        this.defaultTextureCacheValue = i14;
        this.defaultTextureFlushRateValue = d5;
        this.lithoPoolSizeEnabled = z25;
        this.lithoLayoutStateSize = i15;
        this.lithoInternalNodeSize = i16;
        this.lithoNodeInfoSize = i17;
        this.lithoDiffNodeSize = i18;
        this.lithoLayoutOutputSize = i19;
        this.lithoYogaNodeSize = i20;
        this.lithoDisplayListContainerSize = i21;
        this.lithoYogaUnsafeStorageBackendType = i22;
        this.frameRateTryToFastHook = z26;
        this.fpsFixFeedSplines = z27;
        this.fpsModifiyFeedSpeed = d6;
        this.fpsEnableFeedOnly = z28;
        this.enableLightweightAppChoreographer = z29;
        this.mdclSelector = i23;
        this.combinedThreadPoolEnabled = z30;
        this.combinedThreadPoolThreadReserve = i24;
        this.combinedThreadPoolMaxThreads = i25;
        this.combinedThreadPoolThreadKeepAliveS = i26;
        this.combinedThreadPoolStatsEnabled = z31;
        this.combinedThreadPoolOldExecutorStatsEnabled = z32;
        this.combinedThreadPoolSetThreadPriority = z33;
        this.madviseSystemBoot = z34;
        this.madviseLibColdstart = z35;
        this.madviseSystemLib = z36;
        this.useDependencyInit = z37;
        this.usePriorityScheduler = z38;
        this.waitForRequiredInitsOnly = z39;
        this.fpsOnlyEnableIfExpectedFps = z40;
        this.fpsExpectedFps = i27;
        this.fpsCheckFpsIntervalSec = i28;
        this.fpsEnableDynamically = z41;
        this.fpsReduceFpsDropFramesPercentThreshold = i29;
        this.fpsRestoreFpsDropFramesPercentThreshold = i30;
        this.oatWillNeed = z42;
        this.fpsUseSetVsyncRate = z43;
        this.fpsErrorCheckVsyncIntervalMs = i31;
        this.suppressGraphQLOnStartup = z44;
        this.combinedThreadPoolDefaultConstrained = z45;
        this.combinedThreadPoolFbThreadPoolExecutor = z46;
        this.mprotectExecOat = z47;
        this.combinedThreadPoolSingleThreadedExecutor = z48;
        this.combinedThreadPoolPrioritized = z49;
        this.enableOatMadvise = z50;
        this.oatMadviseMetadataOption = i32;
        this.oatMadviseDataOption = i33;
    }

    private static StartupQEsConfig constructV1Experiment(int i) {
        return constructV2Experiment(i, false);
    }

    private static StartupQEsConfig constructV2Experiment(int i, boolean z) {
        return new StartupQEsConfig(i, z, true, false, false, -1, false, false, false, false, 1, 0, false, false, DEFAULT_IDLE_MAX_INTERVAL_MS, false, DEFAULT_NON_CRITICAL_INEED_INIT_IDLE_DELAY, false, false, false, false, 0, -1, false, -1, 0, false, 0, false, 1, false, false, 0, 1.0d, -1.0d, 1.0d, false, false, false, 1.2000000476837158d, false, -1, -1.0d, false, 64, 256, 256, 256, 256, 256, 64, 0, false, false, DEFAULT_FPS_MODIFIY_FEED_SPEED, false, false, 0, false, 0, 0, 15, false, false, false, false, false, false, false, false, false, false, 60, 0, false, 0, 0, false, false, 0, false, false, false, false, false, false, false, 0, 0);
    }

    private static StartupQEsConfig defaultExperiment() {
        return new StartupQEsConfig();
    }

    private static int doubleHashCode(double d) {
        return Double.valueOf(d).hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof StartupQEsConfig)) {
            return false;
        }
        StartupQEsConfig startupQEsConfig = (StartupQEsConfig) obj;
        if (this.lockDexNum == startupQEsConfig.lockDexNum && this.lockArt == startupQEsConfig.lockArt && this.enableLockDexExp == startupQEsConfig.enableLockDexExp && this.enableColdStartAwareGc == startupQEsConfig.enableColdStartAwareGc && this.disableConcurrentGc == startupQEsConfig.disableConcurrentGc && this.concurrentGcThreshold == startupQEsConfig.concurrentGcThreshold && this.disableNativeGC == startupQEsConfig.disableNativeGC && this.growHeapAggresively == startupQEsConfig.growHeapAggresively && this.idleIncreaseThroughputEnabled == startupQEsConfig.idleIncreaseThroughputEnabled && this.maxIdleTaskRequest == startupQEsConfig.maxIdleTaskRequest && this.delayBetweenIdleCalls == startupQEsConfig.delayBetweenIdleCalls && this.prioritizeTheMainThreadFirst == startupQEsConfig.prioritizeTheMainThreadFirst && this.idleStartupItemsDelayEnabled == startupQEsConfig.idleStartupItemsDelayEnabled && this.idleMaxIntervalMs == startupQEsConfig.idleMaxIntervalMs && this.idleNonCriticalINeedInits == startupQEsConfig.idleNonCriticalINeedInits && this.idleNonCriticalINeedInitsDelayMs == startupQEsConfig.idleNonCriticalINeedInitsDelayMs && this.idleLowPriINeedInits == startupQEsConfig.idleLowPriINeedInits && this.mobileConfigProtExec == startupQEsConfig.mobileConfigProtExec && this.mobileConfigMAdvRandom == startupQEsConfig.mobileConfigMAdvRandom && this.mobileConfigMAdvWillNeed == startupQEsConfig.mobileConfigMAdvWillNeed && this.xmlCacheSize == startupQEsConfig.xmlCacheSize && this.threadPoolHPINeedInitSize == startupQEsConfig.threadPoolHPINeedInitSize && this.mobileConfigMLock == startupQEsConfig.mobileConfigMLock && this.threadPoolUrgentSize == startupQEsConfig.threadPoolUrgentSize && this.lruResourceCacheSize == startupQEsConfig.lruResourceCacheSize && this.drawablesInXmlLruCache == startupQEsConfig.drawablesInXmlLruCache && this.drawableLruResourceCacheSize == startupQEsConfig.drawableLruResourceCacheSize && this.frameRateLimitedEnabled == startupQEsConfig.frameRateLimitedEnabled && this.frameRateLimitedReduceBy == startupQEsConfig.frameRateLimitedReduceBy && this.threadPoolUsePoolDefaultsForScheduled == startupQEsConfig.threadPoolUsePoolDefaultsForScheduled && this.graphicsCacheOverrideEnabled == startupQEsConfig.graphicsCacheOverrideEnabled && this.textureCacheMbIncreaseChange == startupQEsConfig.textureCacheMbIncreaseChange && this.textureCacheRatioChange == startupQEsConfig.textureCacheRatioChange && this.textureCacheFlushRateChange == startupQEsConfig.textureCacheFlushRateChange && this.textureCacheFlushRateRatioChange == startupQEsConfig.textureCacheFlushRateRatioChange && this.parseGenericSystemPropertiesConfig == startupQEsConfig.parseGenericSystemPropertiesConfig && this.madviseArt == startupQEsConfig.madviseArt && this.enableOverscrollModification == startupQEsConfig.enableOverscrollModification && this.overscrollModificationFactor == startupQEsConfig.overscrollModificationFactor && this.madviseApk == startupQEsConfig.madviseApk && this.defaultTextureCacheValue == startupQEsConfig.defaultTextureCacheValue && this.defaultTextureFlushRateValue == startupQEsConfig.defaultTextureFlushRateValue && this.lithoPoolSizeEnabled == startupQEsConfig.lithoPoolSizeEnabled && this.lithoLayoutStateSize == startupQEsConfig.lithoLayoutStateSize && this.lithoInternalNodeSize == startupQEsConfig.lithoInternalNodeSize && this.lithoNodeInfoSize == startupQEsConfig.lithoNodeInfoSize && this.lithoDiffNodeSize == startupQEsConfig.lithoDiffNodeSize && this.lithoLayoutOutputSize == startupQEsConfig.lithoLayoutOutputSize && this.lithoYogaNodeSize == startupQEsConfig.lithoYogaNodeSize && this.lithoDisplayListContainerSize == startupQEsConfig.lithoDisplayListContainerSize && this.lithoYogaUnsafeStorageBackendType == startupQEsConfig.lithoYogaUnsafeStorageBackendType && this.frameRateTryToFastHook == startupQEsConfig.frameRateTryToFastHook && this.fpsFixFeedSplines == startupQEsConfig.fpsFixFeedSplines && this.fpsModifiyFeedSpeed == startupQEsConfig.fpsModifiyFeedSpeed && this.fpsEnableFeedOnly == startupQEsConfig.fpsEnableFeedOnly && this.enableLightweightAppChoreographer == startupQEsConfig.enableLightweightAppChoreographer && this.mdclSelector == startupQEsConfig.mdclSelector && this.combinedThreadPoolEnabled == startupQEsConfig.combinedThreadPoolEnabled && this.combinedThreadPoolThreadReserve == startupQEsConfig.combinedThreadPoolThreadReserve && this.combinedThreadPoolMaxThreads == startupQEsConfig.combinedThreadPoolMaxThreads && this.combinedThreadPoolThreadKeepAliveS == startupQEsConfig.combinedThreadPoolThreadKeepAliveS && this.combinedThreadPoolStatsEnabled == startupQEsConfig.combinedThreadPoolStatsEnabled && this.combinedThreadPoolOldExecutorStatsEnabled == startupQEsConfig.combinedThreadPoolOldExecutorStatsEnabled && this.combinedThreadPoolSetThreadPriority == startupQEsConfig.combinedThreadPoolSetThreadPriority && this.madviseSystemBoot == startupQEsConfig.madviseSystemBoot && this.madviseLibColdstart == startupQEsConfig.madviseLibColdstart && this.madviseSystemLib == startupQEsConfig.madviseSystemLib && this.useDependencyInit == startupQEsConfig.useDependencyInit && this.usePriorityScheduler == startupQEsConfig.usePriorityScheduler && this.waitForRequiredInitsOnly == startupQEsConfig.waitForRequiredInitsOnly && this.fpsOnlyEnableIfExpectedFps == startupQEsConfig.fpsOnlyEnableIfExpectedFps && this.fpsExpectedFps == startupQEsConfig.fpsExpectedFps && this.fpsCheckFpsIntervalSec == startupQEsConfig.fpsCheckFpsIntervalSec && this.fpsEnableDynamically == startupQEsConfig.fpsEnableDynamically && this.fpsReduceFpsDropFramesPercentThreshold == startupQEsConfig.fpsReduceFpsDropFramesPercentThreshold && this.fpsRestoreFpsDropFramesPercentThreshold == startupQEsConfig.fpsRestoreFpsDropFramesPercentThreshold && this.oatWillNeed == startupQEsConfig.oatWillNeed && this.fpsUseSetVsyncRate == startupQEsConfig.fpsUseSetVsyncRate && this.fpsErrorCheckVsyncIntervalMs == startupQEsConfig.fpsErrorCheckVsyncIntervalMs && this.suppressGraphQLOnStartup == startupQEsConfig.suppressGraphQLOnStartup && this.combinedThreadPoolDefaultConstrained == startupQEsConfig.combinedThreadPoolDefaultConstrained && this.combinedThreadPoolFbThreadPoolExecutor == startupQEsConfig.combinedThreadPoolFbThreadPoolExecutor && this.mprotectExecOat == startupQEsConfig.mprotectExecOat && this.combinedThreadPoolSingleThreadedExecutor == startupQEsConfig.combinedThreadPoolSingleThreadedExecutor && this.combinedThreadPoolPrioritized == startupQEsConfig.combinedThreadPoolPrioritized && this.enableOatMadvise == startupQEsConfig.enableOatMadvise && this.oatMadviseMetadataOption == startupQEsConfig.oatMadviseMetadataOption && this.oatMadviseDataOption == startupQEsConfig.oatMadviseDataOption) {
            return true;
        }
        return false;
    }

    public static StartupQEsConfig getCurrentStartupQEsConfig() {
        return sCurrentStartupQEsConfig;
    }

    public static synchronized StartupQEsConfig getCurrentStartupQEsConfig(Context context) {
        StartupQEsConfig startupQEsConfig;
        synchronized (StartupQEsConfig.class) {
            initCurrentStartupQEsConfig(context);
            startupQEsConfig = sCurrentStartupQEsConfig;
        }
        return startupQEsConfig;
    }

    public int hashCode() {
        int doubleHashCode = (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.lockDexNum + 31) * 31) + this.lockArt) * 31) + this.enableLockDexExp) * 31) + this.enableColdStartAwareGc) * 31) + this.disableConcurrentGc) * 31) + this.concurrentGcThreshold) * 31) + this.disableNativeGC) * 31) + this.growHeapAggresively) * 31) + this.disableMinConcurrent) * 31) + this.idleIncreaseThroughputEnabled) * 31) + this.maxIdleTaskRequest) * 31) + this.delayBetweenIdleCalls) * 31) + this.prioritizeTheMainThreadFirst) * 31) + this.idleStartupItemsDelayEnabled) * 31) + this.idleMaxIntervalMs) * 31) + this.idleNonCriticalINeedInits) * 31) + this.idleNonCriticalINeedInitsDelayMs) * 31) + this.idleLowPriINeedInits) * 31) + this.mobileConfigProtExec) * 31) + this.mobileConfigMAdvRandom) * 31) + this.mobileConfigMAdvWillNeed) * 31) + this.xmlCacheSize) * 31) + this.threadPoolHPINeedInitSize) * 31) + this.mobileConfigMLock) * 31) + this.threadPoolUrgentSize) * 31) + this.drawableLruResourceCacheSize) * 31) + this.drawablesInXmlLruCache) * 31) + this.lruResourceCacheSize) * 31) + this.frameRateLimitedEnabled) * 31) + this.frameRateLimitedReduceBy) * 31) + this.threadPoolUsePoolDefaultsForScheduled) * 31) + this.graphicsCacheOverrideEnabled) * 31) + this.textureCacheMbIncreaseChange) * 31) + doubleHashCode(this.textureCacheRatioChange)) * 31) + doubleHashCode(this.textureCacheFlushRateChange)) * 31) + doubleHashCode(this.textureCacheFlushRateRatioChange)) * 31) + this.parseGenericSystemPropertiesConfig) * 31) + this.madviseArt) * 31) + this.madviseApk) * 31) + this.enableOverscrollModification) * 31) + doubleHashCode(this.overscrollModificationFactor)) * 31) + this.defaultTextureCacheValue) * 31) + doubleHashCode(this.defaultTextureFlushRateValue)) * 31) + this.lithoPoolSizeEnabled) * 31) + this.lithoLayoutStateSize) * 31) + this.lithoInternalNodeSize) * 31) + this.lithoNodeInfoSize) * 31) + this.lithoDiffNodeSize) * 31) + this.lithoLayoutOutputSize) * 31) + this.lithoYogaNodeSize) * 31) + this.lithoDisplayListContainerSize) * 31) + this.lithoYogaUnsafeStorageBackendType) * 31) + this.frameRateTryToFastHook) * 31) + this.fpsFixFeedSplines) * 31) + doubleHashCode(this.fpsModifiyFeedSpeed)) * 31) + this.fpsEnableFeedOnly) * 31) + this.enableLightweightAppChoreographer) * 31) + this.mdclSelector) * 31) + this.combinedThreadPoolEnabled) * 31) + this.combinedThreadPoolThreadReserve) * 31) + this.combinedThreadPoolMaxThreads) * 31) + this.combinedThreadPoolThreadKeepAliveS) * 31) + this.combinedThreadPoolStatsEnabled) * 31) + this.combinedThreadPoolOldExecutorStatsEnabled) * 31) + this.combinedThreadPoolSetThreadPriority) * 31) + this.madviseSystemBoot) * 31) + this.madviseLibColdstart) * 31) + this.madviseSystemLib) * 31) + this.useDependencyInit) * 31) + this.usePriorityScheduler) * 31) + this.waitForRequiredInitsOnly) * 31) + this.fpsOnlyEnableIfExpectedFps) * 31) + this.fpsExpectedFps) * 31) + this.fpsCheckFpsIntervalSec) * 31) + this.fpsEnableDynamically) * 31) + this.fpsReduceFpsDropFramesPercentThreshold) * 31) + this.fpsRestoreFpsDropFramesPercentThreshold) * 31) + this.oatWillNeed) * 31;
        boolean z = this.mprotectExecOat;
        return ((((((((((((((((((((((doubleHashCode + z) * 31) + this.fpsUseSetVsyncRate) * 31) + this.fpsErrorCheckVsyncIntervalMs) * 31) + this.suppressGraphQLOnStartup) * 31) + this.combinedThreadPoolDefaultConstrained) * 31) + this.combinedThreadPoolFbThreadPoolExecutor) * 31) + z) * 31) + this.combinedThreadPoolSingleThreadedExecutor) * 31) + this.combinedThreadPoolPrioritized) * 31) + this.enableOatMadvise) * 31) + this.oatMadviseMetadataOption) * 31) + this.oatMadviseDataOption;
    }

    public static void initCurrentStartupQEsConfig(Context context) {
        if (sCurrentStartupQEsConfig == null) {
            sCurrentStartupQEsConfig = readExperimentFromDisk(context);
        }
    }

    private static StartupQEsConfig readExperimentFromDisk(Context context) {
        Throwable e;
        Throwable th;
        File fileStreamPath = context.getFileStreamPath(STARTUP_QE_CONFIG_FILENAME);
        if (!fileStreamPath.exists()) {
            return defaultExperiment();
        }
        Closeable closeable = null;
        StartupQEsConfig defaultExperiment;
        try {
            Closeable fileInputStream = new FileInputStream(fileStreamPath);
            try {
                byte[] bArr = new byte[512];
                int slurp = Fs.slurp(fileInputStream, bArr, 512);
                if (slurp <= 0) {
                    defaultExperiment = defaultExperiment();
                    Fs.safeClose(fileInputStream);
                    return defaultExperiment;
                }
                ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, slurp);
                int i = wrap.getInt();
                if (wrap.hasRemaining()) {
                    boolean readNextBoolean = readNextBoolean(wrap);
                    if (wrap.hasRemaining()) {
                        boolean readNextBoolean2 = readNextBoolean(wrap);
                        boolean readNextBoolean3 = readNextBoolean(wrap);
                        boolean readNextBoolean4 = readNextBoolean(wrap);
                        int i2 = wrap.getInt();
                        boolean readNextBooleanOrDefault = readNextBooleanOrDefault(wrap, false);
                        boolean readNextBooleanOrDefault2 = readNextBooleanOrDefault(wrap, false);
                        boolean readNextBooleanOrDefault3 = readNextBooleanOrDefault(wrap, false);
                        boolean readNextBooleanOrDefault4 = readNextBooleanOrDefault(wrap, false);
                        int readNextIntOrDefault = readNextIntOrDefault(wrap, 1);
                        int readNextIntOrDefault2 = readNextIntOrDefault(wrap, 0);
                        boolean readNextBooleanOrDefault5 = readNextBooleanOrDefault(wrap, false);
                        readNextIntOrDefault(wrap, 0);
                        readNextBooleanOrDefault(wrap, false);
                        readNextIntOrDefault(wrap, 0);
                        readNextIntOrDefault(wrap, 0);
                        readNextIntOrDefault(wrap, 0);
                        readNextIntOrDefault(wrap, 0);
                        readNextIntOrDefault(wrap, 0);
                        readNextIntOrDefault(wrap, 0);
                        readNextIntOrDefault(wrap, 0);
                        boolean readNextBooleanOrDefault6 = readNextBooleanOrDefault(wrap, false);
                        int readNextIntOrDefault3 = readNextIntOrDefault(wrap, DEFAULT_IDLE_MAX_INTERVAL_MS);
                        boolean readNextBooleanOrDefault7 = readNextBooleanOrDefault(wrap, false);
                        int readNextIntOrDefault4 = readNextIntOrDefault(wrap, DEFAULT_NON_CRITICAL_INEED_INIT_IDLE_DELAY);
                        boolean readNextBooleanOrDefault8 = readNextBooleanOrDefault(wrap, false);
                        boolean readNextBooleanOrDefault9 = readNextBooleanOrDefault(wrap, false);
                        boolean readNextBooleanOrDefault10 = readNextBooleanOrDefault(wrap, false);
                        boolean readNextBooleanOrDefault11 = readNextBooleanOrDefault(wrap, false);
                        int readNextIntOrDefault5 = readNextIntOrDefault(wrap, 0);
                        readNextIntOrDefault(wrap, 0);
                        int readNextIntOrDefault6 = readNextIntOrDefault(wrap, -1);
                        boolean readNextBooleanOrDefault12 = readNextBooleanOrDefault(wrap, false);
                        int readNextIntOrDefault7 = readNextIntOrDefault(wrap, -1);
                        readNextBooleanOrDefault(wrap, false);
                        int readNextIntOrDefault8 = readNextIntOrDefault(wrap, 0);
                        boolean readNextBooleanOrDefault13 = readNextBooleanOrDefault(wrap, false);
                        int readNextIntOrDefault9 = readNextIntOrDefault(wrap, 0);
                        readNextIntOrDefault(wrap, 0);
                        boolean readNextBooleanOrDefault14 = readNextBooleanOrDefault(wrap, false);
                        int readNextIntOrDefault10 = readNextIntOrDefault(wrap, 1);
                        boolean readNextBooleanOrDefault15 = readNextBooleanOrDefault(wrap, false);
                        int readNextIntOrDefault11 = readNextIntOrDefault(wrap, 0);
                        double readNextDoubleOrDefault = readNextDoubleOrDefault(wrap, 1.0d);
                        double readNextDoubleOrDefault2 = readNextDoubleOrDefault(wrap, -1.0d);
                        double readNextDoubleOrDefault3 = readNextDoubleOrDefault(wrap, 1.0d);
                        boolean readNextBooleanOrDefault16 = readNextBooleanOrDefault(wrap, false);
                        boolean readNextBooleanOrDefault17 = readNextBooleanOrDefault(wrap, false);
                        boolean readNextBooleanOrDefault18 = readNextBooleanOrDefault(wrap, false);
                        double readNextDoubleOrDefault4 = readNextDoubleOrDefault(wrap, 1.2000000476837158d);
                        boolean readNextBooleanOrDefault19 = readNextBooleanOrDefault(wrap, false);
                        int readNextIntOrDefault12 = readNextIntOrDefault(wrap, -1);
                        double readNextDoubleOrDefault5 = readNextDoubleOrDefault(wrap, -1.0d);
                        boolean readNextBooleanOrDefault20 = readNextBooleanOrDefault(wrap, false);
                        boolean readNextBooleanOrDefault21 = readNextBooleanOrDefault(wrap, false);
                        int readNextIntOrDefault13 = readNextIntOrDefault(wrap, 64);
                        int readNextIntOrDefault14 = readNextIntOrDefault(wrap, 256);
                        int readNextIntOrDefault15 = readNextIntOrDefault(wrap, 256);
                        int readNextIntOrDefault16 = readNextIntOrDefault(wrap, 256);
                        int readNextIntOrDefault17 = readNextIntOrDefault(wrap, 256);
                        int readNextIntOrDefault18 = readNextIntOrDefault(wrap, 256);
                        int readNextIntOrDefault19 = readNextIntOrDefault(wrap, 64);
                        boolean readNextBooleanOrDefault22 = readNextBooleanOrDefault(wrap, false);
                        boolean readNextBooleanOrDefault23 = readNextBooleanOrDefault(wrap, false);
                        double readNextDoubleOrDefault6 = readNextDoubleOrDefault(wrap, DEFAULT_FPS_MODIFIY_FEED_SPEED);
                        boolean readNextBooleanOrDefault24 = readNextBooleanOrDefault(wrap, false);
                        boolean readNextBooleanOrDefault25 = readNextBooleanOrDefault(wrap, false);
                        int readNextIntOrDefault20 = readNextIntOrDefault(wrap, 0);
                        boolean readNextBooleanOrDefault26 = readNextBooleanOrDefault(wrap, false);
                        int readNextIntOrDefault21 = readNextIntOrDefault(wrap, 0);
                        int readNextIntOrDefault22 = readNextIntOrDefault(wrap, 0);
                        int readNextIntOrDefault23 = readNextIntOrDefault(wrap, 15);
                        boolean readNextBooleanOrDefault27 = readNextBooleanOrDefault(wrap, false);
                        boolean readNextBooleanOrDefault28 = readNextBooleanOrDefault(wrap, false);
                        boolean readNextBooleanOrDefault29 = readNextBooleanOrDefault(wrap, false);
                        boolean readNextBooleanOrDefault30 = readNextBooleanOrDefault(wrap, false);
                        boolean readNextBooleanOrDefault31 = readNextBooleanOrDefault(wrap, false);
                        boolean readNextBooleanOrDefault32 = readNextBooleanOrDefault(wrap, false);
                        boolean readNextBooleanOrDefault33 = readNextBooleanOrDefault(wrap, false);
                        boolean readNextBooleanOrDefault34 = readNextBooleanOrDefault(wrap, false);
                        boolean readNextBooleanOrDefault35 = readNextBooleanOrDefault(wrap, false);
                        boolean readNextBooleanOrDefault36 = readNextBooleanOrDefault(wrap, false);
                        int readNextIntOrDefault24 = readNextIntOrDefault(wrap, 60);
                        int readNextIntOrDefault25 = readNextIntOrDefault(wrap, 0);
                        boolean readNextBooleanOrDefault37 = readNextBooleanOrDefault(wrap, false);
                        int readNextIntOrDefault26 = readNextIntOrDefault(wrap, 0);
                        int readNextIntOrDefault27 = readNextIntOrDefault(wrap, 0);
                        StartupQEsConfig startupQEsConfig = new StartupQEsConfig(i, readNextBoolean, readNextBoolean2, readNextBoolean3, readNextBoolean4, i2, readNextBooleanOrDefault, readNextBooleanOrDefault2, readNextBooleanOrDefault3, readNextBooleanOrDefault4, readNextIntOrDefault, readNextIntOrDefault2, readNextBooleanOrDefault5, readNextBooleanOrDefault6, readNextIntOrDefault3, readNextBooleanOrDefault7, readNextIntOrDefault4, readNextBooleanOrDefault8, readNextBooleanOrDefault9, readNextBooleanOrDefault10, readNextBooleanOrDefault11, readNextIntOrDefault5, readNextIntOrDefault6, readNextBooleanOrDefault12, readNextIntOrDefault7, readNextIntOrDefault8, readNextBooleanOrDefault13, readNextIntOrDefault9, readNextBooleanOrDefault14, readNextIntOrDefault10, readNextBooleanOrDefault20, readNextBooleanOrDefault15, readNextIntOrDefault11, readNextDoubleOrDefault, readNextDoubleOrDefault2, readNextDoubleOrDefault3, readNextBooleanOrDefault16, readNextBooleanOrDefault17, readNextBooleanOrDefault18, readNextDoubleOrDefault4, readNextBooleanOrDefault19, readNextIntOrDefault12, readNextDoubleOrDefault5, readNextBooleanOrDefault21, readNextIntOrDefault13, readNextIntOrDefault14, readNextIntOrDefault15, readNextIntOrDefault16, readNextIntOrDefault17, readNextIntOrDefault18, readNextIntOrDefault19, readNextIntOrDefault(wrap, 0), readNextBooleanOrDefault22, readNextBooleanOrDefault23, readNextDoubleOrDefault6, readNextBooleanOrDefault24, readNextBooleanOrDefault25, readNextIntOrDefault20, readNextBooleanOrDefault26, readNextIntOrDefault21, readNextIntOrDefault22, readNextIntOrDefault23, readNextBooleanOrDefault27, readNextBooleanOrDefault28, readNextBooleanOrDefault29, readNextBooleanOrDefault30, readNextBooleanOrDefault31, readNextBooleanOrDefault32, readNextBooleanOrDefault33, readNextBooleanOrDefault34, readNextBooleanOrDefault35, readNextBooleanOrDefault36, readNextIntOrDefault24, readNextIntOrDefault25, readNextBooleanOrDefault37, readNextIntOrDefault26, readNextIntOrDefault27, readNextBooleanOrDefault(wrap, false), readNextBooleanOrDefault(wrap, false), readNextIntOrDefault(wrap, 0), readNextBooleanOrDefault(wrap, false), readNextBooleanOrDefault(wrap, false), readNextBooleanOrDefault(wrap, false), readNextBooleanOrDefault(wrap, false), readNextBooleanOrDefault(wrap, false), readNextBooleanOrDefault(wrap, false), readNextBooleanOrDefault(wrap, false), readNextIntOrDefault(wrap, 0), readNextIntOrDefault(wrap, 0));
                        Fs.safeClose(fileInputStream);
                        return startupQEsConfig;
                    }
                    defaultExperiment = constructV2Experiment(i, readNextBoolean);
                    Fs.safeClose(fileInputStream);
                    return defaultExperiment;
                }
                defaultExperiment = constructV1Experiment(i);
                Fs.safeClose(fileInputStream);
                return defaultExperiment;
            } catch (IOException e2) {
                e = e2;
                closeable = fileInputStream;
                try {
                    Mlog.m53e(e, "Cannot read file %s", STARTUP_QE_CONFIG_FILENAME);
                    defaultExperiment = defaultExperiment();
                    Fs.safeClose(closeable);
                    return defaultExperiment;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = closeable;
                    Fs.safeClose(fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                Fs.safeClose(fileInputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            Mlog.m53e(e, "Cannot read file %s", STARTUP_QE_CONFIG_FILENAME);
            defaultExperiment = defaultExperiment();
            Fs.safeClose(closeable);
            return defaultExperiment;
        }
    }

    private static boolean readNextBoolean(ByteBuffer byteBuffer) {
        return byteBuffer.getInt() != null ? true : null;
    }

    private static boolean readNextBooleanOrDefault(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasRemaining()) {
            return readNextBoolean(byteBuffer);
        }
        return z;
    }

    private static double readNextDoubleOrDefault(ByteBuffer byteBuffer, double d) {
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.getDouble();
        }
        return d;
    }

    private static int readNextIntOrDefault(ByteBuffer byteBuffer, int i) {
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.getInt();
        }
        return i;
    }

    public static void removeExperimentFromDisk(Context context) {
        removeFileFromDisk(context, STARTUP_QE_CONFIG_FILENAME);
        removeFileFromDisk(context, OLD_FILENAME);
    }

    private static void removeFileFromDisk(Context context, String str) {
        str = context.getFileStreamPath(str);
        if (str.exists() != null) {
            str.delete();
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(" Lock Dex Num: ");
        stringBuilder.append(this.lockDexNum);
        stringBuilder.append(" Lock Art:");
        stringBuilder.append(this.lockArt);
        stringBuilder.append(" Lock Art:");
        stringBuilder.append(this.enableLockDexExp);
        stringBuilder.append(" Enable ColdStart Aware GC:");
        stringBuilder.append(this.enableColdStartAwareGc);
        stringBuilder.append(" Disable Concurrent GC:");
        stringBuilder.append(this.disableConcurrentGc);
        stringBuilder.append(" Concurrent GC Threshold:");
        stringBuilder.append(this.concurrentGcThreshold);
        stringBuilder.append(" Disable Native GC:");
        stringBuilder.append(this.disableNativeGC);
        stringBuilder.append(" Grow Heap Aggresively:");
        stringBuilder.append(this.growHeapAggresively);
        stringBuilder.append(" Disable min concurrent:");
        stringBuilder.append(this.disableMinConcurrent);
        stringBuilder.append(" Idle throughput enabled:");
        stringBuilder.append(this.idleIncreaseThroughputEnabled);
        stringBuilder.append(" Max idle requests:");
        stringBuilder.append(this.maxIdleTaskRequest);
        stringBuilder.append(" Delay between idle calss:");
        stringBuilder.append(this.delayBetweenIdleCalls);
        stringBuilder.append(" Prioritizew main thread:");
        stringBuilder.append(this.prioritizeTheMainThreadFirst);
        stringBuilder.append(" Idle Startup Items delayed: ");
        stringBuilder.append(this.idleStartupItemsDelayEnabled);
        stringBuilder.append(" Idle Max Interval Startup: ");
        stringBuilder.append(this.idleMaxIntervalMs);
        stringBuilder.append(" Idle NonCritical INeedInits: ");
        stringBuilder.append(this.idleNonCriticalINeedInits);
        stringBuilder.append(" Idle NonCritical INeedInits Dealy: ");
        stringBuilder.append(this.idleNonCriticalINeedInitsDelayMs);
        stringBuilder.append(" Idle LowPri INeedInits: ");
        stringBuilder.append(this.idleLowPriINeedInits);
        stringBuilder.append(" MC PROT_EXEC: ");
        stringBuilder.append(this.mobileConfigProtExec);
        stringBuilder.append(" MC madvise random: ");
        stringBuilder.append(this.mobileConfigMAdvRandom);
        stringBuilder.append(" MC madvise  will need: ");
        stringBuilder.append(this.mobileConfigMAdvWillNeed);
        stringBuilder.append(" XML Cache Size: ");
        stringBuilder.append(this.xmlCacheSize);
        stringBuilder.append(" Threadpool IHPNeedInit Size: ");
        stringBuilder.append(this.threadPoolHPINeedInitSize);
        stringBuilder.append(" Mobile Config MLock");
        stringBuilder.append(this.mobileConfigMLock);
        stringBuilder.append(" Threadpool Urgent Size: ");
        stringBuilder.append(this.threadPoolUrgentSize);
        stringBuilder.append(" LRU XML Resource Cache Size: ");
        stringBuilder.append(this.lruResourceCacheSize);
        stringBuilder.append(" Drawables in LRU Xml Cache: ");
        stringBuilder.append(this.drawablesInXmlLruCache);
        stringBuilder.append(" Drawable XML LRU Cache Size: ");
        stringBuilder.append(this.drawableLruResourceCacheSize);
        stringBuilder.append(" Frame Rate Limited Enabled: ");
        stringBuilder.append(this.frameRateLimitedEnabled);
        stringBuilder.append(" Frame Rate Reduced By: ");
        stringBuilder.append(this.frameRateLimitedReduceBy);
        stringBuilder.append(" Threadpool Use Pool Defaults For Scheduled:");
        stringBuilder.append(this.threadPoolUsePoolDefaultsForScheduled);
        stringBuilder.append(" Graphics Cache Override Enabled: ");
        stringBuilder.append(this.graphicsCacheOverrideEnabled);
        stringBuilder.append(" Texture Cache MB Increase: ");
        stringBuilder.append(this.textureCacheMbIncreaseChange);
        stringBuilder.append(" Texture Cache Ratio Change: ");
        stringBuilder.append(this.textureCacheRatioChange);
        stringBuilder.append(" Texture Cache Flush Rate Change: ");
        stringBuilder.append(this.textureCacheFlushRateChange);
        stringBuilder.append(" Texture Cache Flush Rate Ratio Change: ");
        stringBuilder.append(this.textureCacheFlushRateRatioChange);
        stringBuilder.append(" Parse Generic System Properties Config: ");
        stringBuilder.append(this.parseGenericSystemPropertiesConfig);
        stringBuilder.append(" madviseArt: ");
        stringBuilder.append(this.madviseArt);
        stringBuilder.append(" enableOverscrollModification: ");
        stringBuilder.append(this.enableOverscrollModification);
        stringBuilder.append(" overscrollModificationFactor: ");
        stringBuilder.append(this.overscrollModificationFactor);
        stringBuilder.append(" madviseApk: ");
        stringBuilder.append(this.madviseApk);
        stringBuilder.append(" defaultTextureCacheValue: ");
        stringBuilder.append(this.defaultTextureCacheValue);
        stringBuilder.append(" defaultTextureFlushRateValue: ");
        stringBuilder.append(this.defaultTextureFlushRateValue);
        stringBuilder.append(" frameRateTryToFastHook: ");
        stringBuilder.append(this.frameRateTryToFastHook);
        stringBuilder.append(" fpsFixFeedSplines: ");
        stringBuilder.append(this.fpsFixFeedSplines);
        stringBuilder.append(" fpsModifiyFeedSpeed: ");
        stringBuilder.append(this.fpsModifiyFeedSpeed);
        stringBuilder.append(" fpsEnableFeedOnly: ");
        stringBuilder.append(this.fpsEnableFeedOnly);
        stringBuilder.append(" enableLightweightAppChoreographer: ");
        stringBuilder.append(this.enableLightweightAppChoreographer);
        stringBuilder.append(" mdclSelector: ");
        stringBuilder.append(this.mdclSelector);
        stringBuilder.append(" combinedThreadPoolEnabled: ");
        stringBuilder.append(this.combinedThreadPoolEnabled);
        stringBuilder.append(" combinedThreadPoolThreadReserve: ");
        stringBuilder.append(this.combinedThreadPoolThreadReserve);
        stringBuilder.append(" combinedThreadPoolMaxThreads:");
        stringBuilder.append(this.combinedThreadPoolMaxThreads);
        stringBuilder.append(" combinedThreadPoolThreadKeepAliveS: ");
        stringBuilder.append(this.combinedThreadPoolThreadKeepAliveS);
        stringBuilder.append(" combinedThreadPoolStatsEnabled: ");
        stringBuilder.append(this.combinedThreadPoolStatsEnabled);
        stringBuilder.append(" combinedThreadPoolOldExecutorStatsEnabled: ");
        stringBuilder.append(this.combinedThreadPoolOldExecutorStatsEnabled);
        stringBuilder.append(" combinedThreadPoolSetThreadPriority: ");
        stringBuilder.append(this.combinedThreadPoolSetThreadPriority);
        stringBuilder.append(" useDependencyInit: ");
        stringBuilder.append(this.useDependencyInit);
        stringBuilder.append(" usePriorityScheduler: ");
        stringBuilder.append(this.usePriorityScheduler);
        stringBuilder.append(" waitForRequiredInitsOnly: ");
        stringBuilder.append(this.waitForRequiredInitsOnly);
        stringBuilder.append(" fpsOnlyEnableIfExpectedFps: ");
        stringBuilder.append(this.fpsOnlyEnableIfExpectedFps);
        stringBuilder.append(" fpsExpectedFps: ");
        stringBuilder.append(this.fpsExpectedFps);
        stringBuilder.append(" fpsCheckFpsIntervalSec: ");
        stringBuilder.append(this.fpsCheckFpsIntervalSec);
        stringBuilder.append(" fpsEnableDynamically: ");
        stringBuilder.append(this.fpsEnableDynamically);
        stringBuilder.append(" fpsReduce: ");
        stringBuilder.append(this.fpsReduceFpsDropFramesPercentThreshold);
        stringBuilder.append(" fpsRestore: ");
        stringBuilder.append(this.fpsRestoreFpsDropFramesPercentThreshold);
        stringBuilder.append(" oatWillNeed: ");
        stringBuilder.append(this.oatWillNeed);
        stringBuilder.append(" fpsUseSetVsyncRate: ");
        stringBuilder.append(this.fpsUseSetVsyncRate);
        stringBuilder.append(" fpsErrorCheckVsyncIntervalMs: ");
        stringBuilder.append(this.fpsErrorCheckVsyncIntervalMs);
        stringBuilder.append(" suppressGraphQLOnStartup: ");
        stringBuilder.append(this.suppressGraphQLOnStartup);
        stringBuilder.append(" combinedThreadPoolDefaultConstrained");
        stringBuilder.append(this.combinedThreadPoolDefaultConstrained);
        stringBuilder.append(" combinedThreadPoolFbThreadPoolExecutor");
        stringBuilder.append(this.combinedThreadPoolFbThreadPoolExecutor);
        stringBuilder.append(" mprotectExecOat ");
        stringBuilder.append(this.mprotectExecOat);
        stringBuilder.append(" combinedThreadPoolSingleThreadedExecutor ");
        stringBuilder.append(this.combinedThreadPoolSingleThreadedExecutor);
        stringBuilder.append(" combinedThreadPoolPrioritized ");
        stringBuilder.append(this.combinedThreadPoolPrioritized);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private static void writeBoolean(ByteBuffer byteBuffer, boolean z) {
        byteBuffer.putInt(z);
    }

    public void writeExperimentToDisk(Context context) {
        Closeable fileOutputStream;
        WritableByteChannel newChannel;
        Throwable e;
        Throwable th;
        Closeable closeable = null;
        try {
            ByteBuffer allocate;
            fileOutputStream = new FileOutputStream(context.getFileStreamPath(STARTUP_QE_CONFIG_FILENAME), false);
            try {
                allocate = ByteBuffer.allocate(512);
                allocate.putInt(this.lockDexNum);
                writeBoolean(allocate, this.lockArt);
                writeBoolean(allocate, this.enableLockDexExp);
                writeBoolean(allocate, this.enableColdStartAwareGc);
                writeBoolean(allocate, this.disableConcurrentGc);
                allocate.putInt(this.concurrentGcThreshold);
                writeBoolean(allocate, this.disableNativeGC);
                writeBoolean(allocate, this.growHeapAggresively);
                writeBoolean(allocate, this.disableMinConcurrent);
                writeBoolean(allocate, this.idleIncreaseThroughputEnabled);
                allocate.putInt(this.maxIdleTaskRequest);
                allocate.putInt(this.delayBetweenIdleCalls);
                writeBoolean(allocate, this.prioritizeTheMainThreadFirst);
                allocate.putInt(0);
                writeBoolean(allocate, false);
                allocate.putInt(0);
                allocate.putInt(0);
                allocate.putInt(0);
                allocate.putInt(0);
                allocate.putInt(0);
                allocate.putInt(0);
                allocate.putInt(0);
                writeBoolean(allocate, this.idleStartupItemsDelayEnabled);
                allocate.putInt(this.idleMaxIntervalMs);
                writeBoolean(allocate, this.idleNonCriticalINeedInits);
                allocate.putInt(this.idleNonCriticalINeedInitsDelayMs);
                writeBoolean(allocate, this.idleLowPriINeedInits);
                writeBoolean(allocate, this.mobileConfigProtExec);
                writeBoolean(allocate, this.mobileConfigMAdvRandom);
                writeBoolean(allocate, this.mobileConfigMAdvWillNeed);
                allocate.putInt(this.xmlCacheSize);
                allocate.putInt(0);
                allocate.putInt(this.threadPoolHPINeedInitSize);
                writeBoolean(allocate, this.mobileConfigMLock);
                allocate.putInt(this.threadPoolUrgentSize);
                writeBoolean(allocate, false);
                allocate.putInt(this.lruResourceCacheSize);
                writeBoolean(allocate, this.drawablesInXmlLruCache);
                allocate.putInt(this.drawableLruResourceCacheSize);
                allocate.putInt(0);
                writeBoolean(allocate, this.frameRateLimitedEnabled);
                allocate.putInt(this.frameRateLimitedReduceBy);
                writeBoolean(allocate, this.graphicsCacheOverrideEnabled);
                allocate.putInt(this.textureCacheMbIncreaseChange);
                allocate.putDouble(this.textureCacheRatioChange);
                allocate.putDouble(this.textureCacheFlushRateChange);
                allocate.putDouble(this.textureCacheFlushRateRatioChange);
                writeBoolean(allocate, this.parseGenericSystemPropertiesConfig);
                writeBoolean(allocate, this.madviseArt);
                writeBoolean(allocate, this.enableOverscrollModification);
                allocate.putDouble(this.overscrollModificationFactor);
                writeBoolean(allocate, this.madviseApk);
                allocate.putInt(this.defaultTextureCacheValue);
                allocate.putDouble(this.defaultTextureFlushRateValue);
                writeBoolean(allocate, this.threadPoolUsePoolDefaultsForScheduled);
                writeBoolean(allocate, this.lithoPoolSizeEnabled);
                allocate.putInt(this.lithoLayoutStateSize);
                allocate.putInt(this.lithoInternalNodeSize);
                allocate.putInt(this.lithoNodeInfoSize);
                allocate.putInt(this.lithoDiffNodeSize);
                allocate.putInt(this.lithoLayoutOutputSize);
                allocate.putInt(this.lithoYogaNodeSize);
                allocate.putInt(this.lithoDisplayListContainerSize);
                writeBoolean(allocate, this.frameRateTryToFastHook);
                writeBoolean(allocate, this.fpsFixFeedSplines);
                allocate.putDouble(this.fpsModifiyFeedSpeed);
                writeBoolean(allocate, this.fpsEnableFeedOnly);
                writeBoolean(allocate, this.enableLightweightAppChoreographer);
                allocate.putInt(this.mdclSelector);
                writeBoolean(allocate, this.combinedThreadPoolEnabled);
                allocate.putInt(this.combinedThreadPoolThreadReserve);
                allocate.putInt(this.combinedThreadPoolMaxThreads);
                allocate.putInt(this.combinedThreadPoolThreadKeepAliveS);
                writeBoolean(allocate, this.combinedThreadPoolStatsEnabled);
                writeBoolean(allocate, this.combinedThreadPoolOldExecutorStatsEnabled);
                writeBoolean(allocate, this.combinedThreadPoolSetThreadPriority);
                writeBoolean(allocate, this.madviseSystemBoot);
                writeBoolean(allocate, this.madviseLibColdstart);
                writeBoolean(allocate, this.madviseSystemLib);
                writeBoolean(allocate, this.useDependencyInit);
                writeBoolean(allocate, this.usePriorityScheduler);
                writeBoolean(allocate, this.waitForRequiredInitsOnly);
                writeBoolean(allocate, this.fpsOnlyEnableIfExpectedFps);
                allocate.putInt(this.fpsExpectedFps);
                allocate.putInt(this.fpsCheckFpsIntervalSec);
                writeBoolean(allocate, this.fpsEnableDynamically);
                allocate.putInt(this.fpsReduceFpsDropFramesPercentThreshold);
                allocate.putInt(this.fpsRestoreFpsDropFramesPercentThreshold);
                allocate.putInt(this.lithoYogaUnsafeStorageBackendType);
                writeBoolean(allocate, this.oatWillNeed);
                writeBoolean(allocate, this.fpsUseSetVsyncRate);
                allocate.putInt(this.fpsErrorCheckVsyncIntervalMs);
                writeBoolean(allocate, this.suppressGraphQLOnStartup);
                writeBoolean(allocate, this.combinedThreadPoolDefaultConstrained);
                writeBoolean(allocate, this.combinedThreadPoolFbThreadPoolExecutor);
                writeBoolean(allocate, this.mprotectExecOat);
                writeBoolean(allocate, this.combinedThreadPoolSingleThreadedExecutor);
                writeBoolean(allocate, this.combinedThreadPoolPrioritized);
                writeBoolean(allocate, this.enableOatMadvise);
                allocate.putInt(this.oatMadviseMetadataOption);
                allocate.putInt(this.oatMadviseDataOption);
                allocate.flip();
                newChannel = Channels.newChannel(fileOutputStream);
            } catch (IOException e2) {
                e = e2;
                newChannel = null;
                closeable = fileOutputStream;
                try {
                    Mlog.m53e(e, "Cannot write to file %s", STARTUP_QE_CONFIG_FILENAME);
                    Fs.safeClose(closeable);
                    Fs.safeClose(r4);
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = closeable;
                    closeable = newChannel;
                    Fs.safeClose(fileOutputStream);
                    Fs.safeClose(closeable);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                Fs.safeClose(fileOutputStream);
                Fs.safeClose(closeable);
                throw th;
            }
            try {
                newChannel.write(allocate);
                Fs.safeClose(fileOutputStream);
            } catch (IOException e3) {
                e = e3;
                closeable = fileOutputStream;
                Mlog.m53e(e, "Cannot write to file %s", STARTUP_QE_CONFIG_FILENAME);
                Fs.safeClose(closeable);
                Fs.safeClose(r4);
            } catch (Throwable th4) {
                th = th4;
                closeable = newChannel;
                Fs.safeClose(fileOutputStream);
                Fs.safeClose(closeable);
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
            newChannel = null;
            Mlog.m53e(e, "Cannot write to file %s", STARTUP_QE_CONFIG_FILENAME);
            Fs.safeClose(closeable);
            Fs.safeClose(r4);
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
            Fs.safeClose(fileOutputStream);
            Fs.safeClose(closeable);
            throw th;
        }
        Fs.safeClose(r4);
    }
}
