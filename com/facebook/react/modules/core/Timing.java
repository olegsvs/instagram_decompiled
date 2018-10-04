package com.facebook.react.modules.core;

import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.SystemClock;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.jstasks.HeadlessJsTaskContext;
import com.facebook.react.jstasks.HeadlessJsTaskEventListener;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.ChoreographerCompat.FrameCallback;
import com.facebook.react.modules.core.ReactChoreographer.CallbackType;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;

@ReactModule(name = "Timing")
public final class Timing extends ReactContextBaseJavaModule implements LifecycleEventListener, HeadlessJsTaskEventListener {
    private static final float FRAME_DURATION_MS = 16.666666f;
    private static final float IDLE_CALLBACK_FRAME_DEADLINE_MS = 1.0f;
    public static final String NAME = "Timing";
    public final AtomicBoolean isPaused = new AtomicBoolean(true);
    public final AtomicBoolean isRunningTasks = new AtomicBoolean(false);
    public IdleCallbackRunnable mCurrentIdleCallbackRunnable;
    private final DevSupportManager mDevSupportManager;
    private boolean mFrameCallbackPosted = false;
    private boolean mFrameIdleCallbackPosted = false;
    public final Object mIdleCallbackGuard = new Object();
    private final IdleFrameCallback mIdleFrameCallback = new IdleFrameCallback();
    public final ReactChoreographer mReactChoreographer;
    public boolean mSendIdleEvents = false;
    private final TimerFrameCallback mTimerFrameCallback = new TimerFrameCallback();
    public final Object mTimerGuard = new Object();
    public final SparseArray mTimerIdsToTimers;
    public final PriorityQueue mTimers;

    /* renamed from: com.facebook.react.modules.core.Timing$1 */
    public final class C00991 implements Comparator {
        public static final int compare(Timer timer, Timer timer2) {
            long j = timer.mTargetTime - timer2.mTargetTime;
            if (j == 0) {
                return 0;
            }
            return j < 0 ? -1 : 1;
        }
    }

    public final class IdleCallbackRunnable implements Runnable {
        private volatile boolean mCancelled = false;
        private final long mFrameStartTime;

        public IdleCallbackRunnable(long j) {
            this.mFrameStartTime = j;
        }

        public final void cancel() {
            this.mCancelled = true;
        }

        public final void run() {
            if (!this.mCancelled) {
                long uptimeMillis = SystemClock.uptimeMillis() - (this.mFrameStartTime / 1000000);
                long currentTimeMillis = SystemClock.currentTimeMillis() - uptimeMillis;
                if (Timing.FRAME_DURATION_MS - ((float) uptimeMillis) >= Timing.IDLE_CALLBACK_FRAME_DEADLINE_MS) {
                    boolean z;
                    synchronized (Timing.this.mIdleCallbackGuard) {
                        z = Timing.this.mSendIdleEvents;
                    }
                    if (z) {
                        ((JSTimers) Timing.this.getReactApplicationContext().getJSModule(JSTimers.class)).callIdleCallbacks((double) currentTimeMillis);
                    }
                    Timing.this.mCurrentIdleCallbackRunnable = null;
                }
            }
        }
    }

    public final class Timer {
        public final int mCallbackID;
        public final int mInterval;
        public final boolean mRepeat;
        public long mTargetTime;

        public Timer(int i, long j, int i2, boolean z) {
            this.mCallbackID = i;
            this.mTargetTime = j;
            this.mInterval = i2;
            this.mRepeat = z;
        }
    }

    public final class IdleFrameCallback extends FrameCallback {
        public final void doFrame(long j) {
            if (!Timing.this.isPaused.get() || Timing.this.isRunningTasks.get()) {
                if (Timing.this.mCurrentIdleCallbackRunnable != null) {
                    Timing.this.mCurrentIdleCallbackRunnable.cancel();
                }
                Timing timing = Timing.this;
                timing.mCurrentIdleCallbackRunnable = new IdleCallbackRunnable(j);
                Timing.this.getReactApplicationContext().runOnJSQueueThread(Timing.this.mCurrentIdleCallbackRunnable);
                Timing.this.mReactChoreographer.postFrameCallback(CallbackType.IDLE_EVENT, this);
            }
        }
    }

    public final class TimerFrameCallback extends FrameCallback {
        private WritableArray mTimersToCall = null;

        public final void doFrame(long j) {
            if (!Timing.this.isPaused.get() || Timing.this.isRunningTasks.get()) {
                j /= 1000000;
                synchronized (Timing.this.mTimerGuard) {
                    while (!Timing.this.mTimers.isEmpty() && ((Timer) Timing.this.mTimers.peek()).mTargetTime < j) {
                        Timer timer = (Timer) Timing.this.mTimers.poll();
                        if (this.mTimersToCall == null) {
                            this.mTimersToCall = Arguments.createArray();
                        }
                        this.mTimersToCall.pushInt(timer.mCallbackID);
                        if (timer.mRepeat) {
                            timer.mTargetTime = ((long) timer.mInterval) + j;
                            Timing.this.mTimers.add(timer);
                        } else {
                            Timing.this.mTimerIdsToTimers.remove(timer.mCallbackID);
                        }
                    }
                }
                if (this.mTimersToCall != null) {
                    ((JSTimers) Timing.this.getReactApplicationContext().getJSModule(JSTimers.class)).callTimers(this.mTimersToCall);
                    this.mTimersToCall = null;
                }
                Timing.this.mReactChoreographer.postFrameCallback(CallbackType.TIMERS_EVENTS, this);
            }
        }
    }

