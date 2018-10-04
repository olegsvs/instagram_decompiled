package X;

import android.content.Context;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.1SK */
public final class AnonymousClass1SK implements AnonymousClass0X4 {
    /* renamed from: B */
    private final Context f18747B;
    /* renamed from: C */
    private final String f18748C;
    /* renamed from: D */
    private final AnonymousClass0VK f18749D;
    /* renamed from: E */
    private final AnonymousClass0Cm f18750E;

    public AnonymousClass1SK(Context context, AnonymousClass0Cm anonymousClass0Cm, Set set, String str) {
        this.f18747B = context;
        this.f18750E = anonymousClass0Cm;
        this.f18749D = new AnonymousClass0VK(new ArrayList(set), true);
        this.f18748C = str;
        m11479B();
    }

    /* renamed from: B */
    private void m11479B() {
        AnonymousClass0OA A = PendingMediaStore.m3537C().m3539A(this.f18748C);
        if (A != null) {
            A.QB = true;
            if (A.YC == 0) {
                A.m3600t(System.currentTimeMillis());
            }
        }
    }

    public final void BF(AnonymousClass0OA anonymousClass0OA) {
        anonymousClass0OA.m3556B(this.f18749D);
        AnonymousClass0GK.m1771E(this.f18747B, this.f18750E).m1793I(anonymousClass0OA, this.f18749D);
    }

    public final void JKA() {
        AnonymousClass0OA A = PendingMediaStore.m3537C().m3539A(this.f18748C);
        if (A == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Missing PendingMedia for key: ");
            stringBuilder.append(this.f18748C);
            AnonymousClass0Gn.m1881H("BlastListCandidatesTargetConfigureInstruction", stringBuilder.toString());
        }
        AnonymousClass0V1.m4835X(AnonymousClass4ZX.C(A), this.f18749D.f5694B);
    }

    public final String NP() {
        return this.f18748C;
    }
}
