package com.facebook.react.modules.storage;

import X.AnonymousClass0Df;
import X.AnonymousClass0GG;
import X.AnonymousClass0WK;
import android.os.AsyncTask;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.common.ModuleDataCleaner$Cleanable;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

@ReactModule(name = "AsyncSQLiteDBStorage")
public final class AsyncStorageModule extends ReactContextBaseJavaModule implements ModuleDataCleaner$Cleanable {
    private static final int MAX_SQL_KEYS = 999;
    public static final String NAME = "AsyncSQLiteDBStorage";
    private final SerialExecutor executor;
    public ReactDatabaseSupplier mReactDatabaseSupplier;
    private boolean mShuttingDown;

    public final class SerialExecutor implements Executor {
        private final Executor executor;
        private Runnable mActive;
        private final ArrayDeque mTasks = new ArrayDeque();

        public SerialExecutor(Executor executor) {
            this.executor = executor;
        }

        public final synchronized void execute(final Runnable runnable) {
            this.mTasks.offer(new Runnable() {
                public final void run() {
                    try {
                        runnable.run();
                    } finally {
                        SerialExecutor.this.scheduleNext();
                    }
                }
            });
            if (this.mActive == null) {
                scheduleNext();
            }
        }

        public final synchronized void scheduleNext() {
            Runnable runnable = (Runnable) this.mTasks.poll();
            this.mActive = runnable;
            if (runnable != null) {
                AnonymousClass0GG.B(this.executor, this.mActive, 20619069);
            }
        }
    }

    public String getName() {
        return NAME;
    }

