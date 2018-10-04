package X;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.proxygen.TraceFieldType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.66J */
public final class AnonymousClass66J implements AnonymousClass5MK {
    /* renamed from: B */
    public AnonymousClass5MD f71769B;
    /* renamed from: C */
    public final Context f71770C;
    /* renamed from: D */
    public Long f71771D;
    /* renamed from: E */
    public final AtomicLong f71772E = new AtomicLong(0);
    /* renamed from: F */
    public AnonymousClass3FY f71773F;
    /* renamed from: G */
    public final Handler f71774G = new Handler();
    /* renamed from: H */
    public final AtomicBoolean f71775H = new AtomicBoolean(false);
    /* renamed from: I */
    public AnonymousClass66G f71776I;
    /* renamed from: J */
    public final long f71777J;
    /* renamed from: K */
    public final AtomicInteger f71778K = new AtomicInteger(0);
    /* renamed from: L */
    public final AtomicLong f71779L = new AtomicLong(0);
    /* renamed from: M */
    public final Runnable f71780M = new AnonymousClass66F(this);
    /* renamed from: N */
    public long f71781N;
    /* renamed from: O */
    public boolean f71782O;
    /* renamed from: P */
    private final AnonymousClass1TV f71783P;
    /* renamed from: Q */
    private final String f71784Q;
    /* renamed from: R */
    private AnonymousClass5aZ f71785R;
    /* renamed from: S */
    private final String f71786S;
    /* renamed from: T */
    private final AnonymousClass0Nr f71787T;
    /* renamed from: U */
    private final String f71788U;
    /* renamed from: V */
    private final String f71789V;
    /* renamed from: W */
    private final AnonymousClass0EE f71790W;
    /* renamed from: X */
    private final AtomicInteger f71791X = new AtomicInteger(0);
    /* renamed from: Y */
    private final String f71792Y;
    /* renamed from: Z */
    private final AnonymousClass0NS f71793Z;

    public AnonymousClass66J(Context context, AnonymousClass0Nr anonymousClass0Nr, AnonymousClass0EE anonymousClass0EE, String str, String str2, String str3, String str4, String str5) {
        this.f71770C = context.getApplicationContext();
        this.f71790W = anonymousClass0EE;
        this.f71784Q = str;
        this.f71786S = str2;
        this.f71789V = str3;
        this.f71792Y = str4;
        this.f71777J = AnonymousClass0Gd.E();
        this.f71781N = 0;
        this.f71783P = AnonymousClass466.B();
        this.f71787T = anonymousClass0Nr;
        this.f71788U = str5;
        AnonymousClass0NS C = AnonymousClass0NS.C(getClass().getName(), anonymousClass0EE);
        this.f71793Z = C;
        C.G();
        AnonymousClass0Gn.B().A("last_broadcast_id", str);
        AnonymousClass0Gn.B().A("last_broadcast_waterfall_id", this.f71793Z.E());
        AnonymousClass5MF.m26321B();
        AnonymousClass0Gn.B().A("last_broadcast_type", "GUEST");
        this.f71776I = AnonymousClass66G.INIT;
    }

    /* renamed from: A */
    public final void m28992A() {
        AnonymousClass0NN C = AnonymousClass66J.m28986C(this, AnonymousClass66I.SUMMARY);
        AnonymousClass3FY anonymousClass3FY = this.f71773F;
        if (anonymousClass3FY != null) {
            C.D("face_effect_usage_stats", anonymousClass3FY.A());
        }
        C.R();
    }

    /* renamed from: B */
    public static AnonymousClass0NN m28985B(AnonymousClass66J anonymousClass66J, AnonymousClass66I anonymousClass66I) {
        AnonymousClass0NN F = anonymousClass66J.f71793Z.B("ig_cobroadcast_waterfall", anonymousClass66J.f71790W).F("step", anonymousClass66I.f71768B);
        String str = TraceFieldType.Duration;
        double E = (double) (AnonymousClass0Gd.E() - anonymousClass66J.f71777J);
        Double.isNaN(E);
        return F.A(str, E / 1000.0d).F(TraceFieldType.BroadcastId, anonymousClass66J.f71784Q).F("m_pk", anonymousClass66J.f71789V);
    }

    /* renamed from: B */
    public final void m28993B(AnonymousClass4u1 anonymousClass4u1, boolean z) {
        AnonymousClass5MQ.m26330E(AnonymousClass66J.m28986C(this, AnonymousClass66I.GOT_AUDIO_FOCUS), anonymousClass4u1).H("result", z).R();
    }

    /* renamed from: C */
    public static AnonymousClass0NN m28986C(AnonymousClass66J anonymousClass66J, AnonymousClass66I anonymousClass66I) {
        AnonymousClass0NN D = AnonymousClass66J.m28985B(anonymousClass66J, anonymousClass66I).F("a_pk", anonymousClass66J.f71786S).D("perf", AnonymousClass5MQ.m26332G(anonymousClass66J.f71787T, anonymousClass66J.f71785R, anonymousClass66J.f71783P));
        String str = "camera";
        AnonymousClass5MD anonymousClass5MD = anonymousClass66J.f71769B;
        AnonymousClass0NN F = D.F(str, anonymousClass5MD != null ? anonymousClass5MD.f62519B : JsonProperty.USE_DEFAULT_NAME).B("face_effect_enabled", Boolean.valueOf(anonymousClass66J.f71775H.get()).booleanValue()).F("network_connection", AnonymousClass0MM.B(AnonymousClass0MM.C(anonymousClass66J.f71770C, AnonymousClass0MM.f3405B))).F("a_i", "organic").H("is_live_streaming", true).F("invite_type", anonymousClass66J.f71788U).F("tracking_token", anonymousClass66J.f71792Y);
        long j = anonymousClass66J.f71779L.get();
        if (anonymousClass66J.f71775H.get()) {
            j += SystemClock.elapsedRealtime() - anonymousClass66J.f71772E.get();
        }
        AnonymousClass0NN B = AnonymousClass5MQ.m26327B(F, anonymousClass66J.f71791X.get(), anonymousClass66J.f71778K.get(), j);
        AnonymousClass5aZ anonymousClass5aZ = anonymousClass66J.f71785R;
        if (anonymousClass5aZ != null) {
            anonymousClass5aZ.m27720A(B);
        }
        return B;
    }

