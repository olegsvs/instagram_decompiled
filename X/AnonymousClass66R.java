package X;

import java.util.Set;

/* renamed from: X.66R */
public final class AnonymousClass66R extends AnonymousClass3AL {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6G3 f71815B;
    /* renamed from: C */
    public final /* synthetic */ Set f71816C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Ci f71817D;

    public AnonymousClass66R(AnonymousClass6G3 anonymousClass6G3, Set set, AnonymousClass0Ci anonymousClass0Ci) {
        this.f71815B = anonymousClass6G3;
        this.f71816C = set;
        this.f71817D = anonymousClass0Ci;
    }

    /* renamed from: A */
    public final void m29012A(Exception exception) {
        this.f71815B.f73543B.remove(this.f71817D.getId());
        this.f71815B.f73548G.m26349B();
        this.f71815B.f73548G.m26352E(this.f71817D.uT());
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void m29013B(Object obj) {
        AnonymousClass3oZ anonymousClass3oZ = (AnonymousClass3oZ) obj;
        AnonymousClass1ax anonymousClass1ax = this.f71815B.f71811D;
        String str = (String) AnonymousClass0LH.E(anonymousClass3oZ.f44809B);
        long DI = this.f71815B.f73547F.DI();
        Iterable iterable = this.f71816C;
        AnonymousClass3AG anonymousClass66Q = new AnonymousClass66Q(this, this);
        AnonymousClass0Cn anonymousClass0Cn = anonymousClass1ax.f20394G;
        String str2 = anonymousClass1ax.f20392E;
        String str3 = anonymousClass1ax.f20391D;
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        AnonymousClass0GA H = anonymousClass0Pt.L("live/%s/invite/", new Object[]{str}).D("invitees", AnonymousClass0RR.B(',').A(iterable)).D("encoded_server_data_info", str2).D("device_id", str3).D("offset_to_video_start", AnonymousClass0Pz.F(DI)).M(AnonymousClass0Pv.class).N().H();
        H.f2849B = AnonymousClass1ax.C(anonymousClass1ax, "Inviting To Broadcast", anonymousClass66Q);
        AnonymousClass0Px.B(anonymousClass1ax.f20390C, anonymousClass1ax.f20393F, H);
    }
}
