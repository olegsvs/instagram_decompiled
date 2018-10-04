package X;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.6HU */
public final class AnonymousClass6HU extends AnonymousClass6GD {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6GI f74090B;

    public AnonymousClass6HU(AnonymousClass6GI anonymousClass6GI) {
        this.f74090B = anonymousClass6GI;
    }

    /* renamed from: A */
    public final void mo6808A(AnonymousClass0Pq anonymousClass0Pq) {
        AnonymousClass0Jd.f2931B.M(this.f74090B.f73689V).D(this.f74090B.f73669B).f3388U.f4149C = anonymousClass0Pq;
        AnonymousClass6GO anonymousClass6GO = this.f74090B.f73681N;
        if (AnonymousClass0Qg.C(anonymousClass6GO.f73733B)) {
            anonymousClass6GO.f73733B.f4419N.B(anonymousClass0Pq);
        }
    }

    /* renamed from: B */
    public final void mo6814B(Set set, int i) {
        AnonymousClass6GO anonymousClass6GO = this.f74090B.f73681N;
        if (anonymousClass6GO.f73733B.f4409D != null && set != null && !anonymousClass6GO.f73733B.f4427V.equals(set)) {
            anonymousClass6GO.f73733B.f4427V = new HashSet();
            Collection hashSet = new HashSet();
            for (String str : set) {
                AnonymousClass0Ci B = AnonymousClass0Cg.f1704B.B(str);
                if (B == null) {
                    AnonymousClass1EF.f15875C.A(str, null, anonymousClass6GO.f73733B.f4431Z);
                } else {
                    anonymousClass6GO.f73733B.f4427V.add(str);
                    hashSet.add(B);
                }
            }
            if (!hashSet.equals(anonymousClass6GO.f73733B.f4410E.F())) {
                AnonymousClass0Pm anonymousClass0Pm = anonymousClass6GO.f73733B.f4410E;
                anonymousClass0Pm.f4150D.clear();
                anonymousClass0Pm.f4150D.addAll(hashSet);
                long DI = ((long) (i * JsonMappingException.MAX_REFS_TO_LIST)) - anonymousClass6GO.f73733B.f4420O.DI();
                AnonymousClass0OR.G(anonymousClass6GO.f73733B.f4415J, anonymousClass6GO.f73733B.f4430Y, -145721644);
                AnonymousClass0OR.F(anonymousClass6GO.f73733B.f4415J, anonymousClass6GO.f73733B.f4430Y, DI, -615240230);
            }
        }
    }

    /* renamed from: D */
    public final void mo6810D(boolean z, String str) {
        AnonymousClass6GO anonymousClass6GO = this.f74090B.f73681N;
        anonymousClass6GO.f73733B.f4424S = str;
        anonymousClass6GO.f73733B.f4416K = z;
        if (z && "ssi_reason".equals(str)) {
            AnonymousClass1R2 anonymousClass1R2 = anonymousClass6GO.f73733B.f4419N;
            anonymousClass1R2.f18507H = true;
            AnonymousClass1R2.B(anonymousClass1R2);
        }
    }

    /* renamed from: E */
    public final void mo6815E(boolean z) {
        AnonymousClass67B anonymousClass67B = this.f74090B.f73676I;
        if (anonymousClass67B.f73628H && !z) {
            anonymousClass67B.f71917F.m26306U(AnonymousClass5NW.SendJoinRequest);
            anonymousClass67B.f71917F.m26306U(AnonymousClass5NW.SentJoinRequest);
        }
        anonymousClass67B.f73628H = z;
    }

    /* renamed from: G */
    public final void mo6812G(int i, int i2) {
        AnonymousClass0Jd.f2931B.M(this.f74090B.f73689V).D(this.f74090B.f73669B).f3388U.f4175c = i;
        AnonymousClass6GO anonymousClass6GO = this.f74090B.f73681N;
        if (anonymousClass6GO.f73733B.f4409D != null) {
            anonymousClass6GO.f73733B.f4409D.f14057I.setText(AnonymousClass3nt.C(Integer.valueOf(Math.max(1, i))));
        }
        anonymousClass6GO.f73733B.f4411F.mVideoPlayer.f18541J.B(i);
    }
}
