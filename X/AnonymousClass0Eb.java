package X;

import android.os.Process;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.quicklog.PerformanceLoggingEvent;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Eb */
public class AnonymousClass0Eb implements QuickPerformanceLogger {
    /* renamed from: T */
    public static final String f1982T = "QuickPerformanceLoggerImpl";
    /* renamed from: U */
    public static volatile int[] f1983U;
    /* renamed from: B */
    public final AnonymousClass0KC f1984B;
    /* renamed from: C */
    public final AnonymousClass0K3[] f1985C;
    /* renamed from: D */
    public final Random f1986D;
    /* renamed from: E */
    private AnonymousClass0G4 f1987E;
    /* renamed from: F */
    private final SparseIntArray f1988F = new SparseIntArray();
    /* renamed from: G */
    private AnonymousClass0K0 f1989G;
    /* renamed from: H */
    private final AnonymousClass0K2 f1990H;
    /* renamed from: I */
    private final AnonymousClass0K5 f1991I;
    /* renamed from: J */
    private AnonymousClass0K7 f1992J;
    /* renamed from: K */
    private AnonymousClass0K7 f1993K;
    /* renamed from: L */
    private final AnonymousClass1wU f1994L;
    /* renamed from: M */
    private final AnonymousClass0K8 f1995M;
    /* renamed from: N */
    private final AnonymousClass0Jx f1996N;
    /* renamed from: O */
    private AnonymousClass0C9 f1997O;
    /* renamed from: P */
    private AnonymousClass0Jy f1998P;
    /* renamed from: Q */
    private AnonymousClass0Jw f1999Q;
    /* renamed from: R */
    private AnonymousClass0G4 f2000R;
    /* renamed from: S */
    private final AnonymousClass0K6 f2001S = new AnonymousClass0K6();
    public final AnonymousClass0K4[] mDataProviders;
    public final AnonymousClass1wT[] mEventDecorators;

    /* renamed from: O */
    private static boolean m1420O(long j) {
        return j == -1;
    }

    public AnonymousClass0Eb(AnonymousClass0G4 anonymousClass0G4, AnonymousClass0Jw anonymousClass0Jw, AnonymousClass0Jx anonymousClass0Jx, AnonymousClass0G4 anonymousClass0G42, AnonymousClass0C9 anonymousClass0C9, AnonymousClass0Jy anonymousClass0Jy, AnonymousClass0Jz anonymousClass0Jz, AnonymousClass0K0 anonymousClass0K0, AnonymousClass0K1 anonymousClass0K1, AnonymousClass0K2 anonymousClass0K2, AnonymousClass0EX[] anonymousClass0EXArr, AnonymousClass0K3[] anonymousClass0K3Arr, AnonymousClass0K4[] anonymousClass0K4Arr, AnonymousClass1wT[] anonymousClass1wTArr, AnonymousClass0K5 anonymousClass0K5) {
        AnonymousClass0K7 anonymousClass0K7 = AnonymousClass0K7.UNSET;
        this.f1992J = anonymousClass0K7;
        this.f1993K = anonymousClass0K7;
        this.f1986D = new Random();
        this.f1995M = new AnonymousClass0K8(this);
        this.f1987E = anonymousClass0G4;
        this.f1999Q = anonymousClass0Jw;
        this.f1996N = anonymousClass0Jx;
        this.f2000R = anonymousClass0G42;
        this.f1997O = anonymousClass0C9;
        this.f1998P = anonymousClass0Jy;
        AnonymousClass0K0 anonymousClass0K02 = anonymousClass0K0;
        this.f1989G = anonymousClass0K02;
        this.f1990H = anonymousClass0K2;
        AnonymousClass0K4[] anonymousClass0K4Arr2 = anonymousClass0K4Arr;
        this.mDataProviders = anonymousClass0K4Arr2;
        this.mEventDecorators = anonymousClass1wTArr;
        AnonymousClass0K5 anonymousClass0K52 = anonymousClass0K5;
        this.f1991I = anonymousClass0K52;
        this.f1985C = anonymousClass0K3Arr;
        AnonymousClass0EX[] anonymousClass0EXArr2 = anonymousClass0EXArr;
        this.f1984B = new AnonymousClass0KC(anonymousClass0K02, this.f2000R, new AnonymousClass0K9(this), new AnonymousClass0KB(this), anonymousClass0EXArr2, anonymousClass0K4Arr2, anonymousClass0K52);
        this.f1994L = new AnonymousClass1wU(anonymousClass0EXArr2);
    }

    /* renamed from: A */
    public final long m1427A(long j) {
        return j == -1 ? this.f1997O.now() : j;
    }

    /* renamed from: B */
    public final long m1428B(int i, int i2) {
        if (AnonymousClass0Eb.m1425T(i, this.f1991I)) {
            return 0;
        }
        return this.f1984B.m2772H(i, i2);
    }

    /* renamed from: C */
    public static void m1408C(AnonymousClass0Eb anonymousClass0Eb, String str, int i) {
        AnonymousClass0Eb.m1417L(anonymousClass0Eb, str, i, null, null);
    }

    /* renamed from: C */
    public final boolean m1429C(int i) {
        if (AnonymousClass0Eb.m1424S(i, this.f1991I)) {
            return AnonymousClass0Eb.m1419N(this.f1991I);
        }
        return AnonymousClass0KC.m2770F(this.f1984B, AnonymousClass0KC.m2772H(i, 0));
    }

