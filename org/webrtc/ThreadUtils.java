package org.webrtc;

import X.AnonymousClass0OR;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class ThreadUtils {

    /* renamed from: org.webrtc.ThreadUtils$3 */
    public class C02373 implements Runnable {
        public final /* synthetic */ CountDownLatch val$barrier;
        public final /* synthetic */ Callable val$callable;
        public final /* synthetic */ AnonymousClass1CaughtException val$caughtException;
        public final /* synthetic */ AnonymousClass1Result val$result;

        public C02373(AnonymousClass1Result anonymousClass1Result, Callable callable, AnonymousClass1CaughtException anonymousClass1CaughtException, CountDownLatch countDownLatch) {
            this.val$result = anonymousClass1Result;
            this.val$callable = callable;
            this.val$caughtException = anonymousClass1CaughtException;
            this.val$barrier = countDownLatch;
        }

        public void run() {
            try {
                this.val$result.value = this.val$callable.call();
            } catch (Exception e) {
                this.val$caughtException.f72852e = e;
            }
            this.val$barrier.countDown();
        }
    }

    /* renamed from: org.webrtc.ThreadUtils$4 */
    public class C02384 implements Callable {
        public final /* synthetic */ Runnable val$runner;

        public C02384(Runnable runnable) {
            this.val$runner = runnable;
        }

        public Void call() {
            this.val$runner.run();
            return null;
        }
    }

    public interface BlockingOperation {
        void run();
    }

    public class ThreadChecker {
        private Thread thread = Thread.currentThread();

        public void checkIsOnValidThread() {
            if (this.thread == null) {
                this.thread = Thread.currentThread();
            }
            if (Thread.currentThread() != this.thread) {
                throw new IllegalStateException("Wrong thread");
            }
        }

        public void detachThread() {
            this.thread = null;
        }
    }

    /* renamed from: org.webrtc.ThreadUtils$1 */
    public class C02621 implements BlockingOperation {
        public final /* synthetic */ Thread val$thread;

        public C02621(Thread thread) {
            this.val$thread = thread;
        }

        public void run() {
            this.val$thread.join();
        }
    }

    /* renamed from: org.webrtc.ThreadUtils$2 */
    public class C02632 implements BlockingOperation {
        public final /* synthetic */ CountDownLatch val$latch;

        public C02632(CountDownLatch countDownLatch) {
            this.val$latch = countDownLatch;
        }

        public void run() {
            this.val$latch.await();
        }
    }

    public static void awaitUninterruptibly(CountDownLatch countDownLatch) {
        executeUninterruptibly(new C02632(countDownLatch));
    }

    public static boolean awaitUninterruptibly(java.util.concurrent.CountDownLatch r8, long r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = android.os.SystemClock.elapsedRealtime();
        r4 = 0;
        r2 = r9;
        r5 = 0;
    L_0x0007:
        r0 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x000e }
        r4 = r8.await(r2, r0);	 Catch:{ InterruptedException -> 0x000e }
        goto L_0x001c;	 Catch:{ InterruptedException -> 0x000e }
    L_0x000e:
        r5 = 1;
        r0 = android.os.SystemClock.elapsedRealtime();
        r0 = r0 - r6;
        r2 = r9 - r0;
        r0 = 0;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 > 0) goto L_0x0007;
    L_0x001c:
        if (r5 == 0) goto L_0x0025;
    L_0x001e:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
    L_0x0025:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.ThreadUtils.awaitUninterruptibly(java.util.concurrent.CountDownLatch, long):boolean");
    }

    public static void checkIsOnMainThread() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("Not on main thread!");
        }
    }

    public static StackTraceElement[] concatStackTraces(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        Object obj = new StackTraceElement[(stackTraceElementArr.length + stackTraceElementArr2.length)];
        System.arraycopy(stackTraceElementArr, 0, obj, 0, stackTraceElementArr.length);
        System.arraycopy(stackTraceElementArr2, 0, obj, stackTraceElementArr.length, stackTraceElementArr2.length);
        return obj;
    }

    public static void executeUninterruptibly(org.webrtc.ThreadUtils.BlockingOperation r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
    L_0x0001:
        r1.run();	 Catch:{ InterruptedException -> 0x000e }
        if (r0 == 0) goto L_0x000d;	 Catch:{ InterruptedException -> 0x000e }
    L_0x0006:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
    L_0x000d:
        return;
    L_0x000e:
        r0 = 1;
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.ThreadUtils.executeUninterruptibly(org.webrtc.ThreadUtils$BlockingOperation):void");
    }

    public static Object invokeAtFrontUninterruptibly(Handler handler, Callable callable) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            try {
                return callable.call();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        AnonymousClass1Result anonymousClass1Result = new Object() {
            public Object value;
        };
        AnonymousClass1CaughtException anonymousClass1CaughtException = new Object() {
            /* renamed from: e */
            public Exception f72852e;
        };
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AnonymousClass0OR.D(handler, new C02373(anonymousClass1Result, callable, anonymousClass1CaughtException, countDownLatch), -723789442);
        awaitUninterruptibly(countDownLatch);
        if (anonymousClass1CaughtException.f72852e == null) {
            return anonymousClass1Result.value;
        }
        RuntimeException runtimeException = new RuntimeException(anonymousClass1CaughtException.f72852e);
        runtimeException.setStackTrace(concatStackTraces(anonymousClass1CaughtException.f72852e.getStackTrace(), runtimeException.getStackTrace()));
        throw runtimeException;
    }

    public static void invokeAtFrontUninterruptibly(Handler handler, Runnable runnable) {
        invokeAtFrontUninterruptibly(handler, new C02384(runnable));
    }

    public static void joinUninterruptibly(Thread thread) {
        executeUninterruptibly(new C02621(thread));
    }

    public static boolean joinUninterruptibly(java.lang.Thread r8, long r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = android.os.SystemClock.elapsedRealtime();
        r5 = 1;
        r2 = r9;
        r4 = 0;
    L_0x0007:
        r0 = 0;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x001a;
    L_0x000d:
        r8.join(r2);	 Catch:{ InterruptedException -> 0x0011 }
        goto L_0x001a;	 Catch:{ InterruptedException -> 0x0011 }
    L_0x0011:
        r0 = android.os.SystemClock.elapsedRealtime();
        r0 = r0 - r6;
        r2 = r9 - r0;
        r4 = 1;
        goto L_0x0007;
    L_0x001a:
        if (r4 == 0) goto L_0x0023;
    L_0x001c:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
    L_0x0023:
        r0 = r8.isAlive();
        r0 = r0 ^ r5;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.ThreadUtils.joinUninterruptibly(java.lang.Thread, long):boolean");
    }
}
