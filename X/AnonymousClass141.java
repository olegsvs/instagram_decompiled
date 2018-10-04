package X;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.141 */
public final class AnonymousClass141 extends AnonymousClass0Tb implements Runnable {
    /* renamed from: B */
    public AnonymousClass0Qw f13807B = null;
    /* renamed from: C */
    public final String f13808C;
    /* renamed from: D */
    public boolean f13809D;
    /* renamed from: E */
    public AnonymousClass140 f13810E;
    /* renamed from: F */
    public final AnonymousClass0gT f13811F;
    /* renamed from: G */
    public final AnonymousClass0aA f13812G;
    /* renamed from: H */
    public final AtomicInteger f13813H;
    /* renamed from: I */
    public final AnonymousClass0a8 f13814I;
    /* renamed from: J */
    public AnonymousClass0aL f13815J = null;
    /* renamed from: K */
    public final /* synthetic */ AnonymousClass0bL f13816K;
    /* renamed from: L */
    private Runnable f13817L;
    /* renamed from: M */
    private AnonymousClass0gT f13818M;

    /* renamed from: C */
    public final void mo1401C(AnonymousClass0a8 anonymousClass0a8, AnonymousClass0aA anonymousClass0aA) {
    }

    public AnonymousClass141(AnonymousClass0bL anonymousClass0bL, AnonymousClass0a8 anonymousClass0a8, AnonymousClass0aA anonymousClass0aA, AnonymousClass0gT anonymousClass0gT) {
        this.f13816K = anonymousClass0bL;
        this.f13814I = anonymousClass0a8;
        this.f13812G = anonymousClass0aA;
        this.f13811F = anonymousClass0gT;
        this.f13813H = new AtomicInteger(0);
        this.f13818M = new AnonymousClass0gT(anonymousClass0aA);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f13812G.f6455C);
        stringBuilder.append("-copy");
        stringBuilder.append(anonymousClass0a8.hashCode());
        this.f13808C = stringBuilder.toString();
    }

    /* renamed from: A */
    public final void mo1281A(AnonymousClass0a8 anonymousClass0a8, IOException iOException) {
        if (this.f13813H.get() == 2) {
            this.f13811F.m6622B(anonymousClass0a8, iOException);
        } else if (this.f13813H.get() == 0) {
            if (!this.f13816K.f6722E) {
                this.f13816K.f6719B.removeCallbacksAndMessages(null);
            } else if (this.f13817L != null) {
                AnonymousClass0Oy.m3698B().m3700B(this.f13817L);
            }
            AnonymousClass141.m9140B(this);
        }
    }

    /* renamed from: B */
    public final void mo1282B(AnonymousClass0a8 anonymousClass0a8, AnonymousClass0aA anonymousClass0aA, ByteBuffer byteBuffer) {
        if (this.f13813H.get() == 2) {
            this.f13811F.m6623C(anonymousClass0a8, byteBuffer);
        }
    }

    /* renamed from: B */
    public static void m9140B(AnonymousClass141 anonymousClass141) {
        AnonymousClass0GG.m1763B(anonymousClass141.f13816K.f6721D, new AnonymousClass14A(anonymousClass141), -1103588381);
    }

    /* renamed from: E */
    public final void mo1283E(AnonymousClass0a8 anonymousClass0a8, AnonymousClass0aA anonymousClass0aA, AnonymousClass0qA anonymousClass0qA) {
        if (this.f13813H.compareAndSet(0, 2)) {
            this.f13811F.m6624D(anonymousClass0a8, anonymousClass0qA);
        }
    }

    /* renamed from: F */
    public final void mo1284F(AnonymousClass0a8 anonymousClass0a8) {
        if (this.f13813H.get() == 2) {
            this.f13811F.m6625E(anonymousClass0a8);
        }
    }

    public final void run() {
        String str = this.f13808C;
        AnonymousClass0TY anonymousClass0TY = AnonymousClass0TY.f5217H;
        AnonymousClass140 anonymousClass140 = new AnonymousClass140(this.f13812G.f6455C);
        AnonymousClass140 anonymousClass1402 = new AnonymousClass140(str);
        if (!anonymousClass140.m9138C(anonymousClass1402, anonymousClass0TY.f5221E)) {
            anonymousClass1402 = null;
        }
        this.f13810E = anonymousClass1402;
        if (anonymousClass1402 != null) {
            if (this.f13812G.f6456D == AnonymousClass0Ny.UseCacheWithTimeout) {
                this.f13817L = new AnonymousClass1AW(this);
                if (this.f13816K.f6722E) {
                    AnonymousClass0Oy.m3698B().m3699A(this.f13817L, this.f13812G.f6457E);
                } else {
                    AnonymousClass0OR.m3626F(this.f13816K.f6719B, this.f13817L, this.f13812G.f6457E, -91272606);
                }
            } else {
                AnonymousClass141.m9140B(this);
            }
        } else if (this.f13812G.f6456D == AnonymousClass0Ny.UseCache) {
            this.f13811F.m6622B(this.f13814I, new IOException("no content"));
        }
        if (this.f13812G.f6456D == AnonymousClass0Ny.UseCacheWithTimeout) {
            this.f13818M.m6621A(this);
            AnonymousClass0TY.f5217H.m4524H(this.f13818M, this.f13814I, this.f13812G.f6455C);
            this.f13815J = this.f13816K.f6723F.pUA(this.f13814I, this.f13812G, this.f13818M);
            AnonymousClass0Qw anonymousClass0Qw = this.f13807B;
            if (anonymousClass0Qw != null) {
                this.f13815J.DWA(anonymousClass0Qw);
            }
            if (this.f13809D) {
                this.f13815J.cancel();
            }
        }
    }
}
