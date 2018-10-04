package X;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.16x */
public final class AnonymousClass16x extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass16u f14622B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass16w f14623C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Cm f14624D;

    public AnonymousClass16x(AnonymousClass16u anonymousClass16u, AnonymousClass0Cm anonymousClass0Cm, Set set, AnonymousClass16w anonymousClass16w) {
        this.f14622B = anonymousClass16u;
        this.f14624D = anonymousClass0Cm;
        this.f14623C = anonymousClass16w;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.m5859I(this, -1160969600);
        this.f14623C.mo2162A(this.f14622B);
        AnonymousClass0cQ.m5858H(this, -1789052748, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.m5859I(this, -540700045);
        this.f14623C.m9450B(this.f14622B);
        AnonymousClass0cQ.m5858H(this, 582857610, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.m5859I(this, -1760021198);
        AnonymousClass3Uz anonymousClass3Uz = (AnonymousClass3Uz) obj;
        int I2 = AnonymousClass0cQ.m5859I(this, -1542920852);
        Map map = anonymousClass3Uz.f41705C;
        Map hashMap = new HashMap();
        for (String str : map.keySet()) {
            AnonymousClass0r7 anonymousClass0r7 = (AnonymousClass0r7) map.get(str);
            boolean z = anonymousClass0r7.m7942G().gT() == AnonymousClass0Zd.USER && AnonymousClass0LQ.m2954B(this.f14624D.m1037B(), anonymousClass0r7.m7942G().pT());
            hashMap.put(str, AnonymousClass0MB.m3078C(this.f14624D).m3091J(anonymousClass0r7, z));
        }
        this.f14623C.mo2163C(this.f14622B, hashMap);
        AnonymousClass0cQ.m5858H(this, 1004911413, I2);
        AnonymousClass0cQ.m5858H(this, 1375620545, I);
    }
}
