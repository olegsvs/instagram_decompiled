package com.instagram.react.modules.base;

import X.AnonymousClass0xU;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.facebook.fbreact.specs.NativeReactPerformanceLoggerSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "ReactPerformanceLogger", needsEagerInit = true)
public class IgReactPerformanceLoggerModule extends NativeReactPerformanceLoggerSpec {
    public static final String MODULE_NAME = "ReactPerformanceLogger";
    private final AnonymousClass0xU mPerformanceLogger = AnonymousClass0xU.f12560b;

    public String getName() {
        return MODULE_NAME;
    }

    public IgReactPerformanceLoggerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public void logEvents(ReadableMap readableMap) {
        ReadableMap map = readableMap.getMap("timespans");
        if (map != null) {
            ReadableMap map2;
            boolean hasKey = map.hasKey("JSAppRequireTime");
            double d = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
            if (hasKey) {
                ReadableMap map3 = map.getMap("JSAppRequireTime");
                this.mPerformanceLogger.f12575P.set((long) (map3.hasKey("startTime") ? map3.getDouble("startTime") : StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED));
                this.mPerformanceLogger.f12567H.set((long) (map3.hasKey("totalTime") ? map3.getDouble("totalTime") : StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED));
            } else {
                this.mPerformanceLogger.f12567H.set(0);
                this.mPerformanceLogger.f12575P.set(0);
            }
            if (map.hasKey("JSTime")) {
                map2 = map.getMap("JSTime");
                this.mPerformanceLogger.f12568I.set((long) (map2.hasKey("totalTime") ? map2.getDouble("totalTime") : StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED));
            } else {
                this.mPerformanceLogger.f12568I.set(0);
            }
            if (map.hasKey("IdleTime")) {
                map2 = map.getMap("IdleTime");
                this.mPerformanceLogger.f12566G.set((long) (map2.hasKey("totalTime") ? map2.getDouble("totalTime") : StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED));
            } else {
                this.mPerformanceLogger.f12566G.set(0);
            }
            if (map.hasKey("fetchRelayQuery")) {
                map2 = map.getMap("fetchRelayQuery");
                AnonymousClass0xU anonymousClass0xU = this.mPerformanceLogger;
                if (map2.hasKey("totalTime")) {
                    d = map2.getDouble("totalTime");
                }
                anonymousClass0xU.f12565F.set((long) d);
            } else {
                this.mPerformanceLogger.f12565F.set(0);
            }
        }
        ReadableMap map4 = readableMap.getMap("extras");
        if (map4 != null) {
            if (map4.hasKey("JscBlockSize")) {
                this.mPerformanceLogger.f12569J.set((long) map4.getDouble("JscBlockSize"));
            }
            if (map4.hasKey("JscMallocSize")) {
                this.mPerformanceLogger.f12570K.set((long) map4.getDouble("JscMallocSize"));
            }
            if (map4.hasKey("JscObjectSize")) {
                this.mPerformanceLogger.f12571L.set((long) map4.getDouble("JscObjectSize"));
            }
            if (map4.hasKey("usedRelayModern")) {
                this.mPerformanceLogger.f12579T.set(map4.getBoolean("usedRelayModern"));
            }
            if (map4.hasKey("usedRelayPrefetcher")) {
                this.mPerformanceLogger.f12580U.set(map4.getBoolean("usedRelayPrefetcher"));
            }
        }
        this.mPerformanceLogger.B();
    }
}
