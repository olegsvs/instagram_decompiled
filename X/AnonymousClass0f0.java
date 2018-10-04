package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0f0 */
public final class AnonymousClass0f0 extends AnonymousClass0el {
    /* renamed from: B */
    private AnonymousClass0em f7854B;

    /* renamed from: H */
    public final String mo1523H() {
        return "PendingCommentStore";
    }

    public AnonymousClass0f0(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0em anonymousClass0em) {
        super(anonymousClass0Cm);
        this.f7854B = anonymousClass0em;
    }

    /* renamed from: B */
    public static AnonymousClass0f0 m6464B(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0dL B = AnonymousClass0dL.m6024B(anonymousClass0Cm);
        AnonymousClass0f0 anonymousClass0f0 = (AnonymousClass0f0) B.m6025A(AnonymousClass0f0.class);
        if (anonymousClass0f0 != null) {
            return anonymousClass0f0;
        }
        AnonymousClass0el anonymousClass0f02 = new AnonymousClass0f0(anonymousClass0Cm, new AnonymousClass0em(AnonymousClass0EV.f1977B, "pending_comments", new AnonymousClass0f1()));
        B.m6027C(AnonymousClass0f0.class, anonymousClass0f02);
        return anonymousClass0f02;
    }

    /* renamed from: B */
    public final void mo1522B() {
        AnonymousClass1CV anonymousClass1CV = (AnonymousClass1CV) this.f7854B.m6427A(m6465C(), true);
        if (!(anonymousClass1CV == null || anonymousClass1CV.f15525B == null)) {
            Map hashMap = new HashMap();
            for (AnonymousClass3gE anonymousClass3gE : anonymousClass1CV.f15525B) {
                anonymousClass3gE.f43256B.f4907a = AnonymousClass0zV.RetryWhenNetworkAvailable;
                hashMap.put(anonymousClass3gE.f43256B.XP(), anonymousClass3gE);
            }
            Integer.valueOf(hashMap.size());
            m6421L(hashMap);
            m6466D();
        }
        this.f7854B.m6428B(m6465C());
    }

    /* renamed from: C */
    private String m6465C() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("pending_comments_");
        stringBuilder.append(this.f7836E.f1759C);
        return stringBuilder.toString();
    }

    /* renamed from: D */
    private synchronized void m6466D() {
        AnonymousClass0LH.m2927E(this.f7833B);
        List<String> G = m6416G();
        List arrayList = new ArrayList();
        for (String C : G) {
            AnonymousClass3gE anonymousClass3gE = (AnonymousClass3gE) m6412C(C);
            if (anonymousClass3gE != null) {
                anonymousClass3gE.f43256B.XP();
                m6472Q(anonymousClass3gE.f43256B.XP());
                Context context = this.f7833B;
                AnonymousClass0Iu C2 = AnonymousClass0xt.m8591C(anonymousClass3gE.f43256B, anonymousClass3gE.f43257C, anonymousClass3gE.f43259E, AnonymousClass0Dt.m1305B(context), this.f7836E);
                C2.f2849B = new AnonymousClass3gF(this, anonymousClass3gE);
                arrayList.add(C2);
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            AnonymousClass0Ix.m2384D((AnonymousClass0GA) arrayList.get(i));
        }
    }

    /* renamed from: M */
    public final void mo1524M() {
        this.f7854B.m6428B(m6465C());
    }

    /* renamed from: O */
    public final void mo1525O(AnonymousClass0dv anonymousClass0dv) {
        if (anonymousClass0dv != null && m6413D() > 0) {
            anonymousClass0dv.onRetry(this.f7833B, "pending_comments", m6413D());
        }
        m6466D();
    }

    /* renamed from: P */
    public final void mo1526P() {
        Integer.valueOf(m6413D());
        AnonymousClass1CV anonymousClass1CV = new AnonymousClass1CV();
        anonymousClass1CV.f15525B = m6409E();
        this.f7854B.m6430D(m6465C(), anonymousClass1CV);
    }

    /* renamed from: Q */
    public final void m6472Q(String str) {
        if (m6410A(str)) {
            m6423N(str);
        }
    }

    /* renamed from: R */
    public final void m6473R(AnonymousClass3gE anonymousClass3gE) {
        if (!m6410A(anonymousClass3gE.f43256B.XP())) {
            anonymousClass3gE.f43256B.XP();
            m6420K(anonymousClass3gE.f43256B.XP(), anonymousClass3gE);
        }
    }
}
