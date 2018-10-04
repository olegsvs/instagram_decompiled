package X;

import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import android.os.Build.VERSION;
import android.os.Handler;
import com.facebook.common.dextricks.DexStore;

/* renamed from: X.2ib */
public final class AnonymousClass2ib {
    /* renamed from: B */
    public int f32886B;
    /* renamed from: C */
    public AudioRecord f32887C;
    /* renamed from: D */
    public final AnonymousClass2id f32888D;
    /* renamed from: E */
    public final AnonymousClass2iZ f32889E;
    /* renamed from: F */
    public AcousticEchoCanceler f32890F;
    /* renamed from: G */
    public boolean f32891G;
    /* renamed from: H */
    public final Handler f32892H;
    /* renamed from: I */
    public volatile AnonymousClass2ia f32893I;
    /* renamed from: J */
    private final Runnable f32894J = new AnonymousClass2iV(this);
    /* renamed from: K */
    private int f32895K;

    public AnonymousClass2ib(AnonymousClass2id anonymousClass2id, Handler handler, AnonymousClass2iZ anonymousClass2iZ) {
        this.f32888D = anonymousClass2id;
        this.f32892H = handler;
        this.f32889E = anonymousClass2iZ;
        this.f32893I = AnonymousClass2ia.STOPPED;
        this.f32886B = anonymousClass2id.f32909G ? 0 : DexStore.LOAD_RESULT_DEX2OAT_QUICKEN_ATTEMPTED;
        if (anonymousClass2id.f32905C != 409600) {
            this.f32895K = anonymousClass2id.f32905C;
            return;
        }
        int minBufferSize = AudioRecord.getMinBufferSize(this.f32888D.f32910H, this.f32888D.f32906D, this.f32888D.f32908F);
        this.f32895K = minBufferSize;
        if (minBufferSize <= 0) {
            this.f32895K = 409600;
            return;
        }
        int i = anonymousClass2id.f32904B;
        if (i <= 0) {
            i = 2;
        }
        this.f32895K = Math.min(i * this.f32895K, 409600);
    }

    /* renamed from: A */
    public final synchronized void m16989A(AnonymousClass1rn anonymousClass1rn, Handler handler) {
        AnonymousClass2ib.m16987D(this, handler);
        this.f32893I = AnonymousClass2ia.STOPPED;
        AnonymousClass0OR.D(this.f32892H, new AnonymousClass2iY(this, anonymousClass1rn, handler), 313486241);
    }

    /* renamed from: B */
    public static void m16985B(AnonymousClass2ib anonymousClass2ib, AnonymousClass1rn anonymousClass1rn, Handler handler) {
        if (anonymousClass2ib.f32893I != AnonymousClass2ia.STOPPED) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Must only call prepare() on a stopped AudioRecorder. Current state is: ");
            stringBuilder.append(anonymousClass2ib.f32893I);
            AnonymousClass1rq.m13520B(anonymousClass1rn, handler, new IllegalStateException(stringBuilder.toString()));
            return;
        }
        if (!anonymousClass2ib.f32888D.f32909G) {
            try {
                int i = (anonymousClass2ib.f32888D.f32907E && AcousticEchoCanceler.isAvailable()) ? 7 : anonymousClass2ib.f32888D.f32911I;
                anonymousClass2ib.f32887C = new AudioRecord(i, anonymousClass2ib.f32888D.f32910H, anonymousClass2ib.f32888D.f32906D, anonymousClass2ib.f32888D.f32908F, anonymousClass2ib.f32895K);
                if (anonymousClass2ib.f32887C.getState() != 0) {
                    anonymousClass2ib.f32891G = AnonymousClass2ib.m16988E(anonymousClass2ib);
                } else {
                    throw new IllegalStateException("Could not prepare audio recording");
                }
            } catch (Throwable e) {
                AnonymousClass1rq.m13520B(anonymousClass1rn, handler, e);
                return;
            }
        }
        anonymousClass2ib.f32893I = AnonymousClass2ia.PREPARED;
        AnonymousClass1rq.m13521C(anonymousClass1rn, handler);
    }

    /* renamed from: C */
    public static synchronized void m16986C(AnonymousClass2ib anonymousClass2ib, AnonymousClass1rn anonymousClass1rn, Handler handler) {
        synchronized (anonymousClass2ib) {
            if (anonymousClass2ib.f32893I != AnonymousClass2ia.PREPARED) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("prepare() must be called before starting audio recording. Current state is: ");
                stringBuilder.append(anonymousClass2ib.f32893I);
                AnonymousClass1rq.m13520B(anonymousClass1rn, handler, new IllegalStateException(stringBuilder.toString()));
            } else {
                if (!anonymousClass2ib.f32888D.f32909G) {
                    try {
                        anonymousClass2ib.f32887C.startRecording();
                    } catch (Throwable e) {
                        AnonymousClass1rq.m13520B(anonymousClass1rn, handler, e);
                    }
                }
                anonymousClass2ib.f32893I = AnonymousClass2ia.STARTED;
                AnonymousClass0OR.D(anonymousClass2ib.f32892H, anonymousClass2ib.f32894J, -1737187995);
                AnonymousClass1rq.m13521C(anonymousClass1rn, handler);
            }
        }
    }

    /* renamed from: D */
    public static void m16987D(AnonymousClass2ib anonymousClass2ib, Handler handler) {
        if (handler == null) {
            throw new IllegalArgumentException("The handler cannot be null");
        } else if (anonymousClass2ib.f32892H.getLooper() == handler.getLooper()) {
            throw new IllegalStateException("The handler must be on a separate thread then the recording one");
        }
    }

    /* renamed from: E */
    private static boolean m16988E(AnonymousClass2ib anonymousClass2ib) {
        if (!anonymousClass2ib.f32888D.f32907E || VERSION.SDK_INT < 16 || !AcousticEchoCanceler.isAvailable()) {
            return false;
        }
        AudioRecord audioRecord = anonymousClass2ib.f32887C;
        if (audioRecord == null) {
            return false;
        }
        AcousticEchoCanceler create = AcousticEchoCanceler.create(audioRecord.getAudioSessionId());
        anonymousClass2ib.f32890F = create;
        if (create == null || create.setEnabled(true) != 0) {
            return false;
        }
        return true;
    }
}