    public String getName() {
        return NAME;
    }

    public Timing(ReactApplicationContext reactApplicationContext, DevSupportManager devSupportManager) {
        super(reactApplicationContext);
        this.mDevSupportManager = devSupportManager;
        this.mTimers = new PriorityQueue(11, new C00991());
        this.mTimerIdsToTimers = new SparseArray();
        this.mReactChoreographer = ReactChoreographer.getInstance();
    }

    public static void clearChoreographerIdleCallback(Timing timing) {
        if (timing.mFrameIdleCallbackPosted) {
            timing.mReactChoreographer.removeFrameCallback(CallbackType.IDLE_EVENT, timing.mIdleFrameCallback);
            timing.mFrameIdleCallbackPosted = false;
        }
    }

    private void clearFrameCallback() {
        HeadlessJsTaskContext instance = HeadlessJsTaskContext.getInstance(getReactApplicationContext());
        if (this.mFrameCallbackPosted && this.isPaused.get() && !instance.hasActiveTasks()) {
            this.mReactChoreographer.removeFrameCallback(CallbackType.TIMERS_EVENTS, this.mTimerFrameCallback);
            this.mFrameCallbackPosted = false;
        }
    }

    @ReactMethod
    public void createTimer(int i, int i2, double d, boolean z) {
        long currentTimeMillis = SystemClock.currentTimeMillis();
        long j = (long) d;
        if (this.mDevSupportManager.getDevSupportEnabled() && Math.abs(j - currentTimeMillis) > 60000) {
            ((JSTimers) getReactApplicationContext().getJSModule(JSTimers.class)).emitTimeDriftWarning("Debugger and device times have drifted by more than 60s. Please correct this by running adb shell \"date `date +%m%d%H%M%Y.%S`\" on your debugger machine.");
        }
        int i3 = i2;
        long max = Math.max(0, (j - currentTimeMillis) + ((long) i2));
        int i4 = i;
        boolean z2 = z;
        if (i2 != 0 || z) {
            Timer timer = new Timer(i4, (SystemClock.nanoTime() / 1000000) + max, i3, z2);
            synchronized (this.mTimerGuard) {
                this.mTimers.add(timer);
                this.mTimerIdsToTimers.put(i, timer);
            }
            return;
        }
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i);
        ((JSTimers) getReactApplicationContext().getJSModule(JSTimers.class)).callTimers(createArray);
    }

    @ReactMethod
    public void deleteTimer(int i) {
        synchronized (this.mTimerGuard) {
            Timer timer = (Timer) this.mTimerIdsToTimers.get(i);
            if (timer != null) {
                this.mTimerIdsToTimers.remove(i);
                this.mTimers.remove(timer);
            }
        }
    }

    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
        HeadlessJsTaskContext.getInstance(getReactApplicationContext()).addTaskEventListener(this);
    }

    private void maybeIdleCallback() {
        if (this.isPaused.get() && !this.isRunningTasks.get()) {
            clearFrameCallback();
        }
    }

    private void maybeSetChoreographerIdleCallback() {
        synchronized (this.mIdleCallbackGuard) {
            if (this.mSendIdleEvents) {
                setChoreographerIdleCallback(this);
            }
        }
    }

    public void onCatalystInstanceDestroy() {
        clearFrameCallback();
        clearChoreographerIdleCallback(this);
        HeadlessJsTaskContext.getInstance(getReactApplicationContext()).removeTaskEventListener(this);
    }

    public void onHeadlessJsTaskFinish(int i) {
        if (!HeadlessJsTaskContext.getInstance(getReactApplicationContext()).hasActiveTasks()) {
            this.isRunningTasks.set(false);
            clearFrameCallback();
            maybeIdleCallback();
        }
    }

    public void onHeadlessJsTaskStart(int i) {
        if (!this.isRunningTasks.getAndSet(true)) {
            setChoreographerCallback();
            maybeSetChoreographerIdleCallback();
        }
    }

    public void onHostDestroy() {
        clearFrameCallback();
        maybeIdleCallback();
    }

    public void onHostPause() {
        this.isPaused.set(true);
        clearFrameCallback();
        maybeIdleCallback();
    }

    public void onHostResume() {
        this.isPaused.set(false);
        setChoreographerCallback();
        maybeSetChoreographerIdleCallback();
    }

    private void setChoreographerCallback() {
        if (!this.mFrameCallbackPosted) {
            this.mReactChoreographer.postFrameCallback(CallbackType.TIMERS_EVENTS, this.mTimerFrameCallback);
            this.mFrameCallbackPosted = true;
        }
    }

    public static void setChoreographerIdleCallback(Timing timing) {
        if (!timing.mFrameIdleCallbackPosted) {
            timing.mReactChoreographer.postFrameCallback(CallbackType.IDLE_EVENT, timing.mIdleFrameCallback);
            timing.mFrameIdleCallbackPosted = true;
        }
    }

    @ReactMethod
    public void setSendIdleEvents(final boolean z) {
        synchronized (this.mIdleCallbackGuard) {
            this.mSendIdleEvents = z;
        }
        UiThreadUtil.runOnUiThread(new Runnable() {
            public final void run() {
                synchronized (Timing.this.mIdleCallbackGuard) {
                    if (z) {
                        Timing.setChoreographerIdleCallback(Timing.this);
                    } else {
                        Timing.clearChoreographerIdleCallback(Timing.this);
                    }
                }
            }
        });
    }
}
