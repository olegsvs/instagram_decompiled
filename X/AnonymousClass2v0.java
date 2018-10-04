package X;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* renamed from: X.2v0 */
public final class AnonymousClass2v0 {
    /* renamed from: B */
    public AnonymousClass2uy f35706B;
    /* renamed from: C */
    public AudioTrack f35707C;
    /* renamed from: D */
    public int f35708D;
    /* renamed from: E */
    public long f35709E;
    /* renamed from: F */
    public long f35710F;
    /* renamed from: G */
    public long f35711G;
    /* renamed from: H */
    public Method f35712H;
    /* renamed from: I */
    public boolean f35713I;
    /* renamed from: J */
    public boolean f35714J;
    /* renamed from: K */
    public long f35715K;
    /* renamed from: L */
    public long f35716L;
    /* renamed from: M */
    public long f35717M;
    /* renamed from: N */
    public long f35718N;
    /* renamed from: O */
    public final AnonymousClass2uz f35719O;
    /* renamed from: P */
    public boolean f35720P;
    /* renamed from: Q */
    public int f35721Q;
    /* renamed from: R */
    public int f35722R;
    /* renamed from: S */
    public int f35723S;
    /* renamed from: T */
    public long f35724T;
    /* renamed from: U */
    public int f35725U;
    /* renamed from: V */
    public long f35726V;
    /* renamed from: W */
    public long f35727W;
    /* renamed from: X */
    public long f35728X;
    /* renamed from: Y */
    public long f35729Y;
    /* renamed from: Z */
    private final long[] f35730Z;

    public AnonymousClass2v0(X.AnonymousClass2uz r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r3.<init>();
        r0 = X.AnonymousClass2yO.m18016E(r4);
        r0 = (X.AnonymousClass2uz) r0;
        r3.f35719O = r0;
        r1 = X.AnonymousClass2yi.f36552F;
        r0 = 18;
        if (r1 < r0) goto L_0x001e;
    L_0x0011:
        r2 = android.media.AudioTrack.class;	 Catch:{ NoSuchMethodException -> 0x001e }
        r1 = "getLatency";	 Catch:{ NoSuchMethodException -> 0x001e }
        r0 = 0;	 Catch:{ NoSuchMethodException -> 0x001e }
        r0 = (java.lang.Class[]) r0;	 Catch:{ NoSuchMethodException -> 0x001e }
        r0 = r2.getMethod(r1, r0);	 Catch:{ NoSuchMethodException -> 0x001e }
        r3.f35712H = r0;	 Catch:{ NoSuchMethodException -> 0x001e }
    L_0x001e:
        r0 = 10;
        r0 = new long[r0];
        r3.f35730Z = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2v0.<init>(X.2uz):void");
    }

    /* renamed from: A */
    public final long m17749A(boolean z) {
        if (this.f35707C.getPlayState() == 3) {
            AnonymousClass2v0.m17748E(this);
        }
        long nanoTime = System.nanoTime() / 1000;
        int i = this.f35706B.f35701C;
        Object obj = 1;
        if (i != 1) {
            if (i != 2) {
                obj = null;
            }
        }
        if (obj != null) {
            long j;
            AnonymousClass2ux anonymousClass2ux = this.f35706B.f35700B;
            if (anonymousClass2ux != null) {
                j = anonymousClass2ux.f35697D;
            } else {
                j = -1;
            }
            long B = AnonymousClass2v0.m17745B(this, j);
            if ((this.f35706B.f35701C == 2 ? 1 : null) == null) {
                return B;
            }
            return B + (nanoTime - this.f35706B.m17742A());
        }
        if (this.f35725U == 0) {
            nanoTime = AnonymousClass2v0.m17745B(this, AnonymousClass2v0.m17746C(this));
        } else {
            nanoTime += this.f35727W;
        }
        if (!z) {
            nanoTime -= this.f35718N;
        }
        return nanoTime;
    }

    /* renamed from: B */
    public static long m17745B(AnonymousClass2v0 anonymousClass2v0, long j) {
        return (j * 1000000) / ((long) anonymousClass2v0.f35723S);
    }

