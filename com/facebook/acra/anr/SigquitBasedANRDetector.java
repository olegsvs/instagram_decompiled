package com.facebook.acra.anr;

import X.AnonymousClass00H;
import X.AnonymousClass00S;
import X.AnonymousClass00U;
import X.AnonymousClass09w;
import X.AnonymousClass0CF;
import X.AnonymousClass0DD;
import X.AnonymousClass0Dc;
import X.AnonymousClass0Dj;
import X.AnonymousClass0Dm;
import X.AnonymousClass0OR;
import X.AnonymousClass1Ke;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SigquitBasedANRDetector extends AnonymousClass0Dm {
    public static final String LOG_TAG = "SigquitBasedANRDetector";
    private static SigquitBasedANRDetector sInstance;
    private static final boolean sIsArt;
    private static boolean sSoLoaded;
    private String mCurrentAnrStack;
    private long mDetectorReadyTime;
    private boolean mHookInPlace;
    private boolean mInAnr;
    private final Pattern mMainThreadPattern = Pattern.compile("^$^\\s*(\"main\".*?$\\s*\\|\\s+group=\"main\"(?s).*?$^\\s*$)", 8);
    private AnonymousClass0Dj mNativeLibListener;
    private HandlerThread mProcessingThread;
    private Handler mProcessingThreadHandler;
    private final Object mProcessingThreadLock = new Object();
    private boolean mRunning;
    private final Pattern mStackPattern = Pattern.compile("^\\s*[ank#](?s).*", 8);
    private final Object mStateLock = new Object();
    private long mSwitchTime;

    private static native void cleanupAppStateFile();

    private static native void init(SigquitBasedANRDetector sigquitBasedANRDetector, boolean z, int i, boolean z2);

    private static native boolean startDetector();

    private static native void stopDetector();

    static {
        String property = System.getProperty("java.vm.version");
        boolean z = (property == null || property.startsWith("1.") || property.startsWith("0.")) ? false : true;
        sIsArt = z;
    }

    private SigquitBasedANRDetector(AnonymousClass00H anonymousClass00H) {
        super(anonymousClass00H, true);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void anrDetected(java.lang.String r6) {
        /*
        r5 = this;
        r1 = LOG_TAG;
        r0 = "On anrDetected call";
        X.AnonymousClass0Dc.m1253P(r1, r0);
        r0 = r5.m1299C();
        if (r0 == 0) goto L_0x000e;
    L_0x000d:
        return;
    L_0x000e:
        r5.m1302F();
        r3 = r5.mStateLock;
        monitor-enter(r3);
        r0 = r5.mRunning;	 Catch:{ all -> 0x0061 }
        if (r0 != 0) goto L_0x001a;
    L_0x0018:
        monitor-exit(r3);	 Catch:{ all -> 0x0061 }
        goto L_0x000d;
    L_0x001a:
        r2 = r5.getMainThreadStack(r6);	 Catch:{ all -> 0x0061 }
        r1 = r5.mInAnr;	 Catch:{ all -> 0x0061 }
        r4 = 0;
        r0 = 1;
        if (r1 == 0) goto L_0x003f;
    L_0x0024:
        r1 = LOG_TAG;	 Catch:{ all -> 0x0061 }
        r0 = "Detected a new ANR before the end of the previous one";
        X.AnonymousClass0Dc.m1253P(r1, r0);	 Catch:{ all -> 0x0061 }
        if (r2 == 0) goto L_0x003d;
    L_0x002d:
        r0 = r5.mCurrentAnrStack;	 Catch:{ all -> 0x0061 }
        r0 = r2.equals(r0);	 Catch:{ all -> 0x0061 }
        if (r0 != 0) goto L_0x003d;
    L_0x0035:
        r0 = r5.m1303G();	 Catch:{ all -> 0x0061 }
        r5.postAnrEnd(r0);	 Catch:{ all -> 0x0061 }
        goto L_0x0041;
    L_0x003d:
        r1 = 0;
        goto L_0x0042;
    L_0x003f:
        r5.mInAnr = r0;	 Catch:{ all -> 0x0061 }
    L_0x0041:
        r1 = 1;
    L_0x0042:
        r5.mCurrentAnrStack = r2;	 Catch:{ all -> 0x0061 }
        monitor-exit(r3);	 Catch:{ all -> 0x0061 }
        r3 = r5.mProcessingThreadLock;
        monitor-enter(r3);
        r0 = r5.mProcessingThreadHandler;	 Catch:{ all -> 0x005e }
        if (r0 == 0) goto L_0x005c;
    L_0x004c:
        if (r1 != 0) goto L_0x004f;
    L_0x004e:
        r4 = 1;
    L_0x004f:
        r2 = r5.mProcessingThreadHandler;	 Catch:{ all -> 0x005e }
        r1 = new X.00T;	 Catch:{ all -> 0x005e }
        r1.<init>(r5, r4, r6);	 Catch:{ all -> 0x005e }
        r0 = -906305502; // 0xffffffffc9fae022 float:-2055172.2 double:NaN;
        X.AnonymousClass0OR.m3624D(r2, r1, r0);	 Catch:{ all -> 0x005e }
    L_0x005c:
        monitor-exit(r3);	 Catch:{ all -> 0x005e }
        goto L_0x000d;
    L_0x005e:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x005e }
    L_0x0060:
        throw r0;
    L_0x0061:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0061 }
        goto L_0x0060;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.anr.SigquitBasedANRDetector.anrDetected(java.lang.String):void");
    }

    public static void endAndProcessANRDataCapture(SigquitBasedANRDetector sigquitBasedANRDetector, boolean z) {
        synchronized (sigquitBasedANRDetector.mStateLock) {
            if (sigquitBasedANRDetector.mInAnr) {
                sigquitBasedANRDetector.mInAnr = false;
                sigquitBasedANRDetector.postAnrEnd(z);
                return;
            }
        }
    }

    public static synchronized SigquitBasedANRDetector getInstance(AnonymousClass00H anonymousClass00H) {
        SigquitBasedANRDetector sigquitBasedANRDetector;
        synchronized (SigquitBasedANRDetector.class) {
            if (sInstance == null) {
                sInstance = new SigquitBasedANRDetector(anonymousClass00H);
            }
            sigquitBasedANRDetector = sInstance;
        }
        return sigquitBasedANRDetector;
    }

    public final String getMainThreadStack(String str) {
        Matcher matcher = this.mMainThreadPattern.matcher(str);
        if (matcher.find()) {
            CharSequence group = matcher.group(1);
            if (group != null) {
                String str2 = LOG_TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ANR detected. Main thread: ");
                stringBuilder.append(group);
                AnonymousClass0Dc.m1253P(str2, stringBuilder.toString());
                matcher = this.mStackPattern.matcher(group);
                if (matcher.find()) {
                    return matcher.group();
                }
            }
        }
        return null;
    }

    public final long getReadyTime() {
        long j;
        synchronized (this.mStateLock) {
            j = this.mDetectorReadyTime;
        }
        return j;
    }

    public final long getSwitchTime() {
        long j;
        synchronized (this.mStateLock) {
            j = this.mSwitchTime;
        }
        return j;
    }

    public static void loadNativeLibraryAndHook(SigquitBasedANRDetector sigquitBasedANRDetector, boolean z) {
        synchronized (sigquitBasedANRDetector.mStateLock) {
            if (!sSoLoaded) {
                AnonymousClass0CF.m856E("acra");
                boolean z2 = sigquitBasedANRDetector.f1923B.f26I;
                if (z2) {
                    AnonymousClass0DD anonymousClass0DD = sigquitBasedANRDetector.f1923B.f20C;
                    sigquitBasedANRDetector.f1923B.f20C = new AnonymousClass09w(sigquitBasedANRDetector, anonymousClass0DD);
                }
                init(sigquitBasedANRDetector, sIsArt, VERSION.SDK_INT, z2);
                sSoLoaded = true;
            }
            if (startDetector()) {
                sigquitBasedANRDetector.mHookInPlace = true;
                if (sigquitBasedANRDetector.mNativeLibListener != null) {
                    AnonymousClass0Dj anonymousClass0Dj = sigquitBasedANRDetector.mNativeLibListener;
                    synchronized (anonymousClass0Dj) {
                        if (anonymousClass0Dj.f1911B != null) {
                            anonymousClass0Dj.f1911B.stop(anonymousClass0Dj);
                        }
                    }
                }
                sigquitBasedANRDetector.mNativeLibListener = null;
                if (z) {
                    sigquitBasedANRDetector.start();
                }
            } else {
                sigquitBasedANRDetector.stopHandlerThread();
            }
        }
    }

    private void postAnrEnd(boolean z) {
        synchronized (this.mProcessingThreadLock) {
            if (this.mProcessingThreadHandler != null) {
                AnonymousClass0OR.m3624D(this.mProcessingThreadHandler, new AnonymousClass00S(this, z), 1617637232);
            }
        }
    }

    public static void processANRData(SigquitBasedANRDetector sigquitBasedANRDetector, String str) {
        boolean G = sigquitBasedANRDetector.m1303G();
        if (G) {
            try {
                AnonymousClass0Dm.m1296E(sigquitBasedANRDetector, null, str);
            } catch (Throwable e) {
                AnonymousClass0Dc.m1246I(LOG_TAG, e, "Error saving ANR report", new Object[0]);
            }
        }
        AnonymousClass0OR.m3624D(sigquitBasedANRDetector.f1923B.f24G, new AnonymousClass00U(sigquitBasedANRDetector, G), 1502968625);
    }

    public final void safeToLoadNativeLibraries(AnonymousClass0Dj anonymousClass0Dj) {
        synchronized (this.mStateLock) {
            this.mNativeLibListener = anonymousClass0Dj;
            safeToLoadNativeLibraries(false);
        }
    }

    public final void safeToLoadNativeLibraries(boolean z) {
        synchronized (this.mStateLock) {
            if (!this.mHookInPlace) {
                synchronized (this.mProcessingThreadLock) {
                    if (this.mProcessingThread == null) {
                        this.mProcessingThread = new HandlerThread("SigquitBasedANRDetectorThread");
                        this.mProcessingThread.start();
                        this.mProcessingThreadHandler = new Handler(this.mProcessingThread.getLooper());
                    }
                    AnonymousClass0OR.m3624D(this.mProcessingThreadHandler, new AnonymousClass1Ke(this, z), 643125081);
                }
            }
        }
    }

    public final void setReadyTime(long j) {
        synchronized (this.mStateLock) {
            this.mDetectorReadyTime = j;
        }
    }

    public final void setSwitchTime(long j) {
        synchronized (this.mStateLock) {
            this.mSwitchTime = j;
        }
    }

    public final void start(long j) {
        synchronized (this.mStateLock) {
            if (this.f1926E <= 0) {
                this.f1926E = j;
            }
            if (this.mHookInPlace && !this.mRunning) {
                if (this.f1926E == -1) {
                    this.f1926E = SystemClock.uptimeMillis();
                }
                this.mRunning = true;
            }
        }
    }

    public final void stop(AnonymousClass0Dj anonymousClass0Dj) {
        synchronized (this.mStateLock) {
            if (this.mHookInPlace) {
                stopDetector();
                this.mRunning = false;
                stopHandlerThread();
            }
        }
        if (anonymousClass0Dj != null) {
            anonymousClass0Dj.m1291A();
        }
    }

    private void stopHandlerThread() {
        synchronized (this.mProcessingThreadLock) {
            this.mProcessingThreadHandler = null;
            if (this.mProcessingThread != null) {
                this.mProcessingThread.quit();
                this.mProcessingThread = null;
            }
        }
    }
}
