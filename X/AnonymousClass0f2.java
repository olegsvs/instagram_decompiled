package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0f2 */
public final class AnonymousClass0f2 extends AnonymousClass0el {
    /* renamed from: B */
    private AnonymousClass0em f7855B;

    /* renamed from: H */
    public final String mo1523H() {
        return "PendingReelPollVoteStore";
    }

    public AnonymousClass0f2(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0em anonymousClass0em) {
        super(anonymousClass0Cm);
        this.f7855B = anonymousClass0em;
    }

    /* renamed from: B */
    public static AnonymousClass0f2 m6474B(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0dL B = AnonymousClass0dL.m6024B(anonymousClass0Cm);
        AnonymousClass0f2 anonymousClass0f2 = (AnonymousClass0f2) B.m6025A(AnonymousClass0f2.class);
        if (anonymousClass0f2 != null) {
            return anonymousClass0f2;
        }
        AnonymousClass0el anonymousClass0f22 = new AnonymousClass0f2(anonymousClass0Cm, new AnonymousClass0em(AnonymousClass0EV.f1977B, "pending_reel_poll_votes", new AnonymousClass0f3()));
        B.m6027C(AnonymousClass0f2.class, anonymousClass0f22);
        return anonymousClass0f22;
    }

    /* renamed from: B */
    public final void mo1522B() {
        AnonymousClass1CX anonymousClass1CX = (AnonymousClass1CX) this.f7855B.m6427A(m6475C(), true);
        if (!(anonymousClass1CX == null || anonymousClass1CX.f15526B == null)) {
            Map hashMap = new HashMap();
            for (AnonymousClass3gU anonymousClass3gU : anonymousClass1CX.f15526B) {
                hashMap.put(anonymousClass3gU.f43278D, anonymousClass3gU);
            }
            m6421L(hashMap);
            m6476D();
            Integer.valueOf(hashMap.size());
        }
        this.f7855B.m6428B(m6475C());
    }

    /* renamed from: C */
    private String m6475C() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("pending_reel_poll_votes_");
        stringBuilder.append(this.f7836E.f1759C);
        return stringBuilder.toString();
    }

    /* renamed from: D */
    private synchronized void m6476D() {
        Integer.valueOf(m6413D());
        List<String> G = m6416G();
        List arrayList = new ArrayList();
        for (String C : G) {
            AnonymousClass3gU anonymousClass3gU = (AnonymousClass3gU) m6412C(C);
            if (anonymousClass3gU != null) {
                Integer.valueOf(anonymousClass3gU.f43280F);
                m6483R(anonymousClass3gU);
                AnonymousClass0Iu C2 = AnonymousClass0Jd.f2931B.mo629C(this.f7836E, anonymousClass3gU.f43277C, anonymousClass3gU.f43278D, anonymousClass3gU.f43280F, anonymousClass3gU.f43279E);
                C2.f2849B = new AnonymousClass3gV(this, anonymousClass3gU);
                arrayList.add(C2);
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            AnonymousClass0dL.m6024B(this.f7836E).m6029E((AnonymousClass0Iu) arrayList.get(i));
        }
    }

    /* renamed from: M */
    public final void mo1524M() {
        this.f7855B.m6428B(m6475C());
    }

    /* renamed from: O */
    public final synchronized void mo1525O(AnonymousClass0dv anonymousClass0dv) {
        if (m6413D() > 0 && anonymousClass0dv != null) {
            anonymousClass0dv.onRetry(this.f7833B, "pending_reel_poll_votes", m6413D());
        }
        m6476D();
    }

    /* renamed from: P */
    public final void mo1526P() {
        Integer.valueOf(m6413D());
        AnonymousClass1CX anonymousClass1CX = new AnonymousClass1CX();
        anonymousClass1CX.f15526B = m6409E();
        this.f7855B.m6430D(m6475C(), anonymousClass1CX);
    }

    /* renamed from: Q */
    public final Integer m6482Q(AnonymousClass160 anonymousClass160) {
        if (this.f7833B == null) {
            m6419J();
        }
        if (m6410A(anonymousClass160.f14397D)) {
            return Integer.valueOf(((AnonymousClass3gU) m6412C(anonymousClass160.f14397D)).f43280F);
        }
        return anonymousClass160.f14401H;
    }

    /* renamed from: R */
    public final boolean m6483R(AnonymousClass3gU anonymousClass3gU) {
        if (!m6410A(anonymousClass3gU.f43278D)) {
            return false;
        }
        m6423N(anonymousClass3gU.f43278D);
        return true;
    }
}
