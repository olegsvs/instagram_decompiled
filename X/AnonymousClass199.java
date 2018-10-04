package X;

import java.util.List;

/* renamed from: X.199 */
public final class AnonymousClass199 extends AnonymousClass0Pn {
    /* renamed from: D */
    public static long f15080D = -1;
    /* renamed from: B */
    public List f15081B;
    /* renamed from: C */
    public Long f15082C;

    /* renamed from: B */
    private static List m9649B(AnonymousClass1DV anonymousClass1DV) {
        return (anonymousClass1DV == null || anonymousClass1DV.f15704B == null || anonymousClass1DV.f15704B.f15705B == null || anonymousClass1DV.f15704B.f15705B.f15706B == null) ? null : anonymousClass1DV.f15704B.f15705B.f15706B;
    }

    /* renamed from: F */
    public final List m9650F(AnonymousClass0o2 anonymousClass0o2) {
        List<AnonymousClass1DS> list = this.f15081B;
        List list2 = null;
        if (list != null) {
            for (AnonymousClass1DS anonymousClass1DS : list) {
                if (anonymousClass0o2.m7674A().m7677A() == anonymousClass1DS.f15703C.intValue()) {
                    list2 = AnonymousClass199.m9649B(anonymousClass1DS.f15702B);
                    if (list2 != null) {
                        break;
                    }
                }
            }
        }
        return list2;
    }
}
