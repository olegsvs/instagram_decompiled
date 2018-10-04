package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4At */
public final class AnonymousClass4At extends AnonymousClass17n {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4Av f51155B;

    public AnonymousClass4At(AnonymousClass4Av anonymousClass4Av) {
        this.f51155B = anonymousClass4Av;
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void m23481B(Object obj) {
        this.f51155B.f51162C = (List) obj;
        AnonymousClass4Av anonymousClass4Av = this.f51155B;
        if (anonymousClass4Av.f51161B != null && anonymousClass4Av.f51162C != null) {
            AnonymousClass4Av.m23483B(anonymousClass4Av);
        }
    }

    /* renamed from: C */
    public final List m23482C() {
        if (this.f51155B.f51163D.getContext() != null) {
            return AnonymousClass1BX.C(this.f51155B.f51163D.getContext(), null, null);
        }
        return new ArrayList();
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return m23482C();
    }
}
