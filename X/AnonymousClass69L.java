package X;

import java.util.Set;

/* renamed from: X.69L */
public final class AnonymousClass69L extends AnonymousClass1RG {
    /* renamed from: B */
    private AnonymousClass0Pm f72300B;

    /* renamed from: A */
    public final boolean m29223A(int i) {
        return false;
    }

    public AnonymousClass69L(AnonymousClass0Pm anonymousClass0Pm) {
        this.f72300B = anonymousClass0Pm;
    }

    /* renamed from: B */
    public final int m29224B() {
        return this.f72300B.F().size() + 1;
    }

    /* renamed from: C */
    public final AnonymousClass2EC m29225C(AnonymousClass0Cm anonymousClass0Cm) {
        boolean booleanValue;
        AnonymousClass5Y8 anonymousClass5Y8 = ((Boolean) AnonymousClass0E6.D(AnonymousClass0CC.nm, anonymousClass0Cm)).booleanValue() ? new AnonymousClass5Y8((String) AnonymousClass0E6.D(AnonymousClass0CC.km, anonymousClass0Cm)) : new AnonymousClass5Y7(false);
        synchronized (AnonymousClass4tf.class) {
            if (AnonymousClass4tf.f58274B == null) {
                AnonymousClass4tg[] anonymousClass4tgArr = new AnonymousClass4tg[2];
                anonymousClass4tgArr[0] = new AnonymousClass5Y9();
                boolean z = true;
                anonymousClass4tgArr[1] = anonymousClass5Y8;
                if (AnonymousClass4tf.m25307B("video/avc", new AnonymousClass5Y6(anonymousClass4tgArr)) == null) {
                    z = false;
                }
                AnonymousClass4tf.f58274B = Boolean.valueOf(z);
            }
            booleanValue = AnonymousClass4tf.f58274B.booleanValue();
        }
        return booleanValue ? AnonymousClass2EC.ELIGIBLE_GUEST : AnonymousClass2EC.INELIGIBILE_GUEST;
    }

    /* renamed from: D */
    public final AnonymousClass3oa m29226D() {
        return AnonymousClass3oa.VIEWER;
    }

    /* renamed from: E */
    public final void m29227E(Set set, AnonymousClass3oc anonymousClass3oc) {
        AnonymousClass0LH.H(false);
    }
}
