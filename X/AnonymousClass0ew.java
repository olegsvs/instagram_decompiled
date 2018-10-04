package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: X.0ew */
public final class AnonymousClass0ew extends AnonymousClass0el {
    /* renamed from: B */
    private AnonymousClass0em f7852B;

    /* renamed from: H */
    public final String mo1523H() {
        return "PendingSaveStore";
    }

    public AnonymousClass0ew(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0em anonymousClass0em) {
        super(anonymousClass0Cm);
        this.f7852B = anonymousClass0em;
    }

    /* renamed from: B */
    public static AnonymousClass0ew m6442B(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0dL B = AnonymousClass0dL.m6024B(anonymousClass0Cm);
        AnonymousClass0ew anonymousClass0ew = (AnonymousClass0ew) B.m6025A(AnonymousClass0ew.class);
        if (anonymousClass0ew != null) {
            return anonymousClass0ew;
        }
        AnonymousClass0el anonymousClass0ew2 = new AnonymousClass0ew(anonymousClass0Cm, new AnonymousClass0em(AnonymousClass0EV.f1977B, "pending_saves", new AnonymousClass0ex()));
        B.m6027C(AnonymousClass0ew.class, anonymousClass0ew2);
        return anonymousClass0ew2;
    }

    /* renamed from: B */
    public final void mo1522B() {
        AnonymousClass1CR anonymousClass1CR = (AnonymousClass1CR) this.f7852B.m6427A(m6443C(), true);
        if (!(anonymousClass1CR == null || anonymousClass1CR.f15523B == null)) {
            Map hashMap = new HashMap();
            for (AnonymousClass3gm anonymousClass3gm : anonymousClass1CR.f15523B) {
                hashMap.put(anonymousClass3gm.f43325F, anonymousClass3gm);
            }
            m6421L(hashMap);
            m6444D();
            Integer.valueOf(hashMap.size());
        }
        this.f7852B.m6428B(m6443C());
    }

    /* renamed from: C */
    private String m6443C() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("pending_saves_");
        stringBuilder.append(this.f7836E.f1759C);
        return stringBuilder.toString();
    }

    /* renamed from: D */
    private synchronized void m6444D() {
        Integer.valueOf(m6413D());
        List<String> G = m6416G();
        List arrayList = new ArrayList();
        for (String C : G) {
            AnonymousClass3gm anonymousClass3gm = (AnonymousClass3gm) m6412C(C);
            if (anonymousClass3gm != null) {
                m6453T(anonymousClass3gm);
                AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(this.f7836E);
                anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
                AnonymousClass0xE anonymousClass0xE = anonymousClass3gm.f43326G;
                if (anonymousClass0xE == null) {
                    anonymousClass0xE = AnonymousClass0xE.MEDIA;
                }
                anonymousClass0Pt.f4229M = anonymousClass0xE.m8516A(anonymousClass3gm.f43325F, anonymousClass3gm.f43324E);
                anonymousClass0Pt = anonymousClass0Pt.m3944M(AnonymousClass0Pv.class);
                String str = anonymousClass3gm.f43323D;
                if (str != null) {
                    anonymousClass0Pt.m3935D("radio_type", str);
                }
                HashMap hashMap = anonymousClass3gm.f43322C;
                if (hashMap != null) {
                    for (Entry entry : hashMap.entrySet()) {
                        anonymousClass0Pt.m3935D((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                AnonymousClass0Iu H = anonymousClass0Pt.m3945N().m3939H();
                H.f2849B = new AnonymousClass3gn(this, anonymousClass3gm);
                arrayList.add(H);
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            AnonymousClass0dL.m6024B(this.f7836E).m6029E((AnonymousClass0Iu) arrayList.get(i));
        }
    }

    /* renamed from: M */
    public final void mo1524M() {
        this.f7852B.m6428B(m6443C());
    }

    /* renamed from: O */
    public final void mo1525O(AnonymousClass0dv anonymousClass0dv) {
        if (m6413D() > 0 && anonymousClass0dv != null) {
            anonymousClass0dv.onRetry(this.f7833B, "pending_saves", m6413D());
        }
        m6444D();
    }

    /* renamed from: P */
    public final void mo1526P() {
        Integer.valueOf(m6413D());
        AnonymousClass1CR anonymousClass1CR = new AnonymousClass1CR();
        anonymousClass1CR.f15523B = m6409E();
        this.f7852B.m6430D(m6443C(), anonymousClass1CR);
    }

    /* renamed from: Q */
    public final AnonymousClass0x8 m6450Q(AnonymousClass0PA anonymousClass0PA) {
        return m6451R(anonymousClass0PA.getId(), anonymousClass0PA.FR());
    }

    /* renamed from: R */
    public final AnonymousClass0x8 m6451R(String str, AnonymousClass0x8 anonymousClass0x8) {
        if (this.f7833B == null) {
            m6419J();
        }
        if (!m6410A(str)) {
            return anonymousClass0x8;
        }
        return ((AnonymousClass3gm) m6412C(str)).f43324E.equals(AnonymousClass0x8.SAVED.toString()) ? AnonymousClass0x8.SAVED : AnonymousClass0x8.NOT_SAVED;
    }

    /* renamed from: S */
    public final boolean m6452S(AnonymousClass0PA anonymousClass0PA) {
        return m6450Q(anonymousClass0PA) == AnonymousClass0x8.SAVED;
    }

    /* renamed from: T */
    public final boolean m6453T(AnonymousClass3gm anonymousClass3gm) {
        if (anonymousClass3gm != m6412C(anonymousClass3gm.f43325F)) {
            return false;
        }
        m6423N(anonymousClass3gm.f43325F);
        return true;
    }
}
