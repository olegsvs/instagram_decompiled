package com.facebook.react.uimanager.events;

import android.util.SparseIntArray;

public final class TouchEventCoalescingKeyHelper {
    private final SparseIntArray mDownTimeToCoalescingKey = new SparseIntArray();

    public final void addCoalescingKey(long j) {
        this.mDownTimeToCoalescingKey.put((int) j, 0);
    }

    public final short getCoalescingKey(long j) {
        int i = this.mDownTimeToCoalescingKey.get((int) j, -1);
        if (i != -1) {
            return (short) (i & 65535);
        }
        throw new RuntimeException("Tried to get non-existent cookie");
    }

    public final boolean hasCoalescingKey(long j) {
        return this.mDownTimeToCoalescingKey.get((int) j, -1) != -1;
    }

    public final void incrementCoalescingKey(long j) {
        int i = (int) j;
        int i2 = this.mDownTimeToCoalescingKey.get(i, -1);
        if (i2 != -1) {
            this.mDownTimeToCoalescingKey.put(i, i2 + 1);
            return;
        }
        throw new RuntimeException("Tried to increment non-existent cookie");
    }

    public final void removeCoalescingKey(long j) {
        this.mDownTimeToCoalescingKey.delete((int) j);
    }
}
