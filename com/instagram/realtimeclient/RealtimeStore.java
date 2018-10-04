package com.instagram.realtimeclient;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RealtimeStore {
    private final Map mOperationStore = new HashMap();
    private final Set mTombstoneStore = new HashSet();

    public synchronized void clear() {
        this.mOperationStore.clear();
        this.mTombstoneStore.clear();
    }

    public boolean patchStoreWithOperation(RealtimeOperation realtimeOperation) {
        switch (realtimeOperation.op.ordinal()) {
            case 0:
                return processAddOperation(realtimeOperation);
            case 1:
                return processRemoveOperation(realtimeOperation);
            case 2:
                return processReplaceOperation(realtimeOperation);
            case 3:
                return processNotifyOperation();
            default:
                return false;
        }
    }

    private boolean processAddOperation(RealtimeOperation realtimeOperation) {
        boolean z;
        String key = RealtimeStoreKey.getKey(realtimeOperation);
        synchronized (this) {
            if (this.mOperationStore.containsKey(key) || this.mTombstoneStore.contains(key)) {
                z = false;
            } else {
                this.mOperationStore.put(key, realtimeOperation);
                z = true;
            }
        }
        return z;
    }

    private synchronized boolean processNotifyOperation() {
        return true;
    }

    private synchronized boolean processRemoveOperation(RealtimeOperation realtimeOperation) {
        String key = RealtimeStoreKey.getKey(realtimeOperation);
        this.mOperationStore.remove(key);
        this.mTombstoneStore.add(key);
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean processReplaceOperation(com.instagram.realtimeclient.RealtimeOperation r6) {
        /*
        r5 = this;
        monitor-enter(r5);
        r4 = com.instagram.realtimeclient.RealtimeStoreKey.getKey(r6);	 Catch:{ all -> 0x0032 }
        r0 = r5.mTombstoneStore;	 Catch:{ all -> 0x0032 }
        r0 = r0.contains(r4);	 Catch:{ all -> 0x0032 }
        r3 = 0;
        if (r0 == 0) goto L_0x0010;
    L_0x000e:
        monitor-exit(r5);
        return r3;
    L_0x0010:
        r0 = r5.mOperationStore;	 Catch:{ all -> 0x0032 }
        r0 = r0.get(r4);	 Catch:{ all -> 0x0032 }
        r0 = (com.instagram.realtimeclient.RealtimeOperation) r0;	 Catch:{ all -> 0x0032 }
        r2 = 1;
        if (r0 == 0) goto L_0x002c;
    L_0x001b:
        r1 = r0.timestamp;	 Catch:{ all -> 0x0032 }
        r0 = r6.timestamp;	 Catch:{ all -> 0x0032 }
        r0 = com.instagram.realtimeclient.RealtimeEvent.compareSequences(r1, r0);	 Catch:{ all -> 0x0032 }
        if (r0 > 0) goto L_0x000e;
    L_0x0025:
        r0 = r5.mOperationStore;	 Catch:{ all -> 0x0032 }
        r0.put(r4, r6);	 Catch:{ all -> 0x0032 }
    L_0x002a:
        monitor-exit(r5);
        return r2;
    L_0x002c:
        r0 = r5.mOperationStore;	 Catch:{ all -> 0x0032 }
        r0.put(r4, r6);	 Catch:{ all -> 0x0032 }
        goto L_0x002a;
    L_0x0032:
        r0 = move-exception;
        monitor-exit(r5);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.realtimeclient.RealtimeStore.processReplaceOperation(com.instagram.realtimeclient.RealtimeOperation):boolean");
    }
}
