package X;

import android.os.SystemClock;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.18J */
public final class AnonymousClass18J {
    /* renamed from: B */
    public final Set f14895B = new HashSet();
    /* renamed from: C */
    public boolean f14896C = false;
    /* renamed from: D */
    public boolean f14897D;
    /* renamed from: E */
    public final AnonymousClass18K f14898E;
    /* renamed from: F */
    public boolean f14899F;
    /* renamed from: G */
    public boolean f14900G;
    /* renamed from: H */
    public String f14901H;
    /* renamed from: I */
    public AnonymousClass5Uu f14902I;
    /* renamed from: J */
    public final AnonymousClass0IP f14903J = AnonymousClass0Ix.m2382B();
    /* renamed from: K */
    public final AnonymousClass0Tw f14904K;
    /* renamed from: L */
    public final AnonymousClass0Cm f14905L;

    public AnonymousClass18J(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass18K anonymousClass18K) {
        this.f14905L = anonymousClass0Cm;
        this.f14904K = AnonymousClass0Tw.m4598C(anonymousClass0Cm);
        this.f14898E = anonymousClass18K;
    }

    /* renamed from: A */
    public final void m9552A() {
        if (!this.f14900G && !this.f14899F && this.f14897D) {
            m9555D();
            AnonymousClass5Uu anonymousClass5Uu = this.f14902I;
            if (anonymousClass5Uu != null) {
                AnonymousClass0EE anonymousClass0EE = anonymousClass5Uu.f65097B.f14920I;
                int tS = anonymousClass5Uu.f65097B.f14913B.tS();
                int kT = anonymousClass5Uu.f65097B.f14913B.kT();
                AnonymousClass0NN.m3291B("direct_inbox_page_scroll", anonymousClass0EE).m3294B("num_threads", tS).m3294B("num_threads_unseen", kT).m3300H("vc_multitask", AnonymousClass0JS.f2919B.mo587I(anonymousClass5Uu.f65097B.f14942e, anonymousClass5Uu.f65097B.f14920I.getContext())).m3310R();
            }
        }
    }

    /* renamed from: B */
    public final synchronized void m9553B() {
        this.f14896C = false;
    }

    /* renamed from: C */
    public final void m9554C(boolean z) {
        AnonymousClass0IP anonymousClass0IP = this.f14903J;
        AnonymousClass0GA C = AnonymousClass18L.m9557C(this.f14905L, this.f14898E, null, null, z ^ 1, AnonymousClass0Ws.m5169B(this.f14904K.m4627Y()));
        C.f2849B = new AnonymousClass18N(this, this.f14905L, false, SystemClock.elapsedRealtime());
        anonymousClass0IP.schedule(C);
    }

    /* renamed from: D */
    public final void m9555D() {
        AnonymousClass18J anonymousClass18J = this;
        AnonymousClass0IP anonymousClass0IP = this.f14903J;
        AnonymousClass0GA C = AnonymousClass18L.m9557C(this.f14905L, this.f14898E, this.f14901H, AnonymousClass0Vr.OLDER, false, AnonymousClass0Ws.m5169B(this.f14904K.m4627Y()));
        C.f2849B = new AnonymousClass18N(anonymousClass18J, this.f14905L, this.f14901H != null, SystemClock.elapsedRealtime());
        anonymousClass0IP.schedule(C);
    }
}
