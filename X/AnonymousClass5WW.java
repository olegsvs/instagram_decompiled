package X;

import android.content.Context;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.5WW */
public final class AnonymousClass5WW implements AnonymousClass0U2, AnonymousClass4iL {
    /* renamed from: E */
    public static final AnonymousClass0U3 f65638E = new AnonymousClass4hu();
    /* renamed from: B */
    public final Context f65639B;
    /* renamed from: C */
    public final AnonymousClass0Tw f65640C;
    /* renamed from: D */
    public final AnonymousClass0Cm f65641D;

    public AnonymousClass5WW(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Tw anonymousClass0Tw) {
        this.f65639B = context;
        this.f65641D = anonymousClass0Cm;
        this.f65640C = anonymousClass0Tw;
    }

    public final /* bridge */ /* synthetic */ void BV(AnonymousClass0U0 anonymousClass0U0, AnonymousClass0VN anonymousClass0VN) {
        AnonymousClass0Xa.E(this.f65639B, this.f65641D, this.f65640C, (AnonymousClass4jq) anonymousClass0U0, anonymousClass0VN);
    }

    public final void CF(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Tz anonymousClass0Tz, AnonymousClass0OA anonymousClass0OA, AnonymousClass0XZ anonymousClass0XZ) {
        AnonymousClass0Tz anonymousClass0Tz2 = anonymousClass0Tz;
        List list = anonymousClass0Tz.f5321D;
        boolean z = true;
        if (list.size() != 1) {
            z = false;
        }
        AnonymousClass0LH.B(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) list.get(0);
        AnonymousClass0V0 F = anonymousClass0Tz.F();
        String str = anonymousClass0Tz.f5319B;
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        AnonymousClass0GA H = AnonymousClass0ZM.D(anonymousClass0Cm, anonymousClass0OA, directThreadKey, anonymousClass0Tz.f5319B).M(AnonymousClass1I0.class).H();
        H.f2849B = new AnonymousClass4hv(this, anonymousClass0Cm2, anonymousClass0XZ, directThreadKey, F, str, anonymousClass0Tz2);
        AnonymousClass0Ix.D(H);
    }

    public final void CV(AnonymousClass0U0 anonymousClass0U0) {
        AnonymousClass4jq anonymousClass4jq = (AnonymousClass4jq) anonymousClass0U0;
    }

    public final /* bridge */ /* synthetic */ void KMA(AnonymousClass0U0 anonymousClass0U0, AnonymousClass0db anonymousClass0db, AnonymousClass0XZ anonymousClass0XZ) {
        AnonymousClass4jq anonymousClass4jq = (AnonymousClass4jq) anonymousClass0U0;
        AnonymousClass4iM.C(this.f65641D, anonymousClass4jq, anonymousClass4jq.f56696B.f5941E.UB, anonymousClass0db, anonymousClass0XZ, this);
    }

    public final /* bridge */ /* synthetic */ boolean UC(AnonymousClass0U0 anonymousClass0U0) {
        return AnonymousClass0Xa.B(this.f65641D.B(), this.f65640C, (AnonymousClass4jq) anonymousClass0U0);
    }

    public final /* bridge */ /* synthetic */ void mJA(AnonymousClass0U0 anonymousClass0U0) {
        AnonymousClass0Xa.F(this.f65640C, (AnonymousClass4jq) anonymousClass0U0);
    }
}