    /* renamed from: C */
    public final void m28994C(AnonymousClass66H anonymousClass66H, String str) {
        if (this.f71776I == AnonymousClass66G.ATTEMPT) {
            m28990G(anonymousClass66H, str);
        } else if (this.f71776I == AnonymousClass66G.STARTED) {
            m28992A();
            m28991H(anonymousClass66H, str);
        }
        this.f71782O = false;
        AnonymousClass0OR.G(this.f71774G, this.f71780M, 992521450);
    }

    /* renamed from: D */
    public static AnonymousClass0NN m28987D(AnonymousClass66J anonymousClass66J, AnonymousClass66I anonymousClass66I, AnonymousClass66H anonymousClass66H) {
        return AnonymousClass66J.m28986C(anonymousClass66J, anonymousClass66I).F("reason", anonymousClass66H.m28984A());
    }

    /* renamed from: D */
    public final void m28995D(String str, String str2, String str3, boolean z) {
        AnonymousClass5MQ.m26331F("IgLiveWithGuestWaterfall", AnonymousClass66J.m28986C(this, AnonymousClass66I.ERROR), 2000, str, str2, str3, null).R();
        if (!z) {
            return;
        }
        if (this.f71776I == AnonymousClass66G.ATTEMPT) {
            m28992A();
            m28990G(AnonymousClass66H.ERROR, str3);
        } else if (this.f71776I == AnonymousClass66G.STARTED) {
            m28991H(AnonymousClass66H.BROADCAST_FAILURE, str3);
        }
    }

    public final void DOA(AnonymousClass3FY anonymousClass3FY) {
        this.f71773F = anonymousClass3FY;
    }

    /* renamed from: E */
    public final void m28996E() {
        this.f71787T.E();
        if (this.f71782O) {
            AnonymousClass66J.m28989F(this);
        }
    }

    /* renamed from: E */
    public static void m28988E(AnonymousClass66J anonymousClass66J, AnonymousClass66G anonymousClass66G, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("invalid mJoinState; expected: ");
        stringBuilder.append(anonymousClass66G);
        stringBuilder.append(" actual: ");
        stringBuilder.append(anonymousClass66J.f71776I);
        stringBuilder.append(" description: ");
        stringBuilder.append(str);
        AnonymousClass0Gn.C("IgLiveWithGuestWaterfall", stringBuilder.toString());
    }

    /* renamed from: F */
    public static void m28989F(AnonymousClass66J anonymousClass66J) {
        AnonymousClass0OR.G(anonymousClass66J.f71774G, anonymousClass66J.f71780M, -1893378320);
        AnonymousClass0OR.F(anonymousClass66J.f71774G, anonymousClass66J.f71780M, (long) (((Integer) AnonymousClass0CC.SQ.G()).intValue() * JsonMappingException.MAX_REFS_TO_LIST), -2145157462);
    }

    /* renamed from: G */
    private void m28990G(AnonymousClass66H anonymousClass66H, String str) {
        if (this.f71776I == AnonymousClass66G.ATTEMPT) {
            AnonymousClass66J.m28987D(this, AnonymousClass66I.ABORTED, anonymousClass66H).F("reason_info", str).R();
            this.f71776I = AnonymousClass66G.ABORTED;
            return;
        }
        AnonymousClass66G anonymousClass66G = AnonymousClass66G.ATTEMPT;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("aborting broadcast. reason: ");
        stringBuilder.append(anonymousClass66H);
        stringBuilder.append(" reasonInfo: ");
        stringBuilder.append(str);
        AnonymousClass66J.m28988E(this, anonymousClass66G, stringBuilder.toString());
    }

    /* renamed from: H */
    private void m28991H(AnonymousClass66H anonymousClass66H, String str) {
        if (this.f71776I == AnonymousClass66G.STARTED) {
            AnonymousClass66J.m28987D(this, AnonymousClass66I.ENDED, anonymousClass66H).F("reason_info", str).R();
            this.f71776I = AnonymousClass66G.ENDED;
            return;
        }
        AnonymousClass66G anonymousClass66G = AnonymousClass66G.STARTED;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ending broadcast. reason: ");
        stringBuilder.append(anonymousClass66H);
        stringBuilder.append(" reasonInfo: ");
        stringBuilder.append(str);
        AnonymousClass66J.m28988E(this, anonymousClass66G, stringBuilder.toString());
    }

    public final void Na(boolean z, String str, String str2, String str3, String str4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z2 = z;
        if (z && !this.f71775H.get()) {
            this.f71772E.set(elapsedRealtime);
        } else if (!z && this.f71775H.get()) {
            this.f71779L.addAndGet(elapsedRealtime - this.f71772E.get());
        }
        if (z) {
            this.f71791X.incrementAndGet();
        }
        this.f71775H.set(z);
        AnonymousClass5MQ.m26329D(AnonymousClass66J.m28986C(this, AnonymousClass66I.FACE_EFFECT_UPDATED), z2, str, str2, str3, str4).R();
    }
}
