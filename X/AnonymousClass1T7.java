package X;

import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1T7 */
public final class AnonymousClass1T7 implements AnonymousClass0Xe {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0XZ f18873B;
    /* renamed from: C */
    public final /* synthetic */ boolean f18874C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0U0 f18875D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0VH f18876E;
    /* renamed from: F */
    public final /* synthetic */ List f18877F;
    /* renamed from: G */
    public final /* synthetic */ AnonymousClass0Cm f18878G;

    public AnonymousClass1T7(List list, boolean z, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0VH anonymousClass0VH, AnonymousClass0XZ anonymousClass0XZ, AnonymousClass0U0 anonymousClass0U0) {
        this.f18877F = list;
        this.f18874C = z;
        this.f18878G = anonymousClass0Cm;
        this.f18876E = anonymousClass0VH;
        this.f18873B = anonymousClass0XZ;
        this.f18875D = anonymousClass0U0;
    }

    /* renamed from: A */
    public final void m11522A(AnonymousClass0Va anonymousClass0Va, List list) {
        if (!list.isEmpty()) {
            int size = list.size();
            if (size != this.f18877F.size()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Result count (");
                stringBuilder.append(size);
                stringBuilder.append(") does not match share target count (");
                stringBuilder.append(this.f18877F.size());
                stringBuilder.append(")");
                AnonymousClass0Gn.m1881H("DirectSendReshareMutationUtil", stringBuilder.toString());
            } else if (this.f18874C) {
                for (int i = 0; i < size; i++) {
                    AnonymousClass0VJ anonymousClass0VJ = (AnonymousClass0VJ) list.get(i);
                    AnonymousClass0Xb.m5256C(this.f18878G, ((DirectShareTarget) this.f18877F.get(i)).f5604E, this.f18876E.f5672D, this.f18876E.f5670B, anonymousClass0VJ.SN(), anonymousClass0VJ.uS(), anonymousClass0VJ.BT());
                }
            }
        }
        AnonymousClass0J7 anonymousClass0J7 = AnonymousClass0J7.f2895B;
        AnonymousClass0Cm anonymousClass0Cm = this.f18878G;
        List arrayList = new ArrayList(list.size());
        for (AnonymousClass0VJ uS : list) {
            arrayList.add(uS.uS());
        }
        anonymousClass0J7.mo540V(anonymousClass0Cm, arrayList, this.f18876E);
        AnonymousClass0V1.m4818G(this.f18873B.m5248B(), anonymousClass0Va, System.currentTimeMillis() - this.f18875D.f5323B);
        this.f18873B.m5249C(null);
    }

    public final void al(AnonymousClass0Va anonymousClass0Va, AnonymousClass0VN anonymousClass0VN) {
        AnonymousClass0V1.m4817F(this.f18873B.m5247A(), anonymousClass0Va, System.currentTimeMillis() - this.f18875D.f5323B);
        this.f18873B.m5249C(anonymousClass0VN);
    }
}
