package X;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;

/* renamed from: X.66C */
public final class AnonymousClass66C {
    /* renamed from: B */
    public String f71716B;
    /* renamed from: C */
    public AnonymousClass6G0 f71717C;
    /* renamed from: D */
    public Handler f71718D;
    /* renamed from: E */
    public int f71719E;
    /* renamed from: F */
    public long f71720F;
    /* renamed from: G */
    public boolean f71721G;
    /* renamed from: H */
    private Context f71722H;
    /* renamed from: I */
    private boolean f71723I;
    /* renamed from: J */
    private AnonymousClass0QL f71724J;
    /* renamed from: K */
    private final AnonymousClass2EC f71725K;
    /* renamed from: L */
    private AnonymousClass0Fz f71726L;
    /* renamed from: M */
    private final AnonymousClass0Cm f71727M;

    public AnonymousClass66C(Context context, AnonymousClass0Fz anonymousClass0Fz, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass6G0 anonymousClass6G0, AnonymousClass0QL anonymousClass0QL, AnonymousClass2EC anonymousClass2EC, boolean z) {
        this.f71722H = context;
        this.f71726L = anonymousClass0Fz;
        this.f71725K = anonymousClass2EC;
        this.f71717C = anonymousClass6G0;
        this.f71724J = anonymousClass0QL;
        this.f71723I = z;
        this.f71727M = anonymousClass0Cm;
    }

    /* renamed from: A */
    public final void m28982A() {
        if (this.f71716B == null) {
            AnonymousClass0Gn.C("IgLiveReactionsFetcher", "BroadcastId null in fetchLikeCount");
            return;
        }
        AnonymousClass0Cn anonymousClass0Cn = this.f71727M;
        long j = this.f71720F;
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        AnonymousClass0GA H = anonymousClass0Pt.L("live/%s/get_like_count/", new Object[]{r6}).D("like_ts", Long.toString(j)).M(AnonymousClass5Mf.class).H();
        H.f2849B = new AnonymousClass66B(this);
        AnonymousClass0Px.B(this.f71722H, this.f71726L, H);
    }

    /* renamed from: B */
    public static void m28981B(AnonymousClass66C anonymousClass66C) {
        String str = anonymousClass66C.f71716B;
        if (str == null) {
            AnonymousClass0Gn.C("IgLiveReactionsFetcher", "BroadcastId null in fetchViewCount");
            return;
        }
        AnonymousClass0GA H;
        if (anonymousClass66C.f71723I) {
            H = AnonymousClass0Pz.E(anonymousClass66C.f71727M, str).D("offset_to_video_start", AnonymousClass0Pz.F(anonymousClass66C.f71724J.DI())).H();
        } else {
            AnonymousClass0Cm anonymousClass0Cm = anonymousClass66C.f71727M;
            AnonymousClass2EC anonymousClass2EC = anonymousClass66C.f71725K;
            H = AnonymousClass0Pz.E(anonymousClass0Cm, str).D("live_with_eligibility", anonymousClass2EC != null ? anonymousClass2EC.A() : null).H();
        }
        H.f2849B = new AnonymousClass669(anonymousClass66C, SystemClock.elapsedRealtime());
        AnonymousClass0Px.B(anonymousClass66C.f71722H, anonymousClass66C.f71726L, H);
    }
}
