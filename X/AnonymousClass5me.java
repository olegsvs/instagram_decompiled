package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.5me */
public final class AnonymousClass5me {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1fo f68916B;
    /* renamed from: C */
    public final /* synthetic */ boolean f68917C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Ci f68918D;

    public AnonymousClass5me(AnonymousClass1fo anonymousClass1fo, AnonymousClass0Ci anonymousClass0Ci, boolean z) {
        this.f68916B = anonymousClass1fo;
        this.f68918D = anonymousClass0Ci;
        this.f68917C = z;
    }

    /* renamed from: A */
    public final void m28428A(AnonymousClass1IN anonymousClass1IN) {
        AnonymousClass1fo anonymousClass1fo = this.f68916B;
        AnonymousClass0Ci anonymousClass0Ci = this.f68918D;
        boolean z = this.f68917C;
        AnonymousClass0Ci B = anonymousClass1fo.f21270T.B();
        Object obj = (anonymousClass1IN.f16861C == AnonymousClass1IO.USER && B != null && B.getId().equals(anonymousClass1IN.f16862D.f17226B)) ? 1 : null;
        if (obj != null && !z) {
            Context C = AnonymousClass1fo.C(anonymousClass1fo);
            AnonymousClass5pV anonymousClass5pV = new AnonymousClass5pV(anonymousClass1fo, anonymousClass0Ci, anonymousClass1IN);
            Resources resources = C.getResources();
            new AnonymousClass0Sb(C).G(AnonymousClass3Lc.B(resources), new AnonymousClass3Lb(resources, anonymousClass5pV)).E(true).F(true).C().show();
        } else if (obj == null || !z) {
            if (anonymousClass1IN.f16861C == AnonymousClass1IO.HASHTAG) {
                AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass1fo.f21252B);
                anonymousClass0IZ.f2754D = AnonymousClass3Qs.f41179B.A().m25253A(anonymousClass1IN.f16860B);
                anonymousClass0IZ.B();
            } else if (anonymousClass1IN.f16861C == AnonymousClass1IO.USER) {
                AnonymousClass0IZ anonymousClass0IZ2 = new AnonymousClass0IZ(anonymousClass1fo.f21252B);
                anonymousClass0IZ2.f2754D = AnonymousClass0Jj.f2938B.B().D(AnonymousClass0bx.C(anonymousClass1fo.f21270T, anonymousClass1IN.f16862D.f17226B, "profile_bio_user_tag").A());
                anonymousClass0IZ2.f2753C = "profile_bio_tagged_user";
                anonymousClass0IZ2.B();
            }
        }
        if (anonymousClass1IN.f16861C == AnonymousClass1IO.USER) {
            AnonymousClass1Kp anonymousClass1Kp = anonymousClass1IN.f16862D;
            String str = anonymousClass1Kp.f17226B;
            String str2 = anonymousClass1Kp.f17227C;
            String id = anonymousClass0Ci.getId();
            boolean L = AnonymousClass0Cd.f1698B.L(anonymousClass1Kp.f17226B);
            AnonymousClass0NN B2 = AnonymousClass5nH.m28451B("user", str, str2, id, anonymousClass1fo.f21259I);
            B2.H("is_mas", L);
            B2.R();
            return;
        }
        Hashtag hashtag = anonymousClass1IN.f16860B;
        String str3 = hashtag.f2786F;
        String str4 = hashtag.f2793M;
        String id2 = anonymousClass0Ci.getId();
        AnonymousClass5nH.m28451B("hashtag", str3, str4, id2, anonymousClass1fo.f21259I).R();
        AnonymousClass1gV.E(anonymousClass1fo.f21259I, "tap_profile_bio_hashtag_link", AnonymousClass1fo.D(anonymousClass1fo), id2, anonymousClass1fo.f21266P, anonymousClass1fo.f21267Q, str3, str4, null);
    }
}
