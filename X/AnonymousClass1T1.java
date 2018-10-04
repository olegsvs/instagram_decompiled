package X;

import android.content.Context;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.Collections;

/* renamed from: X.1T1 */
public final class AnonymousClass1T1 implements AnonymousClass0X4 {
    /* renamed from: B */
    private final int f18865B;
    /* renamed from: C */
    private final Context f18866C;
    /* renamed from: D */
    private final DirectShareTarget f18867D;
    /* renamed from: E */
    private final int f18868E;
    /* renamed from: F */
    private final String f18869F;
    /* renamed from: G */
    private final AnonymousClass0VK f18870G = new AnonymousClass0VK(Collections.singletonList(this.f18867D), false);
    /* renamed from: H */
    private final AnonymousClass0Cm f18871H;

    public AnonymousClass1T1(Context context, AnonymousClass0Cm anonymousClass0Cm, DirectShareTarget directShareTarget, String str, int i, int i2) {
        this.f18866C = context;
        this.f18871H = anonymousClass0Cm;
        this.f18867D = directShareTarget;
        this.f18869F = str;
        this.f18868E = i;
        this.f18865B = i2;
        m11516B();
    }

    /* renamed from: B */
    private void m11516B() {
        AnonymousClass0OA A = PendingMediaStore.m3537C().m3539A(this.f18869F);
        if (A != null) {
            A.QB = true;
            if (A.YC == 0) {
                A.m3600t(System.currentTimeMillis() - ((long) (((this.f18865B - this.f18868E) - 1) * JsonMappingException.MAX_REFS_TO_LIST)));
            }
        }
    }

    public final void BF(AnonymousClass0OA anonymousClass0OA) {
        anonymousClass0OA.m3556B(this.f18870G);
        AnonymousClass0GK.m1771E(this.f18866C, this.f18871H).m1793I(anonymousClass0OA, this.f18870G);
    }

    public final void JKA() {
        AnonymousClass0OA A = PendingMediaStore.m3537C().m3539A(this.f18869F);
        if (A == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Missing PendingMedia for key: ");
            stringBuilder.append(this.f18869F);
            AnonymousClass0Gn.m1881H("DirectVisualMessageTargetConfigureInstruction", stringBuilder.toString());
        }
        AnonymousClass0V1.m4835X(AnonymousClass4ZX.C(A), this.f18870G.f5694B);
    }

    public final String NP() {
        return this.f18869F;
    }
}
