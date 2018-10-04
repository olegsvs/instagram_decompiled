package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3x4 */
public final class AnonymousClass3x4 extends AnonymousClass0Rq implements AnonymousClass344 {
    /* renamed from: B */
    public List f47308B = new ArrayList();
    /* renamed from: C */
    public AnonymousClass353 f47309C;
    /* renamed from: D */
    private final AnonymousClass4E1 f47310D;
    /* renamed from: E */
    private final AnonymousClass1XD f47311E;

    public AnonymousClass3x4(Context context, AnonymousClass4E1 anonymousClass4E1) {
        this.f47311E = new AnonymousClass1XD(context, this);
        this.f47310D = anonymousClass4E1;
        D(new AnonymousClass0TB[]{this.f47311E});
    }

    /* renamed from: B */
    public static void m21674B(AnonymousClass3x4 anonymousClass3x4) {
        anonymousClass3x4.C();
        for (AnonymousClass353 anonymousClass353 : anonymousClass3x4.f47308B) {
            anonymousClass3x4.B(anonymousClass353, Boolean.valueOf(anonymousClass353.f37650B.equals(anonymousClass3x4.f47309C.f37650B)), anonymousClass3x4.f47311E);
        }
        anonymousClass3x4.E();
    }

    public final void Gt(AnonymousClass353 anonymousClass353) {
        AnonymousClass4E1 anonymousClass4E1 = this.f47310D;
        anonymousClass4E1.f51724D = anonymousClass353;
        anonymousClass353 = anonymousClass4E1.f51723C;
        anonymousClass353.f47309C = anonymousClass4E1.f51724D;
        AnonymousClass3x4.m21674B(anonymousClass353);
    }

    public final boolean isEmpty() {
        return this.f47308B.isEmpty();
    }
}