    public AsyncStorageModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, AsyncTask.THREAD_POOL_EXECUTOR);
    }

    public AsyncStorageModule(ReactApplicationContext reactApplicationContext, Executor executor) {
        super(reactApplicationContext);
        this.mShuttingDown = false;
        this.executor = new SerialExecutor(executor);
        this.mReactDatabaseSupplier = ReactDatabaseSupplier.getInstance(reactApplicationContext);
    }

    @ReactMethod
    public void clear(final Callback callback) {
        new GuardedAsyncTask(getReactApplicationContext()) {
            public final void doInBackgroundGuarded(Void... voidArr) {
                if (AsyncStorageModule.this.mReactDatabaseSupplier.ensureDatabase()) {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.clear();
                        callback.invoke(new Object[0]);
                    } catch (Throwable e) {
                        AnonymousClass0Df.I("ReactNative", e.getMessage(), e);
                        callback.invoke(new Object[]{AsyncStorageErrorUtil.getError(null, e.getMessage())});
                    }
                    return;
                }
                callback.invoke(new Object[]{AsyncStorageErrorUtil.getDBError(null)});
            }
        }.executeOnExecutor(this.executor, new Void[0]);
    }

    public void clearSensitiveData() {
        this.mReactDatabaseSupplier.clearAndCloseDatabase();
    }

    public static boolean ensureDatabase(AsyncStorageModule asyncStorageModule) {
        return !asyncStorageModule.mShuttingDown && asyncStorageModule.mReactDatabaseSupplier.ensureDatabase();
    }

    @ReactMethod
    public void getAllKeys(final Callback callback) {
        new GuardedAsyncTask(getReactApplicationContext()) {
            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void doInBackgroundGuarded(java.lang.Void... r16) {
                /*
                r15 = this;
                r0 = com.facebook.react.modules.storage.AsyncStorageModule.this;
                r0 = com.facebook.react.modules.storage.AsyncStorageModule.ensureDatabase(r0);
                r6 = 2;
                r5 = 1;
                r4 = 0;
                r3 = 0;
                if (r0 != 0) goto L_0x001c;
            L_0x000c:
                r2 = r4;
                r1 = new java.lang.Object[r6];
                r0 = com.facebook.react.modules.storage.AsyncStorageErrorUtil.getDBError(r4);
                r1[r3] = r0;
                r1[r5] = r4;
                r2.invoke(r1);
                return;
            L_0x001c:
                r2 = com.facebook.react.bridge.Arguments.createArray();
                r9 = new java.lang.String[r5];
                r0 = "key";
                r9[r3] = r0;
                r0 = com.facebook.react.modules.storage.AsyncStorageModule.this;
                r0 = r0.mReactDatabaseSupplier;
                r7 = r0.get();
                r8 = "catalystLocalStorage";
                r10 = 0;
                r11 = 0;
                r12 = 0;
                r13 = 0;
                r14 = 0;
                r8 = r7.query(r8, r9, r10, r11, r12, r13, r14);
                r0 = r8.moveToFirst();	 Catch:{ Exception -> 0x0060 }
                if (r0 == 0) goto L_0x004c;
            L_0x003f:
                r0 = r8.getString(r3);	 Catch:{ Exception -> 0x0060 }
                r2.pushString(r0);	 Catch:{ Exception -> 0x0060 }
                r0 = r8.moveToNext();	 Catch:{ Exception -> 0x0060 }
                if (r0 != 0) goto L_0x003f;
            L_0x004c:
                r8.close();
                r1 = r4;
                r0 = new java.lang.Object[r6];
                r0[r3] = r4;
                r0[r5] = r2;
                r1.invoke(r0);
                return;
            L_0x005b:
                r0 = move-exception;
                r8.close();
                throw r0;
            L_0x0060:
                r7 = move-exception;
                r1 = "ReactNative";
                r0 = r7.getMessage();	 Catch:{ all -> 0x005b }
                X.AnonymousClass0Df.I(r1, r0, r7);	 Catch:{ all -> 0x005b }
                r2 = r4;	 Catch:{ all -> 0x005b }
                r1 = new java.lang.Object[r6];	 Catch:{ all -> 0x005b }
                r0 = r7.getMessage();	 Catch:{ all -> 0x005b }
                r0 = com.facebook.react.modules.storage.AsyncStorageErrorUtil.getError(r4, r0);	 Catch:{ all -> 0x005b }
                r1[r3] = r0;	 Catch:{ all -> 0x005b }
                r1[r5] = r4;	 Catch:{ all -> 0x005b }
                r2.invoke(r1);	 Catch:{ all -> 0x005b }
                r8.close();
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.storage.AsyncStorageModule.6.doInBackgroundGuarded(java.lang.Void[]):void");
            }
        }.executeOnExecutor(this.executor, new Void[0]);
    }

    public void initialize() {
        super.initialize();
        this.mShuttingDown = false;
    }

    @ReactMethod
    public void multiGet(final ReadableArray readableArray, final Callback callback) {
        if (readableArray == null) {
            callback.invoke(new Object[]{AsyncStorageErrorUtil.getInvalidKeyError(null), null});
            return;
        }
        new GuardedAsyncTask(getReactApplicationContext()) {
            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void doInBackgroundGuarded(java.lang.Void... r16) {
                /*
                r15 = this;
                r6 = r15;
                r0 = com.facebook.react.modules.storage.AsyncStorageModule.this;
                r0 = com.facebook.react.modules.storage.AsyncStorageModule.ensureDatabase(r0);
                r1 = 2;
                r5 = 0;
                r4 = 1;
                r3 = 0;
                if (r0 != 0) goto L_0x001d;
            L_0x000d:
                r2 = r6;
                r1 = new java.lang.Object[r1];
                r0 = com.facebook.react.modules.storage.AsyncStorageErrorUtil.getDBError(r5);
                r1[r3] = r0;
                r1[r4] = r5;
                r2.invoke(r1);
                return;
            L_0x001d:
                r11 = new java.lang.String[r1];
                r0 = "key";
                r11[r3] = r0;
                r0 = "value";
                r11[r4] = r0;
                r7 = new java.util.HashSet;
                r7.<init>();
                r5 = com.facebook.react.bridge.Arguments.createArray();
                r2 = 0;
            L_0x0031:
                r0 = r5;
                r0 = r0.size();
                if (r2 >= r0) goto L_0x00f9;
            L_0x0039:
                r0 = r5;
                r8 = r0.size();
                r8 = r8 - r2;
                r0 = 999; // 0x3e7 float:1.4E-42 double:4.936E-321;
                r0 = java.lang.Math.min(r8, r0);
                r8 = com.facebook.react.modules.storage.AsyncStorageModule.this;
                r8 = r8.mReactDatabaseSupplier;
                r9 = r8.get();
                r10 = "catalystLocalStorage";
                r12 = com.facebook.react.modules.storage.AsyncLocalStorageUtil.buildKeySelection(r0);
                r8 = r5;
                r13 = com.facebook.react.modules.storage.AsyncLocalStorageUtil.buildKeySelectionArgs(r8, r2, r0);
                r14 = 0;
                r15 = 0;
                r16 = 0;
                r8 = r9.query(r10, r11, r12, r13, r14, r15, r16);
                r7.clear();
                r10 = r8.getCount();	 Catch:{ Exception -> 0x00d7 }
                r9 = r5;	 Catch:{ Exception -> 0x00d7 }
                r9 = r9.size();	 Catch:{ Exception -> 0x00d7 }
                if (r10 == r9) goto L_0x0082;
            L_0x0071:
                r10 = r2;
            L_0x0072:
                r9 = r2 + r0;
                if (r10 >= r9) goto L_0x0082;
            L_0x0076:
                r9 = r5;	 Catch:{ Exception -> 0x00d7 }
                r9 = r9.getString(r10);	 Catch:{ Exception -> 0x00d7 }
                r7.add(r9);	 Catch:{ Exception -> 0x00d7 }
                r10 = r10 + 1;
                goto L_0x0072;
            L_0x0082:
                r0 = r8.moveToFirst();	 Catch:{ Exception -> 0x00d7 }
                if (r0 == 0) goto L_0x00aa;
            L_0x0088:
                r9 = com.facebook.react.bridge.Arguments.createArray();	 Catch:{ Exception -> 0x00d7 }
                r0 = r8.getString(r3);	 Catch:{ Exception -> 0x00d7 }
                r9.pushString(r0);	 Catch:{ Exception -> 0x00d7 }
                r0 = r8.getString(r4);	 Catch:{ Exception -> 0x00d7 }
                r9.pushString(r0);	 Catch:{ Exception -> 0x00d7 }
                r5.pushArray(r9);	 Catch:{ Exception -> 0x00d7 }
                r0 = r8.getString(r3);	 Catch:{ Exception -> 0x00d7 }
                r7.remove(r0);	 Catch:{ Exception -> 0x00d7 }
                r0 = r8.moveToNext();	 Catch:{ Exception -> 0x00d7 }
                if (r0 != 0) goto L_0x0088;
            L_0x00aa:
                r8.close();
                r9 = r7.iterator();
            L_0x00b1:
                r0 = r9.hasNext();
                if (r0 == 0) goto L_0x00cb;
            L_0x00b7:
                r8 = r9.next();
                r8 = (java.lang.String) r8;
                r0 = com.facebook.react.bridge.Arguments.createArray();
                r0.pushString(r8);
                r0.pushNull();
                r5.pushArray(r0);
                goto L_0x00b1;
            L_0x00cb:
                r7.clear();
                r2 = r2 + 999;
                goto L_0x0031;
            L_0x00d2:
                r0 = move-exception;
                r8.close();
                throw r0;
            L_0x00d7:
                r7 = move-exception;
                r2 = "ReactNative";
                r0 = r7.getMessage();	 Catch:{ all -> 0x00d2 }
                X.AnonymousClass0Df.I(r2, r0, r7);	 Catch:{ all -> 0x00d2 }
                r5 = r6;	 Catch:{ all -> 0x00d2 }
                r2 = new java.lang.Object[r1];	 Catch:{ all -> 0x00d2 }
                r0 = r7.getMessage();	 Catch:{ all -> 0x00d2 }
                r1 = 0;
                r0 = com.facebook.react.modules.storage.AsyncStorageErrorUtil.getError(r1, r0);	 Catch:{ all -> 0x00d2 }
                r2[r3] = r0;	 Catch:{ all -> 0x00d2 }
                r2[r4] = r1;	 Catch:{ all -> 0x00d2 }
                r5.invoke(r2);	 Catch:{ all -> 0x00d2 }
                r8.close();
                return;
            L_0x00f9:
                r2 = r6;
                r1 = new java.lang.Object[r1];
                r0 = 0;
                r1[r3] = r0;
                r1[r4] = r5;
                r2.invoke(r1);
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.storage.AsyncStorageModule.1.doInBackgroundGuarded(java.lang.Void[]):void");
            }
        }.executeOnExecutor(this.executor, new Void[0]);
    }

    @ReactMethod
    public void multiMerge(final ReadableArray readableArray, final Callback callback) {
        new GuardedAsyncTask(getReactApplicationContext()) {
            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void doInBackgroundGuarded(java.lang.Void... r8) {
                /*
                r7 = this;
                r0 = com.facebook.react.modules.storage.AsyncStorageModule.this;
                r0 = com.facebook.react.modules.storage.AsyncStorageModule.ensureDatabase(r0);
                r6 = 1;
                r5 = 0;
                r3 = 0;
                if (r0 != 0) goto L_0x0019;
            L_0x000b:
                r2 = r5;
                r1 = new java.lang.Object[r6];
                r0 = com.facebook.react.modules.storage.AsyncStorageErrorUtil.getDBError(r3);
                r1[r5] = r0;
                r2.invoke(r1);
                return;
            L_0x0019:
                r0 = com.facebook.react.modules.storage.AsyncStorageModule.this;	 Catch:{ Exception -> 0x0133 }
                r0 = r0.mReactDatabaseSupplier;	 Catch:{ Exception -> 0x0133 }
                r1 = r0.get();	 Catch:{ Exception -> 0x0133 }
                r0 = 1043634419; // 0x3e3498f3 float:0.1763647 double:5.15623913E-315;
                X.AnonymousClass0WK.B(r1, r0);	 Catch:{ Exception -> 0x0133 }
                r4 = 0;
            L_0x0028:
                r0 = r4;	 Catch:{ Exception -> 0x0133 }
                r0 = r0.size();	 Catch:{ Exception -> 0x0133 }
                if (r4 >= r0) goto L_0x0104;
            L_0x0030:
                r0 = r4;	 Catch:{ Exception -> 0x0133 }
                r0 = r0.getArray(r4);	 Catch:{ Exception -> 0x0133 }
                r1 = r0.size();	 Catch:{ Exception -> 0x0133 }
                r0 = 2;
                if (r1 == r0) goto L_0x0064;
            L_0x003d:
                r4 = com.facebook.react.modules.storage.AsyncStorageErrorUtil.getInvalidValueError(r3);	 Catch:{ Exception -> 0x0133 }
                r0 = com.facebook.react.modules.storage.AsyncStorageModule.this;	 Catch:{ Exception -> 0x0050 }
                r0 = r0.mReactDatabaseSupplier;	 Catch:{ Exception -> 0x0050 }
                r1 = r0.get();	 Catch:{ Exception -> 0x0050 }
                r0 = 318457266; // 0x12fb45b2 float:1.5857508E-27 double:1.57338795E-315;
                X.AnonymousClass0WK.C(r1, r0);	 Catch:{ Exception -> 0x0050 }
                goto L_0x0063;
            L_0x0050:
                r2 = move-exception;
                r1 = "ReactNative";
                r0 = r2.getMessage();
                X.AnonymousClass0Df.I(r1, r0, r2);
                if (r4 != 0) goto L_0x0063;
            L_0x005c:
                r0 = r2.getMessage();
                com.facebook.react.modules.storage.AsyncStorageErrorUtil.getError(r3, r0);
            L_0x0063:
                return;
            L_0x0064:
                r0 = r4;	 Catch:{ Exception -> 0x0133 }
                r0 = r0.getArray(r4);	 Catch:{ Exception -> 0x0133 }
                r0 = r0.getString(r5);	 Catch:{ Exception -> 0x0133 }
                if (r0 != 0) goto L_0x0090;
            L_0x0070:
                r4 = com.facebook.react.modules.storage.AsyncStorageErrorUtil.getInvalidKeyError(r3);	 Catch:{ Exception -> 0x0133 }
                r0 = com.facebook.react.modules.storage.AsyncStorageModule.this;	 Catch:{ Exception -> 0x0083 }
                r0 = r0.mReactDatabaseSupplier;	 Catch:{ Exception -> 0x0083 }
                r1 = r0.get();	 Catch:{ Exception -> 0x0083 }
                r0 = 520283090; // 0x1f02e3d2 float:2.771702E-20 double:2.57054001E-315;
                X.AnonymousClass0WK.C(r1, r0);	 Catch:{ Exception -> 0x0083 }
                goto L_0x0063;
            L_0x0083:
                r2 = move-exception;
                r1 = "ReactNative";
                r0 = r2.getMessage();
                X.AnonymousClass0Df.I(r1, r0, r2);
                if (r4 != 0) goto L_0x0063;
            L_0x008f:
                goto L_0x005c;
            L_0x0090:
                r0 = r4;	 Catch:{ Exception -> 0x0133 }
                r0 = r0.getArray(r4);	 Catch:{ Exception -> 0x0133 }
                r0 = r0.getString(r6);	 Catch:{ Exception -> 0x0133 }
                if (r0 != 0) goto L_0x00bc;
            L_0x009c:
                r4 = com.facebook.react.modules.storage.AsyncStorageErrorUtil.getInvalidValueError(r3);	 Catch:{ Exception -> 0x0133 }
                r0 = com.facebook.react.modules.storage.AsyncStorageModule.this;	 Catch:{ Exception -> 0x00af }
                r0 = r0.mReactDatabaseSupplier;	 Catch:{ Exception -> 0x00af }
                r1 = r0.get();	 Catch:{ Exception -> 0x00af }
                r0 = 977170485; // 0x3a3e7035 float:7.264645E-4 double:4.82786367E-315;
                X.AnonymousClass0WK.C(r1, r0);	 Catch:{ Exception -> 0x00af }
                goto L_0x0063;
            L_0x00af:
                r2 = move-exception;
                r1 = "ReactNative";
                r0 = r2.getMessage();
                X.AnonymousClass0Df.I(r1, r0, r2);
                if (r4 != 0) goto L_0x0063;
            L_0x00bb:
                goto L_0x005c;
            L_0x00bc:
                r0 = com.facebook.react.modules.storage.AsyncStorageModule.this;	 Catch:{ Exception -> 0x0133 }
                r0 = r0.mReactDatabaseSupplier;	 Catch:{ Exception -> 0x0133 }
                r2 = r0.get();	 Catch:{ Exception -> 0x0133 }
                r0 = r4;	 Catch:{ Exception -> 0x0133 }
                r0 = r0.getArray(r4);	 Catch:{ Exception -> 0x0133 }
                r1 = r0.getString(r5);	 Catch:{ Exception -> 0x0133 }
                r0 = r4;	 Catch:{ Exception -> 0x0133 }
                r0 = r0.getArray(r4);	 Catch:{ Exception -> 0x0133 }
                r0 = r0.getString(r6);	 Catch:{ Exception -> 0x0133 }
                r0 = com.facebook.react.modules.storage.AsyncLocalStorageUtil.mergeImpl(r2, r1, r0);	 Catch:{ Exception -> 0x0133 }
                if (r0 != 0) goto L_0x0100;
            L_0x00de:
                r4 = com.facebook.react.modules.storage.AsyncStorageErrorUtil.getDBError(r3);	 Catch:{ Exception -> 0x0133 }
                r0 = com.facebook.react.modules.storage.AsyncStorageModule.this;	 Catch:{ Exception -> 0x00f2 }
                r0 = r0.mReactDatabaseSupplier;	 Catch:{ Exception -> 0x00f2 }
                r1 = r0.get();	 Catch:{ Exception -> 0x00f2 }
                r0 = -1214288982; // 0xffffffffb79f6baa float:-1.9004412E-5 double:NaN;
                X.AnonymousClass0WK.C(r1, r0);	 Catch:{ Exception -> 0x00f2 }
                goto L_0x0063;
            L_0x00f2:
                r2 = move-exception;
                r1 = "ReactNative";
                r0 = r2.getMessage();
                X.AnonymousClass0Df.I(r1, r0, r2);
                if (r4 != 0) goto L_0x0063;
            L_0x00fe:
                goto L_0x005c;
            L_0x0100:
                r4 = r4 + 1;
                goto L_0x0028;
            L_0x0104:
                r0 = com.facebook.react.modules.storage.AsyncStorageModule.this;	 Catch:{ Exception -> 0x0133 }
                r0 = r0.mReactDatabaseSupplier;	 Catch:{ Exception -> 0x0133 }
                r0 = r0.get();	 Catch:{ Exception -> 0x0133 }
                r0.setTransactionSuccessful();	 Catch:{ Exception -> 0x0133 }
                r0 = com.facebook.react.modules.storage.AsyncStorageModule.this;	 Catch:{ Exception -> 0x011e }
                r0 = r0.mReactDatabaseSupplier;	 Catch:{ Exception -> 0x011e }
                r1 = r0.get();	 Catch:{ Exception -> 0x011e }
                r0 = -738840615; // 0xffffffffd3f62fd9 float:-2.11472941E12 double:NaN;
                X.AnonymousClass0WK.C(r1, r0);	 Catch:{ Exception -> 0x011e }
                goto L_0x016a;
            L_0x011e:
                r2 = move-exception;
                r1 = "ReactNative";
                r0 = r2.getMessage();
                X.AnonymousClass0Df.I(r1, r0, r2);
                r0 = r2.getMessage();
                r3 = com.facebook.react.modules.storage.AsyncStorageErrorUtil.getError(r3, r0);
                goto L_0x016a;
            L_0x0131:
                r4 = move-exception;
                goto L_0x0180;
            L_0x0133:
                r2 = move-exception;
                r1 = "ReactNative";
                r0 = r2.getMessage();	 Catch:{ all -> 0x0131 }
                X.AnonymousClass0Df.I(r1, r0, r2);	 Catch:{ all -> 0x0131 }
                r0 = r2.getMessage();	 Catch:{ all -> 0x0131 }
                r4 = com.facebook.react.modules.storage.AsyncStorageErrorUtil.getError(r3, r0);	 Catch:{ all -> 0x0131 }
                r0 = com.facebook.react.modules.storage.AsyncStorageModule.this;	 Catch:{ Exception -> 0x0155 }
                r0 = r0.mReactDatabaseSupplier;	 Catch:{ Exception -> 0x0155 }
                r1 = r0.get();	 Catch:{ Exception -> 0x0155 }
                r0 = 922692237; // 0x36ff2a8d float:7.6045458E-6 double:4.55870536E-315;
                X.AnonymousClass0WK.C(r1, r0);	 Catch:{ Exception -> 0x0155 }
            L_0x0153:
                r3 = r4;
                goto L_0x016a;
            L_0x0155:
                r2 = move-exception;
                r1 = "ReactNative";
                r0 = r2.getMessage();
                X.AnonymousClass0Df.I(r1, r0, r2);
                if (r4 != 0) goto L_0x0153;
            L_0x0161:
                r0 = r2.getMessage();
                r4 = com.facebook.react.modules.storage.AsyncStorageErrorUtil.getError(r3, r0);
                goto L_0x0153;
            L_0x016a:
                if (r3 == 0) goto L_0x0177;
            L_0x016c:
                r1 = r5;
                r0 = new java.lang.Object[r6];
                r0[r5] = r3;
                r1.invoke(r0);
                goto L_0x0063;
            L_0x0177:
                r1 = r5;
                r0 = new java.lang.Object[r5];
                r1.invoke(r0);
                goto L_0x0063;
            L_0x0180:
                r0 = com.facebook.react.modules.storage.AsyncStorageModule.this;	 Catch:{ Exception -> 0x018f }
                r0 = r0.mReactDatabaseSupplier;	 Catch:{ Exception -> 0x018f }
                r1 = r0.get();	 Catch:{ Exception -> 0x018f }
                r0 = 1782066959; // 0x6a382f0f float:5.5666145E25 double:8.80458063E-315;
                X.AnonymousClass0WK.C(r1, r0);	 Catch:{ Exception -> 0x018f }
                goto L_0x01a0;
            L_0x018f:
                r2 = move-exception;
                r1 = r2.getMessage();
                r0 = "ReactNative";
                X.AnonymousClass0Df.I(r0, r1, r2);
                r0 = r2.getMessage();
                com.facebook.react.modules.storage.AsyncStorageErrorUtil.getError(r3, r0);
            L_0x01a0:
                throw r4;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.storage.AsyncStorageModule.4.doInBackgroundGuarded(java.lang.Void[]):void");
            }
        }.executeOnExecutor(this.executor, new Void[0]);
    }

    @ReactMethod
    public void multiRemove(final ReadableArray readableArray, final Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[]{AsyncStorageErrorUtil.getInvalidKeyError(null)});
            return;
        }
        new GuardedAsyncTask(getReactApplicationContext()) {
            public final void doInBackgroundGuarded(Void... voidArr) {
                String str = null;
                if (AsyncStorageModule.ensureDatabase(AsyncStorageModule.this)) {
                    try {
                        AnonymousClass0WK.B(AsyncStorageModule.this.mReactDatabaseSupplier.get(), -1690585889);
                        for (int i = 0; i < readableArray.size(); i += AsyncStorageModule.MAX_SQL_KEYS) {
                            int min = Math.min(readableArray.size() - i, AsyncStorageModule.MAX_SQL_KEYS);
                            AsyncStorageModule.this.mReactDatabaseSupplier.get().delete("catalystLocalStorage", AsyncLocalStorageUtil.buildKeySelection(min), AsyncLocalStorageUtil.buildKeySelectionArgs(readableArray, i, min));
                        }
                        AsyncStorageModule.this.mReactDatabaseSupplier.get().setTransactionSuccessful();
                        try {
                            AnonymousClass0WK.C(AsyncStorageModule.this.mReactDatabaseSupplier.get(), -1901485439);
                        } catch (Throwable e) {
                            AnonymousClass0Df.I("ReactNative", e.getMessage(), e);
                            str = AsyncStorageErrorUtil.getError(null, e.getMessage());
                        }
                    } catch (Throwable e2) {
                        AnonymousClass0Df.I("ReactNative", e2.getMessage(), e2);
                        WritableMap error = AsyncStorageErrorUtil.getError(null, e2.getMessage());
                        try {
                            AnonymousClass0WK.C(AsyncStorageModule.this.mReactDatabaseSupplier.get(), 2023674964);
                        } catch (Throwable e22) {
                            AnonymousClass0Df.I("ReactNative", e22.getMessage(), e22);
                            if (error == null) {
                                error = AsyncStorageErrorUtil.getError(null, e22.getMessage());
                            }
                        }
                        str = error;
                    } catch (Throwable th) {
                        try {
                            AnonymousClass0WK.C(AsyncStorageModule.this.mReactDatabaseSupplier.get(), 1638593163);
                        } catch (Throwable e222) {
                            AnonymousClass0Df.I("ReactNative", e222.getMessage(), e222);
                            AsyncStorageErrorUtil.getError(null, e222.getMessage());
                        }
                        throw th;
                    }
                    if (str != null) {
                        callback.invoke(new Object[]{str});
                    } else {
                        callback.invoke(new Object[0]);
                    }
                    return;
                }
                callback.invoke(new Object[]{AsyncStorageErrorUtil.getDBError(null)});
            }
        }.executeOnExecutor(this.executor, new Void[0]);
    }

    @ReactMethod
    public void multiSet(final ReadableArray readableArray, final Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[]{AsyncStorageErrorUtil.getInvalidKeyError(null)});
            return;
        }
        new GuardedAsyncTask(getReactApplicationContext()) {
            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void doInBackgroundGuarded(java.lang.Void... r8) {
                /*
                r7 = this;
                r0 = com.facebook.react.modules.storage.AsyncStorageModule.this;
                r0 = com.facebook.react.modules.storage.AsyncStorageModule.ensureDatabase(r0);
                r5 = 0;
                r6 = 1;
                r3 = 0;
                if (r0 != 0) goto L_0x0019;
            L_0x000b:
                r2 = r6;
                r1 = new java.lang.Object[r6];
                r0 = com.facebook.react.modules.storage.AsyncStorageErrorUtil.getDBError(r3);
                r1[r5] = r0;
                r2.invoke(r1);
                return;
            L_0x0019:
                r1 = "INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);";
                r0 = com.facebook.react.modules.storage.AsyncStorageModule.this;
                r0 = r0.mReactDatabaseSupplier;
                r0 = r0.get();
                r2 = r0.compileStatement(r1);
                r0 = com.facebook.react.modules.storage.AsyncStorageModule.this;	 Catch:{ Exception -> 0x0129 }
                r0 = r0.mReactDatabaseSupplier;	 Catch:{ Exception -> 0x0129 }
                r1 = r0.get();	 Catch:{ Exception -> 0x0129 }
                r0 = 1644346402; // 0x6202bc22 float:6.029083E20 double:8.12415067E-315;
                X.AnonymousClass0WK.B(r1, r0);	 Catch:{ Exception -> 0x0129 }
                r1 = 0;
            L_0x0036:
                r0 = r5;	 Catch:{ Exception -> 0x0129 }
                r0 = r0.size();	 Catch:{ Exception -> 0x0129 }
                if (r1 >= r0) goto L_0x00fa;
            L_0x003e:
                r0 = r5;	 Catch:{ Exception -> 0x0129 }
                r0 = r0.getArray(r1);	 Catch:{ Exception -> 0x0129 }
                r0 = r0.size();	 Catch:{ Exception -> 0x0129 }
                r4 = 2;
                if (r0 == r4) goto L_0x0072;
            L_0x004b:
                r4 = com.facebook.react.modules.storage.AsyncStorageErrorUtil.getInvalidValueError(r3);	 Catch:{ Exception -> 0x0129 }
                r0 = com.facebook.react.modules.storage.AsyncStorageModule.this;	 Catch:{ Exception -> 0x005e }
                r0 = r0.mReactDatabaseSupplier;	 Catch:{ Exception -> 0x005e }
                r1 = r0.get();	 Catch:{ Exception -> 0x005e }
                r0 = 1174830101; // 0x46067c15 float:8607.0205 double:5.804431926E-315;
                X.AnonymousClass0WK.C(r1, r0);	 Catch:{ Exception -> 0x005e }
                goto L_0x0071;
            L_0x005e:
                r2 = move-exception;
                r1 = "ReactNative";
                r0 = r2.getMessage();
                X.AnonymousClass0Df.I(r1, r0, r2);
                if (r4 != 0) goto L_0x0071;
            L_0x006a:
                r0 = r2.getMessage();
                com.facebook.react.modules.storage.AsyncStorageErrorUtil.getError(r3, r0);
            L_0x0071:
                return;
            L_0x0072:
                r0 = r5;	 Catch:{ Exception -> 0x0129 }
                r0 = r0.getArray(r1);	 Catch:{ Exception -> 0x0129 }
                r0 = r0.getString(r5);	 Catch:{ Exception -> 0x0129 }
                if (r0 != 0) goto L_0x009e;
            L_0x007e:
                r4 = com.facebook.react.modules.storage.AsyncStorageErrorUtil.getInvalidKeyError(r3);	 Catch:{ Exception -> 0x0129 }
                r0 = com.facebook.react.modules.storage.AsyncStorageModule.this;	 Catch:{ Exception -> 0x0091 }
                r0 = r0.mReactDatabaseSupplier;	 Catch:{ Exception -> 0x0091 }
                r1 = r0.get();	 Catch:{ Exception -> 0x0091 }
                r0 = 172634651; // 0xa4a321b float:9.73537E-33 double:8.52928503E-316;
                X.AnonymousClass0WK.C(r1, r0);	 Catch:{ Exception -> 0x0091 }
                goto L_0x0071;
            L_0x0091:
                r2 = move-exception;
                r1 = "ReactNative";
                r0 = r2.getMessage();
                X.AnonymousClass0Df.I(r1, r0, r2);
                if (r4 != 0) goto L_0x0071;
            L_0x009d:
                goto L_0x006a;
            L_0x009e:
                r0 = r5;	 Catch:{ Exception -> 0x0129 }
                r0 = r0.getArray(r1);	 Catch:{ Exception -> 0x0129 }
                r0 = r0.getString(r6);	 Catch:{ Exception -> 0x0129 }
                if (r0 != 0) goto L_0x00ca;
            L_0x00aa:
                r4 = com.facebook.react.modules.storage.AsyncStorageErrorUtil.getInvalidValueError(r3);	 Catch:{ Exception -> 0x0129 }
                r0 = com.facebook.react.modules.storage.AsyncStorageModule.this;	 Catch:{ Exception -> 0x00bd }
                r0 = r0.mReactDatabaseSupplier;	 Catch:{ Exception -> 0x00bd }
                r1 = r0.get();	 Catch:{ Exception -> 0x00bd }
                r0 = -176703083; // 0xfffffffff577b995 float:-3.1402866E32 double:NaN;
                X.AnonymousClass0WK.C(r1, r0);	 Catch:{ Exception -> 0x00bd }
                goto L_0x0071;
            L_0x00bd:
                r2 = move-exception;
                r1 = "ReactNative";
                r0 = r2.getMessage();
                X.AnonymousClass0Df.I(r1, r0, r2);
                if (r4 != 0) goto L_0x0071;
            L_0x00c9:
                goto L_0x006a;
            L_0x00ca:
                r2.clearBindings();	 Catch:{ Exception -> 0x0129 }
                r0 = r5;	 Catch:{ Exception -> 0x0129 }
                r0 = r0.getArray(r1);	 Catch:{ Exception -> 0x0129 }
                r0 = r0.getString(r5);	 Catch:{ Exception -> 0x0129 }
                r2.bindString(r6, r0);	 Catch:{ Exception -> 0x0129 }
                r0 = r5;	 Catch:{ Exception -> 0x0129 }
                r0 = r0.getArray(r1);	 Catch:{ Exception -> 0x0129 }
                r0 = r0.getString(r6);	 Catch:{ Exception -> 0x0129 }
                r2.bindString(r4, r0);	 Catch:{ Exception -> 0x0129 }
                r0 = -1332102977; // 0xffffffffb099b8bf float:-1.1184723E-9 double:NaN;
                X.AnonymousClass0WK.D(r0);	 Catch:{ Exception -> 0x0129 }
                r2.execute();	 Catch:{ Exception -> 0x0129 }
                r0 = -535921087; // 0xffffffffe00e7e41 float:-4.1070863E19 double:NaN;
                X.AnonymousClass0WK.D(r0);	 Catch:{ Exception -> 0x0129 }
                r1 = r1 + 1;
                goto L_0x0036;
            L_0x00fa:
                r0 = com.facebook.react.modules.storage.AsyncStorageModule.this;	 Catch:{ Exception -> 0x0129 }
                r0 = r0.mReactDatabaseSupplier;	 Catch:{ Exception -> 0x0129 }
                r0 = r0.get();	 Catch:{ Exception -> 0x0129 }
                r0.setTransactionSuccessful();	 Catch:{ Exception -> 0x0129 }
                r0 = com.facebook.react.modules.storage.AsyncStorageModule.this;	 Catch:{ Exception -> 0x0114 }
                r0 = r0.mReactDatabaseSupplier;	 Catch:{ Exception -> 0x0114 }
                r1 = r0.get();	 Catch:{ Exception -> 0x0114 }
                r0 = -1359797904; // 0xffffffffaef32170 float:-1.10563E-10 double:NaN;
                X.AnonymousClass0WK.C(r1, r0);	 Catch:{ Exception -> 0x0114 }
                goto L_0x0160;
            L_0x0114:
                r2 = move-exception;
                r1 = "ReactNative";
                r0 = r2.getMessage();
                X.AnonymousClass0Df.I(r1, r0, r2);
                r0 = r2.getMessage();
                r3 = com.facebook.react.modules.storage.AsyncStorageErrorUtil.getError(r3, r0);
                goto L_0x0160;
            L_0x0127:
                r4 = move-exception;
                goto L_0x0176;
            L_0x0129:
                r2 = move-exception;
                r1 = "ReactNative";
                r0 = r2.getMessage();	 Catch:{ all -> 0x0127 }
                X.AnonymousClass0Df.I(r1, r0, r2);	 Catch:{ all -> 0x0127 }
                r0 = r2.getMessage();	 Catch:{ all -> 0x0127 }
                r4 = com.facebook.react.modules.storage.AsyncStorageErrorUtil.getError(r3, r0);	 Catch:{ all -> 0x0127 }
                r0 = com.facebook.react.modules.storage.AsyncStorageModule.this;	 Catch:{ Exception -> 0x014b }
                r0 = r0.mReactDatabaseSupplier;	 Catch:{ Exception -> 0x014b }
                r1 = r0.get();	 Catch:{ Exception -> 0x014b }
                r0 = 1351242749; // 0x508a53fd float:1.85660805E10 double:6.676026215E-315;
                X.AnonymousClass0WK.C(r1, r0);	 Catch:{ Exception -> 0x014b }
            L_0x0149:
                r3 = r4;
                goto L_0x0160;
            L_0x014b:
                r2 = move-exception;
                r1 = "ReactNative";
                r0 = r2.getMessage();
                X.AnonymousClass0Df.I(r1, r0, r2);
                if (r4 != 0) goto L_0x0149;
            L_0x0157:
                r0 = r2.getMessage();
                r4 = com.facebook.react.modules.storage.AsyncStorageErrorUtil.getError(r3, r0);
                goto L_0x0149;
            L_0x0160:
                if (r3 == 0) goto L_0x016d;
            L_0x0162:
                r1 = r6;
                r0 = new java.lang.Object[r6];
                r0[r5] = r3;
                r1.invoke(r0);
                goto L_0x0071;
            L_0x016d:
                r1 = r6;
                r0 = new java.lang.Object[r5];
                r1.invoke(r0);
                goto L_0x0071;
            L_0x0176:
                r0 = com.facebook.react.modules.storage.AsyncStorageModule.this;	 Catch:{ Exception -> 0x0185 }
                r0 = r0.mReactDatabaseSupplier;	 Catch:{ Exception -> 0x0185 }
                r1 = r0.get();	 Catch:{ Exception -> 0x0185 }
                r0 = -42255881; // 0xfffffffffd7b39f7 float:-2.0871075E37 double:NaN;
                X.AnonymousClass0WK.C(r1, r0);	 Catch:{ Exception -> 0x0185 }
                goto L_0x0196;
            L_0x0185:
                r2 = move-exception;
                r1 = r2.getMessage();
                r0 = "ReactNative";
                X.AnonymousClass0Df.I(r0, r1, r2);
                r0 = r2.getMessage();
                com.facebook.react.modules.storage.AsyncStorageErrorUtil.getError(r3, r0);
            L_0x0196:
                throw r4;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.storage.AsyncStorageModule.2.doInBackgroundGuarded(java.lang.Void[]):void");
            }
        }.executeOnExecutor(this.executor, new Void[0]);
    }

    public void onCatalystInstanceDestroy() {
        this.mShuttingDown = true;
    }
}
