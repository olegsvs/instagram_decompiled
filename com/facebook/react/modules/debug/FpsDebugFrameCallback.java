package com.facebook.react.modules.debug;

import X.AnonymousClass0LR;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.ChoreographerCompat;
import com.facebook.react.modules.core.ChoreographerCompat.FrameCallback;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.Map.Entry;
import java.util.TreeMap;

public final class FpsDebugFrameCallback extends FrameCallback {
    private int m4PlusFrameStutters = 0;
    private final ChoreographerCompat mChoreographer;
    private final DidJSUpdateUiDuringFrameDetector mDidJSUpdateUiDuringFrameDetector;
    private int mExpectedNumFramesPrev = 0;
    private long mFirstFrameTime = -1;
    private boolean mIsRecordingFpsInfoAtEachFrame = false;
    private long mLastFrameTime = -1;
    private int mNumFrameCallbacks = 0;
    private int mNumFrameCallbacksWithBatchDispatches = 0;
    private final ReactContext mReactContext;
    private boolean mShouldStop = false;
    private TreeMap mTimeToFps;
    private final UIManagerModule mUIManagerModule;

    public final class FpsInfo {
        public final double fps;
        public final double jsFps;
        public final int total4PlusFrameStutters;
        public final int totalExpectedFrames;
        public final int totalFrames;
        public final int totalJsFrames;
        public final int totalTimeMs;

        public FpsInfo(int i, int i2, int i3, int i4, double d, double d2, int i5) {
            this.totalFrames = i;
            this.totalJsFrames = i2;
            this.totalExpectedFrames = i3;
            this.total4PlusFrameStutters = i4;
            this.fps = d;
            this.jsFps = d2;
            this.totalTimeMs = i5;
        }
    }

    public FpsDebugFrameCallback(ChoreographerCompat choreographerCompat, ReactContext reactContext) {
        this.mChoreographer = choreographerCompat;
        this.mReactContext = reactContext;
        this.mUIManagerModule = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
        this.mDidJSUpdateUiDuringFrameDetector = new DidJSUpdateUiDuringFrameDetector();
    }

    public final void doFrame(long j) {
        if (!this.mShouldStop) {
            if (this.mFirstFrameTime == -1) {
                this.mFirstFrameTime = j;
            }
            long j2 = this.mLastFrameTime;
            this.mLastFrameTime = j;
            if (this.mDidJSUpdateUiDuringFrameDetector.getDidJSHitFrameAndCleanup(j2, j)) {
                this.mNumFrameCallbacksWithBatchDispatches++;
            }
            this.mNumFrameCallbacks++;
            int expectedNumFrames = getExpectedNumFrames();
            if ((expectedNumFrames - this.mExpectedNumFramesPrev) - 1 >= 4) {
                this.m4PlusFrameStutters++;
            }
            if (this.mIsRecordingFpsInfoAtEachFrame) {
                AnonymousClass0LR.D(this.mTimeToFps);
                this.mTimeToFps.put(Long.valueOf(System.currentTimeMillis()), new FpsInfo(getNumFrames(), getNumJSFrames(), expectedNumFrames, this.m4PlusFrameStutters, getFPS(), getJSFPS(), getTotalTimeMS()));
            }
            this.mExpectedNumFramesPrev = expectedNumFrames;
            this.mChoreographer.postFrameCallback(this);
        }
    }

    public final int getExpectedNumFrames() {
        double totalTimeMS = (double) getTotalTimeMS();
        Double.isNaN(totalTimeMS);
        return (int) ((totalTimeMS / 16.9d) + 1.0d);
    }

    public final double getFPS() {
        if (this.mLastFrameTime == this.mFirstFrameTime) {
            return StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
        }
        double numFrames = (double) getNumFrames();
        Double.isNaN(numFrames);
        numFrames *= 1.0E9d;
        double d = (double) (this.mLastFrameTime - this.mFirstFrameTime);
        Double.isNaN(d);
        return numFrames / d;
    }

    public final FpsInfo getFpsInfo(long j) {
        AnonymousClass0LR.E(this.mTimeToFps, "FPS was not recorded at each frame!");
        Entry floorEntry = this.mTimeToFps.floorEntry(Long.valueOf(j));
        if (floorEntry == null) {
            return null;
        }
        return (FpsInfo) floorEntry.getValue();
    }

    public final double getJSFPS() {
        if (this.mLastFrameTime == this.mFirstFrameTime) {
            return StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
        }
        double numJSFrames = (double) getNumJSFrames();
        Double.isNaN(numJSFrames);
        numJSFrames *= 1.0E9d;
        double d = (double) (this.mLastFrameTime - this.mFirstFrameTime);
        Double.isNaN(d);
        return numJSFrames / d;
    }

    public final int getNumFrames() {
        return this.mNumFrameCallbacks - 1;
    }

    public final int getNumJSFrames() {
        return this.mNumFrameCallbacksWithBatchDispatches - 1;
    }

    public final int getTotalTimeMS() {
        double d = (double) this.mLastFrameTime;
        double d2 = (double) this.mFirstFrameTime;
        Double.isNaN(d);
        Double.isNaN(d2);
        return ((int) (d - d2)) / 1000000;
    }

    public final void start() {
        this.mShouldStop = false;
        this.mReactContext.getCatalystInstance().addBridgeIdleDebugListener(this.mDidJSUpdateUiDuringFrameDetector);
        this.mUIManagerModule.setViewHierarchyUpdateDebugListener(this.mDidJSUpdateUiDuringFrameDetector);
        this.mChoreographer.postFrameCallback(this);
    }

    public final void startAndRecordFpsAtEachFrame() {
        this.mTimeToFps = new TreeMap();
        this.mIsRecordingFpsInfoAtEachFrame = true;
        start();
    }

    public final void stop() {
        this.mShouldStop = true;
        this.mReactContext.getCatalystInstance().removeBridgeIdleDebugListener(this.mDidJSUpdateUiDuringFrameDetector);
        this.mUIManagerModule.setViewHierarchyUpdateDebugListener(null);
    }
}
