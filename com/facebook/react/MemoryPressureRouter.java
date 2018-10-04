package com.facebook.react;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.facebook.react.bridge.MemoryPressureListener;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public final class MemoryPressureRouter implements ComponentCallbacks2 {
    private final Set mListeners = Collections.synchronizedSet(new LinkedHashSet());

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public MemoryPressureRouter(Context context) {
        context.getApplicationContext().registerComponentCallbacks(this);
    }

    public final void addMemoryPressureListener(MemoryPressureListener memoryPressureListener) {
        this.mListeners.add(memoryPressureListener);
    }

    public final void destroy(Context context) {
        context.getApplicationContext().unregisterComponentCallbacks(this);
    }

    private void dispatchMemoryPressure(int i) {
        Set set = this.mListeners;
        for (MemoryPressureListener handleMemoryPressure : (MemoryPressureListener[]) set.toArray(new MemoryPressureListener[set.size()])) {
            handleMemoryPressure.handleMemoryPressure(i);
        }
    }

    public final void onTrimMemory(int i) {
        dispatchMemoryPressure(i);
    }

    public final void removeMemoryPressureListener(MemoryPressureListener memoryPressureListener) {
        this.mListeners.remove(memoryPressureListener);
    }
}
