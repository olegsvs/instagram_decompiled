package X;

import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import android.util.Pair;
import com.facebook.common.dextricks.DexStore;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.5Rk */
public final class AnonymousClass5Rk {
    /* renamed from: U */
    public static final Class f63446U = AnonymousClass5Rk.class;
    /* renamed from: B */
    public Pair f63447B;
    /* renamed from: C */
    public volatile AnonymousClass5RW f63448C;
    /* renamed from: D */
    public final int f63449D;
    /* renamed from: E */
    public final boolean f63450E;
    /* renamed from: F */
    public final Executor f63451F;
    /* renamed from: G */
    public final AtomicBoolean f63452G = new AtomicBoolean(false);
    /* renamed from: H */
    public final AtomicBoolean f63453H = new AtomicBoolean(false);
    /* renamed from: I */
    public final AnonymousClass5Rd f63454I;
    /* renamed from: J */
    public AnonymousClass0C9 f63455J;
    /* renamed from: K */
    public final byte[] f63456K;
    /* renamed from: L */
    public final AtomicBoolean f63457L = new AtomicBoolean(false);
    /* renamed from: M */
    public boolean f63458M;
    /* renamed from: N */
    public final boolean f63459N;
    /* renamed from: O */
    public final int f63460O;
    /* renamed from: P */
    public final boolean f63461P;
    /* renamed from: Q */
    private AcousticEchoCanceler f63462Q;
    /* renamed from: R */
    private boolean f63463R;
    /* renamed from: S */
    private volatile AnonymousClass480 f63464S;
    /* renamed from: T */
    private Thread f63465T;

    public AnonymousClass5Rk(AnonymousClass0C9 anonymousClass0C9, Executor executor, boolean z, boolean z2, int i, boolean z3, boolean z4, AnonymousClass5Rd anonymousClass5Rd) {
        this.f63455J = anonymousClass0C9;
        this.f63451F = executor;
        this.f63459N = z;
        this.f63450E = z2;
        this.f63460O = Math.max(1, i);
        this.f63458M = z3;
        this.f63454I = anonymousClass5Rd;
        this.f63456K = new byte[DexStore.LOAD_RESULT_OATMEAL_QUICKEN_ATTEMPTED];
        this.f63449D = DexStore.LOAD_RESULT_OATMEAL_QUICKEN_ATTEMPTED;
        this.f63461P = z4;
    }

    /* renamed from: A */
    public final synchronized void m26540A() {
        if (this.f63465T != null) {
            try {
                this.f63465T.join();
            } catch (Throwable e) {
                AnonymousClass0Dc.E(f63446U, e, "Ran into an exception while draining audio", new Object[0]);
            }
        }
        this.f63465T = null;
    }

    /* renamed from: B */
    public final synchronized void m26541B() {
        Integer.valueOf(AnonymousClass486.B());
        if (this.f63447B == null) {
            try {
                this.f63447B = AnonymousClass486.C(this.f63463R);
            } catch (Throwable e) {
                AnonymousClass0Dc.E(f63446U, e, "MicrophoneSetup.openMic failed refCount %d", new Object[]{Integer.valueOf(AnonymousClass486.B())});
            }
            if (this.f63463R && this.f63447B != null && this.f63447B.first != null && AcousticEchoCanceler.isAvailable()) {
                this.f63462Q = AcousticEchoCanceler.create(((AudioRecord) this.f63447B.first).getAudioSessionId());
                if (this.f63462Q == null) {
                    AnonymousClass0Dc.B(f63446U, "AcousticEchoCanceler.create failed");
                } else {
                    try {
                        this.f63462Q.setEnabled(true);
                    } catch (Throwable e2) {
                        AnonymousClass0Dc.E(f63446U, e2, "AcousticEchoCanceler setEnabled failed", new Object[0]);
                    }
                }
            }
        }
        return;
    }

    /* renamed from: B */
    public static boolean m26539B(AnonymousClass47z anonymousClass47z, AudioRecord audioRecord) {
        try {
            Object obj = (anonymousClass47z.f50591E == 0 || anonymousClass47z.f50592F.now() - anonymousClass47z.f50591E > 5000) ? null : 1;
            if (obj == null && audioRecord.getRecordingState() == 1) {
                anonymousClass47z.f50591E = anonymousClass47z.f50592F.now();
                anonymousClass47z.f50590D ^= 1;
                obj = (anonymousClass47z.f50590D || !anonymousClass47z.f50593G) ? null : 1;
                if (obj != null) {
                    return false;
                }
                audioRecord.startRecording();
            }
        } catch (Throwable e) {
            AnonymousClass0Dc.E(f63446U, e, "startRecording while recorder is in use", new Object[0]);
        }
        return true;
    }

    /* renamed from: C */
    public final synchronized void m26542C() {
        if (this.f63462Q != null) {
            this.f63462Q.release();
            this.f63462Q = null;
        }
        Integer.valueOf(AnonymousClass486.B());
        this.f63452G.set(false);
        m26540A();
        if (this.f63447B != null) {
            AudioRecord audioRecord = (AudioRecord) this.f63447B.first;
            if (audioRecord != null) {
                audioRecord.release();
                AnonymousClass486.f50654C.addAndGet(-1);
            }
            this.f63447B = null;
        }
        Integer.valueOf(AnonymousClass486.B());
    }

