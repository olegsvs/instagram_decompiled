package X;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.instagram.nux.impl.OnboardingActivity;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.0GN */
public final class AnonymousClass0GN extends AnonymousClass0GO {
    /* renamed from: B */
    public AnonymousClass0Og f2356B = new AnonymousClass0Og();
    /* renamed from: C */
    private AnonymousClass0Op f2357C;

    /* renamed from: A */
    public final AnonymousClass0Op mo343A() {
        if (this.f2357C == null) {
            this.f2357C = new AnonymousClass0Op();
        }
        return this.f2357C;
    }

    /* renamed from: B */
    public final void mo344B(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Oh anonymousClass0Oh, AnonymousClass0Ol anonymousClass0Ol) {
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        this.f2356B.f3915D = anonymousClass0Cm;
        AnonymousClass0Og anonymousClass0Og = this.f2356B;
        AnonymousClass0Oh anonymousClass0Oh2 = anonymousClass0Oh;
        anonymousClass0Og.f3914C = anonymousClass0Oh;
        this.f2356B.f3913B = 0;
        Context context2 = context;
        if (((Boolean) AnonymousClass0E6.m1316B(AnonymousClass0CC.lb)).booleanValue()) {
            m1799B(context2, false, r2.f2356B.m3635D(), true, anonymousClass0Cm2, anonymousClass0Oh2, AnonymousClass0Oi.START);
        }
        AnonymousClass0Oj.m3640C(context2.getApplicationContext(), r2.f2356B, anonymousClass0Ol);
        Intent intent = new Intent().setClass(context2, OnboardingActivity.class);
        intent.putExtra("IS_SIGN_UP_FLOW", true);
        intent.putExtra("IgSessionManager.USER_ID", anonymousClass0Cm.f1759C);
        AnonymousClass0IW.m2243I(intent, context2);
    }

    /* renamed from: B */
    private void m1799B(Context context, boolean z, boolean z2, boolean z3, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Oh anonymousClass0Oh, AnonymousClass0Oi anonymousClass0Oi) {
        AnonymousClass0Og anonymousClass0Og = this.f2356B;
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        Object obj = (!(anonymousClass0Og.m3634C() == null && anonymousClass0Cm == null) && (anonymousClass0Cm == null || !anonymousClass0Cm2.f1759C.equals(anonymousClass0Og.m3634C()))) ? null : 1;
        if (obj == null) {
            AnonymousClass0Og anonymousClass0Og2 = new AnonymousClass0Og();
            this.f2356B = anonymousClass0Og2;
            anonymousClass0Og2.f3915D = anonymousClass0Cm2;
        }
        Context context2 = context;
        Collection arrayList = new ArrayList(AnonymousClass0Oj.m3640C(context, this.f2356B, null).f3930C.values());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AnonymousClass0GA B = AnonymousClass0On.m3650B(this.f2356B.m3633B(), context2, z, z2, AnonymousClass0Om.m3648F(), z3, anonymousClass0Oi, anonymousClass0Oh, arrayList);
        B.f2849B = new AnonymousClass0Oo(this, context, elapsedRealtime);
        AnonymousClass0Ix.m2384D(B);
    }

    /* renamed from: C */
    public final void mo345C(Context context, boolean z, boolean z2, boolean z3, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Oh anonymousClass0Oh) {
        m1799B(context, z, z2, z3, anonymousClass0Cm, anonymousClass0Oh, AnonymousClass0Oi.PREFETCH);
    }
}
