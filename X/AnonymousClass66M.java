package X;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.66M */
public final class AnonymousClass66M {
    /* renamed from: B */
    public String f71803B;
    /* renamed from: C */
    public String f71804C;
    /* renamed from: D */
    public Long f71805D;
    /* renamed from: E */
    public String f71806E;
    /* renamed from: F */
    private final AnonymousClass0EE f71807F;
    /* renamed from: G */
    private final AnonymousClass0NS f71808G;

    public AnonymousClass66M(Context context, AnonymousClass0EE anonymousClass0EE) {
        this.f71807F = anonymousClass0EE;
        AnonymousClass0NS C = AnonymousClass0NS.C(getClass().getName(), anonymousClass0EE);
        this.f71808G = C;
        C.G();
    }

    /* renamed from: A */
    public final void m29001A(AnonymousClass66K anonymousClass66K) {
        AnonymousClass66M.m28999B(this, AnonymousClass66L.INVITE_ACCEPTED).F("invite_type", anonymousClass66K.m28997A()).A("respond_time", m29000C()).R();
    }

    /* renamed from: B */
    public static AnonymousClass0NN m28999B(AnonymousClass66M anonymousClass66M, AnonymousClass66L anonymousClass66L) {
        return anonymousClass66M.f71808G.B("live_with_invite_waterfall", anonymousClass66M.f71807F).F("step", anonymousClass66L.m28998A()).F("a_pk", anonymousClass66M.f71804C).F(TraceFieldType.BroadcastId, anonymousClass66M.f71803B).F("m_pk", anonymousClass66M.f71806E);
    }

    /* renamed from: B */
    public final void m29002B(AnonymousClass66K anonymousClass66K) {
        AnonymousClass66M.m28999B(this, AnonymousClass66L.INVITE_REJECTED).F("invite_type", anonymousClass66K.m28997A()).A("respond_time", m29000C()).R();
    }

    /* renamed from: C */
    private double m29000C() {
        if (this.f71805D == null) {
            return Double.MAX_VALUE;
        }
        double elapsedRealtime = (double) (SystemClock.elapsedRealtime() - this.f71805D.longValue());
        Double.isNaN(elapsedRealtime);
        return elapsedRealtime / 1000.0d;
    }
}