    /* renamed from: D */
    public final synchronized void m26543D() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        monitor-enter(r4);
        r2 = r4.f63452G;	 Catch:{ all -> 0x00a8 }
        r1 = 0;	 Catch:{ all -> 0x00a8 }
        r0 = 1;	 Catch:{ all -> 0x00a8 }
        r0 = r2.compareAndSet(r1, r0);	 Catch:{ all -> 0x00a8 }
        if (r0 != 0) goto L_0x000d;	 Catch:{ all -> 0x00a8 }
    L_0x000b:
        monitor-exit(r4);
        return;
    L_0x000d:
        r4.m26541B();	 Catch:{ all -> 0x00a8 }
        r3 = 0;	 Catch:{ all -> 0x00a8 }
    L_0x0011:
        r0 = r4.f63460O;	 Catch:{ all -> 0x00a8 }
        if (r3 >= r0) goto L_0x008b;	 Catch:{ all -> 0x00a8 }
    L_0x0015:
        r0 = r4.f63447B;	 Catch:{ all -> 0x00a8 }
        if (r0 == 0) goto L_0x001b;	 Catch:{ all -> 0x00a8 }
    L_0x0019:
        if (r3 == 0) goto L_0x0027;	 Catch:{ all -> 0x00a8 }
    L_0x001b:
        r4.m26542C();	 Catch:{ all -> 0x00a8 }
        r1 = r4.f63452G;	 Catch:{ all -> 0x00a8 }
        r0 = 1;	 Catch:{ all -> 0x00a8 }
        r1.set(r0);	 Catch:{ all -> 0x00a8 }
        r4.m26541B();	 Catch:{ all -> 0x00a8 }
    L_0x0027:
        r0 = r4.f63447B;	 Catch:{ all -> 0x00a8 }
        if (r0 == 0) goto L_0x0080;	 Catch:{ all -> 0x00a8 }
    L_0x002b:
        r0 = r0.first;	 Catch:{ all -> 0x00a8 }
        r0 = (android.media.AudioRecord) r0;	 Catch:{ all -> 0x00a8 }
        r0.startRecording();	 Catch:{ all -> 0x00a8 }
        r0 = r4.f63447B;	 Catch:{ all -> 0x00a8 }
        r0 = r0.first;	 Catch:{ all -> 0x00a8 }
        r0 = (android.media.AudioRecord) r0;	 Catch:{ all -> 0x00a8 }
        r1 = r0.getRecordingState();	 Catch:{ all -> 0x00a8 }
        r0 = 3;	 Catch:{ all -> 0x00a8 }
        if (r1 != r0) goto L_0x0040;	 Catch:{ all -> 0x00a8 }
    L_0x003f:
        goto L_0x008b;	 Catch:{ all -> 0x00a8 }
    L_0x0040:
        r0 = 100;	 Catch:{ all -> 0x00a8 }
        java.lang.Thread.sleep(r0);	 Catch:{ InterruptedException -> 0x0045 }
    L_0x0045:
        r2 = new java.util.HashMap;	 Catch:{ all -> 0x00a8 }
        r2.<init>();	 Catch:{ all -> 0x00a8 }
        r1 = "audio_record_state";	 Catch:{ all -> 0x00a8 }
        r0 = r4.f63447B;	 Catch:{ all -> 0x00a8 }
        r0 = r0.first;	 Catch:{ all -> 0x00a8 }
        r0 = (android.media.AudioRecord) r0;	 Catch:{ all -> 0x00a8 }
        r0 = r0.getState();	 Catch:{ all -> 0x00a8 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x00a8 }
        r2.put(r1, r0);	 Catch:{ all -> 0x00a8 }
        r1 = "audio_record_recording_state";	 Catch:{ all -> 0x00a8 }
        r0 = r4.f63447B;	 Catch:{ all -> 0x00a8 }
        r0 = r0.first;	 Catch:{ all -> 0x00a8 }
        r0 = (android.media.AudioRecord) r0;	 Catch:{ all -> 0x00a8 }
        r0 = r0.getRecordingState();	 Catch:{ all -> 0x00a8 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x00a8 }
        r2.put(r1, r0);	 Catch:{ all -> 0x00a8 }
        r1 = "audio_record_current_ref_count";	 Catch:{ all -> 0x00a8 }
        r0 = X.AnonymousClass486.B();	 Catch:{ all -> 0x00a8 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x00a8 }
        r2.put(r1, r0);	 Catch:{ all -> 0x00a8 }
        r3 = r3 + 1;	 Catch:{ all -> 0x00a8 }
        goto L_0x0011;	 Catch:{ all -> 0x00a8 }
    L_0x0080:
        r4.m26542C();	 Catch:{ all -> 0x00a8 }
        r1 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x00a8 }
        r0 = "AudioRecorder could not be opened";	 Catch:{ all -> 0x00a8 }
        r1.<init>(r0);	 Catch:{ all -> 0x00a8 }
        throw r1;	 Catch:{ all -> 0x00a8 }
    L_0x008b:
        r3 = r4.f63447B;	 Catch:{ all -> 0x00a8 }
        if (r3 != 0) goto L_0x0091;	 Catch:{ all -> 0x00a8 }
    L_0x008f:
        goto L_0x000b;	 Catch:{ all -> 0x00a8 }
    L_0x0091:
        r0 = r4.f63464S;	 Catch:{ all -> 0x00a8 }
        r2 = new java.lang.Thread;	 Catch:{ all -> 0x00a8 }
        r1 = new X.47y;	 Catch:{ all -> 0x00a8 }
        r1.<init>(r4, r3, r0);	 Catch:{ all -> 0x00a8 }
        r0 = "live_audio_recording";	 Catch:{ all -> 0x00a8 }
        r2.<init>(r1, r0);	 Catch:{ all -> 0x00a8 }
        r4.f63465T = r2;	 Catch:{ all -> 0x00a8 }
        r0 = r4.f63465T;	 Catch:{ all -> 0x00a8 }
        r0.start();	 Catch:{ all -> 0x00a8 }
        goto L_0x000b;	 Catch:{ all -> 0x00a8 }
    L_0x00a8:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.5Rk.D():void");
    }
}
