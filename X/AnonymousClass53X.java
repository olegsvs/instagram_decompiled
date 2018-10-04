package X;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* renamed from: X.53X */
public final class AnonymousClass53X implements AnonymousClass0v2, AnonymousClass0v3, AnonymousClass1XX, AnonymousClass3pQ {
    /* renamed from: B */
    public AnonymousClass53V f59626B;
    /* renamed from: C */
    public String f59627C;
    /* renamed from: D */
    public AnonymousClass1c0 f59628D;
    /* renamed from: E */
    public int f59629E;
    /* renamed from: F */
    public final Handler f59630F;
    /* renamed from: G */
    private final Context f59631G;
    /* renamed from: H */
    private boolean f59632H;
    /* renamed from: I */
    private boolean f59633I;
    /* renamed from: J */
    private int f59634J = -1;
    /* renamed from: K */
    private boolean f59635K;
    /* renamed from: L */
    private final Runnable f59636L;
    /* renamed from: M */
    private final AnonymousClass0Cm f59637M;

    public AnonymousClass53X(Context context, AnonymousClass0Cm anonymousClass0Cm) {
        this.f59631G = context;
        this.f59637M = anonymousClass0Cm;
        this.f59629E = 16;
        this.f59630F = new Handler(Looper.getMainLooper());
        this.f59636L = new AnonymousClass53T(this);
    }

    /* renamed from: A */
    public final AnonymousClass53W m25647A(String str) {
        if (!(TextUtils.isEmpty(str) || this.f59628D == null)) {
            String str2 = this.f59627C;
            if (str2 != null && str2.equals(str)) {
                return this.f59633I ? AnonymousClass53W.PREPARED : AnonymousClass53W.PREPARING;
            }
        }
        return AnonymousClass53W.UNSET;
    }

    /* renamed from: B */
    private void m25645B() {
        this.f59632H = false;
        AnonymousClass0OR.G(this.f59630F, this.f59636L, -581385955);
        AnonymousClass53V anonymousClass53V = this.f59626B;
        if (anonymousClass53V != null) {
            anonymousClass53V.Ii();
        }
    }

    /* renamed from: B */
    public final boolean m25648B() {
        switch (AnonymousClass53U.f59621B[m25647A(this.f59627C).ordinal()]) {
            case 1:
            case 2:
                if (this.f59635K || this.f59632H) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    /* renamed from: C */
    private void m25646C() {
        AnonymousClass0LH.B(this.f59633I);
        this.f59628D.e();
        this.f59632H = true;
        AnonymousClass0OR.F(this.f59630F, this.f59636L, (long) this.f59629E, -1424574538);
    }

    /* renamed from: D */
    public final void m25649D() {
        AnonymousClass0LH.E(this.f59628D);
        this.f59635K = false;
        if (this.f59633I) {
            this.f59628D.P();
        }
        m25645B();
    }

    /* renamed from: E */
    public final void m25650E() {
        AnonymousClass0LH.E(this.f59627C);
        switch (m25647A(this.f59627C).ordinal()) {
            case 0:
                return;
            case 1:
                this.f59635K = true;
                return;
            case 2:
                m25646C();
                return;
            default:
                return;
        }
    }

    /* renamed from: F */
    public final void m25651F() {
        if (this.f59628D != null) {
            m25652G();
            this.f59628D.S();
            this.f59628D = null;
        }
    }

    /* renamed from: G */
    public final void m25652G() {
        AnonymousClass1c0 anonymousClass1c0 = this.f59628D;
        if (anonymousClass1c0 != null) {
            anonymousClass1c0.U();
            m25645B();
            this.f59635K = false;
            this.f59634J = -1;
            this.f59633I = false;
            this.f59627C = null;
            this.f59626B = null;
        }
    }

    /* renamed from: H */
    public final void m25653H(int i) {
        AnonymousClass0LH.E(this.f59627C);
        switch (m25647A(this.f59627C).ordinal()) {
            case 0:
                return;
            case 1:
                this.f59634J = i;
                return;
            case 2:
                this.f59628D.V(i);
                return;
            default:
                return;
        }
    }

    /* renamed from: I */
    public final void m25654I(String str, AnonymousClass53V anonymousClass53V) {
        if (str.equals(this.f59627C)) {
            this.f59626B = anonymousClass53V;
            return;
        }
        if (this.f59628D == null) {
            if (((Boolean) AnonymousClass0CC.wU.H(this.f59637M)).booleanValue()) {
                AnonymousClass1c0 B = AnonymousClass1c0.B(this.f59631G, this.f59637M);
                this.f59628D = B;
                B.c(1.0f);
                this.f59628D.f20554L = this;
            } else {
                AnonymousClass1c0 anonymousClass1hc = new AnonymousClass1hc();
                this.f59628D = anonymousClass1hc;
                anonymousClass1hc.f20553K = this;
            }
            this.f59628D.f20552J = this;
            this.f59628D.f20546D = this;
        } else {
            m25652G();
        }
        this.f59626B = anonymousClass53V;
        try {
            this.f59628D.W(Uri.parse(str), Integer.toHexString(str.hashCode()), false, AnonymousClass53X.class.getName());
            this.f59627C = str;
            this.f59628D.Q();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void Mz(AnonymousClass1c0 anonymousClass1c0) {
        AnonymousClass53V anonymousClass53V = this.f59626B;
        if (anonymousClass53V != null) {
            anonymousClass53V.Hi();
        }
    }

    public final void Sh(AnonymousClass1c0 anonymousClass1c0) {
        m25645B();
        AnonymousClass53V anonymousClass53V = this.f59626B;
        if (anonymousClass53V != null) {
            anonymousClass53V.Ei();
        }
    }

    public final void Sz(AnonymousClass1c0 anonymousClass1c0, long j) {
        Mz(this.f59628D);
    }

    public final void fu(AnonymousClass1c0 anonymousClass1c0, long j) {
        this.f59633I = true;
        AnonymousClass53V anonymousClass53V = this.f59626B;
        if (anonymousClass53V != null) {
            anonymousClass53V.Gi(anonymousClass1c0.E());
        }
        int i = this.f59634J;
        if (i != -1) {
            m25653H(i);
            this.f59634J = -1;
        }
        if (this.f59635K) {
            m25646C();
            this.f59635K = false;
        }
    }
}
