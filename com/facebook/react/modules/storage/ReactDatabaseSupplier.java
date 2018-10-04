package com.facebook.react.modules.storage;

import X.AnonymousClass0WK;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.facebook.video.cache.instrumentation.VideoCacheDatabase;

public final class ReactDatabaseSupplier extends SQLiteOpenHelper {
    private static ReactDatabaseSupplier sReactDatabaseSupplierInstance;
    private Context mContext;
    private SQLiteDatabase mDb;
    private long mMaximumDatabaseSize = VideoCacheDatabase.MAX_DB_SIZE;

    private ReactDatabaseSupplier(Context context) {
        super(context, "RKStorage", null, 1);
        this.mContext = context;
    }

    public final synchronized void clear() {
        get().delete("catalystLocalStorage", null, null);
    }

    public final synchronized void clearAndCloseDatabase() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        monitor-enter(r2);
        r2.clear();	 Catch:{ Exception -> 0x000c }
        r2.closeDatabase();	 Catch:{ Exception -> 0x000c }
    L_0x0007:
        monitor-exit(r2);
        return;
    L_0x0009:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
    L_0x000c:
        r0 = r2.deleteDatabase();	 Catch:{ all -> 0x0009 }
        if (r0 == 0) goto L_0x0013;	 Catch:{ all -> 0x0009 }
    L_0x0012:
        goto L_0x0007;	 Catch:{ all -> 0x0009 }
    L_0x0013:
        r1 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0009 }
        r0 = "Clearing and deleting database RKStorage failed";	 Catch:{ all -> 0x0009 }
        r1.<init>(r0);	 Catch:{ all -> 0x0009 }
        throw r1;	 Catch:{ all -> 0x0009 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.storage.ReactDatabaseSupplier.clearAndCloseDatabase():void");
    }

    private synchronized void closeDatabase() {
        if (this.mDb != null && this.mDb.isOpen()) {
            this.mDb.close();
            this.mDb = null;
        }
    }

    private synchronized boolean deleteDatabase() {
        closeDatabase();
        return this.mContext.deleteDatabase("RKStorage");
    }

    public final synchronized boolean ensureDatabase() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.mDb;	 Catch:{ all -> 0x003f }
        r4 = 1;	 Catch:{ all -> 0x003f }
        if (r0 == 0) goto L_0x0010;	 Catch:{ all -> 0x003f }
    L_0x0006:
        r0 = r5.mDb;	 Catch:{ all -> 0x003f }
        r0 = r0.isOpen();	 Catch:{ all -> 0x003f }
        if (r0 == 0) goto L_0x0010;	 Catch:{ all -> 0x003f }
    L_0x000e:
        monitor-exit(r5);
        return r4;
    L_0x0010:
        r3 = 0;
        r2 = 0;
    L_0x0012:
        r0 = 2;
        if (r2 >= r0) goto L_0x0032;
    L_0x0015:
        if (r2 <= 0) goto L_0x001a;
    L_0x0017:
        r5.deleteDatabase();	 Catch:{ SQLiteException -> 0x0021 }
    L_0x001a:
        r0 = r5.getWritableDatabase();	 Catch:{ SQLiteException -> 0x0021 }
        r5.mDb = r0;	 Catch:{ SQLiteException -> 0x0021 }
        goto L_0x0032;	 Catch:{ SQLiteException -> 0x0021 }
    L_0x0021:
        r3 = move-exception;
        r0 = 30;
        java.lang.Thread.sleep(r0);	 Catch:{ InterruptedException -> 0x0028 }
        goto L_0x002f;	 Catch:{ InterruptedException -> 0x0028 }
    L_0x0028:
        r0 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x003f }
        r0.interrupt();	 Catch:{ all -> 0x003f }
    L_0x002f:
        r2 = r2 + 1;	 Catch:{ all -> 0x003f }
        goto L_0x0012;	 Catch:{ all -> 0x003f }
    L_0x0032:
        r0 = r5.mDb;	 Catch:{ all -> 0x003f }
        if (r0 == 0) goto L_0x003e;	 Catch:{ all -> 0x003f }
    L_0x0036:
        r2 = r5.mDb;	 Catch:{ all -> 0x003f }
        r0 = r5.mMaximumDatabaseSize;	 Catch:{ all -> 0x003f }
        r2.setMaximumSize(r0);	 Catch:{ all -> 0x003f }
        goto L_0x000e;	 Catch:{ all -> 0x003f }
    L_0x003e:
        throw r3;	 Catch:{ all -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        monitor-exit(r5);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.storage.ReactDatabaseSupplier.ensureDatabase():boolean");
    }

    public final synchronized SQLiteDatabase get() {
        ensureDatabase();
        return this.mDb;
    }

    public static ReactDatabaseSupplier getInstance(Context context) {
        if (sReactDatabaseSupplierInstance == null) {
            sReactDatabaseSupplierInstance = new ReactDatabaseSupplier(context.getApplicationContext());
        }
        return sReactDatabaseSupplierInstance;
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        AnonymousClass0WK.D(-1610147586);
        sQLiteDatabase.execSQL("CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)");
        AnonymousClass0WK.D(2092128257);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i != i2) {
            deleteDatabase();
            onCreate(sQLiteDatabase);
        }
    }
}
