package com.facebook.react.uimanager.events;

import X.AnonymousClass09H;
import X.AnonymousClass0CM;
import X.AnonymousClass0LR;
import android.util.LongSparseArray;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.modules.core.ChoreographerCompat.FrameCallback;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.modules.core.ReactChoreographer.CallbackType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class EventDispatcher implements LifecycleEventListener {
    public static final Comparator EVENT_COMPARATOR = new C01141();
    public final ScheduleDispatchFrameCallback mCurrentFrameCallback = new ScheduleDispatchFrameCallback();
    public final DispatchEventsRunnable mDispatchEventsRunnable = new DispatchEventsRunnable();
    public final LongSparseArray mEventCookieToLastEventIdx = new LongSparseArray();
    private final Map mEventNameToEventId = MapBuilder.newHashMap();
    private final ArrayList mEventStaging = new ArrayList();
    private final Object mEventsStagingLock = new Object();
    public Event[] mEventsToDispatch = new Event[16];
    public final Object mEventsToDispatchLock = new Object();
    public int mEventsToDispatchSize = 0;
    public volatile boolean mHasDispatchScheduled = false;
    public final AtomicInteger mHasDispatchScheduledCount = new AtomicInteger();
    private final ArrayList mListeners = new ArrayList();
    private short mNextEventTypeId = (short) 0;
    public final ReactApplicationContext mReactContext;
    public volatile ReactEventEmitter mReactEventEmitter;

    /* renamed from: com.facebook.react.uimanager.events.EventDispatcher$1 */
    public final class C01141 implements Comparator {
        public static final int compare(Event event, Event event2) {
            if (!(event == null && event2 == null)) {
                if (event != null) {
                    if (event2 != null) {
                        long timestampMs = event.getTimestampMs() - event2.getTimestampMs();
                        if (timestampMs != 0) {
                            if (timestampMs < 0) {
                            }
                        }
                    }
                    return 1;
                }
                return -1;
            }
            return 0;
        }
    }

    /* renamed from: com.facebook.react.uimanager.events.EventDispatcher$2 */
    public final class C01152 implements Runnable {
        public final void run() {
            EventDispatcher.stopFrameCallback(EventDispatcher.this);
        }
    }

    public final class DispatchEventsRunnable implements Runnable {
        public final void run() {
            AnonymousClass09H.B(8192, "DispatchEventsRunnable", -949180603);
            try {
                AnonymousClass0CM.I(8192, "ScheduleDispatchFrameCallback", EventDispatcher.this.mHasDispatchScheduledCount.getAndIncrement());
                int i = 0;
                EventDispatcher.this.mHasDispatchScheduled = false;
                AnonymousClass0LR.D(EventDispatcher.this.mReactEventEmitter);
                synchronized (EventDispatcher.this.mEventsToDispatchLock) {
                    if (EventDispatcher.this.mEventsToDispatchSize > 1) {
                        Arrays.sort(EventDispatcher.this.mEventsToDispatch, 0, EventDispatcher.this.mEventsToDispatchSize, EventDispatcher.EVENT_COMPARATOR);
                    }
                    while (i < EventDispatcher.this.mEventsToDispatchSize) {
                        Event event = EventDispatcher.this.mEventsToDispatch[i];
                        if (event != null) {
                            AnonymousClass0CM.I(8192, event.getEventName(), event.getUniqueID());
                            event.dispatch(EventDispatcher.this.mReactEventEmitter);
                            event.dispose();
                        }
                        i++;
                    }
                    EventDispatcher.clearEventsToDispatch(EventDispatcher.this);
                    EventDispatcher.this.mEventCookieToLastEventIdx.clear();
                }
                AnonymousClass09H.C(8192, -1759731080);
            } catch (Throwable th) {
                AnonymousClass09H.C(8192, 2017469873);
            }
        }
    }

    public final class ScheduleDispatchFrameCallback extends FrameCallback {
        private volatile boolean mIsPosted = false;
        private boolean mShouldStop = false;

        /* renamed from: com.facebook.react.uimanager.events.EventDispatcher$ScheduleDispatchFrameCallback$1 */
        public final class C01161 implements Runnable {
            public final void run() {
                ScheduleDispatchFrameCallback.this.maybePost();
            }
        }

        public final void doFrame(long j) {
            UiThreadUtil.assertOnUiThread();
            if (this.mShouldStop) {
                this.mIsPosted = false;
            } else {
                post();
            }
            AnonymousClass09H.B(8192, "ScheduleDispatchFrameCallback", -39254917);
            try {
                EventDispatcher.moveStagedEventsToDispatchQueue(EventDispatcher.this);
                if (EventDispatcher.this.mEventsToDispatchSize > 0 && !EventDispatcher.this.mHasDispatchScheduled) {
                    EventDispatcher.this.mHasDispatchScheduled = true;
                    AnonymousClass0CM.P(8192, "ScheduleDispatchFrameCallback", EventDispatcher.this.mHasDispatchScheduledCount.get());
                    EventDispatcher.this.mReactContext.runOnJSQueueThread(EventDispatcher.this.mDispatchEventsRunnable);
                }
                AnonymousClass09H.C(8192, -1693322532);
            } catch (Throwable th) {
                AnonymousClass09H.C(8192, -2094430364);
            }
        }

        public final void maybePost() {
            if (!this.mIsPosted) {
                this.mIsPosted = true;
                post();
            }
        }

        public final void maybePostFromNonUI() {
            if (!this.mIsPosted) {
                if (EventDispatcher.this.mReactContext.isOnUiQueueThread()) {
                    maybePost();
                } else {
                    EventDispatcher.this.mReactContext.runOnUiQueueThread(new C01161());
                }
            }
        }

        private void post() {
            ReactChoreographer.getInstance().postFrameCallback(CallbackType.TIMERS_EVENTS, EventDispatcher.this.mCurrentFrameCallback);
        }

        public final void stop() {
            this.mShouldStop = true;
        }
    }

    private static long getEventCookie(int i, short s, short s2) {
        return (((((long) s) & 65535) << 32) | ((long) i)) | ((((long) s2) & 65535) << 48);
    }

    public EventDispatcher(ReactApplicationContext reactApplicationContext) {
        this.mReactContext = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
        this.mReactEventEmitter = new ReactEventEmitter(this.mReactContext);
    }

    private void addEventToEventsToDispatch(Event event) {
        int i = this.mEventsToDispatchSize;
        Event[] eventArr = this.mEventsToDispatch;
        if (i == eventArr.length) {
            this.mEventsToDispatch = (Event[]) Arrays.copyOf(eventArr, eventArr.length * 2);
        }
        Event[] eventArr2 = this.mEventsToDispatch;
        int i2 = this.mEventsToDispatchSize;
        this.mEventsToDispatchSize = i2 + 1;
        eventArr2[i2] = event;
    }

    public final void addListener(EventDispatcherListener eventDispatcherListener) {
        this.mListeners.add(eventDispatcherListener);
    }

    public static void clearEventsToDispatch(EventDispatcher eventDispatcher) {
        Arrays.fill(eventDispatcher.mEventsToDispatch, 0, eventDispatcher.mEventsToDispatchSize, null);
        eventDispatcher.mEventsToDispatchSize = 0;
    }

    public final void dispatchEvent(Event event) {
        AnonymousClass0LR.C(event.isInitialized(), "Dispatched event hasn't been initialized");
        int size = this.mListeners.size();
        for (int i = 0; i < size; i++) {
            ((EventDispatcherListener) this.mListeners.get(i)).onEventDispatch(event);
        }
        synchronized (this.mEventsStagingLock) {
            this.mEventStaging.add(event);
            AnonymousClass0CM.P(8192, event.getEventName(), event.getUniqueID());
        }
        if (this.mReactEventEmitter != null) {
            this.mCurrentFrameCallback.maybePostFromNonUI();
        }
    }

    private long getEventCookie(int i, String str, short s) {
        short shortValue;
        Short sh = (Short) this.mEventNameToEventId.get(str);
        if (sh != null) {
            shortValue = sh.shortValue();
        } else {
            shortValue = this.mNextEventTypeId;
            this.mNextEventTypeId = (short) (shortValue + 1);
            this.mEventNameToEventId.put(str, Short.valueOf(shortValue));
        }
        return getEventCookie(i, shortValue, s);
    }

    public static void moveStagedEventsToDispatchQueue(EventDispatcher eventDispatcher) {
        synchronized (eventDispatcher.mEventsStagingLock) {
            synchronized (eventDispatcher.mEventsToDispatchLock) {
                for (int i = 0; i < eventDispatcher.mEventStaging.size(); i++) {
                    Event event = (Event) eventDispatcher.mEventStaging.get(i);
                    if (event.canCoalesce()) {
                        long eventCookie = eventDispatcher.getEventCookie(event.getViewTag(), event.getEventName(), event.getCoalescingKey());
                        Integer num = (Integer) eventDispatcher.mEventCookieToLastEventIdx.get(eventCookie);
                        Event event2 = null;
                        if (num == null) {
                            eventDispatcher.mEventCookieToLastEventIdx.put(eventCookie, Integer.valueOf(eventDispatcher.mEventsToDispatchSize));
                        } else {
                            Event event3 = eventDispatcher.mEventsToDispatch[num.intValue()];
                            Event coalesce = event.coalesce(event3);
                            if (coalesce != event3) {
                                eventDispatcher.mEventCookieToLastEventIdx.put(eventCookie, Integer.valueOf(eventDispatcher.mEventsToDispatchSize));
                                eventDispatcher.mEventsToDispatch[num.intValue()] = null;
                                event2 = event3;
                                event = coalesce;
                            } else {
                                event2 = event;
                                event = null;
                            }
                        }
                        if (event != null) {
                            eventDispatcher.addEventToEventsToDispatch(event);
                        }
                        if (event2 != null) {
                            event2.dispose();
                        }
                    } else {
                        eventDispatcher.addEventToEventsToDispatch(event);
                    }
                }
            }
            eventDispatcher.mEventStaging.clear();
        }
    }

    public final void onCatalystInstanceDestroyed() {
        UiThreadUtil.runOnUiThread(new C01152());
    }

    public final void onHostDestroy() {
        stopFrameCallback(this);
    }

    public final void onHostPause() {
        stopFrameCallback(this);
    }

    public final void onHostResume() {
        this.mCurrentFrameCallback.maybePostFromNonUI();
    }

    public final void registerEventEmitter(int i, RCTEventEmitter rCTEventEmitter) {
        this.mReactEventEmitter.register(i, rCTEventEmitter);
    }

    public static void stopFrameCallback(EventDispatcher eventDispatcher) {
        UiThreadUtil.assertOnUiThread();
        eventDispatcher.mCurrentFrameCallback.stop();
    }
}