    /* renamed from: B */
    public final boolean m17750B(long j) {
        if (j <= AnonymousClass2v0.m17746C(this)) {
            Object obj = (this.f35720P && this.f35707C.getPlayState() == 2 && AnonymousClass2v0.m17746C(this) == 0) ? 1 : null;
            if (obj == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: C */
    public static long m17746C(AnonymousClass2v0 anonymousClass2v0) {
        if (anonymousClass2v0.f35729Y != -9223372036854775807L) {
            return Math.min(anonymousClass2v0.f35710F, anonymousClass2v0.f35728X + ((((SystemClock.elapsedRealtime() * 1000) - anonymousClass2v0.f35729Y) * ((long) anonymousClass2v0.f35723S)) / 1000000));
        }
        int playState = anonymousClass2v0.f35707C.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) anonymousClass2v0.f35707C.getPlaybackHeadPosition());
        if (anonymousClass2v0.f35720P) {
            if (playState == 2 && playbackHeadPosition == 0) {
                anonymousClass2v0.f35724T = anonymousClass2v0.f35717M;
            }
            playbackHeadPosition += anonymousClass2v0.f35724T;
        }
        if (AnonymousClass2yi.f36552F <= 28) {
            if (playbackHeadPosition == 0 && anonymousClass2v0.f35717M > 0 && playState == 3) {
                if (anonymousClass2v0.f35711G == -9223372036854775807L) {
                    anonymousClass2v0.f35711G = SystemClock.elapsedRealtime();
                }
                return anonymousClass2v0.f35717M;
            }
            anonymousClass2v0.f35711G = -9223372036854775807L;
        }
        if (anonymousClass2v0.f35717M > playbackHeadPosition) {
            anonymousClass2v0.f35726V++;
        }
        anonymousClass2v0.f35717M = playbackHeadPosition;
        return playbackHeadPosition + (anonymousClass2v0.f35726V << 32);
    }

    /* renamed from: C */
    public final boolean m17751C(long j) {
        int playState = this.f35707C.getPlayState();
        if (this.f35720P) {
            if (playState == 2) {
                this.f35713I = false;
                return false;
            } else if (playState == 1 && AnonymousClass2v0.m17746C(this) == 0) {
                return false;
            }
        }
        boolean z = this.f35713I;
        this.f35713I = m17750B(j);
        if (!(!z || this.f35713I || playState == 1)) {
            AnonymousClass2uz anonymousClass2uz = this.f35719O;
            if (anonymousClass2uz != null) {
                anonymousClass2uz.ZEA(this.f35708D, AnonymousClass2uA.m17667C(this.f35709E));
            }
        }
        return true;
    }

    /* renamed from: D */
    private static void m17747D(AnonymousClass2v0 anonymousClass2v0, long j, long j2) {
        long j3 = j;
        if (anonymousClass2v0.f35706B.m17743B(j)) {
            long j4;
            long A = anonymousClass2v0.f35706B.m17742A();
            AnonymousClass2ux anonymousClass2ux = anonymousClass2v0.f35706B.f35700B;
            if (anonymousClass2ux != null) {
                j4 = anonymousClass2ux.f35697D;
            } else {
                j4 = -1;
            }
            long j5 = j2;
            if (Math.abs(A - j) > 5000000) {
                anonymousClass2v0.f35719O.iCA(j4, A, j3, j5);
                AnonymousClass2uy.m17741B(anonymousClass2v0.f35706B, 4);
            } else if (Math.abs(AnonymousClass2v0.m17745B(anonymousClass2v0, j4) - j2) > 5000000) {
                anonymousClass2v0.f35719O.Hu(j4, A, j3, j5);
                AnonymousClass2uy.m17741B(anonymousClass2v0.f35706B, 4);
            } else {
                AnonymousClass2uy anonymousClass2uy = anonymousClass2v0.f35706B;
                if (anonymousClass2uy.f35701C == 4) {
                    anonymousClass2uy.m17744C();
                }
            }
        }
    }

    /* renamed from: D */
    public final boolean m17752D() {
        this.f35727W = 0;
        this.f35725U = 0;
        this.f35721Q = 0;
        this.f35716L = 0;
        if (this.f35729Y != -9223372036854775807L) {
            return false;
        }
        this.f35706B.m17744C();
        return true;
    }

    /* renamed from: E */
    private static void m17748E(X.AnonymousClass2v0 r11) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = X.AnonymousClass2v0.m17746C(r11);
        r2 = X.AnonymousClass2v0.m17745B(r11, r0);
        r7 = 0;
        r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1));
        if (r0 != 0) goto L_0x000f;
    L_0x000e:
        return;
    L_0x000f:
        r5 = java.lang.System.nanoTime();
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r5 = r5 / r0;
        r0 = r11.f35716L;
        r9 = r5 - r0;
        r0 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
        if (r0 < 0) goto L_0x004e;
    L_0x0020:
        r9 = r11.f35730Z;
        r4 = r11.f35721Q;
        r0 = r2 - r5;
        r9[r4] = r0;
        r0 = r4 + 1;
        r1 = 10;
        r0 = r0 % r1;
        r11.f35721Q = r0;
        r0 = r11.f35725U;
        if (r0 >= r1) goto L_0x0037;
    L_0x0033:
        r0 = r0 + 1;
        r11.f35725U = r0;
    L_0x0037:
        r11.f35716L = r5;
        r11.f35727W = r7;
        r4 = 0;
    L_0x003c:
        r1 = r11.f35725U;
        if (r4 >= r1) goto L_0x004e;
    L_0x0040:
        r9 = r11.f35727W;
        r0 = r11.f35730Z;
        r7 = r0[r4];
        r0 = (long) r1;
        r7 = r7 / r0;
        r9 = r9 + r7;
        r11.f35727W = r9;
        r4 = r4 + 1;
        goto L_0x003c;
    L_0x004e:
        r0 = r11.f35720P;
        if (r0 == 0) goto L_0x0053;
    L_0x0052:
        goto L_0x000e;
    L_0x0053:
        X.AnonymousClass2v0.m17747D(r11, r5, r2);
        r0 = r11.f35714J;
        if (r0 == 0) goto L_0x000e;
    L_0x005a:
        r4 = r11.f35712H;
        if (r4 == 0) goto L_0x000e;
    L_0x005e:
        r0 = r11.f35715K;
        r2 = r5 - r0;
        r0 = 500000; // 0x7a120 float:7.00649E-40 double:2.47033E-318;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 < 0) goto L_0x000e;
    L_0x0069:
        r9 = 0;
        r1 = r11.f35707C;	 Catch:{ Exception -> 0x009f }
        r0 = r9;	 Catch:{ Exception -> 0x009f }
        r0 = (java.lang.Object[]) r0;	 Catch:{ Exception -> 0x009f }
        r0 = r4.invoke(r1, r0);	 Catch:{ Exception -> 0x009f }
        r0 = (java.lang.Integer) r0;	 Catch:{ Exception -> 0x009f }
        r0 = r0.intValue();	 Catch:{ Exception -> 0x009f }
        r2 = (long) r0;	 Catch:{ Exception -> 0x009f }
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ Exception -> 0x009f }
        r2 = r2 * r0;	 Catch:{ Exception -> 0x009f }
        r0 = r11.f35709E;	 Catch:{ Exception -> 0x009f }
        r2 = r2 - r0;	 Catch:{ Exception -> 0x009f }
        r11.f35718N = r2;	 Catch:{ Exception -> 0x009f }
        r0 = r11.f35718N;	 Catch:{ Exception -> 0x009f }
        r3 = 0;	 Catch:{ Exception -> 0x009f }
        r0 = java.lang.Math.max(r0, r3);	 Catch:{ Exception -> 0x009f }
        r11.f35718N = r0;	 Catch:{ Exception -> 0x009f }
        r7 = r11.f35718N;	 Catch:{ Exception -> 0x009f }
        r0 = 5000000; // 0x4c4b40 float:7.006492E-39 double:2.470328E-317;	 Catch:{ Exception -> 0x009f }
        r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1));	 Catch:{ Exception -> 0x009f }
        if (r0 <= 0) goto L_0x00a1;	 Catch:{ Exception -> 0x009f }
    L_0x0095:
        r2 = r11.f35719O;	 Catch:{ Exception -> 0x009f }
        r0 = r11.f35718N;	 Catch:{ Exception -> 0x009f }
        r2.io(r0);	 Catch:{ Exception -> 0x009f }
        r11.f35718N = r3;	 Catch:{ Exception -> 0x009f }
        goto L_0x00a1;	 Catch:{ Exception -> 0x009f }
    L_0x009f:
        r11.f35712H = r9;
    L_0x00a1:
        r11.f35715K = r5;
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2v0.E(X.2v0):void");
    }
}
