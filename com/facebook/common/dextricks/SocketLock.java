package com.facebook.common.dextricks;

import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import java.io.Closeable;

public final class SocketLock implements Closeable {
    private final LocalSocketAddress mAddr;
    private LocalSocket mSocket;

    public SocketLock(String str) {
        this.mAddr = new LocalSocketAddress(str);
    }

    public void close() {
        release();
    }

    public void release() {
        Fs.safeClose(this.mSocket);
        this.mSocket = null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean tryAcquire() {
        /*
        r4 = this;
        r3 = new android.net.LocalSocket;
        r3.<init>();
        r0 = r4.mAddr;	 Catch:{ IOException -> 0x0013 }
        r3.bind(r0);	 Catch:{ IOException -> 0x0013 }
        r4.mSocket = r3;	 Catch:{ all -> 0x000e }
        r0 = 1;
        return r0;
    L_0x000e:
        r0 = move-exception;
        com.facebook.common.dextricks.Fs.safeClose(r3);
        throw r0;
    L_0x0013:
        r2 = move-exception;
        r1 = r2.getMessage();	 Catch:{ all -> 0x000e }
        if (r1 == 0) goto L_0x002f;
    L_0x001a:
        r0 = ": EADDRINUSE (";
        r0 = r1.contains(r0);	 Catch:{ all -> 0x000e }
        if (r0 != 0) goto L_0x002a;
    L_0x0022:
        r0 = ": errno 98 (";
        r0 = r1.contains(r0);	 Catch:{ all -> 0x000e }
        if (r0 == 0) goto L_0x002f;
    L_0x002a:
        r0 = 0;
        com.facebook.common.dextricks.Fs.safeClose(r3);
        return r0;
    L_0x002f:
        r0 = new java.lang.RuntimeException;	 Catch:{ all -> 0x000e }
        r0.<init>(r2);	 Catch:{ all -> 0x000e }
        throw r0;	 Catch:{ all -> 0x000e }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.SocketLock.tryAcquire():boolean");
    }
}
