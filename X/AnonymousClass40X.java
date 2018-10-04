package X;

import android.support.v4.app.FragmentActivity;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.40X */
public class AnonymousClass40X implements AnonymousClass3Pl {
    /* renamed from: B */
    public final FragmentActivity f48298B;
    /* renamed from: C */
    private final AnonymousClass0EE f48299C;
    /* renamed from: D */
    private boolean f48300D;
    /* renamed from: E */
    private AnonymousClass2Na f48301E;
    /* renamed from: F */
    private final AnonymousClass0Cm f48302F;
    /* renamed from: G */
    private boolean f48303G;
    /* renamed from: H */
    private final Set f48304H;

    /* renamed from: B */
    public void m22031B() {
    }

    public void nv(String str, int i, AnonymousClass3Pk anonymousClass3Pk) {
    }

    public void rv(String str, int i) {
    }

    public AnonymousClass40X(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0EE anonymousClass0EE, FragmentActivity fragmentActivity) {
        this(anonymousClass0Cm, anonymousClass0EE, fragmentActivity, null);
    }

    public AnonymousClass40X(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0EE anonymousClass0EE, FragmentActivity fragmentActivity, AnonymousClass2Na anonymousClass2Na) {
        this.f48304H = new HashSet();
        this.f48302F = anonymousClass0Cm;
        this.f48299C = anonymousClass0EE;
        this.f48298B = fragmentActivity;
        this.f48300D = AnonymousClass1PJ.B(this.f48298B) != null;
        this.f48301E = anonymousClass2Na;
    }

    /* renamed from: A */
    public void m22030A() {
        this.f48304H.clear();
    }

    public void Ey(AnonymousClass0mW anonymousClass0mW, int i) {
        if (this.f48304H.add(anonymousClass0mW.f9808G.getId())) {
            int i2 = i;
            if (this.f48300D) {
                AnonymousClass0Fr.SuggestedUserImpression.C(this.f48301E).F("target_id", anonymousClass0mW.getId()).B("position", i).R();
            } else {
                AnonymousClass0mX.IMPRESSION.A(this.f48299C, anonymousClass0mW.getId(), anonymousClass0mW.f9810I, anonymousClass0mW.f9803B, anonymousClass0mW.f9807F, i2, true);
            }
            if (!this.f48303G) {
                AnonymousClass0F4.f2058E.B(new AnonymousClass0s4());
                AnonymousClass0Ix.D(AnonymousClass0s5.B(this.f48302F));
                this.f48303G = true;
            }
        }
    }

    public void em(AnonymousClass0mW anonymousClass0mW, int i) {
        int i2 = i;
        if (this.f48300D) {
            AnonymousClass0Fr.SuggestedUserFollowButtonTapped.C(this.f48301E).F("target_id", anonymousClass0mW.getId()).B("position", i).R();
        } else {
            AnonymousClass0mX.FOLLOW_TAP.A(this.f48299C, anonymousClass0mW.getId(), anonymousClass0mW.f9810I, anonymousClass0mW.f9803B, anonymousClass0mW.f9807F, i2, true);
        }
    }

    public void ri(AnonymousClass0mW anonymousClass0mW, int i) {
        AnonymousClass0Ix.D(AnonymousClass0ma.B(this.f48302F, anonymousClass0mW.f9808G.getId(), anonymousClass0mW.f9810I, anonymousClass0mW.f9803B));
        int i2 = i;
        if (this.f48300D) {
            AnonymousClass0Fr.SuggestedUserDismissButtonTapped.C(this.f48301E).F("target_id", anonymousClass0mW.getId()).B("position", i).R();
        } else {
            AnonymousClass0mX.DISMISS.A(this.f48299C, anonymousClass0mW.getId(), anonymousClass0mW.f9810I, anonymousClass0mW.f9803B, anonymousClass0mW.f9807F, i2, true);
        }
    }

    public void yEA(AnonymousClass0mW anonymousClass0mW, int i) {
        int i2 = i;
        if (this.f48300D) {
            AnonymousClass0Fr.SuggestedUserProfileTapped.C(this.f48301E).F("target_id", anonymousClass0mW.getId()).B("position", i).R();
            return;
        }
        AnonymousClass0mX.USER_TAP.A(this.f48299C, anonymousClass0mW.getId(), anonymousClass0mW.f9810I, anonymousClass0mW.f9803B, anonymousClass0mW.f9807F, i2, true);
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f48298B);
        anonymousClass0IZ.f2754D = AnonymousClass0Jj.f2938B.B().D(AnonymousClass0bx.C(this.f48302F, anonymousClass0mW.f9808G.getId(), "recommended_user").A());
        anonymousClass0IZ.B();
    }
}
