package com.facebook.react.jstasks;

import X.AnonymousClass0LR;
import X.AnonymousClass0OR;
import android.os.Handler;
import android.util.SparseArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

public final class HeadlessJsTaskContext {
    private static final WeakHashMap INSTANCES = new WeakHashMap();
    private final Set mActiveTasks = new CopyOnWriteArraySet();
    private final Handler mHandler = new Handler();
    public final Set mHeadlessJsTaskEventListeners = new CopyOnWriteArraySet();
    private final AtomicInteger mLastTaskId = new AtomicInteger(0);
    private final WeakReference mReactContext;
    private final SparseArray mTaskTimeouts = new SparseArray();

    private HeadlessJsTaskContext(ReactContext reactContext) {
        this.mReactContext = new WeakReference(reactContext);
    }

    public final void addTaskEventListener(HeadlessJsTaskEventListener headlessJsTaskEventListener) {
        this.mHeadlessJsTaskEventListeners.add(headlessJsTaskEventListener);
    }

    public final synchronized void finishTask(final int i) {
        boolean remove = this.mActiveTasks.remove(Integer.valueOf(i));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Tried to finish non-existent task with id ");
        stringBuilder.append(i);
        stringBuilder.append(".");
        AnonymousClass0LR.C(remove, stringBuilder.toString());
        Runnable runnable = (Runnable) this.mTaskTimeouts.get(i);
        if (runnable != null) {
            AnonymousClass0OR.G(this.mHandler, runnable, 1741642396);
            this.mTaskTimeouts.remove(i);
        }
        UiThreadUtil.runOnUiThread(new Runnable() {
            public final void run() {
                for (HeadlessJsTaskEventListener onHeadlessJsTaskFinish : HeadlessJsTaskContext.this.mHeadlessJsTaskEventListeners) {
                    onHeadlessJsTaskFinish.onHeadlessJsTaskFinish(i);
                }
            }
        });
    }

    public static HeadlessJsTaskContext getInstance(ReactContext reactContext) {
        WeakHashMap weakHashMap = INSTANCES;
        HeadlessJsTaskContext headlessJsTaskContext = (HeadlessJsTaskContext) weakHashMap.get(reactContext);
        if (headlessJsTaskContext != null) {
            return headlessJsTaskContext;
        }
        headlessJsTaskContext = new HeadlessJsTaskContext(reactContext);
        weakHashMap.put(reactContext, headlessJsTaskContext);
        return headlessJsTaskContext;
    }

    public final boolean hasActiveTasks() {
        return this.mActiveTasks.size() > 0;
    }

    public final synchronized boolean isTaskRunning(int i) {
        return this.mActiveTasks.contains(Integer.valueOf(i));
    }

    public final void removeTaskEventListener(HeadlessJsTaskEventListener headlessJsTaskEventListener) {
        this.mHeadlessJsTaskEventListeners.remove(headlessJsTaskEventListener);
    }
}