    /* renamed from: D */
    public static X.AnonymousClass0KD m1409D(X.AnonymousClass0Eb r8, X.AnonymousClass0KD r9, boolean r10) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        if (r9 != 0) goto L_0x0017;
    L_0x0002:
        if (r10 == 0) goto L_0x0015;
    L_0x0004:
        r0 = r8.f1991I;
        if (r0 == 0) goto L_0x000f;
    L_0x0008:
        r0 = r0.shouldUseDataProvidersInsteadOfPerfStats();
        if (r0 == 0) goto L_0x000f;
    L_0x000e:
        goto L_0x0015;
    L_0x000f:
        r9 = new X.0KD;
        r9.<init>();
        goto L_0x0017;
    L_0x0015:
        r0 = 0;
        return r0;
    L_0x0017:
        r0 = r9.f2976E;
        if (r0 != 0) goto L_0x009b;
    L_0x001b:
        r0 = android.os.Process.myTid();
        r9.f2988Q = r0;
        r0 = android.os.Process.getThreadPriority(r0);
        r9.f2981J = r0;
        r0 = X.AnonymousClass0KD.f2972T;
        if (r0 == 0) goto L_0x0042;
    L_0x002b:
        r0 = "unknown";
        r2 = android.os.Build.VERSION.SDK_INT;
        r1 = 21;
        if (r2 < r1) goto L_0x0040;
    L_0x0033:
        r1 = X.AnonymousClass0KD.f2972T;	 Catch:{ SecurityException -> 0x0040 }
        r1 = r1.isPowerSaveMode();	 Catch:{ SecurityException -> 0x0040 }
        if (r1 == 0) goto L_0x003e;	 Catch:{ SecurityException -> 0x0040 }
    L_0x003b:
        r0 = "true";	 Catch:{ SecurityException -> 0x0040 }
        goto L_0x0040;	 Catch:{ SecurityException -> 0x0040 }
    L_0x003e:
        r0 = "false";	 Catch:{ SecurityException -> 0x0040 }
    L_0x0040:
        r9.f2977F = r0;
    L_0x0042:
        r0 = android.os.Process.getElapsedCpuTime();
        r9.f2983L = r0;
        r0 = android.os.SystemClock.currentThreadTimeMillis();
        r9.f2986O = r0;
        r0 = "/proc/self/stat";
        r3 = X.AnonymousClass0KE.m2798B(r0);
        r2 = 0;
        r0 = r3[r2];
        r9.f2985N = r0;
        r0 = 2;
        r0 = r3[r0];
        r9.f2984M = r0;
        r0 = X.AnonymousClass0KE.m2799C();
        r9.f2987P = r0;
        r3 = X.AnonymousClass0KG.m2803B();
        r0 = r3.f2993B;
        r9.f2973B = r0;
        r0 = r3.f2994C;
        r9.f2979H = r0;
        r0 = r3.f2995D;
        r9.f2980I = r0;
        r0 = com.facebook.common.dextricks.stats.ClassLoadingStats.m2804B();
        r3 = new com.facebook.common.dextricks.stats.ClassLoadingStats$SnapshotStats;
        r4 = r0.getClassLoadsAttempted();
        r5 = r0.getClassLoadsFailed();
        r6 = r0.getDexFileQueries();
        r7 = r0.getLocatorAssistedClassLoads();
        r8 = r0.getIncorrectDfaGuesses();
        r3.<init>(r4, r5, r6, r7, r8);
        r9.f2974C = r3;
        r0 = 1;
        r9.f2976E = r0;
        r9.f2975D = r2;
        r0 = -1;
        r9.f2982K = r0;
    L_0x009b:
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0Eb.D(X.0Eb, X.0KD, boolean):X.0KD");
    }

    /* renamed from: D */
    public final boolean m1430D(int i, int i2) {
        if (AnonymousClass0Eb.m1424S(i, this.f1991I)) {
            return AnonymousClass0Eb.m1419N(this.f1991I);
        }
        return AnonymousClass0KC.m2770F(this.f1984B, AnonymousClass0KC.m2772H(i, i2));
    }

    /* renamed from: E */
    public static void m1410E(AnonymousClass0Eb anonymousClass0Eb, PerformanceLoggingEvent performanceLoggingEvent) {
        if (performanceLoggingEvent.f3006C) {
            AnonymousClass0K7 A = anonymousClass0Eb.f1989G.m2759A();
            if (A == AnonymousClass0K7.YES) {
                PerformanceLoggingEvent.f3002a.m2813C(performanceLoggingEvent);
                return;
            } else if (A == AnonymousClass0K7.UNSET) {
                AnonymousClass0KK anonymousClass0KK = new AnonymousClass0KK(anonymousClass0Eb, performanceLoggingEvent);
                PerformanceLoggingEvent.f3002a.m2813C(performanceLoggingEvent);
                return;
            }
        }
        if (anonymousClass0Eb.f2001S.m2761A(performanceLoggingEvent.getEventId())) {
            PerformanceLoggingEvent.f3002a.m2813C(performanceLoggingEvent);
        } else {
            AnonymousClass0KR anonymousClass0KR = (AnonymousClass0KR) anonymousClass0Eb.f1987E.get();
            performanceLoggingEvent.f3012I = anonymousClass0Eb.f1990H;
            if (anonymousClass0Eb.m1431E()) {
                String str;
                String legacyMarkerName;
                StringBuilder stringBuilder = new StringBuilder();
                if (performanceLoggingEvent.getLegacyMarkerName() != null) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(" ID=");
                    stringBuilder2.append(AnonymousClass0KL.m2814B(performanceLoggingEvent.f3028Y));
                    stringBuilder.append(stringBuilder2.toString());
                }
                if (performanceLoggingEvent.f3023T != null) {
                    performanceLoggingEvent.f3023T.m2816A(new AnonymousClass0KN(anonymousClass0Eb, stringBuilder));
                    stringBuilder.append(' ');
                }
                if (!performanceLoggingEvent.f3013J.isEmpty()) {
                    str = null;
                    int i = 0;
                    for (String str2 : performanceLoggingEvent.f3013J) {
                        i++;
                        if (i % 2 == 0) {
                            stringBuilder.append(", ");
                            stringBuilder.append(str);
                            stringBuilder.append("=");
                            stringBuilder.append(str2);
                        } else {
                            str = str2;
                        }
                    }
                }
                if (!performanceLoggingEvent.f3027X.isEmpty()) {
                    stringBuilder.append(" ");
                    stringBuilder.append(performanceLoggingEvent.m2807B());
                }
                if (performanceLoggingEvent.f3019P != null) {
                    stringBuilder.append(" metadata=");
                    AnonymousClass1wW anonymousClass1wW = performanceLoggingEvent.f3019P;
                    Map hashMap = new HashMap();
                    anonymousClass1wW.A(new AnonymousClass2S2(anonymousClass1wW, hashMap));
                    stringBuilder.append(hashMap);
                }
                String str3 = f1982T;
                str = "QPLSent - %s %s %d[ms] %s (1:%d) %s";
                Object[] objArr = new Object[6];
                if (performanceLoggingEvent.getLegacyMarkerName() != null) {
                    legacyMarkerName = performanceLoggingEvent.getLegacyMarkerName();
                } else {
                    legacyMarkerName = AnonymousClass0KL.m2814B(performanceLoggingEvent.f3028Y);
                }
                objArr[0] = legacyMarkerName;
                objArr[1] = AnonymousClass0KP.m2818B(performanceLoggingEvent.f3005B);
                objArr[2] = Integer.valueOf(performanceLoggingEvent.f3009F);
                objArr[3] = AnonymousClass0KQ.m2820C(performanceLoggingEvent.f3017N, performanceLoggingEvent.f3016M);
                objArr[4] = Integer.valueOf(performanceLoggingEvent.f3026W);
                objArr[5] = stringBuilder.toString();
                AnonymousClass0Dc.m1255R(str3, str, objArr);
            }
            performanceLoggingEvent.run();
        }
    }

    /* renamed from: E */
    public final boolean m1431E() {
        if (this.f1992J == AnonymousClass0K7.UNSET) {
            AnonymousClass0K7 anonymousClass0K7;
            if (!AnonymousClass0KS.f3047B) {
                if (!AnonymousClass0CB.m834D()) {
                    anonymousClass0K7 = AnonymousClass0K7.NO;
                    this.f1992J = anonymousClass0K7;
                }
            }
            anonymousClass0K7 = AnonymousClass0K7.YES;
            this.f1992J = anonymousClass0K7;
        }
        return this.f1992J.m2764A(false);
    }

    /* renamed from: F */
    public static final long m1411F() {
        return (long) Process.myTid();
    }

    /* renamed from: F */
    public final boolean m1432F() {
        if (this.f1993K == AnonymousClass0K7.UNSET) {
            this.f1993K = AnonymousClass0K7.NO;
        }
        return this.f1993K.m2764A(false);
    }

    /* renamed from: G */
    public static String m1412G(int i) {
        return StringFormatUtil.formatStrLocaleSafe(AnonymousClass0KL.m2814B(i));
    }

    /* renamed from: G */
    public final void m1433G(int i, int i2, String str, boolean z) {
        m1442P(i, i2, str, z, AnonymousClass0Eb.m1411F());
    }

    /* renamed from: H */
    public static long m1413H(long j) {
        return TimeUnit.MILLISECONDS.toNanos(j);
    }

    /* renamed from: H */
    public final void m1434H(int i, int i2, String str, String[] strArr) {
        m1443Q(i, i2, str, strArr, AnonymousClass0Eb.m1411F());
    }

    /* renamed from: I */
    public final void m1435I(int i, String str, double d) {
        m1438L(i, 0, str, d, AnonymousClass0Eb.m1411F());
    }

    /* renamed from: I */
    public static boolean m1414I(int r6, X.AnonymousClass0K5 r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r0 = f1983U;
        r5 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0005:
        r2 = f1983U;
        goto L_0x003b;
    L_0x0008:
        r4 = X.AnonymousClass0Eb.class;
        monitor-enter(r4);
        r0 = f1983U;	 Catch:{ all -> 0x0043 }
        if (r0 == 0) goto L_0x0012;	 Catch:{ all -> 0x0043 }
    L_0x000f:
        r2 = f1983U;	 Catch:{ all -> 0x0043 }
        goto L_0x003a;	 Catch:{ all -> 0x0043 }
    L_0x0012:
        r1 = r7.perfExperimentMarkersWhitelist();	 Catch:{ all -> 0x0043 }
        if (r1 != 0) goto L_0x001d;	 Catch:{ all -> 0x0043 }
    L_0x0018:
        r2 = new int[r5];	 Catch:{ all -> 0x0043 }
        f1983U = r2;	 Catch:{ all -> 0x0043 }
        goto L_0x003a;	 Catch:{ all -> 0x0043 }
    L_0x001d:
        r0 = ",";	 Catch:{ all -> 0x0043 }
        r3 = r1.split(r0);	 Catch:{ all -> 0x0043 }
        r0 = r3.length;	 Catch:{ all -> 0x0043 }
        r2 = new int[r0];	 Catch:{ all -> 0x0043 }
        r1 = 0;	 Catch:{ all -> 0x0043 }
    L_0x0027:
        r0 = r2.length;	 Catch:{ all -> 0x0043 }
        if (r1 >= r0) goto L_0x0035;	 Catch:{ all -> 0x0043 }
    L_0x002a:
        r0 = r3[r1];	 Catch:{ NumberFormatException -> 0x0032 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x0032 }
        r2[r1] = r0;	 Catch:{ NumberFormatException -> 0x0032 }
    L_0x0032:
        r1 = r1 + 1;
        goto L_0x0027;
    L_0x0035:
        java.util.Arrays.sort(r2);	 Catch:{ all -> 0x0043 }
        f1983U = r2;	 Catch:{ all -> 0x0043 }
    L_0x003a:
        monitor-exit(r4);	 Catch:{ all -> 0x0043 }
    L_0x003b:
        r0 = java.util.Arrays.binarySearch(r2, r6);
        if (r0 < 0) goto L_0x0042;
    L_0x0041:
        r5 = 1;
    L_0x0042:
        return r5;
    L_0x0043:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0043 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0Eb.I(int, X.0K5):boolean");
    }

    /* renamed from: J */
    public final void m1436J(int i, String str, String str2) {
        m1441O(i, 0, str, str2, AnonymousClass0Eb.m1411F());
    }

    /* renamed from: J */
    public static boolean m1415J(AnonymousClass0Eb anonymousClass0Eb) {
        return (anonymousClass0Eb.m1431E() == null || AnonymousClass0Dc.m1247J(3) == null) ? null : true;
    }

    /* renamed from: K */
    private int m1416K(int i, AnonymousClass0EW anonymousClass0EW, boolean z) {
        boolean z2 = true;
        if (z) {
            if (anonymousClass0EW != null) {
                z2 = false;
            }
            return AnonymousClass0Eb.m1418M(this, i, z2);
        }
        int A = anonymousClass0EW.m1401A(i);
        if (A == 0 || !AnonymousClass0Eb.m1426U(this.f1991I)) {
            return this.f1999Q.m2757A(A);
        }
        return 1;
    }

    /* renamed from: K */
    public final void m1437K(int i, String str, boolean z) {
        m1442P(i, 0, str, z, AnonymousClass0Eb.m1411F());
    }

    /* renamed from: L */
    public final void m1438L(int i, int i2, String str, double d, long j) {
        int i3 = i;
        if (!AnonymousClass0Eb.m1425T(i, this.f1991I)) {
            this.f1984B.m2783A(i3, i2, str, d, j);
        }
    }

    /* renamed from: L */
    private static void m1417L(AnonymousClass0Eb anonymousClass0Eb, String str, int i, String str2, String str3) {
        if (AnonymousClass0Eb.m1415J(anonymousClass0Eb)) {
            anonymousClass0Eb = new Object[6];
            anonymousClass0Eb[0] = str;
            anonymousClass0Eb[1] = AnonymousClass0KL.m2814B(i);
            anonymousClass0Eb[2] = Integer.valueOf(i);
            if (str2 == null) {
                str2 = JsonProperty.USE_DEFAULT_NAME;
            }
            anonymousClass0Eb[3] = str2;
            anonymousClass0Eb[4] = str3 == null ? JsonProperty.USE_DEFAULT_NAME : ":";
            if (str3 == null) {
                str3 = JsonProperty.USE_DEFAULT_NAME;
            }
            anonymousClass0Eb[5] = str3;
        }
    }

    /* renamed from: M */
    private static int m1418M(AnonymousClass0Eb anonymousClass0Eb, int i, boolean z) {
        if (!AnonymousClass0KS.f3047B) {
            if (!anonymousClass0Eb.m1411F()) {
                int i2;
                synchronized (anonymousClass0Eb.f1988F) {
                    i2 = anonymousClass0Eb.f1988F.get(i, com.facebook.forker.Process.WAIT_RESULT_TIMEOUT);
                }
                if (i2 != com.facebook.forker.Process.WAIT_RESULT_TIMEOUT) {
                    return anonymousClass0Eb.f1999Q.m2757A(i2);
                }
                if (z) {
                    if (!AnonymousClass0Eb.m1426U(anonymousClass0Eb.f1991I)) {
                        return anonymousClass0Eb.f1999Q.m2757A(100);
                    }
                }
            }
        }
        return 1;
    }

    /* renamed from: M */
    public final void m1439M(int i, int i2, String str, int i3, long j) {
        int i4 = i;
        if (!AnonymousClass0Eb.m1425T(i, this.f1991I)) {
            this.f1984B.m2784B(i4, i2, str, i3, j);
        }
    }

    /* renamed from: N */
    public final void m1440N(int i, int i2, String str, long j, long j2) {
        int i3 = i;
        if (!AnonymousClass0Eb.m1425T(i, this.f1991I)) {
            this.f1984B.m2785C(i3, i2, str, j, j2);
        }
    }

    /* renamed from: N */
    private static boolean m1419N(AnonymousClass0K5 anonymousClass0K5) {
        if (anonymousClass0K5 != null) {
            return anonymousClass0K5.perfExperimentIsMarkerOnValue();
        }
        throw new IllegalStateException("We should never get faked value when not in experiment. Having GKs as null means we are not in experiment");
    }

    /* renamed from: O */
    public final void m1441O(int i, int i2, String str, String str2, long j) {
        int i3 = i;
        if (!AnonymousClass0Eb.m1425T(i, this.f1991I)) {
            this.f1984B.m2786D(i3, i2, str, str2, j);
        }
    }

    /* renamed from: P */
    public final void m1442P(int i, int i2, String str, boolean z, long j) {
        int i3 = i;
        if (!AnonymousClass0Eb.m1425T(i, this.f1991I)) {
            this.f1984B.m2787E(i3, i2, str, z, j);
        }
    }

    /* renamed from: P */
    private void m1421P(int i, short s, String str, int i2, boolean z, Map map) {
        AnonymousClass0Eb anonymousClass0Eb = this;
        int i3 = i;
        if (!AnonymousClass0Eb.m1425T(i, this.f1991I)) {
            AnonymousClass0KI h = m1460h(i3, 0, -1, true, false, false, true, AnonymousClass0Eb.m1411F());
            if (z) {
                AnonymousClass0KU anonymousClass0KU = (AnonymousClass0KU) anonymousClass0Eb.f2000R.get();
            }
            if (h != null) {
                if (map != null) {
                    for (Entry entry : map.entrySet()) {
                        h.m2824B((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                PerformanceLoggingEvent performanceLoggingEvent = (PerformanceLoggingEvent) PerformanceLoggingEvent.f3002a.m2811A();
                int i4 = i2;
                performanceLoggingEvent.f3009F = i4;
                performanceLoggingEvent.m2806A(h.f3053F, h.f3054G);
                performanceLoggingEvent.m2809D(2);
                performanceLoggingEvent.f3028Y = i3;
                performanceLoggingEvent.f3005B = s;
                anonymousClass0Eb.f1998P.now();
                performanceLoggingEvent.f3020Q = anonymousClass0Eb.f1997O.now();
                performanceLoggingEvent.f3015L = h.f3075b;
                performanceLoggingEvent.f3026W = h.f3070W;
                performanceLoggingEvent.f3011H = h.f3052E;
                performanceLoggingEvent.f3016M = h.f3059L;
                performanceLoggingEvent.f3017N = h.f3060M;
                performanceLoggingEvent.f3024U = (short) 1;
                performanceLoggingEvent.f3010G = i4;
                performanceLoggingEvent.f3018O = str;
                AnonymousClass0KT.f3048d.m2813C(h);
                m1423R(performanceLoggingEvent);
            }
        }
    }

    /* renamed from: Q */
    public final void m1443Q(int i, int i2, String str, String[] strArr, long j) {
        int i3 = i;
        if (!AnonymousClass0Eb.m1425T(i, this.f1991I)) {
            this.f1984B.m2788F(i3, i2, str, strArr, j);
        }
    }

    /* renamed from: Q */
    private boolean m1422Q(int i, int i2, long j, boolean z, boolean z2, AnonymousClass0KD anonymousClass0KD, SparseArray sparseArray, AnonymousClass0K7 anonymousClass0K7, long j2) {
        AnonymousClass0Eb anonymousClass0Eb = this;
        int i3 = i;
        int i4 = i2;
        if (m1430D(i, i2)) {
            long j3 = j;
            if (this.f1984B.m2792J(i3, i4, j3, z, this.f1998P.now(), AnonymousClass0Eb.m1409D(anonymousClass0Eb, anonymousClass0KD, (this.f1996N.mo693A(i) & 112) != 0), sparseArray, anonymousClass0K7, z2, j2)) {
                if (AnonymousClass0CM.m897N(4)) {
                    AnonymousClass0CM.m891H(4, AnonymousClass0Eb.m1412G(i3), AnonymousClass0KC.m2772H(i3, i4));
                    AnonymousClass0CM.m886C(4, AnonymousClass0Eb.m1412G(i3), AnonymousClass0KC.m2772H(i3, i4), AnonymousClass0Eb.m1413H(j3));
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: R */
    public final void m1444R(int i) {
        m1445S(i, 0);
    }

    /* renamed from: R */
    private void m1423R(PerformanceLoggingEvent performanceLoggingEvent) {
        new AnonymousClass0KV(this, performanceLoggingEvent).run();
    }

    /* renamed from: S */
    public final void m1445S(int i, int i2) {
        m1446T(i, i2, AnonymousClass0Eb.m1411F(), currentMonotonicTimestamp());
    }

    /* renamed from: S */
    private static boolean m1424S(int i, AnonymousClass0K5 anonymousClass0K5) {
        if (anonymousClass0K5 != null) {
            if (anonymousClass0K5.perfExperimentShouldFakeIsMarkerOn()) {
                if (!AnonymousClass0Eb.m1414I(i, anonymousClass0K5)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: T */
    public final void m1446T(int i, int i2, long j, long j2) {
        if (!AnonymousClass0Eb.m1425T(i, this.f1991I)) {
            AnonymousClass0KC anonymousClass0KC = this.f1984B;
            AnonymousClass0K8 anonymousClass0K8 = this.f1995M;
            synchronized (anonymousClass0KC.f2959B) {
                AnonymousClass0KI P = AnonymousClass0KC.m2780P(anonymousClass0KC, AnonymousClass0KC.m2772H(i, i2));
                if (P != null) {
                    if (P.f3050C != null) {
                        AnonymousClass0KC.m2776L(anonymousClass0KC, P.f3050C, P.f3052E);
                    }
                    P.f3073Z = j;
                    P.f3062O = j2;
                    AnonymousClass0Eb.m1408C(anonymousClass0K8.f2958B, "markerDropped", i);
                    if (AnonymousClass0CM.m897N(4)) {
                        AnonymousClass0CM.m891H(4, AnonymousClass0Eb.m1412G(i), AnonymousClass0KC.m2772H(i, i2));
                    }
                    if (anonymousClass0KC.f2961D != null && AnonymousClass0KC.m2773I(anonymousClass0KC, P.getMarkerId())) {
                        for (AnonymousClass0EX rq : anonymousClass0KC.f2961D) {
                            rq.rq(P);
                        }
                    }
                    AnonymousClass0KT.f3048d.m2813C(P);
                }
            }
        }
    }

    /* renamed from: T */
    private static boolean m1425T(int i, AnonymousClass0K5 anonymousClass0K5) {
        if (anonymousClass0K5 != null) {
            if (anonymousClass0K5.perfExperimentShouldSendNone()) {
                if (!AnonymousClass0Eb.m1414I(i, anonymousClass0K5)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: U */
    public final void m1447U(int i, int i2, short s, long j, AnonymousClass0K7 anonymousClass0K7) {
        m1448V(i, i2, s, j, anonymousClass0K7, null, null, AnonymousClass0Eb.m1411F());
    }

    /* renamed from: U */
    private static boolean m1426U(AnonymousClass0K5 anonymousClass0K5) {
        return (anonymousClass0K5 == null || anonymousClass0K5.perfExperimentShouldSendAll() == null) ? null : true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: V */
    public final void m1448V(int r20, int r21, short r22, long r23, X.AnonymousClass0K7 r25, java.lang.String r26, android.util.SparseArray r27, long r28) {
        /*
        r19 = this;
        r8 = r19;
        r0 = r8.f1991I;
        r3 = r20;
        r0 = X.AnonymousClass0Eb.m1425T(r3, r0);
        if (r0 == 0) goto L_0x000d;
    L_0x000c:
        return;
    L_0x000d:
        r0 = r23;
        r11 = X.AnonymousClass0Eb.m1420O(r0);
        r18 = r8.m1427A(r0);
        r4 = r8.f1994L;
        r15 = r21;
        r0 = 2;
        X.AnonymousClass1wU.B(r4, r3, r15, r0);
        r9 = r8.f1984B;
        r24 = r22;
        r13 = r25;
        r1 = r26;
        r0 = X.AnonymousClass0KC.m2772H(r3, r15);
        r14 = r9.f2959B;
        monitor-enter(r14);
        r7 = X.AnonymousClass0KC.m2780P(r9, r0);	 Catch:{ all -> 0x0161 }
        r4 = 0;
        if (r7 == 0) goto L_0x0085;
    L_0x0035:
        r12 = r7.f3050C;	 Catch:{ all -> 0x0161 }
        X.AnonymousClass0KC.m2780P(r9, r0);	 Catch:{ all -> 0x0161 }
        r5 = r7.f3052E;	 Catch:{ all -> 0x0161 }
        r0 = r7.f3057J;	 Catch:{ all -> 0x0161 }
        if (r26 == 0) goto L_0x0081;
    L_0x0040:
        if (r0 != 0) goto L_0x0045;
    L_0x0042:
        r16 = -1;
        goto L_0x0049;
    L_0x0045:
        r16 = r0.m2817B(r1);	 Catch:{ all -> 0x0161 }
    L_0x0049:
        if (r16 < 0) goto L_0x0058;
    L_0x004b:
        r1 = r0.f3043G;	 Catch:{ all -> 0x0161 }
        r10 = r1[r16];	 Catch:{ all -> 0x0161 }
        r1 = r7.f3065R;	 Catch:{ all -> 0x0161 }
        r0 = r0.f3044H;	 Catch:{ all -> 0x0161 }
        r16 = r0[r16];	 Catch:{ all -> 0x0161 }
        r1 = r1 + r16;
        goto L_0x008b;
    L_0x0058:
        r5 = new X.1wX;	 Catch:{ all -> 0x0161 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0161 }
        r3.<init>();	 Catch:{ all -> 0x0161 }
        r2 = "Point ";
        r3.append(r2);	 Catch:{ all -> 0x0161 }
        r3.append(r1);	 Catch:{ all -> 0x0161 }
        r1 = " is not found. You should endOnPoint only when point been reported";
        r3.append(r1);	 Catch:{ all -> 0x0161 }
        r3 = r3.toString();	 Catch:{ all -> 0x0161 }
        if (r0 != 0) goto L_0x0073;
    L_0x0072:
        goto L_0x007d;
    L_0x0073:
        r2 = r0.f3041E;	 Catch:{ all -> 0x0161 }
        r4 = new java.lang.String[r2];	 Catch:{ all -> 0x0161 }
        r1 = r0.f3042F;	 Catch:{ all -> 0x0161 }
        r0 = 0;
        java.lang.System.arraycopy(r1, r0, r4, r0, r2);	 Catch:{ all -> 0x0161 }
    L_0x007d:
        r5.<init>(r3, r4);	 Catch:{ all -> 0x0161 }
        throw r5;	 Catch:{ all -> 0x0161 }
    L_0x0081:
        r1 = r18;
        r10 = r4;
        goto L_0x008b;
    L_0x0085:
        r5 = 0;
        r1 = r18;
        r10 = r4;
        r12 = r4;
    L_0x008b:
        monitor-exit(r14);	 Catch:{ all -> 0x0161 }
        if (r10 != 0) goto L_0x0092;
    L_0x008e:
        r10 = X.AnonymousClass0KC.m2769E(r9, r5);
    L_0x0092:
        X.AnonymousClass0KC.m2776L(r9, r12, r5);
        r0 = r9.f2959B;
        monitor-enter(r0);
        if (r7 == 0) goto L_0x0108;
    L_0x009a:
        r5 = r7.f3071X;	 Catch:{ all -> 0x015e }
        if (r5 == 0) goto L_0x00a6;
    L_0x009e:
        r5 = r9.f2962E;	 Catch:{ all -> 0x015e }
        r5 = r5.get();	 Catch:{ all -> 0x015e }
        r5 = (X.AnonymousClass0KU) r5;	 Catch:{ all -> 0x015e }
    L_0x00a6:
        r7.f3051D = r10;	 Catch:{ all -> 0x015e }
        r5 = r7.f3058K;	 Catch:{ all -> 0x015e }
        if (r5 == 0) goto L_0x00d5;
    L_0x00ac:
        r4 = r7.f3067T;	 Catch:{ all -> 0x015e }
        if (r4 == 0) goto L_0x00b3;
    L_0x00b0:
        r4.m2796A();	 Catch:{ all -> 0x015e }
    L_0x00b3:
        r5 = 0;
        if (r25 == 0) goto L_0x00be;
    L_0x00b6:
        r4 = X.AnonymousClass0K7.UNSET;	 Catch:{ all -> 0x015e }
        if (r13 == r4) goto L_0x00be;
    L_0x00ba:
        r7.m2826D(r13, r5);	 Catch:{ all -> 0x015e }
        goto L_0x00c5;
    L_0x00be:
        r4 = X.AnonymousClass0KC.m2766B(r9);	 Catch:{ all -> 0x015e }
        r7.m2827E(r4, r5);	 Catch:{ all -> 0x015e }
    L_0x00c5:
        r25 = 0;
        r26 = 1;
        r27 = 2;
        r22 = r1;
        r20 = r9;
        r21 = r7;
        r4 = X.AnonymousClass0KC.m2767C(r20, r21, r22, r24, r25, r26, r27);	 Catch:{ all -> 0x015e }
    L_0x00d5:
        r7.f3062O = r1;	 Catch:{ all -> 0x015e }
        r1 = r24;
        r7.f3061N = r1;	 Catch:{ all -> 0x015e }
        r1 = r7.f3076c;	 Catch:{ all -> 0x015e }
        if (r1 == 0) goto L_0x00e0;
    L_0x00df:
        goto L_0x00e1;
    L_0x00e0:
        r11 = 0;
    L_0x00e1:
        r7.f3076c = r11;	 Catch:{ all -> 0x015e }
        r1 = r28;
        r7.f3073Z = r1;	 Catch:{ all -> 0x015e }
        r1 = r9.f2961D;	 Catch:{ all -> 0x015e }
        if (r1 == 0) goto L_0x0103;
    L_0x00eb:
        r1 = r7.getMarkerId();	 Catch:{ all -> 0x015e }
        r1 = X.AnonymousClass0KC.m2773I(r9, r1);	 Catch:{ all -> 0x015e }
        if (r1 == 0) goto L_0x0103;
    L_0x00f5:
        r6 = r9.f2961D;	 Catch:{ all -> 0x015e }
        r5 = r6.length;	 Catch:{ all -> 0x015e }
        r2 = 0;
    L_0x00f9:
        if (r2 >= r5) goto L_0x0103;
    L_0x00fb:
        r1 = r6[r2];	 Catch:{ all -> 0x015e }
        r1.wq(r7);	 Catch:{ all -> 0x015e }
        r2 = r2 + 1;
        goto L_0x00f9;
    L_0x0103:
        r1 = X.AnonymousClass0KT.f3048d;	 Catch:{ all -> 0x015e }
        r1.m2813C(r7);	 Catch:{ all -> 0x015e }
    L_0x0108:
        monitor-exit(r0);	 Catch:{ all -> 0x015e }
        if (r4 == 0) goto L_0x0118;
    L_0x010b:
        r0 = r8.f1989G;
        r0.m2759A();
        r0 = "markerEnd";
        X.AnonymousClass0Eb.m1408C(r8, r0, r3);
        r8.m1423R(r4);
    L_0x0118:
        r0 = 4;
        r2 = X.AnonymousClass0CM.m897N(r0);
        if (r2 == 0) goto L_0x000c;
    L_0x0120:
        r2 = r8.f1984B;
        r2 = r2.m2789G(r3, r15);
        r6 = X.AnonymousClass0Eb.m1412G(r3);
        if (r2 == 0) goto L_0x012d;
    L_0x012c:
        goto L_0x012e;
    L_0x012d:
        r2 = r6;
    L_0x012e:
        r7 = X.AnonymousClass0KC.m2772H(r3, r15);
        r8 = X.AnonymousClass0Eb.m1413H(r18);
        r4 = 4;
        X.AnonymousClass0CM.m894K(r4, r6, r7, r8);
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r4.append(r2);
        r2 = "-";
        r4.append(r2);
        r2 = r24;
        r2 = X.AnonymousClass0KP.m2818B(r2);
        r4.append(r2);
        r4 = r4.toString();
        r2 = X.AnonymousClass0KC.m2772H(r3, r15);
        X.AnonymousClass0CM.m898O(r0, r6, r4, r2);
        goto L_0x000c;
    L_0x015e:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x015e }
    L_0x0160:
        throw r1;
    L_0x0161:
        r1 = move-exception;
        monitor-exit(r14);	 Catch:{ all -> 0x0161 }
        goto L_0x0160;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0Eb.V(int, int, short, long, X.0K7, java.lang.String, android.util.SparseArray, long):void");
    }

    /* renamed from: W */
    public final void m1449W(int i, int i2, short s) {
        m1450X(i, i2, s, -1, AnonymousClass0Eb.m1411F());
    }

    /* renamed from: X */
    public final void m1450X(int i, int i2, short s, long j, long j2) {
        long j3 = j;
        boolean O = AnonymousClass0Eb.m1420O(j3);
        int i3 = i;
        int i4 = i2;
        short s2 = s;
        PerformanceLoggingEvent I = this.f1984B.m2791I(i3, i4, s2, m1427A(j3), O, null, null, j2);
        if (I != null) {
            if (AnonymousClass0Eb.m1415J(this)) {
                AnonymousClass0KL.m2814B(i3);
                Integer.valueOf(i3);
                AnonymousClass0KP.m2818B(s2);
            }
            m1423R(I);
        }
        if (AnonymousClass0CM.m897N(4)) {
            AnonymousClass0CM.m888E(4, AnonymousClass0Eb.m1412G(i3), AnonymousClass0KC.m2772H(i3, i4), AnonymousClass0KP.m2818B(s2));
        }
    }

    /* renamed from: Y */
    public final void m1451Y(int i, int i2, String str) {
        m1452Z(i, i2, str, null, -1);
    }

    /* renamed from: Z */
    public final void m1452Z(int i, int i2, String str, String str2, long j) {
        AnonymousClass0Eb anonymousClass0Eb = this;
        int i3 = i;
        if (!AnonymousClass0Eb.m1425T(i, this.f1991I)) {
            m1456d(i3, i2, str, str2, null, j, 0, AnonymousClass0Eb.m1411F());
        }
    }

    /* renamed from: a */
    public final void m1453a(int i, String str) {
        m1452Z(i, 0, str, null, -1);
    }

    /* renamed from: b */
    public final void m1454b(int i, String str, long j) {
        m1452Z(i, 0, str, null, j);
    }

    /* renamed from: c */
    public final void m1455c(int i, String str, String str2) {
        m1452Z(i, 0, str, str2, -1);
    }

    public final long currentMonotonicTimestamp() {
        return this.f1997O.now();
    }

    /* renamed from: d */
    public final void m1456d(int i, int i2, String str, String str2, SparseArray sparseArray, long j, int i3, long j2) {
        Throwable th;
        int i4 = i;
        if (!AnonymousClass0Eb.m1425T(i4, this.f1991I)) {
            Object obj;
            long j3;
            String str3 = str;
            String str4 = str2;
            AnonymousClass0Eb.m1417L(r3, "markerPoint", i4, str3, str4);
            long j4 = j;
            boolean O = AnonymousClass0Eb.m1420O(j4);
            sparseArray = m1427A(j4);
            AnonymousClass0KC anonymousClass0KC = r3.f1984B;
            boolean z = O ^ 1;
            int i5 = i2;
            int H = AnonymousClass0KC.m2772H(i4, i5);
            synchronized (anonymousClass0KC.f2959B) {
                try {
                    AnonymousClass0KT M = AnonymousClass0KC.m2777M(anonymousClass0KC, H);
                    obj = null;
                    int i6;
                    if (M != null) {
                        M.f3073Z = j2;
                        if (AnonymousClass0KC.m2771G(anonymousClass0KC, M)) {
                            j3 = sparseArray - M.f3065R;
                            j4 = M.f3052E;
                            i6 = M.f3075b;
                            if (j4 != 0) {
                                if (i3 != 0) {
                                    obj = 1;
                                }
                            }
                            M.m2823A(j3, str3, str4, null);
                        } else {
                            j3 = 0;
                            j4 = 0;
                            i6 = 0;
                        }
                        if (anonymousClass0KC.f2961D != null && AnonymousClass0KC.m2773I(anonymousClass0KC, M.getMarkerId())) {
                            for (int i7 : anonymousClass0KC.f2961D) {
                                i7.tq(M, str3, str2, sparseArray, z);
                            }
                        }
                    } else {
                        j4 = 0;
                        i6 = 0;
                        j3 = 0;
                    }
                } catch (Throwable th2) {
                    while (true) {
                        th = th2;
                        break;
                    }
                }
            }
            if (obj != null) {
                SparseArray E = AnonymousClass0KC.m2769E(anonymousClass0KC, j4);
                synchronized (anonymousClass0KC.f2959B) {
                    try {
                        AnonymousClass0KT M2 = AnonymousClass0KC.m2777M(anonymousClass0KC, H);
                        if (M2 != null && M2.f3075b == r5 && AnonymousClass0KC.m2771G(anonymousClass0KC, M2)) {
                            M2.m2823A(j3, str3, str4, E);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
            }
            if (AnonymousClass0CM.m897N(4)) {
                AnonymousClass0CM.m887D(4, AnonymousClass0Eb.m1412G(i4), AnonymousClass0KC.m2772H(i4, i5), AnonymousClass0Eb.m1413H(sparseArray), str3);
            }
        }
    }

    /* renamed from: e */
    public final void m1457e(int i) {
        m1458f(i, 0, -1, null, false, false, null, null, null, true, AnonymousClass0Eb.m1411F());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: f */
    public final void m1458f(int r28, int r29, long r30, java.lang.String r32, boolean r33, boolean r34, X.AnonymousClass0KD r35, android.util.SparseArray r36, X.AnonymousClass0K7 r37, boolean r38, long r39) {
        /*
        r27 = this;
        r12 = r27;
        r0 = r12.f1991I;
        r13 = r28;
        r0 = X.AnonymousClass0Eb.m1425T(r13, r0);
        if (r0 == 0) goto L_0x000d;
    L_0x000c:
        return;
    L_0x000d:
        r0 = r30;
        r5 = X.AnonymousClass0Eb.m1420O(r0);
        r15 = r12.m1427A(r0);
        r1 = r12.f1994L;
        r0 = 1;
        r14 = r29;
        X.AnonymousClass1wU.B(r1, r13, r14, r0);
        r3 = r37;
        r20 = r36;
        r0 = r39;
        r11 = r34;
        r4 = r35;
        r21 = r3;
        r22 = r0;
        r18 = r11;
        r19 = r4;
        r17 = r5;
        r2 = r12.m1422Q(r13, r14, r15, r17, r18, r19, r20, r21, r22);
        if (r2 == 0) goto L_0x003a;
    L_0x0039:
        goto L_0x000c;
    L_0x003a:
        r29 = r38;
        r27 = r33;
        r21 = r12;
        r22 = r13;
        r23 = r14;
        r24 = r15;
        r26 = r5;
        r28 = r11;
        r30 = r0;
        r2 = r21.m1460h(r22, r23, r24, r26, r27, r28, r29, r30);
        r6 = r32;
        if (r2 == 0) goto L_0x00da;
    L_0x0054:
        r0 = "onMarkerStart";
        X.AnonymousClass0Eb.m1408C(r12, r0, r13);
        r2.f3063P = r6;
        r0 = r2.f3052E;
        r5 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r0 = r0 & r5;
        r5 = 0;
        r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1));
        if (r0 == 0) goto L_0x0068;
    L_0x0066:
        r0 = 1;
        goto L_0x0069;
    L_0x0068:
        r0 = 0;
    L_0x0069:
        r0 = X.AnonymousClass0Eb.m1409D(r12, r4, r0);
        r2.f3067T = r0;
        if (r0 == 0) goto L_0x0078;
    L_0x0071:
        r0 = r2.f3052E;
        r4 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r0 = r0 | r4;
        r2.f3052E = r0;
    L_0x0078:
        r5 = r12.f1984B;
        r4 = r20;
        r1 = r2.f3064Q;
        r0 = r2.f3056I;
        r7 = X.AnonymousClass0KC.m2772H(r1, r0);
        if (r36 != 0) goto L_0x008c;
    L_0x0086:
        r0 = r2.f3052E;
        r4 = X.AnonymousClass0KC.m2768D(r5, r0);
    L_0x008c:
        r6 = r5.f2959B;
        monitor-enter(r6);
        r2.f3050C = r4;	 Catch:{ all -> 0x0148 }
        r1 = 0;
        if (r37 == 0) goto L_0x009c;
    L_0x0094:
        r0 = X.AnonymousClass0K7.UNSET;	 Catch:{ all -> 0x0148 }
        if (r3 == r0) goto L_0x009c;
    L_0x0098:
        r2.m2826D(r3, r1);	 Catch:{ all -> 0x0148 }
        goto L_0x00a3;
    L_0x009c:
        r0 = X.AnonymousClass0KC.m2766B(r5);	 Catch:{ all -> 0x0148 }
        r2.m2827E(r0, r1);	 Catch:{ all -> 0x0148 }
    L_0x00a3:
        r4 = X.AnonymousClass0KC.m2778N(r5, r7);	 Catch:{ all -> 0x0148 }
        if (r4 < 0) goto L_0x00b7;
    L_0x00a9:
        r3 = X.AnonymousClass0KC.m2781Q(r5, r4);	 Catch:{ all -> 0x0148 }
        r1 = r5.f2960C;	 Catch:{ all -> 0x0148 }
        monitor-enter(r1);	 Catch:{ all -> 0x0148 }
        r0 = r5.f2960C;	 Catch:{ all -> 0x014b }
        r0.setValueAt(r4, r2);	 Catch:{ all -> 0x014b }
        monitor-exit(r1);	 Catch:{ all -> 0x014b }
        goto L_0x00bb;
    L_0x00b7:
        X.AnonymousClass0KC.m2779O(r5, r7, r2);	 Catch:{ all -> 0x0148 }
        r3 = 0;
    L_0x00bb:
        X.AnonymousClass0KC.m2774J(r5, r2);	 Catch:{ all -> 0x0148 }
        monitor-exit(r6);	 Catch:{ all -> 0x0148 }
        if (r3 == 0) goto L_0x00d9;
    L_0x00c1:
        r0 = 3;
        r0 = X.AnonymousClass0Dc.m1247J(r0);
        if (r0 == 0) goto L_0x00d4;
    L_0x00c8:
        r0 = r3.f3063P;
        if (r0 == 0) goto L_0x00d4;
    L_0x00cc:
        r1 = r3.f3063P;
        r0 = r2.f3063P;
        r0 = r1.equals(r0);
    L_0x00d4:
        r0 = X.AnonymousClass0KT.f3048d;
        r0.m2813C(r3);
    L_0x00d9:
        goto L_0x012d;
    L_0x00da:
        r2 = "markerNotStarted";
        X.AnonymousClass0Eb.m1408C(r12, r2, r13);
        r3 = r12.f1986D;
        r2 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r9 = r3.nextInt(r2);
        r10 = r12.f1984B;
        r8 = X.AnonymousClass0KC.m2772H(r13, r14);
        r4 = X.AnonymousClass0KC.m2775K(r10);
        if (r4 != 0) goto L_0x00fa;
    L_0x00f4:
        r4 = X.AnonymousClass0KC.m2773I(r10, r13);
        if (r4 == 0) goto L_0x012d;
    L_0x00fa:
        r7 = r10.f2959B;
        monitor-enter(r7);
        r4 = X.AnonymousClass0KC.m2778N(r10, r8);	 Catch:{ all -> 0x014e }
        if (r4 < 0) goto L_0x010c;
    L_0x0103:
        r4 = X.AnonymousClass0KC.m2781Q(r10, r4);	 Catch:{ all -> 0x014e }
        r4.f3065R = r15;	 Catch:{ all -> 0x014e }
        r4.f3076c = r5;	 Catch:{ all -> 0x014e }
        goto L_0x0129;
    L_0x010c:
        r4 = X.AnonymousClass0KT.f3048d;	 Catch:{ all -> 0x014e }
        r4 = r4.m2811A();	 Catch:{ all -> 0x014e }
        r4 = (X.AnonymousClass0KT) r4;	 Catch:{ all -> 0x014e }
        r4.f3064Q = r13;	 Catch:{ all -> 0x014e }
        r4.f3056I = r14;	 Catch:{ all -> 0x014e }
        r4.f3065R = r15;	 Catch:{ all -> 0x014e }
        r4.f3076c = r5;	 Catch:{ all -> 0x014e }
        r4.f3071X = r11;	 Catch:{ all -> 0x014e }
        r4.f3075b = r9;	 Catch:{ all -> 0x014e }
        r4.f3062O = r15;	 Catch:{ all -> 0x014e }
        r4.f3073Z = r0;	 Catch:{ all -> 0x014e }
        X.AnonymousClass0KC.m2779O(r10, r8, r4);	 Catch:{ all -> 0x014e }
        r4.f3063P = r6;	 Catch:{ all -> 0x014e }
    L_0x0129:
        X.AnonymousClass0KC.m2774J(r10, r4);	 Catch:{ all -> 0x014e }
        monitor-exit(r7);	 Catch:{ all -> 0x014e }
    L_0x012d:
        r0 = 4;
        r0 = X.AnonymousClass0CM.m897N(r0);
        if (r0 == 0) goto L_0x000c;
    L_0x0135:
        r2 = X.AnonymousClass0Eb.m1412G(r13);
        r3 = X.AnonymousClass0KC.m2772H(r13, r14);
        r4 = X.AnonymousClass0Eb.m1413H(r15);
        r0 = 4;
        X.AnonymousClass0CM.m886C(r0, r2, r3, r4);
        goto L_0x000c;
    L_0x0148:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0148 }
    L_0x014a:
        throw r0;
    L_0x014b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x014b }
        throw r0;	 Catch:{ all -> 0x0148 }
    L_0x014e:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x014e }
        goto L_0x014a;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0Eb.f(int, int, long, java.lang.String, boolean, boolean, X.0KD, android.util.SparseArray, X.0K7, boolean, long):void");
    }

    /* renamed from: g */
    public final void m1459g(int i, String str) {
        if (!AnonymousClass0Eb.m1425T(i, this.f1991I)) {
            this.f1984B.m2793K(i, 0, str);
        }
    }

    /* renamed from: h */
    public final AnonymousClass0KT m1460h(int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4, long j2) {
        boolean z5;
        int K;
        long A;
        AnonymousClass0EW anonymousClass0EW = this.f1999Q.f2950B;
        boolean z6 = anonymousClass0EW == null;
        if (!(z6 || m1431E() || m1411F())) {
            if (!AnonymousClass0KS.f3047B) {
                z5 = false;
                K = m1416K(i, anonymousClass0EW, z5);
                A = this.f1996N.mo693A(i);
                if (K != Integer.MAX_VALUE) {
                    return null;
                }
                int nextInt = this.f1986D.nextInt(Integer.MAX_VALUE);
                long now = this.f1998P.now();
                AnonymousClass0KT anonymousClass0KT = (AnonymousClass0KT) AnonymousClass0KT.f3048d.m2811A();
                anonymousClass0KT.f3064Q = i;
                anonymousClass0KT.f3070W = K;
                anonymousClass0KT.f3052E = A;
                anonymousClass0KT.f3059L = z5;
                anonymousClass0KT.f3060M = z6;
                anonymousClass0KT.f3071X = z3;
                anonymousClass0KT.f3065R = j;
                anonymousClass0KT.f3076c = z;
                anonymousClass0KT.f3062O = j;
                anonymousClass0KT.f3074a = now;
                anonymousClass0KT.f3056I = i2;
                anonymousClass0KT.f3075b = nextInt;
                anonymousClass0KT.f3061N = (short) 1;
                anonymousClass0KT.f3049B = z2;
                anonymousClass0KT.f3058K = true;
                anonymousClass0KT.f3073Z = j2;
                return anonymousClass0KT;
            }
        }
        z5 = true;
        K = m1416K(i, anonymousClass0EW, z5);
        A = this.f1996N.mo693A(i);
        if (K != Integer.MAX_VALUE) {
            return null;
        }
        int nextInt2 = this.f1986D.nextInt(Integer.MAX_VALUE);
        long now2 = this.f1998P.now();
        AnonymousClass0KT anonymousClass0KT2 = (AnonymousClass0KT) AnonymousClass0KT.f3048d.m2811A();
        anonymousClass0KT2.f3064Q = i;
        anonymousClass0KT2.f3070W = K;
        anonymousClass0KT2.f3052E = A;
        anonymousClass0KT2.f3059L = z5;
        anonymousClass0KT2.f3060M = z6;
        anonymousClass0KT2.f3071X = z3;
        anonymousClass0KT2.f3065R = j;
        anonymousClass0KT2.f3076c = z;
        anonymousClass0KT2.f3062O = j;
        anonymousClass0KT2.f3074a = now2;
        anonymousClass0KT2.f3056I = i2;
        anonymousClass0KT2.f3075b = nextInt2;
        anonymousClass0KT2.f3061N = (short) 1;
        anonymousClass0KT2.f3049B = z2;
        anonymousClass0KT2.f3058K = true;
        anonymousClass0KT2.f3073Z = j2;
        return anonymousClass0KT2;
    }

    public final void markerAnnotate(int i, int i2, String str, int i3) {
        m1439M(i, i2, str, i3, AnonymousClass0Eb.m1411F());
    }

    public final void markerAnnotate(int i, int i2, String str, String str2) {
        m1441O(i, i2, str, str2, AnonymousClass0Eb.m1411F());
    }

    public final void markerCancel(int i, int i2) {
        m1445S(i, i2);
    }

    public final void markerEnd(int i, int i2, short s) {
        m1447U(i, i2, s, -1, null);
    }

    public final void markerEnd(int i, int i2, short s, long j) {
        m1447U(i, i2, s, j, null);
    }

    public final void markerEnd(int i, short s) {
        m1447U(i, 0, s, -1, null);
    }

    public final void markerGenerate(int i, short s, int i2) {
        m1421P(i, s, null, i2, false, null);
    }

    public final void markerGenerateWithAnnotations(int i, short s, int i2, Map map) {
        m1421P(i, s, null, i2, false, map);
    }

    public final void markerNote(int i, int i2, short s, long j) {
        m1450X(i, i2, s, j, AnonymousClass0Eb.m1411F());
    }

    public final void markerStart(int i, int i2) {
        m1458f(i, i2, -1, null, false, false, null, null, null, true, AnonymousClass0Eb.m1411F());
    }

    public final void markerStart(int i, int i2, long j) {
        m1458f(i, i2, j, null, false, false, null, null, null, true, AnonymousClass0Eb.m1411F());
    }

    public final void markerStart(int i, boolean z) {
        m1458f(i, 0, -1, null, false, false, null, null, null, z, AnonymousClass0Eb.m1411F());
    }

    public final int sampleRateForMarker(int i) {
        if (AnonymousClass0Eb.m1424S(i, this.f1991I)) {
            return AnonymousClass0Eb.m1419N(this.f1991I);
        }
        Object obj;
        int A;
        AnonymousClass0EW anonymousClass0EW = this.f1999Q.f2950B;
        boolean z = false;
        if (!(anonymousClass0EW == null || m1431E() || m1411F())) {
            if (!AnonymousClass0KS.f3047B) {
                obj = null;
                if (obj == null) {
                    if (anonymousClass0EW == null) {
                        z = true;
                    }
                    return AnonymousClass0Eb.m1418M(this, i, z);
                }
                A = anonymousClass0EW.m1401A(i);
                if (A == 0 && AnonymousClass0Eb.m1426U(this.f1991I)) {
                    return 1;
                }
                return A;
            }
        }
        obj = 1;
        if (obj == null) {
            A = anonymousClass0EW.m1401A(i);
            if (A == 0) {
            }
            return A;
        }
        if (anonymousClass0EW == null) {
            z = true;
        }
        return AnonymousClass0Eb.m1418M(this, i, z);
    }

    public final void updateListenerMarkers() {
        if (!AnonymousClass0Eb.m1425T(0, this.f1991I)) {
            this.f1984B.m2794L();
        }
    }
}
