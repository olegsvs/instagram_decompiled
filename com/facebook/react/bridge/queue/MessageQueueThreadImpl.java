package com.facebook.react.bridge.queue;

import X.AnonymousClass0Df;
import X.AnonymousClass0OR;
import android.os.Looper;
import android.os.Process;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.futures.SimpleSettableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class MessageQueueThreadImpl implements MessageQueueThread {
    private final String mAssertionErrorMessage;
    private final MessageQueueThreadHandler mHandler;
    private volatile boolean mIsFinished = false;
    private final Looper mLooper;
    private final String mName;

    /* renamed from: com.facebook.react.bridge.queue.MessageQueueThreadImpl$2 */
    public final class C00922 implements Runnable {
        public final void run() {
            Process.setThreadPriority(-4);
        }
    }

    /* renamed from: com.facebook.react.bridge.queue.MessageQueueThreadImpl$3 */
    public final class C00933 implements Runnable {
        public final /* synthetic */ SimpleSettableFuture val$looperFuture;

        public C00933(SimpleSettableFuture simpleSettableFuture) {
            this.val$looperFuture = simpleSettableFuture;
        }

        public final void run() {
            Process.setThreadPriority(-4);
            Looper.prepare();
            this.val$looperFuture.set(Looper.myLooper());
            Looper.loop();
        }
    }

    private MessageQueueThreadImpl(String str, Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        this.mName = str;
        this.mLooper = looper;
        this.mHandler = new MessageQueueThreadHandler(looper, queueThreadExceptionHandler);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected to be called from the '");
        stringBuilder.append(getName());
        stringBuilder.append("' thread!");
        this.mAssertionErrorMessage = stringBuilder.toString();
    }

    public void assertIsOnThread() {
        SoftAssertions.assertCondition(isOnThread(), this.mAssertionErrorMessage);
    }

    public void assertIsOnThread(String str) {
        boolean isOnThread = isOnThread();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.mAssertionErrorMessage);
        stringBuilder.append(" ");
        stringBuilder.append(str);
        SoftAssertions.assertCondition(isOnThread, stringBuilder.toString());
    }

    public Future callOnQueue(final Callable callable) {
        final Future simpleSettableFuture = new SimpleSettableFuture();
        runOnQueue(new Runnable() {
            public final void run() {
                try {
                    simpleSettableFuture.set(callable.call());
                } catch (Exception e) {
                    simpleSettableFuture.setException(e);
                }
            }
        });
        return simpleSettableFuture;
    }

    public static MessageQueueThreadImpl create(MessageQueueThreadSpec messageQueueThreadSpec, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        switch (messageQueueThreadSpec.getThreadType().ordinal()) {
            case 0:
                return createForMainThread(messageQueueThreadSpec.getName(), queueThreadExceptionHandler);
            case 1:
                return startNewBackgroundThread(messageQueueThreadSpec.getName(), messageQueueThreadSpec.getStackSize(), queueThreadExceptionHandler);
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown thread type: ");
                stringBuilder.append(messageQueueThreadSpec.getThreadType());
                throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static MessageQueueThreadImpl createForMainThread(String str, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        MessageQueueThreadImpl messageQueueThreadImpl = new MessageQueueThreadImpl(str, Looper.getMainLooper(), queueThreadExceptionHandler);
        if (UiThreadUtil.isOnUiThread()) {
            Process.setThreadPriority(-4);
        } else {
            UiThreadUtil.runOnUiThread(new C00922());
        }
        return messageQueueThreadImpl;
    }

    public final Looper getLooper() {
        return this.mLooper;
    }

    public final String getName() {
        return this.mName;
    }

    public boolean isOnThread() {
        return this.mLooper.getThread() == Thread.currentThread();
    }

    public void quitSynchronous() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = 1;
        r3.mIsFinished = r0;
        r0 = r3.mLooper;
        r0.quit();
        r0 = r3.mLooper;
        r1 = r0.getThread();
        r0 = java.lang.Thread.currentThread();
        if (r1 == r0) goto L_0x0037;
    L_0x0014:
        r0 = r3.mLooper;	 Catch:{ InterruptedException -> 0x001e }
        r0 = r0.getThread();	 Catch:{ InterruptedException -> 0x001e }
        r0.join();	 Catch:{ InterruptedException -> 0x001e }
        goto L_0x0037;	 Catch:{ InterruptedException -> 0x001e }
    L_0x001e:
        r2 = new java.lang.RuntimeException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Got interrupted waiting to join thread ";
        r1.append(r0);
        r0 = r3.mName;
        r1.append(r0);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
    L_0x0037:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.queue.MessageQueueThreadImpl.quitSynchronous():void");
    }

    public void runOnQueue(Runnable runnable) {
        if (this.mIsFinished) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Tried to enqueue runnable on already finished thread: '");
            stringBuilder.append(getName());
            stringBuilder.append("... dropping Runnable.");
            AnonymousClass0Df.H("ReactNative", stringBuilder.toString());
        }
        AnonymousClass0OR.D(this.mHandler, runnable, -1093141153);
    }

    private static MessageQueueThreadImpl startNewBackgroundThread(String str, long j, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
        Runnable c00933 = new C00933(simpleSettableFuture);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("mqt_");
        stringBuilder.append(str);
        new Thread(null, c00933, stringBuilder.toString(), j).start();
        return new MessageQueueThreadImpl(str, (Looper) simpleSettableFuture.getOrThrow(), queueThreadExceptionHandler);
    }
}
