package X;

import android.net.Uri;
import android.os.Handler;

/* renamed from: X.441 */
public final class AnonymousClass441 extends AnonymousClass3vb implements AnonymousClass2wS {
    /* renamed from: B */
    private final int f49326B;
    /* renamed from: C */
    private final String f49327C;
    /* renamed from: D */
    private final AnonymousClass2yB f49328D;
    /* renamed from: E */
    private final AnonymousClass2vM f49329E;
    /* renamed from: F */
    private final int f49330F;
    /* renamed from: G */
    private final Object f49331G;
    /* renamed from: H */
    private long f49332H;
    /* renamed from: I */
    private boolean f49333I;
    /* renamed from: J */
    private final Uri f49334J;

    /* renamed from: C */
    public final void mo5256C() {
    }

    public final void ub() {
    }

    public AnonymousClass441(Uri uri, AnonymousClass2yB anonymousClass2yB, AnonymousClass2vM anonymousClass2vM, int i, Handler handler, AnonymousClass2wT anonymousClass2wT, String str, int i2) {
        this(uri, anonymousClass2yB, anonymousClass2vM, i, str, i2, null);
        if (anonymousClass2wT != null && handler != null) {
            gB(handler, new AnonymousClass440(anonymousClass2wT));
        }
    }

    private AnonymousClass441(Uri uri, AnonymousClass2yB anonymousClass2yB, AnonymousClass2vM anonymousClass2vM, int i, String str, int i2, Object obj) {
        this.f49334J = uri;
        this.f49328D = anonymousClass2yB;
        this.f49329E = anonymousClass2vM;
        this.f49330F = i;
        this.f49327C = str;
        this.f49326B = i2;
        this.f49332H = -9223372036854775807L;
        this.f49331G = obj;
    }

    /* renamed from: A */
    public final void mo5255A(AnonymousClass3uy anonymousClass3uy, boolean z) {
        m22502B(this.f49332H, false);
    }

    /* renamed from: B */
    private void m22502B(long j, boolean z) {
        this.f49332H = j;
        this.f49333I = z;
        m21527B(new AnonymousClass3vm(this.f49332H, this.f49333I, false, this.f49331G), null);
    }

    public final void RJA(AnonymousClass3vk anonymousClass3vk) {
        AnonymousClass43z anonymousClass43z = (AnonymousClass43z) anonymousClass3vk;
        if (anonymousClass43z.f49299N) {
            for (AnonymousClass3vl D : anonymousClass43z.f49301P) {
                D.m21539D();
            }
        }
        anonymousClass43z.f49296K.m21633C(anonymousClass43z);
        anonymousClass43z.f49294I.removeCallbacksAndMessages(null);
        anonymousClass43z.f49300O = true;
        anonymousClass43z.f49293H.m17866I();
    }

    public final AnonymousClass3vk pF(AnonymousClass2wU anonymousClass2wU, AnonymousClass2yA anonymousClass2yA) {
        AnonymousClass2yO.m18013B(anonymousClass2wU.f36076D == 0);
        return new AnonymousClass43z(this.f49334J, this.f49328D.eF(), this.f49329E.gF(), this.f49330F, this.f46979B.m17868K(0, anonymousClass2wU, 0), this, anonymousClass2yA, this.f49327C, this.f49326B);
    }

    public final void qAA(long j, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.f49332H;
        }
        if (this.f49332H != j || this.f49333I != z) {
            m22502B(j, z);
        }
    }
}
